package o0000;

/* loaded from: classes.dex */
public final class OooO00o extends o000OO.OooOO0 implements o0000O0O.OooOo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f3954OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ Object f3955OooO0O0;

    public /* synthetic */ OooO00o(int i, Object obj) {
        this.f3954OooO00o = i;
        this.f3955OooO0O0 = obj;
    }

    @Override // o0000O0O.OooOo
    public final Object OooO0O0(Object obj) {
        int i = this.f3954OooO00o;
        Object obj2 = this.f3955OooO0O0;
        switch (i) {
            case 0:
                if (obj == ((OooO0O0) obj2)) {
                    return "(this Collection)";
                }
                return String.valueOf(obj);
            case 1:
                String str = (String) obj;
                o0000O00.OooO00o.OooOoo0(str, "line");
                return ((String) obj2) + str;
            default:
                o0000OO.OooO0OO oooO0OO = (o0000OO.OooO0OO) obj;
                o0000O00.OooO00o.OooOoo0(oooO0OO, "it");
                return o0000Oo0.OooOOOO.o00O0oO((CharSequence) obj2, oooO0OO);
        }
    }
}