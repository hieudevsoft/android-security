package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class o000OOo0 extends OooO0OO implements RandomAccess {

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public static final o000OOo0 f3697OooO0Oo;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public Object[] f3698OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f3699OooO0OO;

    static {
        o000OOo0 o000ooo0 = new o000OOo0(0, new Object[0]);
        f3697OooO0Oo = o000ooo0;
        o000ooo0.f3617OooO00o = false;
    }

    public o000OOo0(int i, Object[] objArr) {
        this.f3698OooO0O0 = objArr;
        this.f3699OooO0OO = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o000000O
    public final o000000O OooO0OO(int i) {
        if (i >= this.f3699OooO0OO) {
            return new o000OOo0(this.f3699OooO0OO, Arrays.copyOf(this.f3698OooO0O0, i));
        }
        throw new IllegalArgumentException();
    }

    public final void OooO0oo(int i) {
        if (i >= 0 && i < this.f3699OooO0OO) {
            return;
        }
        StringBuilder OooO0o02 = OooO0O0.OooO00o.OooO0o0("Index:", i, ", Size:");
        OooO0o02.append(this.f3699OooO0OO);
        throw new IndexOutOfBoundsException(OooO0o02.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        OooO0o();
        if (i < 0 || i > (i2 = this.f3699OooO0OO)) {
            StringBuilder OooO0o02 = OooO0O0.OooO00o.OooO0o0("Index:", i, ", Size:");
            OooO0o02.append(this.f3699OooO0OO);
            throw new IndexOutOfBoundsException(OooO0o02.toString());
        }
        Object[] objArr = this.f3698OooO0O0;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f3698OooO0O0, i, objArr2, i + 1, this.f3699OooO0OO - i);
            this.f3698OooO0O0 = objArr2;
        }
        this.f3698OooO0O0[i] = obj;
        this.f3699OooO0OO++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        OooO0oo(i);
        return this.f3698OooO0O0[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        OooO0o();
        OooO0oo(i);
        Object[] objArr = this.f3698OooO0O0;
        Object obj = objArr[i];
        if (i < this.f3699OooO0OO - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f3699OooO0OO--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        OooO0o();
        OooO0oo(i);
        Object[] objArr = this.f3698OooO0O0;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3699OooO0OO;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.OooO0OO, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        OooO0o();
        int i = this.f3699OooO0OO;
        Object[] objArr = this.f3698OooO0O0;
        if (i == objArr.length) {
            this.f3698OooO0O0 = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f3698OooO0O0;
        int i2 = this.f3699OooO0OO;
        this.f3699OooO0OO = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}