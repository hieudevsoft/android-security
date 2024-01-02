package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class o000OO00 {

    /* renamed from: OooO0OO  reason: collision with root package name */
    public static final o000OO00 f3692OooO0OO = new o000OO00();

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final ConcurrentHashMap f3694OooO0O0 = new ConcurrentHashMap();

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o0000OO0 f3693OooO00o = new o0000OO0();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.google.crypto.tink.shaded.protobuf.o000O0] */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.google.crypto.tink.shaded.protobuf.o000O0] */
    public final o0O0ooO OooO00o(Class cls) {
        boolean z;
        o000O0Oo o000o0oo;
        o0000O0 o0000o02;
        oOO00O ooo00o;
        o00Ooo o00ooo2;
        o000O000 o000o000;
        o000O00O OooOo0O2;
        o000O00O o000o00o;
        Class cls2;
        Charset charset = o00000.f3650OooO00o;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = this.f3694OooO0O0;
            o0O0ooO o0o0ooo = (o0O0ooO) concurrentHashMap.get(cls);
            if (o0o0ooo == null) {
                o0000OO0 o0000oo02 = this.f3693OooO00o;
                o0000oo02.getClass();
                Class cls3 = o00oOoo.f3731OooO00o;
                if (!o0O0O00.class.isAssignableFrom(cls) && (cls2 = o00oOoo.f3731OooO00o) != null && !cls2.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                }
                o000Oo0 OooO0O02 = o0000oo02.f3670OooO00o.OooO0O0(cls);
                o00 o00Var = (o00) OooO0O02;
                boolean z2 = true;
                if ((o00Var.f3647OooO0Oo & 2) == 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    boolean isAssignableFrom = o0O0O00.class.isAssignableFrom(cls);
                    OooO0O0 oooO0O0 = o00Var.f3644OooO00o;
                    if (isAssignableFrom) {
                        o000o00o = new o000O0(o00oOoo.f3734OooO0Oo, oo000o.f3739OooO00o, oooO0O0);
                    } else {
                        oOO00O ooo00o2 = o00oOoo.f3732OooO0O0;
                        o00Ooo o00ooo3 = oo000o.f3740OooO0O0;
                        if (o00ooo3 != null) {
                            o000o00o = new o000O0(ooo00o2, o00ooo3, oooO0O0);
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    }
                    OooOo0O2 = o000o00o;
                } else {
                    if (o0O0O00.class.isAssignableFrom(cls)) {
                        if (o00Var.OooO0Oo() != 1) {
                            z2 = false;
                        }
                        if (z2) {
                            o000o0oo = o000OO0O.f3696OooO0O0;
                            o0000o02 = o0000O0.f3667OooO0O0;
                            ooo00o = o00oOoo.f3734OooO0Oo;
                            o00ooo2 = oo000o.f3739OooO00o;
                        } else {
                            o000o0oo = o000OO0O.f3696OooO0O0;
                            o0000o02 = o0000O0.f3667OooO0O0;
                            ooo00o = o00oOoo.f3734OooO0Oo;
                            o00ooo2 = null;
                        }
                        o000o000 = o000O0o.f3691OooO0O0;
                    } else {
                        if (o00Var.OooO0Oo() != 1) {
                            z2 = false;
                        }
                        if (z2) {
                            o000o0oo = o000OO0O.f3695OooO00o;
                            o0000o02 = o0000O0.f3666OooO00o;
                            oOO00O ooo00o3 = o00oOoo.f3732OooO0O0;
                            o00Ooo o00ooo4 = oo000o.f3740OooO0O0;
                            if (o00ooo4 != null) {
                                ooo00o = ooo00o3;
                                o00ooo2 = o00ooo4;
                            } else {
                                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                            }
                        } else {
                            o000o0oo = o000OO0O.f3695OooO00o;
                            o0000o02 = o0000O0.f3666OooO00o;
                            ooo00o = o00oOoo.f3733OooO0OO;
                            o00ooo2 = null;
                        }
                        o000o000 = o000O0o.f3690OooO00o;
                    }
                    o000O0Oo o000o0oo2 = o000o0oo;
                    o0000O0 o0000o03 = o0000o02;
                    oOO00O ooo00o4 = ooo00o;
                    o00Ooo o00ooo5 = o00ooo2;
                    o000O000 o000o0002 = o000o000;
                    int[] iArr = o000O00O.f3675OooOOOO;
                    if (OooO0O02 instanceof o00) {
                        OooOo0O2 = o000O00O.OooOo0O((o00) OooO0O02, o000o0oo2, o0000o03, ooo00o4, o00ooo5, o000o0002);
                    } else {
                        OooO0O0.OooO00o.OooO0oO(OooO0O02);
                        throw null;
                    }
                }
                o0O0ooO o0o0ooo2 = (o0O0ooO) concurrentHashMap.putIfAbsent(cls, OooOo0O2);
                if (o0o0ooo2 != null) {
                    return o0o0ooo2;
                }
                return OooOo0O2;
            }
            return o0o0ooo;
        }
        throw new NullPointerException("messageType");
    }
}