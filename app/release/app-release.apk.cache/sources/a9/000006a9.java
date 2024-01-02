package o0OO00O;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class OooOOO implements Comparable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final byte[] f5305OooO00o;

    public OooOOO(byte[] bArr) {
        this.f5305OooO00o = Arrays.copyOf(bArr, bArr.length);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        OooOOO oooOOO = (OooOOO) obj;
        byte[] bArr = this.f5305OooO00o;
        int length = bArr.length;
        byte[] bArr2 = oooOOO.f5305OooO00o;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            byte b2 = oooOOO.f5305OooO00o[i];
            if (b != b2) {
                return b - b2;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof OooOOO) {
            return Arrays.equals(this.f5305OooO00o, ((OooOOO) obj).f5305OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f5305OooO00o);
    }

    public final String toString() {
        return o0000O00.OooO00o.OoooooO(this.f5305OooO00o);
    }
}