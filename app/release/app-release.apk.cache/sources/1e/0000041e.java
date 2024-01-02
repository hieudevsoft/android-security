package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
public final class o00 implements o000Oo0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final OooO0O0 f3644OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final String f3645OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final Object[] f3646OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final int f3647OooO0Oo;

    public o00(o0O0O00 o0o0o00, String str, Object[] objArr) {
        char charAt;
        this.f3644OooO00o = o0o0o00;
        this.f3645OooO0O0 = str;
        this.f3646OooO0OO = objArr;
        int charAt2 = str.charAt(0);
        if (charAt2 >= 55296) {
            int i = charAt2 & 8191;
            int i2 = 1;
            int i3 = 13;
            while (true) {
                int i4 = i2 + 1;
                charAt = str.charAt(i2);
                if (charAt < 55296) {
                    break;
                }
                i |= (charAt & 8191) << i3;
                i3 += 13;
                i2 = i4;
            }
            charAt2 = i | (charAt << i3);
        }
        this.f3647OooO0Oo = charAt2;
    }

    public final OooO0O0 OooO00o() {
        return this.f3644OooO00o;
    }

    public final Object[] OooO0O0() {
        return this.f3646OooO0OO;
    }

    public final String OooO0OO() {
        return this.f3645OooO0O0;
    }

    public final int OooO0Oo() {
        return (this.f3647OooO0Oo & 1) == 1 ? 1 : 2;
    }
}