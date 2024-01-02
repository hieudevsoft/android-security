package OooO0oO;

import OooOooo.o0o0Oo;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.o0;
import androidx.appcompat.widget.o0000O0O;
import androidx.appcompat.widget.o000O00O;
import androidx.appcompat.widget.o000O0o;
import androidx.appcompat.widget.o000OO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class o000O implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f328OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ Object f329OooO0O0;

    public /* synthetic */ o000O(int i, Object obj) {
        this.f328OooO00o = i;
        this.f329OooO0O0 = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.f328OooO00o;
        boolean z = false;
        Object obj = this.f329OooO0O0;
        switch (i) {
            case 0:
                o00O0000 o00o0000 = (o00O0000) obj;
                if (o00o0000.OooO0O0()) {
                    ArrayList arrayList = o00o0000.f363OooO;
                    if (arrayList.size() > 0 && !((o00) arrayList.get(0)).f325OooO00o.f2398OooOoO0) {
                        View view = o00o0000.f376OooOOOo;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((o00) it.next()).f325OooO00o.OooO();
                            }
                            return;
                        }
                        o00o0000.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                oo0O oo0o = (oo0O) obj;
                if (oo0o.OooO0O0()) {
                    o0 o0Var = oo0o.f476OooO;
                    if (!o0Var.f2398OooOoO0) {
                        View view2 = oo0o.f487OooOOO;
                        if (view2 != null && view2.isShown()) {
                            o0Var.OooO();
                            return;
                        } else {
                            oo0o.dismiss();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 2:
                o000O00O o000o00o = (o000O00O) obj;
                if (!o000o00o.getInternalPopup().OooO0O0()) {
                    o000o00o.f2297OooO0o.OooO0o(o000OO.OooO0O0(o000o00o), o000OO.OooO00o(o000o00o));
                }
                ViewTreeObserver viewTreeObserver = o000o00o.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    o0000O0O.OooO00o(viewTreeObserver, this);
                    return;
                }
                return;
            default:
                o000O0o o000o0o = (o000O0o) obj;
                o000O00O o000o00o2 = o000o0o.f2309Oooo00O;
                WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
                if (OooOooo.oo0o0O0.OooO0O0(o000o00o2) && o000o00o2.getGlobalVisibleRect(o000o0o.f2307OooOooo)) {
                    z = true;
                }
                if (!z) {
                    o000o0o.dismiss();
                    return;
                }
                o000o0o.OooOOoo();
                o000o0o.OooO();
                return;
        }
    }
}