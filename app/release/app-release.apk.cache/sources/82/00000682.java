package o000oOoO;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class o00Ooo implements Runnable {

    /* renamed from: OooO0O0  reason: collision with root package name */
    public long f5089OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public long f5090OooO0OO;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public static final ThreadLocal f5087OooO0o0 = new ThreadLocal();

    /* renamed from: OooO0o  reason: collision with root package name */
    public static final OooOOoo.o0Oo0oo f5086OooO0o = new OooOOoo.o0Oo0oo(1);

    /* renamed from: OooO00o  reason: collision with root package name */
    public final ArrayList f5088OooO00o = new ArrayList();

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final ArrayList f5091OooO0Oo = new ArrayList();

    public static o000OOo0 OooO0OO(RecyclerView recyclerView, int i, long j) {
        boolean z;
        int OooO0oo2 = recyclerView.f3149OooO0o0.OooO0oo();
        int i2 = 0;
        while (true) {
            if (i2 < OooO0oo2) {
                o000OOo0 Oooo02 = RecyclerView.Oooo0(recyclerView.f3149OooO0o0.OooO0oO(i2));
                if (Oooo02.f5033OooO0OO == i && !Oooo02.OooO0oO()) {
                    z = true;
                    break;
                }
                i2++;
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            return null;
        }
        o000O00 o000o00 = recyclerView.f3145OooO0O0;
        try {
            recyclerView.Oooo0oo();
            o000OOo0 OooOO02 = o000o00.OooOO0(i, j);
            if (OooOO02 != null) {
                if (OooOO02.OooO0o() && !OooOO02.OooO0oO()) {
                    o000o00.OooO0oO(OooOO02.f5031OooO00o);
                } else {
                    o000o00.OooO00o(OooOO02, false);
                }
            }
            return OooOO02;
        } finally {
            recyclerView.Oooo(false);
        }
    }

    public final void OooO00o(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f5089OooO0O0 == 0) {
            this.f5089OooO0O0 = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        o00O0O o00o0o = recyclerView.f3191OoooOo0;
        o00o0o.f5077OooO00o = i;
        o00o0o.f5078OooO0O0 = i2;
    }

    public final void OooO0O0(long j) {
        o00Oo0 o00oo0;
        RecyclerView recyclerView;
        long j2;
        RecyclerView recyclerView2;
        o00Oo0 o00oo02;
        boolean z;
        ArrayList arrayList = this.f5088OooO00o;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                o00O0O o00o0o = recyclerView3.f3191OoooOo0;
                o00o0o.Oooo(recyclerView3, false);
                i += o00o0o.f5079OooO0OO;
            }
        }
        ArrayList arrayList2 = this.f5091OooO0Oo;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                o00O0O o00o0o2 = recyclerView4.f3191OoooOo0;
                int abs = Math.abs(o00o0o2.f5078OooO0O0) + Math.abs(o00o0o2.f5077OooO00o);
                for (int i5 = 0; i5 < o00o0o2.f5079OooO0OO * 2; i5 += 2) {
                    if (i3 >= arrayList2.size()) {
                        o00oo02 = new o00Oo0();
                        arrayList2.add(o00oo02);
                    } else {
                        o00oo02 = (o00Oo0) arrayList2.get(i3);
                    }
                    int[] iArr = (int[]) o00o0o2.f5080OooO0Oo;
                    int i6 = iArr[i5 + 1];
                    if (i6 <= abs) {
                        z = true;
                    } else {
                        z = false;
                    }
                    o00oo02.f5081OooO00o = z;
                    o00oo02.f5082OooO0O0 = abs;
                    o00oo02.f5083OooO0OO = i6;
                    o00oo02.f5084OooO0Oo = recyclerView4;
                    o00oo02.f5085OooO0o0 = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList2, f5086OooO0o);
        for (int i7 = 0; i7 < arrayList2.size() && (recyclerView = (o00oo0 = (o00Oo0) arrayList2.get(i7)).f5084OooO0Oo) != null; i7++) {
            if (o00oo0.f5081OooO00o) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j;
            }
            o000OOo0 OooO0OO2 = OooO0OO(recyclerView, o00oo0.f5085OooO0o0, j2);
            if (OooO0OO2 != null && OooO0OO2.f5032OooO0O0 != null && OooO0OO2.OooO0o() && !OooO0OO2.OooO0oO() && (recyclerView2 = (RecyclerView) OooO0OO2.f5032OooO0O0.get()) != null) {
                if (recyclerView2.f3167OooOoO0 && recyclerView2.f3149OooO0o0.OooO0oo() != 0) {
                    o0000oo o0000ooVar = recyclerView2.f3177Oooo00o;
                    if (o0000ooVar != null) {
                        o0000ooVar.OooO0o0();
                    }
                    o000OO o000oo = recyclerView2.f3154OooOO0o;
                    o000O00 o000o00 = recyclerView2.f3145OooO0O0;
                    if (o000oo != null) {
                        o000oo.OooooOO(o000o00);
                        recyclerView2.f3154OooOO0o.OooooOo(o000o00);
                    }
                    o000o00.f4973OooO00o.clear();
                    o000o00.OooO0o0();
                }
                o00O0O o00o0o3 = recyclerView2.f3191OoooOo0;
                o00o0o3.Oooo(recyclerView2, true);
                if (o00o0o3.f5079OooO0OO != 0) {
                    try {
                        int i8 = OooOoOO.o0000.f1201OooO00o;
                        OooOoOO.o0000Ooo.OooO00o("RV Nested Prefetch");
                        o000O0O0 o000o0o0 = recyclerView2.OoooOoO;
                        o00000O o00000o = recyclerView2.f3153OooOO0O;
                        o000o0o0.f4985OooO0Oo = 1;
                        o000o0o0.f4987OooO0o0 = o00000o.OooO00o();
                        o000o0o0.f4988OooO0oO = false;
                        o000o0o0.f4989OooO0oo = false;
                        o000o0o0.f4981OooO = false;
                        for (int i9 = 0; i9 < o00o0o3.f5079OooO0OO * 2; i9 += 2) {
                            OooO0OO(recyclerView2, ((int[]) o00o0o3.f5080OooO0Oo)[i9], j);
                        }
                        OooOoOO.o0000Ooo.OooO0O0();
                        o00oo0.f5081OooO00o = false;
                        o00oo0.f5082OooO0O0 = 0;
                        o00oo0.f5083OooO0OO = 0;
                        o00oo0.f5084OooO0Oo = null;
                        o00oo0.f5085OooO0o0 = 0;
                    } catch (Throwable th) {
                        int i10 = OooOoOO.o0000.f1201OooO00o;
                        OooOoOO.o0000Ooo.OooO0O0();
                        throw th;
                    }
                }
            }
            o00oo0.f5081OooO00o = false;
            o00oo0.f5082OooO0O0 = 0;
            o00oo0.f5083OooO0OO = 0;
            o00oo0.f5084OooO0Oo = null;
            o00oo0.f5085OooO0o0 = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = OooOoOO.o0000.f1201OooO00o;
            OooOoOO.o0000Ooo.OooO00o("RV Prefetch");
            ArrayList arrayList = this.f5088OooO00o;
            if (arrayList.isEmpty()) {
                this.f5089OooO0O0 = 0L;
                OooOoOO.o0000Ooo.OooO0O0();
                return;
            }
            int size = arrayList.size();
            long j = 0;
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i2);
                if (recyclerView.getWindowVisibility() == 0) {
                    j = Math.max(recyclerView.getDrawingTime(), j);
                }
            }
            if (j == 0) {
                this.f5089OooO0O0 = 0L;
                OooOoOO.o0000Ooo.OooO0O0();
                return;
            }
            OooO0O0(TimeUnit.MILLISECONDS.toNanos(j) + this.f5090OooO0OO);
            this.f5089OooO0O0 = 0L;
            OooOoOO.o0000Ooo.OooO0O0();
        } catch (Throwable th) {
            this.f5089OooO0O0 = 0L;
            int i3 = OooOoOO.o0000.f1201OooO00o;
            OooOoOO.o0000Ooo.OooO0O0();
            throw th;
        }
    }
}