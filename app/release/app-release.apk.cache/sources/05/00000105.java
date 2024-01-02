package OooOoOO;

/* loaded from: classes.dex */
public final class o000000 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public boolean f1202OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public o000OOo f1203OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public boolean f1204OooO0OO;

    public final void OooO00o() {
        synchronized (this) {
            if (this.f1202OooO00o) {
                return;
            }
            this.f1202OooO00o = true;
            this.f1204OooO0OO = true;
            o000OOo o000ooo = this.f1203OooO0O0;
            if (o000ooo != null) {
                try {
                    o000ooo.OooO0OO();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f1204OooO0OO = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            synchronized (this) {
                this.f1204OooO0OO = false;
                notifyAll();
            }
        }
    }

    public final void OooO0O0(o000OOo o000ooo) {
        synchronized (this) {
            while (this.f1204OooO0OO) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            if (this.f1203OooO0O0 == o000ooo) {
                return;
            }
            this.f1203OooO0O0 = o000ooo;
            if (this.f1202OooO00o) {
                o000ooo.OooO0OO();
            }
        }
    }
}