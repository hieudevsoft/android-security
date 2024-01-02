package o0000oOO;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import o0000O00.OooO00o;
import o000O000.OooOO0O;
import o000O000.OooOOO0;

/* loaded from: classes.dex */
public final class o000000O implements Closeable {

    /* renamed from: OooOoo0  reason: collision with root package name */
    public static final o0000O f4633OooOoo0;

    /* renamed from: OooO  reason: collision with root package name */
    public final o0000o0O.oo0o0Oo f4634OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final boolean f4635OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final oo000o f4636OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final LinkedHashMap f4637OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final String f4638OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public int f4639OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public int f4640OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public boolean f4641OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final o0000o0O.o000000 f4642OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public final o0000o0O.oo0o0Oo f4643OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public final o0000o0O.oo0o0Oo f4644OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public final OooOoo.o0ooOOo f4645OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public long f4646OooOOO;
    public long OooOOO0;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public long f4647OooOOOO;

    /* renamed from: OooOOOo  reason: collision with root package name */
    public long f4648OooOOOo;

    /* renamed from: OooOOo  reason: collision with root package name */
    public final o0000O f4649OooOOo;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public long f4650OooOOo0;

    /* renamed from: OooOOoo  reason: collision with root package name */
    public o0000O f4651OooOOoo;

    /* renamed from: OooOo  reason: collision with root package name */
    public final Socket f4652OooOo;

    /* renamed from: OooOo0  reason: collision with root package name */
    public long f4653OooOo0;

    /* renamed from: OooOo00  reason: collision with root package name */
    public long f4654OooOo00;

    /* renamed from: OooOo0O  reason: collision with root package name */
    public long f4655OooOo0O;

    /* renamed from: OooOo0o  reason: collision with root package name */
    public long f4656OooOo0o;

    /* renamed from: OooOoO  reason: collision with root package name */
    public final o0Oo0oo f4657OooOoO;

    /* renamed from: OooOoO0  reason: collision with root package name */
    public final o0000O0 f4658OooOoO0;

    /* renamed from: OooOoOO  reason: collision with root package name */
    public final LinkedHashSet f4659OooOoOO;

    static {
        o0000O o0000o2 = new o0000O();
        o0000o2.OooO0O0(7, 65535);
        o0000o2.OooO0O0(5, 16384);
        f4633OooOoo0 = o0000o2;
    }

    public o000000O(o00Oo0 o00oo0) {
        int i;
        boolean z = o00oo0.f4720OooO00o;
        this.f4635OooO00o = z;
        this.f4636OooO0O0 = o00oo0.f4726OooO0oO;
        this.f4637OooO0OO = new LinkedHashMap();
        String str = o00oo0.f4723OooO0Oo;
        if (str != null) {
            this.f4638OooO0Oo = str;
            if (z) {
                i = 3;
            } else {
                i = 2;
            }
            this.f4639OooO0o = i;
            o0000o0O.o000000 o000000Var = o00oo0.f4721OooO0O0;
            this.f4642OooO0oo = o000000Var;
            o0000o0O.oo0o0Oo OooO0o2 = o000000Var.OooO0o();
            this.f4634OooO = OooO0o2;
            this.f4643OooOO0 = o000000Var.OooO0o();
            this.f4644OooOO0O = o000000Var.OooO0o();
            this.f4645OooOO0o = o00oo0.f4727OooO0oo;
            o0000O o0000o2 = new o0000O();
            if (z) {
                o0000o2.OooO0O0(7, 16777216);
            }
            this.f4649OooOOo = o0000o2;
            o0000O o0000o3 = f4633OooOoo0;
            this.f4651OooOOoo = o0000o3;
            this.f4656OooOo0o = o0000o3.OooO00o();
            Socket socket = o00oo0.f4722OooO0OO;
            if (socket != null) {
                this.f4652OooOo = socket;
                OooOO0O oooOO0O = o00oo0.f4724OooO0o;
                if (oooOO0O != null) {
                    this.f4658OooOoO0 = new o0000O0(oooOO0O, z);
                    OooOOO0 oooOOO0 = o00oo0.f4725OooO0o0;
                    if (oooOOO0 != null) {
                        this.f4657OooOoO = new o0Oo0oo(this, new o00000O(oooOOO0, z));
                        this.f4659OooOoOO = new LinkedHashSet();
                        int i2 = o00oo0.f4719OooO;
                        if (i2 != 0) {
                            long nanos = TimeUnit.MILLISECONDS.toNanos(i2);
                            OooO0o2.OooO0OO(new o000OOo(str.concat(" ping"), this, nanos), nanos);
                            return;
                        }
                        return;
                    }
                    OooO00o.o000ooo0("source");
                    throw null;
                }
                OooO00o.o000ooo0("sink");
                throw null;
            }
            OooO00o.o000ooo0("socket");
            throw null;
        }
        OooO00o.o000ooo0("connectionName");
        throw null;
    }

    public final void OooOo(OooOo oooOo, OooOo oooOo2, IOException iOException) {
        int i;
        Object[] objArr;
        byte[] bArr = o0000OoO.OooOO0O.f4403OooO00o;
        try {
            OooOoo0(oooOo);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (!this.f4637OooO0OO.isEmpty()) {
                objArr = this.f4637OooO0OO.values().toArray(new o0000oo[0]);
                this.f4637OooO0OO.clear();
            } else {
                objArr = null;
            }
        }
        o0000oo[] o0000ooVarArr = (o0000oo[]) objArr;
        if (o0000ooVarArr != null) {
            for (o0000oo o0000ooVar : o0000ooVarArr) {
                try {
                    o0000ooVar.OooO0OO(oooOo2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f4658OooOoO0.close();
        } catch (IOException unused3) {
        }
        try {
            this.f4652OooOo.close();
        } catch (IOException unused4) {
        }
        this.f4634OooO.OooO0o0();
        this.f4643OooOO0.OooO0o0();
        this.f4644OooOO0O.OooO0o0();
    }

    public final synchronized o0000oo OooOoO(int i) {
        return (o0000oo) this.f4637OooO0OO.get(Integer.valueOf(i));
    }

    public final void OooOoO0(IOException iOException) {
        OooOo oooOo = OooOo.PROTOCOL_ERROR;
        OooOo(oooOo, oooOo, iOException);
    }

    public final synchronized o0000oo OooOoOO(int i) {
        o0000oo o0000ooVar;
        o0000ooVar = (o0000oo) this.f4637OooO0OO.remove(Integer.valueOf(i));
        notifyAll();
        return o0000ooVar;
    }

    public final synchronized void OooOoo(long j) {
        long j2 = this.f4654OooOo00 + j;
        this.f4654OooOo00 = j2;
        long j3 = j2 - this.f4653OooOo0;
        if (j3 >= this.f4649OooOOo.OooO00o() / 2) {
            Oooo000(0, j3);
            this.f4653OooOo0 += j3;
        }
    }

    public final void OooOoo0(OooOo oooOo) {
        synchronized (this.f4658OooOoO0) {
            synchronized (this) {
                if (this.f4641OooO0oO) {
                    return;
                }
                this.f4641OooO0oO = true;
                this.f4658OooOoO0.OooOoOO(this.f4640OooO0o0, oooOo, o0000OoO.OooOO0O.f4403OooO00o);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f4658OooOoO0.f4679OooO0Oo);
        r6 = r2;
        r8.f4655OooOo0O += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooOooO(int r9, boolean r10, o000O000.OooOO0 r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            o0000oOO.o0000O0 r12 = r8.f4658OooOoO0
            r12.OooOoO0(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L68
            monitor-enter(r8)
        L12:
            long r4 = r8.f4655OooOo0O     // Catch: java.lang.Throwable -> L57 java.lang.InterruptedException -> L59
            long r6 = r8.f4656OooOo0o     // Catch: java.lang.Throwable -> L57 java.lang.InterruptedException -> L59
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L32
            java.util.LinkedHashMap r2 = r8.f4637OooO0OO     // Catch: java.lang.Throwable -> L57 java.lang.InterruptedException -> L59
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L57 java.lang.InterruptedException -> L59
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L57 java.lang.InterruptedException -> L59
            if (r2 == 0) goto L2a
            r8.wait()     // Catch: java.lang.Throwable -> L57 java.lang.InterruptedException -> L59
            goto L12
        L2a:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L57 java.lang.InterruptedException -> L59
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L57 java.lang.InterruptedException -> L59
            throw r9     // Catch: java.lang.Throwable -> L57 java.lang.InterruptedException -> L59
        L32:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L57
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L57
            o0000oOO.o0000O0 r4 = r8.f4658OooOoO0     // Catch: java.lang.Throwable -> L57
            int r4 = r4.f4679OooO0Oo     // Catch: java.lang.Throwable -> L57
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L57
            long r4 = r8.f4655OooOo0O     // Catch: java.lang.Throwable -> L57
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L57
            long r4 = r4 + r6
            r8.f4655OooOo0O = r4     // Catch: java.lang.Throwable -> L57
            monitor-exit(r8)
            long r12 = r12 - r6
            o0000oOO.o0000O0 r4 = r8.f4658OooOoO0
            if (r10 == 0) goto L52
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L52
            r5 = 1
            goto L53
        L52:
            r5 = r3
        L53:
            r4.OooOoO0(r5, r9, r11, r2)
            goto Ld
        L57:
            r9 = move-exception
            goto L66
        L59:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L57
            r9.interrupt()     // Catch: java.lang.Throwable -> L57
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L57
            r9.<init>()     // Catch: java.lang.Throwable -> L57
            throw r9     // Catch: java.lang.Throwable -> L57
        L66:
            monitor-exit(r8)
            throw r9
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o0000oOO.o000000O.OooOooO(int, boolean, o000O000.OooOO0, long):void");
    }

    public final void OooOooo(int i, OooOo oooOo) {
        this.f4634OooO.OooO0OO(new o0O0O00(this.f4638OooO0Oo + '[' + i + "] writeSynReset", this, i, oooOo, 1), 0L);
    }

    public final void Oooo000(int i, long j) {
        this.f4634OooO.OooO0OO(new o000000(this.f4638OooO0Oo + '[' + i + "] windowUpdate", this, i, j), 0L);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        OooOo(OooOo.NO_ERROR, OooOo.CANCEL, null);
    }

    public final void flush() {
        o0000O0 o0000o02 = this.f4658OooOoO0;
        synchronized (o0000o02) {
            if (!o0000o02.f4681OooO0o0) {
                o0000o02.f4676OooO00o.flush();
            } else {
                throw new IOException("closed");
            }
        }
    }
}