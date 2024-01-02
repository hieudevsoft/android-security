package o0000oOO;

import java.io.IOException;
import o0000O0O.OooO00o;
import o0000OoO.OooOO0O;

/* loaded from: classes.dex */
public final class o0Oo0oo implements OooO00o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o00000O f4742OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ o000000O f4743OooO0O0;

    public o0Oo0oo(o000000O o000000o2, o00000O o00000o) {
        this.f4743OooO0O0 = o000000o2;
        this.f4742OooO00o = o00000o;
    }

    @Override // o0000O0O.OooO00o
    public final Object OooO00o() {
        Throwable th;
        OooOo oooOo;
        o000000O o000000o2 = this.f4743OooO0O0;
        o00000O o00000o = this.f4742OooO00o;
        OooOo oooOo2 = OooOo.INTERNAL_ERROR;
        IOException e = null;
        try {
            o00000o.OooOoO0(this);
            do {
            } while (o00000o.OooOo(false, this));
            oooOo = OooOo.NO_ERROR;
        } catch (IOException e2) {
            e = e2;
            oooOo = oooOo2;
        } catch (Throwable th2) {
            th = th2;
            oooOo = oooOo2;
            o000000o2.OooOo(oooOo, oooOo2, e);
            OooOO0O.OooO0OO(o00000o);
            throw th;
        }
        try {
            try {
                o000000o2.OooOo(oooOo, OooOo.CANCEL, null);
            } catch (Throwable th3) {
                th = th3;
                o000000o2.OooOo(oooOo, oooOo2, e);
                OooOO0O.OooO0OO(o00000o);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            OooOo oooOo3 = OooOo.PROTOCOL_ERROR;
            o000000o2.OooOo(oooOo3, oooOo3, e);
            OooOO0O.OooO0OO(o00000o);
            return o00000oo.o00Ooo.f4105OooO00o;
        }
        OooOO0O.OooO0OO(o00000o);
        return o00000oo.o00Ooo.f4105OooO00o;
    }
}