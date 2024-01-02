package com.google.gson;

import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class o00oO0o implements o0ooOOo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final o00O0O f3939OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final o00Oo0 f3940OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public static final /* synthetic */ o00oO0o[] f3941OooO0OO;

    static {
        o00O0O o00o0o = new o00O0O();
        f3939OooO00o = o00o0o;
        o00Oo0 o00oo0 = new o00Oo0();
        f3940OooO0O0 = o00oo0;
        f3941OooO0OO = new o00oO0o[]{o00o0o, o00oo0, new o00oO0o() { // from class: com.google.gson.o00Ooo
            @Override // com.google.gson.o0ooOOo
            public final Number OooO00o(o0000Ooo.OooOOO0 oooOOO0) {
                String OoooO002 = oooOOO0.OoooO00();
                try {
                    return Long.valueOf(Long.parseLong(OoooO002));
                } catch (NumberFormatException unused) {
                    try {
                        Double valueOf = Double.valueOf(OoooO002);
                        if ((!valueOf.isInfinite() && !valueOf.isNaN()) || oooOOO0.f4423OooO0O0) {
                            return valueOf;
                        }
                        throw new o0000Ooo.OooOOOO("JSON forbids NaN and infinities: " + valueOf + "; at path " + oooOOO0.OooOooo(true));
                    } catch (NumberFormatException e) {
                        throw new androidx.fragment.app.o00O0O("Cannot parse " + OoooO002 + "; at path " + oooOOO0.OooOooo(true), e);
                    }
                }
            }
        }, new o00oO0o() { // from class: com.google.gson.oo000o
            @Override // com.google.gson.o0ooOOo
            public final Number OooO00o(o0000Ooo.OooOOO0 oooOOO0) {
                String OoooO002 = oooOOO0.OoooO00();
                try {
                    return new BigDecimal(OoooO002);
                } catch (NumberFormatException e) {
                    throw new androidx.fragment.app.o00O0O("Cannot parse " + OoooO002 + "; at path " + oooOOO0.OooOooo(true), e);
                }
            }
        }};
    }

    public o00oO0o(String str, int i) {
    }

    public static o00oO0o valueOf(String str) {
        return (o00oO0o) Enum.valueOf(o00oO0o.class, str);
    }

    public static o00oO0o[] values() {
        return (o00oO0o[]) f3941OooO0OO.clone();
    }
}