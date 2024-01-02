package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class o0O00O implements View.OnKeyListener {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ SearchView f2434OooO00o;

    public o0O00O(SearchView searchView) {
        this.f2434OooO00o = searchView;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        boolean z;
        int length;
        SearchView searchView = this.f2434OooO00o;
        if (searchView.f2187OoooOo0 == null) {
            return false;
        }
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f2153OooOOOo;
        if (searchAutoComplete.isPopupShowing() && searchAutoComplete.getListSelection() != -1) {
            if (searchView.f2187OoooOo0 == null || searchView.f2179Oooo0oo == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                return false;
            }
            if (i != 66 && i != 84 && i != 61) {
                if (i != 21 && i != 22) {
                    if (i != 19) {
                        return false;
                    }
                    searchAutoComplete.getListSelection();
                    return false;
                }
                if (i == 21) {
                    length = 0;
                } else {
                    length = searchAutoComplete.length();
                }
                searchAutoComplete.setSelection(length);
                searchAutoComplete.setListSelection(0);
                searchAutoComplete.clearListSelection();
                searchAutoComplete.OooO00o();
            } else {
                searchView.OooOOOo(searchAutoComplete.getListSelection());
            }
            return true;
        }
        if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
            return false;
        }
        view.cancelLongPress();
        searchView.getContext().startActivity(searchView.OooOO0o("android.intent.action.SEARCH", null, null, searchAutoComplete.getText().toString()));
        return true;
    }
}