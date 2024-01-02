package OoooO;

import java.io.Serializable;

/* loaded from: classes.dex */
public final /* synthetic */ class Oooo0 implements Runnable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f1516OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ int f1517OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ Object f1518OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final /* synthetic */ Object f1519OooO0Oo;

    public /* synthetic */ Oooo0(int i, int i2, Object obj, Serializable serializable) {
        this.f1516OooO00o = i2;
        this.f1519OooO0Oo = obj;
        this.f1517OooO0O0 = i;
        this.f1518OooO0OO = serializable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1516OooO00o;
        Object obj = this.f1518OooO0OO;
        int i2 = this.f1517OooO0O0;
        Object obj2 = this.f1519OooO0Oo;
        switch (i) {
            case 0:
                ((o000oOoO) obj2).f1521OooO0O0.OooOOO(i2, obj);
                return;
            default:
                ((o00O0O) obj2).OooOOO(i2, obj);
                return;
        }
    }
}