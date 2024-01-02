package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import hieubui.eup.android_app_security.R;

/* loaded from: classes.dex */
public final class o000O0o extends o00Oo00 implements o000O00 {

    /* renamed from: OooOoo  reason: collision with root package name */
    public CharSequence f2305OooOoo;

    /* renamed from: OooOooO  reason: collision with root package name */
    public ListAdapter f2306OooOooO;

    /* renamed from: OooOooo  reason: collision with root package name */
    public final Rect f2307OooOooo;

    /* renamed from: Oooo000  reason: collision with root package name */
    public int f2308Oooo000;

    /* renamed from: Oooo00O  reason: collision with root package name */
    public final /* synthetic */ o000O00O f2309Oooo00O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0o(o000O00O o000o00o, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.f2309Oooo00O = o000o00o;
        this.f2307OooOooo = new Rect();
        this.f2387OooOOOO = o000o00o;
        this.f2398OooOoO0 = true;
        this.f2397OooOoO.setFocusable(true);
        this.f2388OooOOOo = new OooO0Oo.OooO0o(this, 1, o000o00o);
    }

    @Override // androidx.appcompat.widget.o000O00
    public final CharSequence OooO00o() {
        return this.f2305OooOoo;
    }

    @Override // androidx.appcompat.widget.o000O00
    public final void OooO0o(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        boolean OooO0O02 = OooO0O0();
        OooOOoo();
        o00000O o00000o = this.f2397OooOoO;
        o00000o.setInputMethodMode(2);
        OooO();
        o00OO000 o00oo000 = this.f2377OooO0OO;
        o00oo000.setChoiceMode(1);
        o000OO.OooO0Oo(o00oo000, i);
        o000OO.OooO0OO(o00oo000, i2);
        o000O00O o000o00o = this.f2309Oooo00O;
        int selectedItemPosition = o000o00o.getSelectedItemPosition();
        o00OO000 o00oo0002 = this.f2377OooO0OO;
        if (OooO0O0() && o00oo0002 != null) {
            o00oo0002.setListSelectionHidden(false);
            o00oo0002.setSelection(selectedItemPosition);
            if (o00oo0002.getChoiceMode() != 0) {
                o00oo0002.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!OooO0O02 && (viewTreeObserver = o000o00o.getViewTreeObserver()) != null) {
            OooO0oO.o000O o000o = new OooO0oO.o000O(3, this);
            viewTreeObserver.addOnGlobalLayoutListener(o000o);
            o00000o.setOnDismissListener(new o000O000(this, o000o));
        }
    }

    @Override // androidx.appcompat.widget.o000O00
    public final void OooO0oo(CharSequence charSequence) {
        this.f2305OooOoo = charSequence;
    }

    @Override // androidx.appcompat.widget.o00Oo00, androidx.appcompat.widget.o000O00
    public final void OooOOOO(ListAdapter listAdapter) {
        super.OooOOOO(listAdapter);
        this.f2306OooOooO = listAdapter;
    }

    @Override // androidx.appcompat.widget.o000O00
    public final void OooOOOo(int i) {
        this.f2308Oooo000 = i;
    }

    public final void OooOOoo() {
        int i;
        int i2;
        Drawable OooOOO2 = OooOOO();
        o000O00O o000o00o = this.f2309Oooo00O;
        if (OooOOO2 != null) {
            OooOOO2.getPadding(o000o00o.f2300OooO0oo);
            if (o0OO0oO0.OooO00o(o000o00o)) {
                i = o000o00o.f2300OooO0oo.right;
            } else {
                i = -o000o00o.f2300OooO0oo.left;
            }
        } else {
            Rect rect = o000o00o.f2300OooO0oo;
            rect.right = 0;
            rect.left = 0;
            i = 0;
        }
        int paddingLeft = o000o00o.getPaddingLeft();
        int paddingRight = o000o00o.getPaddingRight();
        int width = o000o00o.getWidth();
        int i3 = o000o00o.f2299OooO0oO;
        if (i3 == -2) {
            int OooO00o2 = o000o00o.OooO00o((SpinnerAdapter) this.f2306OooOooO, OooOOO());
            int i4 = o000o00o.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = o000o00o.f2300OooO0oo;
            int i5 = (i4 - rect2.left) - rect2.right;
            if (OooO00o2 > i5) {
                OooO00o2 = i5;
            }
            i3 = Math.max(OooO00o2, (width - paddingLeft) - paddingRight);
        } else if (i3 == -1) {
            i3 = (width - paddingLeft) - paddingRight;
        }
        OooOOo(i3);
        if (o0OO0oO0.OooO00o(o000o00o)) {
            i2 = (((width - paddingRight) - this.f2380OooO0o0) - this.f2308Oooo000) + i;
        } else {
            i2 = paddingLeft + this.f2308Oooo000 + i;
        }
        this.f2379OooO0o = i2;
    }
}