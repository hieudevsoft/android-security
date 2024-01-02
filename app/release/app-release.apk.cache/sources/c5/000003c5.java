package com.google.android.material.appbar;

import OooO0oO.o00O00O;
import OooOOoo.o0Oo0oo;
import OooOoO0.o0OOO0o;
import OooOooo.o00O0O0;
import OooOooo.o0o0Oo;
import OooOooo.oo0oOO0;
import OooooO0.o0000O;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.gson.internal.OooO0o;
import hieubui.eup.android_app_security.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import o0000O00.OooO00o;
import o0ooOO0.OooOOOO;

/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: OoooOOO  reason: collision with root package name */
    public static final ImageView.ScaleType[] f3232OoooOOO = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: OoooO  reason: collision with root package name */
    public boolean f3233OoooO;

    /* renamed from: OoooO0  reason: collision with root package name */
    public Integer f3234OoooO0;

    /* renamed from: OoooO0O  reason: collision with root package name */
    public boolean f3235OoooO0O;

    /* renamed from: OoooOO0  reason: collision with root package name */
    public ImageView.ScaleType f3236OoooOO0;

    /* renamed from: o000oOoO  reason: collision with root package name */
    public Boolean f3237o000oOoO;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(OooO0o.OooOo0o(context, attributeSet, R.attr.toolbarStyle, 2131756120), attributeSet, 0);
        ColorStateList o0ooOO02;
        Context context2 = getContext();
        TypedArray OooOOOO2 = OooO0o.OooOOOO(context2, attributeSet, o0000O.f1803OooOOoo, R.attr.toolbarStyle, 2131756120, new int[0]);
        if (OooOOOO2.hasValue(2)) {
            setNavigationIconTint(OooOOOO2.getColor(2, -1));
        }
        this.f3235OoooO0O = OooOOOO2.getBoolean(4, false);
        this.f3233OoooO = OooOOOO2.getBoolean(3, false);
        int i = OooOOOO2.getInt(1, -1);
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f3232OoooOOO;
            if (i < scaleTypeArr.length) {
                this.f3236OoooOO0 = scaleTypeArr[i];
            }
        }
        if (OooOOOO2.hasValue(0)) {
            this.f3237o000oOoO = Boolean.valueOf(OooOOOO2.getBoolean(0, false));
        }
        OooOOOO2.recycle();
        Drawable background = getBackground();
        if (background == null) {
            o0ooOO02 = ColorStateList.valueOf(0);
        } else {
            o0ooOO02 = OooO00o.o0ooOO0(background);
        }
        if (o0ooOO02 != null) {
            OooOOOO oooOOOO = new OooOOOO();
            oooOOOO.OooOO0(o0ooOO02);
            oooOOOO.OooO0oo(context2);
            WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
            oooOOOO.OooO(oo0oOO0.OooO(this));
            o00O0O0.OooOOo0(this, oooOOOO);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void OooOO0O(int i) {
        Menu menu = getMenu();
        boolean z = menu instanceof o00O00O;
        if (z) {
            ((o00O00O) menu).OooOo0o();
        }
        super.OooOO0O(i);
        if (z) {
            ((o00O00O) menu).OooOo0O();
        }
    }

    public final void OooOo00(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i2, textView.getBottom());
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f3236OoooOO0;
    }

    public Integer getNavigationIconTint() {
        return this.f3234OoooO0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof OooOOOO) {
            OooO00o.o000o0O(this, (OooOOOO) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TextView textView;
        TextView textView2;
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        ImageView imageView2 = null;
        if (this.f3235OoooO0O || this.f3233OoooO) {
            ArrayList OooOOO2 = OooO0o.OooOOO(this, getTitle());
            boolean isEmpty = OooOOO2.isEmpty();
            o0Oo0oo o0oo0oo = OooO0o.f3789OooO0o;
            if (isEmpty) {
                textView = null;
            } else {
                textView = (TextView) Collections.min(OooOOO2, o0oo0oo);
            }
            ArrayList OooOOO3 = OooO0o.OooOOO(this, getSubtitle());
            if (OooOOO3.isEmpty()) {
                textView2 = null;
            } else {
                textView2 = (TextView) Collections.max(OooOOO3, o0oo0oo);
            }
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i6 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i6 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i6 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f3235OoooO0O && textView != null) {
                    OooOo00(textView, pair);
                }
                if (this.f3233OoooO && textView2 != null) {
                    OooOo00(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i5 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i5);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i5++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f3237o000oOoO;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f3236OoooOO0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof OooOOOO) {
            ((OooOOOO) background).OooO(f);
        }
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.f3237o000oOoO;
        if (bool == null || bool.booleanValue() != z) {
            this.f3237o000oOoO = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f3236OoooOO0 != scaleType) {
            this.f3236OoooOO0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f3234OoooO0 != null) {
            drawable = drawable.mutate();
            o0OOO0o.OooO0oO(drawable, this.f3234OoooO0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.f3234OoooO0 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.f3233OoooO != z) {
            this.f3233OoooO = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.f3235OoooO0O != z) {
            this.f3235OoooO0O = z;
            requestLayout();
        }
    }
}