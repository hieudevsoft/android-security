package com.google.crypto.tink.shaded.protobuf;

import java.io.Serializable;

/* loaded from: classes.dex */
public enum o00000OO {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(OooOo.class, OooOo.f3625OooO0O0),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);
    

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Object f3664OooO00o;

    o00000OO(Class cls, Serializable serializable) {
        this.f3664OooO00o = serializable;
    }
}