package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class o000 extends LinkedHashMap {

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final o000 f3648OooO0O0;

    /* renamed from: OooO00o  reason: collision with root package name */
    public boolean f3649OooO00o;

    static {
        o000 o000Var = new o000();
        f3648OooO0O0 = o000Var;
        o000Var.f3649OooO00o = false;
    }

    public o000() {
        this.f3649OooO00o = true;
    }

    public static int OooO00o(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            Charset charset = o00000.f3650OooO00o;
            int length = bArr.length;
            int i = length;
            for (int i2 = 0; i2 < 0 + length; i2++) {
                i = (i * 31) + bArr[i2];
            }
            if (i == 0) {
                return 1;
            }
            return i;
        } else if (!(obj instanceof o000000)) {
            return obj.hashCode();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final void OooO0O0() {
        if (this.f3649OooO00o) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        OooO0O0();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L5e
            java.util.Map r7 = (java.util.Map) r7
            r0 = 1
            if (r6 != r7) goto Lc
        La:
            r7 = r0
            goto L5b
        Lc:
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L18
        L16:
            r7 = r1
            goto L5b
        L18:
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L20:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto La
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L37
            goto L16
        L37:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L54
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L54
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L58
        L54:
            boolean r3 = r4.equals(r3)
        L58:
            if (r3 != 0) goto L20
            goto L16
        L5b:
            if (r7 == 0) goto L5e
            r1 = r0
        L5e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.o000.equals(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += OooO00o(entry.getValue()) ^ OooO00o(entry.getKey());
        }
        return i;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        OooO0O0();
        Charset charset = o00000.f3650OooO00o;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        OooO0O0();
        for (Object obj : map.keySet()) {
            Charset charset = o00000.f3650OooO00o;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        OooO0O0();
        return super.remove(obj);
    }

    public o000(Map map) {
        super(map);
        this.f3649OooO00o = true;
    }
}