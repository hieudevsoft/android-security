package OooOo;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class OooO0OO {

    /* renamed from: OooO0o0  reason: collision with root package name */
    public static final OooO0OO f1109OooO0o0 = new OooO0OO(0, 0, 0, 0);

    /* renamed from: OooO00o  reason: collision with root package name */
    public final int f1110OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final int f1111OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final int f1112OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final int f1113OooO0Oo;

    public OooO0OO(int i, int i2, int i3, int i4) {
        this.f1110OooO00o = i;
        this.f1111OooO0O0 = i2;
        this.f1112OooO0OO = i3;
        this.f1113OooO0Oo = i4;
    }

    public static OooO0OO OooO00o(OooO0OO oooO0OO, OooO0OO oooO0OO2) {
        return OooO0O0(Math.max(oooO0OO.f1110OooO00o, oooO0OO2.f1110OooO00o), Math.max(oooO0OO.f1111OooO0O0, oooO0OO2.f1111OooO0O0), Math.max(oooO0OO.f1112OooO0OO, oooO0OO2.f1112OooO0OO), Math.max(oooO0OO.f1113OooO0Oo, oooO0OO2.f1113OooO0Oo));
    }

    public static OooO0OO OooO0O0(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f1109OooO0o0 : new OooO0OO(i, i2, i3, i4);
    }

    public static OooO0OO OooO0OO(Insets insets) {
        int i;
        int i2;
        int i3;
        int i4;
        i = insets.left;
        i2 = insets.top;
        i3 = insets.right;
        i4 = insets.bottom;
        return OooO0O0(i, i2, i3, i4);
    }

    public final Insets OooO0Oo() {
        return OooO0O0.OooO00o(this.f1110OooO00o, this.f1111OooO0O0, this.f1112OooO0OO, this.f1113OooO0Oo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OooO0OO.class != obj.getClass()) {
            return false;
        }
        OooO0OO oooO0OO = (OooO0OO) obj;
        return this.f1113OooO0Oo == oooO0OO.f1113OooO0Oo && this.f1110OooO00o == oooO0OO.f1110OooO00o && this.f1112OooO0OO == oooO0OO.f1112OooO0OO && this.f1111OooO0O0 == oooO0OO.f1111OooO0O0;
    }

    public final int hashCode() {
        return (((((this.f1110OooO00o * 31) + this.f1111OooO0O0) * 31) + this.f1112OooO0OO) * 31) + this.f1113OooO0Oo;
    }

    public final String toString() {
        return "Insets{left=" + this.f1110OooO00o + ", top=" + this.f1111OooO0O0 + ", right=" + this.f1112OooO0OO + ", bottom=" + this.f1113OooO0Oo + '}';
    }
}