package androidx.appcompat.widget;

import android.widget.AutoCompleteTextView;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public abstract class o0oO0Ooo {
    public static void OooO00o(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.refreshAutoCompleteResults();
    }

    public static void OooO0O0(SearchView.SearchAutoComplete searchAutoComplete, int i) {
        searchAutoComplete.setInputMethodMode(i);
    }
}