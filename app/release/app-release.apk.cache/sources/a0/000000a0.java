package OooOOO;

import OooOOOO.Oooo0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class OooOo00 extends OooO implements OooOOOO {

    /* renamed from: o00ooo  reason: collision with root package name */
    public OooO[] f797o00ooo = new OooO[4];

    /* renamed from: oo000o  reason: collision with root package name */
    public int f798oo000o = 0;

    public void OooO00o() {
    }

    public final void OoooO00(int i, Oooo0 oooo0, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.f798oo000o; i2++) {
            OooO oooO = this.f797o00ooo[i2];
            ArrayList arrayList2 = oooo0.f837OooO00o;
            if (!arrayList2.contains(oooO)) {
                arrayList2.add(oooO);
            }
        }
        for (int i3 = 0; i3 < this.f798oo000o; i3++) {
            o0000O00.OooO00o.o00Oo0(this.f797o00ooo[i3], i, arrayList, oooo0);
        }
    }
}