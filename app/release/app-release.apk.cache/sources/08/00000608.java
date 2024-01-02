package o0000oOO;

import java.io.IOException;
import java.util.List;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class oo0o0Oo extends o0000o0O.o0Oo0oo {

    /* renamed from: OooO0o  reason: collision with root package name */
    public final /* synthetic */ int f4750OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final /* synthetic */ o000000O f4751OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final /* synthetic */ List f4752OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0o0Oo(String str, o000000O o000000o2, int i, List list, boolean z) {
        super(str, true);
        this.f4751OooO0o0 = o000000o2;
        this.f4750OooO0o = i;
        this.f4752OooO0oO = list;
    }

    @Override // o0000o0O.o0Oo0oo
    public final long OooO00o() {
        OooOoo.o0ooOOo o0ooooo = this.f4751OooO0o0.f4645OooOO0o;
        List list = this.f4752OooO0oO;
        o0ooooo.getClass();
        OooO00o.OooOoo0(list, "responseHeaders");
        try {
            this.f4751OooO0o0.f4658OooOoO0.OooOoo(this.f4750OooO0o, OooOo.CANCEL);
            synchronized (this.f4751OooO0o0) {
                this.f4751OooO0o0.f4659OooOoOO.remove(Integer.valueOf(this.f4750OooO0o));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}