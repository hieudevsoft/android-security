package OooOOO;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class OooOo extends OooO {

    /* renamed from: o00ooo  reason: collision with root package name */
    public ArrayList f796o00ooo = new ArrayList();

    @Override // OooOOO.OooO
    public void OooOoo() {
        this.f796o00ooo.clear();
        super.OooOoo();
    }

    @Override // OooOOO.OooO
    public final void Oooo000(OooO0o.OooOOO0 oooOOO0) {
        super.Oooo000(oooOOO0);
        int size = this.f796o00ooo.size();
        for (int i = 0; i < size; i++) {
            ((OooO) this.f796o00ooo.get(i)).Oooo000(oooOOO0);
        }
    }

    public abstract void OoooO00();
}