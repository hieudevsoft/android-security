package o000oOoO;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class o0000O extends ViewGroup.MarginLayoutParams {

    /* renamed from: OooO00o  reason: collision with root package name */
    public o000OOo0 f4954OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final Rect f4955OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public boolean f4956OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public boolean f4957OooO0Oo;

    public o0000O(int i, int i2) {
        super(i, i2);
        this.f4955OooO0O0 = new Rect();
        this.f4956OooO0OO = true;
        this.f4957OooO0Oo = false;
    }

    public final int OooO00o() {
        return this.f4954OooO00o.OooO0OO();
    }

    public final boolean OooO0O0() {
        if ((this.f4954OooO00o.f5039OooOO0 & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean OooO0OO() {
        return this.f4954OooO00o.OooO();
    }

    public o0000O(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4955OooO0O0 = new Rect();
        this.f4956OooO0OO = true;
        this.f4957OooO0Oo = false;
    }

    public o0000O(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f4955OooO0O0 = new Rect();
        this.f4956OooO0OO = true;
        this.f4957OooO0Oo = false;
    }

    public o0000O(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f4955OooO0O0 = new Rect();
        this.f4956OooO0OO = true;
        this.f4957OooO0Oo = false;
    }

    public o0000O(o0000O o0000o2) {
        super((ViewGroup.LayoutParams) o0000o2);
        this.f4955OooO0O0 = new Rect();
        this.f4956OooO0OO = true;
        this.f4957OooO0Oo = false;
    }
}