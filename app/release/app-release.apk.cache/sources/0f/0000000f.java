package OooO0Oo;

import OooO0OO.OooO00o;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class OooO0O0 extends ViewGroup.MarginLayoutParams {

    /* renamed from: OooO00o  reason: collision with root package name */
    public int f53OooO00o;

    public OooO0O0() {
        super(-2, -2);
        this.f53OooO00o = 8388627;
    }

    public OooO0O0(OooO0O0 oooO0O0) {
        super((ViewGroup.MarginLayoutParams) oooO0O0);
        this.f53OooO00o = 0;
        this.f53OooO00o = oooO0O0.f53OooO00o;
    }

    public OooO0O0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53OooO00o = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooO00o.f19OooO0O0);
        this.f53OooO00o = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    public OooO0O0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f53OooO00o = 0;
    }
}