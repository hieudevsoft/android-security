package OooOooo;

import android.view.View;
import android.view.autofill.AutofillId;
import java.util.Collection;

/* loaded from: classes.dex */
public abstract class o00OO000 {
    public static View OooO(View view, View view2, int i) {
        return view.keyboardNavigationClusterSearch(view2, i);
    }

    public static void OooO00o(View view, Collection<View> collection, int i) {
        view.addKeyboardNavigationClusters(collection, i);
    }

    public static AutofillId OooO0O0(View view) {
        return view.getAutofillId();
    }

    public static int OooO0OO(View view) {
        return view.getImportantForAutofill();
    }

    public static int OooO0Oo(View view) {
        return view.getNextClusterForwardId();
    }

    public static boolean OooO0o(View view) {
        return view.isFocusedByDefault();
    }

    public static boolean OooO0o0(View view) {
        return view.hasExplicitFocusable();
    }

    public static boolean OooO0oO(View view) {
        return view.isImportantForAutofill();
    }

    public static boolean OooO0oo(View view) {
        return view.isKeyboardNavigationCluster();
    }

    public static boolean OooOO0(View view) {
        return view.restoreDefaultFocus();
    }

    public static void OooOO0O(View view, String... strArr) {
        view.setAutofillHints(strArr);
    }

    public static void OooOO0o(View view, boolean z) {
        view.setFocusedByDefault(z);
    }

    public static void OooOOO(View view, boolean z) {
        view.setKeyboardNavigationCluster(z);
    }

    public static void OooOOO0(View view, int i) {
        view.setImportantForAutofill(i);
    }

    public static void OooOOOO(View view, int i) {
        view.setNextClusterForwardId(i);
    }

    public static void OooOOOo(View view, CharSequence charSequence) {
        view.setTooltipText(charSequence);
    }
}