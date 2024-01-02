package OooO0oO;

import OooO0o.OooO0o;
import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class o00O0 extends FrameLayout implements OooO0o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final CollapsibleActionView f356OooO00o;

    public o00O0(View view) {
        super(view.getContext());
        this.f356OooO00o = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // OooO0o.OooO0o
    public final void OooO00o() {
        this.f356OooO00o.onActionViewExpanded();
    }

    @Override // OooO0o.OooO0o
    public final void OooO0o0() {
        this.f356OooO00o.onActionViewCollapsed();
    }
}