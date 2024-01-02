package o0000o0o;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import o0000O00.OooO00o;
import o0000Oo.OooO0o;
import o0000OoO.OooOO0O;
import o0000o0O.o000000;
import o0000o0O.o0OO00O;
import o0000o0O.oo0o0Oo;
import o0000oOo.o000OO00;

/* loaded from: classes.dex */
public final class o0000O {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final int f4514OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final long f4515OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final oo0o0Oo f4516OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final o0OO00O f4517OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final ConcurrentLinkedQueue f4518OooO0o0;

    public o0000O(o000000 o000000Var, TimeUnit timeUnit) {
        OooO00o.OooOoo0(o000000Var, "taskRunner");
        OooO00o.OooOoo0(timeUnit, "timeUnit");
        this.f4514OooO00o = 5;
        this.f4515OooO0O0 = timeUnit.toNanos(5L);
        this.f4516OooO0OO = o000000Var.OooO0o();
        this.f4517OooO0Oo = new o0OO00O(this, OooOO0O.f4409OooO0oO + " ConnectionPool");
        this.f4518OooO0o0 = new ConcurrentLinkedQueue();
    }

    public final boolean OooO00o(OooO0o oooO0o, o0000O0 o0000o02, List list, boolean z) {
        OooO00o.OooOoo0(oooO0o, "address");
        OooO00o.OooOoo0(o0000o02, "call");
        Iterator it = this.f4518OooO0o0.iterator();
        while (true) {
            boolean z2 = false;
            if (!it.hasNext()) {
                return false;
            }
            o000OO o000oo = (o000OO) it.next();
            OooO00o.OooOoOO(o000oo, "connection");
            synchronized (o000oo) {
                if (z) {
                    if (o000oo.f4556OooO0oO != null) {
                        z2 = true;
                    }
                    if (!z2) {
                        continue;
                    }
                }
                if (o000oo.OooO0oo(oooO0o, list)) {
                    o0000o02.OooO0O0(o000oo);
                    return true;
                }
            }
        }
    }

    public final int OooO0O0(o000OO o000oo, long j) {
        byte[] bArr = OooOO0O.f4403OooO00o;
        ArrayList arrayList = o000oo.f4563OooOOOo;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                o000OO00 o000oo00 = o000OO00.f4772OooO00o;
                o000OO00.f4772OooO00o.OooOO0(((o0000O00) reference).f4536OooO00o, "A connection to " + o000oo.f4551OooO0O0.f4269OooO00o.f4168OooO + " was leaked. Did you forget to close a response body?");
                arrayList.remove(i);
                o000oo.f4558OooOO0 = true;
                if (arrayList.isEmpty()) {
                    o000oo.f4564OooOOo0 = j - this.f4515OooO0O0;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}