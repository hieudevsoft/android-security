package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class ActivityChooserView$InnerLayout extends LinearLayout {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final int[] f2082OooO00o = {16842964};

    public ActivityChooserView$InnerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Drawable drawable;
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2082OooO00o);
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = o0000O00.OooO00o.o0ooOoO(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(0);
        }
        setBackgroundDrawable(drawable);
        obtainStyledAttributes.recycle();
    }
}