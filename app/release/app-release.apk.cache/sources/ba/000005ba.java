package o0000Oo0;

import o0000O00.OooO00o;

/* loaded from: classes.dex */
public abstract class OooOo00 extends OooOOOO {
    public static final String o00O0oo0(String str, int i) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String substring = str.substring(0, i);
        OooO00o.OooOoOO(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}