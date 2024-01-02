package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import hieubui.eup.android_app_security.R;

/* loaded from: classes.dex */
public final class o0000O0 extends o00000OO {

    /* renamed from: OooO  reason: collision with root package name */
    public boolean f2275OooO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final SeekBar f2276OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public ColorStateList f2277OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public Drawable f2278OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public PorterDuff.Mode f2279OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public boolean f2280OooO0oo;

    public o0000O0(SeekBar seekBar) {
        super(seekBar);
        this.f2277OooO0o = null;
        this.f2279OooO0oO = null;
        this.f2280OooO0oo = false;
        this.f2275OooO = false;
        this.f2276OooO0Oo = seekBar;
    }

    @Override // androidx.appcompat.widget.o00000OO
    public final void OooO00o(AttributeSet attributeSet, int i) {
        super.OooO00o(attributeSet, R.attr.seekBarStyle);
        SeekBar seekBar = this.f2276OooO0Oo;
        Context context = seekBar.getContext();
        int[] iArr = OooO0OO.OooO00o.f24OooO0oO;
        o0oO0O0o OooOOO0 = o0oO0O0o.OooOOO0(context, attributeSet, iArr, R.attr.seekBarStyle);
        OooOooo.o0o0Oo.OooOO0O(seekBar, seekBar.getContext(), iArr, attributeSet, (TypedArray) OooOOO0.f2540OooO0O0, R.attr.seekBarStyle);
        Drawable OooO0o2 = OooOOO0.OooO0o(0);
        if (OooO0o2 != null) {
            seekBar.setThumb(OooO0o2);
        }
        Drawable OooO0o02 = OooOOO0.OooO0o0(1);
        Drawable drawable = this.f2278OooO0o0;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f2278OooO0o0 = OooO0o02;
        if (OooO0o02 != null) {
            OooO0o02.setCallback(seekBar);
            OooOoO0.o0Oo0oo.OooO0O0(OooO0o02, OooOooo.o00O0O0O.OooO0Oo(seekBar));
            if (OooO0o02.isStateful()) {
                OooO0o02.setState(seekBar.getDrawableState());
            }
            OooO0OO();
        }
        seekBar.invalidate();
        if (OooOOO0.OooOO0o(3)) {
            this.f2279OooO0oO = o00O0OO0.OooO0O0(OooOOO0.OooO0oo(3, -1), this.f2279OooO0oO);
            this.f2275OooO = true;
        }
        if (OooOOO0.OooOO0o(2)) {
            this.f2277OooO0o = OooOOO0.OooO0O0(2);
            this.f2280OooO0oo = true;
        }
        OooOOO0.OooOOOO();
        OooO0OO();
    }

    public final void OooO0OO() {
        Drawable drawable = this.f2278OooO0o0;
        if (drawable != null) {
            if (this.f2280OooO0oo || this.f2275OooO) {
                Drawable mutate = drawable.mutate();
                this.f2278OooO0o0 = mutate;
                if (this.f2280OooO0oo) {
                    OooOoO0.o0OOO0o.OooO0oo(mutate, this.f2277OooO0o);
                }
                if (this.f2275OooO) {
                    OooOoO0.o0OOO0o.OooO(this.f2278OooO0o0, this.f2279OooO0oO);
                }
                if (this.f2278OooO0o0.isStateful()) {
                    this.f2278OooO0o0.setState(this.f2276OooO0Oo.getDrawableState());
                }
            }
        }
    }

    public final void OooO0Oo(Canvas canvas) {
        if (this.f2278OooO0o0 != null) {
            SeekBar seekBar = this.f2276OooO0Oo;
            int max = seekBar.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f2278OooO0o0.getIntrinsicWidth();
                int intrinsicHeight = this.f2278OooO0o0.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f2278OooO0o0.setBounds(-i, -i2, i, i2);
                float width = ((seekBar.getWidth() - seekBar.getPaddingLeft()) - seekBar.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(seekBar.getPaddingLeft(), seekBar.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f2278OooO0o0.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}