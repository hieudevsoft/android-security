package OoooOoo;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import hieubui.eup.android_app_security.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class oO0OOo0o extends oO00000o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1685OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ View f1686OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ View f1687OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final /* synthetic */ o0OOOO0o f1688OooO0Oo;

    public oO0OOo0o(o0OOOO0o o0oooo0o, ViewGroup viewGroup, View view, View view2) {
        this.f1688OooO0Oo = o0oooo0o;
        this.f1685OooO00o = viewGroup;
        this.f1686OooO0O0 = view;
        this.f1687OooO0OO = view2;
    }

    @Override // OoooOoo.oO00000o, OoooOoo.o
    public final void OooO0O0() {
        this.f1685OooO00o.getOverlay().remove(this.f1686OooO0O0);
    }

    @Override // OoooOoo.oO00000o, OoooOoo.o
    public final void OooO0Oo() {
        View view = this.f1686OooO0O0;
        if (view.getParent() == null) {
            this.f1685OooO00o.getOverlay().add(view);
            return;
        }
        o0OOOO0o o0oooo0o = this.f1688OooO0Oo;
        ArrayList arrayList = o0oooo0o.OooOOO0;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ((Animator) arrayList.get(size)).cancel();
        }
        ArrayList arrayList2 = o0oooo0o.f1656OooOOo0;
        if (arrayList2 != null && arrayList2.size() > 0) {
            ArrayList arrayList3 = (ArrayList) o0oooo0o.f1656OooOOo0.clone();
            int size2 = arrayList3.size();
            for (int i = 0; i < size2; i++) {
                ((o) arrayList3.get(i)).OooO00o();
            }
        }
    }

    @Override // OoooOoo.o
    public final void OooO0o0(oO00000 oo00000) {
        this.f1687OooO0OO.setTag(R.id.save_overlay_view, null);
        this.f1685OooO00o.getOverlay().remove(this.f1686OooO0O0);
        oo00000.OooOo0O(this);
    }
}