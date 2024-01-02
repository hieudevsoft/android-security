package o0000Oo;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class o0ooOOo {

    /* renamed from: OooOO0  reason: collision with root package name */
    public static final char[] f4343OooOO0;

    /* renamed from: OooO  reason: collision with root package name */
    public final boolean f4344OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final String f4345OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final String f4346OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final String f4347OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final String f4348OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final List f4349OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final int f4350OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final String f4351OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final String f4352OooO0oo;

    static {
        new OooOOOO(7, 0);
        f4343OooOO0 = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public o0ooOOo(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.f4345OooO00o = str;
        this.f4346OooO0O0 = str2;
        this.f4347OooO0OO = str3;
        this.f4348OooO0Oo = str4;
        this.f4350OooO0o0 = i;
        this.f4349OooO0o = arrayList2;
        this.f4351OooO0oO = str5;
        this.f4352OooO0oo = str6;
        this.f4344OooO = OooO00o.OooOOO0(str, "https");
    }

    public final String OooO00o() {
        if (this.f4347OooO0OO.length() == 0) {
            return "";
        }
        String str = this.f4352OooO0oo;
        String substring = str.substring(o0000Oo0.OooOOOO.o00O0OOo(str, ':', this.f4345OooO00o.length() + 3, false, 4) + 1, o0000Oo0.OooOOOO.o00O0OOo(str, '@', 0, false, 6));
        OooO00o.OooOoOO(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String OooO0O0() {
        String str = this.f4352OooO0oo;
        int o00O0OOo = o0000Oo0.OooOOOO.o00O0OOo(str, '/', this.f4345OooO00o.length() + 3, false, 4);
        String substring = str.substring(o00O0OOo, o0000OoO.OooOO0O.OooO0o(str, "?#", o00O0OOo, str.length()));
        OooO00o.OooOoOO(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final ArrayList OooO0OO() {
        String str = this.f4352OooO0oo;
        int o00O0OOo = o0000Oo0.OooOOOO.o00O0OOo(str, '/', this.f4345OooO00o.length() + 3, false, 4);
        int OooO0o2 = o0000OoO.OooOO0O.OooO0o(str, "?#", o00O0OOo, str.length());
        ArrayList arrayList = new ArrayList();
        while (o00O0OOo < OooO0o2) {
            int i = o00O0OOo + 1;
            int OooO0o02 = o0000OoO.OooOO0O.OooO0o0(str, '/', i, OooO0o2);
            String substring = str.substring(i, OooO0o02);
            OooO00o.OooOoOO(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            o00O0OOo = OooO0o02;
        }
        return arrayList;
    }

    public final String OooO0Oo() {
        if (this.f4349OooO0o == null) {
            return null;
        }
        String str = this.f4352OooO0oo;
        int o00O0OOo = o0000Oo0.OooOOOO.o00O0OOo(str, '?', 0, false, 6) + 1;
        String substring = str.substring(o00O0OOo, o0000OoO.OooOO0O.OooO0o0(str, '#', o00O0OOo, str.length()));
        OooO00o.OooOoOO(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String OooO0o() {
        o00oO0o o00oo0o;
        try {
            o00oo0o = new o00oO0o();
            o00oo0o.OooO0OO(this, "/...");
        } catch (IllegalArgumentException unused) {
            o00oo0o = null;
        }
        OooO00o.OooOo(o00oo0o);
        o00oo0o.f4292OooO0O0 = OooOOOO.OooO0OO("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        o00oo0o.f4293OooO0OO = OooOOOO.OooO0OO("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        return o00oo0o.OooO00o().f4352OooO0oo;
    }

    public final String OooO0o0() {
        if (this.f4346OooO0O0.length() == 0) {
            return "";
        }
        int length = this.f4345OooO00o.length() + 3;
        String str = this.f4352OooO0oo;
        String substring = str.substring(length, o0000OoO.OooOO0O.OooO0o(str, ":@", length, str.length()));
        OooO00o.OooOoOO(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final URI OooO0oO() {
        String substring;
        String str;
        String str2;
        o00oO0o o00oo0o = new o00oO0o();
        String str3 = this.f4345OooO00o;
        o00oo0o.f4291OooO00o = str3;
        o00oo0o.f4292OooO0O0 = OooO0o0();
        o00oo0o.f4293OooO0OO = OooO00o();
        o00oo0o.f4294OooO0Oo = this.f4348OooO0Oo;
        int OooO0oO2 = OooOOOO.OooO0oO(str3);
        int i = this.f4350OooO0o0;
        if (i == OooO0oO2) {
            i = -1;
        }
        o00oo0o.f4296OooO0o0 = i;
        ArrayList arrayList = o00oo0o.f4295OooO0o;
        arrayList.clear();
        arrayList.addAll(OooO0OO());
        o00oo0o.OooO0O0(OooO0Oo());
        String str4 = null;
        if (this.f4351OooO0oO == null) {
            substring = null;
        } else {
            String str5 = this.f4352OooO0oo;
            substring = str5.substring(o0000Oo0.OooOOOO.o00O0OOo(str5, '#', 0, false, 6) + 1);
            OooO00o.OooOoOO(substring, "this as java.lang.String).substring(startIndex)");
        }
        o00oo0o.f4298OooO0oo = substring;
        String str6 = o00oo0o.f4294OooO0Oo;
        if (str6 != null) {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            OooO00o.OooOoOO(compile, "compile(pattern)");
            str = compile.matcher(str6).replaceAll("");
            OooO00o.OooOoOO(str, "nativePattern.matcher(in…).replaceAll(replacement)");
        } else {
            str = null;
        }
        o00oo0o.f4294OooO0Oo = str;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.set(i2, OooOOOO.OooO0OO((String) arrayList.get(i2), 0, 0, "[]", true, true, false, false, 227));
        }
        ArrayList arrayList2 = o00oo0o.f4297OooO0oO;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String str7 = (String) arrayList2.get(i3);
                if (str7 != null) {
                    str2 = OooOOOO.OooO0OO(str7, 0, 0, "\\^`{|}", true, true, true, false, 195);
                } else {
                    str2 = null;
                }
                arrayList2.set(i3, str2);
            }
        }
        String str8 = o00oo0o.f4298OooO0oo;
        if (str8 != null) {
            str4 = OooOOOO.OooO0OO(str8, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 163);
        }
        o00oo0o.f4298OooO0oo = str4;
        String o00oo0o2 = o00oo0o.toString();
        try {
            return new URI(o00oo0o2);
        } catch (URISyntaxException e) {
            try {
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                OooO00o.OooOoOO(compile2, "compile(pattern)");
                String replaceAll = compile2.matcher(o00oo0o2).replaceAll("");
                OooO00o.OooOoOO(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
                URI create = URI.create(replaceAll);
                OooO00o.OooOoOO(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o0ooOOo) && OooO00o.OooOOO0(((o0ooOOo) obj).f4352OooO0oo, this.f4352OooO0oo);
    }

    public final int hashCode() {
        return this.f4352OooO0oo.hashCode();
    }

    public final String toString() {
        return this.f4352OooO0oo;
    }
}