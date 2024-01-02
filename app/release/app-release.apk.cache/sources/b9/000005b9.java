package o0000Oo0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public abstract class OooOOOO extends OooOOO0 {
    public static boolean o00O0O0o(CharSequence charSequence, String str) {
        OooO00o.OooOoo0(charSequence, "<this>");
        if (o00O0OOO(0, charSequence, str, false) < 0) {
            return false;
        }
        return true;
    }

    public static final int o00O0OO(CharSequence charSequence) {
        OooO00o.OooOoo0(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static boolean o00O0OO0(String str, String str2) {
        OooO00o.OooOoo0(str, "<this>");
        return str.endsWith(str2);
    }

    /* JADX WARN: Incorrect condition in loop: B:21:0x004b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int o00O0OOO(int r9, java.lang.CharSequence r10, java.lang.String r11, boolean r12) {
        /*
            java.lang.String r0 = "<this>"
            o0000O00.OooO00o.OooOoo0(r10, r0)
            java.lang.String r0 = "string"
            o0000O00.OooO00o.OooOoo0(r11, r0)
            if (r12 != 0) goto L19
            boolean r0 = r10 instanceof java.lang.String
            if (r0 != 0) goto L11
            goto L19
        L11:
            java.lang.String r10 = (java.lang.String) r10
            int r9 = r10.indexOf(r11, r9)
            goto L6f
        L19:
            int r0 = r10.length()
            o0000OO.OooO0OO r1 = new o0000OO.OooO0OO
            if (r9 >= 0) goto L22
            r9 = 0
        L22:
            int r2 = r10.length()
            if (r0 <= r2) goto L29
            r0 = r2
        L29:
            r1.<init>(r9, r0)
            boolean r0 = r10 instanceof java.lang.String
            int r2 = r1.f4158OooO0OO
            int r1 = r1.f4157OooO0O0
            if (r0 == 0) goto L52
            if (r2 <= 0) goto L38
            if (r9 <= r1) goto L3c
        L38:
            if (r2 >= 0) goto L6e
            if (r1 > r9) goto L6e
        L3c:
            r3 = 0
            r7 = r10
            java.lang.String r7 = (java.lang.String) r7
            int r5 = r11.length()
            r4 = r9
            r6 = r11
            r8 = r12
            boolean r0 = o00O0OoO(r3, r4, r5, r6, r7, r8)
            if (r0 == 0) goto L4e
            goto L6f
        L4e:
            if (r9 == r1) goto L6e
            int r9 = r9 + r2
            goto L3c
        L52:
            if (r2 <= 0) goto L56
            if (r9 <= r1) goto L5a
        L56:
            if (r2 >= 0) goto L6e
            if (r1 > r9) goto L6e
        L5a:
            r4 = 0
            int r7 = r11.length()
            r3 = r11
            r5 = r10
            r6 = r9
            r8 = r12
            boolean r0 = o00O0Ooo(r3, r4, r5, r6, r7, r8)
            if (r0 == 0) goto L6a
            goto L6f
        L6a:
            if (r9 == r1) goto L6e
            int r9 = r9 + r2
            goto L5a
        L6e:
            r9 = -1
        L6f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o0000Oo0.OooOOOO.o00O0OOO(int, java.lang.CharSequence, java.lang.String, boolean):int");
    }

    public static int o00O0OOo(CharSequence charSequence, char c, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        OooO00o.OooOoo0(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        return o00O0Oo0(i, charSequence, z, new char[]{c});
    }

    public static int o00O0Oo(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = o00O0OO(charSequence);
        }
        OooO00o.OooOoo0(charSequence, "<this>");
        if (!(charSequence instanceof String)) {
            char[] cArr = {c};
            if (charSequence instanceof String) {
                return ((String) charSequence).lastIndexOf(o0000.OooOOOO.o00O0OOo(cArr), i);
            }
            int o00O0OO = o00O0OO(charSequence);
            if (i > o00O0OO) {
                i = o00O0OO;
            }
            while (-1 < i) {
                if (OooO00o.o0OoOo0(cArr[0], charSequence.charAt(i), false)) {
                    return i;
                }
                i--;
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(c, i);
    }

    public static final int o00O0Oo0(int i, CharSequence charSequence, boolean z, char[] cArr) {
        boolean z2;
        int i2;
        boolean z3;
        OooO00o.OooOoo0(charSequence, "<this>");
        OooO00o.OooOoo0(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(o0000.OooOOOO.o00O0OOo(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        o0000OO.OooO0OO oooO0OO = new o0000OO.OooO0OO(i, o00O0OO(charSequence));
        int i3 = oooO0OO.f4157OooO0O0;
        int i4 = oooO0OO.f4158OooO0OO;
        if (i4 <= 0 ? i >= i3 : i <= i3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            i = i3;
        }
        while (z2) {
            if (i == i3) {
                if (z2) {
                    i2 = i;
                    z2 = false;
                } else {
                    throw new NoSuchElementException();
                }
            } else {
                i2 = i4 + i;
            }
            char charAt = charSequence.charAt(i);
            int length = cArr.length;
            int i5 = 0;
            while (true) {
                if (i5 < length) {
                    if (OooO00o.o0OoOo0(cArr[i5], charAt, z)) {
                        z3 = true;
                        break;
                    }
                    i5++;
                } else {
                    z3 = false;
                    break;
                }
            }
            if (z3) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    public static final boolean o00O0OoO(int i, int i2, int i3, String str, String str2, boolean z) {
        OooO00o.OooOoo0(str, "<this>");
        OooO00o.OooOoo0(str2, "other");
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    public static final boolean o00O0Ooo(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        OooO00o.OooOoo0(charSequence, "<this>");
        OooO00o.OooOoo0(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!OooO00o.o0OoOo0(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean o00O0o(String str, String str2, boolean z) {
        OooO00o.OooOoo0(str, "<this>");
        OooO00o.OooOoo0(str2, "prefix");
        return !z ? str.startsWith(str2) : o00O0OoO(0, 0, str2.length(), str, str2, z);
    }

    public static final void o00O0o0(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(OooO0O0.OooO00o.OooO0O0("Limit must be non-negative, but was ", i).toString());
    }

    public static final String o00O0o00(String str, String str2) {
        if (o00O0o(str2, str, false)) {
            String substring = str2.substring(str.length());
            OooO00o.OooOoOO(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        return str2;
    }

    public static List o00O0o0O(CharSequence charSequence, char[] cArr) {
        OooO00o.OooOoo0(charSequence, "<this>");
        if (cArr.length == 1) {
            String valueOf = String.valueOf(cArr[0]);
            o00O0o0(0);
            int o00O0OOO = o00O0OOO(0, charSequence, valueOf, false);
            if (o00O0OOO != -1) {
                ArrayList arrayList = new ArrayList(10);
                int i = 0;
                do {
                    arrayList.add(charSequence.subSequence(i, o00O0OOO).toString());
                    i = valueOf.length() + o00O0OOO;
                    o00O0OOO = o00O0OOO(i, charSequence, valueOf, false);
                } while (o00O0OOO != -1);
                arrayList.add(charSequence.subSequence(i, charSequence.length()).toString());
                return arrayList;
            }
            return OooO00o.o0000Oo(charSequence.toString());
        }
        o00O0o0(0);
        o0000OOo.OooO oooO = new o0000OOo.OooO(new OooO0o(charSequence, 0, 0, new OooOOO(cArr, false, 0)));
        ArrayList arrayList2 = new ArrayList(o0000.OooOOOO.o00O0O0o(oooO));
        Iterator it = oooO.iterator();
        while (it.hasNext()) {
            arrayList2.add(o00O0oO(charSequence, (o0000OO.OooO0OO) it.next()));
        }
        return arrayList2;
    }

    public static final boolean o00O0o0o(String str, String str2, int i, boolean z) {
        OooO00o.OooOoo0(str, "<this>");
        return !z ? str.startsWith(str2, i) : o00O0OoO(i, 0, str2.length(), str, str2, z);
    }

    public static final String o00O0oO(CharSequence charSequence, o0000OO.OooO0OO oooO0OO) {
        OooO00o.OooOoo0(charSequence, "<this>");
        OooO00o.OooOoo0(oooO0OO, "range");
        return charSequence.subSequence(Integer.valueOf(oooO0OO.f4156OooO00o).intValue(), Integer.valueOf(oooO0OO.f4157OooO0O0).intValue() + 1).toString();
    }

    public static String o00O0oOO(String str) {
        OooO00o.OooOoo0(str, "<this>");
        OooO00o.OooOoo0(str, "missingDelimiterValue");
        int o00O0Oo = o00O0Oo(str, '.', 0, 6);
        if (o00O0Oo != -1) {
            String substring = str.substring(o00O0Oo + 1, str.length());
            OooO00o.OooOoOO(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str;
    }

    public static final CharSequence o00O0oOo(CharSequence charSequence) {
        OooO00o.OooOoo0(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean o0000OO2 = OooO00o.o0000OO(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!o0000OO2) {
                    break;
                }
                length--;
            } else if (o0000OO2) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static String o00oOOo(String str, String str2, String str3) {
        OooO00o.OooOoo0(str, "<this>");
        int o00O0OOO = o00O0OOO(0, str, str2, false);
        if (o00O0OOO >= 0) {
            int length = str2.length();
            int i = 1;
            if (length >= 1) {
                i = length;
            }
            int length2 = str3.length() + (str.length() - length);
            if (length2 >= 0) {
                StringBuilder sb = new StringBuilder(length2);
                int i2 = 0;
                do {
                    sb.append((CharSequence) str, i2, o00O0OOO);
                    sb.append(str3);
                    i2 = o00O0OOO + length;
                    if (o00O0OOO >= str.length()) {
                        break;
                    }
                    o00O0OOO = o00O0OOO(o00O0OOO + i, str, str2, false);
                } while (o00O0OOO > 0);
                sb.append((CharSequence) str, i2, str.length());
                String sb2 = sb.toString();
                OooO00o.OooOoOO(sb2, "stringBuilder.append(this, i, length).toString()");
                return sb2;
            }
            throw new OutOfMemoryError();
        }
        return str;
    }

    public static final boolean oo0o0O0(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    public static final boolean oo0oOO0(String str) {
        boolean z;
        OooO00o.OooOoo0(str, "<this>");
        if (str.length() == 0) {
            return true;
        }
        o0000OO.OooO0OO oooO0OO = new o0000OO.OooO0OO(0, str.length() - 1);
        if (!(oooO0OO instanceof Collection) || !((Collection) oooO0OO).isEmpty()) {
            Iterator it = oooO0OO.iterator();
            while (((o0000OO.OooO0O0) it).f4161OooO0OO) {
                if (!OooO00o.o0000OO(str.charAt(((o0000OO.OooO0O0) it).OooO0O0()))) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (z) {
            return true;
        }
        return false;
    }
}