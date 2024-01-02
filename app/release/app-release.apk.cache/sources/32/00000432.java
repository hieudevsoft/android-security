package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class o000O00O implements o0O0ooO {

    /* renamed from: OooOOOO  reason: collision with root package name */
    public static final int[] f3675OooOOOO = new int[0];

    /* renamed from: OooOOOo  reason: collision with root package name */
    public static final Unsafe f3676OooOOOo = o00O0OO0.OooOOOO();

    /* renamed from: OooO  reason: collision with root package name */
    public final int f3677OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final int[] f3678OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final Object[] f3679OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final int f3680OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final int f3681OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final boolean f3682OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final OooO0O0 f3683OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final boolean f3684OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final int[] f3685OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public final int f3686OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public final o000O0Oo f3687OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public final o0000O0 f3688OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public final o000O000 f3689OooOOO;
    public final oOO00O OooOOO0;

    public o000O00O(int[] iArr, Object[] objArr, int i, int i2, OooO0O0 oooO0O0, boolean z, int[] iArr2, int i3, int i4, o000O0Oo o000o0oo, o0000O0 o0000o02, oOO00O ooo00o, o00Ooo o00ooo2, o000O000 o000o000) {
        this.f3678OooO00o = iArr;
        this.f3679OooO0O0 = objArr;
        this.f3680OooO0OO = i;
        this.f3681OooO0Oo = i2;
        this.f3682OooO0o = oooO0O0 instanceof o0O0O00;
        this.f3684OooO0oO = z;
        this.f3685OooO0oo = iArr2;
        this.f3677OooO = i3;
        this.f3686OooOO0 = i4;
        this.f3687OooOO0O = o000o0oo;
        this.f3688OooOO0o = o0000o02;
        this.OooOOO0 = ooo00o;
        this.f3683OooO0o0 = oooO0O0;
        this.f3689OooOOO = o000o000;
    }

    public static long OooOo(long j, Object obj) {
        return ((Long) o00O0OO0.OooOOO(j, obj)).longValue();
    }

    public static List OooOo00(long j, Object obj) {
        return (List) o00O0OO0.OooOOO(j, obj);
    }

    public static o000O00O OooOo0O(o00 o00Var, o000O0Oo o000o0oo, o0000O0 o0000o02, oOO00O ooo00o, o00Ooo o00ooo2, o000O000 o000o000) {
        int i;
        int charAt;
        int charAt2;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        int i6;
        int i7;
        char charAt3;
        int i8;
        char charAt4;
        int i9;
        char charAt5;
        int i10;
        char charAt6;
        int i11;
        char charAt7;
        int i12;
        char charAt8;
        int i13;
        char charAt9;
        int i14;
        char charAt10;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int objectFieldOffset;
        String str;
        Class<?> cls;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        Field Oooo00o2;
        char charAt11;
        int i27;
        int i28;
        int i29;
        Field Oooo00o3;
        Field Oooo00o4;
        int i30;
        char charAt12;
        int i31;
        char charAt13;
        int i32;
        char charAt14;
        int i33;
        char charAt15;
        char charAt16;
        int i34 = 0;
        boolean z = o00Var.OooO0Oo() == 2;
        String OooO0OO2 = o00Var.OooO0OO();
        int length = OooO0OO2.length();
        int charAt17 = OooO0OO2.charAt(0);
        if (charAt17 >= 55296) {
            int i35 = charAt17 & 8191;
            int i36 = 1;
            int i37 = 13;
            while (true) {
                i = i36 + 1;
                charAt16 = OooO0OO2.charAt(i36);
                if (charAt16 < 55296) {
                    break;
                }
                i35 |= (charAt16 & 8191) << i37;
                i37 += 13;
                i36 = i;
            }
            charAt17 = i35 | (charAt16 << i37);
        } else {
            i = 1;
        }
        int i38 = i + 1;
        int charAt18 = OooO0OO2.charAt(i);
        if (charAt18 >= 55296) {
            int i39 = charAt18 & 8191;
            int i40 = 13;
            while (true) {
                i33 = i38 + 1;
                charAt15 = OooO0OO2.charAt(i38);
                if (charAt15 < 55296) {
                    break;
                }
                i39 |= (charAt15 & 8191) << i40;
                i40 += 13;
                i38 = i33;
            }
            charAt18 = i39 | (charAt15 << i40);
            i38 = i33;
        }
        if (charAt18 == 0) {
            i6 = 0;
            charAt = 0;
            i5 = 0;
            charAt2 = 0;
            i3 = 0;
            iArr = f3675OooOOOO;
            i4 = 0;
        } else {
            int i41 = i38 + 1;
            int charAt19 = OooO0OO2.charAt(i38);
            if (charAt19 >= 55296) {
                int i42 = charAt19 & 8191;
                int i43 = 13;
                while (true) {
                    i14 = i41 + 1;
                    charAt10 = OooO0OO2.charAt(i41);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i42 |= (charAt10 & 8191) << i43;
                    i43 += 13;
                    i41 = i14;
                }
                charAt19 = i42 | (charAt10 << i43);
                i41 = i14;
            }
            int i44 = i41 + 1;
            int charAt20 = OooO0OO2.charAt(i41);
            if (charAt20 >= 55296) {
                int i45 = charAt20 & 8191;
                int i46 = 13;
                while (true) {
                    i13 = i44 + 1;
                    charAt9 = OooO0OO2.charAt(i44);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i45 |= (charAt9 & 8191) << i46;
                    i46 += 13;
                    i44 = i13;
                }
                charAt20 = i45 | (charAt9 << i46);
                i44 = i13;
            }
            int i47 = i44 + 1;
            int charAt21 = OooO0OO2.charAt(i44);
            if (charAt21 >= 55296) {
                int i48 = charAt21 & 8191;
                int i49 = 13;
                while (true) {
                    i12 = i47 + 1;
                    charAt8 = OooO0OO2.charAt(i47);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i48 |= (charAt8 & 8191) << i49;
                    i49 += 13;
                    i47 = i12;
                }
                charAt21 = i48 | (charAt8 << i49);
                i47 = i12;
            }
            int i50 = i47 + 1;
            charAt = OooO0OO2.charAt(i47);
            if (charAt >= 55296) {
                int i51 = charAt & 8191;
                int i52 = 13;
                while (true) {
                    i11 = i50 + 1;
                    charAt7 = OooO0OO2.charAt(i50);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i51 |= (charAt7 & 8191) << i52;
                    i52 += 13;
                    i50 = i11;
                }
                charAt = i51 | (charAt7 << i52);
                i50 = i11;
            }
            int i53 = i50 + 1;
            int charAt22 = OooO0OO2.charAt(i50);
            if (charAt22 >= 55296) {
                int i54 = charAt22 & 8191;
                int i55 = 13;
                while (true) {
                    i10 = i53 + 1;
                    charAt6 = OooO0OO2.charAt(i53);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i54 |= (charAt6 & 8191) << i55;
                    i55 += 13;
                    i53 = i10;
                }
                charAt22 = i54 | (charAt6 << i55);
                i53 = i10;
            }
            int i56 = i53 + 1;
            charAt2 = OooO0OO2.charAt(i53);
            if (charAt2 >= 55296) {
                int i57 = charAt2 & 8191;
                int i58 = 13;
                while (true) {
                    i9 = i56 + 1;
                    charAt5 = OooO0OO2.charAt(i56);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i57 |= (charAt5 & 8191) << i58;
                    i58 += 13;
                    i56 = i9;
                }
                charAt2 = i57 | (charAt5 << i58);
                i56 = i9;
            }
            int i59 = i56 + 1;
            int charAt23 = OooO0OO2.charAt(i56);
            if (charAt23 >= 55296) {
                int i60 = charAt23 & 8191;
                int i61 = i59;
                int i62 = 13;
                while (true) {
                    i8 = i61 + 1;
                    charAt4 = OooO0OO2.charAt(i61);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i60 |= (charAt4 & 8191) << i62;
                    i62 += 13;
                    i61 = i8;
                }
                charAt23 = i60 | (charAt4 << i62);
                i2 = i8;
            } else {
                i2 = i59;
            }
            int i63 = i2 + 1;
            int charAt24 = OooO0OO2.charAt(i2);
            if (charAt24 >= 55296) {
                int i64 = charAt24 & 8191;
                int i65 = i63;
                int i66 = 13;
                while (true) {
                    i7 = i65 + 1;
                    charAt3 = OooO0OO2.charAt(i65);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i64 |= (charAt3 & 8191) << i66;
                    i66 += 13;
                    i65 = i7;
                }
                charAt24 = i64 | (charAt3 << i66);
                i63 = i7;
            }
            i3 = (charAt19 * 2) + charAt20;
            i4 = charAt22;
            i5 = charAt24;
            i34 = charAt19;
            i38 = i63;
            int i67 = charAt21;
            iArr = new int[charAt24 + charAt2 + charAt23];
            i6 = i67;
        }
        Object[] OooO0O02 = o00Var.OooO0O0();
        Class<?> cls2 = o00Var.OooO00o().getClass();
        int[] iArr2 = new int[i4 * 3];
        Object[] objArr = new Object[i4 * 2];
        int i68 = charAt2 + i5;
        int i69 = i5;
        int i70 = i68;
        int i71 = 0;
        int i72 = 0;
        while (i38 < length) {
            int i73 = i38 + 1;
            int charAt25 = OooO0OO2.charAt(i38);
            if (charAt25 >= 55296) {
                int i74 = charAt25 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i32 = i75 + 1;
                    charAt14 = OooO0OO2.charAt(i75);
                    i15 = length;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i74 |= (charAt14 & 8191) << i76;
                    i76 += 13;
                    i75 = i32;
                    length = i15;
                }
                charAt25 = i74 | (charAt14 << i76);
                i16 = i32;
            } else {
                i15 = length;
                i16 = i73;
            }
            int i77 = i16 + 1;
            int charAt26 = OooO0OO2.charAt(i16);
            if (charAt26 >= 55296) {
                int i78 = charAt26 & 8191;
                int i79 = i77;
                int i80 = 13;
                while (true) {
                    i31 = i79 + 1;
                    charAt13 = OooO0OO2.charAt(i79);
                    i17 = i68;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i78 |= (charAt13 & 8191) << i80;
                    i80 += 13;
                    i79 = i31;
                    i68 = i17;
                }
                charAt26 = i78 | (charAt13 << i80);
                i18 = i31;
            } else {
                i17 = i68;
                i18 = i77;
            }
            int i81 = charAt26 & 255;
            int i82 = i5;
            if ((charAt26 & 1024) != 0) {
                iArr[i72] = i71;
                i72++;
            }
            boolean z2 = z;
            Unsafe unsafe = f3676OooOOOo;
            if (i81 >= 51) {
                int i83 = i18 + 1;
                int charAt27 = OooO0OO2.charAt(i18);
                if (charAt27 >= 55296) {
                    int i84 = charAt27 & 8191;
                    int i85 = i83;
                    int i86 = 13;
                    while (true) {
                        i30 = i85 + 1;
                        charAt12 = OooO0OO2.charAt(i85);
                        i19 = charAt;
                        if (charAt12 < 55296) {
                            break;
                        }
                        i84 |= (charAt12 & 8191) << i86;
                        i86 += 13;
                        i85 = i30;
                        charAt = i19;
                    }
                    charAt27 = i84 | (charAt12 << i86);
                    i28 = i30;
                } else {
                    i19 = charAt;
                    i28 = i83;
                }
                int i87 = i81 - 51;
                int i88 = i28;
                if (i87 == 9 || i87 == 17) {
                    i29 = 2;
                    objArr[((i71 / 3) * 2) + 1] = OooO0O02[i3];
                    i3++;
                } else {
                    if (i87 == 12 && (charAt17 & 1) == 1) {
                        objArr[((i71 / 3) * 2) + 1] = OooO0O02[i3];
                        i3++;
                    }
                    i29 = 2;
                }
                int i89 = charAt27 * i29;
                Object obj = OooO0O02[i89];
                if (obj instanceof Field) {
                    Oooo00o3 = (Field) obj;
                } else {
                    Oooo00o3 = Oooo00o(cls2, (String) obj);
                    OooO0O02[i89] = Oooo00o3;
                }
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(Oooo00o3);
                int i90 = i89 + 1;
                Object obj2 = OooO0O02[i90];
                if (obj2 instanceof Field) {
                    Oooo00o4 = (Field) obj2;
                } else {
                    Oooo00o4 = Oooo00o(cls2, (String) obj2);
                    OooO0O02[i90] = Oooo00o4;
                }
                str = OooO0OO2;
                cls = cls2;
                i23 = (int) unsafe.objectFieldOffset(Oooo00o4);
                i25 = i3;
                i26 = objectFieldOffset2;
                i24 = 0;
                i20 = i6;
                i21 = charAt25;
                i38 = i88;
            } else {
                i19 = charAt;
                int i91 = i3 + 1;
                Field Oooo00o5 = Oooo00o(cls2, (String) OooO0O02[i3]);
                if (i81 == 9 || i81 == 17) {
                    i20 = i6;
                    objArr[((i71 / 3) * 2) + 1] = Oooo00o5.getType();
                } else {
                    if (i81 == 27 || i81 == 49) {
                        i20 = i6;
                        i27 = i91 + 1;
                        objArr[((i71 / 3) * 2) + 1] = OooO0O02[i91];
                    } else if (i81 == 12 || i81 == 30 || i81 == 44) {
                        i20 = i6;
                        if ((charAt17 & 1) == 1) {
                            i27 = i91 + 1;
                            objArr[((i71 / 3) * 2) + 1] = OooO0O02[i91];
                        }
                    } else {
                        if (i81 == 50) {
                            int i92 = i69 + 1;
                            iArr[i69] = i71;
                            int i93 = (i71 / 3) * 2;
                            int i94 = i91 + 1;
                            objArr[i93] = OooO0O02[i91];
                            if ((charAt26 & 2048) != 0) {
                                i91 = i94 + 1;
                                objArr[i93 + 1] = OooO0O02[i94];
                                i20 = i6;
                                i69 = i92;
                            } else {
                                i69 = i92;
                                i91 = i94;
                            }
                        }
                        i20 = i6;
                    }
                    i21 = charAt25;
                    i91 = i27;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(Oooo00o5);
                    if ((charAt17 & 1) == 1 || i81 > 17) {
                        str = OooO0OO2;
                        cls = cls2;
                        i22 = i18;
                        i23 = 0;
                        i24 = 0;
                    } else {
                        int i95 = i18 + 1;
                        int charAt28 = OooO0OO2.charAt(i18);
                        if (charAt28 >= 55296) {
                            int i96 = charAt28 & 8191;
                            int i97 = 13;
                            while (true) {
                                i22 = i95 + 1;
                                charAt11 = OooO0OO2.charAt(i95);
                                if (charAt11 < 55296) {
                                    break;
                                }
                                i96 |= (charAt11 & 8191) << i97;
                                i97 += 13;
                                i95 = i22;
                            }
                            charAt28 = i96 | (charAt11 << i97);
                        } else {
                            i22 = i95;
                        }
                        int i98 = (charAt28 / 32) + (i34 * 2);
                        Object obj3 = OooO0O02[i98];
                        if (obj3 instanceof Field) {
                            Oooo00o2 = (Field) obj3;
                        } else {
                            Oooo00o2 = Oooo00o(cls2, (String) obj3);
                            OooO0O02[i98] = Oooo00o2;
                        }
                        str = OooO0OO2;
                        cls = cls2;
                        i23 = (int) unsafe.objectFieldOffset(Oooo00o2);
                        i24 = charAt28 % 32;
                    }
                    if (i81 >= 18 && i81 <= 49) {
                        iArr[i70] = objectFieldOffset;
                        i70++;
                    }
                    i25 = i91;
                    i38 = i22;
                    i26 = objectFieldOffset;
                }
                i21 = charAt25;
                objectFieldOffset = (int) unsafe.objectFieldOffset(Oooo00o5);
                if ((charAt17 & 1) == 1) {
                }
                str = OooO0OO2;
                cls = cls2;
                i22 = i18;
                i23 = 0;
                i24 = 0;
                if (i81 >= 18) {
                    iArr[i70] = objectFieldOffset;
                    i70++;
                }
                i25 = i91;
                i38 = i22;
                i26 = objectFieldOffset;
            }
            int i99 = i71 + 1;
            iArr2[i71] = i21;
            int i100 = i99 + 1;
            iArr2[i99] = ((charAt26 & 256) != 0 ? 268435456 : 0) | ((charAt26 & 512) != 0 ? 536870912 : 0) | (i81 << 20) | i26;
            i71 = i100 + 1;
            iArr2[i100] = i23 | (i24 << 20);
            i3 = i25;
            OooO0OO2 = str;
            i5 = i82;
            cls2 = cls;
            i6 = i20;
            length = i15;
            i68 = i17;
            z = z2;
            charAt = i19;
        }
        return new o000O00O(iArr2, objArr, i6, charAt, o00Var.OooO00o(), z, iArr, i5, i68, o000o0oo, o0000o02, ooo00o, o00ooo2, o000o000);
    }

    public static int OooOo0o(long j, Object obj) {
        return ((Integer) o00O0OO0.OooOOO(j, obj)).intValue();
    }

    public static Field Oooo00o(Class cls, String str) {
        Field[] declaredFields;
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            for (Field field : cls.getDeclaredFields()) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00dd, code lost:
        if (r4 != null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ef, code lost:
        if (r4 != null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f1, code lost:
        r4 = r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f6, code lost:
        r4 = 37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f8, code lost:
        r3 = (r3 * 53) + r4;
     */
    @Override // com.google.crypto.tink.shaded.protobuf.o0O0ooO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int OooO(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.o000O00O.OooO(java.lang.Object):int");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0O0ooO
    public final void OooO00o(Object obj, byte[] bArr, int i, int i2, OooO oooO) {
        if (this.f3684OooO0oO) {
            OooOoo0(obj, bArr, i, i2, oooO);
        } else {
            OooOoOO(obj, bArr, i, i2, 0, oooO);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0O0ooO
    public final boolean OooO0O0(Object obj) {
        int i;
        boolean z;
        boolean z2;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean z3 = true;
            if (i3 >= this.f3677OooO) {
                return true;
            }
            int i5 = this.f3685OooO0oo[i3];
            int[] iArr = this.f3678OooO00o;
            int i6 = iArr[i5];
            int Oooo0o02 = Oooo0o0(i5);
            boolean z4 = this.f3684OooO0oO;
            if (!z4) {
                int i7 = iArr[i5 + 2];
                int i8 = i7 & 1048575;
                i = 1 << (i7 >>> 20);
                if (i8 != i2) {
                    i4 = f3676OooOOOo.getInt(obj, i8);
                    i2 = i8;
                }
            } else {
                i = 0;
            }
            if ((268435456 & Oooo0o02) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (z4) {
                    z2 = OooOOo(i5, obj);
                } else if ((i4 & i) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    return false;
                }
            }
            int i9 = (267386880 & Oooo0o02) >>> 20;
            if (i9 != 9 && i9 != 17) {
                if (i9 != 27) {
                    if (i9 != 60 && i9 != 68) {
                        if (i9 != 49) {
                            if (i9 != 50) {
                                continue;
                            } else {
                                Object OooOOO2 = o00O0OO0.OooOOO(Oooo0o02 & 1048575, obj);
                                this.f3689OooOOO.getClass();
                                if (!((o000) OooOOO2).isEmpty()) {
                                    OooO0O0.OooO00o.OooO0oO(OooOOO(i5));
                                    throw null;
                                }
                            }
                        }
                    } else if (OooOOoo(i6, i5, obj) && !OooOOOO(i5).OooO0O0(o00O0OO0.OooOOO(Oooo0o02 & 1048575, obj))) {
                        return false;
                    }
                }
                List list = (List) o00O0OO0.OooOOO(Oooo0o02 & 1048575, obj);
                if (!list.isEmpty()) {
                    o0O0ooO OooOOOO2 = OooOOOO(i5);
                    int i10 = 0;
                    while (true) {
                        if (i10 >= list.size()) {
                            break;
                        } else if (!OooOOOO2.OooO0O0(list.get(i10))) {
                            z3 = false;
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                if (!z3) {
                    return false;
                }
            } else {
                if (z4) {
                    z3 = OooOOo(i5, obj);
                } else if ((i & i4) == 0) {
                    z3 = false;
                }
                if (z3 && !OooOOOO(i5).OooO0O0(o00O0OO0.OooOOO(Oooo0o02 & 1048575, obj))) {
                    return false;
                }
            }
            i3++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0O0ooO
    public final int OooO0OO(Object obj) {
        return this.f3684OooO0oO ? OooOOo0(obj) : OooOOOo(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0O0ooO
    public final Object OooO0Oo() {
        this.f3687OooOO0O.getClass();
        return ((o0O0O00) this.f3683OooO0o0).OooO0oO(oo0o0Oo.NEW_MUTABLE_INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x048d A[Catch: all -> 0x04b7, TryCatch #5 {all -> 0x04b7, blocks: (B:39:0x0086, B:153:0x0464, B:165:0x0488, B:167:0x048d, B:169:0x0494, B:85:0x01b9, B:104:0x0254, B:105:0x025d, B:106:0x0266, B:107:0x026f, B:93:0x01f1, B:94:0x01f5, B:109:0x0286, B:95:0x01fa, B:110:0x028d, B:96:0x0204, B:114:0x02c7, B:97:0x020e, B:115:0x02d0, B:98:0x0218, B:116:0x02d9, B:99:0x0222, B:117:0x02e2, B:100:0x022c, B:118:0x02eb, B:101:0x0236, B:119:0x02f4, B:102:0x0240, B:120:0x02fd, B:103:0x024a, B:121:0x0306, B:108:0x0278, B:111:0x0296, B:112:0x02a7, B:113:0x02bd, B:122:0x030f, B:124:0x031a, B:125:0x0329, B:138:0x03c1, B:126:0x032f, B:140:0x03d8, B:151:0x045d, B:127:0x033c, B:148:0x043a, B:128:0x034a, B:132:0x0383, B:129:0x0357, B:130:0x0365, B:131:0x0372, B:133:0x0388, B:134:0x0395, B:135:0x03a2, B:137:0x03ad, B:139:0x03cb, B:141:0x03dd, B:142:0x03e7, B:143:0x03f8, B:144:0x0406, B:145:0x0413, B:146:0x0421, B:147:0x042e, B:149:0x043e, B:150:0x044e), top: B:199:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04c0 A[LOOP:3: B:183:0x04be->B:184:0x04c0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x04a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0014 A[SYNTHETIC] */
    @Override // com.google.crypto.tink.shaded.protobuf.o0O0ooO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0o(java.lang.Object r22, com.google.crypto.tink.shaded.protobuf.o00O0000 r23, com.google.crypto.tink.shaded.protobuf.o00Oo0 r24) {
        /*
            Method dump skipped, instructions count: 1376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.o000O00O.OooO0o(java.lang.Object, com.google.crypto.tink.shaded.protobuf.o00O0000, com.google.crypto.tink.shaded.protobuf.o00Oo0):void");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0O0ooO
    public final void OooO0o0(Object obj, Object obj2) {
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f3678OooO00o;
            if (i < iArr.length) {
                int Oooo0o02 = Oooo0o0(i);
                long j = Oooo0o02 & 1048575;
                int i2 = iArr[i];
                switch ((Oooo0o02 & 267386880) >>> 20) {
                    case 0:
                        if (!OooOOo(i, obj2)) {
                            break;
                        } else {
                            o00O0OO0.OooOo00(obj, j, o00O0OO0.OooOO0(j, obj2));
                            Oooo0(i, obj);
                            break;
                        }
                    case 1:
                        if (!OooOOo(i, obj2)) {
                            break;
                        } else {
                            o00O0OO0.OooOo0(obj, j, o00O0OO0.OooOO0O(j, obj2));
                            Oooo0(i, obj);
                            break;
                        }
                    case 2:
                        if (!OooOOo(i, obj2)) {
                            break;
                        }
                        o00O0OO0.OooOo0o(obj, j, o00O0OO0.OooOOO0(j, obj2));
                        Oooo0(i, obj);
                        break;
                    case 3:
                        if (!OooOOo(i, obj2)) {
                            break;
                        }
                        o00O0OO0.OooOo0o(obj, j, o00O0OO0.OooOOO0(j, obj2));
                        Oooo0(i, obj);
                        break;
                    case 4:
                        if (!OooOOo(i, obj2)) {
                            break;
                        }
                        o00O0OO0.OooOo0O(o00O0OO0.OooOO0o(j, obj2), j, obj);
                        Oooo0(i, obj);
                        break;
                    case o00000.o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                        if (!OooOOo(i, obj2)) {
                            break;
                        }
                        o00O0OO0.OooOo0o(obj, j, o00O0OO0.OooOOO0(j, obj2));
                        Oooo0(i, obj);
                        break;
                    case 6:
                        if (!OooOOo(i, obj2)) {
                            break;
                        }
                        o00O0OO0.OooOo0O(o00O0OO0.OooOO0o(j, obj2), j, obj);
                        Oooo0(i, obj);
                        break;
                    case 7:
                        if (!OooOOo(i, obj2)) {
                            break;
                        } else {
                            o00O0OO0.OooOOOo(obj, j, o00O0OO0.OooO0o(j, obj2));
                            Oooo0(i, obj);
                            break;
                        }
                    case 8:
                        if (!OooOOo(i, obj2)) {
                            break;
                        }
                        o00O0OO0.OooOo(j, obj, o00O0OO0.OooOOO(j, obj2));
                        Oooo0(i, obj);
                        break;
                    case 9:
                    case 17:
                        long Oooo0o03 = Oooo0o0(i) & 1048575;
                        if (!OooOOo(i, obj2)) {
                            break;
                        } else {
                            Object OooOOO2 = o00O0OO0.OooOOO(Oooo0o03, obj);
                            Object OooOOO3 = o00O0OO0.OooOOO(Oooo0o03, obj2);
                            if (OooOOO2 != null && OooOOO3 != null) {
                                OooOOO3 = o00000.OooO0OO(OooOOO2, OooOOO3);
                            } else if (OooOOO3 == null) {
                                break;
                            }
                            o00O0OO0.OooOo(Oooo0o03, obj, OooOOO3);
                            Oooo0(i, obj);
                            break;
                        }
                    case 10:
                        if (!OooOOo(i, obj2)) {
                            break;
                        }
                        o00O0OO0.OooOo(j, obj, o00O0OO0.OooOOO(j, obj2));
                        Oooo0(i, obj);
                        break;
                    case 11:
                        if (!OooOOo(i, obj2)) {
                            break;
                        }
                        o00O0OO0.OooOo0O(o00O0OO0.OooOO0o(j, obj2), j, obj);
                        Oooo0(i, obj);
                        break;
                    case 12:
                        if (!OooOOo(i, obj2)) {
                            break;
                        }
                        o00O0OO0.OooOo0O(o00O0OO0.OooOO0o(j, obj2), j, obj);
                        Oooo0(i, obj);
                        break;
                    case 13:
                        if (!OooOOo(i, obj2)) {
                            break;
                        }
                        o00O0OO0.OooOo0O(o00O0OO0.OooOO0o(j, obj2), j, obj);
                        Oooo0(i, obj);
                        break;
                    case 14:
                        if (!OooOOo(i, obj2)) {
                            break;
                        }
                        o00O0OO0.OooOo0o(obj, j, o00O0OO0.OooOOO0(j, obj2));
                        Oooo0(i, obj);
                        break;
                    case 15:
                        if (!OooOOo(i, obj2)) {
                            break;
                        }
                        o00O0OO0.OooOo0O(o00O0OO0.OooOO0o(j, obj2), j, obj);
                        Oooo0(i, obj);
                        break;
                    case 16:
                        if (!OooOOo(i, obj2)) {
                            break;
                        }
                        o00O0OO0.OooOo0o(obj, j, o00O0OO0.OooOOO0(j, obj2));
                        Oooo0(i, obj);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.f3688OooOO0o.OooO0O0(j, obj, obj2);
                        break;
                    case 50:
                        Class cls = o00oOoo.f3731OooO00o;
                        Object OooOOO4 = o00O0OO0.OooOOO(j, obj);
                        Object OooOOO5 = o00O0OO0.OooOOO(j, obj2);
                        this.f3689OooOOO.getClass();
                        o00O0OO0.OooOo(j, obj, o000O000.OooO0Oo(OooOOO4, OooOOO5));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!OooOOoo(i2, i, obj2)) {
                            break;
                        }
                        o00O0OO0.OooOo(j, obj, o00O0OO0.OooOOO(j, obj2));
                        Oooo0O0(i2, i, obj);
                        break;
                    case 60:
                    case 68:
                        int Oooo0o04 = Oooo0o0(i);
                        int i3 = iArr[i];
                        long j2 = Oooo0o04 & 1048575;
                        if (!OooOOoo(i3, i, obj2)) {
                            break;
                        } else {
                            Object OooOOO6 = o00O0OO0.OooOOO(j2, obj);
                            Object OooOOO7 = o00O0OO0.OooOOO(j2, obj2);
                            if (OooOOO6 != null && OooOOO7 != null) {
                                OooOOO7 = o00000.OooO0OO(OooOOO6, OooOOO7);
                            } else if (OooOOO7 == null) {
                                break;
                            }
                            o00O0OO0.OooOo(j2, obj, OooOOO7);
                            Oooo0O0(i3, i, obj);
                            break;
                        }
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!OooOOoo(i2, i, obj2)) {
                            break;
                        }
                        o00O0OO0.OooOo(j, obj, o00O0OO0.OooOOO(j, obj2));
                        Oooo0O0(i2, i, obj);
                        break;
                }
                i += 3;
            } else {
                o00oOoo.OooOoo0(this.OooOOO0, obj, obj2);
                return;
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0O0ooO
    public final void OooO0oO(Object obj) {
        int[] iArr;
        int i;
        int i2 = this.f3677OooO;
        while (true) {
            iArr = this.f3685OooO0oo;
            i = this.f3686OooOO0;
            if (i2 >= i) {
                break;
            }
            long Oooo0o02 = Oooo0o0(iArr[i2]) & 1048575;
            Object OooOOO2 = o00O0OO0.OooOOO(Oooo0o02, obj);
            if (OooOOO2 != null) {
                this.f3689OooOOO.getClass();
                ((o000) OooOOO2).f3649OooO00o = false;
                o00O0OO0.OooOo(Oooo0o02, obj, OooOOO2);
            }
            i2++;
        }
        int length = iArr.length;
        while (i < length) {
            this.f3688OooOO0o.OooO00o(iArr[i], obj);
            i++;
        }
        this.OooOOO0.getClass();
        ((o0O0O00) obj).unknownFields.f3709OooO0o0 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x039a  */
    @Override // com.google.crypto.tink.shaded.protobuf.o0O0ooO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0oo(java.lang.Object r11, o0OO00O.OooO0OO r12) {
        /*
            Method dump skipped, instructions count: 1220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.o000O00O.OooO0oo(java.lang.Object, o0OO00O.OooO0OO):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x019c, code lost:
        if (java.lang.Float.floatToIntBits(com.google.crypto.tink.shaded.protobuf.o00O0OO0.OooOO0O(r7, r11)) == java.lang.Float.floatToIntBits(com.google.crypto.tink.shaded.protobuf.o00O0OO0.OooOO0O(r7, r12))) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01b7, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.crypto.tink.shaded.protobuf.o00O0OO0.OooOO0(r7, r11)) == java.lang.Double.doubleToLongBits(com.google.crypto.tink.shaded.protobuf.o00O0OO0.OooOO0(r7, r12))) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
        if (com.google.crypto.tink.shaded.protobuf.o00oOoo.OooOoo(com.google.crypto.tink.shaded.protobuf.o00O0OO0.OooOOO(r7, r11), com.google.crypto.tink.shaded.protobuf.o00O0OO0.OooOOO(r7, r12)) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
        if (com.google.crypto.tink.shaded.protobuf.o00oOoo.OooOoo(com.google.crypto.tink.shaded.protobuf.o00O0OO0.OooOOO(r7, r11), com.google.crypto.tink.shaded.protobuf.o00O0OO0.OooOOO(r7, r12)) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
        if (com.google.crypto.tink.shaded.protobuf.o00O0OO0.OooOOO0(r7, r11) == com.google.crypto.tink.shaded.protobuf.o00O0OO0.OooOOO0(r7, r12)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0087, code lost:
        if (com.google.crypto.tink.shaded.protobuf.o00O0OO0.OooOO0o(r7, r11) == com.google.crypto.tink.shaded.protobuf.o00O0OO0.OooOO0o(r7, r12)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009b, code lost:
        if (com.google.crypto.tink.shaded.protobuf.o00O0OO0.OooOOO0(r7, r11) == com.google.crypto.tink.shaded.protobuf.o00O0OO0.OooOOO0(r7, r12)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ad, code lost:
        if (com.google.crypto.tink.shaded.protobuf.o00O0OO0.OooOO0o(r7, r11) == com.google.crypto.tink.shaded.protobuf.o00O0OO0.OooOO0o(r7, r12)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bf, code lost:
        if (com.google.crypto.tink.shaded.protobuf.o00O0OO0.OooOO0o(r7, r11) == com.google.crypto.tink.shaded.protobuf.o00O0OO0.OooOO0o(r7, r12)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d1, code lost:
        if (com.google.crypto.tink.shaded.protobuf.o00O0OO0.OooOO0o(r7, r11) == com.google.crypto.tink.shaded.protobuf.o00O0OO0.OooOO0o(r7, r12)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e7, code lost:
        if (com.google.crypto.tink.shaded.protobuf.o00oOoo.OooOoo(com.google.crypto.tink.shaded.protobuf.o00O0OO0.OooOOO(r7, r11), com.google.crypto.tink.shaded.protobuf.o00O0OO0.OooOOO(r7, r12)) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fd, code lost:
        if (com.google.crypto.tink.shaded.protobuf.o00oOoo.OooOoo(com.google.crypto.tink.shaded.protobuf.o00O0OO0.OooOOO(r7, r11), com.google.crypto.tink.shaded.protobuf.o00O0OO0.OooOOO(r7, r12)) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0113, code lost:
        if (com.google.crypto.tink.shaded.protobuf.o00oOoo.OooOoo(com.google.crypto.tink.shaded.protobuf.o00O0OO0.OooOOO(r7, r11), com.google.crypto.tink.shaded.protobuf.o00O0OO0.OooOOO(r7, r12)) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0125, code lost:
        if (com.google.crypto.tink.shaded.protobuf.o00O0OO0.OooO0o(r7, r11) == com.google.crypto.tink.shaded.protobuf.o00O0OO0.OooO0o(r7, r12)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0137, code lost:
        if (com.google.crypto.tink.shaded.protobuf.o00O0OO0.OooOO0o(r7, r11) == com.google.crypto.tink.shaded.protobuf.o00O0OO0.OooOO0o(r7, r12)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x014b, code lost:
        if (com.google.crypto.tink.shaded.protobuf.o00O0OO0.OooOOO0(r7, r11) == com.google.crypto.tink.shaded.protobuf.o00O0OO0.OooOOO0(r7, r12)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x015d, code lost:
        if (com.google.crypto.tink.shaded.protobuf.o00O0OO0.OooOO0o(r7, r11) == com.google.crypto.tink.shaded.protobuf.o00O0OO0.OooOO0o(r7, r12)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0170, code lost:
        if (com.google.crypto.tink.shaded.protobuf.o00O0OO0.OooOOO0(r7, r11) == com.google.crypto.tink.shaded.protobuf.o00O0OO0.OooOOO0(r7, r12)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0183, code lost:
        if (com.google.crypto.tink.shaded.protobuf.o00O0OO0.OooOOO0(r7, r11) == com.google.crypto.tink.shaded.protobuf.o00O0OO0.OooOOO0(r7, r12)) goto L87;
     */
    @Override // com.google.crypto.tink.shaded.protobuf.o0O0ooO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooOO0(java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.o000O00O.OooOO0(java.lang.Object, java.lang.Object):boolean");
    }

    public final boolean OooOO0O(Object obj, int i, Object obj2) {
        return OooOOo(i, obj) == OooOOo(i, obj2);
    }

    public final void OooOO0o(Object obj, int i, Object obj2) {
        int i2 = this.f3678OooO00o[i];
        if (o00O0OO0.OooOOO(Oooo0o0(i) & 1048575, obj) == null) {
            return;
        }
        OooOOO0(i);
    }

    public final Object OooOOO(int i) {
        return this.f3679OooO0O0[(i / 3) * 2];
    }

    public final void OooOOO0(int i) {
        OooO0O0.OooO00o.OooO0oO(this.f3679OooO0O0[((i / 3) * 2) + 1]);
    }

    public final o0O0ooO OooOOOO(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.f3679OooO0O0;
        o0O0ooO o0o0ooo = (o0O0ooO) objArr[i2];
        if (o0o0ooo != null) {
            return o0o0ooo;
        }
        o0O0ooO OooO00o2 = o000OO00.f3692OooO0OO.OooO00o((Class) objArr[i2 + 1]);
        objArr[i2] = OooO00o2;
        return OooO00o2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:165:0x0308, code lost:
        if ((r5 instanceof com.google.crypto.tink.shaded.protobuf.OooOo) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x030a, code lost:
        r5 = com.google.crypto.tink.shaded.protobuf.Oooo0.OoooO0O(r7, (com.google.crypto.tink.shaded.protobuf.OooOo) r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0311, code lost:
        r5 = com.google.crypto.tink.shaded.protobuf.Oooo0.Oooooo0((java.lang.String) r5, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0317, code lost:
        r3 = r5 + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009e, code lost:
        if ((r5 instanceof com.google.crypto.tink.shaded.protobuf.OooOo) != false) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int OooOOOo(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 1012
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.o000O00O.OooOOOo(java.lang.Object):int");
    }

    public final boolean OooOOo(int i, Object obj) {
        int i2;
        boolean equals;
        if (this.f3684OooO0oO) {
            int Oooo0o02 = Oooo0o0(i);
            long j = Oooo0o02 & 1048575;
            switch ((Oooo0o02 & 267386880) >>> 20) {
                case 0:
                    if (o00O0OO0.OooOO0(j, obj) == 0.0d) {
                        return false;
                    }
                    return true;
                case 1:
                    if (o00O0OO0.OooOO0O(j, obj) == 0.0f) {
                        return false;
                    }
                    return true;
                case 2:
                    if (o00O0OO0.OooOOO0(j, obj) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (o00O0OO0.OooOOO0(j, obj) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (o00O0OO0.OooOO0o(j, obj) == 0) {
                        return false;
                    }
                    return true;
                case o00000.o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                    if (o00O0OO0.OooOOO0(j, obj) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (o00O0OO0.OooOO0o(j, obj) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return o00O0OO0.OooO0o(j, obj);
                case 8:
                    Object OooOOO2 = o00O0OO0.OooOOO(j, obj);
                    if (OooOOO2 instanceof String) {
                        equals = ((String) OooOOO2).isEmpty();
                        break;
                    } else if (OooOOO2 instanceof OooOo) {
                        equals = OooOo.f3625OooO0O0.equals(OooOOO2);
                        break;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (o00O0OO0.OooOOO(j, obj) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    equals = OooOo.f3625OooO0O0.equals(o00O0OO0.OooOOO(j, obj));
                    break;
                case 11:
                    if (o00O0OO0.OooOO0o(j, obj) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (o00O0OO0.OooOO0o(j, obj) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (o00O0OO0.OooOO0o(j, obj) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (o00O0OO0.OooOOO0(j, obj) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (o00O0OO0.OooOO0o(j, obj) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (o00O0OO0.OooOOO0(j, obj) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (o00O0OO0.OooOOO(j, obj) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
            return !equals;
        }
        if ((o00O0OO0.OooOO0o(i2 & 1048575, obj) & (1 << (this.f3678OooO00o[i + 2] >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x02f7, code lost:
        if ((r2 instanceof com.google.crypto.tink.shaded.protobuf.OooOo) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02f9, code lost:
        r2 = com.google.crypto.tink.shaded.protobuf.Oooo0.OoooO0O(r5, (com.google.crypto.tink.shaded.protobuf.OooOo) r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0300, code lost:
        r2 = com.google.crypto.tink.shaded.protobuf.Oooo0.Oooooo0((java.lang.String) r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0306, code lost:
        r1 = r2 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0096, code lost:
        if ((r2 instanceof com.google.crypto.tink.shaded.protobuf.OooOo) != false) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int OooOOo0(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 1038
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.o000O00O.OooOOo0(java.lang.Object):int");
    }

    public final boolean OooOOoo(int i, int i2, Object obj) {
        if (o00O0OO0.OooOO0o(this.f3678OooO00o[i2 + 2] & 1048575, obj) == i) {
            return true;
        }
        return false;
    }

    public final void OooOo0(Object obj, int i, Object obj2) {
        long Oooo0o02 = Oooo0o0(i) & 1048575;
        Object OooOOO2 = o00O0OO0.OooOOO(Oooo0o02, obj);
        o000O000 o000o000 = this.f3689OooOOO;
        o000o000.getClass();
        if (OooOOO2 != null) {
            if (o000O000.OooO0OO(OooOOO2)) {
                Object OooO0o02 = o000O000.OooO0o0();
                o000O000.OooO0Oo(OooO0o02, OooOOO2);
                o00O0OO0.OooOo(Oooo0o02, obj, OooO0o02);
                OooOOO2 = OooO0o02;
            }
        } else {
            OooOOO2 = o000O000.OooO0o0();
            o00O0OO0.OooOo(Oooo0o02, obj, OooOOO2);
        }
        o000o000.getClass();
        o000 o000Var = (o000) OooOOO2;
        OooO0O0.OooO00o.OooO0oO(obj2);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004c, code lost:
        if (r3 == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009d, code lost:
        if (r3 == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a1, code lost:
        r4 = com.google.crypto.tink.shaded.protobuf.o00000.OooO0OO(r3, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int OooOoO(java.lang.Object r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, com.google.crypto.tink.shaded.protobuf.OooO r29) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.o000O00O.OooOoO(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, com.google.crypto.tink.shaded.protobuf.OooO):int");
    }

    public final void OooOoO0(Object obj, int i, long j) {
        Object OooOOO2 = OooOOO(i);
        Unsafe unsafe = f3676OooOOOo;
        Object object = unsafe.getObject(obj, j);
        this.f3689OooOOO.getClass();
        if (o000O000.OooO0OO(object)) {
            o000 OooO0o02 = o000O000.OooO0o0();
            o000O000.OooO0Oo(OooO0o02, object);
            unsafe.putObject(obj, j, OooO0o02);
        }
        o000O000.OooO00o(OooOOO2);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x03f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int OooOoOO(java.lang.Object r30, byte[] r31, int r32, int r33, int r34, com.google.crypto.tink.shaded.protobuf.OooO r35) {
        /*
            Method dump skipped, instructions count: 1152
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.o000O00O.OooOoOO(java.lang.Object, byte[], int, int, int, com.google.crypto.tink.shaded.protobuf.OooO):int");
    }

    public final int OooOoo(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, OooO oooO) {
        int Oooo0OO2;
        Unsafe unsafe = f3676OooOOOo;
        OooO0OO oooO0OO = (OooO0OO) ((o000000O) unsafe.getObject(obj, j2));
        boolean OooO0oO2 = oooO0OO.OooO0oO();
        o000000O o000000o2 = oooO0OO;
        if (!OooO0oO2) {
            int size = oooO0OO.size();
            o000000O OooO0OO2 = oooO0OO.OooO0OO(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j2, OooO0OO2);
            o000000o2 = OooO0OO2;
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    return OooOO0.OooOo00(bArr, i, o000000o2, oooO);
                }
                if (i5 == 1) {
                    return OooOO0.OooO0oo(i3, bArr, i, i2, o000000o2, oooO);
                }
                break;
            case 19:
            case 36:
                if (i5 == 2) {
                    return OooOO0.OooOo0o(bArr, i, o000000o2, oooO);
                }
                if (i5 == 5) {
                    return OooOO0.OooOOO(i3, bArr, i, i2, o000000o2, oooO);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    return OooOO0.OooOoOO(bArr, i, o000000o2, oooO);
                }
                if (i5 == 0) {
                    return OooOO0.Oooo0o(i3, bArr, i, i2, o000000o2, oooO);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return OooOO0.OooOoO(bArr, i, o000000o2, oooO);
                }
                if (i5 == 0) {
                    return OooOO0.Oooo0OO(i3, bArr, i, i2, o000000o2, oooO);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    return OooOO0.OooOo0O(bArr, i, o000000o2, oooO);
                }
                if (i5 == 1) {
                    return OooOO0.OooOO0o(i3, bArr, i, i2, o000000o2, oooO);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    return OooOO0.OooOo0(bArr, i, o000000o2, oooO);
                }
                if (i5 == 5) {
                    return OooOO0.OooOO0(i3, bArr, i, i2, o000000o2, oooO);
                }
                break;
            case 25:
            case 42:
                if (i5 == 2) {
                    return OooOO0.OooOOoo(bArr, i, o000000o2, oooO);
                }
                if (i5 == 0) {
                    return OooOO0.OooO0Oo(i3, bArr, i, i2, o000000o2, oooO);
                }
                break;
            case 26:
                if (i5 == 2) {
                    int i8 = ((j & 536870912) > 0L ? 1 : ((j & 536870912) == 0L ? 0 : -1));
                    o000000O o000000o3 = o000000o2;
                    return i8 == 0 ? OooOO0.OooOooo(i3, bArr, i, i2, o000000o3, oooO) : OooOO0.Oooo000(i3, bArr, i, i2, o000000o3, oooO);
                }
                break;
            case 27:
                if (i5 == 2) {
                    return OooOO0.OooOOo(OooOOOO(i6), i3, bArr, i, i2, o000000o2, oooO);
                }
                break;
            case 28:
                if (i5 == 2) {
                    return OooOO0.OooO0o(i3, bArr, i, i2, o000000o2, oooO);
                }
                break;
            case 30:
            case 44:
                if (i5 == 2) {
                    Oooo0OO2 = OooOO0.OooOoO(bArr, i, o000000o2, oooO);
                } else if (i5 == 0) {
                    Oooo0OO2 = OooOO0.Oooo0OO(i3, bArr, i, i2, o000000o2, oooO);
                }
                o0O0O00 o0o0o00 = (o0O0O00) obj;
                o00O00O o00o00o = o0o0o00.unknownFields;
                if (o00o00o == o00O00O.f3704OooO0o) {
                    o00o00o = null;
                }
                OooOOO0(i6);
                o00oOoo.OooOoO(i4, o000000o2, o00o00o, this.OooOOO0);
                if (o00o00o != null) {
                    o0o0o00.unknownFields = o00o00o;
                }
                return Oooo0OO2;
            case 33:
            case 47:
                if (i5 == 2) {
                    return OooOO0.OooOo(bArr, i, o000000o2, oooO);
                }
                if (i5 == 0) {
                    return OooOO0.OooOoo0(i3, bArr, i, i2, o000000o2, oooO);
                }
                break;
            case 34:
            case 48:
                if (i5 == 2) {
                    return OooOO0.OooOoO0(bArr, i, o000000o2, oooO);
                }
                if (i5 == 0) {
                    return OooOO0.OooOoo(i3, bArr, i, i2, o000000o2, oooO);
                }
                break;
            case 49:
                if (i5 == 3) {
                    return OooOO0.OooOOOo(OooOOOO(i6), i3, bArr, i, i2, o000000o2, oooO);
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x023c, code lost:
        if (r0 != r15) goto L125;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooOoo0(java.lang.Object r30, byte[] r31, int r32, int r33, com.google.crypto.tink.shaded.protobuf.OooO r34) {
        /*
            Method dump skipped, instructions count: 676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.o000O00O.OooOoo0(java.lang.Object, byte[], int, int, com.google.crypto.tink.shaded.protobuf.OooO):void");
    }

    public final void OooOooO(Object obj, long j, o00O0000 o00o0000, o0O0ooO o0o0ooo, o00Oo0 o00oo0) {
        o00o0000.OooOo0(this.f3688OooOO0o.OooO0OO(j, obj), o0o0ooo, o00oo0);
    }

    public final void OooOooo(Object obj, int i, o00O0000 o00o0000, o0O0ooO o0o0ooo, o00Oo0 o00oo0) {
        o00o0000.OooOo0O(this.f3688OooOO0o.OooO0OO(i & 1048575, obj), o0o0ooo, o00oo0);
    }

    public final void Oooo0(int i, Object obj) {
        if (this.f3684OooO0oO) {
            return;
        }
        int i2 = this.f3678OooO00o[i + 2];
        long j = i2 & 1048575;
        o00O0OO0.OooOo0O(o00O0OO0.OooOO0o(j, obj) | (1 << (i2 >>> 20)), j, obj);
    }

    public final void Oooo000(Object obj, int i, o00O0000 o00o0000) {
        long j;
        Object OooOO02;
        if ((536870912 & i) != 0) {
            j = i & 1048575;
            OooOO02 = o00o0000.OooOoO0();
        } else {
            int i2 = i & 1048575;
            if (this.f3682OooO0o) {
                j = i2;
                OooOO02 = o00o0000.OooOo00();
            } else {
                j = i2;
                OooOO02 = o00o0000.OooOO0();
            }
        }
        o00O0OO0.OooOo(j, obj, OooOO02);
    }

    public final void Oooo00O(Object obj, int i, o00O0000 o00o0000) {
        boolean z = (536870912 & i) != 0;
        o0000O0 o0000o02 = this.f3688OooOO0o;
        int i2 = i & 1048575;
        if (z) {
            o00o0000.OooO(o0000o02.OooO0OO(i2, obj));
        } else {
            o00o0000.Oooo0o0(o0000o02.OooO0OO(i2, obj));
        }
    }

    public final void Oooo0O0(int i, int i2, Object obj) {
        o00O0OO0.OooOo0O(i, this.f3678OooO00o[i2 + 2] & 1048575, obj);
    }

    public final int Oooo0OO(int i, int i2) {
        int[] iArr = this.f3678OooO00o;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    public final void Oooo0o(Object obj, o0OO00O.OooO0OO oooO0OO) {
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        int i7;
        List list;
        boolean z6;
        int[] iArr = this.f3678OooO00o;
        int length = iArr.length;
        int i8 = -1;
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int Oooo0o02 = Oooo0o0(i10);
            int i11 = iArr[i10];
            int i12 = (267386880 & Oooo0o02) >>> 20;
            boolean z7 = this.f3684OooO0oO;
            Unsafe unsafe = f3676OooOOOo;
            if (!z7 && i12 <= 17) {
                int i13 = iArr[i10 + 2];
                int i14 = i13 & 1048575;
                if (i14 != i8) {
                    i9 = unsafe.getInt(obj, i14);
                    i8 = i14;
                }
                i = 1 << (i13 >>> 20);
            } else {
                i = 0;
            }
            long j = Oooo0o02 & 1048575;
            switch (i12) {
                case 0:
                    if ((i & i9) != 0) {
                        oooO0OO.OooOO0(i11, o00O0OO0.OooOO0(j, obj));
                        continue;
                    }
                case 1:
                    if ((i & i9) != 0) {
                        oooO0OO.OooOOO(i11, o00O0OO0.OooOO0O(j, obj));
                    } else {
                        continue;
                    }
                case 2:
                    if ((i & i9) != 0) {
                        oooO0OO.OooOOo0(i11, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                case 3:
                    if ((i & i9) != 0) {
                        oooO0OO.OooOo(i11, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                case 4:
                    if ((i & i9) != 0) {
                        oooO0OO.OooOOOo(i11, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                case o00000.o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                    if ((i & i9) != 0) {
                        oooO0OO.OooOOO0(i11, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                case 6:
                    if ((i & i9) != 0) {
                        oooO0OO.OooOO0o(i11, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                case 7:
                    if ((i & i9) != 0) {
                        oooO0OO.OooO0oo(i11, o00O0OO0.OooO0o(j, obj));
                    } else {
                        continue;
                    }
                case 8:
                    if ((i & i9) != 0) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            Oooo0 oooo0 = (Oooo0) oooO0OO.f5302OooO0O0;
                            oooo0.o0ooOOo(i11, 2);
                            oooo0.o0ooOO0((String) object);
                        } else {
                            oooO0OO.OooO(i11, (OooOo) object);
                        }
                    } else {
                        continue;
                    }
                case 9:
                    if ((i & i9) != 0) {
                        oooO0OO.OooOOo(i11, OooOOOO(i10), unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                case 10:
                    if ((i & i9) != 0) {
                        oooO0OO.OooO(i11, (OooOo) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                case 11:
                    if ((i & i9) != 0) {
                        oooO0OO.OooOo0o(i11, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                case 12:
                    if ((i & i9) != 0) {
                        oooO0OO.OooOO0O(i11, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                case 13:
                    if ((i & i9) != 0) {
                        oooO0OO.OooOOoo(i11, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                case 14:
                    if ((i & i9) != 0) {
                        oooO0OO.OooOo00(i11, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                case 15:
                    if ((i & i9) != 0) {
                        oooO0OO.OooOo0(i11, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                case 16:
                    if ((i & i9) != 0) {
                        oooO0OO.OooOo0O(i11, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                case 17:
                    if ((i & i9) != 0) {
                        oooO0OO.OooOOOO(i11, OooOOOO(i10), unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                case 18:
                    o00oOoo.Oooo000(iArr[i10], (List) unsafe.getObject(obj, j), oooO0OO, false);
                    continue;
                case 19:
                    o00oOoo.Oooo0O0(iArr[i10], (List) unsafe.getObject(obj, j), oooO0OO, false);
                    continue;
                case 20:
                    o00oOoo.Oooo0o(iArr[i10], (List) unsafe.getObject(obj, j), oooO0OO, false);
                    continue;
                case 21:
                    o00oOoo.OoooOO0(iArr[i10], (List) unsafe.getObject(obj, j), oooO0OO, false);
                    continue;
                case 22:
                    o00oOoo.Oooo0o0(iArr[i10], (List) unsafe.getObject(obj, j), oooO0OO, false);
                    continue;
                case 23:
                    o00oOoo.Oooo0(iArr[i10], (List) unsafe.getObject(obj, j), oooO0OO, false);
                    continue;
                case 24:
                    o00oOoo.Oooo00o(iArr[i10], (List) unsafe.getObject(obj, j), oooO0OO, false);
                    continue;
                case 25:
                    o00oOoo.OooOooO(iArr[i10], (List) unsafe.getObject(obj, j), oooO0OO, false);
                    continue;
                case 26:
                    o00oOoo.OoooO0O(iArr[i10], (List) unsafe.getObject(obj, j), oooO0OO);
                    break;
                case 27:
                    o00oOoo.Oooo0oO(iArr[i10], (List) unsafe.getObject(obj, j), oooO0OO, OooOOOO(i10));
                    break;
                case 28:
                    o00oOoo.OooOooo(iArr[i10], (List) unsafe.getObject(obj, j), oooO0OO);
                    break;
                case 29:
                    z = false;
                    i2 = iArr[i10];
                    o00oOoo.OoooO(i2, (List) unsafe.getObject(obj, j), oooO0OO, z);
                    break;
                case 30:
                    z2 = false;
                    i3 = iArr[i10];
                    o00oOoo.Oooo00O(i3, (List) unsafe.getObject(obj, j), oooO0OO, z2);
                    break;
                case 31:
                    z3 = false;
                    i4 = iArr[i10];
                    o00oOoo.Oooo0oo(i4, (List) unsafe.getObject(obj, j), oooO0OO, z3);
                    break;
                case 32:
                    z4 = false;
                    i5 = iArr[i10];
                    o00oOoo.Oooo(i5, (List) unsafe.getObject(obj, j), oooO0OO, z4);
                    break;
                case 33:
                    z5 = false;
                    i6 = iArr[i10];
                    o00oOoo.OoooO00(i6, (List) unsafe.getObject(obj, j), oooO0OO, z5);
                    break;
                case 34:
                    i7 = iArr[i10];
                    list = (List) unsafe.getObject(obj, j);
                    z6 = false;
                    o00oOoo.OoooO0(i7, list, oooO0OO, z6);
                    break;
                case 35:
                    o00oOoo.Oooo000(iArr[i10], (List) unsafe.getObject(obj, j), oooO0OO, true);
                    break;
                case 36:
                    o00oOoo.Oooo0O0(iArr[i10], (List) unsafe.getObject(obj, j), oooO0OO, true);
                    break;
                case 37:
                    o00oOoo.Oooo0o(iArr[i10], (List) unsafe.getObject(obj, j), oooO0OO, true);
                    break;
                case 38:
                    o00oOoo.OoooOO0(iArr[i10], (List) unsafe.getObject(obj, j), oooO0OO, true);
                    break;
                case 39:
                    o00oOoo.Oooo0o0(iArr[i10], (List) unsafe.getObject(obj, j), oooO0OO, true);
                    break;
                case 40:
                    o00oOoo.Oooo0(iArr[i10], (List) unsafe.getObject(obj, j), oooO0OO, true);
                    break;
                case 41:
                    o00oOoo.Oooo00o(iArr[i10], (List) unsafe.getObject(obj, j), oooO0OO, true);
                    break;
                case 42:
                    o00oOoo.OooOooO(iArr[i10], (List) unsafe.getObject(obj, j), oooO0OO, true);
                    break;
                case 43:
                    z = true;
                    i2 = iArr[i10];
                    o00oOoo.OoooO(i2, (List) unsafe.getObject(obj, j), oooO0OO, z);
                    break;
                case 44:
                    z2 = true;
                    i3 = iArr[i10];
                    o00oOoo.Oooo00O(i3, (List) unsafe.getObject(obj, j), oooO0OO, z2);
                    break;
                case 45:
                    z3 = true;
                    i4 = iArr[i10];
                    o00oOoo.Oooo0oo(i4, (List) unsafe.getObject(obj, j), oooO0OO, z3);
                    break;
                case 46:
                    z4 = true;
                    i5 = iArr[i10];
                    o00oOoo.Oooo(i5, (List) unsafe.getObject(obj, j), oooO0OO, z4);
                    break;
                case 47:
                    z5 = true;
                    i6 = iArr[i10];
                    o00oOoo.OoooO00(i6, (List) unsafe.getObject(obj, j), oooO0OO, z5);
                    break;
                case 48:
                    i7 = iArr[i10];
                    list = (List) unsafe.getObject(obj, j);
                    z6 = true;
                    o00oOoo.OoooO0(i7, list, oooO0OO, z6);
                    break;
                case 49:
                    o00oOoo.Oooo0OO(iArr[i10], (List) unsafe.getObject(obj, j), oooO0OO, OooOOOO(i10));
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        Object OooOOO2 = OooOOO(i10);
                        this.f3689OooOOO.getClass();
                        OooO0O0.OooO00o.OooO0oO(OooOOO2);
                        throw null;
                    }
                    break;
                case 51:
                    if (OooOOoo(i11, i10, obj)) {
                        oooO0OO.OooOO0(i11, ((Double) o00O0OO0.OooOOO(j, obj)).doubleValue());
                        break;
                    }
                    break;
                case 52:
                    if (OooOOoo(i11, i10, obj)) {
                        oooO0OO.OooOOO(i11, ((Float) o00O0OO0.OooOOO(j, obj)).floatValue());
                        break;
                    }
                    break;
                case 53:
                    if (OooOOoo(i11, i10, obj)) {
                        oooO0OO.OooOOo0(i11, OooOo(j, obj));
                        break;
                    }
                    break;
                case 54:
                    if (OooOOoo(i11, i10, obj)) {
                        oooO0OO.OooOo(i11, OooOo(j, obj));
                        break;
                    }
                    break;
                case 55:
                    if (OooOOoo(i11, i10, obj)) {
                        oooO0OO.OooOOOo(i11, OooOo0o(j, obj));
                        break;
                    }
                    break;
                case 56:
                    if (OooOOoo(i11, i10, obj)) {
                        oooO0OO.OooOOO0(i11, OooOo(j, obj));
                        break;
                    }
                    break;
                case 57:
                    if (OooOOoo(i11, i10, obj)) {
                        oooO0OO.OooOO0o(i11, OooOo0o(j, obj));
                        break;
                    }
                    break;
                case 58:
                    if (OooOOoo(i11, i10, obj)) {
                        oooO0OO.OooO0oo(i11, ((Boolean) o00O0OO0.OooOOO(j, obj)).booleanValue());
                        break;
                    }
                    break;
                case 59:
                    if (OooOOoo(i11, i10, obj)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof String) {
                            Oooo0 oooo02 = (Oooo0) oooO0OO.f5302OooO0O0;
                            oooo02.o0ooOOo(i11, 2);
                            oooo02.o0ooOO0((String) object2);
                            break;
                        } else {
                            oooO0OO.OooO(i11, (OooOo) object2);
                            break;
                        }
                    }
                    break;
                case 60:
                    if (OooOOoo(i11, i10, obj)) {
                        oooO0OO.OooOOo(i11, OooOOOO(i10), unsafe.getObject(obj, j));
                        break;
                    }
                    break;
                case 61:
                    if (OooOOoo(i11, i10, obj)) {
                        oooO0OO.OooO(i11, (OooOo) unsafe.getObject(obj, j));
                        break;
                    }
                    break;
                case 62:
                    if (OooOOoo(i11, i10, obj)) {
                        oooO0OO.OooOo0o(i11, OooOo0o(j, obj));
                        break;
                    }
                    break;
                case 63:
                    if (OooOOoo(i11, i10, obj)) {
                        oooO0OO.OooOO0O(i11, OooOo0o(j, obj));
                        break;
                    }
                    break;
                case 64:
                    if (OooOOoo(i11, i10, obj)) {
                        oooO0OO.OooOOoo(i11, OooOo0o(j, obj));
                        break;
                    }
                    break;
                case 65:
                    if (OooOOoo(i11, i10, obj)) {
                        oooO0OO.OooOo00(i11, OooOo(j, obj));
                        break;
                    }
                    break;
                case 66:
                    if (OooOOoo(i11, i10, obj)) {
                        oooO0OO.OooOo0(i11, OooOo0o(j, obj));
                        break;
                    }
                    break;
                case 67:
                    if (OooOOoo(i11, i10, obj)) {
                        oooO0OO.OooOo0O(i11, OooOo(j, obj));
                        break;
                    }
                    break;
                case 68:
                    if (OooOOoo(i11, i10, obj)) {
                        oooO0OO.OooOOOO(i11, OooOOOO(i10), unsafe.getObject(obj, j));
                        break;
                    }
                    break;
            }
        }
        this.OooOOO0.getClass();
        ((o0O0O00) obj).unknownFields.OooO0Oo(oooO0OO);
    }

    public final int Oooo0o0(int i) {
        return this.f3678OooO00o[i + 1];
    }
}