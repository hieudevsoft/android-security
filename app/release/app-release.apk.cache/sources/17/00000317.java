package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class oo0oOO0 extends OooO0o0.OooOO0O {

    /* renamed from: OooO0O0  reason: collision with root package name */
    public boolean f2580OooO0O0;

    public oo0oOO0(Drawable drawable) {
        super(drawable);
        this.f2580OooO0O0 = true;
    }

    @Override // OooO0o0.OooOO0O, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f2580OooO0O0) {
            super.draw(canvas);
        }
    }

    @Override // OooO0o0.OooOO0O, android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        if (this.f2580OooO0O0) {
            super.setHotspot(f, f2);
        }
    }

    @Override // OooO0o0.OooOO0O, android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.f2580OooO0O0) {
            super.setHotspotBounds(i, i2, i3, i4);
        }
    }

    @Override // OooO0o0.OooOO0O, android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.f2580OooO0O0) {
            return super.setState(iArr);
        }
        return false;
    }

    @Override // OooO0o0.OooOO0O, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        if (this.f2580OooO0O0) {
            return super.setVisible(z, z2);
        }
        return false;
    }
}