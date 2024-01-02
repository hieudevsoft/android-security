package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: OooO00o  reason: collision with root package name */
    public TypedValue f2086OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public TypedValue f2087OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public TypedValue f2088OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public TypedValue f2089OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public TypedValue f2090OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public TypedValue f2091OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final Rect f2092OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public o00O0O00 f2093OooO0oo;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f2092OooO0oO = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f2091OooO0o0 == null) {
            this.f2091OooO0o0 = new TypedValue();
        }
        return this.f2091OooO0o0;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f2090OooO0o == null) {
            this.f2090OooO0o = new TypedValue();
        }
        return this.f2090OooO0o;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f2088OooO0OO == null) {
            this.f2088OooO0OO = new TypedValue();
        }
        return this.f2088OooO0OO;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f2089OooO0Oo == null) {
            this.f2089OooO0Oo = new TypedValue();
        }
        return this.f2089OooO0Oo;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f2086OooO00o == null) {
            this.f2086OooO00o = new TypedValue();
        }
        return this.f2086OooO00o;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f2087OooO0O0 == null) {
            this.f2087OooO0O0 = new TypedValue();
        }
        return this.f2087OooO0O0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o00O0O00 o00o0o00 = this.f2093OooO0oo;
        if (o00o0o00 != null) {
            o00o0o00.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Oooo000 oooo000;
        super.onDetachedFromWindow();
        o00O0O00 o00o0o00 = this.f2093OooO0oo;
        if (o00o0o00 != null) {
            OooO0Oo.o00000OO o00000oo2 = ((OooO0Oo.oo000o) o00o0o00).f249OooO0O0;
            o00O0O0 o00o0o0 = o00000oo2.f128OooOOo;
            if (o00o0o0 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) o00o0o0;
                actionBarOverlayLayout.OooOO0o();
                ActionMenuView actionMenuView = ((o0OO00OO) actionBarOverlayLayout.f2050OooO0o0).f2490OooO00o.f2197OooO00o;
                if (actionMenuView != null && (oooo000 = actionMenuView.f2076OooOo00) != null) {
                    oooo000.OooO0o0();
                    OooOOO0 oooOOO0 = oooo000.f2149OooOo00;
                    if (oooOOO0 != null && oooOOO0.OooO0O0()) {
                        oooOOO0.f458OooOO0.dismiss();
                    }
                }
            }
            if (o00000oo2.f135OooOo0o != null) {
                o00000oo2.f124OooOO0o.getDecorView().removeCallbacks(o00000oo2.f131OooOo);
                if (o00000oo2.f135OooOo0o.isShowing()) {
                    try {
                        o00000oo2.f135OooOo0o.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                o00000oo2.f135OooOo0o = null;
            }
            OooOooo.o0 o0Var = o00000oo2.f137OooOoO0;
            if (o0Var != null) {
                o0Var.OooO0O0();
            }
            OooO0oO.o00O00O o00o00o = o00000oo2.OooOoO(0).f110OooO0oo;
            if (o00o00o != null) {
                o00o00o.OooO0OO(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(o00O0O00 o00o0o00) {
        this.f2093OooO0oo = o00o0o00;
    }
}