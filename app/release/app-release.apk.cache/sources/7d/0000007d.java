package OooOO0;

/* loaded from: classes.dex */
public final class OooO0o implements Cloneable {

    /* renamed from: OooO0o0  reason: collision with root package name */
    public static final Object f519OooO0o0 = new Object();

    /* renamed from: OooO00o  reason: collision with root package name */
    public boolean f520OooO00o = false;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public long[] f521OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public Object[] f522OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public int f523OooO0Oo;

    public OooO0o() {
        int i;
        int i2 = 4;
        while (true) {
            i = 80;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (80 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 8;
        this.f521OooO0O0 = new long[i4];
        this.f522OooO0OO = new Object[i4];
    }

    public final void OooO00o() {
        int i = this.f523OooO0Oo;
        Object[] objArr = this.f522OooO0OO;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f523OooO0Oo = 0;
        this.f520OooO00o = false;
    }

    /* renamed from: OooO0O0 */
    public final OooO0o clone() {
        try {
            OooO0o oooO0o = (OooO0o) super.clone();
            oooO0o.f521OooO0O0 = (long[]) this.f521OooO0O0.clone();
            oooO0o.f522OooO0OO = (Object[]) this.f522OooO0OO.clone();
            return oooO0o;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final void OooO0OO() {
        int i = this.f523OooO0Oo;
        long[] jArr = this.f521OooO0O0;
        Object[] objArr = this.f522OooO0OO;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f519OooO0o0) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f520OooO00o = false;
        this.f523OooO0Oo = i2;
    }

    public final Object OooO0Oo(long j, Long l) {
        Object obj;
        int OooOOo02 = o0000O00.OooO00o.OooOOo0(this.f521OooO0O0, this.f523OooO0Oo, j);
        return (OooOOo02 < 0 || (obj = this.f522OooO0OO[OooOOo02]) == f519OooO0o0) ? l : obj;
    }

    public final Object OooO0o(int i) {
        if (this.f520OooO00o) {
            OooO0OO();
        }
        return this.f522OooO0OO[i];
    }

    public final void OooO0o0(long j, Object obj) {
        int OooOOo02 = o0000O00.OooO00o.OooOOo0(this.f521OooO0O0, this.f523OooO0Oo, j);
        if (OooOOo02 >= 0) {
            this.f522OooO0OO[OooOOo02] = obj;
            return;
        }
        int i = ~OooOOo02;
        int i2 = this.f523OooO0Oo;
        if (i < i2) {
            Object[] objArr = this.f522OooO0OO;
            if (objArr[i] == f519OooO0o0) {
                this.f521OooO0O0[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f520OooO00o && i2 >= this.f521OooO0O0.length) {
            OooO0OO();
            i = ~o0000O00.OooO00o.OooOOo0(this.f521OooO0O0, this.f523OooO0Oo, j);
        }
        int i3 = this.f523OooO0Oo;
        if (i3 >= this.f521OooO0O0.length) {
            int i4 = (i3 + 1) * 8;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 8;
            long[] jArr = new long[i7];
            Object[] objArr2 = new Object[i7];
            long[] jArr2 = this.f521OooO0O0;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f522OooO0OO;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f521OooO0O0 = jArr;
            this.f522OooO0OO = objArr2;
        }
        int i8 = this.f523OooO0Oo - i;
        if (i8 != 0) {
            long[] jArr3 = this.f521OooO0O0;
            int i9 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i9, i8);
            Object[] objArr4 = this.f522OooO0OO;
            System.arraycopy(objArr4, i, objArr4, i9, this.f523OooO0Oo - i);
        }
        this.f521OooO0O0[i] = j;
        this.f522OooO0OO[i] = obj;
        this.f523OooO0Oo++;
    }

    public final String toString() {
        if (this.f520OooO00o) {
            OooO0OO();
        }
        int i = this.f523OooO0Oo;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f523OooO0Oo; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            if (this.f520OooO00o) {
                OooO0OO();
            }
            sb.append(this.f521OooO0O0[i2]);
            sb.append('=');
            Object OooO0o2 = OooO0o(i2);
            if (OooO0o2 != this) {
                sb.append(OooO0o2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}