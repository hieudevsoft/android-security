package o00000oO;

import o00000O.OooO0O0;
import o0000O00.OooO00o;
import o000OO.OooO0OO;

/* loaded from: classes.dex */
public final class OooOO0 {
    @OooO0O0("data")

    /* renamed from: OooO00o  reason: collision with root package name */
    private final String f4069OooO00o;
    @OooO0O0("msg")

    /* renamed from: OooO0O0  reason: collision with root package name */
    private final String f4070OooO0O0;
    @OooO0O0("status")

    /* renamed from: OooO0OO  reason: collision with root package name */
    private final Integer f4071OooO0OO;

    public OooOO0() {
        this(null, null, null, 7, null);
    }

    public final String OooO00o() {
        return this.f4069OooO00o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OooOO0) {
            OooOO0 oooOO0 = (OooOO0) obj;
            return OooO00o.OooOOO0(this.f4069OooO00o, oooOO0.f4069OooO00o) && OooO00o.OooOOO0(this.f4070OooO0O0, oooOO0.f4070OooO0O0) && OooO00o.OooOOO0(this.f4071OooO0OO, oooOO0.f4071OooO0OO);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f4069OooO00o;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f4070OooO0O0;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f4071OooO0OO;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "KeyResponse(data=" + this.f4069OooO00o + ", msg=" + this.f4070OooO0O0 + ", status=" + this.f4071OooO0OO + ')';
    }

    public OooOO0(String str, String str2, Integer num) {
        this.f4069OooO00o = str;
        this.f4070OooO0O0 = str2;
        this.f4071OooO0OO = num;
    }

    public /* synthetic */ OooOO0(String str, String str2, Integer num, int i, OooO0OO oooO0OO) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num);
    }
}