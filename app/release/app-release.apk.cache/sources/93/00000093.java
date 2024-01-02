package OooOO0o;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class o00O0O implements Comparable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public boolean f608OooO00o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public float f613OooO0o0;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public int f618OooOO0o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f609OooO0O0 = -1;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f610OooO0OO = -1;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public int f611OooO0Oo = 0;

    /* renamed from: OooO0o  reason: collision with root package name */
    public boolean f612OooO0o = false;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final float[] f614OooO0oO = new float[9];

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final float[] f615OooO0oo = new float[9];

    /* renamed from: OooO  reason: collision with root package name */
    public OooOo00[] f607OooO = new OooOo00[16];

    /* renamed from: OooOO0  reason: collision with root package name */
    public int f616OooOO0 = 0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public int f617OooOO0O = 0;

    public o00O0O(int i) {
        this.f618OooOO0o = i;
    }

    public final void OooO00o(OooOo00 oooOo00) {
        int i = 0;
        while (true) {
            int i2 = this.f616OooOO0;
            if (i >= i2) {
                OooOo00[] oooOo00Arr = this.f607OooO;
                if (i2 >= oooOo00Arr.length) {
                    this.f607OooO = (OooOo00[]) Arrays.copyOf(oooOo00Arr, oooOo00Arr.length * 2);
                }
                OooOo00[] oooOo00Arr2 = this.f607OooO;
                int i3 = this.f616OooOO0;
                oooOo00Arr2[i3] = oooOo00;
                this.f616OooOO0 = i3 + 1;
                return;
            } else if (this.f607OooO[i] == oooOo00) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void OooO0O0(OooOo00 oooOo00) {
        int i = this.f616OooOO0;
        int i2 = 0;
        while (i2 < i) {
            if (this.f607OooO[i2] == oooOo00) {
                while (i2 < i - 1) {
                    OooOo00[] oooOo00Arr = this.f607OooO;
                    int i3 = i2 + 1;
                    oooOo00Arr[i2] = oooOo00Arr[i3];
                    i2 = i3;
                }
                this.f616OooOO0--;
                return;
            }
            i2++;
        }
    }

    public final void OooO0OO() {
        this.f618OooOO0o = 5;
        this.f611OooO0Oo = 0;
        this.f609OooO0O0 = -1;
        this.f610OooO0OO = -1;
        this.f613OooO0o0 = 0.0f;
        this.f612OooO0o = false;
        int i = this.f616OooOO0;
        for (int i2 = 0; i2 < i; i2++) {
            this.f607OooO[i2] = null;
        }
        this.f616OooOO0 = 0;
        this.f617OooOO0O = 0;
        this.f608OooO00o = false;
        Arrays.fill(this.f615OooO0oo, 0.0f);
    }

    public final void OooO0Oo(OooOo oooOo, float f) {
        this.f613OooO0o0 = f;
        this.f612OooO0o = true;
        int i = this.f616OooOO0;
        this.f610OooO0OO = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f607OooO[i2].OooO0oo(oooOo, this, false);
        }
        this.f616OooOO0 = 0;
    }

    public final void OooO0o0(OooOo oooOo, OooOo00 oooOo00) {
        int i = this.f616OooOO0;
        for (int i2 = 0; i2 < i; i2++) {
            this.f607OooO[i2].OooO(oooOo, oooOo00, false);
        }
        this.f616OooOO0 = 0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f609OooO0O0 - ((o00O0O) obj).f609OooO0O0;
    }

    public final String toString() {
        return "" + this.f609OooO0O0;
    }
}