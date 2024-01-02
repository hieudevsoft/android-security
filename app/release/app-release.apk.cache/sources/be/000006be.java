package o0OOO0o;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class o00O0O extends View.AccessibilityDelegate {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ o00Oo0 f5378OooO00o;

    public o00O0O(o00Oo0 o00oo0) {
        this.f5378OooO00o = o00oo0;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        EditText editText = this.f5378OooO00o.f5387OooO0oo.getEditText();
        if (editText != null) {
            accessibilityNodeInfo.setLabeledBy(editText);
        }
    }
}