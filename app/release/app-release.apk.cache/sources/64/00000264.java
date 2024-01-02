package androidx.activity;

import OoooOOO.o0OO000o;
import OoooOOO.oo0oO0;
import OoooOOO.oo0ooO;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.window.OnBackInvokedDispatcher;

/* loaded from: classes.dex */
public abstract class Oooo0 extends Dialog implements androidx.lifecycle.o00Ooo, o0OO00O, oo0ooO {

    /* renamed from: OooO00o  reason: collision with root package name */
    public androidx.lifecycle.o00oO0o f1934OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final oo0oO0 f1935OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final o0Oo0oo f1936OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo0(Context context, int i) {
        super(context, i);
        o0000O00.OooO00o.OooOoo0(context, "context");
        this.f1935OooO0O0 = o0ooOO0.OooOOO0.OooO0o0(this);
        this.f1936OooO0OO = new o0Oo0oo(new OooO0o(2, this));
    }

    public static void OooO00o(Oooo0 oooo0) {
        o0000O00.OooO00o.OooOoo0(oooo0, "this$0");
        super.onBackPressed();
    }

    @Override // OoooOOO.oo0ooO
    public final o0OO000o OooO0O0() {
        return this.f1935OooO0O0.f1576OooO0O0;
    }

    @Override // androidx.lifecycle.o00Ooo
    public final androidx.lifecycle.o00oO0o OooO0oO() {
        androidx.lifecycle.o00oO0o o00oo0o = this.f1934OooO00o;
        if (o00oo0o == null) {
            androidx.lifecycle.o00oO0o o00oo0o2 = new androidx.lifecycle.o00oO0o(this);
            this.f1934OooO00o = o00oo0o2;
            return o00oo0o2;
        }
        return o00oo0o;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f1936OooO0OO.OooO0O0();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            o0000O00.OooO00o.OooOoOO(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            o0Oo0oo o0oo0oo = this.f1936OooO0OO;
            o0oo0oo.getClass();
            o0oo0oo.f1965OooO0o0 = onBackInvokedDispatcher;
            o0oo0oo.OooO0OO(o0oo0oo.f1966OooO0oO);
        }
        this.f1935OooO0O0.OooO0O0(bundle);
        androidx.lifecycle.o00oO0o o00oo0o = this.f1934OooO00o;
        if (o00oo0o == null) {
            o00oo0o = new androidx.lifecycle.o00oO0o(this);
            this.f1934OooO00o = o00oo0o;
        }
        o00oo0o.OooO0o0(androidx.lifecycle.OooOo.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        o0000O00.OooO00o.OooOoOO(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f1935OooO0O0.OooO0OO(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        androidx.lifecycle.o00oO0o o00oo0o = this.f1934OooO00o;
        if (o00oo0o == null) {
            o00oo0o = new androidx.lifecycle.o00oO0o(this);
            this.f1934OooO00o = o00oo0o;
        }
        o00oo0o.OooO0o0(androidx.lifecycle.OooOo.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        androidx.lifecycle.o00oO0o o00oo0o = this.f1934OooO00o;
        if (o00oo0o == null) {
            o00oo0o = new androidx.lifecycle.o00oO0o(this);
            this.f1934OooO00o = o00oo0o;
        }
        o00oo0o.OooO0o0(androidx.lifecycle.OooOo.ON_DESTROY);
        this.f1934OooO00o = null;
        super.onStop();
    }
}