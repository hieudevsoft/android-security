package o000oOoO;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class o000000O extends o0000OO0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public RecyclerView f4947OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final o0O0ooO f4948OooO0O0 = new o0O0ooO(this);

    /* renamed from: OooO0OO  reason: collision with root package name */
    public o0O0O00 f4949OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public o0O0O00 f4950OooO0Oo;

    public static int OooO0O0(View view, o000OOo o000ooo) {
        return ((o000ooo.OooO0OO(view) / 2) + o000ooo.OooO0Oo(view)) - ((o000ooo.OooO() / 2) + o000ooo.OooO0oo());
    }

    public final int[] OooO00o(o000OO o000oo, View view) {
        int[] iArr = new int[2];
        if (o000oo.OooO0Oo()) {
            iArr[0] = OooO0O0(view, OooO0OO(o000oo));
        } else {
            iArr[0] = 0;
        }
        if (o000oo.OooO0o0()) {
            iArr[1] = OooO0O0(view, OooO0Oo(o000oo));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final o000OOo OooO0OO(o000OO o000oo) {
        o0O0O00 o0o0o00 = this.f4950OooO0Oo;
        if (o0o0o00 == null || o0o0o00.f5026OooO00o != o000oo) {
            this.f4950OooO0Oo = new o0O0O00(o000oo, 0);
        }
        return this.f4950OooO0Oo;
    }

    public final o000OOo OooO0Oo(o000OO o000oo) {
        o0O0O00 o0o0o00 = this.f4949OooO0OO;
        if (o0o0o00 == null || o0o0o00.f5026OooO00o != o000oo) {
            this.f4949OooO0OO = new o0O0O00(o000oo, 1);
        }
        return this.f4949OooO0OO;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0o0() {
        /*
            r11 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r11.f4947OooO00o
            if (r0 != 0) goto L6
            goto L6e
        L6:
            o000oOoO.o000OO r0 = r0.getLayoutManager()
            if (r0 != 0) goto Ld
            goto L6e
        Ld:
            boolean r1 = r0.OooO0o0()
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L1a
            o000oOoO.o000OOo r1 = r11.OooO0Oo(r0)
            goto L24
        L1a:
            boolean r1 = r0.OooO0Oo()
            if (r1 == 0) goto L57
            o000oOoO.o000OOo r1 = r11.OooO0OO(r0)
        L24:
            int r4 = r0.OooOo0O()
            if (r4 != 0) goto L2b
            goto L57
        L2b:
            int r5 = r1.OooO0oo()
            int r6 = r1.OooO()
            int r6 = r6 / 2
            int r6 = r6 + r5
            r5 = 2147483647(0x7fffffff, float:NaN)
            r7 = r3
        L3a:
            if (r7 >= r4) goto L57
            android.view.View r8 = r0.OooOo0(r7)
            int r9 = r1.OooO0Oo(r8)
            int r10 = r1.OooO0OO(r8)
            int r10 = r10 / 2
            int r10 = r10 + r9
            int r10 = r10 - r6
            int r9 = java.lang.Math.abs(r10)
            if (r9 >= r5) goto L54
            r2 = r8
            r5 = r9
        L54:
            int r7 = r7 + 1
            goto L3a
        L57:
            if (r2 != 0) goto L5a
            goto L6e
        L5a:
            int[] r0 = r11.OooO00o(r0, r2)
            r1 = r0[r3]
            r2 = 1
            if (r1 != 0) goto L67
            r4 = r0[r2]
            if (r4 == 0) goto L6e
        L67:
            androidx.recyclerview.widget.RecyclerView r4 = r11.f4947OooO00o
            r0 = r0[r2]
            r4.OoooOoo(r1, r0, r3)
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o000oOoO.o000000O.OooO0o0():void");
    }
}