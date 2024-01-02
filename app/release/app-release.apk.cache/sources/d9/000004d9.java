package com.google.gson;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

/* loaded from: classes.dex */
public final class o0OoOo0 extends OooOo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Serializable f3942OooO00o;

    public o0OoOo0(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f3942OooO00o = bool;
    }

    public static boolean OooO0oo(o0OoOo0 o0oooo0) {
        Serializable serializable = o0oooo0.f3942OooO00o;
        if (serializable instanceof Number) {
            Number number = (Number) serializable;
            if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
                return true;
            }
        }
        return false;
    }

    public final Number OooO0o() {
        Serializable serializable = this.f3942OooO00o;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new com.google.gson.internal.OooOOO((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final String OooO0oO() {
        Serializable serializable = this.f3942OooO00o;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return OooO0o().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o0OoOo0.class != obj.getClass()) {
            return false;
        }
        o0OoOo0 o0oooo0 = (o0OoOo0) obj;
        Serializable serializable = this.f3942OooO00o;
        Serializable serializable2 = o0oooo0.f3942OooO00o;
        if (serializable == null) {
            return serializable2 == null;
        } else if (OooO0oo(this) && OooO0oo(o0oooo0)) {
            return OooO0o().longValue() == o0oooo0.OooO0o().longValue();
        } else if ((serializable instanceof Number) && (serializable2 instanceof Number)) {
            double doubleValue = OooO0o().doubleValue();
            double doubleValue2 = o0oooo0.OooO0o().doubleValue();
            if (doubleValue != doubleValue2) {
                return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
            }
            return true;
        } else {
            return serializable.equals(serializable2);
        }
    }

    public final int hashCode() {
        long doubleToLongBits;
        Serializable serializable = this.f3942OooO00o;
        if (serializable == null) {
            return 31;
        }
        if (OooO0oo(this)) {
            doubleToLongBits = OooO0o().longValue();
        } else if (!(serializable instanceof Number)) {
            return serializable.hashCode();
        } else {
            doubleToLongBits = Double.doubleToLongBits(OooO0o().doubleValue());
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public o0OoOo0(Number number) {
        Objects.requireNonNull(number);
        this.f3942OooO00o = number;
    }

    public o0OoOo0(String str) {
        Objects.requireNonNull(str);
        this.f3942OooO00o = str;
    }
}