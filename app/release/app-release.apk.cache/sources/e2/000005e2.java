package o0000oO0;

import java.io.IOException;
import o0000O00.OooO00o;
import o000O000.OooOO0;
import o000O000.OooOOOO;
import o000O000.o0Oo0oo;
import o000O000.o0ooOOo;

/* loaded from: classes.dex */
public abstract class Oooo000 implements o0ooOOo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final OooOOOO f4571OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public boolean f4572OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ o00Ooo f4573OooO0OO;

    public Oooo000(o00Ooo o00ooo2) {
        this.f4573OooO0OO = o00ooo2;
        this.f4571OooO00o = new OooOOOO(o00ooo2.f4584OooO0OO.OooO00o());
    }

    @Override // o000O000.o0ooOOo
    public final o0Oo0oo OooO00o() {
        return this.f4571OooO00o;
    }

    @Override // o000O000.o0ooOOo
    public long OooO0o0(OooOO0 oooOO0, long j) {
        o00Ooo o00ooo2 = this.f4573OooO0OO;
        OooO00o.OooOoo0(oooOO0, "sink");
        try {
            return o00ooo2.f4584OooO0OO.OooO0o0(oooOO0, j);
        } catch (IOException e) {
            o00ooo2.f4583OooO0O0.OooOO0O();
            OooOo();
            throw e;
        }
    }

    public final void OooOo() {
        o00Ooo o00ooo2 = this.f4573OooO0OO;
        int i = o00ooo2.f4587OooO0o0;
        if (i == 6) {
            return;
        }
        if (i == 5) {
            OooOOOO oooOOOO = this.f4571OooO00o;
            o0Oo0oo o0oo0oo = oooOOOO.f4828OooO0o0;
            oooOOOO.f4828OooO0o0 = o0Oo0oo.f4856OooO0Oo;
            o0oo0oo.OooO00o();
            o0oo0oo.OooO0O0();
            o00ooo2.f4587OooO0o0 = 6;
            return;
        }
        throw new IllegalStateException("state: " + o00ooo2.f4587OooO0o0);
    }
}