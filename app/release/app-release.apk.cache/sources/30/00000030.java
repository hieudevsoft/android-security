package OooO0Oo;

import OooOooo.o00O0OO;
import OooOooo.o0o0Oo;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class o000Oo0 extends OooO00o {

    /* renamed from: OoooO  reason: collision with root package name */
    public final /* synthetic */ int f230OoooO;

    /* renamed from: OoooOO0  reason: collision with root package name */
    public final /* synthetic */ o000O00O f231OoooOO0;

    public /* synthetic */ o000Oo0(o000O00O o000o00o, int i) {
        this.f230OoooO = i;
        this.f231OoooOO0 = o000o00o;
    }

    @Override // OooOooo.o0O00000
    public final void OooO00o() {
        View view;
        int i = this.f230OoooO;
        o000O00O o000o00o = this.f231OoooOO0;
        switch (i) {
            case 0:
                if (o000o00o.f209OooOOOO && (view = o000o00o.f203OooO0oO) != null) {
                    view.setTranslationY(0.0f);
                    o000o00o.f200OooO0Oo.setTranslationY(0.0f);
                }
                o000o00o.f200OooO0Oo.setVisibility(8);
                o000o00o.f200OooO0Oo.setTransitioning(false);
                o000o00o.f213OooOOoo = null;
                OooO0o.OooO0O0 oooO0O0 = o000o00o.f206OooOO0O;
                if (oooO0O0 != null) {
                    oooO0O0.OooO0Oo(o000o00o.f205OooOO0);
                    o000o00o.f205OooOO0 = null;
                    o000o00o.f206OooOO0O = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = o000o00o.f199OooO0OO;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
                    o00O0OO.OooO0OO(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                o000o00o.f213OooOOoo = null;
                o000o00o.f200OooO0Oo.requestLayout();
                return;
        }
    }
}