package o0000Oo;

import java.util.ArrayDeque;
import java.util.concurrent.ThreadPoolExecutor;
import o0000O00.OooO00o;
import o0000o0o.o0000;

/* loaded from: classes.dex */
public final class o0OoOo0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public ThreadPoolExecutor f4339OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final ArrayDeque f4340OooO0O0 = new ArrayDeque();

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final ArrayDeque f4341OooO0OO = new ArrayDeque();

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final ArrayDeque f4342OooO0Oo = new ArrayDeque();

    public final void OooO00o(o0000 o0000Var) {
        OooO00o.OooOoo0(o0000Var, "call");
        o0000Var.f4487OooO0O0.decrementAndGet();
        ArrayDeque arrayDeque = this.f4341OooO0OO;
        synchronized (this) {
            if (!arrayDeque.remove(o0000Var)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        OooO0O0();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0O0() {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0000Oo.o0OoOo0.OooO0O0():void");
    }
}