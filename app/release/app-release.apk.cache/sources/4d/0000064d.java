package o000oOoO;

/* loaded from: classes.dex */
public final class OooO00o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public int f4883OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f4884OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public Object f4885OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public int f4886OooO0Oo;

    public OooO00o(Object obj, int i, int i2, int i3) {
        this.f4883OooO00o = i;
        this.f4884OooO0O0 = i2;
        this.f4886OooO0Oo = i3;
        this.f4885OooO0OO = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OooO00o.class != obj.getClass()) {
            return false;
        }
        OooO00o oooO00o = (OooO00o) obj;
        int i = this.f4883OooO00o;
        if (i != oooO00o.f4883OooO00o) {
            return false;
        }
        if (i == 8 && Math.abs(this.f4886OooO0Oo - this.f4884OooO0O0) == 1 && this.f4886OooO0Oo == oooO00o.f4884OooO0O0 && this.f4884OooO0O0 == oooO00o.f4886OooO0Oo) {
            return true;
        }
        if (this.f4886OooO0Oo == oooO00o.f4886OooO0Oo && this.f4884OooO0O0 == oooO00o.f4884OooO0O0) {
            Object obj2 = this.f4885OooO0OO;
            Object obj3 = oooO00o.f4885OooO0OO;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f4883OooO00o * 31) + this.f4884OooO0O0) * 31) + this.f4886OooO0Oo;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f4883OooO00o;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 8) {
                        str = "??";
                    } else {
                        str = "mv";
                    }
                } else {
                    str = "up";
                }
            } else {
                str = "rm";
            }
        } else {
            str = "add";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.f4884OooO0O0);
        sb.append("c:");
        sb.append(this.f4886OooO0Oo);
        sb.append(",p:");
        sb.append(this.f4885OooO0OO);
        sb.append("]");
        return sb.toString();
    }
}