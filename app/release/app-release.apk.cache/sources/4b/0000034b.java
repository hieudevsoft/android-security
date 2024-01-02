package androidx.fragment.app;

import android.transition.Transition;

/* loaded from: classes.dex */
public final class OooOOO0 extends OooO0Oo.o00000 {

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final Object f2786OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final boolean f2787OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final Object f2788OooO0o0;

    public OooOOO0(o00O0000 o00o0000, OooOoOO.o000000 o000000Var, boolean z, boolean z2) {
        super(o00o0000, o000000Var);
        Object obj;
        Object obj2;
        o00oOoo o00oooo = o00o0000.f2941OooO00o;
        o00oOoo o00oooo2 = o00oOoo.VISIBLE;
        o00Oo0 o00oo0 = o00o0000.f2943OooO0OO;
        if (o00oooo == o00oooo2) {
            if (z) {
                obj2 = o00oo0.OooOO0o();
            } else {
                o00oo0.getClass();
                obj2 = null;
            }
            this.f2786OooO0OO = obj2;
            o00oo0.getClass();
        } else {
            if (z) {
                obj = o00oo0.OooOOO0();
            } else {
                o00oo0.getClass();
                obj = null;
            }
            this.f2786OooO0OO = obj;
        }
        this.f2787OooO0Oo = true;
        if (z2) {
            if (z) {
                this.f2788OooO0o0 = o00oo0.OooOOO();
                return;
            }
            o00oo0.getClass();
        }
        this.f2788OooO0o0 = null;
    }

    public final o000O OooO0oo(Object obj) {
        if (obj == null) {
            return null;
        }
        o000OO0O o000oo0o = o000Oo0.f2933OooO00o;
        if (obj instanceof Transition) {
            return o000oo0o;
        }
        o000O o000o = o000Oo0.f2934OooO0O0;
        if (o000o != null && o000o.OooO0o0(obj)) {
            return o000o;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + ((o00O0000) this.f96OooO00o).f2943OooO0OO + " is not a valid framework Transition or AndroidX Transition");
    }
}