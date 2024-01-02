package com.google.android.material.chip;

import OooOoO0.o0O0O00;
import OooOoO0.o0Oo0oo;
import OooOoO0.oo0o0Oo;
import OooOoo.o000OOo;
import OooOooo.o00O0O0;
import OooOooo.o00O0O0O;
import OooOooo.o0o0Oo;
import OooooOO.oO00O0o;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.oo000o;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import o0000O00.OooO00o;
import o00o0O.OooOO0;
import o00o0O.OooOOOO;
import o0ooOO0.Oooo0;
import o0ooOO0.o0OO00O;
import oo000o.OooO0o;
import ooOO.Oooo000;
import ooOO.o000oOoO;
import ooOO.o00O0O;
import ooOO.o0OoOo0;

/* loaded from: classes.dex */
public class Chip extends oo000o implements o0OoOo0, o0OO00O, Checkable {

    /* renamed from: OooO  reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f3339OooO;

    /* renamed from: OooO0o  reason: collision with root package name */
    public InsetDrawable f3340OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public o00O0O f3341OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public RippleDrawable f3342OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public View.OnClickListener f3343OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public boolean f3344OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public boolean f3345OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public boolean f3346OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public boolean f3347OooOOO;
    public boolean OooOOO0;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public int f3348OooOOOO;

    /* renamed from: OooOOOo  reason: collision with root package name */
    public int f3349OooOOOo;

    /* renamed from: OooOOo  reason: collision with root package name */
    public final o000oOoO f3350OooOOo;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public CharSequence f3351OooOOo0;

    /* renamed from: OooOOoo  reason: collision with root package name */
    public boolean f3352OooOOoo;

    /* renamed from: OooOo0  reason: collision with root package name */
    public final RectF f3353OooOo0;

    /* renamed from: OooOo00  reason: collision with root package name */
    public final Rect f3354OooOo00;

    /* renamed from: OooOo0O  reason: collision with root package name */
    public final Oooo000 f3355OooOo0O;

    /* renamed from: OooOo0o  reason: collision with root package name */
    public static final Rect f3337OooOo0o = new Rect();

    /* renamed from: OooOo  reason: collision with root package name */
    public static final int[] f3336OooOo = {16842913};

    /* renamed from: OooOoO0  reason: collision with root package name */
    public static final int[] f3338OooOoO0 = {16842911};

    /* JADX WARN: Removed duplicated region for block: B:102:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0283  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Chip(android.content.Context r18, android.util.AttributeSet r19) {
        /*
            Method dump skipped, instructions count: 940
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f3353OooOo0;
        rectF.setEmpty();
        if (OooO0OO() && this.f3343OooO0oo != null) {
            o00O0O o00o0o = this.f3341OooO0o0;
            Rect bounds = o00o0o.getBounds();
            rectF.setEmpty();
            if (o00o0o.OoooO()) {
                float f = o00o0o.f5682OooooO0 + o00o0o.f5681Ooooo0o + o00o0o.f5670Oooo0oo + o00o0o.f5680Ooooo00 + o00o0o.f5679OoooOoo;
                if (o0Oo0oo.OooO00o(o00o0o) == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        Rect rect = this.f3354OooOo00;
        rect.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return rect;
    }

    private OooO0o getTextAppearance() {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            return o00o0o.f5702o0OoOo0.f5279OooO0o;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f3346OooOO0o != z) {
            this.f3346OooOO0o = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f3345OooOO0O != z) {
            this.f3345OooOO0O = z;
            refreshDrawableState();
        }
    }

    public final void OooO0O0(int i) {
        int i2;
        this.f3349OooOOOo = i;
        int i3 = 0;
        if (!this.f3347OooOOO) {
            InsetDrawable insetDrawable = this.f3340OooO0o;
            if (insetDrawable != null) {
                if (insetDrawable != null) {
                    this.f3340OooO0o = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    OooO0o0();
                    return;
                }
                return;
            }
            OooO0o0();
            return;
        }
        int max = Math.max(0, i - ((int) this.f3341OooO0o0.f5653OooOoO));
        int max2 = Math.max(0, i - this.f3341OooO0o0.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.f3340OooO0o;
            if (insetDrawable2 != null) {
                if (insetDrawable2 != null) {
                    this.f3340OooO0o = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    OooO0o0();
                    return;
                }
                return;
            }
            OooO0o0();
            return;
        }
        if (max2 > 0) {
            i2 = max2 / 2;
        } else {
            i2 = 0;
        }
        if (max > 0) {
            i3 = max / 2;
        }
        int i4 = i3;
        if (this.f3340OooO0o != null) {
            Rect rect = new Rect();
            this.f3340OooO0o.getPadding(rect);
            if (rect.top == i4 && rect.bottom == i4 && rect.left == i2 && rect.right == i2) {
                OooO0o0();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.f3340OooO0o = new InsetDrawable((Drawable) this.f3341OooO0o0, i2, i4, i2, i4);
        OooO0o0();
    }

    public final boolean OooO0OO() {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            Drawable drawable = o00o0o.f5668Oooo0o0;
            if (drawable != null) {
                if (drawable instanceof oo0o0Oo) {
                    ((o0O0O00) ((oo0o0Oo) drawable)).getClass();
                    drawable = null;
                }
            } else {
                drawable = null;
            }
            if (drawable != null) {
                return true;
            }
        }
        return false;
    }

    public final void OooO0Oo() {
        boolean z;
        boolean z2 = false;
        if (OooO0OO()) {
            o00O0O o00o0o = this.f3341OooO0o0;
            if (o00o0o != null && o00o0o.f5666Oooo0OO) {
                z = true;
            } else {
                z = false;
            }
            if (z && this.f3343OooO0oo != null) {
                o0o0Oo.OooOO0o(this, this.f3350OooOOo);
                z2 = true;
                this.f3352OooOOoo = z2;
            }
        }
        o0o0Oo.OooOO0o(this, null);
        this.f3352OooOOoo = z2;
    }

    public final void OooO0o() {
        o00O0O o00o0o;
        if (!TextUtils.isEmpty(getText()) && (o00o0o = this.f3341OooO0o0) != null) {
            int OooOOo02 = (int) (o00o0o.OooOOo0() + o00o0o.f5682OooooO0 + o00o0o.f5679OoooOoo);
            o00O0O o00o0o2 = this.f3341OooO0o0;
            int OooOOOo2 = (int) (o00o0o2.OooOOOo() + o00o0o2.f5676OoooOOO + o00o0o2.OoooOoO);
            if (this.f3340OooO0o != null) {
                Rect rect = new Rect();
                this.f3340OooO0o.getPadding(rect);
                OooOOOo2 += rect.left;
                OooOOo02 += rect.right;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
            o00O0O0O.OooOO0O(this, OooOOOo2, paddingTop, OooOOo02, paddingBottom);
        }
    }

    public final void OooO0o0() {
        this.f3342OooO0oO = new RippleDrawable(com.google.gson.internal.OooO0o.OooOOo(this.f3341OooO0o0.f5658OooOooO), getBackgroundDrawable(), null);
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o.f5700o0OO00O) {
            o00o0o.f5700o0OO00O = false;
            o00o0o.f5707oo0o0Oo = null;
            o00o0o.onStateChange(o00o0o.getState());
        }
        RippleDrawable rippleDrawable = this.f3342OooO0oO;
        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
        o00O0O0.OooOOo0(this, rippleDrawable);
        OooO0o();
    }

    public final void OooO0oO() {
        TextPaint paint = getPaint();
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            paint.drawableState = o00o0o.getState();
        }
        OooO0o textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.OooO0o0(getContext(), paint, this.f3355OooOo0O);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006c, code lost:
        if (r1 != Integer.MIN_VALUE) goto L20;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            boolean r0 = r10.f3352OooOOoo
            if (r0 != 0) goto L9
            boolean r11 = super.dispatchHoverEvent(r11)
            return r11
        L9:
            ooOO.o000oOoO r0 = r10.f3350OooOOo
            android.view.accessibility.AccessibilityManager r1 = r0.f5645OooO0oo
            boolean r2 = r1.isEnabled()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L70
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 != 0) goto L1c
            goto L70
        L1c:
            int r1 = r11.getAction()
            r2 = 256(0x100, float:3.59E-43)
            r5 = 128(0x80, float:1.8E-43)
            r6 = 7
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r6) goto L42
            r6 = 9
            if (r1 == r6) goto L42
            r6 = 10
            if (r1 == r6) goto L32
            goto L70
        L32:
            int r1 = r0.OooOOO0
            if (r1 == r7) goto L70
            if (r1 != r7) goto L39
            goto L6e
        L39:
            r0.OooOOO0 = r7
            r0.OooOOo0(r7, r5)
            r0.OooOOo0(r1, r2)
            goto L6e
        L42:
            float r1 = r11.getX()
            float r6 = r11.getY()
            com.google.android.material.chip.Chip r8 = r0.f5649OooOOO
            boolean r9 = r8.OooO0OO()
            if (r9 == 0) goto L5e
            android.graphics.RectF r8 = r8.getCloseIconTouchBounds()
            boolean r1 = r8.contains(r1, r6)
            if (r1 == 0) goto L5e
            r1 = r3
            goto L5f
        L5e:
            r1 = r4
        L5f:
            int r6 = r0.OooOOO0
            if (r6 != r1) goto L64
            goto L6c
        L64:
            r0.OooOOO0 = r1
            r0.OooOOo0(r1, r5)
            r0.OooOOo0(r6, r2)
        L6c:
            if (r1 == r7) goto L70
        L6e:
            r0 = r3
            goto L71
        L70:
            r0 = r4
        L71:
            if (r0 != 0) goto L7b
            boolean r11 = super.dispatchHoverEvent(r11)
            if (r11 == 0) goto L7a
            goto L7b
        L7a:
            r3 = r4
        L7b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f3352OooOOoo) {
            return super.dispatchKeyEvent(keyEvent);
        }
        o000oOoO o000oooo = this.f3350OooOOo;
        o000oooo.getClass();
        boolean z = false;
        int i = 0;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i2 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode != 19) {
                                    if (keyCode != 21) {
                                        if (keyCode != 22) {
                                            i2 = 130;
                                        }
                                    } else {
                                        i2 = 17;
                                    }
                                } else {
                                    i2 = 33;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z2 = false;
                                while (i < repeatCount && o000oooo.OooOOO0(i2, null)) {
                                    i++;
                                    z2 = true;
                                }
                                z = z2;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i3 = o000oooo.f5648OooOO0o;
                    if (i3 != Integer.MIN_VALUE) {
                        Chip chip = o000oooo.f5649OooOOO;
                        if (i3 == 0) {
                            chip.performClick();
                        } else if (i3 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.f3343OooO0oo;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.f3352OooOOoo) {
                                chip.f3350OooOOo.OooOOo0(1, 1);
                            }
                        }
                    }
                    z = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z = o000oooo.OooOOO0(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z = o000oooo.OooOOO0(1, null);
            }
        }
        if (z && o000oooo.f5648OooOO0o != Integer.MIN_VALUE) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [int, boolean] */
    @Override // androidx.appcompat.widget.oo000o, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        o00O0O o00o0o = this.f3341OooO0o0;
        boolean z = false;
        if (o00o0o != null && o00O0O.OooOo00(o00o0o.f5668Oooo0o0)) {
            o00O0O o00o0o2 = this.f3341OooO0o0;
            ?? isEnabled = isEnabled();
            int i2 = isEnabled;
            if (this.OooOOO0) {
                i2 = isEnabled + 1;
            }
            int i3 = i2;
            if (this.f3346OooOO0o) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.f3345OooOO0O) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            } else {
                i = 0;
            }
            if (this.OooOOO0) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.f3346OooOO0o) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f3345OooOO0O) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (!Arrays.equals(o00o0o2.o0Oo0oo, iArr)) {
                o00o0o2.o0Oo0oo = iArr;
                if (o00o0o2.OoooO()) {
                    z = o00o0o2.OooOo0O(o00o0o2.getState(), iArr);
                }
            }
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        boolean z;
        if (!TextUtils.isEmpty(this.f3351OooOOo0)) {
            return this.f3351OooOOo0;
        }
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null && o00o0o.f5673OoooO00) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            getParent();
            return "android.widget.Button";
        } else if (isClickable()) {
            return "android.widget.Button";
        } else {
            return "android.view.View";
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f3340OooO0o;
        return insetDrawable == null ? this.f3341OooO0o0 : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            return o00o0o.f5674OoooO0O;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            return o00o0o.f5671OoooO;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            return o00o0o.f5654OooOoO0;
        }
        return null;
    }

    public float getChipCornerRadius() {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            return Math.max(0.0f, o00o0o.OooOOo());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f3341OooO0o0;
    }

    public float getChipEndPadding() {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            return o00o0o.f5682OooooO0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o == null || (drawable = o00o0o.f5663Oooo00O) == null) {
            return null;
        }
        if (drawable instanceof oo0o0Oo) {
            ((o0O0O00) ((oo0o0Oo) drawable)).getClass();
            return null;
        }
        return drawable;
    }

    public float getChipIconSize() {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            return o00o0o.f5661Oooo0;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            return o00o0o.f5664Oooo00o;
        }
        return null;
    }

    public float getChipMinHeight() {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            return o00o0o.f5653OooOoO;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            return o00o0o.f5676OoooOOO;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            return o00o0o.f5657OooOoo0;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            return o00o0o.f5656OooOoo;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o == null || (drawable = o00o0o.f5668Oooo0o0) == null) {
            return null;
        }
        if (drawable instanceof oo0o0Oo) {
            ((o0O0O00) ((oo0o0Oo) drawable)).getClass();
            return null;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            return o00o0o.f5660Oooo;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            return o00o0o.f5681Ooooo0o;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            return o00o0o.f5670Oooo0oo;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            return o00o0o.f5680Ooooo00;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            return o00o0o.f5669Oooo0oO;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            return o00o0o.f5692o000OOo;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f3352OooOOoo) {
            o000oOoO o000oooo = this.f3350OooOOo;
            if (o000oooo.f5648OooOO0o == 1 || o000oooo.f5647OooOO0O == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public oO00O0o getHideMotionSpec() {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            return o00o0o.f5693o000oOoO;
        }
        return null;
    }

    public float getIconEndPadding() {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            return o00o0o.f5678OoooOo0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            return o00o0o.f5677OoooOOo;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            return o00o0o.f5658OooOooO;
        }
        return null;
    }

    public Oooo0 getShapeAppearanceModel() {
        return this.f3341OooO0o0.f5494OooO00o.f5468OooO00o;
    }

    public oO00O0o getShowMotionSpec() {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            return o00o0o.f5675OoooOO0;
        }
        return null;
    }

    public float getTextEndPadding() {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            return o00o0o.f5679OoooOoo;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            return o00o0o.OoooOoO;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        OooO00o.o000o0O(this, this.f3341OooO0o0);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        boolean z;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f3336OooOo);
        }
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null && o00o0o.f5673OoooO00) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            View.mergeDrawableStates(onCreateDrawableState, f3338OooOoO0);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.f3352OooOOoo) {
            o000oOoO o000oooo = this.f3350OooOOo;
            int i2 = o000oooo.f5648OooOO0o;
            if (i2 != Integer.MIN_VALUE) {
                o000oooo.OooOO0(i2);
            }
            if (z) {
                o000oooo.OooOOO0(i, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        boolean contains;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                contains = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(contains);
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null && o00o0o.f5673OoooO00) {
            z = true;
        } else {
            z = false;
        }
        accessibilityNodeInfo.setCheckable(z);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f3348OooOOOO != i) {
            this.f3348OooOOOO = i;
            OooO0o();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r0 != 3) goto L18;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L49
            if (r0 == r2) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L44
            goto L50
        L21:
            boolean r0 = r5.f3345OooOO0O
            if (r0 == 0) goto L50
            if (r1 != 0) goto L4e
            r5.setCloseIconPressed(r3)
            goto L4e
        L2b:
            boolean r0 = r5.f3345OooOO0O
            if (r0 == 0) goto L44
            r5.playSoundEffect(r3)
            android.view.View$OnClickListener r0 = r5.f3343OooO0oo
            if (r0 == 0) goto L39
            r0.onClick(r5)
        L39:
            boolean r0 = r5.f3352OooOOoo
            if (r0 == 0) goto L42
            ooOO.o000oOoO r0 = r5.f3350OooOOo
            r0.OooOOo0(r2, r2)
        L42:
            r0 = r2
            goto L45
        L44:
            r0 = r3
        L45:
            r5.setCloseIconPressed(r3)
            goto L51
        L49:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r2)
        L4e:
            r0 = r2
            goto L51
        L50:
            r0 = r3
        L51:
            if (r0 != 0) goto L5b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L5a
            goto L5b
        L5a:
            r2 = r3
        L5b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f3351OooOOo0 = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f3342OooO0oO) {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // androidx.appcompat.widget.oo000o, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f3342OooO0oO) {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.oo000o, android.view.View
    public void setBackgroundResource(int i) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
    }

    public void setCheckable(boolean z) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            o00o0o.OooOo0o(z);
        }
    }

    public void setCheckableResource(int i) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            o00o0o.OooOo0o(o00o0o.f5683OooooOO.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o == null) {
            this.f3344OooOO0 = z;
        } else if (o00o0o.f5673OoooO00) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            o00o0o.OooOo(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            o00o0o.OooOo(OooO00o.o0ooOoO(o00o0o.f5683OooooOO, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            o00o0o.OooOoO0(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            o00o0o.OooOoO0(OooOo0.Oooo000.OooO00o(o00o0o.f5683OooooOO, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            o00o0o.OooOoO(o00o0o.f5683OooooOO.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null && o00o0o.f5654OooOoO0 != colorStateList) {
            o00o0o.f5654OooOoO0 = colorStateList;
            o00o0o.onStateChange(o00o0o.getState());
        }
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList OooO00o2;
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null && o00o0o.f5654OooOoO0 != (OooO00o2 = OooOo0.Oooo000.OooO00o(o00o0o.f5683OooooOO, i))) {
            o00o0o.f5654OooOoO0 = OooO00o2;
            o00o0o.onStateChange(o00o0o.getState());
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            o00o0o.OooOoOO(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            o00o0o.OooOoOO(o00o0o.f5683OooooOO.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(o00O0O o00o0o) {
        o00O0O o00o0o2 = this.f3341OooO0o0;
        if (o00o0o2 != o00o0o) {
            if (o00o0o2 != null) {
                o00o0o2.f5699o0O0O00 = new WeakReference(null);
            }
            this.f3341OooO0o0 = o00o0o;
            o00o0o.f5689o000000 = false;
            o00o0o.f5699o0O0O00 = new WeakReference(this);
            OooO0O0(this.f3349OooOOOo);
        }
    }

    public void setChipEndPadding(float f) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null && o00o0o.f5682OooooO0 != f) {
            o00o0o.f5682OooooO0 = f;
            o00o0o.invalidateSelf();
            o00o0o.OooOo0();
        }
    }

    public void setChipEndPaddingResource(int i) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            float dimension = o00o0o.f5683OooooOO.getResources().getDimension(i);
            if (o00o0o.f5682OooooO0 != dimension) {
                o00o0o.f5682OooooO0 = dimension;
                o00o0o.invalidateSelf();
                o00o0o.OooOo0();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            o00o0o.OooOoo0(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            o00o0o.OooOoo0(OooO00o.o0ooOoO(o00o0o.f5683OooooOO, i));
        }
    }

    public void setChipIconSize(float f) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            o00o0o.OooOoo(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            o00o0o.OooOoo(o00o0o.f5683OooooOO.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            o00o0o.OooOooO(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            o00o0o.OooOooO(OooOo0.Oooo000.OooO00o(o00o0o.f5683OooooOO, i));
        }
    }

    public void setChipIconVisible(int i) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            o00o0o.OooOooo(o00o0o.f5683OooooOO.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null && o00o0o.f5653OooOoO != f) {
            o00o0o.f5653OooOoO = f;
            o00o0o.invalidateSelf();
            o00o0o.OooOo0();
        }
    }

    public void setChipMinHeightResource(int i) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            float dimension = o00o0o.f5683OooooOO.getResources().getDimension(i);
            if (o00o0o.f5653OooOoO != dimension) {
                o00o0o.f5653OooOoO = dimension;
                o00o0o.invalidateSelf();
                o00o0o.OooOo0();
            }
        }
    }

    public void setChipStartPadding(float f) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null && o00o0o.f5676OoooOOO != f) {
            o00o0o.f5676OoooOOO = f;
            o00o0o.invalidateSelf();
            o00o0o.OooOo0();
        }
    }

    public void setChipStartPaddingResource(int i) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            float dimension = o00o0o.f5683OooooOO.getResources().getDimension(i);
            if (o00o0o.f5676OoooOOO != dimension) {
                o00o0o.f5676OoooOOO = dimension;
                o00o0o.invalidateSelf();
                o00o0o.OooOo0();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            o00o0o.Oooo000(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            o00o0o.Oooo000(OooOo0.Oooo000.OooO00o(o00o0o.f5683OooooOO, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            o00o0o.Oooo00O(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            o00o0o.Oooo00O(o00o0o.f5683OooooOO.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            o00o0o.Oooo00o(drawable);
        }
        OooO0Oo();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        OooOoo.o00O0O o00o0o;
        o00O0O o00o0o2 = this.f3341OooO0o0;
        if (o00o0o2 != null && o00o0o2.f5660Oooo != charSequence) {
            String str = OooOoo.o00O0O.f1211OooO0Oo;
            Locale locale = Locale.getDefault();
            int i = o000OOo.f1210OooO00o;
            boolean z = true;
            if (OooOoo.o0O0O00.OooO00o(locale) != 1) {
                z = false;
            }
            if (z) {
                o00o0o = OooOoo.o00O0O.f1214OooO0oO;
            } else {
                o00o0o = OooOoo.o00O0O.f1212OooO0o;
            }
            o00o0o2.f5660Oooo = o00o0o.OooO0OO(charSequence, o00o0o.f1217OooO0OO);
            o00o0o2.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            o00o0o.Oooo0(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            o00o0o.Oooo0(o00o0o.f5683OooooOO.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            o00o0o.Oooo00o(OooO00o.o0ooOoO(o00o0o.f5683OooooOO, i));
        }
        OooO0Oo();
    }

    public void setCloseIconSize(float f) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            o00o0o.Oooo0O0(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            o00o0o.Oooo0O0(o00o0o.f5683OooooOO.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            o00o0o.Oooo0OO(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            o00o0o.Oooo0OO(o00o0o.f5683OooooOO.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            o00o0o.Oooo0o0(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            o00o0o.Oooo0o0(OooOo0.Oooo000.OooO00o(o00o0o.f5683OooooOO, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // androidx.appcompat.widget.oo000o, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.oo000o, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            o00o0o.OooO(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f3341OooO0o0 == null) {
            return;
        }
        if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
            super.setEllipsize(truncateAt);
            o00O0O o00o0o = this.f3341OooO0o0;
            if (o00o0o != null) {
                o00o0o.f5692o000OOo = truncateAt;
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f3347OooOOO = z;
        OooO0O0(this.f3349OooOOOo);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            return;
        }
        super.setGravity(i);
    }

    public void setHideMotionSpec(oO00O0o oo00o0o) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            o00o0o.f5693o000oOoO = oo00o0o;
        }
    }

    public void setHideMotionSpecResource(int i) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            o00o0o.f5693o000oOoO = oO00O0o.OooO00o(o00o0o.f5683OooooOO, i);
        }
    }

    public void setIconEndPadding(float f) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            o00o0o.Oooo0oO(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            o00o0o.Oooo0oO(o00o0o.f5683OooooOO.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            o00o0o.Oooo0oo(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            o00o0o.Oooo0oo(o00o0o.f5683OooooOO.getResources().getDimension(i));
        }
    }

    public void setInternalOnCheckedChangeListener(OooOO0 oooOO0) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f3341OooO0o0 == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            o00o0o.f5690o000000O = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f3339OooO = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f3343OooO0oo = onClickListener;
        OooO0Oo();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            o00o0o.Oooo(colorStateList);
        }
        if (!this.f3341OooO0o0.f5700o0OO00O) {
            OooO0o0();
        }
    }

    public void setRippleColorResource(int i) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            o00o0o.Oooo(OooOo0.Oooo000.OooO00o(o00o0o.f5683OooooOO, i));
            if (!this.f3341OooO0o0.f5700o0OO00O) {
                OooO0o0();
            }
        }
    }

    @Override // o0ooOO0.o0OO00O
    public void setShapeAppearanceModel(Oooo0 oooo0) {
        this.f3341OooO0o0.setShapeAppearanceModel(oooo0);
    }

    public void setShowMotionSpec(oO00O0o oo00o0o) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            o00o0o.f5675OoooOO0 = oo00o0o;
        }
    }

    public void setShowMotionSpecResource(int i) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            o00o0o.f5675OoooOO0 = oO00O0o.OooO00o(o00o0o.f5683OooooOO, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        if (o00o0o.f5689o000000) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        super.setText(charSequence2, bufferType);
        o00O0O o00o0o2 = this.f3341OooO0o0;
        if (o00o0o2 != null && !TextUtils.equals(o00o0o2.f5659OooOooo, charSequence)) {
            o00o0o2.f5659OooOooo = charSequence;
            o00o0o2.f5702o0OoOo0.f5278OooO0Oo = true;
            o00o0o2.invalidateSelf();
            o00o0o2.OooOo0();
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            o00o0o.OoooO00(new OooO0o(o00o0o.f5683OooooOO, i));
        }
        OooO0oO();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null && o00o0o.f5679OoooOoo != f) {
            o00o0o.f5679OoooOoo = f;
            o00o0o.invalidateSelf();
            o00o0o.OooOo0();
        }
    }

    public void setTextEndPaddingResource(int i) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            float dimension = o00o0o.f5683OooooOO.getResources().getDimension(i);
            if (o00o0o.f5679OoooOoo != dimension) {
                o00o0o.f5679OoooOoo = dimension;
                o00o0o.invalidateSelf();
                o00o0o.OooOo0();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            float applyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            OooOOOO oooOOOO = o00o0o.f5702o0OoOo0;
            OooO0o oooO0o = oooOOOO.f5279OooO0o;
            if (oooO0o != null) {
                oooO0o.f5621OooOO0O = applyDimension;
                oooOOOO.f5275OooO00o.setTextSize(applyDimension);
                o00o0o.OooOo0();
                o00o0o.invalidateSelf();
            }
        }
        OooO0oO();
    }

    public void setTextStartPadding(float f) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null && o00o0o.OoooOoO != f) {
            o00o0o.OoooOoO = f;
            o00o0o.invalidateSelf();
            o00o0o.OooOo0();
        }
    }

    public void setTextStartPaddingResource(int i) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            float dimension = o00o0o.f5683OooooOO.getResources().getDimension(i);
            if (o00o0o.OoooOoO != dimension) {
                o00o0o.OoooOoO = dimension;
                o00o0o.invalidateSelf();
                o00o0o.OooOo0();
            }
        }
    }

    public void setCloseIconVisible(boolean z) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            o00o0o.Oooo0o(z);
        }
        OooO0Oo();
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public void setCheckedIconVisible(boolean z) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            o00o0o.OooOoO(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            o00o0o.OooOooo(z);
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            o00o0o.OoooO00(new OooO0o(o00o0o.f5683OooooOO, i));
        }
        OooO0oO();
    }

    public void setTextAppearance(OooO0o oooO0o) {
        o00O0O o00o0o = this.f3341OooO0o0;
        if (o00o0o != null) {
            o00o0o.OoooO00(oooO0o);
        }
        OooO0oO();
    }
}