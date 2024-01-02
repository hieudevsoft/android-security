package OooO0oO;

import OooO0Oo.OooOOOO;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class oOO00O implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, oo0oOO0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o00O00O f472OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public OooOOOO f473OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public o00oOoo f474OooO0OO;

    public oOO00O(o00O00O o00o00o) {
        this.f472OooO00o = o00o00o;
    }

    @Override // OooO0oO.oo0oOO0
    public final void OooO00o(o00O00O o00o00o, boolean z) {
        OooOOOO oooOOOO;
        if ((z || o00o00o == this.f472OooO00o) && (oooOOOO = this.f473OooO0O0) != null) {
            oooOOOO.dismiss();
        }
    }

    @Override // OooO0oO.oo0oOO0
    public final boolean OooOOOO(o00O00O o00o00o) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        o00oOoo o00oooo = this.f474OooO0OO;
        if (o00oooo.f468OooO0o == null) {
            o00oooo.f468OooO0o = new o0O0ooO(o00oooo);
        }
        this.f472OooO00o.OooOOo0(o00oooo.f468OooO0o.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f474OooO0OO.OooO00o(this.f472OooO00o, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        o00O00O o00o00o = this.f472OooO00o;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f473OooO0O0.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f473OooO0O0.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                o00o00o.OooO0OO(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return o00o00o.performShortcut(i, keyEvent, 0);
    }
}