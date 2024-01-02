package oo000o;

import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class OooO0O0 extends OooO0O0.OooO0O0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ OooO0O0.OooO0O0 f5605OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ OooO0o f5606OooO0O0;

    public OooO0O0(OooO0o oooO0o, OooO0O0.OooO0O0 oooO0O0) {
        this.f5606OooO0O0 = oooO0o;
        this.f5605OooO00o = oooO0O0;
    }

    @Override // OooO0O0.OooO0O0
    public final void OooOO0O(int i) {
        this.f5606OooO0O0.OooOOO0 = true;
        this.f5605OooO00o.OooOO0O(i);
    }

    @Override // OooO0O0.OooO0O0
    public final void OooOO0o(Typeface typeface) {
        OooO0o oooO0o = this.f5606OooO0O0;
        oooO0o.f5623OooOOO = Typeface.create(typeface, oooO0o.f5614OooO0OO);
        oooO0o.OooOOO0 = true;
        this.f5605OooO00o.OooOOO0(oooO0o.f5623OooOOO, false);
    }
}