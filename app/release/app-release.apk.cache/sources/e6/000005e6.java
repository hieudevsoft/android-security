package o0000oO0;

import androidx.appcompat.widget.o0OOO0o;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import o0000O00.OooO00o;
import o0000Oo.o00000;
import o0000Oo.o000000;
import o0000Oo.o000000O;
import o0000Oo.o0O0O00;
import o0000Oo.oo000o;
import o0000Oo.oo0o0Oo;
import o0000Oo0.OooOOOO;
import o0000o.OooOOO;
import o0000o.OooOOO0;
import o0000o0o.o000OO;
import o000O000.OooOO0O;
import o000O000.o0ooOOo;

/* loaded from: classes.dex */
public final class o00Ooo implements OooOOO0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final oo0o0Oo f4582OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final o000OO f4583OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final o000O000.OooOOO0 f4584OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final OooOO0O f4585OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final OooOo f4586OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public int f4587OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public oo000o f4588OooO0oO;

    public o00Ooo(oo0o0Oo oo0o0oo, o000OO o000oo, o000O000.OooOOO0 oooOOO0, OooOO0O oooOO0O) {
        OooO00o.OooOoo0(o000oo, "connection");
        this.f4582OooO00o = oo0o0oo;
        this.f4583OooO0O0 = o000oo;
        this.f4584OooO0OO = oooOOO0;
        this.f4585OooO0Oo = oooOO0O;
        this.f4586OooO0o = new OooOo(oooOOO0);
    }

    public final o0OoOo0 OooO(long j) {
        if (this.f4587OooO0o0 == 4) {
            this.f4587OooO0o0 = 5;
            return new o0OoOo0(this, j);
        }
        throw new IllegalStateException(("state: " + this.f4587OooO0o0).toString());
    }

    @Override // o0000o.OooOOO0
    public final long OooO00o(o00000 o00000Var) {
        if (!OooOOO.OooO00o(o00000Var)) {
            return 0L;
        }
        if (OooOOOO.oo0o0O0("chunked", o00000.OooOo(o00000Var, "Transfer-Encoding"))) {
            return -1L;
        }
        return o0000OoO.OooOO0O.OooOO0(o00000Var);
    }

    @Override // o0000o.OooOOO0
    public final void OooO0O0() {
        this.f4585OooO0Oo.flush();
    }

    @Override // o0000o.OooOOO0
    public final void OooO0OO() {
        this.f4585OooO0Oo.flush();
    }

    @Override // o0000o.OooOOO0
    public final o0ooOOo OooO0Oo(o00000 o00000Var) {
        if (!OooOOO.OooO00o(o00000Var)) {
            return OooO(0L);
        }
        boolean z = true;
        if (OooOOOO.oo0o0O0("chunked", o00000.OooOo(o00000Var, "Transfer-Encoding"))) {
            o0000Oo.o0ooOOo o0ooooo = (o0000Oo.o0ooOOo) o00000Var.f4238OooO00o.f2519OooO0O0;
            if (this.f4587OooO0o0 != 4) {
                z = false;
            }
            if (z) {
                this.f4587OooO0o0 = 5;
                return new o000oOoO(this, o0ooooo);
            }
            throw new IllegalStateException(("state: " + this.f4587OooO0o0).toString());
        }
        long OooOO02 = o0000OoO.OooOO0O.OooOO0(o00000Var);
        if (OooOO02 != -1) {
            return OooO(OooOO02);
        }
        if (this.f4587OooO0o0 != 4) {
            z = false;
        }
        if (z) {
            this.f4587OooO0o0 = 5;
            this.f4583OooO0O0.OooOO0O();
            return new o00Oo0(this);
        }
        throw new IllegalStateException(("state: " + this.f4587OooO0o0).toString());
    }

    @Override // o0000o.OooOOO0
    public final o000O000.oo000o OooO0o(o0OOO0o o0ooo0o, long j) {
        o000000 o000000Var = (o000000) o0ooo0o.f2523OooO0o0;
        if (o000000Var != null) {
            o000000Var.getClass();
        }
        boolean z = true;
        if (OooOOOO.oo0o0O0("chunked", ((oo000o) o0ooo0o.f2521OooO0Oo).OooO0o("Transfer-Encoding"))) {
            if (this.f4587OooO0o0 != 1) {
                z = false;
            }
            if (z) {
                this.f4587OooO0o0 = 2;
                return new Oooo0(this);
            }
            throw new IllegalStateException(("state: " + this.f4587OooO0o0).toString());
        } else if (j != -1) {
            if (this.f4587OooO0o0 != 1) {
                z = false;
            }
            if (z) {
                this.f4587OooO0o0 = 2;
                return new o00O0O(this);
            }
            throw new IllegalStateException(("state: " + this.f4587OooO0o0).toString());
        } else {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    @Override // o0000o.OooOOO0
    public final o000000O OooO0o0(boolean z) {
        boolean z2;
        OooOo oooOo = this.f4586OooO0o;
        int i = this.f4587OooO0o0;
        boolean z3 = false;
        if (i != 1 && i != 2 && i != 3) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            try {
                String OooOO0o2 = oooOo.f4566OooO00o.OooOO0o(oooOo.f4567OooO0O0);
                oooOo.f4567OooO0O0 -= OooOO0o2.length();
                o0000o.OooOo OooOOo2 = o0000Oo.OooOOOO.OooOOo(OooOO0o2);
                int i2 = OooOOo2.f4448OooO0O0;
                o000000O o000000o2 = new o000000O();
                o0O0O00 o0o0o00 = OooOOo2.f4447OooO00o;
                OooO00o.OooOoo0(o0o0o00, "protocol");
                o000000o2.f4255OooO0O0 = o0o0o00;
                o000000o2.f4256OooO0OO = i2;
                String str = OooOOo2.f4449OooO0OO;
                OooO00o.OooOoo0(str, "message");
                o000000o2.f4257OooO0Oo = str;
                o000000o2.f4258OooO0o = oooOo.OooO00o().OooO0oo();
                if (z && i2 == 100) {
                    return null;
                }
                if (i2 != 100) {
                    if (102 <= i2 && i2 < 200) {
                        z3 = true;
                    }
                    if (!z3) {
                        this.f4587OooO0o0 = 4;
                        return o000000o2;
                    }
                }
                this.f4587OooO0o0 = 3;
                return o000000o2;
            } catch (EOFException e) {
                throw new IOException("unexpected end of stream on " + this.f4583OooO0O0.f4551OooO0O0.f4269OooO00o.f4168OooO.OooO0o(), e);
            }
        }
        throw new IllegalStateException(("state: " + this.f4587OooO0o0).toString());
    }

    @Override // o0000o.OooOOO0
    public final void OooO0oO(o0OOO0o o0ooo0o) {
        boolean z;
        Proxy.Type type = this.f4583OooO0O0.f4551OooO0O0.f4270OooO0O0.type();
        OooO00o.OooOoOO(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append((String) o0ooo0o.f2520OooO0OO);
        sb.append(' ');
        Object obj = o0ooo0o.f2519OooO0O0;
        if (!((o0000Oo.o0ooOOo) obj).f4344OooO && type == Proxy.Type.HTTP) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            sb.append((o0000Oo.o0ooOOo) obj);
        } else {
            o0000Oo.o0ooOOo o0ooooo = (o0000Oo.o0ooOOo) obj;
            OooO00o.OooOoo0(o0ooooo, "url");
            String OooO0O02 = o0ooooo.OooO0O0();
            String OooO0Oo2 = o0ooooo.OooO0Oo();
            if (OooO0Oo2 != null) {
                OooO0O02 = OooO0O02 + '?' + OooO0Oo2;
            }
            sb.append(OooO0O02);
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        OooO00o.OooOoOO(sb2, "StringBuilder().apply(builderAction).toString()");
        OooOO0((oo000o) o0ooo0o.f2521OooO0Oo, sb2);
    }

    @Override // o0000o.OooOOO0
    public final o000OO OooO0oo() {
        return this.f4583OooO0O0;
    }

    public final void OooOO0(oo000o oo000oVar, String str) {
        boolean z;
        OooO00o.OooOoo0(oo000oVar, "headers");
        OooO00o.OooOoo0(str, "requestLine");
        if (this.f4587OooO0o0 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            OooOO0O oooOO0O = this.f4585OooO0Oo;
            oooOO0O.OooOO0O(str).OooOO0O("\r\n");
            int length = oo000oVar.f4353OooO00o.length / 2;
            for (int i = 0; i < length; i++) {
                oooOO0O.OooOO0O(oo000oVar.OooO0oO(i)).OooOO0O(": ").OooOO0O(oo000oVar.OooO(i)).OooOO0O("\r\n");
            }
            oooOO0O.OooOO0O("\r\n");
            this.f4587OooO0o0 = 1;
            return;
        }
        throw new IllegalStateException(("state: " + this.f4587OooO0o0).toString());
    }

    @Override // o0000o.OooOOO0
    public final void cancel() {
        Socket socket = this.f4583OooO0O0.f4552OooO0OO;
        if (socket != null) {
            o0000OoO.OooOO0O.OooO0Oo(socket);
        }
    }
}