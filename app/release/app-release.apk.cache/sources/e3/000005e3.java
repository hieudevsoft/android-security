package o0000oO0;

import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import o0000O00.OooO00o;
import o0000Oo.o0ooOOo;
import o0000Oo.oo000o;
import o0000Oo.oo0o0Oo;
import o0000Oo0.OooOOOO;
import o0000OoO.OooOO0O;
import o0000o.OooOOO;
import o000O000.OooOO0;

/* loaded from: classes.dex */
public final class o000oOoO extends Oooo000 {

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final o0ooOOo f4574OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public boolean f4575OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public long f4576OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final /* synthetic */ o00Ooo f4577OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000oOoO(o00Ooo o00ooo2, o0ooOOo o0ooooo) {
        super(o00ooo2);
        OooO00o.OooOoo0(o0ooooo, "url");
        this.f4577OooO0oO = o00ooo2;
        this.f4574OooO0Oo = o0ooooo;
        this.f4576OooO0o0 = -1L;
        this.f4575OooO0o = true;
    }

    @Override // o0000oO0.Oooo000, o000O000.o0ooOOo
    public final long OooO0o0(OooOO0 oooOO0, long j) {
        boolean z;
        OooO00o.OooOoo0(oooOO0, "sink");
        boolean z2 = true;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!this.f4572OooO0O0) {
                if (!this.f4575OooO0o) {
                    return -1L;
                }
                long j2 = this.f4576OooO0o0;
                int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
                o00Ooo o00ooo2 = this.f4577OooO0oO;
                if (i == 0 || j2 == -1) {
                    if (j2 != -1) {
                        o00ooo2.f4584OooO0OO.OooO0o();
                    }
                    try {
                        this.f4576OooO0o0 = o00ooo2.f4584OooO0OO.OooOOoo();
                        String obj = OooOOOO.o00O0oOo(o00ooo2.f4584OooO0OO.OooO0o()).toString();
                        if (this.f4576OooO0o0 >= 0) {
                            if (obj.length() <= 0) {
                                z2 = false;
                            }
                            if (!z2 || OooOOOO.o00O0o(obj, ";", false)) {
                                if (this.f4576OooO0o0 == 0) {
                                    this.f4575OooO0o = false;
                                    o00ooo2.f4588OooO0oO = o00ooo2.f4586OooO0o.OooO00o();
                                    oo0o0Oo oo0o0oo = o00ooo2.f4582OooO00o;
                                    OooO00o.OooOo(oo0o0oo);
                                    oo000o oo000oVar = o00ooo2.f4588OooO0oO;
                                    OooO00o.OooOo(oo000oVar);
                                    OooOOO.OooO0O0(oo0o0oo.f4365OooOO0, this.f4574OooO0Oo, oo000oVar);
                                    OooOo();
                                }
                                if (!this.f4575OooO0o) {
                                    return -1L;
                                }
                            }
                        }
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f4576OooO0o0 + obj + '\"');
                    } catch (NumberFormatException e) {
                        throw new ProtocolException(e.getMessage());
                    }
                }
                long OooO0o02 = super.OooO0o0(oooOO0, Math.min(j, this.f4576OooO0o0));
                if (OooO0o02 != -1) {
                    this.f4576OooO0o0 -= OooO0o02;
                    return OooO0o02;
                }
                o00ooo2.f4583OooO0O0.OooOO0O();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                OooOo();
                throw protocolException;
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f4572OooO0O0) {
            return;
        }
        if (this.f4575OooO0o && !OooOO0O.OooO0oO(this, TimeUnit.MILLISECONDS)) {
            this.f4577OooO0oO.f4583OooO0O0.OooOO0O();
            OooOo();
        }
        this.f4572OooO0O0 = true;
    }
}