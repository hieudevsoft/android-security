package OoooOo0;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import androidx.fragment.app.o00O0O;
import hieubui.eup.android_app_security.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class o0000O0O {

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public static volatile o0000O0O f1594OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public static final Object f1595OooO0o0 = new Object();

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final Context f1598OooO0OO;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final HashSet f1597OooO0O0 = new HashSet();

    /* renamed from: OooO00o  reason: collision with root package name */
    public final HashMap f1596OooO00o = new HashMap();

    public o0000O0O(Context context) {
        this.f1598OooO0OO = context.getApplicationContext();
    }

    public static o0000O0O OooO0OO(Context context) {
        if (f1594OooO0Oo == null) {
            synchronized (f1595OooO0o0) {
                if (f1594OooO0Oo == null) {
                    f1594OooO0Oo = new o0000O0O(context);
                }
            }
        }
        return f1594OooO0Oo;
    }

    public final void OooO00o(Bundle bundle) {
        HashSet hashSet;
        String string = this.f1598OooO0OO.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f1597OooO0O0;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (o000OO.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    OooO0O0((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new o00O0O(e);
            }
        }
    }

    public final Object OooO0O0(Class cls, HashSet hashSet) {
        Object obj;
        if (OooO00o.o0000O0O()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (!hashSet.contains(cls)) {
            HashMap hashMap = this.f1596OooO00o;
            if (!hashMap.containsKey(cls)) {
                hashSet.add(cls);
                o000OO o000oo = (o000OO) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class> OooO00o2 = o000oo.OooO00o();
                if (!OooO00o2.isEmpty()) {
                    for (Class cls2 : OooO00o2) {
                        if (!hashMap.containsKey(cls2)) {
                            OooO0O0(cls2, hashSet);
                        }
                    }
                }
                obj = o000oo.OooO0O0(this.f1598OooO0OO);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } else {
                obj = hashMap.get(cls);
            }
            return obj;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
    }
}