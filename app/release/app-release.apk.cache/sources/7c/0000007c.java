package OooOO0;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class OooO0OO implements Collection, Set {

    /* renamed from: OooO  reason: collision with root package name */
    public static Object[] f509OooO;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public static Object[] f512OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public static int f513OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public static int f514OooOO0;

    /* renamed from: OooO00o  reason: collision with root package name */
    public int[] f515OooO00o = f511OooO0o0;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public Object[] f516OooO0O0 = f510OooO0o;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f517OooO0OO = 0;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public OooO00o f518OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public static final int[] f511OooO0o0 = new int[0];

    /* renamed from: OooO0o  reason: collision with root package name */
    public static final Object[] f510OooO0o = new Object[0];

    public static void OooO0oO(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (OooO0OO.class) {
                if (f514OooOO0 < 10) {
                    objArr[0] = f509OooO;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f509OooO = objArr;
                    f514OooOO0++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (OooO0OO.class) {
                if (f513OooO0oo < 10) {
                    objArr[0] = f512OooO0oO;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f512OooO0oO = objArr;
                    f513OooO0oo++;
                }
            }
        }
    }

    public final int OooO() {
        int i = this.f517OooO0OO;
        if (i == 0) {
            return -1;
        }
        int OooOOOo2 = o0000O00.OooO00o.OooOOOo(i, 0, this.f515OooO00o);
        if (OooOOOo2 >= 0 && this.f516OooO0O0[OooOOOo2] != null) {
            int i2 = OooOOOo2 + 1;
            while (i2 < i && this.f515OooO00o[i2] == 0) {
                if (this.f516OooO0O0[i2] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = OooOOOo2 - 1; i3 >= 0 && this.f515OooO00o[i3] == 0; i3--) {
                if (this.f516OooO0O0[i3] == null) {
                    return i3;
                }
            }
            return ~i2;
        }
        return OooOOOo2;
    }

    public final void OooO0o(int i) {
        if (i == 8) {
            synchronized (OooO0OO.class) {
                Object[] objArr = f509OooO;
                if (objArr != null) {
                    this.f516OooO0O0 = objArr;
                    f509OooO = (Object[]) objArr[0];
                    this.f515OooO00o = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f514OooOO0--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (OooO0OO.class) {
                Object[] objArr2 = f512OooO0oO;
                if (objArr2 != null) {
                    this.f516OooO0O0 = objArr2;
                    f512OooO0oO = (Object[]) objArr2[0];
                    this.f515OooO00o = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f513OooO0oo--;
                    return;
                }
            }
        }
        this.f515OooO00o = new int[i];
        this.f516OooO0O0 = new Object[i];
    }

    public final int OooO0oo(int i, Object obj) {
        int i2 = this.f517OooO0OO;
        if (i2 == 0) {
            return -1;
        }
        int OooOOOo2 = o0000O00.OooO00o.OooOOOo(i2, i, this.f515OooO00o);
        if (OooOOOo2 >= 0 && !obj.equals(this.f516OooO0O0[OooOOOo2])) {
            int i3 = OooOOOo2 + 1;
            while (i3 < i2 && this.f515OooO00o[i3] == i) {
                if (obj.equals(this.f516OooO0O0[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = OooOOOo2 - 1; i4 >= 0 && this.f515OooO00o[i4] == i; i4--) {
                if (obj.equals(this.f516OooO0O0[i4])) {
                    return i4;
                }
            }
            return ~i3;
        }
        return OooOOOo2;
    }

    public final void OooOO0(int i) {
        Object[] objArr = this.f516OooO0O0;
        Object obj = objArr[i];
        int i2 = this.f517OooO0OO;
        if (i2 <= 1) {
            OooO0oO(this.f515OooO00o, objArr, i2);
            this.f515OooO00o = f511OooO0o0;
            this.f516OooO0O0 = f510OooO0o;
            this.f517OooO0OO = 0;
            return;
        }
        int[] iArr = this.f515OooO00o;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            int i3 = i2 - 1;
            this.f517OooO0OO = i3;
            if (i < i3) {
                int i4 = i + 1;
                System.arraycopy(iArr, i4, iArr, i, i3 - i);
                Object[] objArr2 = this.f516OooO0O0;
                System.arraycopy(objArr2, i4, objArr2, i, this.f517OooO0OO - i);
            }
            this.f516OooO0O0[this.f517OooO0OO] = null;
            return;
        }
        OooO0o(i2 > 8 ? i2 + (i2 >> 1) : 8);
        this.f517OooO0OO--;
        if (i > 0) {
            System.arraycopy(iArr, 0, this.f515OooO00o, 0, i);
            System.arraycopy(objArr, 0, this.f516OooO0O0, 0, i);
        }
        int i5 = this.f517OooO0OO;
        if (i < i5) {
            int i6 = i + 1;
            System.arraycopy(iArr, i6, this.f515OooO00o, i, i5 - i);
            System.arraycopy(objArr, i6, this.f516OooO0O0, i, this.f517OooO0OO - i);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int OooO0oo2;
        if (obj == null) {
            OooO0oo2 = OooO();
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            OooO0oo2 = OooO0oo(hashCode, obj);
        }
        if (OooO0oo2 >= 0) {
            return false;
        }
        int i2 = ~OooO0oo2;
        int i3 = this.f517OooO0OO;
        int[] iArr = this.f515OooO00o;
        if (i3 >= iArr.length) {
            int i4 = 8;
            if (i3 >= 8) {
                i4 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.f516OooO0O0;
            OooO0o(i4);
            int[] iArr2 = this.f515OooO00o;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f516OooO0O0, 0, objArr.length);
            }
            OooO0oO(iArr, objArr, this.f517OooO0OO);
        }
        int i5 = this.f517OooO0OO;
        if (i2 < i5) {
            int[] iArr3 = this.f515OooO00o;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr2 = this.f516OooO0O0;
            System.arraycopy(objArr2, i2, objArr2, i6, this.f517OooO0OO - i2);
        }
        this.f515OooO00o[i2] = i;
        this.f516OooO0O0[i2] = obj;
        this.f517OooO0OO++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f517OooO0OO;
        int[] iArr = this.f515OooO00o;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.f516OooO0O0;
            OooO0o(size);
            int i = this.f517OooO0OO;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f515OooO00o, 0, i);
                System.arraycopy(objArr, 0, this.f516OooO0O0, 0, this.f517OooO0OO);
            }
            OooO0oO(iArr, objArr, this.f517OooO0OO);
        }
        for (Object obj : collection) {
            z |= add(obj);
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.f517OooO0OO;
        if (i != 0) {
            OooO0oO(this.f515OooO00o, this.f516OooO0O0, i);
            this.f515OooO00o = f511OooO0o0;
            this.f516OooO0O0 = f510OooO0o;
            this.f517OooO0OO = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f517OooO0OO != set.size()) {
                return false;
            }
            for (int i = 0; i < this.f517OooO0OO; i++) {
                try {
                    if (!set.contains(this.f516OooO0O0[i])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f515OooO00o;
        int i = this.f517OooO0OO;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        return obj == null ? OooO() : OooO0oo(obj.hashCode(), obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f517OooO0OO <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        if (this.f518OooO0Oo == null) {
            this.f518OooO0Oo = new OooO00o(1, this);
        }
        OooO00o oooO00o = this.f518OooO0Oo;
        if (((OooOO0O) oooO00o.f346OooO0O0) == null) {
            oooO00o.f346OooO0O0 = new OooOO0O(oooO00o, 1);
        }
        return ((OooOO0O) oooO00o.f346OooO0O0).iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            OooOO0(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        boolean z = false;
        for (Object obj : collection) {
            z |= remove(obj);
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z = false;
        for (int i = this.f517OooO0OO - 1; i >= 0; i--) {
            if (!collection.contains(this.f516OooO0O0[i])) {
                OooOO0(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f517OooO0OO;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i = this.f517OooO0OO;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f516OooO0O0, 0, objArr, 0, i);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f517OooO0OO * 14);
        sb.append('{');
        for (int i = 0; i < this.f517OooO0OO; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.f516OooO0O0[i];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f517OooO0OO) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f517OooO0OO);
        }
        System.arraycopy(this.f516OooO0O0, 0, objArr, 0, this.f517OooO0OO);
        int length = objArr.length;
        int i = this.f517OooO0OO;
        if (length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}