package com.google.gson.internal;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class Excluder implements com.google.gson.o0Oo0oo, Cloneable {

    /* renamed from: OooO0o  reason: collision with root package name */
    public static final Excluder f3764OooO0o = new Excluder();

    /* renamed from: OooO00o  reason: collision with root package name */
    public final double f3765OooO00o = -1.0d;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final int f3766OooO0O0 = 136;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final boolean f3767OooO0OO = true;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final List f3768OooO0Oo = Collections.emptyList();

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final List f3769OooO0o0 = Collections.emptyList();

    public static boolean OooO0Oo(Class cls) {
        boolean z;
        if (Enum.class.isAssignableFrom(cls)) {
            return false;
        }
        if ((cls.getModifiers() & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        if (!cls.isAnonymousClass() && !cls.isLocalClass()) {
            return false;
        }
        return true;
    }

    @Override // com.google.gson.o0Oo0oo
    public final com.google.gson.o0OOO0o OooO00o(final com.google.gson.OooOOOO oooOOOO, final o00000o0.o00oO0o o00oo0o) {
        final boolean z;
        final boolean z2;
        boolean OooO0O02 = OooO0O0(o00oo0o.f4065OooO00o);
        if (!OooO0O02) {
            OooO0OO(true);
            z = false;
        } else {
            z = true;
        }
        if (!OooO0O02) {
            OooO0OO(false);
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z && !z2) {
            return null;
        }
        return new com.google.gson.o0OOO0o() { // from class: com.google.gson.internal.Excluder.1

            /* renamed from: OooO00o  reason: collision with root package name */
            public com.google.gson.o0OOO0o f3770OooO00o;

            @Override // com.google.gson.o0OOO0o
            public final Object OooO0O0(o0000Ooo.OooOOO0 oooOOO0) {
                if (z2) {
                    oooOOO0.OoooOo0();
                    return null;
                }
                com.google.gson.o0OOO0o o0ooo0o = this.f3770OooO00o;
                if (o0ooo0o == null) {
                    o0ooo0o = oooOOOO.OooO0Oo(Excluder.this, o00oo0o);
                    this.f3770OooO00o = o0ooo0o;
                }
                return o0ooo0o.OooO0O0(oooOOO0);
            }

            @Override // com.google.gson.o0OOO0o
            public final void OooO0OO(o0000Ooo.OooOOO oooOOO, Object obj) {
                if (z) {
                    oooOOO.Oooo000();
                    return;
                }
                com.google.gson.o0OOO0o o0ooo0o = this.f3770OooO00o;
                if (o0ooo0o == null) {
                    o0ooo0o = oooOOOO.OooO0Oo(Excluder.this, o00oo0o);
                    this.f3770OooO00o = o0ooo0o;
                }
                o0ooo0o.OooO0OO(oooOOO, obj);
            }
        };
    }

    public final boolean OooO0O0(Class cls) {
        boolean z;
        if (this.f3765OooO00o != -1.0d && !OooO0o0((o00000O.OooO0OO) cls.getAnnotation(o00000O.OooO0OO.class), (o00000O.OooO0o) cls.getAnnotation(o00000O.OooO0o.class))) {
            return true;
        }
        if (!this.f3767OooO0OO) {
            boolean z2 = false;
            if (cls.isMemberClass()) {
                if ((cls.getModifiers() & 8) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    z2 = true;
                }
            }
            if (z2) {
                return true;
            }
        }
        return OooO0Oo(cls);
    }

    public final void OooO0OO(boolean z) {
        Iterator it = (z ? this.f3768OooO0Oo : this.f3769OooO0o0).iterator();
        if (it.hasNext()) {
            OooO0O0.OooO00o.OooO0oO(it.next());
            throw null;
        }
    }

    public final boolean OooO0o0(o00000O.OooO0OO oooO0OO, o00000O.OooO0o oooO0o) {
        boolean z;
        boolean z2;
        double d = this.f3765OooO00o;
        if (oooO0OO != null && d < oooO0OO.value()) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return false;
        }
        if (oooO0o != null && d >= oooO0o.value()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            return false;
        }
        return true;
    }

    public final Object clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}