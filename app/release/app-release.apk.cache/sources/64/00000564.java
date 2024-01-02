package o00000oO;

import o00000O.OooO0O0;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class o000oOoO {
    @OooO0O0("level_ielts")

    /* renamed from: OooO0O0  reason: collision with root package name */
    private final Integer f4093OooO0O0;
    @OooO0O0("level_toefl")

    /* renamed from: OooO0OO  reason: collision with root package name */
    private final Integer f4094OooO0OO;
    @OooO0O0("level_toeic")

    /* renamed from: OooO0Oo  reason: collision with root package name */
    private final Integer f4095OooO0Oo;
    @OooO0O0("language")

    /* renamed from: OooO00o  reason: collision with root package name */
    private final String f4092OooO00o = "vi";
    @OooO0O0("name")

    /* renamed from: OooO0o0  reason: collision with root package name */
    private final String f4096OooO0o0 = "PHAM VAN TIEN";

    public o000oOoO(Integer num, Integer num2, Integer num3) {
        this.f4093OooO0O0 = num;
        this.f4094OooO0OO = num2;
        this.f4095OooO0Oo = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o000oOoO) {
            o000oOoO o000oooo = (o000oOoO) obj;
            return OooO00o.OooOOO0(this.f4092OooO00o, o000oooo.f4092OooO00o) && OooO00o.OooOOO0(this.f4093OooO0O0, o000oooo.f4093OooO0O0) && OooO00o.OooOOO0(this.f4094OooO0OO, o000oooo.f4094OooO0OO) && OooO00o.OooOOO0(this.f4095OooO0Oo, o000oooo.f4095OooO0Oo) && OooO00o.OooOOO0(this.f4096OooO0o0, o000oooo.f4096OooO0o0);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f4092OooO00o;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f4093OooO0O0;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f4094OooO0OO;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f4095OooO0Oo;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.f4096OooO0o0;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "ProfileUserUpdate(language=" + this.f4092OooO00o + ", levelIelts=" + this.f4093OooO0O0 + ", levelToefl=" + this.f4094OooO0OO + ", levelToeic=" + this.f4095OooO0Oo + ", name=" + this.f4096OooO0o0 + ')';
    }
}