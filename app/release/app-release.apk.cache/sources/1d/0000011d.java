package OooOoo0;

import OooO0O0.OooO0O0;
import OooO0Oo.o0000OO0;
import android.view.View;
import androidx.emoji2.text.OooOOOO;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class o000000 implements Runnable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f1243OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final int f1244OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final Object f1245OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final Object f1246OooO0Oo;

    public /* synthetic */ o000000(int i, int i2, Object obj, Object obj2) {
        this.f1243OooO00o = i2;
        this.f1246OooO0Oo = obj;
        this.f1245OooO0OO = obj2;
        this.f1244OooO0O0 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1243OooO00o;
        int i2 = 0;
        int i3 = this.f1244OooO0O0;
        Object obj = this.f1245OooO0OO;
        switch (i) {
            case 0:
                OooO0O0 oooO0O0 = (OooO0O0) ((o0000OO0) obj).f183OooO0O0;
                if (oooO0O0 != null) {
                    oooO0O0.OooOO0O(i3);
                    return;
                }
                return;
            case 1:
                List list = (List) obj;
                int size = list.size();
                if (i3 != 1) {
                    while (i2 < size) {
                        ((OooOOOO) list.get(i2)).getClass();
                        i2++;
                    }
                    return;
                }
                while (i2 < size) {
                    ((OooOOOO) list.get(i2)).OooO00o();
                    i2++;
                }
                return;
            default:
                ((BottomSheetBehavior) this.f1246OooO0Oo).Oooo00O((View) obj, i3, false);
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o000000(int i, ArrayList arrayList) {
        this(arrayList, i, null);
        this.f1243OooO00o = 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o000000(androidx.emoji2.text.OooOOOO r3, int r4) {
        /*
            r2 = this;
            r0 = 1
            r2.f1243OooO00o = r0
            androidx.emoji2.text.OooOOOO[] r0 = new androidx.emoji2.text.OooOOOO[r0]
            if (r3 == 0) goto L13
            r1 = 0
            r0[r1] = r3
            java.util.List r3 = java.util.Arrays.asList(r0)
            r0 = 0
            r2.<init>(r3, r4, r0)
            return
        L13:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "initCallback cannot be null"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: OooOoo0.o000000.<init>(androidx.emoji2.text.OooOOOO, int):void");
    }

    public o000000(List list, int i, Throwable th) {
        this.f1243OooO00o = 1;
        if (list == null) {
            throw new NullPointerException("initCallbacks cannot be null");
        }
        this.f1245OooO0OO = new ArrayList(list);
        this.f1244OooO0O0 = i;
        this.f1246OooO0Oo = th;
    }
}