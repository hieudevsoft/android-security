package OooOoOO;

import java.util.Locale;

/* loaded from: classes.dex */
public final class o00000O0 {

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final o00000O0 f1206OooO0O0 = new o00000O0(new o00000OO(o00000.OooO00o(new Locale[0])));

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o00000O f1207OooO00o;

    public o00000O0(o00000OO o00000oo2) {
        this.f1207OooO00o = o00000oo2;
    }

    public static o00000O0 OooO00o(String str) {
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(",", -1);
            int length = split.length;
            Locale[] localeArr = new Locale[length];
            for (int i = 0; i < length; i++) {
                localeArr[i] = o000000O.OooO00o(split[i]);
            }
            return new o00000O0(new o00000OO(o00000.OooO00o(localeArr)));
        }
        return f1206OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o00000O0) {
            if (this.f1207OooO00o.equals(((o00000O0) obj).f1207OooO00o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f1207OooO00o.hashCode();
    }

    public final String toString() {
        return this.f1207OooO00o.toString();
    }
}