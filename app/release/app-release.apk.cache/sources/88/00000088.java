package OooOO0O;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class OooO0o extends OooO0O0.OooO0O0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f552OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f553OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f554OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f555OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f556OooO0o0;

    public OooO0o(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super((Object) null);
        this.f552OooO00o = atomicReferenceFieldUpdater;
        this.f553OooO0O0 = atomicReferenceFieldUpdater2;
        this.f554OooO0OO = atomicReferenceFieldUpdater3;
        this.f555OooO0Oo = atomicReferenceFieldUpdater4;
        this.f556OooO0o0 = atomicReferenceFieldUpdater5;
    }

    @Override // OooO0O0.OooO0O0
    public final boolean OooO0OO(OooOO0O oooOO0O, OooO0OO oooO0OO) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        OooO0OO oooO0OO2 = OooO0OO.f550OooO0O0;
        do {
            atomicReferenceFieldUpdater = this.f555OooO0Oo;
            if (atomicReferenceFieldUpdater.compareAndSet(oooOO0O, oooO0OO, oooO0OO2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(oooOO0O) == oooO0OO);
        return false;
    }

    @Override // OooO0O0.OooO0O0
    public final boolean OooO0Oo(OooOO0O oooOO0O, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f556OooO0o0;
            if (atomicReferenceFieldUpdater.compareAndSet(oooOO0O, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(oooOO0O) == obj);
        return false;
    }

    @Override // OooO0O0.OooO0O0
    public final boolean OooO0o0(OooOO0O oooOO0O, OooOO0 oooOO0, OooOO0 oooOO02) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f554OooO0OO;
            if (atomicReferenceFieldUpdater.compareAndSet(oooOO0O, oooOO0, oooOO02)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(oooOO0O) == oooOO0);
        return false;
    }

    @Override // OooO0O0.OooO0O0
    public final void OooOOOO(OooOO0 oooOO0, OooOO0 oooOO02) {
        this.f553OooO0O0.lazySet(oooOO0, oooOO02);
    }

    @Override // OooO0O0.OooO0O0
    public final void OooOOOo(OooOO0 oooOO0, Thread thread) {
        this.f552OooO00o.lazySet(oooOO0, thread);
    }
}