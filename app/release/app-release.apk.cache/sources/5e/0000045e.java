package com.google.gson;

/* loaded from: classes.dex */
class Gson$3 extends o0OOO0o {
    @Override // com.google.gson.o0OOO0o
    public final Object OooO0O0(o0000Ooo.OooOOO0 oooOOO0) {
        if (oooOOO0.OoooO0O() == 9) {
            oooOOO0.Oooo0oo();
            return null;
        }
        return Long.valueOf(oooOOO0.Oooo0o0());
    }

    @Override // com.google.gson.o0OOO0o
    public final void OooO0OO(o0000Ooo.OooOOO oooOOO, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            oooOOO.Oooo000();
        } else {
            oooOOO.Oooo0o(number.toString());
        }
    }
}