package androidx.emoji2.text;

import android.util.SparseArray;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class o00Oo0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public int f2701OooO00o = 1;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final o0OOO0o f2702OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public o0OOO0o f2703OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public o0OOO0o f2704OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public int f2705OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public int f2706OooO0o0;

    public o00Oo0(o0OOO0o o0ooo0o) {
        this.f2702OooO0O0 = o0ooo0o;
        this.f2703OooO0OO = o0ooo0o;
    }

    public final int OooO00o(int i) {
        o0OOO0o o0ooo0o;
        boolean z;
        SparseArray sparseArray = this.f2703OooO0OO.f2721OooO00o;
        if (sparseArray == null) {
            o0ooo0o = null;
        } else {
            o0ooo0o = (o0OOO0o) sparseArray.get(i);
        }
        int i2 = 1;
        if (this.f2701OooO00o != 2) {
            if (o0ooo0o != null) {
                this.f2701OooO00o = 2;
                this.f2703OooO0OO = o0ooo0o;
                this.f2705OooO0o = 1;
                i2 = 2;
            }
            OooO0O0();
        } else {
            if (o0ooo0o != null) {
                this.f2703OooO0OO = o0ooo0o;
                this.f2705OooO0o++;
            } else {
                boolean z2 = false;
                if (i == 65038) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    if (i == 65039) {
                        z2 = true;
                    }
                    if (!z2) {
                        o0OOO0o o0ooo0o2 = this.f2703OooO0OO;
                        if (o0ooo0o2.f2722OooO0O0 != null) {
                            if (this.f2705OooO0o == 1) {
                                if (OooO0OO()) {
                                    o0ooo0o2 = this.f2703OooO0OO;
                                }
                            }
                            this.f2704OooO0Oo = o0ooo0o2;
                            OooO0O0();
                            i2 = 3;
                        }
                    }
                }
                OooO0O0();
            }
            i2 = 2;
        }
        this.f2706OooO0o0 = i;
        return i2;
    }

    public final void OooO0O0() {
        this.f2701OooO00o = 1;
        this.f2703OooO0OO = this.f2702OooO0O0;
        this.f2705OooO0o = 0;
    }

    public final boolean OooO0OO() {
        boolean z;
        boolean z2;
        Oooo0o.o00Oo0 OooO0OO2 = this.f2703OooO0OO.f2722OooO0O0.OooO0OO();
        int OooO00o2 = OooO0OO2.OooO00o(6);
        if (OooO00o2 != 0 && ((ByteBuffer) OooO0OO2.f1460OooO0Oo).get(OooO00o2 + OooO0OO2.f1457OooO00o) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        if (this.f2706OooO0o0 == 65039) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        return true;
    }
}