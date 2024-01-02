package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class OooO0O0 extends Drawable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final ActionBarContainer f2115OooO00o;

    public OooO0O0(ActionBarContainer actionBarContainer) {
        this.f2115OooO00o = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f2115OooO00o;
        if (actionBarContainer.f2022OooO0oO) {
            Drawable drawable = actionBarContainer.f2020OooO0o;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f2019OooO0Oo;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f2021OooO0o0;
        if (drawable3 == null || !actionBarContainer.f2023OooO0oo) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f2115OooO00o;
        if (actionBarContainer.f2022OooO0oO) {
            if (actionBarContainer.f2020OooO0o != null) {
                drawable = actionBarContainer.f2019OooO0Oo;
            } else {
                return;
            }
        } else {
            drawable = actionBarContainer.f2019OooO0Oo;
            if (drawable == null) {
                return;
            }
        }
        drawable.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}