package com.google.crypto.tink.shaded.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum EF0 uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class o00oO0o {

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final o00oO0o f3726OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public static final o00oO0o f3727OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public static final o00oO0o[] f3728OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public static final /* synthetic */ o00oO0o[] f3729OooO0o0;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final int f3730OooO00o;
    /* JADX INFO: Fake field, exist only in values array */
    o00oO0o EF0;

    static {
        o00000OO o00000oo2 = o00000OO.DOUBLE;
        o00oO0o o00oo0o = new o00oO0o("DOUBLE", 0, 0, 1, o00000oo2);
        o00000OO o00000oo3 = o00000OO.FLOAT;
        o00oO0o o00oo0o2 = new o00oO0o("FLOAT", 1, 1, 1, o00000oo3);
        o00000OO o00000oo4 = o00000OO.LONG;
        o00oO0o o00oo0o3 = new o00oO0o("INT64", 2, 2, 1, o00000oo4);
        o00oO0o o00oo0o4 = new o00oO0o("UINT64", 3, 3, 1, o00000oo4);
        o00000OO o00000oo5 = o00000OO.INT;
        o00oO0o o00oo0o5 = new o00oO0o("INT32", 4, 4, 1, o00000oo5);
        o00oO0o o00oo0o6 = new o00oO0o("FIXED64", 5, 5, 1, o00000oo4);
        o00oO0o o00oo0o7 = new o00oO0o("FIXED32", 6, 6, 1, o00000oo5);
        o00000OO o00000oo6 = o00000OO.BOOLEAN;
        o00oO0o o00oo0o8 = new o00oO0o("BOOL", 7, 7, 1, o00000oo6);
        o00000OO o00000oo7 = o00000OO.STRING;
        o00oO0o o00oo0o9 = new o00oO0o("STRING", 8, 8, 1, o00000oo7);
        o00000OO o00000oo8 = o00000OO.MESSAGE;
        o00oO0o o00oo0o10 = new o00oO0o("MESSAGE", 9, 9, 1, o00000oo8);
        o00000OO o00000oo9 = o00000OO.BYTE_STRING;
        o00oO0o o00oo0o11 = new o00oO0o("BYTES", 10, 10, 1, o00000oo9);
        o00oO0o o00oo0o12 = new o00oO0o("UINT32", 11, 11, 1, o00000oo5);
        o00000OO o00000oo10 = o00000OO.ENUM;
        o00oO0o o00oo0o13 = new o00oO0o("ENUM", 12, 12, 1, o00000oo10);
        o00oO0o o00oo0o14 = new o00oO0o("SFIXED32", 13, 13, 1, o00000oo5);
        o00oO0o o00oo0o15 = new o00oO0o("SFIXED64", 14, 14, 1, o00000oo4);
        o00oO0o o00oo0o16 = new o00oO0o("SINT32", 15, 15, 1, o00000oo5);
        o00oO0o o00oo0o17 = new o00oO0o("SINT64", 16, 16, 1, o00000oo4);
        o00oO0o o00oo0o18 = new o00oO0o("GROUP", 17, 17, 1, o00000oo8);
        o00oO0o o00oo0o19 = new o00oO0o("DOUBLE_LIST", 18, 18, 2, o00000oo2);
        o00oO0o o00oo0o20 = new o00oO0o("FLOAT_LIST", 19, 19, 2, o00000oo3);
        o00oO0o o00oo0o21 = new o00oO0o("INT64_LIST", 20, 20, 2, o00000oo4);
        o00oO0o o00oo0o22 = new o00oO0o("UINT64_LIST", 21, 21, 2, o00000oo4);
        o00oO0o o00oo0o23 = new o00oO0o("INT32_LIST", 22, 22, 2, o00000oo5);
        o00oO0o o00oo0o24 = new o00oO0o("FIXED64_LIST", 23, 23, 2, o00000oo4);
        o00oO0o o00oo0o25 = new o00oO0o("FIXED32_LIST", 24, 24, 2, o00000oo5);
        o00oO0o o00oo0o26 = new o00oO0o("BOOL_LIST", 25, 25, 2, o00000oo6);
        o00oO0o o00oo0o27 = new o00oO0o("STRING_LIST", 26, 26, 2, o00000oo7);
        o00oO0o o00oo0o28 = new o00oO0o("MESSAGE_LIST", 27, 27, 2, o00000oo8);
        o00oO0o o00oo0o29 = new o00oO0o("BYTES_LIST", 28, 28, 2, o00000oo9);
        o00oO0o o00oo0o30 = new o00oO0o("UINT32_LIST", 29, 29, 2, o00000oo5);
        o00oO0o o00oo0o31 = new o00oO0o("ENUM_LIST", 30, 30, 2, o00000oo10);
        o00oO0o o00oo0o32 = new o00oO0o("SFIXED32_LIST", 31, 31, 2, o00000oo5);
        o00oO0o o00oo0o33 = new o00oO0o("SFIXED64_LIST", 32, 32, 2, o00000oo4);
        o00oO0o o00oo0o34 = new o00oO0o("SINT32_LIST", 33, 33, 2, o00000oo5);
        o00oO0o o00oo0o35 = new o00oO0o("SINT64_LIST", 34, 34, 2, o00000oo4);
        o00oO0o o00oo0o36 = new o00oO0o("DOUBLE_LIST_PACKED", 35, 35, 3, o00000oo2);
        f3726OooO0O0 = o00oo0o36;
        o00oO0o o00oo0o37 = new o00oO0o("FLOAT_LIST_PACKED", 36, 36, 3, o00000oo3);
        o00oO0o o00oo0o38 = new o00oO0o("INT64_LIST_PACKED", 37, 37, 3, o00000oo4);
        o00oO0o o00oo0o39 = new o00oO0o("UINT64_LIST_PACKED", 38, 38, 3, o00000oo4);
        o00oO0o o00oo0o40 = new o00oO0o("INT32_LIST_PACKED", 39, 39, 3, o00000oo5);
        o00oO0o o00oo0o41 = new o00oO0o("FIXED64_LIST_PACKED", 40, 40, 3, o00000oo4);
        o00oO0o o00oo0o42 = new o00oO0o("FIXED32_LIST_PACKED", 41, 41, 3, o00000oo5);
        o00oO0o o00oo0o43 = new o00oO0o("BOOL_LIST_PACKED", 42, 42, 3, o00000oo6);
        o00oO0o o00oo0o44 = new o00oO0o("UINT32_LIST_PACKED", 43, 43, 3, o00000oo5);
        o00oO0o o00oo0o45 = new o00oO0o("ENUM_LIST_PACKED", 44, 44, 3, o00000oo10);
        o00oO0o o00oo0o46 = new o00oO0o("SFIXED32_LIST_PACKED", 45, 45, 3, o00000oo5);
        o00oO0o o00oo0o47 = new o00oO0o("SFIXED64_LIST_PACKED", 46, 46, 3, o00000oo4);
        o00oO0o o00oo0o48 = new o00oO0o("SINT32_LIST_PACKED", 47, 47, 3, o00000oo5);
        o00oO0o o00oo0o49 = new o00oO0o("SINT64_LIST_PACKED", 48, 48, 3, o00000oo4);
        f3727OooO0OO = o00oo0o49;
        f3729OooO0o0 = new o00oO0o[]{o00oo0o, o00oo0o2, o00oo0o3, o00oo0o4, o00oo0o5, o00oo0o6, o00oo0o7, o00oo0o8, o00oo0o9, o00oo0o10, o00oo0o11, o00oo0o12, o00oo0o13, o00oo0o14, o00oo0o15, o00oo0o16, o00oo0o17, o00oo0o18, o00oo0o19, o00oo0o20, o00oo0o21, o00oo0o22, o00oo0o23, o00oo0o24, o00oo0o25, o00oo0o26, o00oo0o27, o00oo0o28, o00oo0o29, o00oo0o30, o00oo0o31, o00oo0o32, o00oo0o33, o00oo0o34, o00oo0o35, o00oo0o36, o00oo0o37, o00oo0o38, o00oo0o39, o00oo0o40, o00oo0o41, o00oo0o42, o00oo0o43, o00oo0o44, o00oo0o45, o00oo0o46, o00oo0o47, o00oo0o48, o00oo0o49, new o00oO0o("GROUP_LIST", 49, 49, 2, o00000oo8), new o00oO0o("MAP", 50, 50, 4, o00000OO.VOID)};
        o00oO0o[] values = values();
        f3728OooO0Oo = new o00oO0o[values.length];
        for (o00oO0o o00oo0o50 : values) {
            f3728OooO0Oo[o00oo0o50.f3730OooO00o] = o00oo0o50;
        }
    }

    public o00oO0o(String str, int i, int i2, int i3, o00000OO o00000oo2) {
        this.f3730OooO00o = i2;
        if (i3 == 0) {
            throw null;
        }
        int i4 = i3 - 1;
        if (i4 == 1 || i4 == 3) {
            o00000oo2.getClass();
        }
        if (i3 == 1) {
            o00000oo2.ordinal();
        }
    }

    public static o00oO0o valueOf(String str) {
        return (o00oO0o) Enum.valueOf(o00oO0o.class, str);
    }

    public static o00oO0o[] values() {
        return (o00oO0o[]) f3729OooO0o0.clone();
    }

    public final int OooO00o() {
        return this.f3730OooO00o;
    }
}