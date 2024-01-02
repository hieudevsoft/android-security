package OooO0Oo;

import OooOooo.o00O0OO;
import OooOooo.o0o0Oo;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class o00oO0o extends OooO00o {

    /* renamed from: OoooO  reason: collision with root package name */
    public final /* synthetic */ int f244OoooO;

    /* renamed from: OoooOO0  reason: collision with root package name */
    public final /* synthetic */ Object f245OoooOO0;

    public /* synthetic */ o00oO0o(int i, Object obj) {
        this.f244OoooO = i;
        this.f245OoooOO0 = obj;
    }

    @Override // OooOooo.o0O00000
    public final void OooO00o() {
        int i = this.f244OoooO;
        Object obj = this.f245OoooOO0;
        switch (i) {
            case 0:
                o00Ooo o00ooo2 = (o00Ooo) obj;
                o00ooo2.f243OooO0O0.f134OooOo0O.setAlpha(1.0f);
                o00000OO o00000oo2 = o00ooo2.f243OooO0O0;
                o00000oo2.f137OooOoO0.OooO0Oo(null);
                o00000oo2.f137OooOoO0 = null;
                return;
            case 1:
                o00000OO o00000oo3 = (o00000OO) obj;
                o00000oo3.f134OooOo0O.setAlpha(1.0f);
                o00000oo3.f137OooOoO0.OooO0Oo(null);
                o00000oo3.f137OooOoO0 = null;
                return;
            default:
                o0ooOOo o0ooooo = (o0ooOOo) obj;
                o0ooooo.f247OooO0O0.f134OooOo0O.setVisibility(8);
                o00000OO o00000oo4 = o0ooooo.f247OooO0O0;
                PopupWindow popupWindow = o00000oo4.f135OooOo0o;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (o00000oo4.f134OooOo0O.getParent() instanceof View) {
                    WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
                    o00O0OO.OooO0OO((View) o00000oo4.f134OooOo0O.getParent());
                }
                o00000oo4.f134OooOo0O.OooO0o0();
                o00000oo4.f137OooOoO0.OooO0Oo(null);
                o00000oo4.f137OooOoO0 = null;
                ViewGroup viewGroup = o00000oo4.f138OooOoOO;
                WeakHashMap weakHashMap2 = o0o0Oo.f1363OooO00o;
                o00O0OO.OooO0OO(viewGroup);
                return;
        }
    }

    @Override // o0000O00.OooO00o, OooOooo.o0O00000
    public final void OooO0o() {
        int i = this.f244OoooO;
        Object obj = this.f245OoooOO0;
        switch (i) {
            case 0:
                ((o00Ooo) obj).f243OooO0O0.f134OooOo0O.setVisibility(0);
                return;
            case 1:
                o00000OO o00000oo2 = (o00000OO) obj;
                o00000oo2.f134OooOo0O.setVisibility(0);
                if (o00000oo2.f134OooOo0O.getParent() instanceof View) {
                    WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
                    o00O0OO.OooO0OO((View) o00000oo2.f134OooOo0O.getParent());
                    return;
                }
                return;
            default:
                return;
        }
    }
}