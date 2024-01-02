package com.google.gson.internal.bind;

import OooooOo.oO00OO0O;
import com.google.gson.OooOOOO;
import com.google.gson.o0OOO0o;
import com.google.gson.o0Oo0oo;
import o00000o0.o00oO0o;

/* loaded from: classes.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements o0Oo0oo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final oO00OO0O f3833OooO00o;

    public JsonAdapterAnnotationTypeAdapterFactory(oO00OO0O oo00oo0o) {
        this.f3833OooO00o = oo00oo0o;
    }

    public static o0OOO0o OooO0O0(oO00OO0O oo00oo0o, OooOOOO oooOOOO, o00oO0o o00oo0o, o00000O.OooO00o oooO00o) {
        o0OOO0o OooO00o2;
        Object OooO0O02 = oo00oo0o.OooO0O0(new o00oO0o(oooO00o.value())).OooO0O0();
        boolean nullSafe = oooO00o.nullSafe();
        if (OooO0O02 instanceof o0OOO0o) {
            OooO00o2 = (o0OOO0o) OooO0O02;
        } else if (OooO0O02 instanceof o0Oo0oo) {
            OooO00o2 = ((o0Oo0oo) OooO0O02).OooO00o(oooOOOO, o00oo0o);
        } else {
            throw new IllegalArgumentException("Invalid attempt to bind an instance of " + OooO0O02.getClass().getName() + " as a @JsonAdapter for " + o00oo0o.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
        }
        if (OooO00o2 != null && nullSafe) {
            return OooO00o2.OooO00o();
        }
        return OooO00o2;
    }

    @Override // com.google.gson.o0Oo0oo
    public final o0OOO0o OooO00o(OooOOOO oooOOOO, o00oO0o o00oo0o) {
        o00000O.OooO00o oooO00o = (o00000O.OooO00o) o00oo0o.f4065OooO00o.getAnnotation(o00000O.OooO00o.class);
        if (oooO00o == null) {
            return null;
        }
        return OooO0O0(this.f3833OooO00o, oooOOOO, o00oo0o, oooO00o);
    }
}