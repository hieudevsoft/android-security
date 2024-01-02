package o000oOoO;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class o0O0ooO extends o000O000 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public boolean f5109OooO00o = false;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ o000000O f5110OooO0O0;

    public o0O0ooO(o000000O o000000o2) {
        this.f5110OooO0O0 = o000000o2;
    }

    @Override // o000oOoO.o000O000
    public final void OooO00o(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f5109OooO00o) {
            this.f5109OooO00o = false;
            this.f5110OooO0O0.OooO0o0();
        }
    }

    @Override // o000oOoO.o000O000
    public final void OooO0O0(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.f5109OooO00o = true;
    }
}