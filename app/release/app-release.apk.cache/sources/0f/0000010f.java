package OooOoo;

import android.text.SpannableStringBuilder;

/* loaded from: classes.dex */
public final class o00O0O {

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public static final String f1211OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public static final o00O0O f1212OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public static final String f1213OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public static final o00O0O f1214OooO0oO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final boolean f1215OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final int f1216OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final o0Oo0oo f1217OooO0OO;

    static {
        o0OO00O o0oo00o = oo0o0Oo.f1236OooO0OO;
        f1211OooO0Oo = Character.toString((char) 8206);
        f1213OooO0o0 = Character.toString((char) 8207);
        f1212OooO0o = new o00O0O(false, 2, o0oo00o);
        f1214OooO0oO = new o00O0O(true, 2, o0oo00o);
    }

    public o00O0O(boolean z, int i, o0OO00O o0oo00o) {
        this.f1215OooO00o = z;
        this.f1216OooO0O0 = i;
        this.f1217OooO0OO = o0oo00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
        if (r1 != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
        if (r2 == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0077, code lost:
        if (r0.f1223OooO0OO <= 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007d, code lost:
        switch(r0.OooO00o()) {
            case 14: goto L64;
            case 15: goto L64;
            case 16: goto L59;
            case 17: goto L59;
            case 18: goto L55;
            default: goto L67;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0081, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0084, code lost:
        if (r1 != r3) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0088, code lost:
        if (r1 != r3) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008c, code lost:
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008f, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:?, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:?, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:?, code lost:
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int OooO00o(java.lang.CharSequence r9) {
        /*
            OooOoo.o0OoOo0 r0 = new OooOoo.o0OoOo0
            r0.<init>(r9)
            r9 = 0
            r0.f1223OooO0OO = r9
            r1 = r9
            r2 = r1
            r3 = r2
        Lb:
            int r4 = r0.f1223OooO0OO
            int r5 = r0.f1222OooO0O0
            r6 = -1
            r7 = 1
            if (r4 >= r5) goto L6e
            if (r1 != 0) goto L6e
            java.lang.CharSequence r5 = r0.f1221OooO00o
            char r4 = r5.charAt(r4)
            r0.f1224OooO0Oo = r4
            boolean r4 = java.lang.Character.isHighSurrogate(r4)
            if (r4 == 0) goto L37
            int r4 = r0.f1223OooO0OO
            int r4 = java.lang.Character.codePointAt(r5, r4)
            int r5 = r0.f1223OooO0OO
            int r8 = java.lang.Character.charCount(r4)
            int r8 = r8 + r5
            r0.f1223OooO0OO = r8
            byte r4 = java.lang.Character.getDirectionality(r4)
            goto L4b
        L37:
            int r4 = r0.f1223OooO0OO
            int r4 = r4 + r7
            r0.f1223OooO0OO = r4
            char r4 = r0.f1224OooO0Oo
            r5 = 1792(0x700, float:2.511E-42)
            if (r4 >= r5) goto L47
            byte[] r5 = OooOoo.o0OoOo0.f1220OooO0o0
            r4 = r5[r4]
            goto L4b
        L47:
            byte r4 = java.lang.Character.getDirectionality(r4)
        L4b:
            if (r4 == 0) goto L69
            if (r4 == r7) goto L66
            r5 = 2
            if (r4 == r5) goto L66
            r5 = 9
            if (r4 == r5) goto Lb
            switch(r4) {
                case 14: goto L62;
                case 15: goto L62;
                case 16: goto L5e;
                case 17: goto L5e;
                case 18: goto L5a;
                default: goto L59;
            }
        L59:
            goto L6c
        L5a:
            int r3 = r3 + (-1)
            r2 = r9
            goto Lb
        L5e:
            int r3 = r3 + 1
            r2 = r7
            goto Lb
        L62:
            int r3 = r3 + 1
            r2 = r6
            goto Lb
        L66:
            if (r3 != 0) goto L6c
            goto L86
        L69:
            if (r3 != 0) goto L6c
            goto L8a
        L6c:
            r1 = r3
            goto Lb
        L6e:
            if (r1 != 0) goto L71
            goto L8f
        L71:
            if (r2 == 0) goto L75
            r9 = r2
            goto L8f
        L75:
            int r2 = r0.f1223OooO0OO
            if (r2 <= 0) goto L8f
            byte r2 = r0.OooO00o()
            switch(r2) {
                case 14: goto L88;
                case 15: goto L88;
                case 16: goto L84;
                case 17: goto L84;
                case 18: goto L81;
                default: goto L80;
            }
        L80:
            goto L75
        L81:
            int r3 = r3 + 1
            goto L75
        L84:
            if (r1 != r3) goto L8c
        L86:
            r9 = r7
            goto L8f
        L88:
            if (r1 != r3) goto L8c
        L8a:
            r9 = r6
            goto L8f
        L8c:
            int r3 = r3 + (-1)
            goto L75
        L8f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: OooOoo.o00O0O.OooO00o(java.lang.CharSequence):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0041, code lost:
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int OooO0O0(java.lang.CharSequence r6) {
        /*
            OooOoo.o0OoOo0 r0 = new OooOoo.o0OoOo0
            r0.<init>(r6)
            int r6 = r0.f1222OooO0O0
            r0.f1223OooO0OO = r6
            r6 = 0
            r1 = r6
        Lb:
            r2 = r1
        Lc:
            int r3 = r0.f1223OooO0OO
            if (r3 <= 0) goto L41
            byte r3 = r0.OooO00o()
            if (r3 == 0) goto L39
            r4 = 1
            if (r3 == r4) goto L32
            r5 = 2
            if (r3 == r5) goto L32
            r5 = 9
            if (r3 == r5) goto Lc
            switch(r3) {
                case 14: goto L2c;
                case 15: goto L2c;
                case 16: goto L29;
                case 17: goto L29;
                case 18: goto L26;
                default: goto L23;
            }
        L23:
            if (r1 != 0) goto Lc
            goto L3f
        L26:
            int r2 = r2 + 1
            goto Lc
        L29:
            if (r1 != r2) goto L2f
            goto L34
        L2c:
            if (r1 != r2) goto L2f
            goto L3b
        L2f:
            int r2 = r2 + (-1)
            goto Lc
        L32:
            if (r2 != 0) goto L36
        L34:
            r6 = r4
            goto L41
        L36:
            if (r1 != 0) goto Lc
            goto L3f
        L39:
            if (r2 != 0) goto L3d
        L3b:
            r6 = -1
            goto L41
        L3d:
            if (r1 != 0) goto Lc
        L3f:
            r1 = r2
            goto Lb
        L41:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: OooOoo.o00O0O.OooO0O0(java.lang.CharSequence):int");
    }

    public final SpannableStringBuilder OooO0OO(CharSequence charSequence, o0Oo0oo o0oo0oo) {
        boolean z;
        o0OO00O o0oo00o;
        char c;
        o0OO00O o0oo00o2;
        String str;
        if (charSequence == null) {
            return null;
        }
        boolean OooO0OO2 = o0oo0oo.OooO0OO(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if ((this.f1216OooO0O0 & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        String str2 = f1213OooO0o0;
        String str3 = f1211OooO0Oo;
        boolean z2 = this.f1215OooO00o;
        if (z) {
            if (OooO0OO2) {
                o0oo00o2 = oo0o0Oo.f1235OooO0O0;
            } else {
                o0oo00o2 = oo0o0Oo.f1234OooO00o;
            }
            boolean OooO0OO3 = o0oo00o2.OooO0OO(charSequence, charSequence.length());
            if (!z2 && (OooO0OO3 || OooO00o(charSequence) == 1)) {
                str = str3;
            } else if (!z2 || (OooO0OO3 && OooO00o(charSequence) != -1)) {
                str = "";
            } else {
                str = str2;
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        if (OooO0OO2 != z2) {
            if (OooO0OO2) {
                c = 8235;
            } else {
                c = 8234;
            }
            spannableStringBuilder.append(c);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (OooO0OO2) {
            o0oo00o = oo0o0Oo.f1235OooO0O0;
        } else {
            o0oo00o = oo0o0Oo.f1234OooO00o;
        }
        boolean OooO0OO4 = o0oo00o.OooO0OO(charSequence, charSequence.length());
        if (!z2 && (OooO0OO4 || OooO0O0(charSequence) == 1)) {
            str2 = str3;
        } else if (!z2 || (OooO0OO4 && OooO0O0(charSequence) != -1)) {
            str2 = "";
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}