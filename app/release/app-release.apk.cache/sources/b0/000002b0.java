package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

/* loaded from: classes.dex */
public final class o000O00O extends Spinner {

    /* renamed from: OooO  reason: collision with root package name */
    public static final int[] f2292OooO = {16843505};

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o00Oo0 f2293OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final Context f2294OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final OooOo00 f2295OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public SpinnerAdapter f2296OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final o000O00 f2297OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final boolean f2298OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public int f2299OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final Rect f2300OooO0oo;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
        if (r6 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o000O00O(android.content.Context r12, android.util.AttributeSet r13) {
        /*
            r11 = this;
            r0 = 2130904023(0x7f0303d7, float:1.741488E38)
            r11.<init>(r12, r13, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r11.f2300OooO0oo = r1
            android.content.Context r1 = r11.getContext()
            androidx.appcompat.widget.oo0OOoo.OooO00o(r11, r1)
            int[] r1 = OooO0OO.OooO00o.f38OooOo0O
            r2 = 0
            android.content.res.TypedArray r3 = r12.obtainStyledAttributes(r13, r1, r0, r2)
            androidx.appcompat.widget.o00Oo0 r4 = new androidx.appcompat.widget.o00Oo0
            r4.<init>(r11)
            r11.f2293OooO00o = r4
            r4 = 4
            int r4 = r3.getResourceId(r4, r2)
            if (r4 == 0) goto L31
            OooO0o.OooOO0 r5 = new OooO0o.OooOO0
            r5.<init>(r12, r4)
            r11.f2294OooO0O0 = r5
            goto L33
        L31:
            r11.f2294OooO0O0 = r12
        L33:
            r4 = -1
            r5 = 0
            int[] r6 = androidx.appcompat.widget.o000O00O.f2292OooO     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L50
            android.content.res.TypedArray r6 = r12.obtainStyledAttributes(r13, r6, r0, r2)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L50
            boolean r7 = r6.hasValue(r2)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L51
            if (r7 == 0) goto L53
            int r4 = r6.getInt(r2, r2)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L51
            goto L53
        L46:
            r12 = move-exception
            r5 = r6
            goto L4a
        L49:
            r12 = move-exception
        L4a:
            if (r5 == 0) goto L4f
            r5.recycle()
        L4f:
            throw r12
        L50:
            r6 = r5
        L51:
            if (r6 == 0) goto L56
        L53:
            r6.recycle()
        L56:
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L90
            if (r4 == r7) goto L5d
            goto L9d
        L5d:
            androidx.appcompat.widget.o000O0o r4 = new androidx.appcompat.widget.o000O0o
            android.content.Context r8 = r11.f2294OooO0O0
            r4.<init>(r11, r8, r13)
            android.content.Context r8 = r11.f2294OooO0O0
            androidx.appcompat.widget.o0oO0O0o r1 = androidx.appcompat.widget.o0oO0O0o.OooOOO0(r8, r13, r1, r0)
            java.lang.Object r8 = r1.f2540OooO0O0
            android.content.res.TypedArray r8 = (android.content.res.TypedArray) r8
            r9 = 3
            r10 = -2
            int r8 = r8.getLayoutDimension(r9, r10)
            r11.f2299OooO0oO = r8
            android.graphics.drawable.Drawable r8 = r1.OooO0o0(r7)
            r4.OooOO0o(r8)
            java.lang.String r6 = r3.getString(r6)
            r4.f2305OooOoo = r6
            r1.OooOOOO()
            r11.f2297OooO0o = r4
            androidx.appcompat.widget.OooOo00 r1 = new androidx.appcompat.widget.OooOo00
            r1.<init>(r11, r11, r4, r7)
            r11.f2295OooO0OO = r1
            goto L9d
        L90:
            androidx.appcompat.widget.o0000OO0 r1 = new androidx.appcompat.widget.o0000OO0
            r1.<init>(r11)
            r11.f2297OooO0o = r1
            java.lang.String r4 = r3.getString(r6)
            r1.f2283OooO0OO = r4
        L9d:
            java.lang.CharSequence[] r1 = r3.getTextArray(r2)
            if (r1 == 0) goto Lb4
            android.widget.ArrayAdapter r2 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r2.<init>(r12, r4, r1)
            r12 = 2131427435(0x7f0b006b, float:1.8476486E38)
            r2.setDropDownViewResource(r12)
            r11.setAdapter(r2)
        Lb4:
            r3.recycle()
            r11.f2298OooO0o0 = r7
            android.widget.SpinnerAdapter r12 = r11.f2296OooO0Oo
            if (r12 == 0) goto Lc2
            r11.setAdapter(r12)
            r11.f2296OooO0Oo = r5
        Lc2:
            androidx.appcompat.widget.o00Oo0 r12 = r11.f2293OooO00o
            r12.OooO0o0(r13, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.o000O00O.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int OooO00o(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable != null) {
            Rect rect = this.f2300OooO0oo;
            drawable.getPadding(rect);
            return i2 + rect.left + rect.right;
        }
        return i2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        o00Oo0 o00oo0 = this.f2293OooO00o;
        if (o00oo0 != null) {
            o00oo0.OooO00o();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        o000O00 o000o00 = this.f2297OooO0o;
        return o000o00 != null ? o000o00.OooO0Oo() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        o000O00 o000o00 = this.f2297OooO0o;
        return o000o00 != null ? o000o00.OooOO0() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f2297OooO0o != null ? this.f2299OooO0oO : super.getDropDownWidth();
    }

    public final o000O00 getInternalPopup() {
        return this.f2297OooO0o;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        o000O00 o000o00 = this.f2297OooO0o;
        return o000o00 != null ? o000o00.OooOOO() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f2294OooO0O0;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        o000O00 o000o00 = this.f2297OooO0o;
        return o000o00 != null ? o000o00.OooO00o() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        o00Oo0 o00oo0 = this.f2293OooO00o;
        if (o00oo0 != null) {
            return o00oo0.OooO0OO();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o00Oo0 o00oo0 = this.f2293OooO00o;
        if (o00oo0 != null) {
            return o00oo0.OooO0Oo();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o000O00 o000o00 = this.f2297OooO0o;
        if (o000o00 == null || !o000o00.OooO0O0()) {
            return;
        }
        o000o00.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f2297OooO0o == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), OooO00o(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        o000Oo0 o000oo0 = (o000Oo0) parcelable;
        super.onRestoreInstanceState(o000oo0.getSuperState());
        if (!o000oo0.f2315OooO00o || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new OooO0oO.o000O(2, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        o000Oo0 o000oo0 = new o000Oo0(super.onSaveInstanceState());
        o000O00 o000o00 = this.f2297OooO0o;
        o000oo0.f2315OooO00o = o000o00 != null && o000o00.OooO0O0();
        return o000oo0;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        OooOo00 oooOo00 = this.f2295OooO0OO;
        if (oooOo00 == null || !oooOo00.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        o000O00 o000o00 = this.f2297OooO0o;
        if (o000o00 != null) {
            if (!o000o00.OooO0O0()) {
                o000o00.OooO0o(o000OO.OooO0O0(this), o000OO.OooO00o(this));
                return true;
            }
            return true;
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o00Oo0 o00oo0 = this.f2293OooO00o;
        if (o00oo0 != null) {
            o00oo0.OooO0o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        o00Oo0 o00oo0 = this.f2293OooO00o;
        if (o00oo0 != null) {
            o00oo0.OooO0oO(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        o000O00 o000o00 = this.f2297OooO0o;
        if (o000o00 == null) {
            super.setDropDownHorizontalOffset(i);
            return;
        }
        o000o00.OooOOOo(i);
        o000o00.OooO0OO(i);
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        o000O00 o000o00 = this.f2297OooO0o;
        if (o000o00 != null) {
            o000o00.OooOOO0(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f2297OooO0o != null) {
            this.f2299OooO0oO = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        o000O00 o000o00 = this.f2297OooO0o;
        if (o000o00 != null) {
            o000o00.OooOO0o(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(o0000O00.OooO00o.o0ooOoO(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        o000O00 o000o00 = this.f2297OooO0o;
        if (o000o00 != null) {
            o000o00.OooO0oo(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        o00Oo0 o00oo0 = this.f2293OooO00o;
        if (o00oo0 != null) {
            o00oo0.OooO(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        o00Oo0 o00oo0 = this.f2293OooO00o;
        if (o00oo0 != null) {
            o00oo0.OooOO0(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f2298OooO0o0) {
            this.f2296OooO0Oo = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        o000O00 o000o00 = this.f2297OooO0o;
        if (o000o00 != null) {
            Context context = this.f2294OooO0O0;
            if (context == null) {
                context = getContext();
            }
            o000o00.OooOOOO(new o000(spinnerAdapter, context.getTheme()));
        }
    }
}