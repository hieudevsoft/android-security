package Oooo0;

import OooOooo.o000O00;
import OooOooo.o000Oo0;
import OooOooo.o00oOoo;
import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import java.util.Objects;

/* loaded from: classes.dex */
public final class o00oO0o implements o00oOoo {
    public final o000O00 OooO00o(View view, o000O00 o000o00) {
        CharSequence coerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            Objects.toString(o000o00);
        }
        if (o000o00.f1275OooO00o.OooO0OO() == 2) {
            return o000o00;
        }
        o000Oo0 o000oo0 = o000o00.f1275OooO00o;
        ClipData OooO0Oo2 = o000oo0.OooO0Oo();
        int OooO2 = o000oo0.OooO();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < OooO0Oo2.getItemCount(); i++) {
            ClipData.Item itemAt = OooO0Oo2.getItemAt(i);
            if ((OooO2 & 1) != 0) {
                coerceToStyledText = itemAt.coerceToText(context);
                if (coerceToStyledText instanceof Spanned) {
                    coerceToStyledText = coerceToStyledText.toString();
                }
            } else {
                coerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (coerceToStyledText != null) {
                if (!z) {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, max2);
                    editable.replace(max, max2, coerceToStyledText);
                    z = true;
                } else {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), coerceToStyledText);
                }
            }
        }
        return null;
    }
}