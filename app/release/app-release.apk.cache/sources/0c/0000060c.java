package o0000oOo;

import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public abstract class o000O00 {
    public static boolean OooO00o() {
        Conscrypt.Version version = Conscrypt.version();
        return version.major() != 2 ? version.major() > 2 : version.minor() != 1 ? version.minor() > 1 : version.patch() >= 0;
    }

    public static boolean OooO0O0() {
        return o000O0.f4759OooO0Oo;
    }
}