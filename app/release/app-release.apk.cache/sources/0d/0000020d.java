package OoooOoo;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class oO0000O implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final oO00000 f1659OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final ViewGroup f1660OooO0O0;

    public oO0000O(ViewGroup viewGroup, oO00000 oo00000) {
        this.f1659OooO00o = oo00000;
        this.f1660OooO0O0 = viewGroup;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01ee A[EDGE_INSN: B:148:0x01ee->B:95:0x01ee ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f4  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onPreDraw() {
        /*
            Method dump skipped, instructions count: 709
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooOoo.oO0000O.onPreDraw():boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f1660OooO0O0;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        oO0000Oo.f1663OooO0OO.remove(viewGroup);
        ArrayList arrayList = (ArrayList) oO0000Oo.OooO0O0().getOrDefault(viewGroup, null);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((oO00000) it.next()).OooOo(viewGroup);
            }
        }
        this.f1659OooO00o.OooO(true);
    }
}