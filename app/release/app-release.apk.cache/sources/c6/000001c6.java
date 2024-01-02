package Oooo0o;

import java.nio.ByteBuffer;
import o0ooOO0.OooOOO0;

/* loaded from: classes.dex */
public abstract class oo000o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public int f1457OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f1458OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f1459OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public Object f1460OooO0Oo;

    public oo000o() {
        if (OooOOO0.f5487OooO0O0 == null) {
            OooOOO0.f5487OooO0O0 = new OooOOO0(13);
        }
    }

    public final int OooO00o(int i) {
        if (i < this.f1459OooO0OO) {
            return ((ByteBuffer) this.f1460OooO0Oo).getShort(this.f1458OooO0O0 + i);
        }
        return 0;
    }

    public final void OooO0O0(int i, ByteBuffer byteBuffer) {
        short s;
        this.f1460OooO0Oo = byteBuffer;
        if (byteBuffer != null) {
            this.f1457OooO00o = i;
            int i2 = i - byteBuffer.getInt(i);
            this.f1458OooO0O0 = i2;
            s = ((ByteBuffer) this.f1460OooO0Oo).getShort(i2);
        } else {
            s = 0;
            this.f1457OooO00o = 0;
            this.f1458OooO0O0 = 0;
        }
        this.f1459OooO0OO = s;
    }
}