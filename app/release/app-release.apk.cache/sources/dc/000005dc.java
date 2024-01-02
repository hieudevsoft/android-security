package o0000o0o;

import OooO0Oo.OooOOO;
import OooOoo.o0ooOOo;
import java.io.IOException;
import o0000O00.OooO00o;
import o0000Oo.OooO0o;
import o0000oOO.OooOo;
import o0000oOO.OooOo00;

/* loaded from: classes.dex */
public final class o0000Ooo {

    /* renamed from: OooO  reason: collision with root package name */
    public int f4540OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o0000O f4541OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final OooO0o f4542OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final o0000O0 f4543OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final o0ooOOo f4544OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public o000 f4545OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public OooOOO f4546OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public int f4547OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public int f4548OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public o0000Oo.o00000OO f4549OooOO0;

    public o0000Ooo(o0000O o0000o2, OooO0o oooO0o, o0000O0 o0000o02, o0ooOOo o0ooooo) {
        OooO00o.OooOoo0(o0000o2, "connectionPool");
        OooO00o.OooOoo0(o0ooooo, "eventListener");
        this.f4541OooO00o = o0000o2;
        this.f4542OooO0O0 = oooO0o;
        this.f4543OooO0OO = o0000o02;
        this.f4544OooO0Oo = o0ooooo;
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0311 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o0000o0o.o000OO OooO00o(int r16, int r17, int r18, int r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 859
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0000o0o.o0000Ooo.OooO00o(int, int, int, int, boolean, boolean):o0000o0o.o000OO");
    }

    public final boolean OooO0O0(o0000Oo.o0ooOOo o0ooooo) {
        OooO00o.OooOoo0(o0ooooo, "url");
        o0000Oo.o0ooOOo o0ooooo2 = this.f4542OooO0O0.f4168OooO;
        if (o0ooooo.f4350OooO0o0 == o0ooooo2.f4350OooO0o0 && OooO00o.OooOOO0(o0ooooo.f4348OooO0Oo, o0ooooo2.f4348OooO0Oo)) {
            return true;
        }
        return false;
    }

    public final void OooO0OO(IOException iOException) {
        OooO00o.OooOoo0(iOException, "e");
        this.f4549OooOO0 = null;
        if (iOException instanceof o0000oOO.o0000OO0) {
            if (((o0000oOO.o0000OO0) iOException).f4685OooO00o == OooOo.REFUSED_STREAM) {
                this.f4547OooO0oO++;
                return;
            }
        }
        if (iOException instanceof OooOo00) {
            this.f4548OooO0oo++;
        } else {
            this.f4540OooO++;
        }
    }
}