package com.google.gson.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* loaded from: classes.dex */
public final class Oooo0 extends AbstractMap implements Serializable {

    /* renamed from: OooO  reason: collision with root package name */
    public static final OooOOoo.o0Oo0oo f3807OooO = new OooOOoo.o0Oo0oo(3);

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Comparator f3808OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final boolean f3809OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public Oooo000 f3810OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public int f3811OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final Oooo000 f3812OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public int f3813OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public OooOo00 f3814OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public OooOo00 f3815OooO0oo;

    public Oooo0(boolean z) {
        OooOOoo.o0Oo0oo o0oo0oo = f3807OooO;
        this.f3811OooO0Oo = 0;
        this.f3813OooO0o0 = 0;
        this.f3808OooO00o = o0oo0oo;
        this.f3809OooO0O0 = z;
        this.f3812OooO0o = new Oooo000(z);
    }

    public final Oooo000 OooO00o(Object obj, boolean z) {
        int i;
        Oooo000 oooo000;
        Oooo000 oooo0002 = this.f3810OooO0OO;
        OooOOoo.o0Oo0oo o0oo0oo = f3807OooO;
        Comparator comparator = this.f3808OooO00o;
        if (oooo0002 != null) {
            Comparable comparable = comparator == o0oo0oo ? (Comparable) obj : null;
            while (true) {
                Object obj2 = oooo0002.f3821OooO0o;
                i = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (i == 0) {
                    return oooo0002;
                }
                Oooo000 oooo0003 = i < 0 ? oooo0002.f3818OooO0O0 : oooo0002.f3819OooO0OO;
                if (oooo0003 == null) {
                    break;
                }
                oooo0002 = oooo0003;
            }
        } else {
            i = 0;
        }
        if (z) {
            Oooo000 oooo0004 = this.f3812OooO0o;
            if (oooo0002 != null) {
                oooo000 = new Oooo000(this.f3809OooO0O0, oooo0002, obj, oooo0004, oooo0004.f3822OooO0o0);
                if (i < 0) {
                    oooo0002.f3818OooO0O0 = oooo000;
                } else {
                    oooo0002.f3819OooO0OO = oooo000;
                }
                OooO0OO(oooo0002, true);
            } else if (comparator == o0oo0oo && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            } else {
                oooo000 = new Oooo000(this.f3809OooO0O0, oooo0002, obj, oooo0004, oooo0004.f3822OooO0o0);
                this.f3810OooO0OO = oooo000;
            }
            this.f3811OooO0Oo++;
            this.f3813OooO0o0++;
            return oooo000;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.gson.internal.Oooo000 OooO0O0(java.util.Map.Entry r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto Ld
            com.google.gson.internal.Oooo000 r0 = r4.OooO00o(r0, r1)     // Catch: java.lang.ClassCastException -> Ld
            goto Le
        Ld:
            r0 = r2
        Le:
            if (r0 == 0) goto L1d
            java.lang.Object r3 = r0.f3824OooO0oo
            java.lang.Object r5 = r5.getValue()
            boolean r5 = java.util.Objects.equals(r3, r5)
            if (r5 == 0) goto L1d
            r1 = 1
        L1d:
            if (r1 == 0) goto L20
            r2 = r0
        L20:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.Oooo0.OooO0O0(java.util.Map$Entry):com.google.gson.internal.Oooo000");
    }

    public final void OooO0OO(Oooo000 oooo000, boolean z) {
        while (oooo000 != null) {
            Oooo000 oooo0002 = oooo000.f3818OooO0O0;
            Oooo000 oooo0003 = oooo000.f3819OooO0OO;
            int i = oooo0002 != null ? oooo0002.f3816OooO : 0;
            int i2 = oooo0003 != null ? oooo0003.f3816OooO : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                Oooo000 oooo0004 = oooo0003.f3818OooO0O0;
                Oooo000 oooo0005 = oooo0003.f3819OooO0OO;
                int i4 = (oooo0004 != null ? oooo0004.f3816OooO : 0) - (oooo0005 != null ? oooo0005.f3816OooO : 0);
                if (i4 != -1 && (i4 != 0 || z)) {
                    OooO0oO(oooo0003);
                }
                OooO0o(oooo000);
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                Oooo000 oooo0006 = oooo0002.f3818OooO0O0;
                Oooo000 oooo0007 = oooo0002.f3819OooO0OO;
                int i5 = (oooo0006 != null ? oooo0006.f3816OooO : 0) - (oooo0007 != null ? oooo0007.f3816OooO : 0);
                if (i5 != 1 && (i5 != 0 || z)) {
                    OooO0o(oooo0002);
                }
                OooO0oO(oooo000);
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                oooo000.f3816OooO = i + 1;
                if (z) {
                    return;
                }
            } else {
                oooo000.f3816OooO = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            oooo000 = oooo000.f3817OooO00o;
        }
    }

    public final void OooO0Oo(Oooo000 oooo000, boolean z) {
        Oooo000 oooo0002;
        Oooo000 oooo0003;
        int i;
        if (z) {
            Oooo000 oooo0004 = oooo000.f3822OooO0o0;
            oooo0004.f3820OooO0Oo = oooo000.f3820OooO0Oo;
            oooo000.f3820OooO0Oo.f3822OooO0o0 = oooo0004;
        }
        Oooo000 oooo0005 = oooo000.f3818OooO0O0;
        Oooo000 oooo0006 = oooo000.f3819OooO0OO;
        Oooo000 oooo0007 = oooo000.f3817OooO00o;
        int i2 = 0;
        if (oooo0005 != null && oooo0006 != null) {
            if (oooo0005.f3816OooO > oooo0006.f3816OooO) {
                do {
                    oooo0003 = oooo0005;
                    oooo0005 = oooo0005.f3819OooO0OO;
                } while (oooo0005 != null);
            } else {
                do {
                    oooo0002 = oooo0006;
                    oooo0006 = oooo0006.f3818OooO0O0;
                } while (oooo0006 != null);
                oooo0003 = oooo0002;
            }
            OooO0Oo(oooo0003, false);
            Oooo000 oooo0008 = oooo000.f3818OooO0O0;
            if (oooo0008 != null) {
                i = oooo0008.f3816OooO;
                oooo0003.f3818OooO0O0 = oooo0008;
                oooo0008.f3817OooO00o = oooo0003;
                oooo000.f3818OooO0O0 = null;
            } else {
                i = 0;
            }
            Oooo000 oooo0009 = oooo000.f3819OooO0OO;
            if (oooo0009 != null) {
                i2 = oooo0009.f3816OooO;
                oooo0003.f3819OooO0OO = oooo0009;
                oooo0009.f3817OooO00o = oooo0003;
                oooo000.f3819OooO0OO = null;
            }
            oooo0003.f3816OooO = Math.max(i, i2) + 1;
            OooO0o0(oooo000, oooo0003);
            return;
        }
        if (oooo0005 != null) {
            OooO0o0(oooo000, oooo0005);
            oooo000.f3818OooO0O0 = null;
        } else if (oooo0006 != null) {
            OooO0o0(oooo000, oooo0006);
            oooo000.f3819OooO0OO = null;
        } else {
            OooO0o0(oooo000, null);
        }
        OooO0OO(oooo0007, false);
        this.f3811OooO0Oo--;
        this.f3813OooO0o0++;
    }

    public final void OooO0o(Oooo000 oooo000) {
        Oooo000 oooo0002 = oooo000.f3818OooO0O0;
        Oooo000 oooo0003 = oooo000.f3819OooO0OO;
        Oooo000 oooo0004 = oooo0003.f3818OooO0O0;
        Oooo000 oooo0005 = oooo0003.f3819OooO0OO;
        oooo000.f3819OooO0OO = oooo0004;
        if (oooo0004 != null) {
            oooo0004.f3817OooO00o = oooo000;
        }
        OooO0o0(oooo000, oooo0003);
        oooo0003.f3818OooO0O0 = oooo000;
        oooo000.f3817OooO00o = oooo0003;
        int max = Math.max(oooo0002 != null ? oooo0002.f3816OooO : 0, oooo0004 != null ? oooo0004.f3816OooO : 0) + 1;
        oooo000.f3816OooO = max;
        oooo0003.f3816OooO = Math.max(max, oooo0005 != null ? oooo0005.f3816OooO : 0) + 1;
    }

    public final void OooO0o0(Oooo000 oooo000, Oooo000 oooo0002) {
        Oooo000 oooo0003 = oooo000.f3817OooO00o;
        oooo000.f3817OooO00o = null;
        if (oooo0002 != null) {
            oooo0002.f3817OooO00o = oooo0003;
        }
        if (oooo0003 == null) {
            this.f3810OooO0OO = oooo0002;
        } else if (oooo0003.f3818OooO0O0 == oooo000) {
            oooo0003.f3818OooO0O0 = oooo0002;
        } else {
            oooo0003.f3819OooO0OO = oooo0002;
        }
    }

    public final void OooO0oO(Oooo000 oooo000) {
        Oooo000 oooo0002 = oooo000.f3818OooO0O0;
        Oooo000 oooo0003 = oooo000.f3819OooO0OO;
        Oooo000 oooo0004 = oooo0002.f3818OooO0O0;
        Oooo000 oooo0005 = oooo0002.f3819OooO0OO;
        oooo000.f3818OooO0O0 = oooo0005;
        if (oooo0005 != null) {
            oooo0005.f3817OooO00o = oooo000;
        }
        OooO0o0(oooo000, oooo0002);
        oooo0002.f3819OooO0OO = oooo000;
        oooo000.f3817OooO00o = oooo0002;
        int max = Math.max(oooo0003 != null ? oooo0003.f3816OooO : 0, oooo0005 != null ? oooo0005.f3816OooO : 0) + 1;
        oooo000.f3816OooO = max;
        oooo0002.f3816OooO = Math.max(max, oooo0004 != null ? oooo0004.f3816OooO : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f3810OooO0OO = null;
        this.f3811OooO0Oo = 0;
        this.f3813OooO0o0++;
        Oooo000 oooo000 = this.f3812OooO0o;
        oooo000.f3822OooO0o0 = oooo000;
        oooo000.f3820OooO0Oo = oooo000;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000b A[ORIG_RETURN, RETURN] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean containsKey(java.lang.Object r2) {
        /*
            r1 = this;
            r0 = 0
            if (r2 == 0) goto L8
            com.google.gson.internal.Oooo000 r2 = r1.OooO00o(r2, r0)     // Catch: java.lang.ClassCastException -> L8
            goto L9
        L8:
            r2 = 0
        L9:
            if (r2 == 0) goto Lc
            r0 = 1
        Lc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.Oooo0.containsKey(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        OooOo00 oooOo00 = this.f3814OooO0oO;
        if (oooOo00 != null) {
            return oooOo00;
        }
        OooOo00 oooOo002 = new OooOo00(this, 0);
        this.f3814OooO0oO = oooOo002;
        return oooOo002;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            com.google.gson.internal.Oooo000 r3 = r2.OooO00o(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto Le
            java.lang.Object r0 = r3.f3824OooO0oo
        Le:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.Oooo0.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        OooOo00 oooOo00 = this.f3815OooO0oo;
        if (oooOo00 != null) {
            return oooOo00;
        }
        OooOo00 oooOo002 = new OooOo00(this, 1);
        this.f3815OooO0oo = oooOo002;
        return oooOo002;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null || this.f3809OooO0O0) {
                Oooo000 OooO00o2 = OooO00o(obj, true);
                Object obj3 = OooO00o2.f3824OooO0oo;
                OooO00o2.f3824OooO0oo = obj2;
                return obj3;
            }
            throw new NullPointerException("value == null");
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object remove(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            com.google.gson.internal.Oooo000 r3 = r2.OooO00o(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto L10
            r1 = 1
            r2.OooO0Oo(r3, r1)
        L10:
            if (r3 == 0) goto L14
            java.lang.Object r0 = r3.f3824OooO0oo
        L14:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.Oooo0.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f3811OooO0Oo;
    }
}