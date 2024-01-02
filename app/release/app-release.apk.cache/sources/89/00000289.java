package androidx.appcompat.widget;

/* loaded from: classes.dex */
public final class OooO implements Runnable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f2110OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f2111OooO0O0;

    public /* synthetic */ OooO(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f2110OooO00o = i;
        this.f2111OooO0O0 = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2110OooO00o;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2111OooO0O0;
        switch (i) {
            case 0:
                actionBarOverlayLayout.OooO0oo();
                actionBarOverlayLayout.f2066OooOo0o = actionBarOverlayLayout.f2048OooO0Oo.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f2062OooOo);
                return;
            default:
                actionBarOverlayLayout.OooO0oo();
                actionBarOverlayLayout.f2066OooOo0o = actionBarOverlayLayout.f2048OooO0Oo.animate().translationY(-actionBarOverlayLayout.f2048OooO0Oo.getHeight()).setListener(actionBarOverlayLayout.f2062OooOo);
                return;
        }
    }
}