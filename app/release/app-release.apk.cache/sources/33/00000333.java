package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class o000oOoO extends o0000O00.OooO00o {

    /* renamed from: OoooO  reason: collision with root package name */
    public final /* synthetic */ o0000O00.OooO00o f2695OoooO;

    /* renamed from: OoooOO0  reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f2696OoooOO0;

    public o000oOoO(o0000O00.OooO00o oooO00o, ThreadPoolExecutor threadPoolExecutor) {
        this.f2695OoooO = oooO00o;
        this.f2696OoooOO0 = threadPoolExecutor;
    }

    @Override // o0000O00.OooO00o
    public final void o000O000(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f2696OoooOO0;
        try {
            this.f2695OoooO.o000O000(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // o0000O00.OooO00o
    public final void o000Ooo(OooO0o.OooOOO0 oooOOO0) {
        ThreadPoolExecutor threadPoolExecutor = this.f2696OoooOO0;
        try {
            this.f2695OoooO.o000Ooo(oooOOO0);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}