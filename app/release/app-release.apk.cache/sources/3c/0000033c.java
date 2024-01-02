package androidx.emoji2.text;

import OooOoOO.o0000;
import OooOoOO.o0000Ooo;

/* loaded from: classes.dex */
public final class o0OoOo0 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            int i = o0000.f1201OooO00o;
            o0000Ooo.OooO00o("EmojiCompat.EmojiCompatInitializer.run");
            if (OooOo.f2680OooOO0 != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                OooOo.OooO00o().OooO0OO();
            }
            o0000Ooo.OooO0O0();
        } catch (Throwable th) {
            int i2 = o0000.f1201OooO00o;
            o0000Ooo.OooO0O0();
            throw th;
        }
    }
}