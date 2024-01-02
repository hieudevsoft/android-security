package OooOOo0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class OooOOO {

    /* renamed from: OooO00o  reason: collision with root package name */
    public int[] f956OooO00o = new int[10];

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int[] f957OooO0O0 = new int[10];

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f958OooO0OO = 0;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public int[] f959OooO0Oo = new int[10];

    /* renamed from: OooO0o0  reason: collision with root package name */
    public float[] f961OooO0o0 = new float[10];

    /* renamed from: OooO0o  reason: collision with root package name */
    public int f960OooO0o = 0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public int[] f962OooO0oO = new int[5];

    /* renamed from: OooO0oo  reason: collision with root package name */
    public String[] f963OooO0oo = new String[5];

    /* renamed from: OooO  reason: collision with root package name */
    public int f955OooO = 0;

    /* renamed from: OooOO0  reason: collision with root package name */
    public int[] f964OooOO0 = new int[4];

    /* renamed from: OooOO0O  reason: collision with root package name */
    public boolean[] f965OooOO0O = new boolean[4];

    /* renamed from: OooOO0o  reason: collision with root package name */
    public int f966OooOO0o = 0;

    public final void OooO00o(int i, float f) {
        int i2 = this.f960OooO0o;
        int[] iArr = this.f959OooO0Oo;
        if (i2 >= iArr.length) {
            this.f959OooO0Oo = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f961OooO0o0;
            this.f961OooO0o0 = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f959OooO0Oo;
        int i3 = this.f960OooO0o;
        iArr2[i3] = i;
        float[] fArr2 = this.f961OooO0o0;
        this.f960OooO0o = i3 + 1;
        fArr2[i3] = f;
    }

    public final void OooO0O0(int i, int i2) {
        int i3 = this.f958OooO0OO;
        int[] iArr = this.f956OooO00o;
        if (i3 >= iArr.length) {
            this.f956OooO00o = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f957OooO0O0;
            this.f957OooO0O0 = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f956OooO00o;
        int i4 = this.f958OooO0OO;
        iArr3[i4] = i;
        int[] iArr4 = this.f957OooO0O0;
        this.f958OooO0OO = i4 + 1;
        iArr4[i4] = i2;
    }

    public final void OooO0OO(int i, boolean z) {
        int i2 = this.f966OooOO0o;
        int[] iArr = this.f964OooOO0;
        if (i2 >= iArr.length) {
            this.f964OooOO0 = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f965OooOO0O;
            this.f965OooOO0O = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f964OooOO0;
        int i3 = this.f966OooOO0o;
        iArr2[i3] = i;
        boolean[] zArr2 = this.f965OooOO0O;
        this.f966OooOO0o = i3 + 1;
        zArr2[i3] = z;
    }

    public final void OooO0Oo(String str, int i) {
        int i2 = this.f955OooO;
        int[] iArr = this.f962OooO0oO;
        if (i2 >= iArr.length) {
            this.f962OooO0oO = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f963OooO0oo;
            this.f963OooO0oo = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f962OooO0oO;
        int i3 = this.f955OooO;
        iArr2[i3] = i;
        String[] strArr2 = this.f963OooO0oo;
        this.f955OooO = i3 + 1;
        strArr2[i3] = str;
    }
}