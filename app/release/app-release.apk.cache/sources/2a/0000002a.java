package OooO0Oo;

import OooO0oO.o00O000o;
import OooO0oO.o00O00O;
import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class o000O00 extends OooO0o.OooO0OO implements o00O000o {

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final Context f185OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final o00O00O f186OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public WeakReference f187OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public OooO0o.OooO0O0 f188OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final /* synthetic */ o000O00O f189OooO0oO;

    public o000O00(o000O00O o000o00o, Context context, o0ooOOo o0ooooo) {
        this.f189OooO0oO = o000o00o;
        this.f185OooO0OO = context;
        this.f188OooO0o0 = o0ooooo;
        o00O00O o00o00o = new o00O00O(context);
        o00o00o.f400OooOO0o = 1;
        this.f186OooO0Oo = o00o00o;
        o00o00o.f395OooO0o0 = this;
    }

    @Override // OooO0o.OooO0OO
    public final boolean OooO() {
        return this.f189OooO0oO.f201OooO0o.f2041OooOOoo;
    }

    @Override // OooO0o.OooO0OO
    public final void OooO00o() {
        o000O00O o000o00o = this.f189OooO0oO;
        if (o000o00o.f196OooO != this) {
            return;
        }
        if (!(!o000o00o.f210OooOOOo)) {
            o000o00o.f205OooOO0 = this;
            o000o00o.f206OooOO0O = this.f188OooO0o0;
        } else {
            this.f188OooO0o0.OooO0Oo(this);
        }
        this.f188OooO0o0 = null;
        o000o00o.OooOOo0(false);
        ActionBarContextView actionBarContextView = o000o00o.f201OooO0o;
        if (actionBarContextView.f2034OooOO0O == null) {
            actionBarContextView.OooO0o0();
        }
        o000o00o.f199OooO0OO.setHideOnContentScrollEnabled(o000o00o.f215OooOo0);
        o000o00o.f196OooO = null;
    }

    @Override // OooO0o.OooO0OO
    public final View OooO0O0() {
        WeakReference weakReference = this.f187OooO0o;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // OooO0o.OooO0OO
    public final o00O00O OooO0OO() {
        return this.f186OooO0Oo;
    }

    @Override // OooO0o.OooO0OO
    public final MenuInflater OooO0Oo() {
        return new OooO0o.OooOo(this.f185OooO0OO);
    }

    @Override // OooO0o.OooO0OO
    public final CharSequence OooO0o() {
        return this.f189OooO0oO.f201OooO0o.getSubtitle();
    }

    @Override // OooO0oO.o00O000o
    public final boolean OooO0o0(o00O00O o00o00o, MenuItem menuItem) {
        OooO0o.OooO0O0 oooO0O0 = this.f188OooO0o0;
        if (oooO0O0 != null) {
            return oooO0O0.OooO0o0(this, menuItem);
        }
        return false;
    }

    @Override // OooO0o.OooO0OO
    public final CharSequence OooO0oO() {
        return this.f189OooO0oO.f201OooO0o.getTitle();
    }

    @Override // OooO0o.OooO0OO
    public final void OooO0oo() {
        if (this.f189OooO0oO.f196OooO != this) {
            return;
        }
        o00O00O o00o00o = this.f186OooO0Oo;
        o00o00o.OooOo0o();
        try {
            this.f188OooO0o0.OooO00o(this, o00o00o);
        } finally {
            o00o00o.OooOo0O();
        }
    }

    @Override // OooO0oO.o00O000o
    public final void OooOO0(o00O00O o00o00o) {
        if (this.f188OooO0o0 == null) {
            return;
        }
        OooO0oo();
        androidx.appcompat.widget.Oooo000 oooo000 = this.f189OooO0oO.f201OooO0o.f2028OooO0Oo;
        if (oooo000 != null) {
            oooo000.OooOO0o();
        }
    }

    @Override // OooO0o.OooO0OO
    public final void OooOO0O(View view) {
        this.f189OooO0oO.f201OooO0o.setCustomView(view);
        this.f187OooO0o = new WeakReference(view);
    }

    @Override // OooO0o.OooO0OO
    public final void OooOO0o(int i) {
        OooOOO0(this.f189OooO0oO.f197OooO00o.getResources().getString(i));
    }

    @Override // OooO0o.OooO0OO
    public final void OooOOO(int i) {
        OooOOOO(this.f189OooO0oO.f197OooO00o.getResources().getString(i));
    }

    @Override // OooO0o.OooO0OO
    public final void OooOOO0(CharSequence charSequence) {
        this.f189OooO0oO.f201OooO0o.setSubtitle(charSequence);
    }

    @Override // OooO0o.OooO0OO
    public final void OooOOOO(CharSequence charSequence) {
        this.f189OooO0oO.f201OooO0o.setTitle(charSequence);
    }

    @Override // OooO0o.OooO0OO
    public final void OooOOOo(boolean z) {
        this.f253OooO0O0 = z;
        this.f189OooO0oO.f201OooO0o.setTitleOptional(z);
    }
}