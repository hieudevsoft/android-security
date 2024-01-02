package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class DialogTitle extends o00oOoo {
    public DialogTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.appcompat.widget.o00oOoo, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int lineCount;
        super.onMeasure(i, i2);
        Layout layout = getLayout();
        if (layout == null || (lineCount = layout.getLineCount()) <= 0 || layout.getEllipsisCount(lineCount - 1) <= 0) {
            return;
        }
        setSingleLine(false);
        setMaxLines(2);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, OooO0OO.OooO00o.f39OooOo0o, 16842817, 16973892);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        if (dimensionPixelSize != 0) {
            setTextSize(0, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
        super.onMeasure(i, i2);
    }
}