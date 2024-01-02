package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class o0000O00 {
    public static boolean OooO00o(DragEvent dragEvent, TextView textView, Activity activity) {
        OooOooo.o000O000 o000o0o;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                o000o0o = new OooOooo.o000(clipData, 3);
            } else {
                o000o0o = new OooOooo.o000O0o(clipData, 3);
            }
            OooOooo.o0o0Oo.OooO0oo(textView, o000o0o.OooO0o0());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean OooO0O0(DragEvent dragEvent, View view, Activity activity) {
        OooOooo.o000O000 o000o0o;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            o000o0o = new OooOooo.o000(clipData, 3);
        } else {
            o000o0o = new OooOooo.o000O0o(clipData, 3);
        }
        OooOooo.o0o0Oo.OooO0oo(view, o000o0o.OooO0o0());
        return true;
    }
}