package androidx.appcompat.widget;

import android.view.View;

/* loaded from: classes.dex */
public final class OooO00o implements OooOooo.o0O00000 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public boolean f2112OooO00o = false;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f2113OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ ActionBarContextView f2114OooO0OO;

    public OooO00o(ActionBarContextView actionBarContextView) {
        this.f2114OooO0OO = actionBarContextView;
    }

    @Override // OooOooo.o0O00000
    public final void OooO00o() {
        if (this.f2112OooO00o) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f2114OooO0OO;
        actionBarContextView.f2029OooO0o = null;
        super/*android.view.View*/.setVisibility(this.f2113OooO0O0);
    }

    @Override // OooOooo.o0O00000
    public final void OooO0Oo(View view) {
        this.f2112OooO00o = true;
    }

    @Override // OooOooo.o0O00000
    public final void OooO0o() {
        super/*android.view.View*/.setVisibility(0);
        this.f2112OooO00o = false;
    }
}