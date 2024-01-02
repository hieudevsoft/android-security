package androidx.appcompat.widget;

import android.view.KeyEvent;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class o0O00OO implements TextView.OnEditorActionListener {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ SearchView f2436OooO00o;

    public o0O00OO(SearchView searchView) {
        this.f2436OooO00o = searchView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        this.f2436OooO00o.OooOOoo();
        return true;
    }
}