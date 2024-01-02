package o0000o0o;

import OooOoo.o0ooOOo;
import androidx.appcompat.widget.o0OOO0o;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import o0000O00.OooO00o;
import o0000Oo.OooOO0O;
import o0000Oo.OooOOO0;
import o0000Oo.o0OoOo0;
import o0000Oo.oo0o0Oo;
import o0000oOo.o000OO00;

/* loaded from: classes.dex */
public final class o0000O0 implements OooOO0O {

    /* renamed from: OooO  reason: collision with root package name */
    public o0000Ooo f4519OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final oo0o0Oo f4520OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final o0OOO0o f4521OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final boolean f4522OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final o0000O f4523OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final o0000oo f4524OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final o0ooOOo f4525OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final AtomicBoolean f4526OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public Object f4527OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public o000OO f4528OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public boolean f4529OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public o00000OO f4530OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public boolean f4531OooOOO;
    public boolean OooOOO0;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public boolean f4532OooOOOO;

    /* renamed from: OooOOOo  reason: collision with root package name */
    public volatile boolean f4533OooOOOo;

    /* renamed from: OooOOo  reason: collision with root package name */
    public volatile o000OO f4534OooOOo;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public volatile o00000OO f4535OooOOo0;

    public o0000O0(oo0o0Oo oo0o0oo, o0OOO0o o0ooo0o, boolean z) {
        OooO00o.OooOoo0(oo0o0oo, "client");
        OooO00o.OooOoo0(o0ooo0o, "originalRequest");
        this.f4520OooO00o = oo0o0oo;
        this.f4521OooO0O0 = o0ooo0o;
        this.f4522OooO0OO = z;
        this.f4523OooO0Oo = (o0000O) oo0o0oo.f4358OooO0O0.f5302OooO0O0;
        o0ooOOo o0ooooo = (o0ooOOo) oo0o0oo.f4362OooO0o0.f1441OooO00o;
        byte[] bArr = o0000OoO.OooOO0O.f4403OooO00o;
        OooO00o.OooOoo0(o0ooooo, "$this_asFactory");
        this.f4525OooO0o0 = o0ooooo;
        o0000oo o0000ooVar = new o0000oo(this);
        o0000ooVar.OooO0oO(oo0o0oo.f4378OooOo0o, TimeUnit.MILLISECONDS);
        this.f4524OooO0o = o0000ooVar;
        this.f4526OooO0oO = new AtomicBoolean();
        this.f4532OooOOOO = true;
    }

    public static final String OooO00o(o0000O0 o0000o02) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (o0000o02.f4533OooOOOo) {
            str = "canceled ";
        } else {
            str = "";
        }
        sb.append(str);
        if (o0000o02.f4522OooO0OO) {
            str2 = "web socket";
        } else {
            str2 = "call";
        }
        sb.append(str2);
        sb.append(" to ");
        sb.append(((o0000Oo.o0ooOOo) o0000o02.f4521OooO0O0.f2519OooO0O0).OooO0o());
        return sb.toString();
    }

    public final IOException OooO(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.f4532OooOOOO) {
                this.f4532OooOOOO = false;
                if (!this.OooOOO0) {
                    if (!this.f4531OooOOO) {
                        z = true;
                    }
                }
            }
        }
        return z ? OooO0OO(iOException) : iOException;
    }

    public final void OooO0O0(o000OO o000oo) {
        boolean z;
        byte[] bArr = o0000OoO.OooOO0O.f4403OooO00o;
        if (this.f4528OooOO0 == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f4528OooOO0 = o000oo;
            o000oo.f4563OooOOOo.add(new o0000O00(this, this.f4527OooO0oo));
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final IOException OooO0OO(IOException iOException) {
        IOException iOException2;
        o0ooOOo o0ooooo;
        Socket OooOO02;
        boolean z;
        byte[] bArr = o0000OoO.OooOO0O.f4403OooO00o;
        o000OO o000oo = this.f4528OooOO0;
        if (o000oo != null) {
            synchronized (o000oo) {
                OooOO02 = OooOO0();
            }
            if (this.f4528OooOO0 == null) {
                if (OooOO02 != null) {
                    o0000OoO.OooOO0O.OooO0Oo(OooOO02);
                }
                this.f4525OooO0o0.getClass();
            } else {
                if (OooOO02 == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        if (this.f4529OooOO0O || !this.f4524OooO0o.OooO()) {
            iOException2 = iOException;
        } else {
            iOException2 = new InterruptedIOException("timeout");
            if (iOException != null) {
                iOException2.initCause(iOException);
            }
        }
        if (iOException != null) {
            o0ooooo = this.f4525OooO0o0;
            OooO00o.OooOo(iOException2);
        } else {
            o0ooooo = this.f4525OooO0o0;
        }
        o0ooooo.getClass();
        return iOException2;
    }

    public final void OooO0Oo() {
        Socket socket;
        if (this.f4533OooOOOo) {
            return;
        }
        this.f4533OooOOOo = true;
        o00000OO o00000oo2 = this.f4535OooOOo0;
        if (o00000oo2 != null) {
            o00000oo2.f4510OooO0Oo.cancel();
        }
        o000OO o000oo = this.f4534OooOOo;
        if (o000oo != null && (socket = o000oo.f4552OooO0OO) != null) {
            o0000OoO.OooOO0O.OooO0Oo(socket);
        }
        this.f4525OooO0o0.getClass();
    }

    public final void OooO0o(boolean z) {
        o00000OO o00000oo2;
        synchronized (this) {
            if (!this.f4532OooOOOO) {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z && (o00000oo2 = this.f4535OooOOo0) != null) {
            o00000oo2.f4510OooO0Oo.cancel();
            o00000oo2.f4507OooO00o.OooO0oo(o00000oo2, true, true, null);
        }
        this.f4530OooOO0o = null;
    }

    public final void OooO0o0(OooOOO0 oooOOO0) {
        o0000 o0000Var;
        if (this.f4526OooO0oO.compareAndSet(false, true)) {
            o000OO00 o000oo00 = o000OO00.f4772OooO00o;
            this.f4527OooO0oo = o000OO00.f4772OooO00o.OooO0oO();
            this.f4525OooO0o0.getClass();
            o0OoOo0 o0oooo0 = this.f4520OooO00o.f4357OooO00o;
            o0000 o0000Var2 = new o0000(this, oooOOO0);
            o0oooo0.getClass();
            synchronized (o0oooo0) {
                o0oooo0.f4340OooO0O0.add(o0000Var2);
                if (!this.f4522OooO0OO) {
                    String str = ((o0000Oo.o0ooOOo) this.f4521OooO0O0.f2519OooO0O0).f4348OooO0Oo;
                    Iterator it = o0oooo0.f4341OooO0OO.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            o0000Var = (o0000) it.next();
                            if (OooO00o.OooOOO0(((o0000Oo.o0ooOOo) o0000Var.f4488OooO0OO.f4521OooO0O0.f2519OooO0O0).f4348OooO0Oo, str)) {
                                break;
                            }
                        } else {
                            Iterator it2 = o0oooo0.f4340OooO0O0.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    o0000Var = (o0000) it2.next();
                                    if (OooO00o.OooOOO0(((o0000Oo.o0ooOOo) o0000Var.f4488OooO0OO.f4521OooO0O0.f2519OooO0O0).f4348OooO0Oo, str)) {
                                        break;
                                    }
                                } else {
                                    o0000Var = null;
                                    break;
                                }
                            }
                        }
                    }
                    if (o0000Var != null) {
                        o0000Var2.f4487OooO0O0 = o0000Var.f4487OooO0O0;
                    }
                }
            }
            o0oooo0.OooO0O0();
            return;
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o0000Oo.o00000 OooO0oO() {
        /*
            r10 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            o0000Oo.oo0o0Oo r0 = r10.f4520OooO00o
            java.util.List r0 = r0.f4359OooO0OO
            o0000.OooOo.o00O0Oo(r0, r2)
            o0000o.OooOo00 r0 = new o0000o.OooOo00
            o0000Oo.oo0o0Oo r1 = r10.f4520OooO00o
            r0.<init>(r1)
            r2.add(r0)
            o0000o.OooO r0 = new o0000o.OooO
            o0000Oo.oo0o0Oo r1 = r10.f4520OooO00o
            o0000Oo.o000oOoO r1 = r1.f4365OooOO0
            r0.<init>(r1)
            r2.add(r0)
            o0000o0.OooO0O0 r0 = new o0000o0.OooO0O0
            o0000Oo.oo0o0Oo r1 = r10.f4520OooO00o
            r1.getClass()
            r0.<init>()
            r2.add(r0)
            o0000o0o.o000000O r0 = o0000o0o.o000000O.f4493OooO00o
            r2.add(r0)
            boolean r0 = r10.f4522OooO0OO
            if (r0 != 0) goto L3f
            o0000Oo.oo0o0Oo r0 = r10.f4520OooO00o
            java.util.List r0 = r0.f4360OooO0Oo
            o0000.OooOo.o00O0Oo(r0, r2)
        L3f:
            o0000o.OooOO0 r0 = new o0000o.OooOO0
            boolean r1 = r10.f4522OooO0OO
            r0.<init>(r1)
            r2.add(r0)
            o0000o.OooOOOO r9 = new o0000o.OooOOOO
            r3 = 0
            r4 = 0
            androidx.appcompat.widget.o0OOO0o r5 = r10.f4521OooO0O0
            o0000Oo.oo0o0Oo r0 = r10.f4520OooO00o
            int r6 = r0.f4374OooOo
            int r7 = r0.f4380OooOoO0
            int r8 = r0.f4379OooOoO
            r0 = r9
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            androidx.appcompat.widget.o0OOO0o r1 = r10.f4521OooO0O0     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L79
            o0000Oo.o00000 r1 = r9.OooO0O0(r1)     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L79
            boolean r2 = r10.f4533OooOOOo     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L79
            if (r2 != 0) goto L6b
            r10.OooO(r0)
            return r1
        L6b:
            o0000OoO.OooOO0O.OooO0OO(r1)     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L79
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L79
            java.lang.String r2 = "Canceled"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L79
            throw r1     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L79
        L76:
            r1 = move-exception
            r2 = 0
            goto L86
        L79:
            r1 = move-exception
            java.io.IOException r1 = r10.OooO(r1)     // Catch: java.lang.Throwable -> L84
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Throwable"
            o0000O00.OooO00o.OooOoO0(r1, r2)     // Catch: java.lang.Throwable -> L84
            throw r1     // Catch: java.lang.Throwable -> L84
        L84:
            r1 = move-exception
            r2 = 1
        L86:
            if (r2 != 0) goto L8b
            r10.OooO(r0)
        L8b:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o0000o0o.o0000O0.OooO0oO():o0000Oo.o00000");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0022 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:8:0x0013, B:17:0x0022, B:19:0x0026, B:20:0x0028, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:14:0x001c), top: B:53:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0026 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:8:0x0013, B:17:0x0022, B:19:0x0026, B:20:0x0028, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:14:0x001c), top: B:53:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.IOException OooO0oo(o0000o0o.o00000OO r3, boolean r4, boolean r5, java.io.IOException r6) {
        /*
            r2 = this;
            java.lang.String r0 = "exchange"
            o0000O00.OooO00o.OooOoo0(r3, r0)
            o0000o0o.o00000OO r0 = r2.f4535OooOOo0
            boolean r3 = o0000O00.OooO00o.OooOOO0(r3, r0)
            if (r3 != 0) goto Le
            return r6
        Le:
            monitor-enter(r2)
            r3 = 1
            r0 = 0
            if (r4 == 0) goto L1a
            boolean r1 = r2.OooOOO0     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L20
            goto L1a
        L18:
            r3 = move-exception
            goto L41
        L1a:
            if (r5 == 0) goto L43
            boolean r1 = r2.f4531OooOOO     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L43
        L20:
            if (r4 == 0) goto L24
            r2.OooOOO0 = r0     // Catch: java.lang.Throwable -> L18
        L24:
            if (r5 == 0) goto L28
            r2.f4531OooOOO = r0     // Catch: java.lang.Throwable -> L18
        L28:
            boolean r4 = r2.OooOOO0     // Catch: java.lang.Throwable -> L18
            if (r4 != 0) goto L32
            boolean r5 = r2.f4531OooOOO     // Catch: java.lang.Throwable -> L18
            if (r5 != 0) goto L32
            r5 = r3
            goto L33
        L32:
            r5 = r0
        L33:
            if (r4 != 0) goto L3e
            boolean r4 = r2.f4531OooOOO     // Catch: java.lang.Throwable -> L18
            if (r4 != 0) goto L3e
            boolean r4 = r2.f4532OooOOOO     // Catch: java.lang.Throwable -> L18
            if (r4 != 0) goto L3e
            r0 = r3
        L3e:
            r4 = r0
            r0 = r5
            goto L44
        L41:
            monitor-exit(r2)
            throw r3
        L43:
            r4 = r0
        L44:
            monitor-exit(r2)
            if (r0 == 0) goto L59
            r5 = 0
            r2.f4535OooOOo0 = r5
            o0000o0o.o000OO r5 = r2.f4528OooOO0
            if (r5 == 0) goto L59
            monitor-enter(r5)
            int r0 = r5.OooOOO0     // Catch: java.lang.Throwable -> L56
            int r0 = r0 + r3
            r5.OooOOO0 = r0     // Catch: java.lang.Throwable -> L56
            monitor-exit(r5)
            goto L59
        L56:
            r3 = move-exception
            monitor-exit(r5)
            throw r3
        L59:
            if (r4 == 0) goto L60
            java.io.IOException r3 = r2.OooO0OO(r6)
            return r3
        L60:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o0000o0o.o0000O0.OooO0oo(o0000o0o.o00000OO, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final Socket OooOO0() {
        boolean z;
        o000OO o000oo = this.f4528OooOO0;
        OooO00o.OooOo(o000oo);
        byte[] bArr = o0000OoO.OooOO0O.f4403OooO00o;
        ArrayList arrayList = o000oo.f4563OooOOOo;
        Iterator it = arrayList.iterator();
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (OooO00o.OooOOO0(((Reference) it.next()).get(), this)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            arrayList.remove(i);
            this.f4528OooOO0 = null;
            if (arrayList.isEmpty()) {
                o000oo.f4564OooOOo0 = System.nanoTime();
                o0000O o0000o2 = this.f4523OooO0Oo;
                o0000o2.getClass();
                byte[] bArr2 = o0000OoO.OooOO0O.f4403OooO00o;
                boolean z3 = o000oo.f4558OooOO0;
                o0000o0O.oo0o0Oo oo0o0oo = o0000o2.f4516OooO0OO;
                if (!z3 && o0000o2.f4514OooO00o != 0) {
                    oo0o0oo.OooO0OO(o0000o2.f4517OooO0Oo, 0L);
                } else {
                    o000oo.f4558OooOO0 = true;
                    ConcurrentLinkedQueue concurrentLinkedQueue = o0000o2.f4518OooO0o0;
                    concurrentLinkedQueue.remove(o000oo);
                    if (concurrentLinkedQueue.isEmpty()) {
                        oo0o0oo.OooO00o();
                    }
                    z2 = true;
                }
                if (z2) {
                    Socket socket = o000oo.f4553OooO0Oo;
                    OooO00o.OooOo(socket);
                    return socket;
                }
            }
            return null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final Object clone() {
        return new o0000O0(this.f4520OooO00o, this.f4521OooO0O0, this.f4522OooO0OO);
    }
}