package o0000o0O;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import o0000O00.OooO00o;
import o0000OoO.OooOO0O;

/* loaded from: classes.dex */
public final class oo0o0Oo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o000000 f4472OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final String f4473OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public boolean f4474OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public o0Oo0oo f4475OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public boolean f4476OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final ArrayList f4477OooO0o0;

    public oo0o0Oo(o000000 o000000Var, String str) {
        OooO00o.OooOoo0(o000000Var, "taskRunner");
        OooO00o.OooOoo0(str, "name");
        this.f4472OooO00o = o000000Var;
        this.f4473OooO0O0 = str;
        this.f4477OooO0o0 = new ArrayList();
    }

    public final void OooO00o() {
        byte[] bArr = OooOO0O.f4403OooO00o;
        synchronized (this.f4472OooO00o) {
            if (OooO0O0()) {
                this.f4472OooO00o.OooO0o0(this);
            }
        }
    }

    public final boolean OooO0O0() {
        o0Oo0oo o0oo0oo = this.f4475OooO0Oo;
        if (o0oo0oo != null && o0oo0oo.f4469OooO0O0) {
            this.f4476OooO0o = true;
        }
        ArrayList arrayList = this.f4477OooO0o0;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((o0Oo0oo) arrayList.get(size)).f4469OooO0O0) {
                o0Oo0oo o0oo0oo2 = (o0Oo0oo) arrayList.get(size);
                if (o000000.f4455OooO0oo.OooOOO0().isLoggable(Level.FINE)) {
                    OooO00o.OooO0oo(o0oo0oo2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void OooO0OO(o0Oo0oo o0oo0oo, long j) {
        OooO00o.OooOoo0(o0oo0oo, "task");
        synchronized (this.f4472OooO00o) {
            if (this.f4474OooO0OO) {
                if (o0oo0oo.f4469OooO0O0) {
                    if (o000000.f4455OooO0oo.OooOOO0().isLoggable(Level.FINE)) {
                        OooO00o.OooO0oo(o0oo0oo, this, "schedule canceled (queue is shutdown)");
                    }
                    return;
                }
                if (o000000.f4455OooO0oo.OooOOO0().isLoggable(Level.FINE)) {
                    OooO00o.OooO0oo(o0oo0oo, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
            if (OooO0Oo(o0oo0oo, j, false)) {
                this.f4472OooO00o.OooO0o0(this);
            }
        }
    }

    public final boolean OooO0Oo(o0Oo0oo o0oo0oo, long j, boolean z) {
        boolean z2;
        String o00Ooo2;
        String str;
        boolean z3;
        OooO00o.OooOoo0(o0oo0oo, "task");
        oo0o0Oo oo0o0oo = o0oo0oo.f4470OooO0OO;
        if (oo0o0oo != this) {
            if (oo0o0oo == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                o0oo0oo.f4470OooO0OO = this;
            } else {
                throw new IllegalStateException("task is in multiple queues".toString());
            }
        }
        this.f4472OooO00o.f4457OooO00o.getClass();
        long nanoTime = System.nanoTime();
        long j2 = nanoTime + j;
        ArrayList arrayList = this.f4477OooO0o0;
        int indexOf = arrayList.indexOf(o0oo0oo);
        if (indexOf != -1) {
            if (o0oo0oo.f4471OooO0Oo <= j2) {
                if (o000000.f4455OooO0oo.OooOOO0().isLoggable(Level.FINE)) {
                    OooO00o.OooO0oo(o0oo0oo, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(indexOf);
        }
        o0oo0oo.f4471OooO0Oo = j2;
        if (o000000.f4455OooO0oo.OooOOO0().isLoggable(Level.FINE)) {
            long j3 = j2 - nanoTime;
            if (z) {
                o00Ooo2 = OooO00o.o00Ooo(j3);
                str = "run again after ";
            } else {
                o00Ooo2 = OooO00o.o00Ooo(j3);
                str = "scheduled after ";
            }
            OooO00o.OooO0oo(o0oo0oo, this, str.concat(o00Ooo2));
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (((o0Oo0oo) it.next()).f4471OooO0Oo - nanoTime > j) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i == -1) {
            i = arrayList.size();
        }
        arrayList.add(i, o0oo0oo);
        if (i == 0) {
            return true;
        }
        return false;
    }

    public final void OooO0o0() {
        byte[] bArr = OooOO0O.f4403OooO00o;
        synchronized (this.f4472OooO00o) {
            this.f4474OooO0OO = true;
            if (OooO0O0()) {
                this.f4472OooO00o.OooO0o0(this);
            }
        }
    }

    public final String toString() {
        return this.f4473OooO0O0;
    }
}