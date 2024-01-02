package OooOOOO;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class Oooo0 {

    /* renamed from: OooO0o  reason: collision with root package name */
    public static int f836OooO0o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final int f838OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f839OooO0OO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final ArrayList f837OooO00o = new ArrayList();

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public ArrayList f840OooO0Oo = null;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public int f841OooO0o0 = -1;

    public Oooo0(int i) {
        this.f838OooO0O0 = -1;
        int i2 = f836OooO0o;
        f836OooO0o = i2 + 1;
        this.f838OooO0O0 = i2;
        this.f839OooO0OO = i;
    }

    public final void OooO00o(ArrayList arrayList) {
        int size = this.f837OooO00o.size();
        if (this.f841OooO0o0 != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                Oooo0 oooo0 = (Oooo0) arrayList.get(i);
                if (this.f841OooO0o0 == oooo0.f838OooO0O0) {
                    OooO0OO(this.f839OooO0OO, oooo0);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int OooO0O0(OooOO0o.OooOo oooOo, int i) {
        int OooOOOO2;
        OooOOO.OooO0o oooO0o;
        ArrayList arrayList = this.f837OooO00o;
        if (arrayList.size() == 0) {
            return 0;
        }
        OooOOO.OooOO0 oooOO0 = (OooOOO.OooOO0) ((OooOOO.OooO) arrayList.get(0)).f660OoooO;
        oooOo.OooOo0();
        oooOO0.OooO0OO(oooOo, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((OooOOO.OooO) arrayList.get(i2)).OooO0OO(oooOo, false);
        }
        if (i == 0 && oooOO0.f733o0OO00O > 0) {
            o0000O00.OooO00o.OooOO0O(oooOO0, oooOo, arrayList, 0);
        }
        if (i == 1 && oooOO0.f739oo0o0Oo > 0) {
            o0000O00.OooO00o.OooOO0O(oooOO0, oooOo, arrayList, 1);
        }
        try {
            oooOo.OooOOo0();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f840OooO0Oo = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.f840OooO0Oo.add(new Oooo000(this, (OooOOO.OooO) arrayList.get(i3), oooOo, i));
        }
        if (i == 0) {
            OooOOOO2 = OooOO0o.OooOo.OooOOOO(oooOO0.f650Oooo0);
            oooO0o = oooOO0.f655Oooo0OO;
        } else {
            OooOOOO2 = OooOO0o.OooOo.OooOOOO(oooOO0.f654Oooo0O0);
            oooO0o = oooOO0.f657Oooo0o0;
        }
        int OooOOOO3 = OooOO0o.OooOo.OooOOOO(oooO0o);
        oooOo.OooOo0();
        return OooOOOO3 - OooOOOO2;
    }

    public final void OooO0OO(int i, Oooo0 oooo0) {
        Iterator it = this.f837OooO00o.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            int i2 = oooo0.f838OooO0O0;
            if (hasNext) {
                OooOOO.OooO oooO = (OooOOO.OooO) it.next();
                ArrayList arrayList = oooo0.f837OooO00o;
                if (!arrayList.contains(oooO)) {
                    arrayList.add(oooO);
                }
                if (i == 0) {
                    oooO.o00Oo0 = i2;
                } else {
                    oooO.f680o00Ooo = i2;
                }
            } else {
                this.f841OooO0o0 = i2;
                return;
            }
        }
    }

    public final String toString() {
        String str;
        Iterator it;
        StringBuilder sb = new StringBuilder();
        int i = this.f839OooO0OO;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else if (i == 2) {
            str = "Both";
        } else {
            str = "Unknown";
        }
        sb.append(str);
        sb.append(" [");
        sb.append(this.f838OooO0O0);
        sb.append("] <");
        String sb2 = sb.toString();
        while (this.f837OooO00o.iterator().hasNext()) {
            sb2 = sb2 + " " + ((OooOOO.OooO) it.next()).f674Oooooo;
        }
        return OooO0O0.OooO00o.OooO0OO(sb2, " >");
    }
}