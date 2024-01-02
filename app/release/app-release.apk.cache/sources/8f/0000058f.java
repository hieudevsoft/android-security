package o0000OOo;

import java.util.Iterator;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class OooO0OO implements OooO0o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final OooO0o f4165OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final int f4166OooO0O0;

    public OooO0OO(OooO0o oooO0o, int i) {
        OooO00o.OooOoo0(oooO0o, "sequence");
        this.f4165OooO00o = oooO0o;
        this.f4166OooO0O0 = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // o0000OOo.OooO0o
    public final Iterator iterator() {
        return new o0000.OooO0OO(this);
    }
}