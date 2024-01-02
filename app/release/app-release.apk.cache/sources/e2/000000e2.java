package OooOo0;

import OooOooo.o000OO0O;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.o00000OO;
import androidx.lifecycle.o00oO0o;
import o0000O00.OooO00o;
import o0ooOO0.OooOOO0;

/* loaded from: classes.dex */
public abstract class o00Oo0 extends Activity implements androidx.lifecycle.o00Ooo, o000OO0O {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o00oO0o f1147OooO00o = new o00oO0o(this);

    @Override // OooOooo.o000OO0O
    public final boolean OooO0oo(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !OooO00o.OooooOo(decorView, keyEvent)) {
            return OooO00o.Oooooo0(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !OooO00o.OooooOo(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = o00000OO.f3078OooO0O0;
        OooOOO0.OooOOOo(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        o00oO0o o00oo0o = this.f1147OooO00o;
        o00oo0o.getClass();
        o00oo0o.OooO0Oo("markState");
        o00oo0o.OooO0oO();
        super.onSaveInstanceState(bundle);
    }
}