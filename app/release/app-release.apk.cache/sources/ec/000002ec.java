package androidx.appcompat.widget;

import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class o0O0O0o0 implements Runnable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ SearchView.SearchAutoComplete f2443OooO00o;

    public o0O0O0o0(SearchView.SearchAutoComplete searchAutoComplete) {
        this.f2443OooO00o = searchAutoComplete;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SearchView.SearchAutoComplete searchAutoComplete = this.f2443OooO00o;
        if (searchAutoComplete.f2194OooO0oO) {
            ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.f2194OooO0oO = false;
        }
    }
}