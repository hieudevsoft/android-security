package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import o000oOoO.o000000;
import o000oOoO.o000O0O0;

/* loaded from: classes.dex */
public final class OooOOOO extends LinearLayoutManager {

    /* renamed from: OooOooo  reason: collision with root package name */
    public final /* synthetic */ int f3385OooOooo;

    /* renamed from: Oooo000  reason: collision with root package name */
    public final /* synthetic */ Oooo000 f3386Oooo000;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(Oooo000 oooo000, int i, int i2) {
        super(i);
        this.f3386Oooo000 = oooo000;
        this.f3385OooOooo = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void o0Oo0oo(o000O0O0 o000o0o0, int[] iArr) {
        int i = this.f3385OooOooo;
        Oooo000 oooo000 = this.f3386Oooo000;
        if (i == 0) {
            iArr[0] = oooo000.OoooOoO.getWidth();
            iArr[1] = oooo000.OoooOoO.getWidth();
            return;
        }
        iArr[0] = oooo000.OoooOoO.getHeight();
        iArr[1] = oooo000.OoooOoO.getHeight();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o000oOoO.o000OO
    public final void o0ooOOo(RecyclerView recyclerView, int i) {
        o000000 o000000Var = new o000000(this, recyclerView.getContext(), 2);
        o000000Var.f5175OooO00o = i;
        o0ooOoO(o000000Var);
    }
}