package o000O000;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class o00Oo0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final o00O0O f4851OooO00o = new o00O0O(new byte[0], 0, 0, false);

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final int f4852OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public static final AtomicReference[] f4853OooO0OO;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f4852OooO0O0 = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f4853OooO0OO = atomicReferenceArr;
    }

    public static final void OooO00o(o00O0O o00o0o) {
        boolean z;
        int i;
        if (o00o0o.f4848OooO0o == null && o00o0o.f4850OooO0oO == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (o00o0o.f4847OooO0Oo) {
                return;
            }
            AtomicReference atomicReference = f4853OooO0OO[(int) (Thread.currentThread().getId() & (f4852OooO0O0 - 1))];
            o00O0O o00o0o2 = f4851OooO00o;
            o00O0O o00o0o3 = (o00O0O) atomicReference.getAndSet(o00o0o2);
            if (o00o0o3 == o00o0o2) {
                return;
            }
            if (o00o0o3 != null) {
                i = o00o0o3.f4846OooO0OO;
            } else {
                i = 0;
            }
            if (i >= 65536) {
                atomicReference.set(o00o0o3);
                return;
            }
            o00o0o.f4848OooO0o = o00o0o3;
            o00o0o.f4845OooO0O0 = 0;
            o00o0o.f4846OooO0OO = i + 8192;
            atomicReference.set(o00o0o);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final o00O0O OooO0O0() {
        AtomicReference atomicReference = f4853OooO0OO[(int) (Thread.currentThread().getId() & (f4852OooO0O0 - 1))];
        o00O0O o00o0o = f4851OooO00o;
        o00O0O o00o0o2 = (o00O0O) atomicReference.getAndSet(o00o0o);
        if (o00o0o2 == o00o0o) {
            return new o00O0O();
        }
        if (o00o0o2 == null) {
            atomicReference.set(null);
            return new o00O0O();
        }
        atomicReference.set(o00o0o2.f4848OooO0o);
        o00o0o2.f4848OooO0o = null;
        o00o0o2.f4846OooO0OO = 0;
        return o00o0o2;
    }
}