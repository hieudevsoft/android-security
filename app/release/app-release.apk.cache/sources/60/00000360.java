package androidx.fragment.app;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import hieubui.eup.android_app_security.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class o0000oo {

    /* renamed from: OooO0O0  reason: collision with root package name */
    public boolean f2865OooO0O0;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public ArrayList f2867OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public ArrayList f2869OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public androidx.activity.o0Oo0oo f2870OooO0oO;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public final Map f2873OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public final o000000O f2874OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public final CopyOnWriteArrayList f2875OooOOO;
    public final o000000 OooOOO0;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public int f2876OooOOOO;

    /* renamed from: OooOOOo  reason: collision with root package name */
    public o00oO0o f2877OooOOOo;

    /* renamed from: OooOOo  reason: collision with root package name */
    public o00Oo0 f2878OooOOo;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public o0000O00.OooO00o f2879OooOOo0;

    /* renamed from: OooOOoo  reason: collision with root package name */
    public o00Oo0 f2880OooOOoo;

    /* renamed from: OooOo  reason: collision with root package name */
    public androidx.activity.result.OooO0o f2881OooOo;

    /* renamed from: OooOo0  reason: collision with root package name */
    public final o000000O f2882OooOo0;

    /* renamed from: OooOo00  reason: collision with root package name */
    public final o00000O0 f2883OooOo00;

    /* renamed from: OooOo0O  reason: collision with root package name */
    public androidx.activity.result.OooO0o f2884OooOo0O;

    /* renamed from: OooOo0o  reason: collision with root package name */
    public androidx.activity.result.OooO0o f2885OooOo0o;

    /* renamed from: OooOoO  reason: collision with root package name */
    public boolean f2886OooOoO;

    /* renamed from: OooOoO0  reason: collision with root package name */
    public ArrayDeque f2887OooOoO0;

    /* renamed from: OooOoOO  reason: collision with root package name */
    public boolean f2888OooOoOO;

    /* renamed from: OooOoo  reason: collision with root package name */
    public boolean f2889OooOoo;

    /* renamed from: OooOoo0  reason: collision with root package name */
    public boolean f2890OooOoo0;

    /* renamed from: OooOooO  reason: collision with root package name */
    public boolean f2891OooOooO;

    /* renamed from: OooOooo  reason: collision with root package name */
    public ArrayList f2892OooOooo;

    /* renamed from: Oooo0  reason: collision with root package name */
    public final o0OOO0o f2893Oooo0;

    /* renamed from: Oooo000  reason: collision with root package name */
    public ArrayList f2894Oooo000;

    /* renamed from: Oooo00O  reason: collision with root package name */
    public ArrayList f2895Oooo00O;

    /* renamed from: Oooo00o  reason: collision with root package name */
    public o0000O0O f2896Oooo00o;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final ArrayList f2864OooO00o = new ArrayList();

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final o000 f2866OooO0OO = new o000();

    /* renamed from: OooO0o  reason: collision with root package name */
    public final o000OOo f2868OooO0o = new o000OOo(this);

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final o00000 f2871OooO0oo = new o00000(this);

    /* renamed from: OooO  reason: collision with root package name */
    public final AtomicInteger f2863OooO = new AtomicInteger();

    /* renamed from: OooOO0  reason: collision with root package name */
    public final Map f2872OooOO0 = Collections.synchronizedMap(new HashMap());

    public o0000oo() {
        Collections.synchronizedMap(new HashMap());
        this.f2873OooOO0O = Collections.synchronizedMap(new HashMap());
        this.f2874OooOO0o = new o000000O(this, 2);
        this.OooOOO0 = new o000000(this);
        this.f2875OooOOO = new CopyOnWriteArrayList();
        this.f2876OooOOOO = -1;
        this.f2883OooOo00 = new o00000O0(this);
        this.f2882OooOo0 = new o000000O(this, 3);
        this.f2887OooOoO0 = new ArrayDeque();
        this.f2893Oooo0 = new o0OOO0o(3, this);
    }

    public static boolean OooOooo(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean Oooo000(o00Oo0 o00oo0) {
        o00oo0.getClass();
        Iterator it = o00oo0.f2970OooOo00.f2866OooO0OO.OooO0o0().iterator();
        boolean z = false;
        while (it.hasNext()) {
            o00Oo0 o00oo02 = (o00Oo0) it.next();
            if (o00oo02 != null) {
                z = Oooo000(o00oo02);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static boolean Oooo00O(o00Oo0 o00oo0) {
        if (o00oo0 == null || (o00oo0.f2977OooOoo0 && (o00oo0.f2965OooOOo == null || Oooo00O(o00oo0.f2969OooOo0)))) {
            return true;
        }
        return false;
    }

    public static boolean Oooo00o(o00Oo0 o00oo0) {
        if (o00oo0 != null) {
            o0000oo o0000ooVar = o00oo0.f2965OooOOo;
            if (!o00oo0.equals(o0000ooVar.f2880OooOOoo) || !Oooo00o(o0000ooVar.f2878OooOOo)) {
                return false;
            }
        }
        return true;
    }

    public final boolean OooO() {
        boolean z;
        if (this.f2876OooOOOO < 1) {
            return false;
        }
        for (o00Oo0 o00oo0 : this.f2866OooO0OO.OooO0o()) {
            if (o00oo0 != null) {
                if (!o00oo0.f2974OooOoO0) {
                    z = o00oo0.f2970OooOo00.OooO();
                } else {
                    z = false;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final o0000OO0 OooO00o(o00Oo0 o00oo0) {
        if (OooOooo(2)) {
            Objects.toString(o00oo0);
        }
        o0000OO0 OooO0o2 = OooO0o(o00oo0);
        o00oo0.f2965OooOOo = this;
        o000 o000Var = this.f2866OooO0OO;
        o000Var.OooO0oO(OooO0o2);
        if (!o00oo0.f2973OooOoO) {
            o000Var.OooO00o(o00oo0);
            o00oo0.f2961OooOO0o = false;
            if (o00oo0.f2979OooOooo == null) {
                o00oo0.f2981Oooo0 = false;
            }
            if (Oooo000(o00oo0)) {
                this.f2886OooOoO = true;
            }
        }
        return OooO0o2;
    }

    public final void OooO0O0(o00oO0o o00oo0o, o0000O00.OooO00o oooO00o, o00Oo0 o00oo0) {
        o0000O0O o0000o0o2;
        boolean z;
        String str;
        o00Oo0 o00oo02;
        if (this.f2877OooOOOo == null) {
            this.f2877OooOOOo = o00oo0o;
            this.f2879OooOOo0 = oooO00o;
            this.f2878OooOOo = o00oo0;
            CopyOnWriteArrayList copyOnWriteArrayList = this.f2875OooOOO;
            if (o00oo0 != null) {
                copyOnWriteArrayList.add(new o00000O(o00oo0));
            } else if (o00oo0o instanceof o000OO) {
                copyOnWriteArrayList.add(o00oo0o);
            }
            if (this.f2878OooOOo != null) {
                OoooOo0();
            }
            if (o00oo0o instanceof androidx.activity.o0OO00O) {
                androidx.activity.o0Oo0oo o00O0O0o = o00oo0o.o00O0O0o();
                this.f2870OooO0oO = o00O0O0o;
                if (o00oo0 != null) {
                    o00oo02 = o00oo0;
                } else {
                    o00oo02 = o00oo0o;
                }
                o00O0O0o.OooO00o(o00oo02, this.f2871OooO0oo);
            }
            if (o00oo0 != null) {
                o0000O0O o0000o0o3 = o00oo0.f2965OooOOo.f2896Oooo00o;
                HashMap hashMap = o0000o0o3.f2851OooO0Oo;
                o0000O0O o0000o0o4 = (o0000O0O) hashMap.get(o00oo0.f2956OooO0o0);
                if (o0000o0o4 == null) {
                    o0000o0o4 = new o0000O0O(o0000o0o3.f2852OooO0o);
                    hashMap.put(o00oo0.f2956OooO0o0, o0000o0o4);
                }
                this.f2896Oooo00o = o0000o0o4;
            } else {
                if (o00oo0o instanceof androidx.lifecycle.o0000O) {
                    o0000o0o2 = (o0000O0O) new androidx.activity.result.OooO0o(o00oo0o.OooO0OO(), o0000O0O.f2849OooO, 0).OooO0oO(o0000O0O.class);
                } else {
                    o0000o0o2 = new o0000O0O(false);
                }
                this.f2896Oooo00o = o0000o0o2;
            }
            o0000O0O o0000o0o5 = this.f2896Oooo00o;
            if (!this.f2888OooOoOO && !this.f2890OooOoo0) {
                z = false;
            } else {
                z = true;
            }
            o0000o0o5.f2855OooO0oo = z;
            this.f2866OooO0OO.f2814OooO0OO = o0000o0o5;
            o00oO0o o00oo0o2 = this.f2877OooOOOo;
            if (o00oo0o2 instanceof androidx.activity.result.OooOO0) {
                androidx.activity.OooOOO0 oooOOO0 = o00oo0o2.f2996OoooOOo.f1945OooOO0;
                if (o00oo0 != null) {
                    str = o00oo0.f2956OooO0o0 + ":";
                } else {
                    str = "";
                }
                String str2 = "FragmentManager:" + str;
                this.f2884OooOo0O = oooOOO0.OooO0O0(OooO0O0.OooO00o.OooO0OO(str2, "StartActivityForResult"), new OooO0O0.OooO0o(), new o000000O(this, 4));
                this.f2885OooOo0o = oooOOO0.OooO0O0(OooO0O0.OooO00o.OooO0OO(str2, "StartIntentSenderForResult"), new o00000OO(), new o000000O(this, 0));
                this.f2881OooOo = oooOOO0.OooO0O0(OooO0O0.OooO00o.OooO0OO(str2, "RequestPermissions"), new OooO0O0.OooO0OO(), new o000000O(this, 1));
                return;
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    public final void OooO0OO(o00Oo0 o00oo0) {
        if (OooOooo(2)) {
            Objects.toString(o00oo0);
        }
        if (o00oo0.f2973OooOoO) {
            o00oo0.f2973OooOoO = false;
            if (!o00oo0.f2960OooOO0O) {
                this.f2866OooO0OO.OooO00o(o00oo0);
                if (OooOooo(2)) {
                    o00oo0.toString();
                }
                if (Oooo000(o00oo0)) {
                    this.f2886OooOoO = true;
                }
            }
        }
    }

    public final void OooO0Oo() {
        this.f2865OooO0O0 = false;
        this.f2894Oooo000.clear();
        this.f2892OooOooo.clear();
    }

    public final o0000OO0 OooO0o(o00Oo0 o00oo0) {
        String str = o00oo0.f2956OooO0o0;
        o000 o000Var = this.f2866OooO0OO;
        o0000OO0 o0000oo02 = (o0000OO0) o000Var.f2813OooO0O0.get(str);
        if (o0000oo02 == null) {
            o0000OO0 o0000oo03 = new o0000OO0(this.OooOOO0, o000Var, o00oo0);
            o0000oo03.OooOOO0(this.f2877OooOOOo.f2994OoooOO0.getClassLoader());
            o0000oo03.f2860OooO0o0 = this.f2876OooOOOO;
            return o0000oo03;
        }
        return o0000oo02;
    }

    public final HashSet OooO0o0() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f2866OooO0OO.OooO0Oo().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((o0000OO0) it.next()).f2858OooO0OO.f2978OooOooO;
            if (viewGroup != null) {
                hashSet.add(o00O000.OooO0o(viewGroup, OooOooO()));
            }
        }
        return hashSet;
    }

    public final void OooO0oO(o00Oo0 o00oo0) {
        if (OooOooo(2)) {
            Objects.toString(o00oo0);
        }
        if (!o00oo0.f2973OooOoO) {
            o00oo0.f2973OooOoO = true;
            if (o00oo0.f2960OooOO0O) {
                if (OooOooo(2)) {
                    o00oo0.toString();
                }
                o000 o000Var = this.f2866OooO0OO;
                synchronized (o000Var.f2812OooO00o) {
                    o000Var.f2812OooO00o.remove(o00oo0);
                }
                o00oo0.f2960OooOO0O = false;
                if (Oooo000(o00oo0)) {
                    this.f2886OooOoO = true;
                }
                o000oOoO(o00oo0);
            }
        }
    }

    public final void OooO0oo(Configuration configuration) {
        for (o00Oo0 o00oo0 : this.f2866OooO0OO.OooO0o()) {
            if (o00oo0 != null) {
                o00oo0.onConfigurationChanged(configuration);
                o00oo0.f2970OooOo00.OooO0oo(configuration);
            }
        }
    }

    public final boolean OooOO0() {
        boolean z;
        if (this.f2876OooOOOO < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (o00Oo0 o00oo0 : this.f2866OooO0OO.OooO0o()) {
            if (o00oo0 != null && Oooo00O(o00oo0)) {
                if (!o00oo0.f2974OooOoO0) {
                    z = o00oo0.f2970OooOo00.OooOO0() | false;
                } else {
                    z = false;
                }
                if (z) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(o00oo0);
                    z2 = true;
                }
            }
        }
        if (this.f2869OooO0o0 != null) {
            for (int i = 0; i < this.f2869OooO0o0.size(); i++) {
                o00Oo0 o00oo02 = (o00Oo0) this.f2869OooO0o0.get(i);
                if (arrayList == null || !arrayList.contains(o00oo02)) {
                    o00oo02.getClass();
                }
            }
        }
        this.f2869OooO0o0 = arrayList;
        return z2;
    }

    public final void OooOO0O() {
        Integer num;
        Integer num2;
        Integer num3;
        this.f2889OooOoo = true;
        OooOo(true);
        Iterator it = OooO0o0().iterator();
        while (it.hasNext()) {
            ((o00O000) it.next()).OooO0o0();
        }
        OooOOoo(-1);
        this.f2877OooOOOo = null;
        this.f2879OooOOo0 = null;
        this.f2878OooOOo = null;
        if (this.f2870OooO0oO != null) {
            Iterator it2 = this.f2871OooO0oo.f2816OooO0O0.iterator();
            while (it2.hasNext()) {
                ((androidx.activity.OooO0OO) it2.next()).cancel();
            }
            this.f2870OooO0oO = null;
        }
        androidx.activity.result.OooO0o oooO0o = this.f2884OooOo0O;
        if (oooO0o != null) {
            androidx.activity.OooOOO0 oooOOO0 = (androidx.activity.OooOOO0) oooO0o.f1984OooO0Oo;
            String str = (String) oooO0o.f1982OooO0O0;
            if (!oooOOO0.f1925OooO0Oo.contains(str) && (num3 = (Integer) oooOOO0.f1923OooO0O0.remove(str)) != null) {
                oooOOO0.f1922OooO00o.remove(num3);
            }
            oooOOO0.f1927OooO0o0.remove(str);
            HashMap hashMap = oooOOO0.f1926OooO0o;
            if (hashMap.containsKey(str)) {
                Objects.toString(hashMap.get(str));
                hashMap.remove(str);
            }
            Bundle bundle = oooOOO0.f1928OooO0oO;
            if (bundle.containsKey(str)) {
                Objects.toString(bundle.getParcelable(str));
                bundle.remove(str);
            }
            OooO0O0.OooO00o.OooO0oO(oooOOO0.f1924OooO0OO.get(str));
            androidx.activity.result.OooO0o oooO0o2 = this.f2885OooOo0o;
            androidx.activity.OooOOO0 oooOOO02 = (androidx.activity.OooOOO0) oooO0o2.f1984OooO0Oo;
            String str2 = (String) oooO0o2.f1982OooO0O0;
            if (!oooOOO02.f1925OooO0Oo.contains(str2) && (num2 = (Integer) oooOOO02.f1923OooO0O0.remove(str2)) != null) {
                oooOOO02.f1922OooO00o.remove(num2);
            }
            oooOOO02.f1927OooO0o0.remove(str2);
            HashMap hashMap2 = oooOOO02.f1926OooO0o;
            if (hashMap2.containsKey(str2)) {
                Objects.toString(hashMap2.get(str2));
                hashMap2.remove(str2);
            }
            Bundle bundle2 = oooOOO02.f1928OooO0oO;
            if (bundle2.containsKey(str2)) {
                Objects.toString(bundle2.getParcelable(str2));
                bundle2.remove(str2);
            }
            OooO0O0.OooO00o.OooO0oO(oooOOO02.f1924OooO0OO.get(str2));
            androidx.activity.result.OooO0o oooO0o3 = this.f2881OooOo;
            androidx.activity.OooOOO0 oooOOO03 = (androidx.activity.OooOOO0) oooO0o3.f1984OooO0Oo;
            String str3 = (String) oooO0o3.f1982OooO0O0;
            if (!oooOOO03.f1925OooO0Oo.contains(str3) && (num = (Integer) oooOOO03.f1923OooO0O0.remove(str3)) != null) {
                oooOOO03.f1922OooO00o.remove(num);
            }
            oooOOO03.f1927OooO0o0.remove(str3);
            HashMap hashMap3 = oooOOO03.f1926OooO0o;
            if (hashMap3.containsKey(str3)) {
                Objects.toString(hashMap3.get(str3));
                hashMap3.remove(str3);
            }
            Bundle bundle3 = oooOOO03.f1928OooO0oO;
            if (bundle3.containsKey(str3)) {
                Objects.toString(bundle3.getParcelable(str3));
                bundle3.remove(str3);
            }
            OooO0O0.OooO00o.OooO0oO(oooOOO03.f1924OooO0OO.get(str3));
        }
    }

    public final void OooOO0o() {
        for (o00Oo0 o00oo0 : this.f2866OooO0OO.OooO0o()) {
            if (o00oo0 != null) {
                o00oo0.onLowMemory();
                o00oo0.f2970OooOo00.OooOO0o();
            }
        }
    }

    public final boolean OooOOO() {
        boolean z;
        if (this.f2876OooOOOO < 1) {
            return false;
        }
        for (o00Oo0 o00oo0 : this.f2866OooO0OO.OooO0o()) {
            if (o00oo0 != null) {
                if (!o00oo0.f2974OooOoO0) {
                    z = o00oo0.f2970OooOo00.OooOOO();
                } else {
                    z = false;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void OooOOO0(boolean z) {
        for (o00Oo0 o00oo0 : this.f2866OooO0OO.OooO0o()) {
            if (o00oo0 != null) {
                o00oo0.f2970OooOo00.OooOOO0(z);
            }
        }
    }

    public final void OooOOOO() {
        if (this.f2876OooOOOO >= 1) {
            for (o00Oo0 o00oo0 : this.f2866OooO0OO.OooO0o()) {
                if (o00oo0 != null && !o00oo0.f2974OooOoO0) {
                    o00oo0.f2970OooOo00.OooOOOO();
                }
            }
        }
    }

    public final void OooOOOo(o00Oo0 o00oo0) {
        if (o00oo0 != null && o00oo0.equals(OooOoO(o00oo0.f2956OooO0o0))) {
            o00oo0.f2965OooOOo.getClass();
            boolean Oooo00o2 = Oooo00o(o00oo0);
            Boolean bool = o00oo0.f2959OooOO0;
            if (bool == null || bool.booleanValue() != Oooo00o2) {
                o00oo0.f2959OooOO0 = Boolean.valueOf(Oooo00o2);
                o0000oo o0000ooVar = o00oo0.f2970OooOo00;
                o0000ooVar.OoooOo0();
                o0000ooVar.OooOOOo(o0000ooVar.f2880OooOOoo);
            }
        }
    }

    public final boolean OooOOo() {
        boolean z;
        if (this.f2876OooOOOO < 1) {
            return false;
        }
        boolean z2 = false;
        for (o00Oo0 o00oo0 : this.f2866OooO0OO.OooO0o()) {
            if (o00oo0 != null && Oooo00O(o00oo0)) {
                if (!o00oo0.f2974OooOoO0) {
                    z = o00oo0.f2970OooOo00.OooOOo() | false;
                } else {
                    z = false;
                }
                if (z) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final void OooOOo0(boolean z) {
        for (o00Oo0 o00oo0 : this.f2866OooO0OO.OooO0o()) {
            if (o00oo0 != null) {
                o00oo0.f2970OooOo00.OooOOo0(z);
            }
        }
    }

    public final void OooOOoo(int i) {
        try {
            this.f2865OooO0O0 = true;
            for (o0000OO0 o0000oo02 : this.f2866OooO0OO.f2813OooO0O0.values()) {
                if (o0000oo02 != null) {
                    o0000oo02.f2860OooO0o0 = i;
                }
            }
            Oooo0O0(i, false);
            Iterator it = OooO0o0().iterator();
            while (it.hasNext()) {
                ((o00O000) it.next()).OooO0o0();
            }
            this.f2865OooO0O0 = false;
            OooOo(true);
        } catch (Throwable th) {
            this.f2865OooO0O0 = false;
            throw th;
        }
    }

    public final boolean OooOo(boolean z) {
        boolean z2;
        OooOo0o(z);
        boolean z3 = false;
        while (true) {
            ArrayList arrayList = this.f2892OooOooo;
            ArrayList arrayList2 = this.f2894Oooo000;
            synchronized (this.f2864OooO00o) {
                if (this.f2864OooO00o.isEmpty()) {
                    z2 = false;
                } else {
                    int size = this.f2864OooO00o.size();
                    z2 = false;
                    for (int i = 0; i < size; i++) {
                        z2 |= ((o0000) this.f2864OooO00o.get(i)).OooO00o(arrayList, arrayList2);
                    }
                    this.f2864OooO00o.clear();
                    this.f2877OooOOOo.f2997o000oOoO.removeCallbacks(this.f2893Oooo0);
                }
            }
            if (z2) {
                z3 = true;
                this.f2865OooO0O0 = true;
                try {
                    Oooo0oo(this.f2892OooOooo, this.f2894Oooo000);
                } finally {
                    OooO0Oo();
                }
            } else {
                OoooOo0();
                OooOo00();
                this.f2866OooO0OO.f2813OooO0O0.values().removeAll(Collections.singleton(null));
                return z3;
            }
        }
    }

    public final void OooOo0(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String OooO0OO2 = OooO0O0.OooO00o.OooO0OO(str, "    ");
        o000 o000Var = this.f2866OooO0OO;
        o000Var.getClass();
        String str2 = str + "    ";
        HashMap hashMap = o000Var.f2813OooO0O0;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (o0000OO0 o0000oo02 : hashMap.values()) {
                printWriter.print(str);
                if (o0000oo02 != null) {
                    o00Oo0 o00oo0 = o0000oo02.f2858OooO0OO;
                    printWriter.println(o00oo0);
                    o00oo0.OooO0o0(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = o000Var.f2812OooO00o;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(((o00Oo0) arrayList.get(i)).toString());
            }
        }
        ArrayList arrayList2 = this.f2869OooO0o0;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(((o00Oo0) this.f2869OooO0o0.get(i2)).toString());
            }
        }
        ArrayList arrayList3 = this.f2867OooO0Oo;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                OooO00o oooO00o = (OooO00o) this.f2867OooO0Oo.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(oooO00o.toString());
                oooO00o.OooO0o0(OooO0OO2, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f2863OooO.get());
        synchronized (this.f2864OooO00o) {
            int size4 = this.f2864OooO00o.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size4; i4++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println((o0000) this.f2864OooO00o.get(i4));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f2877OooOOOo);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f2879OooOOo0);
        if (this.f2878OooOOo != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f2878OooOOo);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f2876OooOOOO);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f2888OooOoOO);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2890OooOoo0);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f2889OooOoo);
        if (this.f2886OooOoO) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f2886OooOoO);
        }
    }

    public final void OooOo00() {
        if (this.f2891OooOooO) {
            this.f2891OooOooO = false;
            OoooOOO();
        }
    }

    public final void OooOo0O(o0000 o0000Var, boolean z) {
        boolean z2;
        if (!z) {
            if (this.f2877OooOOOo == null) {
                if (this.f2889OooOoo) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            if (!this.f2888OooOoOO && !this.f2890OooOoo0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f2864OooO00o) {
            if (this.f2877OooOOOo == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.f2864OooO00o.add(o0000Var);
                OoooO0();
            }
        }
    }

    public final void OooOo0o(boolean z) {
        boolean z2;
        if (!this.f2865OooO0O0) {
            if (this.f2877OooOOOo == null) {
                if (this.f2889OooOoo) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (Looper.myLooper() == this.f2877OooOOOo.f2997o000oOoO.getLooper()) {
                if (!z) {
                    if (!this.f2888OooOoOO && !this.f2890OooOoo0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                    }
                }
                if (this.f2892OooOooo == null) {
                    this.f2892OooOooo = new ArrayList();
                    this.f2894Oooo000 = new ArrayList();
                }
                this.f2865OooO0O0 = false;
                return;
            } else {
                throw new IllegalStateException("Must be called from main thread of fragment host");
            }
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    public final o00Oo0 OooOoO(String str) {
        return this.f2866OooO0OO.OooO0O0(str);
    }

    public final void OooOoO0(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        ViewGroup viewGroup;
        o000 o000Var;
        o000 o000Var2;
        o000 o000Var3;
        int i3;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        boolean z = ((OooO00o) arrayList3.get(i)).f2753OooOOOO;
        ArrayList arrayList5 = this.f2895Oooo00O;
        if (arrayList5 == null) {
            this.f2895Oooo00O = new ArrayList();
        } else {
            arrayList5.clear();
        }
        ArrayList arrayList6 = this.f2895Oooo00O;
        o000 o000Var4 = this.f2866OooO0OO;
        arrayList6.addAll(o000Var4.OooO0o());
        o00Oo0 o00oo0 = this.f2880OooOOoo;
        int i4 = i;
        boolean z2 = false;
        while (true) {
            int i5 = 1;
            if (i4 < i2) {
                OooO00o oooO00o = (OooO00o) arrayList3.get(i4);
                if (!((Boolean) arrayList4.get(i4)).booleanValue()) {
                    ArrayList arrayList7 = this.f2895Oooo00O;
                    int i6 = 0;
                    while (true) {
                        ArrayList arrayList8 = oooO00o.f2741OooO00o;
                        if (i6 < arrayList8.size()) {
                            o000O000 o000o000 = (o000O000) arrayList8.get(i6);
                            int i7 = o000o000.f2906OooO00o;
                            if (i7 != i5) {
                                if (i7 != 2) {
                                    if (i7 != 3 && i7 != 6) {
                                        if (i7 != 7) {
                                            if (i7 == 8) {
                                                arrayList8.add(i6, new o000O000(9, o00oo0));
                                                i6++;
                                                o00oo0 = o000o000.f2907OooO0O0;
                                            }
                                        } else {
                                            o000Var3 = o000Var4;
                                            i3 = 1;
                                        }
                                    } else {
                                        arrayList7.remove(o000o000.f2907OooO0O0);
                                        o00Oo0 o00oo02 = o000o000.f2907OooO0O0;
                                        if (o00oo02 == o00oo0) {
                                            arrayList8.add(i6, new o000O000(9, o00oo02));
                                            i6++;
                                            o000Var3 = o000Var4;
                                            i3 = 1;
                                            o00oo0 = null;
                                        }
                                    }
                                    o000Var3 = o000Var4;
                                    i3 = 1;
                                } else {
                                    o00Oo0 o00oo03 = o000o000.f2907OooO0O0;
                                    int i8 = o00oo03.f2972OooOo0o;
                                    int size = arrayList7.size() - 1;
                                    boolean z3 = false;
                                    while (size >= 0) {
                                        o000 o000Var5 = o000Var4;
                                        o00Oo0 o00oo04 = (o00Oo0) arrayList7.get(size);
                                        if (o00oo04.f2972OooOo0o == i8) {
                                            if (o00oo04 == o00oo03) {
                                                z3 = true;
                                            } else {
                                                if (o00oo04 == o00oo0) {
                                                    arrayList8.add(i6, new o000O000(9, o00oo04));
                                                    i6++;
                                                    o00oo0 = null;
                                                }
                                                o000O000 o000o0002 = new o000O000(3, o00oo04);
                                                o000o0002.f2908OooO0OO = o000o000.f2908OooO0OO;
                                                o000o0002.f2911OooO0o0 = o000o000.f2911OooO0o0;
                                                o000o0002.f2909OooO0Oo = o000o000.f2909OooO0Oo;
                                                o000o0002.f2910OooO0o = o000o000.f2910OooO0o;
                                                arrayList8.add(i6, o000o0002);
                                                arrayList7.remove(o00oo04);
                                                i6++;
                                                o00oo0 = o00oo0;
                                            }
                                        }
                                        size--;
                                        o000Var4 = o000Var5;
                                    }
                                    o000Var3 = o000Var4;
                                    i3 = 1;
                                    if (z3) {
                                        arrayList8.remove(i6);
                                        i6--;
                                    } else {
                                        o000o000.f2906OooO00o = 1;
                                        arrayList7.add(o00oo03);
                                    }
                                }
                                i6 += i3;
                                i5 = i3;
                                o000Var4 = o000Var3;
                            } else {
                                o000Var3 = o000Var4;
                                i3 = i5;
                            }
                            arrayList7.add(o000o000.f2907OooO0O0);
                            i6 += i3;
                            i5 = i3;
                            o000Var4 = o000Var3;
                        } else {
                            o000Var2 = o000Var4;
                        }
                    }
                } else {
                    o000Var2 = o000Var4;
                    int i9 = 1;
                    ArrayList arrayList9 = this.f2895Oooo00O;
                    ArrayList arrayList10 = oooO00o.f2741OooO00o;
                    int size2 = arrayList10.size() - 1;
                    while (size2 >= 0) {
                        o000O000 o000o0003 = (o000O000) arrayList10.get(size2);
                        int i10 = o000o0003.f2906OooO00o;
                        if (i10 != i9) {
                            if (i10 != 3) {
                                switch (i10) {
                                    case 8:
                                        o00oo0 = null;
                                        break;
                                    case 9:
                                        o00oo0 = o000o0003.f2907OooO0O0;
                                        break;
                                    case 10:
                                        o000o0003.f2913OooO0oo = o000o0003.f2912OooO0oO;
                                        break;
                                }
                                size2--;
                                i9 = 1;
                            }
                            arrayList9.add(o000o0003.f2907OooO0O0);
                            size2--;
                            i9 = 1;
                        }
                        arrayList9.remove(o000o0003.f2907OooO0O0);
                        size2--;
                        i9 = 1;
                    }
                }
                if (!z2 && !oooO00o.f2747OooO0oO) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                i4++;
                arrayList3 = arrayList;
                arrayList4 = arrayList2;
                o000Var4 = o000Var2;
            } else {
                o000 o000Var6 = o000Var4;
                this.f2895Oooo00O.clear();
                if (!z && this.f2876OooOOOO >= 1) {
                    for (int i11 = i; i11 < i2; i11++) {
                        Iterator it = ((OooO00o) arrayList.get(i11)).f2741OooO00o.iterator();
                        while (it.hasNext()) {
                            o00Oo0 o00oo05 = ((o000O000) it.next()).f2907OooO0O0;
                            if (o00oo05 != null && o00oo05.f2965OooOOo != null) {
                                o000Var = o000Var6;
                                o000Var.OooO0oO(OooO0o(o00oo05));
                            } else {
                                o000Var = o000Var6;
                            }
                            o000Var6 = o000Var;
                        }
                    }
                }
                for (int i12 = i; i12 < i2; i12++) {
                    OooO00o oooO00o2 = (OooO00o) arrayList.get(i12);
                    if (((Boolean) arrayList2.get(i12)).booleanValue()) {
                        oooO00o2.OooO0OO(-1);
                        oooO00o2.OooO0oO();
                    } else {
                        oooO00o2.OooO0OO(1);
                        oooO00o2.OooO0o();
                    }
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                for (int i13 = i; i13 < i2; i13++) {
                    OooO00o oooO00o3 = (OooO00o) arrayList.get(i13);
                    if (booleanValue) {
                        for (int size3 = oooO00o3.f2741OooO00o.size() - 1; size3 >= 0; size3--) {
                            o00Oo0 o00oo06 = ((o000O000) oooO00o3.f2741OooO00o.get(size3)).f2907OooO0O0;
                            if (o00oo06 != null) {
                                OooO0o(o00oo06).OooOO0O();
                            }
                        }
                    } else {
                        Iterator it2 = oooO00o3.f2741OooO00o.iterator();
                        while (it2.hasNext()) {
                            o00Oo0 o00oo07 = ((o000O000) it2.next()).f2907OooO0O0;
                            if (o00oo07 != null) {
                                OooO0o(o00oo07).OooOO0O();
                            }
                        }
                    }
                }
                Oooo0O0(this.f2876OooOOOO, true);
                HashSet hashSet = new HashSet();
                for (int i14 = i; i14 < i2; i14++) {
                    Iterator it3 = ((OooO00o) arrayList.get(i14)).f2741OooO00o.iterator();
                    while (it3.hasNext()) {
                        o00Oo0 o00oo08 = ((o000O000) it3.next()).f2907OooO0O0;
                        if (o00oo08 != null && (viewGroup = o00oo08.f2978OooOooO) != null) {
                            hashSet.add(o00O000.OooO0o(viewGroup, OooOooO()));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    o00O000 o00o000 = (o00O000) it4.next();
                    o00o000.f2939OooO0Oo = booleanValue;
                    o00o000.OooO0oO();
                    o00o000.OooO0OO();
                }
                for (int i15 = i; i15 < i2; i15++) {
                    OooO00o oooO00o4 = (OooO00o) arrayList.get(i15);
                    if (((Boolean) arrayList2.get(i15)).booleanValue() && oooO00o4.f2755OooOOo >= 0) {
                        oooO00o4.f2755OooOOo = -1;
                    }
                    oooO00o4.getClass();
                }
                return;
            }
        }
    }

    public final o00Oo0 OooOoOO(int i) {
        o000 o000Var = this.f2866OooO0OO;
        ArrayList arrayList = o000Var.f2812OooO00o;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                o00Oo0 o00oo0 = (o00Oo0) arrayList.get(size);
                if (o00oo0 != null && o00oo0.f2971OooOo0O == i) {
                    return o00oo0;
                }
            } else {
                for (o0000OO0 o0000oo02 : o000Var.f2813OooO0O0.values()) {
                    if (o0000oo02 != null) {
                        o00Oo0 o00oo02 = o0000oo02.f2858OooO0OO;
                        if (o00oo02.f2971OooOo0O == i) {
                            return o00oo02;
                        }
                    }
                }
                return null;
            }
        }
    }

    public final o00000O0 OooOoo() {
        o00Oo0 o00oo0 = this.f2878OooOOo;
        if (o00oo0 != null) {
            return o00oo0.f2965OooOOo.OooOoo();
        }
        return this.f2883OooOo00;
    }

    public final ViewGroup OooOoo0(o00Oo0 o00oo0) {
        ViewGroup viewGroup = o00oo0.f2978OooOooO;
        if (viewGroup == null) {
            if (o00oo0.f2972OooOo0o > 0 && this.f2879OooOOo0.o000O0o()) {
                View o000OoO2 = this.f2879OooOOo0.o000OoO(o00oo0.f2972OooOo0o);
                if (o000OoO2 instanceof ViewGroup) {
                    return (ViewGroup) o000OoO2;
                }
            }
            return null;
        }
        return viewGroup;
    }

    public final o000000O OooOooO() {
        o00Oo0 o00oo0 = this.f2878OooOOo;
        if (o00oo0 != null) {
            return o00oo0.f2965OooOOo.OooOooO();
        }
        return this.f2882OooOo0;
    }

    public final void Oooo(Parcelable parcelable) {
        o000000 o000000Var;
        int i;
        o00Oo0 o00oo0;
        o0000OO0 o0000oo02;
        if (parcelable != null) {
            o0000O0 o0000o02 = (o0000O0) parcelable;
            if (o0000o02.f2838OooO00o != null) {
                o000 o000Var = this.f2866OooO0OO;
                o000Var.f2813OooO0O0.clear();
                Iterator it = o0000o02.f2838OooO00o.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    o000000Var = this.OooOOO0;
                    if (!hasNext) {
                        break;
                    }
                    o0000O o0000o2 = (o0000O) it.next();
                    if (o0000o2 != null) {
                        o00Oo0 o00oo02 = (o00Oo0) this.f2896Oooo00o.f2850OooO0OO.get(o0000o2.f2828OooO0O0);
                        if (o00oo02 != null) {
                            if (OooOooo(2)) {
                                o00oo02.toString();
                            }
                            o0000oo02 = new o0000OO0(o000000Var, o000Var, o00oo02, o0000o2);
                        } else {
                            o0000oo02 = new o0000OO0(this.OooOOO0, this.f2866OooO0OO, this.f2877OooOOOo.f2994OoooOO0.getClassLoader(), OooOoo(), o0000o2);
                        }
                        o00Oo0 o00oo03 = o0000oo02.f2858OooO0OO;
                        o00oo03.f2965OooOOo = this;
                        if (OooOooo(2)) {
                            o00oo03.toString();
                        }
                        o0000oo02.OooOOO0(this.f2877OooOOOo.f2994OoooOO0.getClassLoader());
                        o000Var.OooO0oO(o0000oo02);
                        o0000oo02.f2860OooO0o0 = this.f2876OooOOOO;
                    }
                }
                o0000O0O o0000o0o2 = this.f2896Oooo00o;
                o0000o0o2.getClass();
                Iterator it2 = new ArrayList(o0000o0o2.f2850OooO0OO.values()).iterator();
                while (true) {
                    i = 0;
                    if (!it2.hasNext()) {
                        break;
                    }
                    o00Oo0 o00oo04 = (o00Oo0) it2.next();
                    if (o000Var.f2813OooO0O0.get(o00oo04.f2956OooO0o0) != null) {
                        i = 1;
                    }
                    if (i == 0) {
                        if (OooOooo(2)) {
                            o00oo04.toString();
                            Objects.toString(o0000o02.f2838OooO00o);
                        }
                        this.f2896Oooo00o.OooO0O0(o00oo04);
                        o00oo04.f2965OooOOo = this;
                        o0000OO0 o0000oo03 = new o0000OO0(o000000Var, o000Var, o00oo04);
                        o0000oo03.f2860OooO0o0 = 1;
                        o0000oo03.OooOO0O();
                        o00oo04.f2961OooOO0o = true;
                        o0000oo03.OooOO0O();
                    }
                }
                ArrayList<String> arrayList = o0000o02.f2839OooO0O0;
                o000Var.f2812OooO00o.clear();
                if (arrayList != null) {
                    for (String str : arrayList) {
                        o00Oo0 OooO0O02 = o000Var.OooO0O0(str);
                        if (OooO0O02 != null) {
                            if (OooOooo(2)) {
                                OooO0O02.toString();
                            }
                            o000Var.OooO00o(OooO0O02);
                        } else {
                            throw new IllegalStateException(OooO0O0.OooO00o.OooO0Oo("No instantiated fragment for (", str, ")"));
                        }
                    }
                }
                if (o0000o02.f2840OooO0OO != null) {
                    this.f2867OooO0Oo = new ArrayList(o0000o02.f2840OooO0OO.length);
                    int i2 = 0;
                    while (true) {
                        OooO0O0[] oooO0O0Arr = o0000o02.f2840OooO0OO;
                        if (i2 >= oooO0O0Arr.length) {
                            break;
                        }
                        OooO0O0 oooO0O0 = oooO0O0Arr[i2];
                        oooO0O0.getClass();
                        OooO00o oooO00o = new OooO00o(this);
                        int i3 = 0;
                        int i4 = 0;
                        while (true) {
                            int[] iArr = oooO0O0.f2758OooO00o;
                            if (i3 >= iArr.length) {
                                break;
                            }
                            o000O000 o000o000 = new o000O000();
                            int i5 = i3 + 1;
                            o000o000.f2906OooO00o = iArr[i3];
                            if (OooOooo(2)) {
                                oooO00o.toString();
                                int i6 = iArr[i5];
                            }
                            String str2 = (String) oooO0O0.f2759OooO0O0.get(i4);
                            if (str2 != null) {
                                o00oo0 = OooOoO(str2);
                            } else {
                                o00oo0 = null;
                            }
                            o000o000.f2907OooO0O0 = o00oo0;
                            o000o000.f2912OooO0oO = androidx.lifecycle.Oooo000.values()[oooO0O0.f2760OooO0OO[i4]];
                            o000o000.f2913OooO0oo = androidx.lifecycle.Oooo000.values()[oooO0O0.f2761OooO0Oo[i4]];
                            int i7 = i5 + 1;
                            int i8 = iArr[i5];
                            o000o000.f2908OooO0OO = i8;
                            int i9 = i7 + 1;
                            int i10 = iArr[i7];
                            o000o000.f2909OooO0Oo = i10;
                            int i11 = i9 + 1;
                            int i12 = iArr[i9];
                            o000o000.f2911OooO0o0 = i12;
                            int i13 = iArr[i11];
                            o000o000.f2910OooO0o = i13;
                            oooO00o.f2742OooO0O0 = i8;
                            oooO00o.f2743OooO0OO = i10;
                            oooO00o.f2744OooO0Oo = i12;
                            oooO00o.f2746OooO0o0 = i13;
                            oooO00o.OooO0O0(o000o000);
                            i4++;
                            i3 = i11 + 1;
                        }
                        oooO00o.f2745OooO0o = oooO0O0.f2763OooO0o0;
                        oooO00o.f2748OooO0oo = oooO0O0.f2762OooO0o;
                        oooO00o.f2755OooOOo = oooO0O0.f2764OooO0oO;
                        oooO00o.f2747OooO0oO = true;
                        oooO00o.f2740OooO = oooO0O0.f2765OooO0oo;
                        oooO00o.f2749OooOO0 = oooO0O0.f2757OooO;
                        oooO00o.f2750OooOO0O = oooO0O0.f2766OooOO0;
                        oooO00o.f2751OooOO0o = oooO0O0.f2767OooOO0O;
                        oooO00o.OooOOO0 = oooO0O0.f2768OooOO0o;
                        oooO00o.f2752OooOOO = oooO0O0.OooOOO0;
                        oooO00o.f2753OooOOOO = oooO0O0.f2769OooOOO;
                        oooO00o.OooO0OO(1);
                        if (OooOooo(2)) {
                            oooO00o.toString();
                            PrintWriter printWriter = new PrintWriter(new o000OOo0());
                            oooO00o.OooO0o0("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f2867OooO0Oo.add(oooO00o);
                        i2++;
                    }
                } else {
                    this.f2867OooO0Oo = null;
                }
                this.f2863OooO.set(o0000o02.f2841OooO0Oo);
                String str3 = o0000o02.f2843OooO0o0;
                if (str3 != null) {
                    o00Oo0 OooOoO2 = OooOoO(str3);
                    this.f2880OooOOoo = OooOoO2;
                    OooOOOo(OooOoO2);
                }
                ArrayList arrayList2 = o0000o02.f2842OooO0o;
                if (arrayList2 != null) {
                    while (i < arrayList2.size()) {
                        Bundle bundle = (Bundle) o0000o02.f2844OooO0oO.get(i);
                        bundle.setClassLoader(this.f2877OooOOOo.f2994OoooOO0.getClassLoader());
                        this.f2872OooOO0.put(arrayList2.get(i), bundle);
                        i++;
                    }
                }
                this.f2887OooOoO0 = new ArrayDeque(o0000o02.f2845OooO0oo);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0090, code lost:
        if (r1 != 5) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Oooo0(int r18, androidx.fragment.app.o00Oo0 r19) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.o0000oo.Oooo0(int, androidx.fragment.app.o00Oo0):void");
    }

    public final void Oooo0O0(int i, boolean z) {
        HashMap hashMap;
        o00oO0o o00oo0o;
        boolean z2;
        if (this.f2877OooOOOo == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.f2876OooOOOO) {
            this.f2876OooOOOO = i;
            o000 o000Var = this.f2866OooO0OO;
            Iterator it = o000Var.f2812OooO00o.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                hashMap = o000Var.f2813OooO0O0;
                if (!hasNext) {
                    break;
                }
                o0000OO0 o0000oo02 = (o0000OO0) hashMap.get(((o00Oo0) it.next()).f2956OooO0o0);
                if (o0000oo02 != null) {
                    o0000oo02.OooOO0O();
                }
            }
            Iterator it2 = hashMap.values().iterator();
            while (true) {
                boolean z3 = false;
                if (!it2.hasNext()) {
                    break;
                }
                o0000OO0 o0000oo03 = (o0000OO0) it2.next();
                if (o0000oo03 != null) {
                    o0000oo03.OooOO0O();
                    o00Oo0 o00oo0 = o0000oo03.f2858OooO0OO;
                    if (o00oo0.f2961OooOO0o) {
                        if (o00oo0.f2966OooOOo0 > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            z3 = true;
                        }
                    }
                    if (z3) {
                        o000Var.OooO0oo(o0000oo03);
                    }
                }
            }
            OoooOOO();
            if (this.f2886OooOoO && (o00oo0o = this.f2877OooOOOo) != null && this.f2876OooOOOO == 7) {
                ((OooO0Oo.Oooo000) o00oo0o.f2996OoooOOo).OooOOO0().OooO0O0();
                this.f2886OooOoO = false;
            }
        }
    }

    public final void Oooo0OO() {
        if (this.f2877OooOOOo != null) {
            this.f2888OooOoOO = false;
            this.f2890OooOoo0 = false;
            this.f2896Oooo00o.f2855OooO0oo = false;
            for (o00Oo0 o00oo0 : this.f2866OooO0OO.OooO0o()) {
                if (o00oo0 != null) {
                    o00oo0.f2970OooOo00.Oooo0OO();
                }
            }
        }
    }

    public final boolean Oooo0o(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        OooO00o oooO00o;
        ArrayList arrayList3 = this.f2867OooO0Oo;
        if (arrayList3 != null) {
            if (i < 0 && (i2 & 1) == 0) {
                int size = arrayList3.size() - 1;
                if (size >= 0) {
                    arrayList.add(this.f2867OooO0Oo.remove(size));
                    arrayList2.add(Boolean.TRUE);
                    return true;
                }
            } else {
                int i3 = -1;
                if (i >= 0) {
                    int size2 = arrayList3.size() - 1;
                    while (size2 >= 0) {
                        OooO00o oooO00o2 = (OooO00o) this.f2867OooO0Oo.get(size2);
                        if (i >= 0 && i == oooO00o2.f2755OooOOo) {
                            break;
                        }
                        size2--;
                    }
                    if (size2 >= 0) {
                        if ((i2 & 1) != 0) {
                            do {
                                size2--;
                                if (size2 < 0) {
                                    break;
                                }
                                oooO00o = (OooO00o) this.f2867OooO0Oo.get(size2);
                                if (i < 0) {
                                    break;
                                }
                            } while (i == oooO00o.f2755OooOOo);
                        }
                        i3 = size2;
                    }
                }
                if (i3 != this.f2867OooO0Oo.size() - 1) {
                    for (int size3 = this.f2867OooO0Oo.size() - 1; size3 > i3; size3--) {
                        arrayList.add(this.f2867OooO0Oo.remove(size3));
                        arrayList2.add(Boolean.TRUE);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean Oooo0o0() {
        OooOo(false);
        OooOo0o(true);
        o00Oo0 o00oo0 = this.f2880OooOOoo;
        if (o00oo0 != null && o00oo0.OooO0oo().Oooo0o0()) {
            return true;
        }
        boolean Oooo0o2 = Oooo0o(this.f2892OooOooo, this.f2894Oooo000, -1, 0);
        if (Oooo0o2) {
            this.f2865OooO0O0 = true;
            try {
                Oooo0oo(this.f2892OooOooo, this.f2894Oooo000);
            } finally {
                OooO0Oo();
            }
        }
        OoooOo0();
        OooOo00();
        this.f2866OooO0OO.f2813OooO0O0.values().removeAll(Collections.singleton(null));
        return Oooo0o2;
    }

    public final void Oooo0oO(o00Oo0 o00oo0) {
        boolean z;
        if (OooOooo(2)) {
            Objects.toString(o00oo0);
        }
        if (o00oo0.f2966OooOOo0 > 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = !z;
        if (!o00oo0.f2973OooOoO || z2) {
            o000 o000Var = this.f2866OooO0OO;
            synchronized (o000Var.f2812OooO00o) {
                o000Var.f2812OooO00o.remove(o00oo0);
            }
            o00oo0.f2960OooOO0O = false;
            if (Oooo000(o00oo0)) {
                this.f2886OooOoO = true;
            }
            o00oo0.f2961OooOO0o = true;
            o000oOoO(o00oo0);
        }
    }

    public final void Oooo0oo(ArrayList arrayList, ArrayList arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    if (!((OooO00o) arrayList.get(i)).f2753OooOOOO) {
                        if (i2 != i) {
                            OooOoO0(arrayList, arrayList2, i2, i);
                        }
                        i2 = i + 1;
                        if (((Boolean) arrayList2.get(i)).booleanValue()) {
                            while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((OooO00o) arrayList.get(i2)).f2753OooOOOO) {
                                i2++;
                            }
                        }
                        OooOoO0(arrayList, arrayList2, i, i2);
                        i = i2 - 1;
                    }
                    i++;
                }
                if (i2 != size) {
                    OooOoO0(arrayList, arrayList2, i2, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    public final void OoooO(o00Oo0 o00oo0, androidx.lifecycle.Oooo000 oooo000) {
        if (o00oo0.equals(OooOoO(o00oo0.f2956OooO0o0)) && (o00oo0.f2967OooOOoo == null || o00oo0.f2965OooOOo == this)) {
            o00oo0.f2988Oooo0o0 = oooo000;
            return;
        }
        throw new IllegalArgumentException("Fragment " + o00oo0 + " is not an active fragment of FragmentManager " + this);
    }

    public final void OoooO0() {
        synchronized (this.f2864OooO00o) {
            boolean z = true;
            if (this.f2864OooO00o.size() != 1) {
                z = false;
            }
            if (z) {
                this.f2877OooOOOo.f2997o000oOoO.removeCallbacks(this.f2893Oooo0);
                this.f2877OooOOOo.f2997o000oOoO.post(this.f2893Oooo0);
                OoooOo0();
            }
        }
    }

    public final o0000O0 OoooO00() {
        int i;
        OooO0O0[] oooO0O0Arr;
        ArrayList arrayList;
        int size;
        Iterator it = OooO0o0().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            o00O000 o00o000 = (o00O000) it.next();
            if (o00o000.f2940OooO0o0) {
                o00o000.f2940OooO0o0 = false;
                o00o000.OooO0OO();
            }
        }
        Iterator it2 = OooO0o0().iterator();
        while (it2.hasNext()) {
            ((o00O000) it2.next()).OooO0o0();
        }
        OooOo(true);
        this.f2888OooOoOO = true;
        this.f2896Oooo00o.f2855OooO0oo = true;
        o000 o000Var = this.f2866OooO0OO;
        o000Var.getClass();
        HashMap hashMap = o000Var.f2813OooO0O0;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        Iterator it3 = hashMap.values().iterator();
        while (true) {
            oooO0O0Arr = null;
            Bundle bundle = null;
            oooO0O0Arr = null;
            if (!it3.hasNext()) {
                break;
            }
            o0000OO0 o0000oo02 = (o0000OO0) it3.next();
            if (o0000oo02 != null) {
                o00Oo0 o00oo0 = o0000oo02.f2858OooO0OO;
                o0000O o0000o2 = new o0000O(o00oo0);
                if (o00oo0.f2951OooO00o > -1 && o0000o2.OooOOO0 == null) {
                    Bundle bundle2 = new Bundle();
                    o00oo0.OooOo0O(bundle2);
                    o00oo0.f2980Oooo.OooO0OO(bundle2);
                    o0000O0 OoooO002 = o00oo0.f2970OooOo00.OoooO00();
                    if (OoooO002 != null) {
                        bundle2.putParcelable("android:support:fragments", OoooO002);
                    }
                    o0000oo02.f2856OooO00o.OooOO0O(false);
                    if (!bundle2.isEmpty()) {
                        bundle = bundle2;
                    }
                    if (o00oo0.f2979OooOooo != null) {
                        o0000oo02.OooOOOO();
                    }
                    if (o00oo0.f2953OooO0OO != null) {
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putSparseParcelableArray("android:view_state", o00oo0.f2953OooO0OO);
                    }
                    if (o00oo0.f2954OooO0Oo != null) {
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putBundle("android:view_registry_state", o00oo0.f2954OooO0Oo);
                    }
                    if (!o00oo0.f2983Oooo00O) {
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putBoolean("android:user_visible_hint", o00oo0.f2983Oooo00O);
                    }
                    o0000o2.OooOOO0 = bundle;
                    if (o00oo0.f2958OooO0oo != null) {
                        if (bundle == null) {
                            o0000o2.OooOOO0 = new Bundle();
                        }
                        o0000o2.OooOOO0.putString("android:target_state", o00oo0.f2958OooO0oo);
                        int i2 = o00oo0.f2950OooO;
                        if (i2 != 0) {
                            o0000o2.OooOOO0.putInt("android:target_req_state", i2);
                        }
                    }
                } else {
                    o0000o2.OooOOO0 = o00oo0.f2952OooO0O0;
                }
                arrayList2.add(o0000o2);
                if (OooOooo(2)) {
                    Objects.toString(o00oo0);
                    Objects.toString(o0000o2.OooOOO0);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            OooOooo(2);
            return null;
        }
        o000 o000Var2 = this.f2866OooO0OO;
        synchronized (o000Var2.f2812OooO00o) {
            if (o000Var2.f2812OooO00o.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(o000Var2.f2812OooO00o.size());
                Iterator it4 = o000Var2.f2812OooO00o.iterator();
                while (it4.hasNext()) {
                    o00Oo0 o00oo02 = (o00Oo0) it4.next();
                    arrayList.add(o00oo02.f2956OooO0o0);
                    if (OooOooo(2)) {
                        o00oo02.toString();
                    }
                }
            }
        }
        ArrayList arrayList3 = this.f2867OooO0Oo;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            oooO0O0Arr = new OooO0O0[size];
            for (i = 0; i < size; i++) {
                oooO0O0Arr[i] = new OooO0O0((OooO00o) this.f2867OooO0Oo.get(i));
                if (OooOooo(2)) {
                    Objects.toString(this.f2867OooO0Oo.get(i));
                }
            }
        }
        o0000O0 o0000o02 = new o0000O0();
        o0000o02.f2838OooO00o = arrayList2;
        o0000o02.f2839OooO0O0 = arrayList;
        o0000o02.f2840OooO0OO = oooO0O0Arr;
        o0000o02.f2841OooO0Oo = this.f2863OooO.get();
        o00Oo0 o00oo03 = this.f2880OooOOoo;
        if (o00oo03 != null) {
            o0000o02.f2843OooO0o0 = o00oo03.f2956OooO0o0;
        }
        o0000o02.f2842OooO0o.addAll(this.f2872OooOO0.keySet());
        o0000o02.f2844OooO0oO.addAll(this.f2872OooOO0.values());
        o0000o02.f2845OooO0oo = new ArrayList(this.f2887OooOoO0);
        return o0000o02;
    }

    public final void OoooO0O(o00Oo0 o00oo0, boolean z) {
        ViewGroup OooOoo02 = OooOoo0(o00oo0);
        if (OooOoo02 != null && (OooOoo02 instanceof FragmentContainerView)) {
            ((FragmentContainerView) OooOoo02).setDrawDisappearingViewsLast(!z);
        }
    }

    public final void OoooOO0(o00Oo0 o00oo0) {
        if (o00oo0 != null && (!o00oo0.equals(OooOoO(o00oo0.f2956OooO0o0)) || (o00oo0.f2967OooOOoo != null && o00oo0.f2965OooOOo != this))) {
            throw new IllegalArgumentException("Fragment " + o00oo0 + " is not an active fragment of FragmentManager " + this);
        }
        o00Oo0 o00oo02 = this.f2880OooOOoo;
        this.f2880OooOOoo = o00oo0;
        OooOOOo(o00oo02);
        OooOOOo(this.f2880OooOOoo);
    }

    public final void OoooOOO() {
        Iterator it = this.f2866OooO0OO.OooO0Oo().iterator();
        while (it.hasNext()) {
            o0000OO0 o0000oo02 = (o0000OO0) it.next();
            o00Oo0 o00oo0 = o0000oo02.f2858OooO0OO;
            if (o00oo0.f2982Oooo000) {
                if (this.f2865OooO0O0) {
                    this.f2891OooOooO = true;
                } else {
                    o00oo0.f2982Oooo000 = false;
                    o0000oo02.OooOO0O();
                }
            }
        }
    }

    /* renamed from: OoooOOo */
    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        o00Oo0 o00oo0 = this.f2878OooOOo;
        if (o00oo0 != null) {
            sb.append(o00oo0.getClass().getSimpleName());
            sb.append("{");
            obj = this.f2878OooOOo;
        } else {
            o00oO0o o00oo0o = this.f2877OooOOOo;
            if (o00oo0o == null) {
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            }
            sb.append(o00oo0o.getClass().getSimpleName());
            sb.append("{");
            obj = this.f2877OooOOOo;
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }

    public final void OoooOo0() {
        int i;
        synchronized (this.f2864OooO00o) {
            try {
                boolean z = true;
                if (!this.f2864OooO00o.isEmpty()) {
                    o00000 o00000Var = this.f2871OooO0oo;
                    o00000Var.f2815OooO00o = true;
                    o0000O0O.OooO00o oooO00o = o00000Var.f2817OooO0OO;
                    if (oooO00o != null) {
                        oooO00o.OooO00o();
                    }
                    return;
                }
                o00000 o00000Var2 = this.f2871OooO0oo;
                ArrayList arrayList = this.f2867OooO0Oo;
                if (arrayList != null) {
                    i = arrayList.size();
                } else {
                    i = 0;
                }
                if (i <= 0 || !Oooo00o(this.f2878OooOOo)) {
                    z = false;
                }
                o00000Var2.f2815OooO00o = z;
                o0000O0O.OooO00o oooO00o2 = o00000Var2.f2817OooO0OO;
                if (oooO00o2 != null) {
                    oooO00o2.OooO00o();
                }
            } finally {
            }
        }
    }

    public final void o000oOoO(o00Oo0 o00oo0) {
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup OooOoo02 = OooOoo0(o00oo0);
        if (OooOoo02 != null) {
            o0OoOo0 o0oooo0 = o00oo0.f2984Oooo00o;
            boolean z = false;
            if (o0oooo0 == null) {
                i = 0;
            } else {
                i = o0oooo0.f3023OooO0Oo;
            }
            if (o0oooo0 == null) {
                i2 = 0;
            } else {
                i2 = o0oooo0.f3025OooO0o0;
            }
            int i5 = i2 + i;
            if (o0oooo0 == null) {
                i3 = 0;
            } else {
                i3 = o0oooo0.f3024OooO0o;
            }
            int i6 = i3 + i5;
            if (o0oooo0 == null) {
                i4 = 0;
            } else {
                i4 = o0oooo0.f3026OooO0oO;
            }
            if (i4 + i6 > 0) {
                if (OooOoo02.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    OooOoo02.setTag(R.id.visible_removing_fragment_view_tag, o00oo0);
                }
                o00Oo0 o00oo02 = (o00Oo0) OooOoo02.getTag(R.id.visible_removing_fragment_view_tag);
                o0OoOo0 o0oooo02 = o00oo0.f2984Oooo00o;
                if (o0oooo02 != null) {
                    z = o0oooo02.f3022OooO0OO;
                }
                if (o00oo02.f2984Oooo00o != null) {
                    o00oo02.OooO0o().f3022OooO0OO = z;
                }
            }
        }
    }
}