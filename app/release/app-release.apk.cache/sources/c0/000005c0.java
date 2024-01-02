package o0000o;

import o0000O00.OooO00o;
import o0000Oo.o00000;
import o0000Oo.o000000;
import o0000Oo.o000000O;
import o0000Oo.o00000O;
import o0000Oo.o00000O0;
import o0000Oo.o000OOo;
import o0000Oo.o000oOoO;
import o0000Oo.o00Ooo;
import o0000Oo.o0OOO0o;
import o0000Oo.o0Oo0oo;
import o0000Oo.o0ooOOo;
import o0000Oo.oo000o;
import o000O000.o0OoOo0;

/* loaded from: classes.dex */
public final class OooO implements o0OOO0o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o000oOoO f4435OooO00o;

    public OooO(o000oOoO o000oooo) {
        OooO00o.OooOoo0(o000oooo, "cookieJar");
        this.f4435OooO00o = o000oooo;
    }

    @Override // o0000Oo.o0OOO0o
    public final o00000 OooO00o(OooOOOO oooOOOO) {
        o00000O o00000o;
        androidx.appcompat.widget.o0OOO0o o0ooo0o = oooOOOO.f4444OooO0o0;
        o0ooo0o.getClass();
        o000OOo o000ooo = new o000OOo(o0ooo0o);
        o000000 o000000Var = (o000000) o0ooo0o.f2523OooO0o0;
        if (o000000Var != null) {
            o0Oo0oo o0oo0oo = o000000Var.f4249OooO00o;
            if (o0oo0oo != null) {
                o000ooo.OooO0O0("Content-Type", o0oo0oo.f4337OooO00o);
            }
            long j = o000000Var.f4250OooO0O0;
            if (j != -1) {
                o000ooo.OooO0O0("Content-Length", String.valueOf(j));
                o000ooo.f4281OooO0OO.OooO0OO("Transfer-Encoding");
            } else {
                o000ooo.OooO0O0("Transfer-Encoding", "chunked");
                o000ooo.f4281OooO0OO.OooO0OO("Content-Length");
            }
        }
        Object obj = o0ooo0o.f2521OooO0Oo;
        String OooO0o2 = ((oo000o) obj).OooO0o("Host");
        boolean z = false;
        Object obj2 = o0ooo0o.f2519OooO0O0;
        if (OooO0o2 == null) {
            o000ooo.OooO0O0("Host", o0000OoO.OooOO0O.OooOo0O((o0ooOOo) obj2, false));
        }
        if (((oo000o) obj).OooO0o("Connection") == null) {
            o000ooo.OooO0O0("Connection", "Keep-Alive");
        }
        if (((oo000o) obj).OooO0o("Accept-Encoding") == null && ((oo000o) obj).OooO0o("Range") == null) {
            o000ooo.OooO0O0("Accept-Encoding", "gzip");
            z = true;
        }
        o0ooOOo o0ooooo = (o0ooOOo) obj2;
        o000oOoO o000oooo = this.f4435OooO00o;
        ((OooOoo.o0ooOOo) o000oooo).getClass();
        OooO00o.OooOoo0(o0ooooo, "url");
        if (((oo000o) obj).OooO0o("User-Agent") == null) {
            o000ooo.OooO0O0("User-Agent", "okhttp/4.12.0");
        }
        o00000 OooO0O02 = oooOOOO.OooO0O0(o000ooo.OooO00o());
        oo000o oo000oVar = OooO0O02.f4242OooO0o;
        OooOOO.OooO0O0(o000oooo, o0ooooo, oo000oVar);
        o000000O o000000o2 = new o000000O(OooO0O02);
        o000000o2.f4254OooO00o = o0ooo0o;
        if (z && o0000Oo0.OooOOOO.oo0o0O0("gzip", o00000.OooOo(OooO0O02, "Content-Encoding")) && OooOOO.OooO00o(OooO0O02) && (o00000o = OooO0O02.f4244OooO0oO) != null) {
            o000O000.OooOo00 oooOo00 = new o000O000.OooOo00(((o00000O0) o00000o).f4267OooO0OO);
            o00Ooo OooO0oo2 = oo000oVar.OooO0oo();
            OooO0oo2.OooO0OO("Content-Encoding");
            OooO0oo2.OooO0OO("Content-Length");
            o000000o2.f4258OooO0o = OooO0oo2.OooO0O0().OooO0oo();
            o000000o2.f4260OooO0oO = new o00000O0(o00000.OooOo(OooO0O02, "Content-Type"), -1L, new o0OoOo0(oooOo00));
        }
        return o000000o2.OooO00o();
    }
}