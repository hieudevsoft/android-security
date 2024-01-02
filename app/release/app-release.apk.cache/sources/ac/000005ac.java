package o0000Oo;

import java.util.regex.Pattern;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class o0Oo0oo {

    /* renamed from: OooO0OO  reason: collision with root package name */
    public static final Pattern f4335OooO0OO = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public static final Pattern f4336OooO0Oo = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: OooO00o  reason: collision with root package name */
    public final String f4337OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final String[] f4338OooO0O0;

    public o0Oo0oo(String str, String[] strArr) {
        this.f4337OooO00o = str;
        this.f4338OooO0O0 = strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0025 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.nio.charset.Charset OooO00o(java.nio.charset.Charset r6) {
        /*
            r5 = this;
            java.lang.String[] r0 = r5.f4338OooO0O0
            int r1 = r0.length
            int r1 = r1 + (-1)
            r2 = 2
            r3 = 0
            int r1 = o0000O00.OooO00o.o00000O(r3, r1, r2)
            if (r1 < 0) goto L21
        Ld:
            r2 = r0[r3]
            java.lang.String r4 = "charset"
            boolean r2 = o0000Oo0.OooOOOO.oo0o0O0(r2, r4)
            if (r2 == 0) goto L1c
            int r3 = r3 + 1
            r0 = r0[r3]
            goto L22
        L1c:
            if (r3 == r1) goto L21
            int r3 = r3 + 2
            goto Ld
        L21:
            r0 = 0
        L22:
            if (r0 != 0) goto L25
            return r6
        L25:
            java.nio.charset.Charset r6 = java.nio.charset.Charset.forName(r0)     // Catch: java.lang.IllegalArgumentException -> L29
        L29:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o0000Oo.o0Oo0oo.OooO00o(java.nio.charset.Charset):java.nio.charset.Charset");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o0Oo0oo) && OooO00o.OooOOO0(((o0Oo0oo) obj).f4337OooO00o, this.f4337OooO00o);
    }

    public final int hashCode() {
        return this.f4337OooO00o.hashCode();
    }

    public final String toString() {
        return this.f4337OooO00o;
    }
}