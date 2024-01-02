package androidx.emoji2.text;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class o00O0O {

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public static final ThreadLocal f2697OooO0Oo = new ThreadLocal();

    /* renamed from: OooO00o  reason: collision with root package name */
    public final int f2698OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final OooO0o.OooOOO0 f2699OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public volatile int f2700OooO0OO = 0;

    public o00O0O(OooO0o.OooOOO0 oooOOO0, int i) {
        this.f2699OooO0O0 = oooOOO0;
        this.f2698OooO00o = i;
    }

    public final int OooO00o(int i) {
        Oooo0o.o00Oo0 OooO0OO2 = OooO0OO();
        int OooO00o2 = OooO0OO2.OooO00o(16);
        if (OooO00o2 != 0) {
            Object obj = OooO0OO2.f1460OooO0Oo;
            int i2 = OooO00o2 + OooO0OO2.f1457OooO00o;
            return ((ByteBuffer) obj).getInt((i * 4) + ((ByteBuffer) obj).getInt(i2) + i2 + 4);
        }
        return 0;
    }

    public final int OooO0O0() {
        Oooo0o.o00Oo0 OooO0OO2 = OooO0OO();
        int OooO00o2 = OooO0OO2.OooO00o(16);
        if (OooO00o2 != 0) {
            int i = OooO00o2 + OooO0OO2.f1457OooO00o;
            return ((ByteBuffer) OooO0OO2.f1460OooO0Oo).getInt(((ByteBuffer) OooO0OO2.f1460OooO0Oo).getInt(i) + i);
        }
        return 0;
    }

    public final Oooo0o.o00Oo0 OooO0OO() {
        ThreadLocal threadLocal = f2697OooO0Oo;
        Oooo0o.o00Oo0 o00oo0 = (Oooo0o.o00Oo0) threadLocal.get();
        if (o00oo0 == null) {
            o00oo0 = new Oooo0o.o00Oo0();
            threadLocal.set(o00oo0);
        }
        Oooo0o.o00Ooo o00ooo2 = (Oooo0o.o00Ooo) this.f2699OooO0O0.f269OooO00o;
        int OooO00o2 = o00ooo2.OooO00o(6);
        if (OooO00o2 != 0) {
            int i = OooO00o2 + o00ooo2.f1457OooO00o;
            int i2 = (this.f2698OooO00o * 4) + ((ByteBuffer) o00ooo2.f1460OooO0Oo).getInt(i) + i + 4;
            o00oo0.OooO0O0(((ByteBuffer) o00ooo2.f1460OooO0Oo).getInt(i2) + i2, (ByteBuffer) o00ooo2.f1460OooO0Oo);
        }
        return o00oo0;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        Oooo0o.o00Oo0 OooO0OO2 = OooO0OO();
        int OooO00o2 = OooO0OO2.OooO00o(4);
        if (OooO00o2 != 0) {
            i = ((ByteBuffer) OooO0OO2.f1460OooO0Oo).getInt(OooO00o2 + OooO0OO2.f1457OooO00o);
        } else {
            i = 0;
        }
        sb.append(Integer.toHexString(i));
        sb.append(", codepoints:");
        int OooO0O02 = OooO0O0();
        for (int i2 = 0; i2 < OooO0O02; i2++) {
            sb.append(Integer.toHexString(OooO00o(i2)));
            sb.append(" ");
        }
        return sb.toString();
    }
}