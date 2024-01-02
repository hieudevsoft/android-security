package o0000o;

import o0000O00.OooO00o;
import o0000Oo.o0O0O00;

/* loaded from: classes.dex */
public final class OooOo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o0O0O00 f4447OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final int f4448OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final String f4449OooO0OO;

    public OooOo(o0O0O00 o0o0o00, int i, String str) {
        this.f4447OooO00o = o0o0o00;
        this.f4448OooO0O0 = i;
        this.f4449OooO0OO = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4447OooO00o == o0O0O00.f4299OooO0O0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f4448OooO0O0);
        sb.append(' ');
        sb.append(this.f4449OooO0OO);
        String sb2 = sb.toString();
        OooO00o.OooOoOO(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}