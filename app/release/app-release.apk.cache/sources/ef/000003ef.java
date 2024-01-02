package com.google.android.material.internal;

import OooO0oO.o00O00OO;
import OooO0oO.o00OO000;
import OooOo0o.o0000;
import OooOo0o.o000000;
import OooOoO0.o0OOO0o;
import OooOooo.o00O0O0;
import OooOooo.o0o0Oo;
import Oooo0.o0OoOo0;
import OooooOo.oO00O0oO;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.oo0O;
import hieubui.eup.android_app_security.R;
import java.util.WeakHashMap;
import o0000O00.OooO00o;
import o00o0O.OooO;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends OooO implements o00OO000 {

    /* renamed from: Oooo00O  reason: collision with root package name */
    public static final int[] f3456Oooo00O = {16842912};

    /* renamed from: OooOo  reason: collision with root package name */
    public boolean f3457OooOo;

    /* renamed from: OooOo0O  reason: collision with root package name */
    public int f3458OooOo0O;

    /* renamed from: OooOo0o  reason: collision with root package name */
    public boolean f3459OooOo0o;

    /* renamed from: OooOoO  reason: collision with root package name */
    public final CheckedTextView f3460OooOoO;

    /* renamed from: OooOoO0  reason: collision with root package name */
    public final boolean f3461OooOoO0;

    /* renamed from: OooOoOO  reason: collision with root package name */
    public FrameLayout f3462OooOoOO;

    /* renamed from: OooOoo  reason: collision with root package name */
    public ColorStateList f3463OooOoo;

    /* renamed from: OooOoo0  reason: collision with root package name */
    public o00O00OO f3464OooOoo0;

    /* renamed from: OooOooO  reason: collision with root package name */
    public boolean f3465OooOooO;

    /* renamed from: OooOooo  reason: collision with root package name */
    public Drawable f3466OooOooo;

    /* renamed from: Oooo000  reason: collision with root package name */
    public final oO00O0oO f3467Oooo000;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3461OooOoO0 = true;
        oO00O0oO oo00o0oo = new oO00O0oO(3, this);
        this.f3467Oooo000 = oo00o0oo;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.f3460OooOoO = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        o0o0Oo.OooOO0o(checkedTextView, oo00o0oo);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f3462OooOoOO == null) {
                this.f3462OooOoOO = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.f3462OooOoOO.removeAllViews();
            this.f3462OooOoOO.addView(view);
        }
    }

    @Override // OooO0oO.o00OO000
    public final void OooO0Oo(o00O00OO o00o00oo) {
        int i;
        oo0O oo0o;
        int i2;
        StateListDrawable stateListDrawable;
        this.f3464OooOoo0 = o00o00oo;
        int i3 = o00o00oo.f413OooO00o;
        if (i3 > 0) {
            setId(i3);
        }
        if (o00o00oo.isVisible()) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
        boolean z = true;
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f3456Oooo00O, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
            o00O0O0.OooOOo0(this, stateListDrawable);
        }
        setCheckable(o00o00oo.isCheckable());
        setChecked(o00o00oo.isChecked());
        setEnabled(o00o00oo.isEnabled());
        setTitle(o00o00oo.f418OooO0o0);
        setIcon(o00o00oo.getIcon());
        setActionView(o00o00oo.getActionView());
        setContentDescription(o00o00oo.f428OooOOo0);
        OooO00o.o000o0oO(this, o00o00oo.f427OooOOo);
        o00O00OO o00o00oo2 = this.f3464OooOoo0;
        if (o00o00oo2.f418OooO0o0 != null || o00o00oo2.getIcon() != null || this.f3464OooOoo0.getActionView() == null) {
            z = false;
        }
        CheckedTextView checkedTextView = this.f3460OooOoO;
        if (z) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f3462OooOoOO;
            if (frameLayout != null) {
                oo0o = (oo0O) frameLayout.getLayoutParams();
                i2 = -1;
            } else {
                return;
            }
        } else {
            checkedTextView.setVisibility(0);
            FrameLayout frameLayout2 = this.f3462OooOoOO;
            if (frameLayout2 != null) {
                oo0o = (oo0O) frameLayout2.getLayoutParams();
                i2 = -2;
            } else {
                return;
            }
        }
        ((LinearLayout.LayoutParams) oo0o).width = i2;
        this.f3462OooOoOO.setLayoutParams(oo0o);
    }

    @Override // OooO0oO.o00OO000
    public o00O00OO getItemData() {
        return this.f3464OooOoo0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        o00O00OO o00o00oo = this.f3464OooOoo0;
        if (o00o00oo != null && o00o00oo.isCheckable() && this.f3464OooOoo0.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f3456Oooo00O);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f3457OooOo != z) {
            this.f3457OooOo = z;
            this.f3467Oooo000.OooO0oo(this.f3460OooOoO, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f3460OooOoO;
        checkedTextView.setChecked(z);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z && this.f3461OooOoO0) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f3465OooOooO) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                o0OOO0o.OooO0oo(drawable, this.f3463OooOoo);
            }
            int i = this.f3458OooOo0O;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f3459OooOo0o) {
            if (this.f3466OooOooo == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = o0000.f1155OooO00o;
                Drawable OooO00o2 = o000000.OooO00o(resources, R.drawable.navigation_empty_icon, theme);
                this.f3466OooOooo = OooO00o2;
                if (OooO00o2 != null) {
                    int i2 = this.f3458OooOo0O;
                    OooO00o2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f3466OooOooo;
        }
        o0OoOo0.OooO0o0(this.f3460OooOoO, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f3460OooOoO.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f3458OooOo0O = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f3463OooOoo = colorStateList;
        this.f3465OooOooO = colorStateList != null;
        o00O00OO o00o00oo = this.f3464OooOoo0;
        if (o00o00oo != null) {
            setIcon(o00o00oo.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f3460OooOoO.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f3459OooOo0o = z;
    }

    public void setTextAppearance(int i) {
        this.f3460OooOoO.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f3460OooOoO.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f3460OooOoO.setText(charSequence);
    }
}