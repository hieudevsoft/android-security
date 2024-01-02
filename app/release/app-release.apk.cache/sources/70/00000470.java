package com.google.gson;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class TypeAdapter$1 extends o0OOO0o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ o0OOO0o f3763OooO00o;

    public TypeAdapter$1(o0OOO0o o0ooo0o) {
        this.f3763OooO00o = o0ooo0o;
    }

    @Override // com.google.gson.o0OOO0o
    public final Object OooO0O0(o0000Ooo.OooOOO0 oooOOO0) {
        if (oooOOO0.OoooO0O() == 9) {
            oooOOO0.Oooo0oo();
            return null;
        }
        return this.f3763OooO00o.OooO0O0(oooOOO0);
    }

    @Override // com.google.gson.o0OOO0o
    public final void OooO0OO(o0000Ooo.OooOOO oooOOO, Object obj) {
        if (obj == null) {
            oooOOO.Oooo000();
        } else {
            this.f3763OooO00o.OooO0OO(oooOOO, obj);
        }
    }
}