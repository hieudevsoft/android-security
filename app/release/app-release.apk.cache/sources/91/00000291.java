package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
public final class OooOOO0 extends OooO0oO.o00O0OOO {

    /* renamed from: OooOOO  reason: collision with root package name */
    public final /* synthetic */ Oooo000 f2122OooOOO;
    public final /* synthetic */ int OooOOO0 = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(Oooo000 oooo000, Context context, OooO0oO.o00O00O o00o00o, OooOo oooOo) {
        super(context, o00o00o, oooOo, true);
        this.f2122OooOOO = oooo000;
        this.f456OooO0oO = 8388613;
        OooO0Oo.o0000OO0 o0000oo02 = oooo000.f2151OooOo0o;
        this.f449OooO = o0000oo02;
        OooO0oO.o00O0OO0 o00o0oo0 = this.f458OooOO0;
        if (o00o0oo0 != null) {
            o00o0oo0.OooOO0(o0000oo02);
        }
    }

    @Override // OooO0oO.o00O0OOO
    public final void OooO0OO() {
        int i = this.OooOOO0;
        Oooo000 oooo000 = this.f2122OooOOO;
        switch (i) {
            case 0:
                oooo000.f2149OooOo00 = null;
                super.OooO0OO();
                return;
            default:
                OooO0oO.o00O00O o00o00o = oooo000.f2133OooO0OO;
                if (o00o00o != null) {
                    o00o00o.OooO0OO(true);
                }
                oooo000.f2147OooOOoo = null;
                super.OooO0OO();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(Oooo000 oooo000, Context context, OooO0oO.o00OO o00oo, View view) {
        super(context, o00oo, view, false);
        this.f2122OooOOO = oooo000;
        if (!o00oo.f462OooOoOO.OooO0o()) {
            View view2 = oooo000.f2130OooO;
            this.f454OooO0o = view2 == null ? (View) oooo000.f2138OooO0oo : view2;
        }
        OooO0Oo.o0000OO0 o0000oo02 = oooo000.f2151OooOo0o;
        this.f449OooO = o0000oo02;
        OooO0oO.o00O0OO0 o00o0oo0 = this.f458OooOO0;
        if (o00o0oo0 != null) {
            o00o0oo0.OooOO0(o0000oo02);
        }
    }
}