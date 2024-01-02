package o0000o;

import com.google.gson.internal.OooO0o;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import o0000O00.OooO00o;
import o0000Oo.o00000;
import o0000Oo.o000000;
import o0000Oo.o000OOo;
import o0000Oo.o00oO0o;
import o0000Oo.o0OOO0o;
import o0000Oo.o0ooOOo;
import o0000Oo.oo0o0Oo;
import o0000o0o.o000;
import o0000o0o.o00000OO;
import o0000o0o.o0000O0;
import o0000o0o.o0000Ooo;
import o0000o0o.o000OO;

/* loaded from: classes.dex */
public final class OooOo00 implements o0OOO0o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final oo0o0Oo f4450OooO00o;

    public OooOo00(oo0o0Oo oo0o0oo) {
        OooO00o.OooOoo0(oo0o0oo, "client");
        this.f4450OooO00o = oo0o0oo;
    }

    public static int OooO0Oo(o00000 o00000Var, int i) {
        String OooOo2 = o00000.OooOo(o00000Var, "Retry-After");
        if (OooOo2 == null) {
            return i;
        }
        Pattern compile = Pattern.compile("\\d+");
        OooO00o.OooOoOO(compile, "compile(pattern)");
        if (compile.matcher(OooOo2).matches()) {
            Integer valueOf = Integer.valueOf(OooOo2);
            OooO00o.OooOoOO(valueOf, "valueOf(header)");
            return valueOf.intValue();
        }
        return Integer.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cb, code lost:
        throw new java.lang.IllegalArgumentException("priorResponse.body != null".toString());
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0000Oo.o0OOO0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o0000Oo.o00000 OooO00o(o0000o.OooOOOO r32) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0000o.OooOo00.OooO00o(o0000o.OooOOOO):o0000Oo.o00000");
    }

    public final androidx.appcompat.widget.o0OOO0o OooO0O0(o00000 o00000Var, o00000OO o00000oo2) {
        o0000Oo.o00000OO o00000oo3;
        String OooOo2;
        o00oO0o o00oo0o;
        o0ooOOo o0ooooo;
        o0000Oo.OooO oooO;
        o000OO o000oo;
        o000000 o000000Var = null;
        if (o00000oo2 != null && (o000oo = o00000oo2.f4513OooO0oO) != null) {
            o00000oo3 = o000oo.f4551OooO0O0;
        } else {
            o00000oo3 = null;
        }
        int i = o00000Var.f4241OooO0Oo;
        String str = (String) o00000Var.f4238OooO00o.f2520OooO0OO;
        boolean z = false;
        if (i != 307 && i != 308) {
            if (i != 401) {
                if (i != 421) {
                    if (i != 503) {
                        if (i != 407) {
                            if (i != 408) {
                                switch (i) {
                                    case 300:
                                    case 301:
                                    case 302:
                                    case 303:
                                        break;
                                    default:
                                        return null;
                                }
                            } else if (!this.f4450OooO00o.f4361OooO0o) {
                                return null;
                            } else {
                                o00000 o00000Var2 = o00000Var.f4246OooOO0;
                                if ((o00000Var2 != null && o00000Var2.f4241OooO0Oo == 408) || OooO0Oo(o00000Var, 0) > 0) {
                                    return null;
                                }
                                return o00000Var.f4238OooO00o;
                            }
                        } else {
                            OooO00o.OooOo(o00000oo3);
                            if (o00000oo3.f4270OooO0O0.type() == Proxy.Type.HTTP) {
                                oooO = this.f4450OooO00o.f4368OooOOO;
                            } else {
                                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                            }
                        }
                    } else {
                        o00000 o00000Var3 = o00000Var.f4246OooOO0;
                        if ((o00000Var3 != null && o00000Var3.f4241OooO0Oo == 503) || OooO0Oo(o00000Var, Integer.MAX_VALUE) != 0) {
                            return null;
                        }
                        return o00000Var.f4238OooO00o;
                    }
                } else if (o00000oo2 == null || !(!OooO00o.OooOOO0(o00000oo2.f4509OooO0OO.f4542OooO0O0.f4168OooO.f4348OooO0Oo, o00000oo2.f4513OooO0oO.f4551OooO0O0.f4269OooO00o.f4168OooO.f4348OooO0Oo))) {
                    return null;
                } else {
                    o000OO o000oo2 = o00000oo2.f4513OooO0oO;
                    synchronized (o000oo2) {
                        o000oo2.f4559OooOO0O = true;
                    }
                    return o00000Var.f4238OooO00o;
                }
            } else {
                oooO = this.f4450OooO00o.f4363OooO0oO;
            }
            ((OooOoo.o0ooOOo) oooO).getClass();
            return null;
        }
        oo0o0Oo oo0o0oo = this.f4450OooO00o;
        if (!oo0o0oo.f4364OooO0oo || (OooOo2 = o00000.OooOo(o00000Var, "Location")) == null) {
            return null;
        }
        androidx.appcompat.widget.o0OOO0o o0ooo0o = o00000Var.f4238OooO00o;
        o0ooOOo o0ooooo2 = (o0ooOOo) o0ooo0o.f2519OooO0O0;
        o0ooooo2.getClass();
        try {
            o00oo0o = new o00oO0o();
            o00oo0o.OooO0OO(o0ooooo2, OooOo2);
        } catch (IllegalArgumentException unused) {
            o00oo0o = null;
        }
        if (o00oo0o != null) {
            o0ooooo = o00oo0o.OooO00o();
        } else {
            o0ooooo = null;
        }
        if (o0ooooo == null) {
            return null;
        }
        if (!OooO00o.OooOOO0(o0ooooo.f4345OooO00o, ((o0ooOOo) o0ooo0o.f2519OooO0O0).f4345OooO00o) && !oo0o0oo.f4356OooO) {
            return null;
        }
        o000OOo o000ooo = new o000OOo(o0ooo0o);
        if (OooO0o.OooOOOo(str)) {
            boolean OooOOO0 = OooO00o.OooOOO0(str, "PROPFIND");
            int i2 = o00000Var.f4241OooO0Oo;
            if (OooOOO0 || i2 == 308 || i2 == 307) {
                z = true;
            }
            if ((true ^ OooO00o.OooOOO0(str, "PROPFIND")) && i2 != 308 && i2 != 307) {
                str = "GET";
            } else if (z) {
                o000000Var = (o000000) o0ooo0o.f2523OooO0o0;
            }
            o000ooo.OooO0OO(str, o000000Var);
            if (!z) {
                o000ooo.f4281OooO0OO.OooO0OO("Transfer-Encoding");
                o000ooo.f4281OooO0OO.OooO0OO("Content-Length");
                o000ooo.f4281OooO0OO.OooO0OO("Content-Type");
            }
        }
        if (!o0000OoO.OooOO0O.OooO00o((o0ooOOo) o0ooo0o.f2519OooO0O0, o0ooooo)) {
            o000ooo.f4281OooO0OO.OooO0OO("Authorization");
        }
        o000ooo.f4279OooO00o = o0ooooo;
        return o000ooo.OooO00o();
    }

    public final boolean OooO0OO(IOException iOException, o0000O0 o0000o02, androidx.appcompat.widget.o0OOO0o o0ooo0o, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        o000 o000Var;
        o000OO o000oo;
        if (!this.f4450OooO00o.f4361OooO0o) {
            return false;
        }
        if (z && (iOException instanceof FileNotFoundException)) {
            return false;
        }
        if ((iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) : !((iOException instanceof SocketTimeoutException) && !z))) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            return false;
        }
        o0000Ooo o0000ooo = o0000o02.f4519OooO;
        OooO00o.OooOo(o0000ooo);
        int i = o0000ooo.f4547OooO0oO;
        if (i == 0 && o0000ooo.f4548OooO0oo == 0 && o0000ooo.f4540OooO == 0) {
            z3 = false;
        } else {
            if (o0000ooo.f4549OooOO0 == null) {
                o0000Oo.o00000OO o00000oo2 = null;
                if (i <= 1 && o0000ooo.f4548OooO0oo <= 1 && o0000ooo.f4540OooO <= 0 && (o000oo = o0000ooo.f4543OooO0OO.f4528OooOO0) != null) {
                    synchronized (o000oo) {
                        if (o000oo.f4560OooOO0o == 0 && o0000OoO.OooOO0O.OooO00o(o000oo.f4551OooO0O0.f4269OooO00o.f4168OooO, o0000ooo.f4542OooO0O0.f4168OooO)) {
                            o00000oo2 = o000oo.f4551OooO0O0;
                        }
                    }
                }
                if (o00000oo2 != null) {
                    o0000ooo.f4549OooOO0 = o00000oo2;
                } else {
                    OooO0Oo.OooOOO oooOOO = o0000ooo.f4546OooO0o0;
                    if (oooOOO != null && oooOOO.OooO0O0()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4 && (o000Var = o0000ooo.f4545OooO0o) != null) {
                        z3 = o000Var.OooO00o();
                    }
                }
            }
            z3 = true;
        }
        if (!z3) {
            return false;
        }
        return true;
    }
}