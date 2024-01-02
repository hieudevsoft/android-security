package o0000oOO;

import java.io.IOException;
import o0000oOo.o000OO00;
import o000OO.OooOOO0;

/* loaded from: classes.dex */
public final class o00oO0o extends o0000o0O.o0Oo0oo {

    /* renamed from: OooO0o  reason: collision with root package name */
    public final /* synthetic */ o000000O f4728OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final /* synthetic */ int f4729OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final /* synthetic */ Object f4730OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o00oO0o(String str, o000000O o000000o2, Object obj, int i) {
        super(str, true);
        this.f4729OooO0o0 = i;
        this.f4728OooO0o = o000000o2;
        this.f4730OooO0oO = obj;
    }

    @Override // o0000o0O.o0Oo0oo
    public final long OooO00o() {
        switch (this.f4729OooO0o0) {
            case 0:
                o000000O o000000o2 = this.f4728OooO0o;
                o000000o2.f4636OooO0O0.OooO00o(o000000o2, ((OooOOO0) this.f4730OooO0oO).f4875OooO00o);
                return -1L;
            default:
                try {
                    this.f4728OooO0o.f4636OooO0O0.OooO0O0((o0000oo) this.f4730OooO0oO);
                } catch (IOException e) {
                    o000OO00 o000oo00 = o000OO00.f4772OooO00o;
                    o000OO00.f4772OooO00o.getClass();
                    o000OO00.OooO("Http2Connection.Listener failure for " + this.f4728OooO0o.f4638OooO0Oo, 4, e);
                    try {
                        ((o0000oo) this.f4730OooO0oO).OooO0OO(OooOo.PROTOCOL_ERROR, e);
                    } catch (IOException unused) {
                    }
                }
                return -1L;
        }
    }
}