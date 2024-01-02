package o0000o0o;

import OooOoo.o0ooOOo;
import androidx.appcompat.widget.o0OOO0o;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import o00000oO.OooOo00;
import o0000O00.OooO00o;
import o0000Oo.OooO0o;
import o0000Oo.OooOOO;
import o0000Oo.OooOOOO;
import o0000Oo.Oooo000;
import o0000Oo.o000OOo;
import o0000Oo.o00Oo0;
import o0000Oo.o00Ooo;
import o0000Oo.o0O0O00;
import o0000Oo.oo0o0Oo;
import o0000OoO.OooOO0O;
import o0000o.OooOOO0;
import o0000o0O.o000000;
import o0000o0O.o0OO00O;
import o0000oOO.OooOo;
import o0000oOO.o00O0O;
import o0000oOO.oo000o;
import o0000oOo.o000OO00;
import o000O000.o000oOoO;
import o000O000.o0OoOo0;
import o0OO00O.OooO0OO;

/* loaded from: classes.dex */
public final class o000OO extends oo000o {

    /* renamed from: OooO  reason: collision with root package name */
    public o000oOoO f4550OooO;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final o0000Oo.o00000OO f4551OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public Socket f4552OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public Socket f4553OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public o0O0O00 f4554OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public o00Oo0 f4555OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public o0000oOO.o000000O f4556OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public o0OoOo0 f4557OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public boolean f4558OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public boolean f4559OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public int f4560OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public int f4561OooOOO;
    public int OooOOO0;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public int f4562OooOOOO;

    /* renamed from: OooOOOo  reason: collision with root package name */
    public final ArrayList f4563OooOOOo;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public long f4564OooOOo0;

    public o000OO(o0000O o0000o2, o0000Oo.o00000OO o00000oo2) {
        OooO00o.OooOoo0(o0000o2, "connectionPool");
        OooO00o.OooOoo0(o00000oo2, "route");
        this.f4551OooO0O0 = o00000oo2;
        this.f4562OooOOOO = 1;
        this.f4563OooOOOo = new ArrayList();
        this.f4564OooOOo0 = Long.MAX_VALUE;
    }

    public static void OooO0Oo(oo0o0Oo oo0o0oo, o0000Oo.o00000OO o00000oo2, IOException iOException) {
        OooO00o.OooOoo0(oo0o0oo, "client");
        OooO00o.OooOoo0(o00000oo2, "failedRoute");
        OooO00o.OooOoo0(iOException, "failure");
        if (o00000oo2.f4270OooO0O0.type() != Proxy.Type.DIRECT) {
            OooO0o oooO0o = o00000oo2.f4269OooO00o;
            oooO0o.f4176OooO0oo.connectFailed(oooO0o.f4168OooO.OooO0oO(), o00000oo2.f4270OooO0O0.address(), iOException);
        }
        OooO0OO oooO0OO = oo0o0oo.f4382OooOoo;
        synchronized (oooO0OO) {
            ((Set) oooO0OO.f5302OooO0O0).add(o00000oo2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
        if (r0 >= r2.f4650OooOOo0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooO(boolean r10) {
        /*
            r9 = this;
            byte[] r0 = o0000OoO.OooOO0O.f4403OooO00o
            long r0 = java.lang.System.nanoTime()
            java.net.Socket r2 = r9.f4552OooO0OO
            o0000O00.OooO00o.OooOo(r2)
            java.net.Socket r3 = r9.f4553OooO0Oo
            o0000O00.OooO00o.OooOo(r3)
            o000O000.o0OoOo0 r4 = r9.f4557OooO0oo
            o0000O00.OooO00o.OooOo(r4)
            boolean r2 = r2.isClosed()
            r5 = 0
            if (r2 != 0) goto L7c
            boolean r2 = r3.isClosed()
            if (r2 != 0) goto L7c
            boolean r2 = r3.isInputShutdown()
            if (r2 != 0) goto L7c
            boolean r2 = r3.isOutputShutdown()
            if (r2 == 0) goto L2f
            goto L7c
        L2f:
            o0000oOO.o000000O r2 = r9.f4556OooO0oO
            r6 = 1
            if (r2 == 0) goto L50
            monitor-enter(r2)
            boolean r10 = r2.f4641OooO0oO     // Catch: java.lang.Throwable -> L4d
            if (r10 == 0) goto L3a
            goto L48
        L3a:
            long r3 = r2.f4648OooOOOo     // Catch: java.lang.Throwable -> L4d
            long r7 = r2.f4647OooOOOO     // Catch: java.lang.Throwable -> L4d
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 >= 0) goto L4a
            long r3 = r2.f4650OooOOo0     // Catch: java.lang.Throwable -> L4d
            int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r10 < 0) goto L4a
        L48:
            monitor-exit(r2)
            goto L4c
        L4a:
            monitor-exit(r2)
            r5 = r6
        L4c:
            return r5
        L4d:
            r10 = move-exception
            monitor-exit(r2)
            throw r10
        L50:
            monitor-enter(r9)
            long r7 = r9.f4564OooOOo0     // Catch: java.lang.Throwable -> L79
            long r0 = r0 - r7
            monitor-exit(r9)
            r7 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 < 0) goto L78
            if (r10 == 0) goto L78
            int r10 = r3.getSoTimeout()     // Catch: java.net.SocketTimeoutException -> L76 java.io.IOException -> L77
            r3.setSoTimeout(r6)     // Catch: java.lang.Throwable -> L71
            boolean r0 = r4.OooOOOO()     // Catch: java.lang.Throwable -> L71
            r0 = r0 ^ r6
            r3.setSoTimeout(r10)     // Catch: java.net.SocketTimeoutException -> L76 java.io.IOException -> L77
            r5 = r0
            goto L77
        L71:
            r0 = move-exception
            r3.setSoTimeout(r10)     // Catch: java.net.SocketTimeoutException -> L76 java.io.IOException -> L77
            throw r0     // Catch: java.net.SocketTimeoutException -> L76 java.io.IOException -> L77
        L76:
            r5 = r6
        L77:
            return r5
        L78:
            return r6
        L79:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        L7c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o0000o0o.o000OO.OooO(boolean):boolean");
    }

    @Override // o0000oOO.oo000o
    public final synchronized void OooO00o(o0000oOO.o000000O o000000o2, o0000oOO.o0000O o0000o2) {
        int i;
        OooO00o.OooOoo0(o000000o2, "connection");
        OooO00o.OooOoo0(o0000o2, "settings");
        if ((o0000o2.f4673OooO00o & 16) != 0) {
            i = o0000o2.f4674OooO0O0[4];
        } else {
            i = Integer.MAX_VALUE;
        }
        this.f4562OooOOOO = i;
    }

    @Override // o0000oOO.oo000o
    public final void OooO0O0(o0000oOO.o0000oo o0000ooVar) {
        OooO00o.OooOoo0(o0000ooVar, "stream");
        o0000ooVar.OooO0OO(OooOo.REFUSED_STREAM, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0165 A[EDGE_INSN: B:103:0x0165->B:91:0x0165 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0OO(int r17, int r18, int r19, int r20, boolean r21, o0000o0o.o0000O0 r22, OooOoo.o0ooOOo r23) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0000o0o.o000OO.OooO0OO(int, int, int, int, boolean, o0000o0o.o0000O0, OooOoo.o0ooOOo):void");
    }

    public final void OooO0o(int i, int i2, int i3, o0000O0 o0000o02, o0ooOOo o0ooooo) {
        o000OOo o000ooo = new o000OOo();
        o0000Oo.o00000OO o00000oo2 = this.f4551OooO0O0;
        o0000Oo.o0ooOOo o0ooooo2 = o00000oo2.f4269OooO00o.f4168OooO;
        OooO00o.OooOoo0(o0ooooo2, "url");
        o000ooo.f4279OooO00o = o0ooooo2;
        o000ooo.OooO0OO("CONNECT", null);
        OooO0o oooO0o = o00000oo2.f4269OooO00o;
        o000ooo.OooO0O0("Host", OooOO0O.OooOo0O(oooO0o.f4168OooO, true));
        o000ooo.OooO0O0("Proxy-Connection", "Keep-Alive");
        o000ooo.OooO0O0("User-Agent", "okhttp/4.12.0");
        o0OOO0o OooO00o2 = o000ooo.OooO00o();
        o0000Oo.o000000O o000000o2 = new o0000Oo.o000000O();
        o000000o2.f4254OooO00o = OooO00o2;
        o000000o2.f4255OooO0O0 = o0O0O00.f4300OooO0OO;
        o000000o2.f4256OooO0OO = 407;
        o000000o2.f4257OooO0Oo = "Preemptive Authenticate";
        o000000o2.f4260OooO0oO = OooOO0O.f4405OooO0OO;
        o000000o2.f4263OooOO0O = -1L;
        o000000o2.f4264OooOO0o = -1L;
        o00Ooo o00ooo2 = o000000o2.f4258OooO0o;
        o00ooo2.getClass();
        OooOOOO.OooO0Oo("Proxy-Authenticate");
        OooOOOO.OooO0o0("OkHttp-Preemptive", "Proxy-Authenticate");
        o00ooo2.OooO0OO("Proxy-Authenticate");
        o00ooo2.OooO00o("Proxy-Authenticate", "OkHttp-Preemptive");
        o000000o2.OooO00o();
        ((o0ooOOo) oooO0o.f4173OooO0o).getClass();
        OooO0o0(i, i2, o0000o02, o0ooooo);
        o0OoOo0 o0oooo0 = this.f4557OooO0oo;
        OooO00o.OooOo(o0oooo0);
        o000oOoO o000oooo = this.f4550OooO;
        OooO00o.OooOo(o000oooo);
        o0000oO0.o00Ooo o00ooo3 = new o0000oO0.o00Ooo(null, this, o0oooo0, o000oooo);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        o0oooo0.OooO00o().OooO0oO(i2, timeUnit);
        o000oooo.OooO00o().OooO0oO(i3, timeUnit);
        o00ooo3.OooOO0((o0000Oo.oo000o) OooO00o2.f2521OooO0Oo, "CONNECT " + OooOO0O.OooOo0O((o0000Oo.o0ooOOo) OooO00o2.f2519OooO0O0, true) + " HTTP/1.1");
        o00ooo3.OooO0O0();
        o0000Oo.o000000O OooO0o02 = o00ooo3.OooO0o0(false);
        OooO00o.OooOo(OooO0o02);
        OooO0o02.f4254OooO00o = OooO00o2;
        o0000Oo.o00000 OooO00o3 = OooO0o02.OooO00o();
        long OooOO02 = OooOO0O.OooOO0(OooO00o3);
        if (OooOO02 != -1) {
            o0000oO0.o0OoOo0 OooO2 = o00ooo3.OooO(OooOO02);
            OooOO0O.OooOo00(OooO2, Integer.MAX_VALUE, timeUnit);
            OooO2.close();
        }
        int i4 = OooO00o3.f4241OooO0Oo;
        if (i4 != 200) {
            if (i4 == 407) {
                ((o0ooOOo) oooO0o.f4173OooO0o).getClass();
                throw new IOException("Failed to authenticate with proxy");
            }
            throw new IOException(OooO0O0.OooO00o.OooO0O0("Unexpected response code for CONNECT: ", i4));
        } else if (o0oooo0.f4861OooO0O0.OooOOOO() && o000oooo.f4842OooO0O0.OooOOOO()) {
        } else {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final void OooO0o0(int i, int i2, o0000O0 o0000o02, o0ooOOo o0ooooo) {
        int i3;
        Socket createSocket;
        o0000Oo.o00000OO o00000oo2 = this.f4551OooO0O0;
        Proxy proxy = o00000oo2.f4270OooO0O0;
        OooO0o oooO0o = o00000oo2.f4269OooO00o;
        Proxy.Type type = proxy.type();
        if (type == null) {
            i3 = -1;
        } else {
            i3 = o0000O0O.f4537OooO00o[type.ordinal()];
        }
        if (i3 != 1 && i3 != 2) {
            createSocket = new Socket(proxy);
        } else {
            createSocket = oooO0o.f4170OooO0O0.createSocket();
            OooO00o.OooOo(createSocket);
        }
        this.f4552OooO0OO = createSocket;
        InetSocketAddress inetSocketAddress = this.f4551OooO0O0.f4271OooO0OO;
        o0ooooo.getClass();
        OooO00o.OooOoo0(o0000o02, "call");
        OooO00o.OooOoo0(inetSocketAddress, "inetSocketAddress");
        createSocket.setSoTimeout(i2);
        try {
            o000OO00 o000oo00 = o000OO00.f4772OooO00o;
            o000OO00.f4772OooO00o.OooO0o0(createSocket, this.f4551OooO0O0.f4271OooO0OO, i);
            try {
                this.f4557OooO0oo = new o0OoOo0(OooO00o.o000ooO0(createSocket));
                this.f4550OooO = new o000oOoO(OooO00o.o000oOoo(createSocket));
            } catch (NullPointerException e) {
                if (!OooO00o.OooOOO0(e.getMessage(), "throw with null exception")) {
                    return;
                }
                throw new IOException(e);
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f4551OooO0O0.f4271OooO0OO);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void OooO0oO(o00000 o00000Var, int i, o0000O0 o0000o02, o0ooOOo o0ooooo) {
        SSLSocket sSLSocket;
        OooO0o oooO0o = this.f4551OooO0O0.f4269OooO00o;
        SSLSocketFactory sSLSocketFactory = oooO0o.f4171OooO0OO;
        o0O0O00 o0o0o00 = o0O0O00.f4300OooO0OO;
        if (sSLSocketFactory == null) {
            List list = oooO0o.f4177OooOO0;
            o0O0O00 o0o0o002 = o0O0O00.f4302OooO0o;
            if (list.contains(o0o0o002)) {
                this.f4553OooO0Oo = this.f4552OooO0OO;
                this.f4554OooO0o = o0o0o002;
                OooOO0o(i);
                return;
            }
            this.f4553OooO0Oo = this.f4552OooO0OO;
            this.f4554OooO0o = o0o0o00;
            return;
        }
        o0ooooo.getClass();
        OooO00o.OooOoo0(o0000o02, "call");
        OooO0o oooO0o2 = this.f4551OooO0O0.f4269OooO00o;
        SSLSocketFactory sSLSocketFactory2 = oooO0o2.f4171OooO0OO;
        SSLSocket sSLSocket2 = null;
        String str = null;
        try {
            OooO00o.OooOo(sSLSocketFactory2);
            Socket socket = this.f4552OooO0OO;
            o0000Oo.o0ooOOo o0ooooo2 = oooO0o2.f4168OooO;
            Socket createSocket = sSLSocketFactory2.createSocket(socket, o0ooooo2.f4348OooO0Oo, o0ooooo2.f4350OooO0o0, true);
            OooO00o.OooOoO0(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            sSLSocket = (SSLSocket) createSocket;
        } catch (Throwable th) {
            th = th;
        }
        try {
            Oooo000 OooO00o2 = o00000Var.OooO00o(sSLSocket);
            if (OooO00o2.f4234OooO0O0) {
                o000OO00 o000oo00 = o000OO00.f4772OooO00o;
                o000OO00.f4772OooO00o.OooO0Oo(sSLSocket, oooO0o2.f4168OooO.f4348OooO0Oo, oooO0o2.f4177OooOO0);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            OooO00o.OooOoOO(session, "sslSocketSession");
            o00Oo0 OooOO02 = OooOOOO.OooOO0(session);
            HostnameVerifier hostnameVerifier = oooO0o2.f4172OooO0Oo;
            OooO00o.OooOo(hostnameVerifier);
            if (!hostnameVerifier.verify(oooO0o2.f4168OooO.f4348OooO0Oo, session)) {
                List OooO00o3 = OooOO02.OooO00o();
                if (!OooO00o3.isEmpty()) {
                    Object obj = OooO00o3.get(0);
                    OooO00o.OooOoO0(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate = (X509Certificate) obj;
                    StringBuilder sb = new StringBuilder("\n              |Hostname ");
                    sb.append(oooO0o2.f4168OooO.f4348OooO0Oo);
                    sb.append(" not verified:\n              |    certificate: ");
                    OooOOO oooOOO = OooOOO.f4192OooO0OO;
                    StringBuilder sb2 = new StringBuilder("sha256/");
                    o000O000.OooOOO oooOOO2 = o000O000.OooOOO.f4824OooO0Oo;
                    byte[] encoded = x509Certificate.getPublicKey().getEncoded();
                    OooO00o.OooOoOO(encoded, "publicKey.encoded");
                    sb2.append(o0000oOO.o00000OO.OooOOO(encoded).OooO0O0("SHA-256").OooO00o());
                    sb.append(sb2.toString());
                    sb.append("\n              |    DN: ");
                    sb.append(x509Certificate.getSubjectDN().getName());
                    sb.append("\n              |    subjectAltNames: ");
                    List OooO00o4 = o000.OooO0OO.OooO00o(x509Certificate, 7);
                    List OooO00o5 = o000.OooO0OO.OooO00o(x509Certificate, 2);
                    ArrayList arrayList = new ArrayList(OooO00o5.size() + OooO00o4.size());
                    arrayList.addAll(OooO00o4);
                    arrayList.addAll(OooO00o5);
                    sb.append(arrayList);
                    sb.append("\n              ");
                    throw new SSLPeerUnverifiedException(OooO00o.o00O0000(sb.toString()));
                }
                throw new SSLPeerUnverifiedException("Hostname " + oooO0o2.f4168OooO.f4348OooO0Oo + " not verified (no certificates)");
            }
            OooOOO oooOOO3 = oooO0o2.f4174OooO0o0;
            OooO00o.OooOo(oooOOO3);
            this.f4555OooO0o0 = new o00Oo0(OooOO02.f4286OooO00o, OooOO02.f4287OooO0O0, OooOO02.f4288OooO0OO, new OooOo00(oooOOO3, OooOO02, oooO0o2, 2));
            OooO00o.OooOoo0(oooO0o2.f4168OooO.f4348OooO0Oo, "hostname");
            Iterator it = oooOOO3.f4193OooO00o.iterator();
            if (!it.hasNext()) {
                if (OooO00o2.f4234OooO0O0) {
                    o000OO00 o000oo002 = o000OO00.f4772OooO00o;
                    str = o000OO00.f4772OooO00o.OooO0o(sSLSocket);
                }
                this.f4553OooO0Oo = sSLSocket;
                this.f4557OooO0oo = new o0OoOo0(OooO00o.o000ooO0(sSLSocket));
                this.f4550OooO = new o000oOoO(OooO00o.o000oOoo(sSLSocket));
                if (str != null) {
                    o0o0o00 = OooOOOO.OooOO0o(str);
                }
                this.f4554OooO0o = o0o0o00;
                o000OO00 o000oo003 = o000OO00.f4772OooO00o;
                o000OO00.f4772OooO00o.OooO00o(sSLSocket);
                if (this.f4554OooO0o == o0O0O00.f4303OooO0o0) {
                    OooOO0o(i);
                    return;
                }
                return;
            }
            OooO0O0.OooO00o.OooO0oO(it.next());
            throw null;
        } catch (Throwable th2) {
            th = th2;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                o000OO00 o000oo004 = o000OO00.f4772OooO00o;
                o000OO00.f4772OooO00o.OooO00o(sSLSocket2);
            }
            if (sSLSocket2 != null) {
                OooOO0O.OooO0Oo(sSLSocket2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c3, code lost:
        if (r11 == false) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooO0oo(o0000Oo.OooO0o r10, java.util.List r11) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0000o0o.o000OO.OooO0oo(o0000Oo.OooO0o, java.util.List):boolean");
    }

    public final OooOOO0 OooOO0(oo0o0Oo oo0o0oo, o0000o.OooOOOO oooOOOO) {
        Socket socket = this.f4553OooO0Oo;
        OooO00o.OooOo(socket);
        o0OoOo0 o0oooo0 = this.f4557OooO0oo;
        OooO00o.OooOo(o0oooo0);
        o000oOoO o000oooo = this.f4550OooO;
        OooO00o.OooOo(o000oooo);
        o0000oOO.o000000O o000000o2 = this.f4556OooO0oO;
        if (o000000o2 != null) {
            return new o0000oOO.o00000(oo0o0oo, this, oooOOOO, o000000o2);
        }
        int i = oooOOOO.f4445OooO0oO;
        socket.setSoTimeout(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        o0oooo0.OooO00o().OooO0oO(i, timeUnit);
        o000oooo.OooO00o().OooO0oO(oooOOOO.f4446OooO0oo, timeUnit);
        return new o0000oO0.o00Ooo(oo0o0oo, this, o0oooo0, o000oooo);
    }

    public final synchronized void OooOO0O() {
        this.f4558OooOO0 = true;
    }

    public final void OooOO0o(int i) {
        String concat;
        int i2;
        int OooO00o2;
        int i3;
        Socket socket = this.f4553OooO0Oo;
        OooO00o.OooOo(socket);
        o0OoOo0 o0oooo0 = this.f4557OooO0oo;
        OooO00o.OooOo(o0oooo0);
        o000oOoO o000oooo = this.f4550OooO;
        OooO00o.OooOo(o000oooo);
        socket.setSoTimeout(0);
        o000000 o000000Var = o000000.f4454OooO;
        o0000oOO.o00Oo0 o00oo0 = new o0000oOO.o00Oo0(o000000Var);
        String str = this.f4551OooO0O0.f4269OooO00o.f4168OooO.f4348OooO0Oo;
        OooO00o.OooOoo0(str, "peerName");
        o00oo0.f4722OooO0OO = socket;
        if (o00oo0.f4720OooO00o) {
            concat = OooOO0O.f4409OooO0oO + ' ' + str;
        } else {
            concat = "MockWebServer ".concat(str);
        }
        OooO00o.OooOoo0(concat, "<set-?>");
        o00oo0.f4723OooO0Oo = concat;
        o00oo0.f4725OooO0o0 = o0oooo0;
        o00oo0.f4724OooO0o = o000oooo;
        o00oo0.f4726OooO0oO = this;
        o00oo0.f4719OooO = i;
        o0000oOO.o000000O o000000o2 = new o0000oOO.o000000O(o00oo0);
        this.f4556OooO0oO = o000000o2;
        o0000oOO.o0000O o0000o2 = o0000oOO.o000000O.f4633OooOoo0;
        if ((o0000o2.f4673OooO00o & 16) != 0) {
            i2 = o0000o2.f4674OooO0O0[4];
        } else {
            i2 = Integer.MAX_VALUE;
        }
        this.f4562OooOOOO = i2;
        o0000oOO.o0000O0 o0000o02 = o000000o2.f4658OooOoO0;
        synchronized (o0000o02) {
            if (!o0000o02.f4681OooO0o0) {
                if (o0000o02.f4677OooO0O0) {
                    Logger logger = o0000oOO.o0000O0.f4675OooO0oO;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(OooOO0O.OooO0oo(">> CONNECTION " + o00O0O.f4715OooO00o.OooO0Oo(), new Object[0]));
                    }
                    o0000o02.f4676OooO00o.OooO(o00O0O.f4715OooO00o);
                    o0000o02.f4676OooO00o.flush();
                }
            } else {
                throw new IOException("closed");
            }
        }
        o0000oOO.o0000O0 o0000o03 = o000000o2.f4658OooOoO0;
        o0000oOO.o0000O o0000o3 = o000000o2.f4649OooOOo;
        synchronized (o0000o03) {
            OooO00o.OooOoo0(o0000o3, "settings");
            if (!o0000o03.f4681OooO0o0) {
                o0000o03.OooOoO(0, Integer.bitCount(o0000o3.f4673OooO00o) * 6, 4, 0);
                for (int i4 = 0; i4 < 10; i4++) {
                    boolean z = true;
                    if (((1 << i4) & o0000o3.f4673OooO00o) == 0) {
                        z = false;
                    }
                    if (z) {
                        if (i4 != 4) {
                            if (i4 != 7) {
                                i3 = i4;
                            } else {
                                i3 = 4;
                            }
                        } else {
                            i3 = 3;
                        }
                        o0000o03.f4676OooO00o.OooOOo(i3);
                        o0000o03.f4676OooO00o.OooO0OO(o0000o3.f4674OooO0O0[i4]);
                    }
                }
                o0000o03.f4676OooO00o.flush();
            } else {
                throw new IOException("closed");
            }
        }
        if (o000000o2.f4649OooOOo.OooO00o() != 65535) {
            o000000o2.f4658OooOoO0.OooOooO(0, OooO00o2 - 65535);
        }
        o000000Var.OooO0o().OooO0OO(new o0OO00O(0, o000000o2.f4657OooOoO, o000000o2.f4638OooO0Oo), 0L);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        o0000Oo.o00000OO o00000oo2 = this.f4551OooO0O0;
        sb.append(o00000oo2.f4269OooO00o.f4168OooO.f4348OooO0Oo);
        sb.append(':');
        sb.append(o00000oo2.f4269OooO00o.f4168OooO.f4350OooO0o0);
        sb.append(", proxy=");
        sb.append(o00000oo2.f4270OooO0O0);
        sb.append(" hostAddress=");
        sb.append(o00000oo2.f4271OooO0OO);
        sb.append(" cipherSuite=");
        o00Oo0 o00oo0 = this.f4555OooO0o0;
        sb.append((o00oo0 == null || (r1 = o00oo0.f4287OooO0O0) == null) ? "none" : "none");
        sb.append(" protocol=");
        sb.append(this.f4554OooO0o);
        sb.append('}');
        return sb.toString();
    }
}