package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import hieubui.eup.android_app_security.R;

/* loaded from: classes.dex */
public final class o0000 extends RatingBar {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o00000OO f2258OooO00o;

    public o0000(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        oo0OOoo.OooO00o(this, getContext());
        o00000OO o00000oo2 = new o00000OO(this);
        this.f2258OooO00o = o00000oo2;
        o00000oo2.OooO00o(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.f2258OooO00o.f2274OooO0O0;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}