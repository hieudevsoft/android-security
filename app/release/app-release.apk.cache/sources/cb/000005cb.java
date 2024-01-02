package o0000o0O;

import java.util.logging.Level;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class o000OOo implements Runnable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ o000000 f4464OooO00o;

    public o000OOo(o000000 o000000Var) {
        this.f4464OooO00o = o000000Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o0Oo0oo OooO0OO2;
        long j;
        while (true) {
            o000000 o000000Var = this.f4464OooO00o;
            synchronized (o000000Var) {
                OooO0OO2 = o000000Var.OooO0OO();
            }
            if (OooO0OO2 == null) {
                return;
            }
            oo0o0Oo oo0o0oo = OooO0OO2.f4470OooO0OO;
            OooO00o.OooOo(oo0o0oo);
            o000000 o000000Var2 = this.f4464OooO00o;
            boolean isLoggable = o000000.f4455OooO0oo.OooOOO0().isLoggable(Level.FINE);
            if (isLoggable) {
                oo0o0oo.f4472OooO00o.f4457OooO00o.getClass();
                j = System.nanoTime();
                OooO00o.OooO0oo(OooO0OO2, oo0o0oo, "starting");
            } else {
                j = -1;
            }
            try {
                o000000.OooO00o(o000000Var2, OooO0OO2);
                if (isLoggable) {
                    oo0o0oo.f4472OooO00o.f4457OooO00o.getClass();
                    OooO00o.OooO0oo(OooO0OO2, oo0o0oo, "finished run in ".concat(OooO00o.o00Ooo(System.nanoTime() - j)));
                }
            } finally {
            }
        }
    }
}