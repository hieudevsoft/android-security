package OooOO0;

/* loaded from: classes.dex */
public final class OooOo00 implements Cloneable {

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public static final Object f543OooO0Oo = new Object();

    /* renamed from: OooO00o  reason: collision with root package name */
    public int[] f544OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public Object[] f545OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f546OooO0OO;

    public OooOo00() {
        int i;
        int i2 = 4;
        while (true) {
            i = 40;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (40 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 4;
        this.f544OooO00o = new int[i4];
        this.f545OooO0O0 = new Object[i4];
    }

    public final void OooO00o(int i, Object obj) {
        int i2 = this.f546OooO0OO;
        if (i2 != 0 && i <= this.f544OooO00o[i2 - 1]) {
            OooO0Oo(i, obj);
            return;
        }
        if (i2 >= this.f544OooO00o.length) {
            int i3 = (i2 + 1) * 4;
            int i4 = 4;
            while (true) {
                if (i4 >= 32) {
                    break;
                }
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
                i4++;
            }
            int i6 = i3 / 4;
            int[] iArr = new int[i6];
            Object[] objArr = new Object[i6];
            int[] iArr2 = this.f544OooO00o;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f545OooO0O0;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f544OooO00o = iArr;
            this.f545OooO0O0 = objArr;
        }
        this.f544OooO00o[i2] = i;
        this.f545OooO0O0[i2] = obj;
        this.f546OooO0OO = i2 + 1;
    }

    /* renamed from: OooO0O0 */
    public final OooOo00 clone() {
        try {
            OooOo00 oooOo00 = (OooOo00) super.clone();
            oooOo00.f544OooO00o = (int[]) this.f544OooO00o.clone();
            oooOo00.f545OooO0O0 = (Object[]) this.f545OooO0O0.clone();
            return oooOo00;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final Object OooO0OO(int i, Integer num) {
        Object obj;
        int OooOOOo2 = o0000O00.OooO00o.OooOOOo(this.f546OooO0OO, i, this.f544OooO00o);
        return (OooOOOo2 < 0 || (obj = this.f545OooO0O0[OooOOOo2]) == f543OooO0Oo) ? num : obj;
    }

    public final void OooO0Oo(int i, Object obj) {
        int OooOOOo2 = o0000O00.OooO00o.OooOOOo(this.f546OooO0OO, i, this.f544OooO00o);
        if (OooOOOo2 >= 0) {
            this.f545OooO0O0[OooOOOo2] = obj;
            return;
        }
        int i2 = ~OooOOOo2;
        int i3 = this.f546OooO0OO;
        if (i2 < i3) {
            Object[] objArr = this.f545OooO0O0;
            if (objArr[i2] == f543OooO0Oo) {
                this.f544OooO00o[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.f544OooO00o.length) {
            int i4 = (i3 + 1) * 4;
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
            int i7 = i4 / 4;
            int[] iArr = new int[i7];
            Object[] objArr2 = new Object[i7];
            int[] iArr2 = this.f544OooO00o;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f545OooO0O0;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f544OooO00o = iArr;
            this.f545OooO0O0 = objArr2;
        }
        int i8 = this.f546OooO0OO - i2;
        if (i8 != 0) {
            int[] iArr3 = this.f544OooO00o;
            int i9 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i9, i8);
            Object[] objArr4 = this.f545OooO0O0;
            System.arraycopy(objArr4, i2, objArr4, i9, this.f546OooO0OO - i2);
        }
        this.f544OooO00o[i2] = i;
        this.f545OooO0O0[i2] = obj;
        this.f546OooO0OO++;
    }

    public final String toString() {
        int i = this.f546OooO0OO;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f546OooO0OO; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(this.f544OooO00o[i2]);
            sb.append('=');
            Object obj = this.f545OooO0O0[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}