package androidx.appcompat.widget;

/* loaded from: classes.dex */
public final /* synthetic */ class o0oOo0O0 implements Runnable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f2542OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ Toolbar f2543OooO0O0;

    public /* synthetic */ o0oOo0O0(Toolbar toolbar, int i) {
        this.f2542OooO00o = i;
        this.f2543OooO0O0 = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OooO0oO.o00O00OO o00o00oo;
        int i = this.f2542OooO00o;
        Toolbar toolbar = this.f2543OooO0O0;
        switch (i) {
            case 0:
                toolbar.OooOO0o();
                return;
            default:
                o0OO000 o0oo000 = toolbar.f2234Oooo0o0;
                if (o0oo000 == null) {
                    o00o00oo = null;
                } else {
                    o00o00oo = o0oo000.f2485OooO0O0;
                }
                if (o00o00oo != null) {
                    o00o00oo.collapseActionView();
                    return;
                }
                return;
        }
    }
}