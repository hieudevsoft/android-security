package o0000o0O;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;
import o0000O00.OooO00o;
import o0000Oo.OooOOOO;
import o0000OoO.OooOO0;
import o0000OoO.OooOO0O;

/* loaded from: classes.dex */
public final class o000000 {

    /* renamed from: OooO  reason: collision with root package name */
    public static final o000000 f4454OooO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public static final OooOOOO f4455OooO0oo = new OooOOOO(16, 0);

    /* renamed from: OooOO0  reason: collision with root package name */
    public static final Logger f4456OooOO0;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o0O0O00 f4457OooO00o;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public boolean f4459OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public long f4460OooO0Oo;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f4458OooO0O0 = 10000;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final ArrayList f4462OooO0o0 = new ArrayList();

    /* renamed from: OooO0o  reason: collision with root package name */
    public final ArrayList f4461OooO0o = new ArrayList();

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final o000OOo f4463OooO0oO = new o000OOo(this);

    static {
        String str = OooOO0O.f4409OooO0oO + " TaskRunner";
        OooO00o.OooOoo0(str, "name");
        f4454OooO = new o000000(new o0O0O00(new OooOO0(str, true)));
        Logger logger = Logger.getLogger(o000000.class.getName());
        OooO00o.OooOoOO(logger, "getLogger(TaskRunner::class.java.name)");
        f4456OooOO0 = logger;
    }

    public o000000(o0O0O00 o0o0o00) {
        this.f4457OooO00o = o0o0o00;
    }

    public static final void OooO00o(o000000 o000000Var, o0Oo0oo o0oo0oo) {
        o000000Var.getClass();
        byte[] bArr = OooOO0O.f4403OooO00o;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(o0oo0oo.f4468OooO00o);
        try {
            long OooO00o2 = o0oo0oo.OooO00o();
            synchronized (o000000Var) {
                o000000Var.OooO0O0(o0oo0oo, OooO00o2);
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (o000000Var) {
                o000000Var.OooO0O0(o0oo0oo, -1L);
                currentThread.setName(name);
                throw th;
            }
        }
    }

    public final void OooO0O0(o0Oo0oo o0oo0oo, long j) {
        boolean z;
        byte[] bArr = OooOO0O.f4403OooO00o;
        oo0o0Oo oo0o0oo = o0oo0oo.f4470OooO0OO;
        OooO00o.OooOo(oo0o0oo);
        if (oo0o0oo.f4475OooO0Oo == o0oo0oo) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            boolean z2 = oo0o0oo.f4476OooO0o;
            oo0o0oo.f4476OooO0o = false;
            oo0o0oo.f4475OooO0Oo = null;
            this.f4462OooO0o0.remove(oo0o0oo);
            if (j != -1 && !z2 && !oo0o0oo.f4474OooO0OO) {
                oo0o0oo.OooO0Oo(o0oo0oo, j, true);
            }
            if (!oo0o0oo.f4477OooO0o0.isEmpty()) {
                this.f4461OooO0o.add(oo0o0oo);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARN: Finally extract failed */
    public final o0Oo0oo OooO0OO() {
        boolean z;
        byte[] bArr = OooOO0O.f4403OooO00o;
        while (true) {
            ArrayList arrayList = this.f4461OooO0o;
            if (arrayList.isEmpty()) {
                return null;
            }
            o0O0O00 o0o0o00 = this.f4457OooO00o;
            o0o0o00.getClass();
            long nanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long j = Long.MAX_VALUE;
            o0Oo0oo o0oo0oo = null;
            while (true) {
                if (it.hasNext()) {
                    o0Oo0oo o0oo0oo2 = (o0Oo0oo) ((oo0o0Oo) it.next()).f4477OooO0o0.get(0);
                    long max = Math.max(0L, o0oo0oo2.f4471OooO0Oo - nanoTime);
                    if (max > 0) {
                        j = Math.min(max, j);
                    } else if (o0oo0oo != null) {
                        z = true;
                        break;
                    } else {
                        o0oo0oo = o0oo0oo2;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (o0oo0oo != null) {
                byte[] bArr2 = OooOO0O.f4403OooO00o;
                o0oo0oo.f4471OooO0Oo = -1L;
                oo0o0Oo oo0o0oo = o0oo0oo.f4470OooO0OO;
                OooO00o.OooOo(oo0o0oo);
                oo0o0oo.f4477OooO0o0.remove(o0oo0oo);
                arrayList.remove(oo0o0oo);
                oo0o0oo.f4475OooO0Oo = o0oo0oo;
                this.f4462OooO0o0.add(oo0o0oo);
                if (z || (!this.f4459OooO0OO && (!arrayList.isEmpty()))) {
                    o000OOo o000ooo = this.f4463OooO0oO;
                    OooO00o.OooOoo0(o000ooo, "runnable");
                    o0o0o00.f4465OooO00o.execute(o000ooo);
                }
                return o0oo0oo;
            } else if (this.f4459OooO0OO) {
                if (j < this.f4460OooO0Oo - nanoTime) {
                    notify();
                }
                return null;
            } else {
                this.f4459OooO0OO = true;
                this.f4460OooO0Oo = nanoTime + j;
                try {
                    try {
                        long j2 = j / 1000000;
                        long j3 = j - (1000000 * j2);
                        if (j2 > 0 || j > 0) {
                            wait(j2, (int) j3);
                        }
                    } catch (InterruptedException unused) {
                        OooO0Oo();
                    }
                    this.f4459OooO0OO = false;
                } catch (Throwable th) {
                    this.f4459OooO0OO = false;
                    throw th;
                }
            }
        }
    }

    public final void OooO0Oo() {
        ArrayList arrayList = this.f4462OooO0o0;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            ((oo0o0Oo) arrayList.get(size)).OooO0O0();
        }
        ArrayList arrayList2 = this.f4461OooO0o;
        for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
            oo0o0Oo oo0o0oo = (oo0o0Oo) arrayList2.get(size2);
            oo0o0oo.OooO0O0();
            if (oo0o0oo.f4477OooO0o0.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
    }

    public final oo0o0Oo OooO0o() {
        int i;
        synchronized (this) {
            i = this.f4458OooO0O0;
            this.f4458OooO0O0 = i + 1;
        }
        return new oo0o0Oo(this, OooO0O0.OooO00o.OooO0O0("Q", i));
    }

    public final void OooO0o0(oo0o0Oo oo0o0oo) {
        OooO00o.OooOoo0(oo0o0oo, "taskQueue");
        byte[] bArr = OooOO0O.f4403OooO00o;
        if (oo0o0oo.f4475OooO0Oo == null) {
            boolean z = !oo0o0oo.f4477OooO0o0.isEmpty();
            ArrayList arrayList = this.f4461OooO0o;
            if (z) {
                OooO00o.OooOoo0(arrayList, "<this>");
                if (!arrayList.contains(oo0o0oo)) {
                    arrayList.add(oo0o0oo);
                }
            } else {
                arrayList.remove(oo0o0oo);
            }
        }
        boolean z2 = this.f4459OooO0OO;
        o0O0O00 o0o0o00 = this.f4457OooO00o;
        o0o0o00.getClass();
        if (z2) {
            notify();
            return;
        }
        o000OOo o000ooo = this.f4463OooO0oO;
        OooO00o.OooOoo0(o000ooo, "runnable");
        o0o0o00.f4465OooO00o.execute(o000ooo);
    }
}