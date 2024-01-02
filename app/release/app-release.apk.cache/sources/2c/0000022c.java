package Ooooo00;

import OooOoO0.o0OOO0o;
import OooOoO0.o0ooOOo;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import o0000O00.OooO00o;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class oo000o extends OooOo00 {

    /* renamed from: OooOO0  reason: collision with root package name */
    public static final PorterDuff.Mode f1766OooOO0 = PorterDuff.Mode.SRC_IN;

    /* renamed from: OooO  reason: collision with root package name */
    public final Rect f1767OooO;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public o00Oo0 f1768OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public PorterDuffColorFilter f1769OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public ColorFilter f1770OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public boolean f1771OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public boolean f1772OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final float[] f1773OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final Matrix f1774OooO0oo;

    public oo000o() {
        this.f1771OooO0o = true;
        this.f1773OooO0oO = new float[9];
        this.f1774OooO0oo = new Matrix();
        this.f1767OooO = new Rect();
        this.f1768OooO0O0 = new o00Oo0();
    }

    public final PorterDuffColorFilter OooO00o(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f1711OooO00o;
        if (drawable != null) {
            o0OOO0o.OooO0O0(drawable);
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bb, code lost:
        if (r10 == false) goto L66;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(android.graphics.Canvas r19) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Ooooo00.oo000o.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f1711OooO00o;
        if (drawable != null) {
            return o0ooOOo.OooO00o(drawable);
        }
        return this.f1768OooO0O0.f1751OooO0O0.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f1711OooO00o;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f1768OooO0O0.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f1711OooO00o;
        if (drawable != null) {
            return o0OOO0o.OooO0OO(drawable);
        }
        return this.f1770OooO0Oo;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f1711OooO00o != null) {
            return new o00Ooo(this.f1711OooO00o.getConstantState());
        }
        this.f1768OooO0O0.f1750OooO00o = getChangingConfigurations();
        return this.f1768OooO0O0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f1711OooO00o;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f1768OooO0O0.f1751OooO0O0.f1735OooO;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f1711OooO00o;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f1768OooO0O0.f1751OooO0O0.f1743OooO0oo;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f1711OooO00o;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f1711OooO00o;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f1711OooO00o;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f1711OooO00o;
        if (drawable != null) {
            return o0ooOOo.OooO0Oo(drawable);
        }
        return this.f1768OooO0O0.f1755OooO0o0;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f1711OooO00o;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            o00Oo0 o00oo0 = this.f1768OooO0O0;
            if (o00oo0 != null) {
                o00O0O o00o0o = o00oo0.f1751OooO0O0;
                if (o00o0o.f1747OooOOO == null) {
                    o00o0o.f1747OooOOO = Boolean.valueOf(o00o0o.f1742OooO0oO.OooO00o());
                }
                if (o00o0o.f1747OooOOO.booleanValue() || ((colorStateList = this.f1768OooO0O0.f1752OooO0OO) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f1711OooO00o;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f1772OooO0o0 && super.mutate() == this) {
            this.f1768OooO0O0 = new o00Oo0(this.f1768OooO0O0);
            this.f1772OooO0o0 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1711OooO00o;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.f1711OooO00o;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        o00Oo0 o00oo0 = this.f1768OooO0O0;
        ColorStateList colorStateList = o00oo0.f1752OooO0OO;
        if (colorStateList != null && (mode = o00oo0.f1753OooO0Oo) != null) {
            this.f1769OooO0OO = OooO00o(colorStateList, mode);
            invalidateSelf();
            z = true;
        } else {
            z = false;
        }
        o00O0O o00o0o = o00oo0.f1751OooO0O0;
        if (o00o0o.f1747OooOOO == null) {
            o00o0o.f1747OooOOO = Boolean.valueOf(o00o0o.f1742OooO0oO.OooO00o());
        }
        if (o00o0o.f1747OooOOO.booleanValue()) {
            boolean OooO0O02 = o00oo0.f1751OooO0O0.f1742OooO0oO.OooO0O0(iArr);
            o00oo0.f1759OooOO0O |= OooO0O02;
            if (OooO0O02) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f1711OooO00o;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f1711OooO00o;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f1768OooO0O0.f1751OooO0O0.getRootAlpha() != i) {
            this.f1768OooO0O0.f1751OooO0O0.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f1711OooO00o;
        if (drawable != null) {
            o0ooOOo.OooO0o0(drawable, z);
        } else {
            this.f1768OooO0O0.f1755OooO0o0 = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f1711OooO00o;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f1770OooO0Oo = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f1711OooO00o;
        if (drawable != null) {
            OooO00o.o000o0Oo(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f1711OooO00o;
        if (drawable != null) {
            o0OOO0o.OooO0oo(drawable, colorStateList);
            return;
        }
        o00Oo0 o00oo0 = this.f1768OooO0O0;
        if (o00oo0.f1752OooO0OO != colorStateList) {
            o00oo0.f1752OooO0OO = colorStateList;
            this.f1769OooO0OO = OooO00o(colorStateList, o00oo0.f1753OooO0Oo);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f1711OooO00o;
        if (drawable != null) {
            o0OOO0o.OooO(drawable, mode);
            return;
        }
        o00Oo0 o00oo0 = this.f1768OooO0O0;
        if (o00oo0.f1753OooO0Oo != mode) {
            o00oo0.f1753OooO0Oo = mode;
            this.f1769OooO0OO = OooO00o(o00oo0.f1752OooO0OO, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f1711OooO00o;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f1711OooO00o;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public oo000o(o00Oo0 o00oo0) {
        this.f1771OooO0o = true;
        this.f1773OooO0oO = new float[9];
        this.f1774OooO0oo = new Matrix();
        this.f1767OooO = new Rect();
        this.f1768OooO0O0 = o00oo0;
        this.f1769OooO0OO = OooO00o(o00oo0.f1752OooO0OO, o00oo0.f1753OooO0Oo);
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void inflate(android.content.res.Resources r23, org.xmlpull.v1.XmlPullParser r24, android.util.AttributeSet r25, android.content.res.Resources.Theme r26) {
        /*
            Method dump skipped, instructions count: 1004
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Ooooo00.oo000o.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }
}