package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class o0O00O0o implements View.OnClickListener {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ SearchView f2435OooO00o;

    public o0O00O0o(SearchView searchView) {
        this.f2435OooO00o = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String flattenToShortString;
        SearchView searchView = this.f2435OooO00o;
        ImageView imageView = searchView.f2159OooOo00;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f2153OooOOOo;
        if (view == imageView) {
            searchView.OooOoO0(false);
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
            View.OnClickListener onClickListener = searchView.f2177Oooo0o0;
            if (onClickListener != null) {
                onClickListener.onClick(searchView);
            }
        } else if (view == searchView.f2160OooOo0O) {
            searchView.OooOOOO();
        } else if (view == searchView.f2158OooOo0) {
            searchView.OooOOoo();
        } else if (view == searchView.f2161OooOo0o) {
            SearchableInfo searchableInfo = searchView.f2187OoooOo0;
            if (searchableInfo != null) {
                try {
                    if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                        Intent intent = new Intent(searchView.f2173Oooo00o);
                        ComponentName searchActivity = searchableInfo.getSearchActivity();
                        if (searchActivity == null) {
                            flattenToShortString = null;
                        } else {
                            flattenToShortString = searchActivity.flattenToShortString();
                        }
                        intent.putExtra("calling_package", flattenToShortString);
                        searchView.getContext().startActivity(intent);
                    } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                        searchView.getContext().startActivity(searchView.OooOOO0(searchView.f2170Oooo0, searchableInfo));
                    }
                } catch (ActivityNotFoundException unused) {
                }
            }
        } else if (view == searchAutoComplete) {
            searchView.OooOOO();
        }
    }
}