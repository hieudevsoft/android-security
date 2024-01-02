package com.google.gson.internal.bind;

import OooOO0o.o0OoOo0;
import com.google.gson.OooOOOO;
import com.google.gson.Oooo000;
import com.google.gson.o00oO0o;
import com.google.gson.o0OOO0o;
import com.google.gson.o0Oo0oo;
import com.google.gson.o0ooOOo;
import o0000Ooo.OooOOO;
import o0000Ooo.OooOOO0;

/* loaded from: classes.dex */
public final class NumberTypeAdapter extends o0OOO0o {

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final o0Oo0oo f3840OooO0O0 = OooO0Oo();

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o0ooOOo f3841OooO00o = o00oO0o.f3940OooO0O0;

    public static o0Oo0oo OooO0Oo() {
        return new o0Oo0oo() { // from class: com.google.gson.internal.bind.NumberTypeAdapter.1
            @Override // com.google.gson.o0Oo0oo
            public final o0OOO0o OooO00o(OooOOOO oooOOOO, o00000o0.o00oO0o o00oo0o) {
                if (o00oo0o.f4065OooO00o == Number.class) {
                    return NumberTypeAdapter.this;
                }
                return null;
            }
        };
    }

    @Override // com.google.gson.o0OOO0o
    public final Object OooO0O0(OooOOO0 oooOOO0) {
        int OoooO0O2 = oooOOO0.OoooO0O();
        int OooO00o2 = o0OoOo0.OooO00o(OoooO0O2);
        if (OooO00o2 != 5 && OooO00o2 != 6) {
            if (OooO00o2 == 8) {
                oooOOO0.Oooo0oo();
                return null;
            }
            throw new Oooo000("Expecting number, got: " + OooO0O0.OooO00o.OooOO0(OoooO0O2) + "; at path " + oooOOO0.OooOooo(false));
        }
        return this.f3841OooO00o.OooO00o(oooOOO0);
    }

    @Override // com.google.gson.o0OOO0o
    public final void OooO0OO(OooOOO oooOOO, Object obj) {
        oooOOO.Oooo0o0((Number) obj);
    }
}