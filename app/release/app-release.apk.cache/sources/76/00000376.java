package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class o00oO0o extends o0000O00.OooO00o implements androidx.lifecycle.o0000O, androidx.activity.o0OO00O, androidx.activity.result.OooOO0, o000OO {

    /* renamed from: OoooO  reason: collision with root package name */
    public final Activity f2993OoooO;

    /* renamed from: OoooOO0  reason: collision with root package name */
    public final Context f2994OoooOO0;

    /* renamed from: OoooOOO  reason: collision with root package name */
    public final o0000oo f2995OoooOOO;

    /* renamed from: OoooOOo  reason: collision with root package name */
    public final /* synthetic */ o0ooOOo f2996OoooOOo;

    /* renamed from: o000oOoO  reason: collision with root package name */
    public final Handler f2997o000oOoO;

    public o00oO0o(OooO0Oo.Oooo000 oooo000) {
        this.f2996OoooOOo = oooo000;
        Handler handler = new Handler();
        this.f2995OoooOOO = new o0000oo();
        this.f2993OoooO = oooo000;
        this.f2994OoooOO0 = oooo000;
        this.f2997o000oOoO = handler;
    }

    @Override // androidx.lifecycle.o0000O
    public final androidx.lifecycle.o000OO OooO0OO() {
        return this.f2996OoooOOo.OooO0OO();
    }

    @Override // androidx.fragment.app.o000OO
    public final void OooO0o0() {
        this.f2996OoooOOo.getClass();
    }

    @Override // androidx.lifecycle.o00Ooo
    public final androidx.lifecycle.o00oO0o OooO0oO() {
        return this.f2996OoooOOo.f3035OooOOo0;
    }

    @Override // o0000O00.OooO00o
    public final boolean o000O0o() {
        Window window = this.f2996OoooOOo.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // o0000O00.OooO00o
    public final View o000OoO(int i) {
        return this.f2996OoooOOo.findViewById(i);
    }

    public final androidx.activity.o0Oo0oo o00O0O0o() {
        return this.f2996OoooOOo.OooOO0O();
    }
}