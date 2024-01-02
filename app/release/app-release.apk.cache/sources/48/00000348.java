package androidx.fragment.app;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class OooOO0 implements Runnable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f2780OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ Object f2781OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ Object f2782OooO0OO;

    public /* synthetic */ OooOO0(Object obj, int i, Object obj2) {
        this.f2780OooO00o = i;
        this.f2781OooO0O0 = obj;
        this.f2782OooO0OO = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2780OooO00o;
        Object obj = this.f2782OooO0OO;
        switch (i) {
            case 0:
                o000Oo0.OooO0O0((ArrayList) obj, 4);
                return;
            case 1:
                ((OooOOO0) obj).OooO0O0();
                return;
            default:
                ((o00O000) obj).OooO0OO();
                return;
        }
    }
}