package Ooooo00;

import OooOoO0.o0OOO0o;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class OooOo00 extends Drawable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public Drawable f1711OooO00o;

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f1711OooO00o;
        if (drawable != null) {
            o0OOO0o.OooO00o(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void clearColorFilter() {
        Drawable drawable = this.f1711OooO00o;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        Drawable drawable = this.f1711OooO00o;
        return drawable != null ? drawable.getCurrent() : super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        Drawable drawable = this.f1711OooO00o;
        return drawable != null ? drawable.getMinimumHeight() : super.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        Drawable drawable = this.f1711OooO00o;
        return drawable != null ? drawable.getMinimumWidth() : super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Drawable drawable = this.f1711OooO00o;
        return drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        Drawable drawable = this.f1711OooO00o;
        return drawable != null ? drawable.getState() : super.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Drawable drawable = this.f1711OooO00o;
        return drawable != null ? drawable.getTransparentRegion() : super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        Drawable drawable = this.f1711OooO00o;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f1711OooO00o;
        return drawable != null ? drawable.setLevel(i) : super.onLevelChange(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i) {
        Drawable drawable = this.f1711OooO00o;
        if (drawable != null) {
            drawable.setChangingConfigurations(i);
        } else {
            super.setChangingConfigurations(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(int i, PorterDuff.Mode mode) {
        Drawable drawable = this.f1711OooO00o;
        if (drawable != null) {
            drawable.setColorFilter(i, mode);
        } else {
            super.setColorFilter(i, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        Drawable drawable = this.f1711OooO00o;
        if (drawable != null) {
            drawable.setFilterBitmap(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.f1711OooO00o;
        if (drawable != null) {
            o0OOO0o.OooO0o0(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        Drawable drawable = this.f1711OooO00o;
        if (drawable != null) {
            o0OOO0o.OooO0o(drawable, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        Drawable drawable = this.f1711OooO00o;
        return drawable != null ? drawable.setState(iArr) : super.setState(iArr);
    }
}