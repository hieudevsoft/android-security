package androidx.appcompat.widget;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

/* loaded from: classes.dex */
public class o00O00O extends o00O00o0 {
    @Override // androidx.appcompat.widget.o00O00o0
    public void OooO00o(StaticLayout.Builder builder, TextView textView) {
        Object obj = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        try {
            obj = oo00o.OooO0Oo("getTextDirectionHeuristic").invoke(textView, new Object[0]);
        } catch (Exception unused) {
        }
        builder.setTextDirection((TextDirectionHeuristic) obj);
    }
}