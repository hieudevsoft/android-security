package o0000oOo;

import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import o0000O00.OooO00o;
import o0000oOO.o00000OO;

/* loaded from: classes.dex */
public final class o000O0O0 extends o000OO00 {

    /* renamed from: OooO0OO  reason: collision with root package name */
    public static final boolean f4764OooO0OO;

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0076, code lost:
        if (r0.intValue() >= 9) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L6d
            r3 = 10
            o0000O00.OooO00o.OooOoo(r3)
            int r4 = r0.length()
            if (r4 != 0) goto L17
            goto L6d
        L17:
            char r5 = r0.charAt(r2)
            r6 = 48
            int r6 = o0000O00.OooO00o.Oooo0O0(r5, r6)
            r7 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            if (r6 >= 0) goto L38
            if (r4 != r1) goto L29
            goto L6d
        L29:
            r6 = 45
            if (r5 != r6) goto L31
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r1
            goto L39
        L31:
            r6 = 43
            if (r5 != r6) goto L6d
            r5 = r1
            r6 = r2
            goto L3a
        L38:
            r5 = r2
        L39:
            r6 = r5
        L3a:
            r8 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
            r9 = r2
            r10 = r8
        L3f:
            if (r5 >= r4) goto L60
            char r11 = r0.charAt(r5)
            int r11 = java.lang.Character.digit(r11, r3)
            if (r11 >= 0) goto L4c
            goto L6d
        L4c:
            if (r9 >= r10) goto L55
            if (r10 != r8) goto L6d
            int r10 = r7 / 10
            if (r9 >= r10) goto L55
            goto L6d
        L55:
            int r9 = r9 * 10
            int r12 = r7 + r11
            if (r9 >= r12) goto L5c
            goto L6d
        L5c:
            int r9 = r9 - r11
            int r5 = r5 + 1
            goto L3f
        L60:
            if (r6 == 0) goto L67
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            goto L6e
        L67:
            int r0 = -r9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L6e
        L6d:
            r0 = 0
        L6e:
            if (r0 == 0) goto L79
            int r0 = r0.intValue()
            r3 = 9
            if (r0 < r3) goto L83
            goto L84
        L79:
            java.lang.Class<javax.net.ssl.SSLSocket> r0 = javax.net.ssl.SSLSocket.class
            java.lang.String r3 = "getApplicationProtocol"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L83
            r0.getMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L83
            goto L84
        L83:
            r1 = r2
        L84:
            o0000oOo.o000O0O0.f4764OooO0OO = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o0000oOo.o000O0O0.<clinit>():void");
    }

    @Override // o0000oOo.o000OO00
    public final void OooO0Oo(SSLSocket sSLSocket, String str, List list) {
        OooO00o.OooOoo0(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        sSLParameters.setApplicationProtocols((String[]) o00000OO.OooO0Oo(list).toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // o0000oOo.o000OO00
    public final String OooO0o(SSLSocket sSLSocket) {
        String applicationProtocol;
        try {
            applicationProtocol = sSLSocket.getApplicationProtocol();
        } catch (UnsupportedOperationException unused) {
        }
        if (applicationProtocol == null ? true : OooO00o.OooOOO0(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }
}