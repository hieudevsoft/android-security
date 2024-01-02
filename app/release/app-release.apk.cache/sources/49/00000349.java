package androidx.fragment.app;

import android.content.Context;

/* loaded from: classes.dex */
public final class OooOO0O extends OooO0Oo.o00000 {

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final boolean f2783OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public boolean f2784OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public o0OO00O f2785OooO0o0;

    public OooOO0O(o00O0000 o00o0000, OooOoOO.o000000 o000000Var, boolean z) {
        super(o00o0000, o000000Var);
        this.f2784OooO0Oo = false;
        this.f2783OooO0OO = z;
    }

    public final o0OO00O OooO0oo(Context context) {
        boolean z;
        if (this.f2784OooO0Oo) {
            return this.f2785OooO0o0;
        }
        Object obj = this.f96OooO00o;
        o00Oo0 o00oo0 = ((o00O0000) obj).f2943OooO0OO;
        if (((o00O0000) obj).f2941OooO00o == o00oOoo.VISIBLE) {
            z = true;
        } else {
            z = false;
        }
        o0OO00O o0000o02 = o0000O00.OooO00o.o0000o0(context, o00oo0, z, this.f2783OooO0OO);
        this.f2785OooO0o0 = o0000o02;
        this.f2784OooO0Oo = true;
        return o0000o02;
    }
}