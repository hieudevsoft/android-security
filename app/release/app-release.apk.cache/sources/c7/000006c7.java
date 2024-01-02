package o0OOO0o;

import OooooO0.o0000O;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.o00000O;
import androidx.appcompat.widget.o00Oo00;
import androidx.appcompat.widget.o0O00OOO;
import com.google.android.material.textfield.TextInputLayout;
import hieubui.eup.android_app_security.R;
import java.util.Locale;

/* loaded from: classes.dex */
public final class oo000o extends androidx.appcompat.widget.o00O0O {

    /* renamed from: OooO  reason: collision with root package name */
    public final float f5428OooO;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final AccessibilityManager f5429OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final o00Oo00 f5430OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final Rect f5431OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final int f5432OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public ColorStateList f5433OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public int f5434OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public ColorStateList f5435OooOO0o;

    public oo000o(Context context, AttributeSet attributeSet) {
        super(com.google.gson.internal.OooO0o.OooOo0o(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.f5431OooO0oO = new Rect();
        Context context2 = getContext();
        TypedArray OooOOOO2 = com.google.gson.internal.OooO0o.OooOOOO(context2, attributeSet, o0000O.f1786OooO, R.attr.autoCompleteTextViewStyle, 2131755759, new int[0]);
        if (OooOOOO2.hasValue(0) && OooOOOO2.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f5432OooO0oo = OooOOOO2.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.f5428OooO = OooOOOO2.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (OooOOOO2.hasValue(2)) {
            this.f5433OooOO0 = ColorStateList.valueOf(OooOOOO2.getColor(2, 0));
        }
        this.f5434OooOO0O = OooOOOO2.getColor(4, 0);
        this.f5435OooOO0o = o0000O00.OooO00o.o00oO0o(context2, OooOOOO2, 5);
        this.f5429OooO0o = (AccessibilityManager) context2.getSystemService("accessibility");
        o00Oo00 o00oo00 = new o00Oo00(context2, null, R.attr.listPopupWindowStyle, 0);
        this.f5430OooO0o0 = o00oo00;
        o00oo00.f2398OooOoO0 = true;
        o00000O o00000o = o00oo00.f2397OooOoO;
        o00000o.setFocusable(true);
        o00oo00.f2387OooOOOO = this;
        o00000o.setInputMethodMode(2);
        o00oo00.OooOOOO(getAdapter());
        o00oo00.f2388OooOOOo = new o0O00OOO(this, 1);
        if (OooOOOO2.hasValue(6)) {
            setSimpleItems(OooOOOO2.getResourceId(6, 0));
        }
        OooOOOO2.recycle();
    }

    public static void OooO00o(oo000o oo000oVar, Object obj) {
        oo000oVar.setText(oo000oVar.convertSelectionToString(obj), false);
    }

    public final TextInputLayout OooO0O0() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        boolean z;
        AccessibilityManager accessibilityManager = this.f5429OooO0o;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f5430OooO0o0.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f5433OooOO0;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout OooO0O02 = OooO0O0();
        if (OooO0O02 != null && OooO0O02.f3525OooOooo) {
            return OooO0O02.getHint();
        }
        return super.getHint();
    }

    public float getPopupElevation() {
        return this.f5428OooO;
    }

    public int getSimpleItemSelectedColor() {
        return this.f5434OooOO0O;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f5435OooOO0o;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        String str;
        super.onAttachedToWindow();
        TextInputLayout OooO0O02 = OooO0O0();
        if (OooO0O02 != null && OooO0O02.f3525OooOooo && super.getHint() == null) {
            String str2 = Build.MANUFACTURER;
            if (str2 == null) {
                str = "";
            } else {
                str = str2.toLowerCase(Locale.ENGLISH);
            }
            if (str.equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5430OooO0o0.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int selectedItemPosition;
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout OooO0O02 = OooO0O0();
            int i3 = 0;
            if (adapter != null && OooO0O02 != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                o00Oo00 o00oo00 = this.f5430OooO0o0;
                if (!o00oo00.OooO0O0()) {
                    selectedItemPosition = -1;
                } else {
                    selectedItemPosition = o00oo00.f2377OooO0OO.getSelectedItemPosition();
                }
                int min = Math.min(adapter.getCount(), Math.max(0, selectedItemPosition) + 15);
                View view = null;
                int i4 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i3) {
                        view = null;
                        i3 = itemViewType;
                    }
                    view = adapter.getView(max, view, OooO0O02);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i4 = Math.max(i4, view.getMeasuredWidth());
                }
                Drawable OooOOO2 = o00oo00.OooOOO();
                if (OooOOO2 != null) {
                    Rect rect = this.f5431OooO0oO;
                    OooOOO2.getPadding(rect);
                    i4 += rect.left + rect.right;
                }
                i3 = OooO0O02.getEndIconView().getMeasuredWidth() + i4;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i3), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean z2;
        AccessibilityManager accessibilityManager = this.f5429OooO0o;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.f5430OooO0o0.OooOOOO(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        o00Oo00 o00oo00 = this.f5430OooO0o0;
        if (o00oo00 != null) {
            o00oo00.OooOO0o(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f5433OooOO0 = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof o0ooOO0.OooOOOO) {
            ((o0ooOO0.OooOOOO) dropDownBackground).OooOO0(this.f5433OooOO0);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f5430OooO0o0.f2390OooOOo0 = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout OooO0O02 = OooO0O0();
        if (OooO0O02 != null) {
            OooO0O02.OooOOo();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.f5434OooOO0O = i;
        if (getAdapter() instanceof o00Ooo) {
            ((o00Ooo) getAdapter()).OooO00o();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f5435OooOO0o = colorStateList;
        if (getAdapter() instanceof o00Ooo) {
            ((o00Ooo) getAdapter()).OooO00o();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        boolean z;
        AccessibilityManager accessibilityManager = this.f5429OooO0o;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f5430OooO0o0.OooO();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new o00Ooo(this, getContext(), this.f5432OooO0oo, strArr));
    }
}