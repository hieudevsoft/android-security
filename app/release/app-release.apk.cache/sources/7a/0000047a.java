package com.google.gson.internal;

import java.math.BigDecimal;

/* loaded from: classes.dex */
public final class OooOOO extends Number {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final String f3798OooO00o;

    public OooOOO(String str) {
        this.f3798OooO00o = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f3798OooO00o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OooOOO) {
            String str = ((OooOOO) obj).f3798OooO00o;
            String str2 = this.f3798OooO00o;
            return str2 == str || str2.equals(str);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f3798OooO00o);
    }

    public final int hashCode() {
        return this.f3798OooO00o.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f3798OooO00o;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return new BigDecimal(str).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(str);
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f3798OooO00o;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return new BigDecimal(str).longValue();
        }
    }

    public final String toString() {
        return this.f3798OooO00o;
    }
}