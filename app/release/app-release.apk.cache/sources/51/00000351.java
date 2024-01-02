package androidx.fragment.app;

/* loaded from: classes.dex */
public final class o00 implements Runnable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f2809OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ o00O0000 f2810OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ o00O000 f2811OooO0OO;

    public /* synthetic */ o00(o00O000 o00o000, o00O0000 o00o0000, int i) {
        this.f2809OooO00o = i;
        this.f2811OooO0OO = o00o000;
        this.f2810OooO0O0 = o00o0000;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2809OooO00o;
        o00O0000 o00o0000 = this.f2810OooO0O0;
        o00O000 o00o000 = this.f2811OooO0OO;
        switch (i) {
            case 0:
                if (o00o000.f2937OooO0O0.contains(o00o0000)) {
                    o00o0000.f2941OooO00o.OooO00o(o00o0000.f2943OooO0OO.f2979OooOooo);
                    return;
                }
                return;
            default:
                o00o000.f2937OooO0O0.remove(o00o0000);
                o00o000.f2938OooO0OO.remove(o00o0000);
                return;
        }
    }
}