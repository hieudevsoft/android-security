package OooOOOO;

import java.util.Iterator;

/* loaded from: classes.dex */
public class OooOO0O extends OooOO0 {
    public int OooOOO0;

    public OooOO0O(o000oOoO o000oooo) {
        super(o000oooo);
        this.f825OooO0o0 = o000oooo instanceof OooOOOO ? 2 : 3;
    }

    @Override // OooOOOO.OooOO0
    public final void OooO0Oo(int i) {
        if (this.f828OooOO0) {
            return;
        }
        this.f828OooOO0 = true;
        this.f826OooO0oO = i;
        Iterator it = this.f829OooOO0O.iterator();
        while (it.hasNext()) {
            OooO0o oooO0o = (OooO0o) it.next();
            oooO0o.OooO00o(oooO0o);
        }
    }
}