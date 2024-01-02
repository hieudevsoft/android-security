package Oooo0oO;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.OooOo;
import androidx.emoji2.text.o00Ooo;
import o0ooOO0.OooOOO0;

/* loaded from: classes.dex */
public final class o0 implements KeyListener {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final KeyListener f1488OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final OooOOO0 f1489OooO0O0;

    public o0(KeyListener keyListener) {
        OooOOO0 oooOOO0 = new OooOOO0(16, (Object) null);
        this.f1488OooO00o = keyListener;
        this.f1489OooO0O0 = oooOOO0;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.f1488OooO00o.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f1488OooO00o.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean OooO00o2;
        boolean z;
        this.f1489OooO0O0.getClass();
        Object obj = OooOo.f2679OooO;
        if (i != 67) {
            if (i != 112) {
                OooO00o2 = false;
            } else {
                OooO00o2 = o00Ooo.OooO00o(editable, keyEvent, true);
            }
        } else {
            OooO00o2 = o00Ooo.OooO00o(editable, keyEvent, false);
        }
        if (OooO00o2) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z = true;
        } else {
            z = false;
        }
        if (!z && !this.f1488OooO00o.onKeyDown(view, editable, i, keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f1488OooO00o.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f1488OooO00o.onKeyUp(view, editable, i, keyEvent);
    }
}