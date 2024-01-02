package OooooOo;

import OooOooo.o0000O;
import Oooo000.Oooo0;
import Oooo000.o000oOoO;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;

/* loaded from: classes.dex */
public final class oO00O0oO extends o0000O {

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final /* synthetic */ int f1824OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final /* synthetic */ Object f1825OooO0o0;

    public /* synthetic */ oO00O0oO(int i, Object obj) {
        this.f1824OooO0Oo = i;
        this.f1825OooO0o0 = obj;
    }

    @Override // OooOooo.o0000O
    public final void OooO0OO(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f1824OooO0Oo) {
            case 2:
                super.OooO0OO(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f1825OooO0o0).isChecked());
                return;
            default:
                super.OooO0OO(view, accessibilityEvent);
                return;
        }
    }

    @Override // OooOooo.o0000O
    public final void OooO0Oo(View view, o000oOoO o000oooo) {
        int i;
        AccessibilityNodeInfo accessibilityNodeInfo = o000oooo.f1437OooO00o;
        int i2 = this.f1824OooO0Oo;
        Object obj = this.f1825OooO0o0;
        View.AccessibilityDelegate accessibilityDelegate = this.f1271OooO00o;
        switch (i2) {
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i3 = MaterialButtonToggleGroup.f3323OooOO0O;
                materialButtonToggleGroup.getClass();
                if (view instanceof MaterialButton) {
                    i = 0;
                    for (int i4 = 0; i4 < materialButtonToggleGroup.getChildCount(); i4++) {
                        if (materialButtonToggleGroup.getChildAt(i4) != view) {
                            if ((materialButtonToggleGroup.getChildAt(i4) instanceof MaterialButton) && materialButtonToggleGroup.OooO0Oo(i4)) {
                                i++;
                            }
                        } else {
                            o000oooo.OooO(Oooo0.OooO00o(0, 1, i, 1, ((MaterialButton) view).isChecked()));
                            return;
                        }
                    }
                }
                i = -1;
                o000oooo.OooO(Oooo0.OooO00o(0, 1, i, 1, ((MaterialButton) view).isChecked()));
                return;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f3455OooO0o0);
                accessibilityNodeInfo.setChecked(checkableImageButton.isChecked());
                return;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCheckable(((NavigationMenuItemView) obj).f3457OooOo);
                return;
        }
    }
}