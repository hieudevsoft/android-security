package OooOooo;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import java.util.List;

/* loaded from: classes.dex */
public abstract class o00OO0OO {
    public static View.AccessibilityDelegate OooO00o(View view) {
        return view.getAccessibilityDelegate();
    }

    public static ContentCaptureSession OooO0O0(View view) {
        return view.getContentCaptureSession();
    }

    public static List<Rect> OooO0OO(View view) {
        return view.getSystemGestureExclusionRects();
    }

    public static void OooO0Oo(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
    }

    public static void OooO0o(View view, List<Rect> list) {
        view.setSystemGestureExclusionRects(list);
    }

    public static void OooO0o0(View view, ContentCaptureSession contentCaptureSession) {
        view.setContentCaptureSession(contentCaptureSession);
    }
}