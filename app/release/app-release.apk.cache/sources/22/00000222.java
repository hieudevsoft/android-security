package Ooooo00;

import OooO0o0.OooO;
import OooOoO0.o0OOO0o;
import OooOoO0.o0ooOOo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.OooO0o;
import java.util.ArrayList;
import o0000O00.OooO00o;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class OooOOOO extends OooOo00 implements Animatable {

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final OooOOO0 f1706OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final Context f1707OooO0OO;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final OooO f1709OooO0o;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public OooO0o f1708OooO0Oo = null;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public ArrayList f1710OooO0o0 = null;

    public OooOOOO(Context context) {
        OooO oooO = new OooO(this);
        this.f1709OooO0o = oooO;
        this.f1707OooO0OO = context;
        this.f1706OooO0O0 = new OooOOO0(oooO);
    }

    @Override // Ooooo00.OooOo00, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f1711OooO00o;
        if (drawable != null) {
            o0OOO0o.OooO00o(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f1711OooO00o;
        if (drawable != null) {
            return o0OOO0o.OooO0O0(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f1711OooO00o;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        OooOOO0 oooOOO0 = this.f1706OooO0O0;
        oooOOO0.f1702OooO00o.draw(canvas);
        if (oooOOO0.f1703OooO0O0.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f1711OooO00o;
        if (drawable != null) {
            return o0ooOOo.OooO00o(drawable);
        }
        return this.f1706OooO0O0.f1702OooO00o.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f1711OooO00o;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f1706OooO0O0.getClass();
        return changingConfigurations | 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f1711OooO00o;
        if (drawable != null) {
            return o0OOO0o.OooO0OO(drawable);
        }
        return this.f1706OooO0O0.f1702OooO00o.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f1711OooO00o != null) {
            return new OooOOO(this.f1711OooO00o.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f1711OooO00o;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f1706OooO0O0.f1702OooO00o.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f1711OooO00o;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f1706OooO0O0.f1702OooO00o.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f1711OooO00o;
        return drawable != null ? drawable.getOpacity() : this.f1706OooO0O0.f1702OooO00o.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f1711OooO00o;
        if (drawable != null) {
            return o0ooOOo.OooO0Oo(drawable);
        }
        return this.f1706OooO0O0.f1702OooO00o.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f1711OooO00o;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f1706OooO0O0.f1703OooO0O0.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f1711OooO00o;
        return drawable != null ? drawable.isStateful() : this.f1706OooO0O0.f1702OooO00o.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f1711OooO00o;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1711OooO00o;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f1706OooO0O0.f1702OooO00o.setBounds(rect);
        }
    }

    @Override // Ooooo00.OooOo00, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f1711OooO00o;
        return drawable != null ? drawable.setLevel(i) : this.f1706OooO0O0.f1702OooO00o.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f1711OooO00o;
        return drawable != null ? drawable.setState(iArr) : this.f1706OooO0O0.f1702OooO00o.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f1711OooO00o;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f1706OooO0O0.f1702OooO00o.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f1711OooO00o;
        if (drawable != null) {
            o0ooOOo.OooO0o0(drawable, z);
        } else {
            this.f1706OooO0O0.f1702OooO00o.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f1711OooO00o;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f1706OooO0O0.f1702OooO00o.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f1711OooO00o;
        if (drawable != null) {
            OooO00o.o000o0Oo(drawable, i);
        } else {
            this.f1706OooO0O0.f1702OooO00o.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f1711OooO00o;
        if (drawable != null) {
            OooO00o.o000o0o0(drawable, colorStateList);
        } else {
            this.f1706OooO0O0.f1702OooO00o.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f1711OooO00o;
        if (drawable != null) {
            OooO00o.o000o0o(drawable, mode);
        } else {
            this.f1706OooO0O0.f1702OooO00o.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f1711OooO00o;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f1706OooO0O0.f1702OooO00o.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f1711OooO00o;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        OooOOO0 oooOOO0 = this.f1706OooO0O0;
        if (oooOOO0.f1703OooO0O0.isStarted()) {
            return;
        }
        oooOOO0.f1703OooO0O0.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f1711OooO00o;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f1706OooO0O0.f1703OooO0O0.end();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c7, code lost:
        if (r3.f1703OooO0O0 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c9, code lost:
        r3.f1703OooO0O0 = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d0, code lost:
        r3.f1703OooO0O0.playTogether(r3.f1704OooO0OO);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d7, code lost:
        return;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void inflate(android.content.res.Resources r10, org.xmlpull.v1.XmlPullParser r11, android.util.AttributeSet r12, android.content.res.Resources.Theme r13) {
        /*
            r9 = this;
            android.graphics.drawable.Drawable r0 = r9.f1711OooO00o
            if (r0 == 0) goto L8
            OooOoO0.o0OOO0o.OooO0Oo(r0, r10, r11, r12, r13)
            return
        L8:
            int r0 = r11.getEventType()
            int r1 = r11.getDepth()
            r2 = 1
            int r1 = r1 + r2
        L12:
            Ooooo00.OooOOO0 r3 = r9.f1706OooO0O0
            if (r0 == r2) goto Lc5
            int r4 = r11.getDepth()
            if (r4 >= r1) goto L1f
            r4 = 3
            if (r0 == r4) goto Lc5
        L1f:
            r4 = 2
            if (r0 != r4) goto Lbf
            java.lang.String r0 = r11.getName()
            java.lang.String r4 = "animated-vector"
            boolean r4 = r4.equals(r0)
            r5 = 0
            r6 = 0
            if (r4 == 0) goto L65
            int[] r0 = o0000O00.OooO00o.f4143Oooo00O
            android.content.res.TypedArray r0 = o0000O00.OooO00o.o0000ooO(r10, r13, r12, r0)
            int r4 = r0.getResourceId(r6, r6)
            if (r4 == 0) goto Lbc
            Ooooo00.oo000o r7 = new Ooooo00.oo000o
            r7.<init>()
            java.lang.ThreadLocal r8 = OooOo0o.o0000.f1155OooO00o
            android.graphics.drawable.Drawable r4 = OooOo0o.o000000.OooO00o(r10, r4, r13)
            r7.f1711OooO00o = r4
            Ooooo00.o00Ooo r4 = new Ooooo00.o00Ooo
            android.graphics.drawable.Drawable r8 = r7.f1711OooO00o
            android.graphics.drawable.Drawable$ConstantState r8 = r8.getConstantState()
            r4.<init>(r8)
            r7.f1771OooO0o = r6
            OooO0o0.OooO r4 = r9.f1709OooO0o
            r7.setCallback(r4)
            Ooooo00.oo000o r4 = r3.f1702OooO00o
            if (r4 == 0) goto L62
            r4.setCallback(r5)
        L62:
            r3.f1702OooO00o = r7
            goto Lbc
        L65:
            java.lang.String r4 = "target"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lbf
            int[] r0 = o0000O00.OooO00o.f4144Oooo00o
            android.content.res.TypedArray r0 = r10.obtainAttributes(r12, r0)
            java.lang.String r4 = r0.getString(r6)
            int r6 = r0.getResourceId(r2, r6)
            if (r6 == 0) goto Lbc
            android.content.Context r7 = r9.f1707OooO0OO
            if (r7 == 0) goto Lb1
            android.animation.Animator r6 = android.animation.AnimatorInflater.loadAnimator(r7, r6)
            Ooooo00.oo000o r7 = r3.f1702OooO00o
            Ooooo00.o00Oo0 r7 = r7.f1768OooO0O0
            Ooooo00.o00O0O r7 = r7.f1751OooO0O0
            OooOO0.OooO0O0 r7 = r7.f1748OooOOOO
            java.lang.Object r5 = r7.getOrDefault(r4, r5)
            r6.setTarget(r5)
            java.util.ArrayList r5 = r3.f1704OooO0OO
            if (r5 != 0) goto La6
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r3.f1704OooO0OO = r5
            OooOO0.OooO0O0 r5 = new OooOO0.OooO0O0
            r5.<init>()
            r3.f1705OooO0Oo = r5
        La6:
            java.util.ArrayList r5 = r3.f1704OooO0OO
            r5.add(r6)
            OooOO0.OooO0O0 r3 = r3.f1705OooO0Oo
            r3.put(r6, r4)
            goto Lbc
        Lb1:
            r0.recycle()
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Context can't be null when inflating animators"
            r10.<init>(r11)
            throw r10
        Lbc:
            r0.recycle()
        Lbf:
            int r0 = r11.next()
            goto L12
        Lc5:
            android.animation.AnimatorSet r10 = r3.f1703OooO0O0
            if (r10 != 0) goto Ld0
            android.animation.AnimatorSet r10 = new android.animation.AnimatorSet
            r10.<init>()
            r3.f1703OooO0O0 = r10
        Ld0:
            android.animation.AnimatorSet r10 = r3.f1703OooO0O0
            java.util.ArrayList r11 = r3.f1704OooO0OO
            r10.playTogether(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Ooooo00.OooOOOO.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }
}