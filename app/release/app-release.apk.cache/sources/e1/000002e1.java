package androidx.appcompat.widget;

/* loaded from: classes.dex */
public final class o0O000o0 implements Runnable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f2432OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ SearchView f2433OooO0O0;

    public /* synthetic */ o0O000o0(SearchView searchView, int i) {
        this.f2432OooO00o = i;
        this.f2433OooO0O0 = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2432OooO00o;
        SearchView searchView = this.f2433OooO0O0;
        switch (i) {
            case 0:
                searchView.OooOo0();
                return;
            default:
                Oooo0O0.OooOOO oooOOO = searchView.f2179Oooo0oo;
                if (oooOOO instanceof o0O0OOOo) {
                    oooOOO.OooO0O0(null);
                    return;
                }
                return;
        }
    }
}