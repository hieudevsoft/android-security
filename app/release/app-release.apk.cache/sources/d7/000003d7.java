package com.google.android.material.datepicker;

import androidx.recyclerview.widget.RecyclerView;
import o000oOoO.o000OO;

/* loaded from: classes.dex */
public final class OooOOO0 implements Runnable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f3383OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ Oooo000 f3384OooO0O0;

    public OooOOO0(Oooo000 oooo000, int i) {
        this.f3384OooO0O0 = oooo000;
        this.f3383OooO00o = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o000OO o000oo;
        RecyclerView recyclerView = this.f3384OooO0O0.OoooOoO;
        if (!recyclerView.f3162OooOo0 && (o000oo = recyclerView.f3154OooOO0o) != null) {
            o000oo.o0ooOOo(recyclerView, this.f3383OooO00o);
        }
    }
}