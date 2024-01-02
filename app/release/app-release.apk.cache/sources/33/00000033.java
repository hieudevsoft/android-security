package OooO0Oo;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class o00Oo0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final o000OO f234OooO00o = new o000OO(new o0000O());

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final int f235OooO0O0 = -100;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public static OooOoOO.o00000O0 f236OooO0OO = null;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public static OooOoOO.o00000O0 f237OooO0Oo = null;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public static Boolean f239OooO0o0 = null;

    /* renamed from: OooO0o  reason: collision with root package name */
    public static boolean f238OooO0o = false;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public static final OooOO0.OooO0OO f240OooO0oO = new OooOO0.OooO0OO();

    /* renamed from: OooO0oo  reason: collision with root package name */
    public static final Object f241OooO0oo = new Object();

    /* renamed from: OooO  reason: collision with root package name */
    public static final Object f233OooO = new Object();

    public static boolean OooO0OO(Context context) {
        if (f239OooO0o0 == null) {
            try {
                int i = o0000O0.f170OooO00o;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, o0000O0.class), o0000oo.OooO00o() | 128).metaData;
                if (bundle != null) {
                    f239OooO0o0 = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                f239OooO0o0 = Boolean.FALSE;
            }
        }
        return f239OooO0o0.booleanValue();
    }

    public static void OooO0oO(o00Oo0 o00oo0) {
        synchronized (f241OooO0oo) {
            Iterator it = f240OooO0oO.iterator();
            while (it.hasNext()) {
                o00Oo0 o00oo02 = (o00Oo0) ((WeakReference) it.next()).get();
                if (o00oo02 == o00oo0 || o00oo02 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract void OooO(int i);

    public abstract void OooO00o(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void OooO0O0();

    public abstract void OooO0Oo();

    public abstract void OooO0o();

    public abstract boolean OooO0oo(int i);

    public abstract void OooOO0O(View view);

    public abstract void OooOO0o(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void OooOOO0(CharSequence charSequence);
}