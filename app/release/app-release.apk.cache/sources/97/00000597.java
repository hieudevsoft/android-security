package o0000Oo;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o00000.o000;
import o0000O00.OooO00o;
import o0000o0.OooO0O0;

/* loaded from: classes.dex */
public final class OooOOOO {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f4195OooO00o;

    public /* synthetic */ OooOOOO(int i) {
        this.f4195OooO00o = i;
    }

    public static o0000Ooo OooO(String str) {
        OooO00o.OooOoo0(str, "javaName");
        int hashCode = str.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return o0000Ooo.f4274OooO0Oo;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return o0000Ooo.f4273OooO0OO;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return o0000Ooo.f4272OooO0O0;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return o0000Ooo.f4276OooO0o0;
            }
        } else if (str.equals("SSLv3")) {
            return o0000Ooo.f4275OooO0o;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    public static final OooOo00 OooO00o(OooOOOO oooOOOO, String str) {
        OooOo00 oooOo00 = new OooOo00(str);
        OooOo00.f4203OooO0Oo.put(str, oooOo00);
        return oooOo00;
    }

    public static final o00000 OooO0O0(o00000 o00000Var) {
        o00000O o00000o;
        int i = OooO0O0.f4451OooO00o;
        if (o00000Var != null) {
            o00000o = o00000Var.f4244OooO0oO;
        } else {
            o00000o = null;
        }
        if (o00000o != null) {
            o00000Var.getClass();
            o000000O o000000o2 = new o000000O(o00000Var);
            o000000o2.f4260OooO0oO = null;
            return o000000o2.OooO00o();
        }
        return o00000Var;
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v8 */
    public static String OooO0OO(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i3) {
        char[] cArr = o0ooOOo.f4343OooOO0;
        ?? r3 = 0;
        int i4 = (i3 & 1) != 0 ? 0 : i;
        int length = (i3 & 2) != 0 ? str.length() : i2;
        boolean z5 = (i3 & 8) != 0 ? false : z;
        boolean z6 = (i3 & 16) != 0 ? false : z2;
        boolean z7 = (i3 & 32) != 0 ? false : z3;
        boolean z8 = (i3 & 64) != 0 ? false : z4;
        OooO00o.OooOoo0(str, "<this>");
        int i5 = i4;
        while (i5 < length) {
            int codePointAt = str.codePointAt(i5);
            int i6 = 127;
            if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || z8)) {
                if (!(o0000Oo0.OooOOOO.o00O0OOo(str2, (char) codePointAt, 0, false, 2) >= 0) && ((codePointAt != 37 || (z5 && (!z6 || OooOOOO(str, i5, length)))) && (codePointAt != 43 || !z7))) {
                    i5 += Character.charCount(codePointAt);
                }
            }
            o000O000.OooOO0 oooOO0 = new o000O000.OooOO0();
            oooOO0.Oooo0o(str, i4, i5);
            o000O000.OooOO0 oooOO02 = null;
            while (i5 < length) {
                int codePointAt2 = str.codePointAt(i5);
                if (!z5 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                    if (codePointAt2 == 43 && z7) {
                        oooOO0.Oooo0o0(z5 ? "+" : "%2B");
                    } else {
                        if (codePointAt2 >= 32 && codePointAt2 != i6) {
                            if (codePointAt2 < 128 || z8) {
                                if (!(o0000Oo0.OooOOOO.o00O0OOo(str2, (char) codePointAt2, r3, r3, 2) >= 0 ? true : r3) && (codePointAt2 != 37 || (z5 && (!z6 || OooOOOO(str, i5, length))))) {
                                    oooOO0.Oooo0oO(codePointAt2);
                                    i5 += Character.charCount(codePointAt2);
                                    r3 = 0;
                                    i6 = 127;
                                }
                            }
                        }
                        if (oooOO02 == null) {
                            oooOO02 = new o000O000.OooOO0();
                        }
                        oooOO02.Oooo0oO(codePointAt2);
                        while (!oooOO02.OooOOOO()) {
                            int OooOo0O2 = oooOO02.OooOo0O() & 255;
                            oooOO0.Oooo00o(37);
                            char[] cArr2 = o0ooOOo.f4343OooOO0;
                            oooOO0.Oooo00o(cArr2[(OooOo0O2 >> 4) & 15]);
                            oooOO0.Oooo00o(cArr2[OooOo0O2 & 15]);
                        }
                        i5 += Character.charCount(codePointAt2);
                        r3 = 0;
                        i6 = 127;
                    }
                }
                i5 += Character.charCount(codePointAt2);
                r3 = 0;
                i6 = 127;
            }
            return oooOO0.OooOoo0(oooOO0.f4823OooO0O0, o0000Oo0.OooO0O0.f4385OooO00o);
        }
        String substring = str.substring(i4, length);
        OooO00o.OooOoOO(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static void OooO0Oo(String str) {
        if (!(str.length() > 0)) {
            throw new IllegalArgumentException("name is empty".toString());
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (!('!' <= charAt && charAt < 127)) {
                throw new IllegalArgumentException(o0000OoO.OooOO0O.OooO0oo("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str).toString());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x003b, code lost:
        if (r0 != ':') goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int OooO0o(java.lang.String r5, int r6, int r7, boolean r8) {
        /*
        L0:
            if (r6 >= r7) goto L46
            char r0 = r5.charAt(r6)
            r1 = 32
            r2 = 1
            if (r0 >= r1) goto Lf
            r1 = 9
            if (r0 != r1) goto L3d
        Lf:
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 >= r1) goto L3d
            r1 = 48
            r3 = 58
            r4 = 0
            if (r1 > r0) goto L1e
            if (r0 >= r3) goto L1e
            r1 = r2
            goto L1f
        L1e:
            r1 = r4
        L1f:
            if (r1 != 0) goto L3d
            r1 = 97
            if (r1 > r0) goto L2b
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 >= r1) goto L2b
            r1 = r2
            goto L2c
        L2b:
            r1 = r4
        L2c:
            if (r1 != 0) goto L3d
            r1 = 65
            if (r1 > r0) goto L38
            r1 = 91
            if (r0 >= r1) goto L38
            r1 = r2
            goto L39
        L38:
            r1 = r4
        L39:
            if (r1 != 0) goto L3d
            if (r0 != r3) goto L3e
        L3d:
            r4 = r2
        L3e:
            r0 = r8 ^ 1
            if (r4 != r0) goto L43
            return r6
        L43:
            int r6 = r6 + 1
            goto L0
        L46:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o0000Oo.OooOOOO.OooO0o(java.lang.String, int, int, boolean):int");
    }

    public static void OooO0o0(String str, String str2) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            boolean z = true;
            if (charAt != '\t') {
                if (!(' ' <= charAt && charAt < 127)) {
                    z = false;
                }
            }
            if (!z) {
                StringBuilder sb = new StringBuilder();
                sb.append(o0000OoO.OooOO0O.OooO0oo("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i), str2));
                sb.append(o0000OoO.OooOO0O.OooOOOo(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static int OooO0oO(String str) {
        OooO00o.OooOoo0(str, "scheme");
        if (OooO00o.OooOOO0(str, "http")) {
            return 80;
        }
        return OooO00o.OooOOO0(str, "https") ? 443 : -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static o0000Oo.o00Oo0 OooOO0(javax.net.ssl.SSLSession r6) {
        /*
            o0000.o0OoOo0 r0 = o0000.o0OoOo0.f3970OooO00o
            java.lang.String r1 = r6.getCipherSuite()
            if (r1 == 0) goto L7e
            java.lang.String r2 = "TLS_NULL_WITH_NULL_NULL"
            boolean r2 = o0000O00.OooO00o.OooOOO0(r1, r2)
            if (r2 == 0) goto L12
            r2 = 1
            goto L18
        L12:
            java.lang.String r2 = "SSL_NULL_WITH_NULL_NULL"
            boolean r2 = o0000O00.OooO00o.OooOOO0(r1, r2)
        L18:
            if (r2 != 0) goto L72
            o0000Oo.OooOOOO r2 = o0000Oo.OooOo00.f4201OooO0O0
            o0000Oo.OooOo00 r1 = r2.OooO0oo(r1)
            java.lang.String r2 = r6.getProtocol()
            if (r2 == 0) goto L66
            java.lang.String r3 = "NONE"
            boolean r3 = o0000O00.OooO00o.OooOOO0(r3, r2)
            if (r3 != 0) goto L5e
            o0000Oo.o0000Ooo r2 = OooO(r2)
            java.security.cert.Certificate[] r3 = r6.getPeerCertificates()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L42
            if (r3 == 0) goto L42
            int r4 = r3.length     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L42
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L42
            java.util.List r3 = o0000OoO.OooOO0O.OooOO0O(r3)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L42
            goto L43
        L42:
            r3 = r0
        L43:
            o0000Oo.o00Oo0 r4 = new o0000Oo.o00Oo0
            java.security.cert.Certificate[] r6 = r6.getLocalCertificates()
            if (r6 == 0) goto L54
            int r0 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
            java.util.List r0 = o0000OoO.OooOO0O.OooOO0O(r6)
        L54:
            androidx.lifecycle.o0000 r6 = new androidx.lifecycle.o0000
            r5 = 2
            r6.<init>(r5, r3)
            r4.<init>(r2, r1, r0, r6)
            return r4
        L5e:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "tlsVersion == NONE"
            r6.<init>(r0)
            throw r6
        L66:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "tlsVersion == null"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L72:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "cipherSuite == "
            java.lang.String r0 = r0.concat(r1)
            r6.<init>(r0)
            throw r6
        L7e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "cipherSuite == null"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o0000Oo.OooOOOO.OooOO0(javax.net.ssl.SSLSession):o0000Oo.o00Oo0");
    }

    public static o0Oo0oo OooOO0O(String str) {
        OooO00o.OooOoo0(str, "<this>");
        Matcher matcher = o0Oo0oo.f4335OooO0OO.matcher(str);
        if (matcher.lookingAt()) {
            String group = matcher.group(1);
            OooO00o.OooOoOO(group, "typeSubtype.group(1)");
            Locale locale = Locale.US;
            OooO00o.OooOoOO(locale, "US");
            OooO00o.OooOoOO(group.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
            String group2 = matcher.group(2);
            OooO00o.OooOoOO(group2, "typeSubtype.group(2)");
            OooO00o.OooOoOO(group2.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = o0Oo0oo.f4336OooO0Oo.matcher(str);
            for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
                matcher2.region(end, str.length());
                if (matcher2.lookingAt()) {
                    String group3 = matcher2.group(1);
                    if (group3 != null) {
                        String group4 = matcher2.group(2);
                        if (group4 == null) {
                            group4 = matcher2.group(3);
                        } else if (o0000Oo0.OooOOOO.o00O0o(group4, "'", false) && group4.endsWith("'") && group4.length() > 2) {
                            group4 = group4.substring(1, group4.length() - 1);
                            OooO00o.OooOoOO(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                        }
                        arrayList.add(group3);
                        arrayList.add(group4);
                    }
                } else {
                    StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                    String substring = str.substring(end);
                    OooO00o.OooOoOO(substring, "this as java.lang.String).substring(startIndex)");
                    sb.append(substring);
                    sb.append("\" for: \"");
                    sb.append(str);
                    sb.append('\"');
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
            return new o0Oo0oo(str, (String[]) arrayList.toArray(new String[0]));
        }
        throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
    }

    public static o0O0O00 OooOO0o(String str) {
        o0O0O00 o0o0o00 = o0O0O00.f4299OooO0O0;
        if (!OooO00o.OooOOO0(str, "http/1.0")) {
            o0o0o00 = o0O0O00.f4300OooO0OO;
            if (!OooO00o.OooOOO0(str, "http/1.1")) {
                o0o0o00 = o0O0O00.f4302OooO0o;
                if (!OooO00o.OooOOO0(str, "h2_prior_knowledge")) {
                    o0o0o00 = o0O0O00.f4303OooO0o0;
                    if (!OooO00o.OooOOO0(str, "h2")) {
                        o0o0o00 = o0O0O00.f4301OooO0Oo;
                        if (!OooO00o.OooOOO0(str, "spdy/3.1")) {
                            o0o0o00 = o0O0O00.f4304OooO0oO;
                            if (!OooO00o.OooOOO0(str, "quic")) {
                                throw new IOException("Unexpected protocol: ".concat(str));
                            }
                        }
                    }
                }
            }
        }
        return o0o0o00;
    }

    public static boolean OooOOO(String str) {
        return (o0000Oo0.OooOOOO.oo0o0O0("Connection", str) || o0000Oo0.OooOOOO.oo0o0O0("Keep-Alive", str) || o0000Oo0.OooOOOO.oo0o0O0("Proxy-Authenticate", str) || o0000Oo0.OooOOOO.oo0o0O0("Proxy-Authorization", str) || o0000Oo0.OooOOOO.oo0o0O0("TE", str) || o0000Oo0.OooOOOO.oo0o0O0("Trailers", str) || o0000Oo0.OooOOOO.oo0o0O0("Transfer-Encoding", str) || o0000Oo0.OooOOOO.oo0o0O0("Upgrade", str)) ? false : true;
    }

    public static boolean OooOOOO(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && o0000OoO.OooOO0O.OooOOo0(str.charAt(i + 1)) != -1 && o0000OoO.OooOO0O.OooOOo0(str.charAt(i3)) != -1;
    }

    public static int OooOOOo(int i, int i2, int i3) {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        throw new IOException("PROTOCOL_ERROR padding " + i3 + " > remaining length " + i);
    }

    public static o0000o.OooOo OooOOo(String str) {
        int i;
        String str2;
        OooO00o.OooOoo0(str, "statusLine");
        boolean o00O0o = o0000Oo0.OooOOOO.o00O0o(str, "HTTP/1.", false);
        o0O0O00 o0o0o00 = o0O0O00.f4299OooO0O0;
        if (o00O0o) {
            i = 9;
            if (str.length() >= 9 && str.charAt(8) == ' ') {
                int charAt = str.charAt(7) - '0';
                if (charAt != 0) {
                    if (charAt == 1) {
                        o0o0o00 = o0O0O00.f4300OooO0OO;
                    } else {
                        throw new ProtocolException("Unexpected status line: ".concat(str));
                    }
                }
            } else {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
        } else if (o0000Oo0.OooOOOO.o00O0o(str, "ICY ", false)) {
            i = 4;
        } else {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int i2 = i + 3;
        if (str.length() >= i2) {
            try {
                String substring = str.substring(i, i2);
                OooO00o.OooOoOO(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                int parseInt = Integer.parseInt(substring);
                if (str.length() > i2) {
                    if (str.charAt(i2) == ' ') {
                        str2 = str.substring(i + 4);
                        OooO00o.OooOoOO(str2, "this as java.lang.String).substring(startIndex)");
                    } else {
                        throw new ProtocolException("Unexpected status line: ".concat(str));
                    }
                } else {
                    str2 = "";
                }
                return new o0000o.OooOo(o0o0o00, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
        }
        throw new ProtocolException("Unexpected status line: ".concat(str));
    }

    public static oo000o OooOOo0(String... strArr) {
        int i = 0;
        if (strArr.length % 2 == 0) {
            String[] strArr2 = (String[]) strArr.clone();
            int length = strArr2.length;
            for (int i2 = 0; i2 < length; i2++) {
                String str = strArr2[i2];
                if (!(str != null)) {
                    throw new IllegalArgumentException("Headers cannot be null".toString());
                }
                strArr2[i2] = o0000Oo0.OooOOOO.o00O0oOo(str).toString();
            }
            int o00000O2 = OooO00o.o00000O(0, strArr2.length - 1, 2);
            if (o00000O2 >= 0) {
                while (true) {
                    String str2 = strArr2[i];
                    String str3 = strArr2[i + 1];
                    OooO0Oo(str2);
                    OooO0o0(str3, str2);
                    if (i == o00000O2) {
                        break;
                    }
                    i += 2;
                }
            }
            return new oo000o(strArr2);
        }
        throw new IllegalArgumentException("Expected alternating header names and values".toString());
    }

    public static long OooOOoo(String str, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int OooO0o2 = OooO0o(str, 0, i, false);
        Matcher matcher = Oooo0.OooOOO0.matcher(str);
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        while (OooO0o2 < i) {
            int OooO0o3 = OooO0o(str, OooO0o2 + 1, i, true);
            matcher.region(OooO0o2, OooO0o3);
            if (i3 == -1 && matcher.usePattern(Oooo0.OooOOO0).matches()) {
                String group = matcher.group(1);
                OooO00o.OooOoOO(group, "matcher.group(1)");
                i3 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                OooO00o.OooOoOO(group2, "matcher.group(2)");
                i6 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                OooO00o.OooOoOO(group3, "matcher.group(3)");
                i7 = Integer.parseInt(group3);
            } else if (i4 == -1 && matcher.usePattern(Oooo0.f4221OooOO0o).matches()) {
                String group4 = matcher.group(1);
                OooO00o.OooOoOO(group4, "matcher.group(1)");
                i4 = Integer.parseInt(group4);
            } else {
                if (i5 == -1) {
                    Pattern pattern = Oooo0.f4220OooOO0O;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        OooO00o.OooOoOO(group5, "matcher.group(1)");
                        Locale locale = Locale.US;
                        OooO00o.OooOoOO(locale, "US");
                        String lowerCase = group5.toLowerCase(locale);
                        OooO00o.OooOoOO(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        String pattern2 = pattern.pattern();
                        OooO00o.OooOoOO(pattern2, "MONTH_PATTERN.pattern()");
                        i5 = o0000Oo0.OooOOOO.o00O0OOO(0, pattern2, lowerCase, false) / 4;
                    }
                }
                if (i2 == -1 && matcher.usePattern(Oooo0.f4219OooOO0).matches()) {
                    String group6 = matcher.group(1);
                    OooO00o.OooOoOO(group6, "matcher.group(1)");
                    i2 = Integer.parseInt(group6);
                }
            }
            OooO0o2 = OooO0o(str, OooO0o3 + 1, i, false);
        }
        if (70 <= i2 && i2 < 100) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2 += 1900;
        }
        if (i2 >= 0 && i2 < 70) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            i2 += 2000;
        }
        if (i2 >= 1601) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            if (i5 != -1) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                if (1 <= i4 && i4 < 32) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    if (i3 >= 0 && i3 < 24) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (z6) {
                        if (i6 >= 0 && i6 < 60) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (z7) {
                            if (i7 >= 0 && i7 < 60) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            if (z8) {
                                GregorianCalendar gregorianCalendar = new GregorianCalendar(o0000OoO.OooOO0O.f4408OooO0o0);
                                gregorianCalendar.setLenient(false);
                                gregorianCalendar.set(1, i2);
                                gregorianCalendar.set(2, i5 - 1);
                                gregorianCalendar.set(5, i4);
                                gregorianCalendar.set(11, i3);
                                gregorianCalendar.set(12, i6);
                                gregorianCalendar.set(13, i7);
                                gregorianCalendar.set(14, 0);
                                return gregorianCalendar.getTimeInMillis();
                            }
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static ArrayList OooOo0(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int o00O0OOo = o0000Oo0.OooOOOO.o00O0OOo(str, '&', i, false, 4);
            if (o00O0OOo == -1) {
                o00O0OOo = str.length();
            }
            int o00O0OOo2 = o0000Oo0.OooOOOO.o00O0OOo(str, '=', i, false, 4);
            if (o00O0OOo2 == -1 || o00O0OOo2 > o00O0OOo) {
                String substring = str.substring(i, o00O0OOo);
                OooO00o.OooOoOO(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring);
                str2 = null;
            } else {
                String substring2 = str.substring(i, o00O0OOo2);
                OooO00o.OooOoOO(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring2);
                str2 = str.substring(o00O0OOo2 + 1, o00O0OOo);
                OooO00o.OooOoOO(str2, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            arrayList.add(str2);
            i = o00O0OOo + 1;
        }
        return arrayList;
    }

    public static String OooOo00(String str, int i, int i2, boolean z, int i3) {
        int i4;
        char[] cArr = o0ooOOo.f4343OooOO0;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        OooO00o.OooOoo0(str, "<this>");
        int i5 = i;
        while (i5 < i2) {
            char charAt = str.charAt(i5);
            if (charAt != '%' && (charAt != '+' || !z)) {
                i5++;
            } else {
                o000O000.OooOO0 oooOO0 = new o000O000.OooOO0();
                oooOO0.Oooo0o(str, i, i5);
                while (i5 < i2) {
                    int codePointAt = str.codePointAt(i5);
                    if (codePointAt == 37 && (i4 = i5 + 2) < i2) {
                        int OooOOo02 = o0000OoO.OooOO0O.OooOOo0(str.charAt(i5 + 1));
                        int OooOOo03 = o0000OoO.OooOO0O.OooOOo0(str.charAt(i4));
                        if (OooOOo02 != -1 && OooOOo03 != -1) {
                            oooOO0.Oooo00o((OooOOo02 << 4) + OooOOo03);
                            i5 = Character.charCount(codePointAt) + i4;
                        }
                        oooOO0.Oooo0oO(codePointAt);
                        i5 += Character.charCount(codePointAt);
                    } else {
                        if (codePointAt == 43 && z) {
                            oooOO0.Oooo00o(32);
                            i5++;
                        }
                        oooOO0.Oooo0oO(codePointAt);
                        i5 += Character.charCount(codePointAt);
                    }
                }
                return oooOO0.OooOoo0(oooOO0.f4823OooO0O0, o0000Oo0.OooO0O0.f4385OooO00o);
            }
        }
        String substring = str.substring(i, i2);
        OooO00o.OooOoOO(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final synchronized OooOo00 OooO0oo(String str) {
        OooOo00 oooOo00;
        String str2;
        OooO00o.OooOoo0(str, "javaName");
        LinkedHashMap linkedHashMap = OooOo00.f4203OooO0Oo;
        oooOo00 = (OooOo00) linkedHashMap.get(str);
        if (oooOo00 == null) {
            if (o0000Oo0.OooOOOO.o00O0o(str, "TLS_", false)) {
                String substring = str.substring(4);
                OooO00o.OooOoOO(substring, "this as java.lang.String).substring(startIndex)");
                str2 = "SSL_".concat(substring);
            } else if (o0000Oo0.OooOOOO.o00O0o(str, "SSL_", false)) {
                String substring2 = str.substring(4);
                OooO00o.OooOoOO(substring2, "this as java.lang.String).substring(startIndex)");
                str2 = "TLS_".concat(substring2);
            } else {
                str2 = str;
            }
            oooOo00 = (OooOo00) linkedHashMap.get(str2);
            if (oooOo00 == null) {
                oooOo00 = new OooOo00(str);
            }
            linkedHashMap.put(str, oooOo00);
        }
        return oooOo00;
    }

    public final Logger OooOOO0() {
        switch (this.f4195OooO00o) {
            case 16:
                return o0000o0O.o000000.f4456OooOO0;
            default:
                return o0000oOO.o00000O.f4660OooO0o;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OooOOOO(int i, int i2) {
        this(29);
        this.f4195OooO00o = i;
        switch (i) {
            case 1:
                this(1);
                return;
            case 2:
                this(2);
                return;
            case 3:
                this(3);
                return;
            case 4:
                this(4);
                return;
            case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                this(5);
                return;
            case 6:
                this(6);
                return;
            case 7:
                this(7);
                return;
            case 8:
                this(8);
                return;
            case 9:
                this(9);
                return;
            case 10:
                this(10);
                return;
            case 11:
                this(11);
                return;
            case 12:
                this(12);
                return;
            case 13:
                this(13);
                return;
            case 14:
                this(14);
                return;
            case 15:
                this(15);
                return;
            case 16:
                this(16);
                return;
            case 17:
                this(17);
                return;
            case 18:
                this(18);
                return;
            case 19:
                this(19);
                return;
            case 20:
                this(20);
                return;
            case 21:
                this(21);
                return;
            case 22:
                this(22);
                return;
            case 23:
                this(23);
                return;
            case 24:
                this(24);
                return;
            case 25:
                this(25);
                return;
            case 26:
                this(26);
                return;
            case 27:
                this(27);
                return;
            case 28:
                this(28);
                return;
            case 29:
                return;
            default:
                this(0);
                return;
        }
    }
}