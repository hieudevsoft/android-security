package androidx.appcompat.view.menu;

import OooO0OO.OooO00o;
import OooO0oO.o000O0Oo;
import OooO0oO.o000OO0O;
import OooO0oO.o00O00;
import OooO0oO.o00O00O;
import OooO0oO.o00O00OO;
import OooO0oO.o00OO000;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Oooo0;
import androidx.appcompat.widget.o00oOoo;

/* loaded from: classes.dex */
public class ActionMenuItemView extends o00oOoo implements o00OO000, View.OnClickListener, Oooo0 {

    /* renamed from: OooO  reason: collision with root package name */
    public CharSequence f1987OooO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public o00O00OO f1988OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public Drawable f1989OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public o00O00 f1990OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public o000O0Oo f1991OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public boolean f1992OooOOO;
    public o000OO0O OooOOO0;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public boolean f1993OooOOOO;

    /* renamed from: OooOOOo  reason: collision with root package name */
    public final int f1994OooOOOo;

    /* renamed from: OooOOo  reason: collision with root package name */
    public final int f1995OooOOo;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public int f1996OooOOo0;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f1992OooOOO = OooOOO0();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooO00o.f20OooO0OO, 0, 0);
        this.f1994OooOOOo = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f1995OooOOo = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1996OooOOo0 = -1;
        setSaveEnabled(false);
    }

    @Override // androidx.appcompat.widget.Oooo0
    public final boolean OooO00o() {
        return OooOO0o() && this.f1988OooO0oo.getIcon() == null;
    }

    @Override // androidx.appcompat.widget.Oooo0
    public final boolean OooO0O0() {
        return OooOO0o();
    }

    @Override // OooO0oO.o00OO000
    public final void OooO0Oo(o00O00OO o00o00oo) {
        int i;
        this.f1988OooO0oo = o00o00oo;
        setIcon(o00o00oo.getIcon());
        setTitle(o00o00oo.getTitleCondensed());
        setId(o00o00oo.f413OooO00o);
        if (o00o00oo.isVisible()) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
        setEnabled(o00o00oo.isEnabled());
        if (o00o00oo.hasSubMenu() && this.f1991OooOO0o == null) {
            this.f1991OooOO0o = new o000O0Oo(this);
        }
    }

    public final boolean OooOO0o() {
        return !TextUtils.isEmpty(getText());
    }

    public final void OooOOO() {
        CharSequence charSequence;
        boolean z;
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.f1987OooO);
        if (this.f1989OooOO0 != null) {
            if ((this.f1988OooO0oo.f436OooOoO0 & 4) == 4) {
                z = true;
            } else {
                z = false;
            }
            if (!z || (!this.f1992OooOOO && !this.f1993OooOOOO)) {
                z2 = false;
            }
        }
        boolean z4 = z3 & z2;
        CharSequence charSequence2 = null;
        if (z4) {
            charSequence = this.f1987OooO;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence charSequence3 = this.f1988OooO0oo.f428OooOOo0;
        if (TextUtils.isEmpty(charSequence3)) {
            if (z4) {
                charSequence3 = null;
            } else {
                charSequence3 = this.f1988OooO0oo.f418OooO0o0;
            }
        }
        setContentDescription(charSequence3);
        CharSequence charSequence4 = this.f1988OooO0oo.f427OooOOo;
        if (TextUtils.isEmpty(charSequence4)) {
            if (!z4) {
                charSequence2 = this.f1988OooO0oo.f418OooO0o0;
            }
            o0000O00.OooO00o.o000o0oO(this, charSequence2);
            return;
        }
        o0000O00.OooO00o.o000o0oO(this, charSequence4);
    }

    public final boolean OooOOO0() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // OooO0oO.o00OO000
    public o00O00OO getItemData() {
        return this.f1988OooO0oo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        o00O00 o00o00 = this.f1990OooOO0O;
        if (o00o00 != null) {
            o00o00.OooO0O0(this.f1988OooO0oo);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1992OooOOO = OooOOO0();
        OooOOO();
    }

    @Override // androidx.appcompat.widget.o00oOoo, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean OooOO0o2 = OooOO0o();
        if (OooOO0o2 && (i3 = this.f1996OooOOo0) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.f1994OooOOOo;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (OooOO0o2 || this.f1989OooOO0 == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f1989OooOO0.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        o000O0Oo o000o0oo;
        if (this.f1988OooO0oo.hasSubMenu() && (o000o0oo = this.f1991OooOO0o) != null && o000o0oo.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f1993OooOOOO != z) {
            this.f1993OooOOOO = z;
            o00O00OO o00o00oo = this.f1988OooO0oo;
            if (o00o00oo != null) {
                o00O00O o00o00o = o00o00oo.f424OooOOO;
                o00o00o.f399OooOO0O = true;
                o00o00o.OooOOOo(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1989OooOO0 = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f1995OooOOo;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        OooOOO();
    }

    public void setItemInvoker(o00O00 o00o00) {
        this.f1990OooOO0O = o00o00;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f1996OooOOo0 = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(o000OO0O o000oo0o) {
        this.OooOOO0 = o000oo0o;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1987OooO = charSequence;
        OooOOO();
    }
}