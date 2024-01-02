package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class FitWindowsLinearLayout extends LinearLayout {

    /* renamed from: OooO00o  reason: collision with root package name */
    public o00OO00O f2095OooO00o;

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        o00OO00O o00oo00o = this.f2095OooO00o;
        if (o00oo00o != null) {
            rect.top = ((OooO0Oo.oo000o) o00oo00o).f249OooO0O0.Oooo0O0(null, rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(o00OO00O o00oo00o) {
        this.f2095OooO00o = o00oo00o;
    }
}