package OooOOo0;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* loaded from: classes.dex */
public final class o00O0O extends View {

    /* renamed from: OooO00o  reason: collision with root package name */
    public boolean f1073OooO00o;

    public o00O0O(Context context) {
        super(context);
        this.f1073OooO00o = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.f1073OooO00o = z;
    }

    public void setGuidelineBegin(int i) {
        OooO oooO = (OooO) getLayoutParams();
        if (this.f1073OooO00o && oooO.f864OooO00o == i) {
            return;
        }
        oooO.f864OooO00o = i;
        setLayoutParams(oooO);
    }

    public void setGuidelineEnd(int i) {
        OooO oooO = (OooO) getLayoutParams();
        if (this.f1073OooO00o && oooO.f865OooO0O0 == i) {
            return;
        }
        oooO.f865OooO0O0 = i;
        setLayoutParams(oooO);
    }

    public void setGuidelinePercent(float f) {
        OooO oooO = (OooO) getLayoutParams();
        if (this.f1073OooO00o && oooO.f866OooO0OO == f) {
            return;
        }
        oooO.f866OooO0OO = f;
        setLayoutParams(oooO);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}