package androidx.fragment.app;

import OoooOoo.oO0Oo;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class o000Oo0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final o000OO0O f2933OooO00o = new o000OO0O();

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final o000O f2934OooO0O0;

    static {
        o000O o000o;
        try {
            o000o = (o000O) oO0Oo.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            o000o = null;
        }
        f2934OooO0O0 = o000o;
    }

    public static void OooO00o(o00Oo0 o00oo0, o00Oo0 o00oo02, boolean z) {
        if (z) {
            o00oo02.getClass();
        } else {
            o00oo0.getClass();
        }
    }

    public static void OooO0O0(ArrayList arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((View) arrayList.get(size)).setVisibility(i);
        }
    }
}