package androidx.emoji2.text;

import OoooOo0.o0000O0O;
import OoooOo0.o000OO;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements o000OO {
    @Override // OoooOo0.o000OO
    public final List OooO00o() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // OoooOo0.o000OO
    /* renamed from: OooO0OO */
    public final Boolean OooO0O0(Context context) {
        Object obj;
        Oooo000 oooo000 = new Oooo000(context);
        if (OooOo.f2680OooOO0 == null) {
            synchronized (OooOo.f2679OooO) {
                if (OooOo.f2680OooOO0 == null) {
                    OooOo.f2680OooOO0 = new OooOo(oooo000);
                }
            }
        }
        o0000O0O OooO0OO2 = o0000O0O.OooO0OO(context);
        OooO0OO2.getClass();
        synchronized (o0000O0O.f1595OooO0o0) {
            try {
                obj = OooO0OO2.f1596OooO00o.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = OooO0OO2.OooO0O0(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        final androidx.lifecycle.o00oO0o OooO0oO2 = ((androidx.lifecycle.o00Ooo) obj).OooO0oO();
        OooO0oO2.OooO00o(new androidx.lifecycle.OooO0o() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.OooO0o
            public final void OooO00o() {
                Handler handler;
                EmojiCompatInitializer.this.getClass();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = OooO0O0.OooO00o(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new o0OoOo0(), 500L);
                OooO0oO2.OooO0O0(this);
            }
        });
        return Boolean.TRUE;
    }
}