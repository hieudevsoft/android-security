package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class o0000Ooo extends OooO0OO implements o0000, RandomAccess {

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final ArrayList f3671OooO0O0;

    static {
        new o0000Ooo(10).f3617OooO00o = false;
    }

    public o0000Ooo(int i) {
        this(new ArrayList(i));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0000
    public final Object OooO00o(int i) {
        return this.f3671OooO0O0.get(i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0000
    public final o0000 OooO0O0() {
        if (this.f3617OooO00o) {
            return new oo00o(this);
        }
        return this;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o000000O
    public final o000000O OooO0OO(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f3671OooO0O0);
            return new o0000Ooo(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0000
    public final List OooO0Oo() {
        return Collections.unmodifiableList(this.f3671OooO0O0);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0000
    public final void OooO0o0(OooOo00 oooOo00) {
        OooO0o();
        this.f3671OooO0O0.add(oooOo00);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        OooO0o();
        this.f3671OooO0O0.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.OooO0OO, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        OooO0o();
        if (collection instanceof o0000) {
            collection = ((o0000) collection).OooO0Oo();
        }
        boolean addAll = this.f3671OooO0O0.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.OooO0OO, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        OooO0o();
        this.f3671OooO0O0.clear();
        ((AbstractList) this).modCount++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
        if (r5 != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        r0.set(r7, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
        if (com.google.crypto.tink.shaded.protobuf.o00O0OOO.OooO0Oo(r1.f3628OooO0Oo, r3, r1.size() + r3) != false) goto L12;
     */
    @Override // java.util.AbstractList, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(int r7) {
        /*
            r6 = this;
            java.util.ArrayList r0 = r6.f3671OooO0O0
            java.lang.Object r1 = r0.get(r7)
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto Ld
            java.lang.String r1 = (java.lang.String) r1
            goto L45
        Ld:
            boolean r2 = r1 instanceof com.google.crypto.tink.shaded.protobuf.OooOo
            if (r2 == 0) goto L2b
            com.google.crypto.tink.shaded.protobuf.OooOo r1 = (com.google.crypto.tink.shaded.protobuf.OooOo) r1
            java.lang.String r2 = r1.OooOO0o()
            com.google.crypto.tink.shaded.protobuf.OooOo00 r1 = (com.google.crypto.tink.shaded.protobuf.OooOo00) r1
            int r3 = r1.OooOOO0()
            int r4 = r1.size()
            int r4 = r4 + r3
            byte[] r1 = r1.f3628OooO0Oo
            boolean r1 = com.google.crypto.tink.shaded.protobuf.o00O0OOO.OooO0Oo(r1, r3, r4)
            if (r1 == 0) goto L44
            goto L41
        L2b:
            byte[] r1 = (byte[]) r1
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.crypto.tink.shaded.protobuf.o00000.f3650OooO00o
            r2.<init>(r1, r3)
            com.google.crypto.tink.shaded.protobuf.oo0o0O0 r3 = com.google.crypto.tink.shaded.protobuf.o00O0OOO.f3723OooO00o
            int r4 = r1.length
            r5 = 0
            int r1 = r3.OoooO(r5, r4, r1)
            if (r1 != 0) goto L3f
            r5 = 1
        L3f:
            if (r5 == 0) goto L44
        L41:
            r0.set(r7, r2)
        L44:
            r1 = r2
        L45:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.o0000Ooo.get(int):java.lang.Object");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        OooO0o();
        Object remove = this.f3671OooO0O0.remove(i);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof OooOo) {
            return ((OooOo) remove).OooOO0o();
        }
        return new String((byte[]) remove, o00000.f3650OooO00o);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        OooO0o();
        Object obj2 = this.f3671OooO0O0.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof OooOo) {
            return ((OooOo) obj2).OooOO0o();
        }
        return new String((byte[]) obj2, o00000.f3650OooO00o);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3671OooO0O0.size();
    }

    public o0000Ooo(ArrayList arrayList) {
        this.f3671OooO0O0 = arrayList;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.OooO0OO, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}