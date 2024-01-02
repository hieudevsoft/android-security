package o000oOoO;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class o0O0O00 extends o000OOo {

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final /* synthetic */ int f5108OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0O0O00(o000OO o000oo, int i) {
        super(o000oo);
        this.f5108OooO0Oo = i;
    }

    @Override // o000oOoO.o000OOo
    public final int OooO() {
        int OooOooo2;
        int OooOoo02;
        int i = this.f5108OooO0Oo;
        o000OO o000oo = this.f5026OooO00o;
        switch (i) {
            case 0:
                OooOooo2 = o000oo.f5017OooOOO - o000oo.OooOoo();
                OooOoo02 = o000oo.OooOooO();
                break;
            default:
                OooOooo2 = o000oo.f5018OooOOOO - o000oo.OooOooo();
                OooOoo02 = o000oo.OooOoo0();
                break;
        }
        return OooOooo2 - OooOoo02;
    }

    @Override // o000oOoO.o000OOo
    public final int OooO0O0(View view) {
        int bottom;
        int i;
        int i2 = this.f5108OooO0Oo;
        o000OO o000oo = this.f5026OooO00o;
        switch (i2) {
            case 0:
                o000oo.getClass();
                bottom = view.getRight() + ((o0000O) view.getLayoutParams()).f4955OooO0O0.right;
                i = ((ViewGroup.MarginLayoutParams) ((o0000O) view.getLayoutParams())).rightMargin;
                break;
            default:
                o000oo.getClass();
                bottom = view.getBottom() + ((o0000O) view.getLayoutParams()).f4955OooO0O0.bottom;
                i = ((ViewGroup.MarginLayoutParams) ((o0000O) view.getLayoutParams())).bottomMargin;
                break;
        }
        return bottom + i;
    }

    @Override // o000oOoO.o000OOo
    public final int OooO0OO(View view) {
        int measuredHeight;
        int i;
        int i2 = this.f5108OooO0Oo;
        o000OO o000oo = this.f5026OooO00o;
        switch (i2) {
            case 0:
                o0000O o0000o2 = (o0000O) view.getLayoutParams();
                o000oo.getClass();
                Rect rect = ((o0000O) view.getLayoutParams()).f4955OooO0O0;
                measuredHeight = view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) o0000o2).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) o0000o2).rightMargin;
                break;
            default:
                o0000O o0000o3 = (o0000O) view.getLayoutParams();
                o000oo.getClass();
                Rect rect2 = ((o0000O) view.getLayoutParams()).f4955OooO0O0;
                measuredHeight = view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) o0000o3).topMargin;
                i = ((ViewGroup.MarginLayoutParams) o0000o3).bottomMargin;
                break;
        }
        return measuredHeight + i;
    }

    @Override // o000oOoO.o000OOo
    public final int OooO0Oo(View view) {
        int top;
        int i;
        int i2 = this.f5108OooO0Oo;
        o000OO o000oo = this.f5026OooO00o;
        switch (i2) {
            case 0:
                o000oo.getClass();
                top = view.getLeft() - ((o0000O) view.getLayoutParams()).f4955OooO0O0.left;
                i = ((ViewGroup.MarginLayoutParams) ((o0000O) view.getLayoutParams())).leftMargin;
                break;
            default:
                o000oo.getClass();
                top = view.getTop() - ((o0000O) view.getLayoutParams()).f4955OooO0O0.top;
                i = ((ViewGroup.MarginLayoutParams) ((o0000O) view.getLayoutParams())).topMargin;
                break;
        }
        return top - i;
    }

    @Override // o000oOoO.o000OOo
    public final int OooO0o() {
        int i;
        int OooOoo02;
        int i2 = this.f5108OooO0Oo;
        o000OO o000oo = this.f5026OooO00o;
        switch (i2) {
            case 0:
                i = o000oo.f5017OooOOO;
                OooOoo02 = o000oo.OooOooO();
                break;
            default:
                i = o000oo.f5018OooOOOO;
                OooOoo02 = o000oo.OooOoo0();
                break;
        }
        return i - OooOoo02;
    }

    @Override // o000oOoO.o000OOo
    public final int OooO0o0() {
        int i = this.f5108OooO0Oo;
        o000OO o000oo = this.f5026OooO00o;
        switch (i) {
            case 0:
                return o000oo.f5017OooOOO;
            default:
                return o000oo.f5018OooOOOO;
        }
    }

    @Override // o000oOoO.o000OOo
    public final int OooO0oO() {
        int i = this.f5108OooO0Oo;
        o000OO o000oo = this.f5026OooO00o;
        switch (i) {
            case 0:
                return o000oo.f5016OooOO0o;
            default:
                return o000oo.OooOOO0;
        }
    }

    @Override // o000oOoO.o000OOo
    public final int OooO0oo() {
        int i = this.f5108OooO0Oo;
        o000OO o000oo = this.f5026OooO00o;
        switch (i) {
            case 0:
                return o000oo.OooOoo();
            default:
                return o000oo.OooOooo();
        }
    }

    @Override // o000oOoO.o000OOo
    public final int OooOO0(View view) {
        int i = this.f5108OooO0Oo;
        Rect rect = this.f5028OooO0OO;
        o000OO o000oo = this.f5026OooO00o;
        switch (i) {
            case 0:
                o000oo.Oooo0(view, rect);
                return rect.right;
            default:
                o000oo.Oooo0(view, rect);
                return rect.bottom;
        }
    }

    @Override // o000oOoO.o000OOo
    public final int OooOO0O(View view) {
        int i = this.f5108OooO0Oo;
        Rect rect = this.f5028OooO0OO;
        o000OO o000oo = this.f5026OooO00o;
        switch (i) {
            case 0:
                o000oo.Oooo0(view, rect);
                return rect.left;
            default:
                o000oo.Oooo0(view, rect);
                return rect.top;
        }
    }

    @Override // o000oOoO.o000OOo
    public final void OooOO0o(int i) {
        int i2 = this.f5108OooO0Oo;
        o000OO o000oo = this.f5026OooO00o;
        switch (i2) {
            case 0:
                o000oo.Oooo0o(i);
                return;
            default:
                o000oo.Oooo0oO(i);
                return;
        }
    }

    public final int OooOOO0(View view) {
        int measuredWidth;
        int i;
        int i2 = this.f5108OooO0Oo;
        o000OO o000oo = this.f5026OooO00o;
        switch (i2) {
            case 0:
                o0000O o0000o2 = (o0000O) view.getLayoutParams();
                o000oo.getClass();
                Rect rect = ((o0000O) view.getLayoutParams()).f4955OooO0O0;
                measuredWidth = view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) o0000o2).topMargin;
                i = ((ViewGroup.MarginLayoutParams) o0000o2).bottomMargin;
                break;
            default:
                o0000O o0000o3 = (o0000O) view.getLayoutParams();
                o000oo.getClass();
                Rect rect2 = ((o0000O) view.getLayoutParams()).f4955OooO0O0;
                measuredWidth = view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) o0000o3).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) o0000o3).rightMargin;
                break;
        }
        return measuredWidth + i;
    }
}