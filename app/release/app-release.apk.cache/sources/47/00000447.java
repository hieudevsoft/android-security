package com.google.crypto.tink.shaded.protobuf;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class o00O0O00 extends o00O0O0O {

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ int f3713OooO0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o00O0O00(Unsafe unsafe, int i) {
        super(unsafe);
        this.f3713OooO0O0 = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0O0O
    public final boolean OooO0OO(long j, Object obj) {
        switch (this.f3713OooO0O0) {
            case 0:
                if (o00O0OO0.f3722OooO0oo) {
                    if (o00O0OO0.OooO0oo(j, obj) != 0) {
                        return true;
                    }
                } else if (o00O0OO0.OooO(j, obj) != 0) {
                    return true;
                }
                return false;
            default:
                if (o00O0OO0.f3722OooO0oo) {
                    if (o00O0OO0.OooO0oo(j, obj) != 0) {
                        return true;
                    }
                } else if (o00O0OO0.OooO(j, obj) != 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0O0O
    public final byte OooO0Oo(long j, Object obj) {
        switch (this.f3713OooO0O0) {
            case 0:
                if (o00O0OO0.f3722OooO0oo) {
                    return o00O0OO0.OooO0oo(j, obj);
                }
                return o00O0OO0.OooO(j, obj);
            default:
                if (o00O0OO0.f3722OooO0oo) {
                    return o00O0OO0.OooO0oo(j, obj);
                }
                return o00O0OO0.OooO(j, obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0O0O
    public final float OooO0o(long j, Object obj) {
        switch (this.f3713OooO0O0) {
            case 0:
                return Float.intBitsToFloat(OooO0oO(j, obj));
            default:
                return Float.intBitsToFloat(OooO0oO(j, obj));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0O0O
    public final double OooO0o0(long j, Object obj) {
        switch (this.f3713OooO0O0) {
            case 0:
                return Double.longBitsToDouble(OooO0oo(j, obj));
            default:
                return Double.longBitsToDouble(OooO0oo(j, obj));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0O0O
    public final void OooOO0O(Object obj, long j, boolean z) {
        switch (this.f3713OooO0O0) {
            case 0:
                if (o00O0OO0.f3722OooO0oo) {
                    o00O0OO0.OooOOo(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    o00O0OO0.OooOOoo(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (o00O0OO0.f3722OooO0oo) {
                    o00O0OO0.OooOOo(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    o00O0OO0.OooOOoo(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0O0O
    public final void OooOO0o(Object obj, long j, byte b) {
        switch (this.f3713OooO0O0) {
            case 0:
                if (o00O0OO0.f3722OooO0oo) {
                    o00O0OO0.OooOOo(obj, j, b);
                    return;
                } else {
                    o00O0OO0.OooOOoo(obj, j, b);
                    return;
                }
            default:
                if (o00O0OO0.f3722OooO0oo) {
                    o00O0OO0.OooOOo(obj, j, b);
                    return;
                } else {
                    o00O0OO0.OooOOoo(obj, j, b);
                    return;
                }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0O0O
    public final void OooOOO(Object obj, long j, float f) {
        switch (this.f3713OooO0O0) {
            case 0:
                OooOOOO(Float.floatToIntBits(f), j, obj);
                return;
            default:
                OooOOOO(Float.floatToIntBits(f), j, obj);
                return;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0O0O
    public final void OooOOO0(Object obj, long j, double d) {
        switch (this.f3713OooO0O0) {
            case 0:
                OooOOOo(obj, j, Double.doubleToLongBits(d));
                return;
            default:
                OooOOOo(obj, j, Double.doubleToLongBits(d));
                return;
        }
    }
}