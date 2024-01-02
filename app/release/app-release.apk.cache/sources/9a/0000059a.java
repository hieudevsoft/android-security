package o0000Oo;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class Oooo0 {

    /* renamed from: OooOO0  reason: collision with root package name */
    public static final Pattern f4219OooOO0 = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: OooOO0O  reason: collision with root package name */
    public static final Pattern f4220OooOO0O = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: OooOO0o  reason: collision with root package name */
    public static final Pattern f4221OooOO0o = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern OooOOO0 = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: OooO  reason: collision with root package name */
    public final boolean f4222OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final String f4223OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final String f4224OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final long f4225OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final String f4226OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final boolean f4227OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final String f4228OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final boolean f4229OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final boolean f4230OooO0oo;

    public Oooo0(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f4223OooO00o = str;
        this.f4224OooO0O0 = str2;
        this.f4225OooO0OO = j;
        this.f4226OooO0Oo = str3;
        this.f4228OooO0o0 = str4;
        this.f4227OooO0o = z;
        this.f4229OooO0oO = z2;
        this.f4230OooO0oo = z3;
        this.f4222OooO = z4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Oooo0) {
            Oooo0 oooo0 = (Oooo0) obj;
            if (OooO00o.OooOOO0(oooo0.f4223OooO00o, this.f4223OooO00o) && OooO00o.OooOOO0(oooo0.f4224OooO0O0, this.f4224OooO0O0) && oooo0.f4225OooO0OO == this.f4225OooO0OO && OooO00o.OooOOO0(oooo0.f4226OooO0Oo, this.f4226OooO0Oo) && OooO00o.OooOOO0(oooo0.f4228OooO0o0, this.f4228OooO0o0) && oooo0.f4227OooO0o == this.f4227OooO0o && oooo0.f4229OooO0oO == this.f4229OooO0oO && oooo0.f4230OooO0oo == this.f4230OooO0oo && oooo0.f4222OooO == this.f4222OooO) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f4224OooO0O0.hashCode();
        int hashCode2 = Long.hashCode(this.f4225OooO0OO);
        int hashCode3 = this.f4226OooO0Oo.hashCode();
        int hashCode4 = this.f4228OooO0o0.hashCode();
        int hashCode5 = Boolean.hashCode(this.f4227OooO0o);
        int hashCode6 = Boolean.hashCode(this.f4229OooO0oO);
        int hashCode7 = Boolean.hashCode(this.f4230OooO0oo);
        return Boolean.hashCode(this.f4222OooO) + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.f4223OooO00o.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String format;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4223OooO00o);
        sb.append('=');
        sb.append(this.f4224OooO0O0);
        if (this.f4230OooO0oo) {
            long j = this.f4225OooO0OO;
            if (j == Long.MIN_VALUE) {
                format = "; max-age=0";
            } else {
                sb.append("; expires=");
                format = ((DateFormat) o0000o.OooOO0O.f4437OooO00o.get()).format(new Date(j));
                OooO00o.OooOoOO(format, "STANDARD_DATE_FORMAT.get().format(this)");
            }
            sb.append(format);
        }
        if (!this.f4222OooO) {
            sb.append("; domain=");
            sb.append(this.f4226OooO0Oo);
        }
        sb.append("; path=");
        sb.append(this.f4228OooO0o0);
        if (this.f4227OooO0o) {
            sb.append("; secure");
        }
        if (this.f4229OooO0oO) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        OooO00o.OooOoOO(sb2, "toString()");
        return sb2;
    }
}