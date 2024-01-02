package o0OOO0o;

import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO0O0 implements View.OnFocusChangeListener {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f5320OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ o000oOoO f5321OooO0O0;

    public /* synthetic */ OooO0O0(o000oOoO o000oooo, int i) {
        this.f5320OooO00o = i;
        this.f5321OooO0O0 = o000oooo;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int i = this.f5320OooO00o;
        o000oOoO o000oooo = this.f5321OooO0O0;
        switch (i) {
            case 0:
                OooO0o oooO0o = (OooO0o) o000oooo;
                oooO0o.OooOo00(oooO0o.OooOo0());
                return;
            default:
                OooOo00 oooOo00 = (OooOo00) o000oooo;
                oooOo00.f5345OooOO0o = z;
                oooOo00.OooOOo0();
                if (!z) {
                    oooOo00.OooOo00(false);
                    oooOo00.OooOOO0 = false;
                    return;
                }
                return;
        }
    }
}