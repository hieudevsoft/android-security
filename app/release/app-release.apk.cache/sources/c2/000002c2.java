package androidx.appcompat.widget;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class o00O00OO extends o00O00O {
    @Override // androidx.appcompat.widget.o00O00O, androidx.appcompat.widget.o00O00o0
    public void OooO00o(StaticLayout.Builder builder, TextView textView) {
        TextDirectionHeuristic textDirectionHeuristic;
        textDirectionHeuristic = textView.getTextDirectionHeuristic();
        builder.setTextDirection(textDirectionHeuristic);
    }

    @Override // androidx.appcompat.widget.o00O00o0
    public boolean OooO0O0(TextView textView) {
        boolean isHorizontallyScrollable;
        isHorizontallyScrollable = textView.isHorizontallyScrollable();
        return isHorizontallyScrollable;
    }
}