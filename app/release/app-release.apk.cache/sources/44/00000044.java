package OooO0o;

import OooO0oO.o00O000o;
import OooO0oO.o00O00O;
import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class OooOO0O extends OooO0OO implements o00O000o {

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final Context f260OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final ActionBarContextView f261OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public WeakReference f262OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final OooO0O0 f263OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public boolean f264OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final o00O00O f265OooO0oo;

    public OooOO0O(Context context, ActionBarContextView actionBarContextView, OooO0O0 oooO0O0) {
        this.f260OooO0OO = context;
        this.f261OooO0Oo = actionBarContextView;
        this.f263OooO0o0 = oooO0O0;
        o00O00O o00o00o = new o00O00O(actionBarContextView.getContext());
        o00o00o.f400OooOO0o = 1;
        this.f265OooO0oo = o00o00o;
        o00o00o.f395OooO0o0 = this;
    }

    @Override // OooO0o.OooO0OO
    public final boolean OooO() {
        return this.f261OooO0Oo.f2041OooOOoo;
    }

    @Override // OooO0o.OooO0OO
    public final void OooO00o() {
        if (this.f264OooO0oO) {
            return;
        }
        this.f264OooO0oO = true;
        this.f263OooO0o0.OooO0Oo(this);
    }

    @Override // OooO0o.OooO0OO
    public final View OooO0O0() {
        WeakReference weakReference = this.f262OooO0o;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // OooO0o.OooO0OO
    public final o00O00O OooO0OO() {
        return this.f265OooO0oo;
    }

    @Override // OooO0o.OooO0OO
    public final MenuInflater OooO0Oo() {
        return new OooOo(this.f261OooO0Oo.getContext());
    }

    @Override // OooO0o.OooO0OO
    public final CharSequence OooO0o() {
        return this.f261OooO0Oo.getSubtitle();
    }

    @Override // OooO0oO.o00O000o
    public final boolean OooO0o0(o00O00O o00o00o, MenuItem menuItem) {
        return this.f263OooO0o0.OooO0o0(this, menuItem);
    }

    @Override // OooO0o.OooO0OO
    public final CharSequence OooO0oO() {
        return this.f261OooO0Oo.getTitle();
    }

    @Override // OooO0o.OooO0OO
    public final void OooO0oo() {
        this.f263OooO0o0.OooO00o(this, this.f265OooO0oo);
    }

    @Override // OooO0oO.o00O000o
    public final void OooOO0(o00O00O o00o00o) {
        OooO0oo();
        androidx.appcompat.widget.Oooo000 oooo000 = this.f261OooO0Oo.f2028OooO0Oo;
        if (oooo000 != null) {
            oooo000.OooOO0o();
        }
    }

    @Override // OooO0o.OooO0OO
    public final void OooOO0O(View view) {
        this.f261OooO0Oo.setCustomView(view);
        this.f262OooO0o = view != null ? new WeakReference(view) : null;
    }

    @Override // OooO0o.OooO0OO
    public final void OooOO0o(int i) {
        OooOOO0(this.f260OooO0OO.getString(i));
    }

    @Override // OooO0o.OooO0OO
    public final void OooOOO(int i) {
        OooOOOO(this.f260OooO0OO.getString(i));
    }

    @Override // OooO0o.OooO0OO
    public final void OooOOO0(CharSequence charSequence) {
        this.f261OooO0Oo.setSubtitle(charSequence);
    }

    @Override // OooO0o.OooO0OO
    public final void OooOOOO(CharSequence charSequence) {
        this.f261OooO0Oo.setTitle(charSequence);
    }

    @Override // OooO0o.OooO0OO
    public final void OooOOOo(boolean z) {
        this.f253OooO0O0 = z;
        this.f261OooO0Oo.setTitleOptional(z);
    }
}