package com.google.gson;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class Gson$2 extends o0OOO0o {
    @Override // com.google.gson.o0OOO0o
    public final Object OooO0O0(o0000Ooo.OooOOO0 oooOOO0) {
        if (oooOOO0.OoooO0O() == 9) {
            oooOOO0.Oooo0oo();
            return null;
        }
        return Float.valueOf((float) oooOOO0.Oooo0O0());
    }

    @Override // com.google.gson.o0OOO0o
    public final void OooO0OO(o0000Ooo.OooOOO oooOOO, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            oooOOO.Oooo000();
            return;
        }
        float floatValue = number.floatValue();
        OooOOOO.OooO00o(floatValue);
        if (!(number instanceof Float)) {
            number = Float.valueOf(floatValue);
        }
        oooOOO.Oooo0o0(number);
    }
}