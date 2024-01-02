package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
public abstract class o0Oo0oo extends OooO00o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o0O0O00 f3736OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public o0O0O00 f3737OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public boolean f3738OooO0OO = false;

    public o0Oo0oo(o0O0O00 o0o0o00) {
        this.f3736OooO00o = o0o0o00;
        this.f3737OooO0O0 = (o0O0O00) o0o0o00.OooO0oO(oo0o0Oo.NEW_MUTABLE_INSTANCE);
    }

    public static void OooO0Oo(o0O0O00 o0o0o00, o0O0O00 o0o0o002) {
        o000OO00 o000oo00 = o000OO00.f3692OooO0OO;
        o000oo00.getClass();
        o000oo00.OooO00o(o0o0o00.getClass()).OooO0o0(o0o0o00, o0o0o002);
    }

    public final o0O0O00 OooO00o() {
        o0O0O00 OooO0O02 = OooO0O0();
        if (OooO0O02.OooOO0()) {
            return OooO0O02;
        }
        throw new o00O00();
    }

    public final o0O0O00 OooO0O0() {
        if (this.f3738OooO0OO) {
            return this.f3737OooO0O0;
        }
        o0O0O00 o0o0o00 = this.f3737OooO0O0;
        o0o0o00.getClass();
        o000OO00 o000oo00 = o000OO00.f3692OooO0OO;
        o000oo00.getClass();
        o000oo00.OooO00o(o0o0o00.getClass()).OooO0oO(o0o0o00);
        this.f3738OooO0OO = true;
        return this.f3737OooO0O0;
    }

    public final void OooO0OO() {
        if (this.f3738OooO0OO) {
            o0O0O00 o0o0o00 = (o0O0O00) this.f3737OooO0O0.OooO0oO(oo0o0Oo.NEW_MUTABLE_INSTANCE);
            OooO0Oo(o0o0o00, this.f3737OooO0O0);
            this.f3737OooO0O0 = o0o0o00;
            this.f3738OooO0OO = false;
        }
    }

    public final Object clone() {
        o0Oo0oo o0oo0oo = (o0Oo0oo) this.f3736OooO00o.OooO0oO(oo0o0Oo.NEW_BUILDER);
        o0O0O00 OooO0O02 = OooO0O0();
        o0oo0oo.OooO0OO();
        OooO0Oo(o0oo0oo.f3737OooO0O0, OooO0O02);
        return o0oo0oo;
    }
}