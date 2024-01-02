package androidx.appcompat.widget;

import android.view.View;

/* loaded from: classes.dex */
public final class o0O00 implements View.OnFocusChangeListener {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ SearchView f2413OooO00o;

    public o0O00(SearchView searchView) {
        this.f2413OooO00o = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        SearchView searchView = this.f2413OooO00o;
        View.OnFocusChangeListener onFocusChangeListener = searchView.f2175Oooo0OO;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z);
        }
    }
}