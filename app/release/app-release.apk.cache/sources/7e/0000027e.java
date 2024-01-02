package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import hieubui.eup.android_app_security.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: OooO  reason: collision with root package name */
    public CharSequence f2024OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final OooO00o f2025OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final Context f2026OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public ActionMenuView f2027OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public Oooo000 f2028OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public OooOooo.o0 f2029OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public int f2030OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public boolean f2031OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public boolean f2032OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public CharSequence f2033OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public View f2034OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public View f2035OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public LinearLayout f2036OooOOO;
    public View OooOOO0;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public TextView f2037OooOOOO;

    /* renamed from: OooOOOo  reason: collision with root package name */
    public TextView f2038OooOOOo;

    /* renamed from: OooOOo  reason: collision with root package name */
    public final int f2039OooOOo;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public final int f2040OooOOo0;

    /* renamed from: OooOOoo  reason: collision with root package name */
    public boolean f2041OooOOoo;

    /* renamed from: OooOo00  reason: collision with root package name */
    public final int f2042OooOo00;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        Drawable drawable;
        int resourceId;
        this.f2025OooO00o = new OooO00o(this);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.f2026OooO0O0 = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.f2026OooO0O0 = context;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooO0OO.OooO00o.f21OooO0Oo, R.attr.actionModeStyle, 0);
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = o0000O00.OooO00o.o0ooOoO(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(0);
        }
        WeakHashMap weakHashMap = OooOooo.o0o0Oo.f1363OooO00o;
        OooOooo.o00O0O0.OooOOo0(this, drawable);
        this.f2040OooOOo0 = obtainStyledAttributes.getResourceId(5, 0);
        this.f2039OooOOo = obtainStyledAttributes.getResourceId(4, 0);
        this.f2030OooO0o0 = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f2042OooOo00 = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int OooO0o(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - 0);
    }

    public static int OooOO0(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        if (z) {
            return -measuredWidth;
        }
        return measuredWidth;
    }

    @Override // android.view.View
    /* renamed from: OooO */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2031OooO0oO = false;
        }
        if (!this.f2031OooO0oO) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f2031OooO0oO = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f2031OooO0oO = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0OO(OooO0o.OooO0OO r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f2034OooOO0O
            r1 = 0
            if (r0 != 0) goto L16
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r2 = r5.f2042OooOo00
            android.view.View r0 = r0.inflate(r2, r5, r1)
            r5.f2034OooOO0O = r0
            goto L1e
        L16:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L21
            android.view.View r0 = r5.f2034OooOO0O
        L1e:
            r5.addView(r0)
        L21:
            android.view.View r0 = r5.f2034OooOO0O
            r2 = 2131230786(0x7f080042, float:1.8077635E38)
            android.view.View r0 = r0.findViewById(r2)
            r5.f2035OooOO0o = r0
            androidx.appcompat.widget.OooO0OO r2 = new androidx.appcompat.widget.OooO0OO
            r2.<init>(r5, r6)
            r0.setOnClickListener(r2)
            OooO0oO.o00O00O r6 = r6.OooO0OO()
            androidx.appcompat.widget.Oooo000 r0 = r5.f2028OooO0Oo
            if (r0 == 0) goto L4e
            r0.OooO0o0()
            androidx.appcompat.widget.OooOOO0 r0 = r0.f2149OooOo00
            if (r0 == 0) goto L4e
            boolean r2 = r0.OooO0O0()
            if (r2 == 0) goto L4e
            OooO0oO.o00O0OO0 r0 = r0.f458OooOO0
            r0.dismiss()
        L4e:
            androidx.appcompat.widget.Oooo000 r0 = new androidx.appcompat.widget.Oooo000
            android.content.Context r2 = r5.getContext()
            r0.<init>(r2)
            r5.f2028OooO0Oo = r0
            r2 = 1
            r0.f2141OooOO0o = r2
            r0.OooOOO0 = r2
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r2 = -2
            r3 = -1
            r0.<init>(r2, r3)
            androidx.appcompat.widget.Oooo000 r2 = r5.f2028OooO0Oo
            android.content.Context r3 = r5.f2026OooO0O0
            r6.OooO0O0(r2, r3)
            androidx.appcompat.widget.Oooo000 r6 = r5.f2028OooO0Oo
            OooO0oO.o00OO00O r2 = r6.f2138OooO0oo
            if (r2 != 0) goto L86
            android.view.LayoutInflater r3 = r6.f2134OooO0Oo
            int r4 = r6.f2135OooO0o
            android.view.View r1 = r3.inflate(r4, r5, r1)
            OooO0oO.o00OO00O r1 = (OooO0oO.o00OO00O) r1
            r6.f2138OooO0oo = r1
            OooO0oO.o00O00O r3 = r6.f2133OooO0OO
            r1.OooO0OO(r3)
            r6.OooO0OO()
        L86:
            OooO0oO.o00OO00O r1 = r6.f2138OooO0oo
            if (r2 == r1) goto L90
            r2 = r1
            androidx.appcompat.widget.ActionMenuView r2 = (androidx.appcompat.widget.ActionMenuView) r2
            r2.setPresenter(r6)
        L90:
            androidx.appcompat.widget.ActionMenuView r1 = (androidx.appcompat.widget.ActionMenuView) r1
            r5.f2027OooO0OO = r1
            java.util.WeakHashMap r6 = OooOooo.o0o0Oo.f1363OooO00o
            r6 = 0
            OooOooo.o00O0O0.OooOOo0(r1, r6)
            androidx.appcompat.widget.ActionMenuView r6 = r5.f2027OooO0OO
            r5.addView(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.OooO0OO(OooO0o.OooO0OO):void");
    }

    public final void OooO0Oo() {
        if (this.f2036OooOOO == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f2036OooOOO = linearLayout;
            this.f2037OooOOOO = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f2038OooOOOo = (TextView) this.f2036OooOOO.findViewById(R.id.action_bar_subtitle);
            int i = this.f2040OooOOo0;
            if (i != 0) {
                this.f2037OooOOOO.setTextAppearance(getContext(), i);
            }
            int i2 = this.f2039OooOOo;
            if (i2 != 0) {
                this.f2038OooOOOo.setTextAppearance(getContext(), i2);
            }
        }
        this.f2037OooOOOO.setText(this.f2024OooO);
        this.f2038OooOOOo.setText(this.f2033OooOO0);
        boolean z = !TextUtils.isEmpty(this.f2024OooO);
        boolean z2 = !TextUtils.isEmpty(this.f2033OooOO0);
        int i3 = 0;
        this.f2038OooOOOo.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.f2036OooOOO;
        if (!z && !z2) {
            i3 = 8;
        }
        linearLayout2.setVisibility(i3);
        if (this.f2036OooOOO.getParent() == null) {
            addView(this.f2036OooOOO);
        }
    }

    public final void OooO0o0() {
        removeAllViews();
        this.OooOOO0 = null;
        this.f2027OooO0OO = null;
        this.f2028OooO0Oo = null;
        View view = this.f2035OooOO0o;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.View
    /* renamed from: OooO0oO */
    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, OooO0OO.OooO00o.f18OooO00o, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        Oooo000 oooo000 = this.f2028OooO0Oo;
        if (oooo000 != null) {
            Configuration configuration2 = oooo000.f2132OooO0O0.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp <= 600 && i2 <= 600 && ((i2 <= 960 || i3 <= 720) && (i2 <= 720 || i3 <= 960))) {
                if (i2 < 500 && ((i2 <= 640 || i3 <= 480) && (i2 <= 480 || i3 <= 640))) {
                    if (i2 >= 360) {
                        i = 3;
                    } else {
                        i = 2;
                    }
                } else {
                    i = 4;
                }
            } else {
                i = 5;
            }
            oooo000.f2144OooOOOo = i;
            OooO0oO.o00O00O o00o00o = oooo000.f2133OooO0OO;
            if (o00o00o != null) {
                o00o00o.OooOOOo(true);
            }
        }
    }

    @Override // android.view.View
    /* renamed from: OooO0oo */
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f2032OooO0oo = false;
        }
        if (!this.f2032OooO0oo) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f2032OooO0oo = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f2032OooO0oo = false;
        }
        return true;
    }

    @Override // android.view.View
    /* renamed from: OooOO0O */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            OooOooo.o0 o0Var = this.f2029OooO0o;
            if (o0Var != null) {
                o0Var.OooO0O0();
            }
            super.setVisibility(i);
        }
    }

    public final OooOooo.o0 OooOO0o(int i, long j) {
        OooOooo.o0 o0Var = this.f2029OooO0o;
        if (o0Var != null) {
            o0Var.OooO0O0();
        }
        OooO00o oooO00o = this.f2025OooO00o;
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            OooOooo.o0 OooO00o2 = OooOooo.o0o0Oo.OooO00o(this);
            OooO00o2.OooO00o(1.0f);
            OooO00o2.OooO0OO(j);
            oooO00o.f2114OooO0OO.f2029OooO0o = OooO00o2;
            oooO00o.f2113OooO0O0 = i;
            OooO00o2.OooO0Oo(oooO00o);
            return OooO00o2;
        }
        OooOooo.o0 OooO00o3 = OooOooo.o0o0Oo.OooO00o(this);
        OooO00o3.OooO00o(0.0f);
        OooO00o3.OooO0OO(j);
        oooO00o.f2114OooO0OO.f2029OooO0o = OooO00o3;
        oooO00o.f2113OooO0O0 = i;
        OooO00o3.OooO0Oo(oooO00o);
        return OooO00o3;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        if (this.f2029OooO0o != null) {
            return this.f2025OooO00o.f2113OooO0O0;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f2030OooO0o0;
    }

    public CharSequence getSubtitle() {
        return this.f2033OooOO0;
    }

    public CharSequence getTitle() {
        return this.f2024OooO;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Oooo000 oooo000 = this.f2028OooO0Oo;
        if (oooo000 != null) {
            oooo000.OooO0o0();
            OooOOO0 oooOOO0 = this.f2028OooO0Oo.f2149OooOo00;
            if (oooOOO0 != null && oooOOO0.OooO0O0()) {
                oooOOO0.f458OooOO0.dismiss();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean OooO00o2 = o0OO0oO0.OooO00o(this);
        int paddingRight = OooO00o2 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f2034OooOO0O;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2034OooOO0O.getLayoutParams();
            int i5 = OooO00o2 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = OooO00o2 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = OooO00o2 ? paddingRight - i5 : paddingRight + i5;
            int OooOO02 = OooOO0(this.f2034OooOO0O, i7, paddingTop, paddingTop2, OooO00o2) + i7;
            paddingRight = OooO00o2 ? OooOO02 - i6 : OooOO02 + i6;
        }
        LinearLayout linearLayout = this.f2036OooOOO;
        if (linearLayout != null && this.OooOOO0 == null && linearLayout.getVisibility() != 8) {
            paddingRight += OooOO0(this.f2036OooOOO, paddingRight, paddingTop, paddingTop2, OooO00o2);
        }
        View view2 = this.OooOOO0;
        if (view2 != null) {
            OooOO0(view2, paddingRight, paddingTop, paddingTop2, OooO00o2);
        }
        int paddingLeft = OooO00o2 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f2027OooO0OO;
        if (actionMenuView != null) {
            OooOO0(actionMenuView, paddingLeft, paddingTop, paddingTop2, !OooO00o2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.f2030OooO0o0;
        if (i3 <= 0) {
            i3 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i4 = i3 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        View view = this.f2034OooOO0O;
        if (view != null) {
            int OooO0o2 = OooO0o(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2034OooOO0O.getLayoutParams();
            paddingLeft = OooO0o2 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f2027OooO0OO;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = OooO0o(this.f2027OooO0OO, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.f2036OooOOO;
        if (linearLayout != null && this.OooOOO0 == null) {
            if (this.f2041OooOOoo) {
                this.f2036OooOOO.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f2036OooOOO.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f2036OooOOO.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = OooO0o(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.OooOOO0;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i5 = layoutParams.width;
            int i6 = i5 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i5 >= 0) {
                paddingLeft = Math.min(i5, paddingLeft);
            }
            int i7 = layoutParams.height;
            int i8 = i7 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i7 >= 0) {
                i4 = Math.min(i7, i4);
            }
            this.OooOOO0.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i4, i8));
        }
        if (this.f2030OooO0o0 <= 0) {
            int childCount = getChildCount();
            i3 = 0;
            for (int i9 = 0; i9 < childCount; i9++) {
                int measuredHeight = getChildAt(i9).getMeasuredHeight() + paddingBottom;
                if (measuredHeight > i3) {
                    i3 = measuredHeight;
                }
            }
        }
        setMeasuredDimension(size, i3);
    }

    public void setContentHeight(int i) {
        this.f2030OooO0o0 = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.OooOOO0;
        if (view2 != null) {
            removeView(view2);
        }
        this.OooOOO0 = view;
        if (view != null && (linearLayout = this.f2036OooOOO) != null) {
            removeView(linearLayout);
            this.f2036OooOOO = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f2033OooOO0 = charSequence;
        OooO0Oo();
    }

    public void setTitle(CharSequence charSequence) {
        this.f2024OooO = charSequence;
        OooO0Oo();
        OooOooo.o0o0Oo.OooOOO0(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f2041OooOOoo) {
            requestLayout();
        }
        this.f2041OooOOoo = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}