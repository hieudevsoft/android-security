package OooOOOO;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class OooOO0 implements OooO0o {

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final o000oOoO f823OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public int f824OooO0o;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public int f826OooO0oO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public o000oOoO f820OooO00o = null;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public boolean f821OooO0O0 = false;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public boolean f822OooO0OO = false;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public int f825OooO0o0 = 1;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public int f827OooO0oo = 1;

    /* renamed from: OooO  reason: collision with root package name */
    public OooOO0O f819OooO = null;

    /* renamed from: OooOO0  reason: collision with root package name */
    public boolean f828OooOO0 = false;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public final ArrayList f829OooOO0O = new ArrayList();

    /* renamed from: OooOO0o  reason: collision with root package name */
    public final ArrayList f830OooOO0o = new ArrayList();

    public OooOO0(o000oOoO o000oooo) {
        this.f823OooO0Oo = o000oooo;
    }

    @Override // OooOOOO.OooO0o
    public final void OooO00o(OooO0o oooO0o) {
        ArrayList arrayList = this.f830OooOO0o;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((OooOO0) it.next()).f828OooOO0) {
                return;
            }
        }
        this.f822OooO0OO = true;
        o000oOoO o000oooo = this.f820OooO00o;
        if (o000oooo != null) {
            o000oooo.OooO00o(this);
        }
        if (this.f821OooO0O0) {
            this.f823OooO0Oo.OooO00o(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        OooOO0 oooOO0 = null;
        int i = 0;
        while (it2.hasNext()) {
            OooOO0 oooOO02 = (OooOO0) it2.next();
            if (!(oooOO02 instanceof OooOO0O)) {
                i++;
                oooOO0 = oooOO02;
            }
        }
        if (oooOO0 != null && i == 1 && oooOO0.f828OooOO0) {
            OooOO0O oooOO0O = this.f819OooO;
            if (oooOO0O != null) {
                if (!oooOO0O.f828OooOO0) {
                    return;
                }
                this.f824OooO0o = this.f827OooO0oo * oooOO0O.f826OooO0oO;
            }
            OooO0Oo(oooOO0.f826OooO0oO + this.f824OooO0o);
        }
        o000oOoO o000oooo2 = this.f820OooO00o;
        if (o000oooo2 != null) {
            o000oooo2.OooO00o(this);
        }
    }

    public final void OooO0O0(OooO0o oooO0o) {
        this.f829OooOO0O.add(oooO0o);
        if (this.f828OooOO0) {
            oooO0o.OooO00o(oooO0o);
        }
    }

    public final void OooO0OO() {
        this.f830OooOO0o.clear();
        this.f829OooOO0O.clear();
        this.f828OooOO0 = false;
        this.f826OooO0oO = 0;
        this.f822OooO0OO = false;
        this.f821OooO0O0 = false;
    }

    public void OooO0Oo(int i) {
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

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f823OooO0Oo.f852OooO0O0.f674Oooooo);
        sb.append(":");
        sb.append(OooO0O0.OooO00o.OooO(this.f825OooO0o0));
        sb.append("(");
        if (this.f828OooOO0) {
            obj = Integer.valueOf(this.f826OooO0oO);
        } else {
            obj = "unresolved";
        }
        sb.append(obj);
        sb.append(") <t=");
        sb.append(this.f830OooOO0o.size());
        sb.append(":d=");
        sb.append(this.f829OooOO0O.size());
        sb.append(">");
        return sb.toString();
    }
}