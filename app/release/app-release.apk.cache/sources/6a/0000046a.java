package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class OooOOO0 implements OooOOO {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final OooO00o f3753OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final /* synthetic */ OooOOO0[] f3754OooO0O0;

    static {
        OooO00o oooO00o = new OooO00o();
        f3753OooO00o = oooO00o;
        f3754OooO0O0 = new OooOOO0[]{oooO00o, new OooOOO0() { // from class: com.google.gson.OooO0O0
            @Override // com.google.gson.OooOOO
            public final String OooO00o(Field field) {
                return OooOOO0.OooO0OO(field.getName());
            }
        }, new OooOOO0() { // from class: com.google.gson.OooO0OO
            @Override // com.google.gson.OooOOO
            public final String OooO00o(Field field) {
                return OooOOO0.OooO0OO(OooOOO0.OooO0O0(field.getName(), ' '));
            }
        }, new OooOOO0() { // from class: com.google.gson.OooO0o
            @Override // com.google.gson.OooOOO
            public final String OooO00o(Field field) {
                return OooOOO0.OooO0O0(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        }, new OooOOO0() { // from class: com.google.gson.OooO
            @Override // com.google.gson.OooOOO
            public final String OooO00o(Field field) {
                return OooOOO0.OooO0O0(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        }, new OooOOO0() { // from class: com.google.gson.OooOO0
            @Override // com.google.gson.OooOOO
            public final String OooO00o(Field field) {
                return OooOOO0.OooO0O0(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        }, new OooOOO0() { // from class: com.google.gson.OooOO0O
            @Override // com.google.gson.OooOOO
            public final String OooO00o(Field field) {
                return OooOOO0.OooO0O0(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        }};
    }

    public OooOOO0(String str, int i) {
    }

    public static String OooO0O0(String str, char c) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(c);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static String OooO0OO(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isLetter(charAt)) {
                if (Character.isUpperCase(charAt)) {
                    return str;
                }
                char upperCase = Character.toUpperCase(charAt);
                if (i == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i) + upperCase + str.substring(i + 1);
            }
        }
        return str;
    }

    public static OooOOO0 valueOf(String str) {
        return (OooOOO0) Enum.valueOf(OooOOO0.class, str);
    }

    public static OooOOO0[] values() {
        return (OooOOO0[]) f3754OooO0O0.clone();
    }
}