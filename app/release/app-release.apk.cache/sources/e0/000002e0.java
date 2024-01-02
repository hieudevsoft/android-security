package androidx.appcompat.widget;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class o0O000Oo implements TextWatcher {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f2430OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f2431OooO0O0;

    public /* synthetic */ o0O000Oo(ViewGroup viewGroup, int i) {
        this.f2430OooO00o = i;
        this.f2431OooO0O0 = viewGroup;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.f2430OooO00o) {
            case 0:
                return;
            default:
                TextInputLayout textInputLayout = (TextInputLayout) this.f2431OooO0O0;
                textInputLayout.OooOo00(!textInputLayout.f3565o0ooOoO, false);
                if (textInputLayout.f3506OooOO0O) {
                    textInputLayout.OooOOO0(editable);
                }
                if (textInputLayout.f3513OooOOoo) {
                    textInputLayout.OooOo0(editable);
                    return;
                }
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.f2430OooO00o) {
            case 0:
                SearchView searchView = (SearchView) this.f2431OooO0O0;
                Editable text = searchView.f2153OooOOOo.getText();
                searchView.f2191o000oOoO = text;
                boolean z = !TextUtils.isEmpty(text);
                searchView.OooOo(z);
                boolean z2 = !z;
                int i4 = 8;
                if (searchView.f2184OoooOO0 && !searchView.f2178Oooo0oO && z2) {
                    searchView.f2158OooOo0.setVisibility(8);
                    i4 = 0;
                }
                searchView.f2161OooOo0o.setVisibility(i4);
                searchView.OooOo00();
                searchView.OooOo0o();
                charSequence.toString();
                searchView.getClass();
                return;
            default:
                return;
        }
    }
}