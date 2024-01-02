package o0000;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OooOOO extends OooOO0O {

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public static final Object[] f3960OooO0Oo = new Object[0];

    /* renamed from: OooO00o  reason: collision with root package name */
    public int f3961OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public Object[] f3962OooO0O0 = f3960OooO0Oo;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f3963OooO0OO;

    public final int OooO(int i) {
        Object[] objArr = this.f3962OooO0O0;
        o0000O00.OooO00o.OooOoo0(objArr, "<this>");
        if (i == objArr.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final void OooO0o(Object obj) {
        OooO0oo(this.f3963OooO0OO + 1);
        this.f3962OooO0O0[OooOO0(this.f3961OooO00o + this.f3963OooO0OO)] = obj;
        this.f3963OooO0OO++;
    }

    public final void OooO0oO(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f3962OooO0O0.length;
        while (i < length && it.hasNext()) {
            this.f3962OooO0O0[i] = it.next();
            i++;
        }
        int i2 = this.f3961OooO00o;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f3962OooO0O0[i3] = it.next();
        }
        this.f3963OooO0OO = collection.size() + this.f3963OooO0OO;
    }

    public final void OooO0oo(int i) {
        if (i >= 0) {
            Object[] objArr = this.f3962OooO0O0;
            if (i <= objArr.length) {
                return;
            }
            if (objArr == f3960OooO0Oo) {
                if (i < 10) {
                    i = 10;
                }
                this.f3962OooO0O0 = new Object[i];
                return;
            }
            int length = objArr.length;
            int i2 = length + (length >> 1);
            if (i2 - i < 0) {
                i2 = i;
            }
            if (i2 - 2147483639 > 0) {
                if (i > 2147483639) {
                    i2 = Integer.MAX_VALUE;
                } else {
                    i2 = 2147483639;
                }
            }
            Object[] objArr2 = new Object[i2];
            OooOOOO.oo0o0O0(objArr, objArr2, 0, this.f3961OooO00o, objArr.length);
            Object[] objArr3 = this.f3962OooO0O0;
            int length2 = objArr3.length;
            int i3 = this.f3961OooO00o;
            OooOOOO.oo0o0O0(objArr3, objArr2, length2 - i3, 0, i3);
            this.f3961OooO00o = 0;
            this.f3962OooO0O0 = objArr2;
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    public final int OooOO0(int i) {
        Object[] objArr = this.f3962OooO0O0;
        return i >= objArr.length ? i - objArr.length : i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        o0ooOO0.OooOOO0.OooO0Oo(i, this.f3963OooO0OO);
        int i2 = this.f3963OooO0OO;
        if (i == i2) {
            OooO0o(obj);
            return;
        }
        int i3 = i2 + 1;
        if (i == 0) {
            OooO0oo(i3);
            int i4 = this.f3961OooO00o;
            if (i4 == 0) {
                Object[] objArr = this.f3962OooO0O0;
                o0000O00.OooO00o.OooOoo0(objArr, "<this>");
                i4 = objArr.length;
            }
            int i5 = i4 - 1;
            this.f3961OooO00o = i5;
            this.f3962OooO0O0[i5] = obj;
            this.f3963OooO0OO++;
            return;
        }
        OooO0oo(i3);
        int OooOO02 = OooOO0(this.f3961OooO00o + i);
        int i6 = this.f3963OooO0OO;
        if (i < ((i6 + 1) >> 1)) {
            if (OooOO02 == 0) {
                Object[] objArr2 = this.f3962OooO0O0;
                o0000O00.OooO00o.OooOoo0(objArr2, "<this>");
                OooOO02 = objArr2.length;
            }
            int i7 = OooOO02 - 1;
            int i8 = this.f3961OooO00o;
            if (i8 == 0) {
                Object[] objArr3 = this.f3962OooO0O0;
                o0000O00.OooO00o.OooOoo0(objArr3, "<this>");
                i8 = objArr3.length;
            }
            int i9 = i8 - 1;
            int i10 = this.f3961OooO00o;
            Object[] objArr4 = this.f3962OooO0O0;
            if (i7 >= i10) {
                objArr4[i9] = objArr4[i10];
                OooOOOO.oo0o0O0(objArr4, objArr4, i10, i10 + 1, i7 + 1);
            } else {
                OooOOOO.oo0o0O0(objArr4, objArr4, i10 - 1, i10, objArr4.length);
                Object[] objArr5 = this.f3962OooO0O0;
                objArr5[objArr5.length - 1] = objArr5[0];
                OooOOOO.oo0o0O0(objArr5, objArr5, 0, 1, i7 + 1);
            }
            this.f3962OooO0O0[i7] = obj;
            this.f3961OooO00o = i9;
        } else {
            int OooOO03 = OooOO0(this.f3961OooO00o + i6);
            Object[] objArr6 = this.f3962OooO0O0;
            if (OooOO02 < OooOO03) {
                OooOOOO.oo0o0O0(objArr6, objArr6, OooOO02 + 1, OooOO02, OooOO03);
            } else {
                OooOOOO.oo0o0O0(objArr6, objArr6, 1, 0, OooOO03);
                Object[] objArr7 = this.f3962OooO0O0;
                objArr7[0] = objArr7[objArr7.length - 1];
                OooOOOO.oo0o0O0(objArr7, objArr7, OooOO02 + 1, OooOO02, objArr7.length - 1);
            }
            this.f3962OooO0O0[OooOO02] = obj;
        }
        this.f3963OooO0OO++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        o0000O00.OooO00o.OooOoo0(collection, "elements");
        o0ooOO0.OooOOO0.OooO0Oo(i, this.f3963OooO0OO);
        if (collection.isEmpty()) {
            return false;
        }
        int i2 = this.f3963OooO0OO;
        if (i == i2) {
            return addAll(collection);
        }
        OooO0oo(collection.size() + i2);
        int OooOO02 = OooOO0(this.f3961OooO00o + this.f3963OooO0OO);
        int OooOO03 = OooOO0(this.f3961OooO00o + i);
        int size = collection.size();
        if (i < ((this.f3963OooO0OO + 1) >> 1)) {
            int i3 = this.f3961OooO00o;
            int i4 = i3 - size;
            if (OooOO03 < i3) {
                Object[] objArr = this.f3962OooO0O0;
                OooOOOO.oo0o0O0(objArr, objArr, i4, i3, objArr.length);
                Object[] objArr2 = this.f3962OooO0O0;
                int length = objArr2.length - size;
                if (size >= OooOO03) {
                    OooOOOO.oo0o0O0(objArr2, objArr2, length, 0, OooOO03);
                } else {
                    OooOOOO.oo0o0O0(objArr2, objArr2, length, 0, size);
                    Object[] objArr3 = this.f3962OooO0O0;
                    OooOOOO.oo0o0O0(objArr3, objArr3, 0, size, OooOO03);
                }
            } else if (i4 >= 0) {
                Object[] objArr4 = this.f3962OooO0O0;
                OooOOOO.oo0o0O0(objArr4, objArr4, i4, i3, OooOO03);
            } else {
                Object[] objArr5 = this.f3962OooO0O0;
                i4 += objArr5.length;
                int i5 = OooOO03 - i3;
                int length2 = objArr5.length - i4;
                if (length2 >= i5) {
                    OooOOOO.oo0o0O0(objArr5, objArr5, i4, i3, OooOO03);
                } else {
                    OooOOOO.oo0o0O0(objArr5, objArr5, i4, i3, i3 + length2);
                    Object[] objArr6 = this.f3962OooO0O0;
                    OooOOOO.oo0o0O0(objArr6, objArr6, 0, this.f3961OooO00o + length2, OooOO03);
                }
            }
            this.f3961OooO00o = i4;
            OooOO03 -= size;
            if (OooOO03 < 0) {
                OooOO03 += this.f3962OooO0O0.length;
            }
        } else {
            int i6 = OooOO03 + size;
            if (OooOO03 < OooOO02) {
                int i7 = size + OooOO02;
                Object[] objArr7 = this.f3962OooO0O0;
                if (i7 > objArr7.length) {
                    if (i6 >= objArr7.length) {
                        i6 -= objArr7.length;
                    } else {
                        int length3 = OooOO02 - (i7 - objArr7.length);
                        OooOOOO.oo0o0O0(objArr7, objArr7, 0, length3, OooOO02);
                        Object[] objArr8 = this.f3962OooO0O0;
                        OooOOOO.oo0o0O0(objArr8, objArr8, i6, OooOO03, length3);
                    }
                }
                OooOOOO.oo0o0O0(objArr7, objArr7, i6, OooOO03, OooOO02);
            } else {
                Object[] objArr9 = this.f3962OooO0O0;
                OooOOOO.oo0o0O0(objArr9, objArr9, size, 0, OooOO02);
                Object[] objArr10 = this.f3962OooO0O0;
                if (i6 >= objArr10.length) {
                    OooOOOO.oo0o0O0(objArr10, objArr10, i6 - objArr10.length, OooOO03, objArr10.length);
                } else {
                    OooOOOO.oo0o0O0(objArr10, objArr10, 0, objArr10.length - size, objArr10.length);
                    Object[] objArr11 = this.f3962OooO0O0;
                    OooOOOO.oo0o0O0(objArr11, objArr11, i6, OooOO03, objArr11.length - size);
                }
            }
        }
        OooO0oO(OooOO03, collection);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int OooOO02 = OooOO0(this.f3961OooO00o + this.f3963OooO0OO);
        int i = this.f3961OooO00o;
        if (i < OooOO02) {
            Object[] objArr = this.f3962OooO0O0;
            o0000O00.OooO00o.OooOoo0(objArr, "<this>");
            Arrays.fill(objArr, i, OooOO02, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f3962OooO0O0;
            Arrays.fill(objArr2, this.f3961OooO00o, objArr2.length, (Object) null);
            Object[] objArr3 = this.f3962OooO0O0;
            o0000O00.OooO00o.OooOoo0(objArr3, "<this>");
            Arrays.fill(objArr3, 0, OooOO02, (Object) null);
        }
        this.f3961OooO00o = 0;
        this.f3963OooO0OO = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        o0ooOO0.OooOOO0.OooO0OO(i, this.f3963OooO0OO);
        return this.f3962OooO0O0[OooOO0(this.f3961OooO00o + i)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int OooOO02 = OooOO0(this.f3961OooO00o + this.f3963OooO0OO);
        int i = this.f3961OooO00o;
        if (i < OooOO02) {
            while (i < OooOO02) {
                if (!o0000O00.OooO00o.OooOOO0(obj, this.f3962OooO0O0[i])) {
                    i++;
                }
            }
            return -1;
        } else if (i >= OooOO02) {
            int length = this.f3962OooO0O0.length;
            while (true) {
                if (i < length) {
                    if (o0000O00.OooO00o.OooOOO0(obj, this.f3962OooO0O0[i])) {
                        break;
                    }
                    i++;
                } else {
                    for (int i2 = 0; i2 < OooOO02; i2++) {
                        if (o0000O00.OooO00o.OooOOO0(obj, this.f3962OooO0O0[i2])) {
                            i = i2 + this.f3962OooO0O0.length;
                        }
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
        return i - this.f3961OooO00o;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (this.f3963OooO0OO == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int OooOO02 = OooOO0(this.f3961OooO00o + this.f3963OooO0OO);
        int i = this.f3961OooO00o;
        if (i < OooOO02) {
            length = OooOO02 - 1;
            if (i <= length) {
                while (!o0000O00.OooO00o.OooOOO0(obj, this.f3962OooO0O0[length])) {
                    if (length != i) {
                        length--;
                    }
                }
                return length - this.f3961OooO00o;
            }
            return -1;
        }
        if (i > OooOO02) {
            int i2 = OooOO02 - 1;
            while (true) {
                if (-1 < i2) {
                    if (o0000O00.OooO00o.OooOOO0(obj, this.f3962OooO0O0[i2])) {
                        length = i2 + this.f3962OooO0O0.length;
                        break;
                    }
                    i2--;
                } else {
                    Object[] objArr = this.f3962OooO0O0;
                    o0000O00.OooO00o.OooOoo0(objArr, "<this>");
                    length = objArr.length - 1;
                    int i3 = this.f3961OooO00o;
                    if (i3 <= length) {
                        while (!o0000O00.OooO00o.OooOOO0(obj, this.f3962OooO0O0[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                    }
                }
            }
            return length - this.f3961OooO00o;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        byte b;
        int OooOO02;
        o0000O00.OooO00o.OooOoo0(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty()) {
            if (this.f3962OooO0O0.length == 0) {
                b = 1;
            } else {
                b = 0;
            }
            if (b == 0) {
                int OooOO03 = OooOO0(this.f3961OooO00o + this.f3963OooO0OO);
                int i = this.f3961OooO00o;
                if (i < OooOO03) {
                    OooOO02 = i;
                    while (i < OooOO03) {
                        Object obj = this.f3962OooO0O0[i];
                        if (!collection.contains(obj)) {
                            this.f3962OooO0O0[OooOO02] = obj;
                            OooOO02++;
                        } else {
                            z = true;
                        }
                        i++;
                    }
                    Object[] objArr = this.f3962OooO0O0;
                    o0000O00.OooO00o.OooOoo0(objArr, "<this>");
                    Arrays.fill(objArr, OooOO02, OooOO03, (Object) null);
                } else {
                    int length = this.f3962OooO0O0.length;
                    boolean z2 = false;
                    int i2 = i;
                    while (i < length) {
                        Object[] objArr2 = this.f3962OooO0O0;
                        Object obj2 = objArr2[i];
                        objArr2[i] = null;
                        if (!collection.contains(obj2)) {
                            this.f3962OooO0O0[i2] = obj2;
                            i2++;
                        } else {
                            z2 = true;
                        }
                        i++;
                    }
                    OooOO02 = OooOO0(i2);
                    for (int i3 = 0; i3 < OooOO03; i3++) {
                        Object[] objArr3 = this.f3962OooO0O0;
                        Object obj3 = objArr3[i3];
                        objArr3[i3] = null;
                        if (!collection.contains(obj3)) {
                            this.f3962OooO0O0[OooOO02] = obj3;
                            OooOO02 = OooO(OooOO02);
                        } else {
                            z2 = true;
                        }
                    }
                    z = z2;
                }
                if (z) {
                    int i4 = OooOO02 - this.f3961OooO00o;
                    if (i4 < 0) {
                        i4 += this.f3962OooO0O0.length;
                    }
                    this.f3963OooO0OO = i4;
                }
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        byte b;
        int OooOO02;
        o0000O00.OooO00o.OooOoo0(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty()) {
            if (this.f3962OooO0O0.length == 0) {
                b = 1;
            } else {
                b = 0;
            }
            if (b == 0) {
                int OooOO03 = OooOO0(this.f3961OooO00o + this.f3963OooO0OO);
                int i = this.f3961OooO00o;
                if (i < OooOO03) {
                    OooOO02 = i;
                    while (i < OooOO03) {
                        Object obj = this.f3962OooO0O0[i];
                        if (collection.contains(obj)) {
                            this.f3962OooO0O0[OooOO02] = obj;
                            OooOO02++;
                        } else {
                            z = true;
                        }
                        i++;
                    }
                    Object[] objArr = this.f3962OooO0O0;
                    o0000O00.OooO00o.OooOoo0(objArr, "<this>");
                    Arrays.fill(objArr, OooOO02, OooOO03, (Object) null);
                } else {
                    int length = this.f3962OooO0O0.length;
                    boolean z2 = false;
                    int i2 = i;
                    while (i < length) {
                        Object[] objArr2 = this.f3962OooO0O0;
                        Object obj2 = objArr2[i];
                        objArr2[i] = null;
                        if (collection.contains(obj2)) {
                            this.f3962OooO0O0[i2] = obj2;
                            i2++;
                        } else {
                            z2 = true;
                        }
                        i++;
                    }
                    OooOO02 = OooOO0(i2);
                    for (int i3 = 0; i3 < OooOO03; i3++) {
                        Object[] objArr3 = this.f3962OooO0O0;
                        Object obj3 = objArr3[i3];
                        objArr3[i3] = null;
                        if (collection.contains(obj3)) {
                            this.f3962OooO0O0[OooOO02] = obj3;
                            OooOO02 = OooO(OooOO02);
                        } else {
                            z2 = true;
                        }
                    }
                    z = z2;
                }
                if (z) {
                    int i4 = OooOO02 - this.f3961OooO00o;
                    if (i4 < 0) {
                        i4 += this.f3962OooO0O0.length;
                    }
                    this.f3963OooO0OO = i4;
                }
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        o0ooOO0.OooOOO0.OooO0OO(i, this.f3963OooO0OO);
        int OooOO02 = OooOO0(this.f3961OooO00o + i);
        Object[] objArr = this.f3962OooO0O0;
        Object obj2 = objArr[OooOO02];
        objArr[OooOO02] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.f3963OooO0OO]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        o0000O00.OooO00o.OooOoo0(objArr, "array");
        int length = objArr.length;
        int i = this.f3963OooO0OO;
        if (length < i) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            o0000O00.OooO00o.OooOoO0(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        int OooOO02 = OooOO0(this.f3961OooO00o + this.f3963OooO0OO);
        int i2 = this.f3961OooO00o;
        if (i2 < OooOO02) {
            OooOOOO.oo0o0O0(this.f3962OooO0O0, objArr, 0, i2, OooOO02);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f3962OooO0O0;
            OooOOOO.oo0o0O0(objArr2, objArr, 0, this.f3961OooO00o, objArr2.length);
            Object[] objArr3 = this.f3962OooO0O0;
            OooOOOO.oo0o0O0(objArr3, objArr, objArr3.length - this.f3961OooO00o, 0, OooOO02);
        }
        int length2 = objArr.length;
        int i3 = this.f3963OooO0OO;
        if (length2 > i3) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        o0000O00.OooO00o.OooOoo0(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        OooO0oo(collection.size() + this.f3963OooO0OO);
        OooO0oO(OooOO0(this.f3961OooO00o + this.f3963OooO0OO), collection);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        OooO0o(obj);
        return true;
    }
}