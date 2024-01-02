package OoooOoo;

import OooO0O0.OooO0O0;
import OooO0o.OooOOO0;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class oO000 extends oO00000 {

    /* renamed from: OooOoO  reason: collision with root package name */
    public int f1633OooOoO;

    /* renamed from: OooOo  reason: collision with root package name */
    public ArrayList f1632OooOo = new ArrayList();

    /* renamed from: OooOoO0  reason: collision with root package name */
    public boolean f1634OooOoO0 = true;

    /* renamed from: OooOoOO  reason: collision with root package name */
    public boolean f1635OooOoOO = false;

    /* renamed from: OooOoo0  reason: collision with root package name */
    public int f1636OooOoo0 = 0;

    @Override // OoooOoo.oO00000
    public final void OooO00o(o oVar) {
        super.OooO00o(oVar);
    }

    @Override // OoooOoo.oO00000
    public final void OooO0O0(View view) {
        for (int i = 0; i < this.f1632OooOo.size(); i++) {
            ((oO00000) this.f1632OooOo.get(i)).OooO0O0(view);
        }
        this.f1645OooO0o.add(view);
    }

    @Override // OoooOoo.oO00000
    public final void OooO0Oo(oO000O0O oo000o0o) {
        View view = oo000o0o.f1669OooO0O0;
        if (OooOOoo(view)) {
            Iterator it = this.f1632OooOo.iterator();
            while (it.hasNext()) {
                oO00000 oo00000 = (oO00000) it.next();
                if (oo00000.OooOOoo(view)) {
                    oo00000.OooO0Oo(oo000o0o);
                    oo000o0o.f1670OooO0OO.add(oo00000);
                }
            }
        }
    }

    @Override // OoooOoo.oO00000
    public final void OooO0o(oO000O0O oo000o0o) {
        int size = this.f1632OooOo.size();
        for (int i = 0; i < size; i++) {
            ((oO00000) this.f1632OooOo.get(i)).OooO0o(oo000o0o);
        }
    }

    @Override // OoooOoo.oO00000
    public final void OooO0oO(oO000O0O oo000o0o) {
        View view = oo000o0o.f1669OooO0O0;
        if (OooOOoo(view)) {
            Iterator it = this.f1632OooOo.iterator();
            while (it.hasNext()) {
                oO00000 oo00000 = (oO00000) it.next();
                if (oo00000.OooOOoo(view)) {
                    oo00000.OooO0oO(oo000o0o);
                    oo000o0o.f1670OooO0OO.add(oo00000);
                }
            }
        }
    }

    @Override // OoooOoo.oO00000
    /* renamed from: OooOO0 */
    public final oO00000 clone() {
        oO000 oo000 = (oO000) super.clone();
        oo000.f1632OooOo = new ArrayList();
        int size = this.f1632OooOo.size();
        for (int i = 0; i < size; i++) {
            oO00000 clone = ((oO00000) this.f1632OooOo.get(i)).clone();
            oo000.f1632OooOo.add(clone);
            clone.f1640OooO = oo000;
        }
        return oo000;
    }

    @Override // OoooOoo.oO00000
    public final void OooOO0o(ViewGroup viewGroup, OooOOO0 oooOOO0, OooOOO0 oooOOO02, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.f1642OooO0O0;
        int size = this.f1632OooOo.size();
        for (int i = 0; i < size; i++) {
            oO00000 oo00000 = (oO00000) this.f1632OooOo.get(i);
            if (j > 0 && (this.f1634OooOoO0 || i == 0)) {
                long j2 = oo00000.f1642OooO0O0;
                if (j2 > 0) {
                    oo00000.OooOooo(j2 + j);
                } else {
                    oo00000.OooOooo(j);
                }
            }
            oo00000.OooOO0o(viewGroup, oooOOO0, oooOOO02, arrayList, arrayList2);
        }
    }

    @Override // OoooOoo.oO00000
    public final void OooOo(ViewGroup viewGroup) {
        super.OooOo(viewGroup);
        int size = this.f1632OooOo.size();
        for (int i = 0; i < size; i++) {
            ((oO00000) this.f1632OooOo.get(i)).OooOo(viewGroup);
        }
    }

    @Override // OoooOoo.oO00000
    public final void OooOo0(View view) {
        super.OooOo0(view);
        int size = this.f1632OooOo.size();
        for (int i = 0; i < size; i++) {
            ((oO00000) this.f1632OooOo.get(i)).OooOo0(view);
        }
    }

    @Override // OoooOoo.oO00000
    public final void OooOo0O(o oVar) {
        super.OooOo0O(oVar);
    }

    @Override // OoooOoo.oO00000
    public final void OooOo0o(View view) {
        for (int i = 0; i < this.f1632OooOo.size(); i++) {
            ((oO00000) this.f1632OooOo.get(i)).OooOo0o(view);
        }
        this.f1645OooO0o.remove(view);
    }

    @Override // OoooOoo.oO00000
    public final void OooOoO(long j) {
        ArrayList arrayList;
        this.f1643OooO0OO = j;
        if (j >= 0 && (arrayList = this.f1632OooOo) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((oO00000) this.f1632OooOo.get(i)).OooOoO(j);
            }
        }
    }

    @Override // OoooOoo.oO00000
    public final void OooOoO0() {
        if (this.f1632OooOo.isEmpty()) {
            Oooo000();
            OooOOO0();
            return;
        }
        oO0000o0 oo0000o0 = new oO0000o0(this);
        Iterator it = this.f1632OooOo.iterator();
        while (it.hasNext()) {
            ((oO00000) it.next()).OooO00o(oo0000o0);
        }
        this.f1633OooOoO = this.f1632OooOo.size();
        if (!this.f1634OooOoO0) {
            for (int i = 1; i < this.f1632OooOo.size(); i++) {
                ((oO00000) this.f1632OooOo.get(i - 1)).OooO00o(new o0OOOO00(this, 2, (oO00000) this.f1632OooOo.get(i)));
            }
            oO00000 oo00000 = (oO00000) this.f1632OooOo.get(0);
            if (oo00000 != null) {
                oo00000.OooOoO0();
                return;
            }
            return;
        }
        Iterator it2 = this.f1632OooOo.iterator();
        while (it2.hasNext()) {
            ((oO00000) it2.next()).OooOoO0();
        }
    }

    @Override // OoooOoo.oO00000
    public final void OooOoOO(OooO0O0 oooO0O0) {
        this.f1657OooOOoo = oooO0O0;
        this.f1636OooOoo0 |= 8;
        int size = this.f1632OooOo.size();
        for (int i = 0; i < size; i++) {
            ((oO00000) this.f1632OooOo.get(i)).OooOoOO(oooO0O0);
        }
    }

    @Override // OoooOoo.oO00000
    public final void OooOoo(o0ooOO0.OooOOO0 oooOOO0) {
        super.OooOoo(oooOOO0);
        this.f1636OooOoo0 |= 4;
        if (this.f1632OooOo != null) {
            for (int i = 0; i < this.f1632OooOo.size(); i++) {
                ((oO00000) this.f1632OooOo.get(i)).OooOoo(oooOOO0);
            }
        }
    }

    @Override // OoooOoo.oO00000
    public final void OooOoo0(TimeInterpolator timeInterpolator) {
        this.f1636OooOoo0 |= 1;
        ArrayList arrayList = this.f1632OooOo;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((oO00000) this.f1632OooOo.get(i)).OooOoo0(timeInterpolator);
            }
        }
        this.f1644OooO0Oo = timeInterpolator;
    }

    @Override // OoooOoo.oO00000
    public final void OooOooO() {
        this.f1636OooOoo0 |= 2;
        int size = this.f1632OooOo.size();
        for (int i = 0; i < size; i++) {
            ((oO00000) this.f1632OooOo.get(i)).OooOooO();
        }
    }

    @Override // OoooOoo.oO00000
    public final void OooOooo(long j) {
        this.f1642OooO0O0 = j;
    }

    @Override // OoooOoo.oO00000
    public final String Oooo00O(String str) {
        String Oooo00O2 = super.Oooo00O(str);
        for (int i = 0; i < this.f1632OooOo.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(Oooo00O2);
            sb.append("\n");
            sb.append(((oO00000) this.f1632OooOo.get(i)).Oooo00O(str + "  "));
            Oooo00O2 = sb.toString();
        }
        return Oooo00O2;
    }

    public final void Oooo00o(oO00000 oo00000) {
        this.f1632OooOo.add(oo00000);
        oo00000.f1640OooO = this;
        long j = this.f1643OooO0OO;
        if (j >= 0) {
            oo00000.OooOoO(j);
        }
        if ((this.f1636OooOoo0 & 1) != 0) {
            oo00000.OooOoo0(this.f1644OooO0Oo);
        }
        if ((this.f1636OooOoo0 & 2) != 0) {
            oo00000.OooOooO();
        }
        if ((this.f1636OooOoo0 & 4) != 0) {
            oo00000.OooOoo(this.f1658OooOo00);
        }
        if ((this.f1636OooOoo0 & 8) != 0) {
            oo00000.OooOoOO(this.f1657OooOOoo);
        }
    }
}