package Oooo0oO;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.emoji2.text.OooOo;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o0000O00.OooO00o;
import o0ooOO0.OooOOO0;

/* loaded from: classes.dex */
public final class o00Oo00 extends OooOOO0 {

    /* renamed from: OooO0o  reason: collision with root package name */
    public final EditText f1490OooO0o;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final o0O000O f1491OooO0oO;

    public o00Oo00(EditText editText) {
        super(14, (Object) null);
        this.f1490OooO0o = editText;
        o0O000O o0o000o = new o0O000O(editText);
        this.f1491OooO0oO = o0o000o;
        editText.addTextChangedListener(o0o000o);
        if (o0O00o0.f1502OooO0O0 == null) {
            synchronized (o0O00o0.f1501OooO00o) {
                if (o0O00o0.f1502OooO0O0 == null) {
                    o0O00o0.f1502OooO0O0 = new o0O00o0();
                }
            }
        }
        editText.setEditableFactory(o0O00o0.f1502OooO0O0);
    }

    @Override // o0ooOO0.OooOOO0
    public final KeyListener OooO(KeyListener keyListener) {
        if (keyListener instanceof o0) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new o0(keyListener);
    }

    @Override // o0ooOO0.OooOOO0
    public final InputConnection OooOOo(InputConnection inputConnection, EditorInfo editorInfo) {
        return inputConnection instanceof oo00oO ? inputConnection : new oo00oO(this.f1490OooO0o, inputConnection, editorInfo);
    }

    @Override // o0ooOO0.OooOOO0
    public final void OooOo0o(boolean z) {
        o0O000O o0o000o = this.f1491OooO0oO;
        if (o0o000o.f1500OooO0Oo != z) {
            if (o0o000o.f1499OooO0OO != null) {
                OooOo OooO00o2 = OooOo.OooO00o();
                o0O000 o0o000 = o0o000o.f1499OooO0OO;
                OooO00o2.getClass();
                OooO00o.OooOoO(o0o000, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = OooO00o2.f2681OooO00o;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    OooO00o2.f2682OooO0O0.remove(o0o000);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            o0o000o.f1500OooO0Oo = z;
            if (z) {
                o0O000O.OooO00o(o0o000o.f1497OooO00o, OooOo.OooO00o().OooO0O0());
            }
        }
    }
}