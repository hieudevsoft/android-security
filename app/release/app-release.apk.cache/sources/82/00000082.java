package OooOO0;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public class OooOOOO {

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public static Object[] f536OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public static Object[] f537OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public static int f538OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public static int f539OooO0oO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public int[] f540OooO00o = o0000O00.OooO00o.f4111OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public Object[] f541OooO0O0 = o0000O00.OooO00o.f4112OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f542OooO0OO = 0;

    private void OooO00o(int i) {
        if (i == 8) {
            synchronized (OooOOOO.class) {
                Object[] objArr = f537OooO0o;
                if (objArr != null) {
                    this.f541OooO0O0 = objArr;
                    f537OooO0o = (Object[]) objArr[0];
                    this.f540OooO00o = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f539OooO0oO--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (OooOOOO.class) {
                Object[] objArr2 = f536OooO0Oo;
                if (objArr2 != null) {
                    this.f541OooO0O0 = objArr2;
                    f536OooO0Oo = (Object[]) objArr2[0];
                    this.f540OooO00o = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f538OooO0o0--;
                    return;
                }
            }
        }
        this.f540OooO00o = new int[i];
        this.f541OooO0O0 = new Object[i << 1];
    }

    public static void OooO0OO(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (OooOOOO.class) {
                if (f539OooO0oO < 10) {
                    objArr[0] = f537OooO0o;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f537OooO0o = objArr;
                    f539OooO0oO++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (OooOOOO.class) {
                if (f538OooO0o0 < 10) {
                    objArr[0] = f536OooO0Oo;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f536OooO0Oo = objArr;
                    f538OooO0o0++;
                }
            }
        }
    }

    public final Object OooO(int i) {
        Object[] objArr = this.f541OooO0O0;
        int i2 = i << 1;
        Object obj = objArr[i2 + 1];
        int i3 = this.f542OooO0OO;
        int i4 = 0;
        if (i3 <= 1) {
            OooO0OO(this.f540OooO00o, objArr, i3);
            this.f540OooO00o = o0000O00.OooO00o.f4111OooO00o;
            this.f541OooO0O0 = o0000O00.OooO00o.f4112OooO0O0;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f540OooO00o;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i6 = i + 1;
                    int i7 = i5 - i;
                    System.arraycopy(iArr, i6, iArr, i, i7);
                    Object[] objArr2 = this.f541OooO0O0;
                    System.arraycopy(objArr2, i6 << 1, objArr2, i2, i7 << 1);
                }
                Object[] objArr3 = this.f541OooO0O0;
                int i8 = i5 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            } else {
                OooO00o(i3 > 8 ? i3 + (i3 >> 1) : 8);
                if (i3 != this.f542OooO0OO) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f540OooO00o, 0, i);
                    System.arraycopy(objArr, 0, this.f541OooO0O0, 0, i2);
                }
                if (i < i5) {
                    int i9 = i + 1;
                    int i10 = i5 - i;
                    System.arraycopy(iArr, i9, this.f540OooO00o, i, i10);
                    System.arraycopy(objArr, i9 << 1, this.f541OooO0O0, i2, i10 << 1);
                }
            }
            i4 = i5;
        }
        if (i3 == this.f542OooO0OO) {
            this.f542OooO0OO = i4;
            return obj;
        }
        throw new ConcurrentModificationException();
    }

    public final void OooO0O0(int i) {
        int i2 = this.f542OooO0OO;
        int[] iArr = this.f540OooO00o;
        if (iArr.length < i) {
            Object[] objArr = this.f541OooO0O0;
            OooO00o(i);
            if (this.f542OooO0OO > 0) {
                System.arraycopy(iArr, 0, this.f540OooO00o, 0, i2);
                System.arraycopy(objArr, 0, this.f541OooO0O0, 0, i2 << 1);
            }
            OooO0OO(iArr, objArr, i2);
        }
        if (this.f542OooO0OO != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public final int OooO0Oo(int i, Object obj) {
        int i2 = this.f542OooO0OO;
        if (i2 == 0) {
            return -1;
        }
        try {
            int OooOOOo2 = o0000O00.OooO00o.OooOOOo(i2, i, this.f540OooO00o);
            if (OooOOOo2 < 0) {
                return OooOOOo2;
            }
            if (obj.equals(this.f541OooO0O0[OooOOOo2 << 1])) {
                return OooOOOo2;
            }
            int i3 = OooOOOo2 + 1;
            while (i3 < i2 && this.f540OooO00o[i3] == i) {
                if (obj.equals(this.f541OooO0O0[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = OooOOOo2 - 1; i4 >= 0 && this.f540OooO00o[i4] == i; i4--) {
                if (obj.equals(this.f541OooO0O0[i4 << 1])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int OooO0o() {
        int i = this.f542OooO0OO;
        if (i == 0) {
            return -1;
        }
        try {
            int OooOOOo2 = o0000O00.OooO00o.OooOOOo(i, 0, this.f540OooO00o);
            if (OooOOOo2 < 0) {
                return OooOOOo2;
            }
            if (this.f541OooO0O0[OooOOOo2 << 1] == null) {
                return OooOOOo2;
            }
            int i2 = OooOOOo2 + 1;
            while (i2 < i && this.f540OooO00o[i2] == 0) {
                if (this.f541OooO0O0[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = OooOOOo2 - 1; i3 >= 0 && this.f540OooO00o[i3] == 0; i3--) {
                if (this.f541OooO0O0[i3 << 1] == null) {
                    return i3;
                }
            }
            return ~i2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int OooO0o0(Object obj) {
        return obj == null ? OooO0o() : OooO0Oo(obj.hashCode(), obj);
    }

    public final int OooO0oO(Object obj) {
        int i = this.f542OooO0OO * 2;
        Object[] objArr = this.f541OooO0O0;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final Object OooO0oo(int i) {
        return this.f541OooO0O0[i << 1];
    }

    public final Object OooOO0(int i) {
        return this.f541OooO0O0[(i << 1) + 1];
    }

    public final void clear() {
        int i = this.f542OooO0OO;
        if (i > 0) {
            int[] iArr = this.f540OooO00o;
            Object[] objArr = this.f541OooO0O0;
            this.f540OooO00o = o0000O00.OooO00o.f4111OooO00o;
            this.f541OooO0O0 = o0000O00.OooO00o.f4112OooO0O0;
            this.f542OooO0OO = 0;
            OooO0OO(iArr, objArr, i);
        }
        if (this.f542OooO0OO > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return OooO0o0(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return OooO0oO(obj) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OooOOOO) {
            OooOOOO oooOOOO = (OooOOOO) obj;
            if (this.f542OooO0OO != oooOOOO.f542OooO0OO) {
                return false;
            }
            for (int i = 0; i < this.f542OooO0OO; i++) {
                try {
                    Object OooO0oo2 = OooO0oo(i);
                    Object OooOO02 = OooOO0(i);
                    Object orDefault = oooOOOO.getOrDefault(OooO0oo2, null);
                    if (OooOO02 == null) {
                        if (orDefault != null || !oooOOOO.containsKey(OooO0oo2)) {
                            return false;
                        }
                    } else if (!OooOO02.equals(orDefault)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f542OooO0OO != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f542OooO0OO; i2++) {
                try {
                    Object OooO0oo3 = OooO0oo(i2);
                    Object OooOO03 = OooOO0(i2);
                    Object obj2 = map.get(OooO0oo3);
                    if (OooOO03 == null) {
                        if (obj2 != null || !map.containsKey(OooO0oo3)) {
                            return false;
                        }
                    } else if (!OooOO03.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int OooO0o02 = OooO0o0(obj);
        return OooO0o02 >= 0 ? this.f541OooO0O0[(OooO0o02 << 1) + 1] : obj2;
    }

    public final int hashCode() {
        int[] iArr = this.f540OooO00o;
        Object[] objArr = this.f541OooO0O0;
        int i = this.f542OooO0OO;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public final boolean isEmpty() {
        return this.f542OooO0OO <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i;
        int OooO0Oo2;
        int i2 = this.f542OooO0OO;
        if (obj == null) {
            OooO0Oo2 = OooO0o();
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            OooO0Oo2 = OooO0Oo(hashCode, obj);
        }
        if (OooO0Oo2 >= 0) {
            int i3 = (OooO0Oo2 << 1) + 1;
            Object[] objArr = this.f541OooO0O0;
            Object obj3 = objArr[i3];
            objArr[i3] = obj2;
            return obj3;
        }
        int i4 = ~OooO0Oo2;
        int[] iArr = this.f540OooO00o;
        if (i2 >= iArr.length) {
            int i5 = 8;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            Object[] objArr2 = this.f541OooO0O0;
            OooO00o(i5);
            if (i2 != this.f542OooO0OO) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f540OooO00o;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f541OooO0O0, 0, objArr2.length);
            }
            OooO0OO(iArr, objArr2, i2);
        }
        if (i4 < i2) {
            int[] iArr3 = this.f540OooO00o;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.f541OooO0O0;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.f542OooO0OO - i4) << 1);
        }
        int i7 = this.f542OooO0OO;
        if (i2 == i7) {
            int[] iArr4 = this.f540OooO00o;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.f541OooO0O0;
                int i8 = i4 << 1;
                objArr4[i8] = obj;
                objArr4[i8 + 1] = obj2;
                this.f542OooO0OO = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object orDefault = getOrDefault(obj, null);
        if (orDefault == null) {
            return put(obj, obj2);
        }
        return orDefault;
    }

    public final Object remove(Object obj) {
        int OooO0o02 = OooO0o0(obj);
        if (OooO0o02 >= 0) {
            return OooO(OooO0o02);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int OooO0o02 = OooO0o0(obj);
        if (OooO0o02 >= 0) {
            int i = (OooO0o02 << 1) + 1;
            Object[] objArr = this.f541OooO0O0;
            Object obj3 = objArr[i];
            objArr[i] = obj2;
            return obj3;
        }
        return null;
    }

    public final int size() {
        return this.f542OooO0OO;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f542OooO0OO * 28);
        sb.append('{');
        for (int i = 0; i < this.f542OooO0OO; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object OooO0oo2 = OooO0oo(i);
            if (OooO0oo2 != this) {
                sb.append(OooO0oo2);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object OooOO02 = OooOO0(i);
            if (OooOO02 != this) {
                sb.append(OooOO02);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int OooO0o02 = OooO0o0(obj);
        if (OooO0o02 >= 0) {
            Object OooOO02 = OooOO0(OooO0o02);
            if (obj2 == OooOO02 || (obj2 != null && obj2.equals(OooOO02))) {
                OooO(OooO0o02);
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int OooO0o02 = OooO0o0(obj);
        if (OooO0o02 >= 0) {
            Object OooOO02 = OooOO0(OooO0o02);
            if (OooOO02 == obj2 || (obj2 != null && obj2.equals(OooOO02))) {
                int i = (OooO0o02 << 1) + 1;
                Object[] objArr = this.f541OooO0O0;
                Object obj4 = objArr[i];
                objArr[i] = obj3;
                return true;
            }
            return false;
        }
        return false;
    }
}