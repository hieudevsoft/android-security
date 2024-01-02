package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import hieubui.eup.android_app_security.R;

/* loaded from: classes.dex */
public final class o0000oo extends SeekBar {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o0000O0 f2289OooO00o;

    public o0000oo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        oo0OOoo.OooO00o(this, getContext());
        o0000O0 o0000o02 = new o0000O0(this);
        this.f2289OooO00o = o0000o02;
        o0000o02.OooO00o(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        o0000O0 o0000o02 = this.f2289OooO00o;
        Drawable drawable = o0000o02.f2278OooO0o0;
        if (drawable != null && drawable.isStateful()) {
            SeekBar seekBar = o0000o02.f2276OooO0Oo;
            if (drawable.setState(seekBar.getDrawableState())) {
                seekBar.invalidateDrawable(drawable);
            }
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2289OooO00o.f2278OooO0o0;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f2289OooO00o.OooO0Oo(canvas);
    }
}