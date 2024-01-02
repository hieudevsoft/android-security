package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class o00000O extends PopupWindow {
    public o00000O(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Drawable drawable;
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooO0OO.OooO00o.f34OooOOoo, i, i2);
        if (obtainStyledAttributes.hasValue(2)) {
            Oooo0.Oooo0.OooO0OO(this, obtainStyledAttributes.getBoolean(2, false));
        }
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = o0000O00.OooO00o.o0ooOoO(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(0);
        }
        setBackgroundDrawable(drawable);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i, int i2) {
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public final void update(View view, int i, int i2, int i3, int i4) {
        super.update(view, i, i2, i3, i4);
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i, int i2, int i3) {
        super.showAsDropDown(view, i, i2, i3);
    }
}