package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

/* loaded from: classes.dex */
public final class o000000O implements Oooo000.o000OOo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public int f2265OooO00o = 0;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final View f2266OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public Object f2267OooO0OO;

    public o000000O(ImageView imageView) {
        this.f2266OooO0O0 = imageView;
    }

    public final void OooO00o() {
        o0O0o00O o0o0o00o;
        ImageView imageView = (ImageView) this.f2266OooO0O0;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            o00O0OO0.OooO00o(drawable);
        }
        if (drawable == null || (o0o0o00o = (o0O0o00O) this.f2267OooO0OO) == null) {
            return;
        }
        o0Oo0oo.OooO0o0(drawable, o0o0o00o, imageView.getDrawableState());
    }

    public final void OooO0O0(AttributeSet attributeSet, int i) {
        int OooO2;
        View view = this.f2266OooO0O0;
        ImageView imageView = (ImageView) view;
        Context context = imageView.getContext();
        int[] iArr = OooO0OO.OooO00o.f22OooO0o;
        o0oO0O0o OooOOO0 = o0oO0O0o.OooOOO0(context, attributeSet, iArr, i);
        OooOooo.o0o0Oo.OooOO0O(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) OooOOO0.f2540OooO0O0, i);
        try {
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null && (OooO2 = OooOOO0.OooO(1, -1)) != -1 && (drawable = o0000O00.OooO00o.o0ooOoO(((ImageView) view).getContext(), OooO2)) != null) {
                ((ImageView) view).setImageDrawable(drawable);
            }
            if (drawable != null) {
                o00O0OO0.OooO00o(drawable);
            }
            if (OooOOO0.OooOO0o(2)) {
                Oooo0.OooOO0.OooO0OO((ImageView) view, OooOOO0.OooO0O0(2));
            }
            if (OooOOO0.OooOO0o(3)) {
                Oooo0.OooOO0.OooO0Oo((ImageView) view, o00O0OO0.OooO0O0(OooOOO0.OooO0oo(3, -1), null));
            }
        } finally {
            OooOOO0.OooOOOO();
        }
    }

    public final void OooO0OO(int i) {
        Drawable drawable;
        ImageView imageView = (ImageView) this.f2266OooO0O0;
        if (i != 0) {
            drawable = o0000O00.OooO00o.o0ooOoO(imageView.getContext(), i);
            if (drawable != null) {
                o00O0OO0.OooO00o(drawable);
            }
        } else {
            drawable = null;
        }
        imageView.setImageDrawable(drawable);
        OooO00o();
    }

    public final void OooO0Oo(ColorStateList colorStateList) {
        if (((o0O0o00O) this.f2267OooO0OO) == null) {
            this.f2267OooO0OO = new o0O0o00O(0);
        }
        o0O0o00O o0o0o00o = (o0O0o00O) this.f2267OooO0OO;
        o0o0o00o.f2477OooO0OO = colorStateList;
        o0o0o00o.f2476OooO0O0 = true;
        OooO00o();
    }

    @Override // Oooo000.o000OOo
    public final boolean OooO0o(View view) {
        throw null;
    }

    public final void OooO0o0(PorterDuff.Mode mode) {
        if (((o0O0o00O) this.f2267OooO0OO) == null) {
            this.f2267OooO0OO = new o0O0o00O(0);
        }
        o0O0o00O o0o0o00o = (o0O0o00O) this.f2267OooO0OO;
        o0o0o00o.f2478OooO0Oo = mode;
        o0o0o00o.f2475OooO00o = true;
        OooO00o();
    }
}