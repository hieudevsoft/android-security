package OooO0o;

import OooO0oO.o00OO0O0;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* loaded from: classes.dex */
public final class OooOOO extends ActionMode {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Context f266OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final OooO0OO f267OooO0O0;

    public OooOOO(Context context, OooO0OO oooO0OO) {
        this.f266OooO00o = context;
        this.f267OooO0O0 = oooO0OO;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f267OooO0O0.OooO00o();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f267OooO0O0.OooO0O0();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new o00OO0O0(this.f266OooO00o, this.f267OooO0O0.OooO0OO());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f267OooO0O0.OooO0Oo();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f267OooO0O0.OooO0o();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f267OooO0O0.f252OooO00o;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f267OooO0O0.OooO0oO();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f267OooO0O0.f253OooO0O0;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f267OooO0O0.OooO0oo();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f267OooO0O0.OooO();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f267OooO0O0.OooOO0O(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f267OooO0O0.OooOO0o(i);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f267OooO0O0.f252OooO00o = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f267OooO0O0.OooOOO(i);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.f267OooO0O0.OooOOOo(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f267OooO0O0.OooOOO0(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f267OooO0O0.OooOOOO(charSequence);
    }
}