package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import hieubui.eup.android_app_security.R;

/* loaded from: classes.dex */
public final class OooOo extends o00000 implements Oooo0 {

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final /* synthetic */ Oooo000 f2126OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(Oooo000 oooo000, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f2126OooO0Oo = oooo000;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        o0000O00.OooO00o.o000o0oO(this, getContentDescription());
        setOnTouchListener(new OooOo00(this, this, oooo000, 0));
    }

    @Override // androidx.appcompat.widget.Oooo0
    public final boolean OooO00o() {
        return false;
    }

    @Override // androidx.appcompat.widget.Oooo0
    public final boolean OooO0O0() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f2126OooO0Oo.OooOO0o();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            OooOoO0.o0OOO0o.OooO0o(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}