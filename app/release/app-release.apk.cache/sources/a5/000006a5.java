package o0OO00O;

import OooOO0o.o0OoOo0;
import androidx.appcompat.widget.o0O0O00;
import com.google.crypto.tink.shaded.protobuf.Oooo0;
import com.google.crypto.tink.shaded.protobuf.o00000;
import com.google.crypto.tink.shaded.protobuf.o00000O;
import com.google.crypto.tink.shaded.protobuf.o00Oo0;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import o00000.o00000O0;
import o00000.o0000O;
import o00000.o0000O0O;
import o00000.o0000OO0;
import o00000.o000O00;
import o00000.o000O000;
import o00000.o000O0o;
import o00000.o000Oo0;
import o00000.o0O0ooO;
import o0000o0O.o000000;

/* loaded from: classes.dex */
public final class OooO0OO {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f5301OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final Object f5302OooO0O0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OooO0OO(int i) {
        this(TimeUnit.MINUTES);
        this.f5301OooO00o = i;
        if (i != 10) {
        } else {
            this.f5302OooO0O0 = new LinkedHashSet();
        }
    }

    public static OooO0OO OooO0O0(String str, byte[] bArr) {
        o0O0ooO o0o0ooo;
        o0000O OooOo0o2 = o0000OO0.OooOo0o();
        OooOo0o2.OooO0OO();
        o0000OO0.OooOOOo((o0000OO0) OooOo0o2.f3737OooO0O0, str);
        com.google.crypto.tink.shaded.protobuf.OooOo00 OooO0oo2 = com.google.crypto.tink.shaded.protobuf.OooOo.OooO0oo(bArr, 0, bArr.length);
        OooOo0o2.OooO0OO();
        o0000OO0.OooOOo0((o0000OO0) OooOo0o2.f3737OooO0O0, OooO0oo2);
        int OooO00o2 = o0OoOo0.OooO00o(1);
        if (OooO00o2 != 0) {
            if (OooO00o2 != 1) {
                if (OooO00o2 != 2) {
                    if (OooO00o2 == 3) {
                        o0o0ooo = o0O0ooO.CRUNCHY;
                    } else {
                        throw new IllegalArgumentException("Unknown output prefix type");
                    }
                } else {
                    o0o0ooo = o0O0ooO.RAW;
                }
            } else {
                o0o0ooo = o0O0ooO.LEGACY;
            }
        } else {
            o0o0ooo = o0O0ooO.TINK;
        }
        OooOo0o2.OooO0OO();
        o0000OO0.OooOOo((o0000OO0) OooOo0o2.f3737OooO0O0, o0o0ooo);
        return new OooO0OO(1, (o0000OO0) OooOo0o2.OooO00o());
    }

    public static final OooO0OO OooO0oO(o0O0O00 o0o0o00, OooO00o oooO00o) {
        o00000O0 OooOo002 = o00000O0.OooOo00(o0o0o00.OooO(), o00Oo0.OooO00o());
        if (OooOo002.OooOOo().size() != 0) {
            try {
                o000O00 OooOo0o2 = o000O00.OooOo0o(oooO00o.OooO0O0(OooOo002.OooOOo().OooOO0O(), new byte[0]), o00Oo0.OooO00o());
                if (OooOo0o2.OooOOoo() > 0) {
                    return new OooO0OO(2, OooOo0o2);
                }
                throw new GeneralSecurityException("empty keyset");
            } catch (o00000O unused) {
                throw new GeneralSecurityException("invalid keyset, corrupted key material");
            }
        }
        throw new GeneralSecurityException("empty keyset");
    }

    public final void OooO(int i, com.google.crypto.tink.shaded.protobuf.OooOo oooOo) {
        Oooo0 oooo0 = (Oooo0) this.f5302OooO0O0;
        oooo0.o0ooOOo(i, 2);
        oooo0.o0ooOoO(oooOo.size());
        com.google.crypto.tink.shaded.protobuf.OooOo00 oooOo00 = (com.google.crypto.tink.shaded.protobuf.OooOo00) oooOo;
        oooo0.o00Ooo(oooOo00.f3628OooO0Oo, oooOo00.OooOOO0(), oooOo00.size());
    }

    public final synchronized void OooO00o(o0000OO0 o0000oo02) {
        o000Oo0 OooO0o2 = OooO0o(o0000oo02);
        o000O000 o000o000 = (o000O000) this.f5302OooO0O0;
        o000o000.OooO0OO();
        o000O00.OooOOo0((o000O00) o000o000.f3737OooO0O0, OooO0o2);
    }

    public final synchronized OooO0OO OooO0OO() {
        o000O00 o000o00;
        o000o00 = (o000O00) ((o000O000) this.f5302OooO0O0).OooO00o();
        if (o000o00.OooOOoo() > 0) {
        } else {
            throw new GeneralSecurityException("empty keyset");
        }
        return new OooO0OO(2, o000o00);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0193 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object OooO0Oo(java.lang.Class r15) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OO00O.OooO0OO.OooO0Oo(java.lang.Class):java.lang.Object");
    }

    public final synchronized o000Oo0 OooO0o(o0000OO0 o0000oo02) {
        o0000O0O OooO0Oo2;
        int i;
        OooO0Oo2 = OooOo.OooO0Oo(o0000oo02);
        synchronized (this) {
            do {
                SecureRandom secureRandom = new SecureRandom();
                byte[] bArr = new byte[4];
                i = 0;
                while (i == 0) {
                    secureRandom.nextBytes(bArr);
                    i = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                }
            } while (OooO0o0(i));
        }
        return (o000Oo0) r1.OooO00o();
        o0O0ooO OooOo002 = o0000oo02.OooOo00();
        if (OooOo002 == o0O0ooO.UNKNOWN_PREFIX) {
            OooOo002 = o0O0ooO.TINK;
        }
        o000O0o OooOoO02 = o000Oo0.OooOoO0();
        OooOoO02.OooO0OO();
        o000Oo0.OooOOOo((o000Oo0) OooOoO02.f3737OooO0O0, OooO0Oo2);
        OooOoO02.OooO0OO();
        o000Oo0.OooOOoo((o000Oo0) OooOoO02.f3737OooO0O0, i);
        OooOoO02.OooO0OO();
        o000Oo0.OooOOo((o000Oo0) OooOoO02.f3737OooO0O0);
        OooOoO02.OooO0OO();
        o000Oo0.OooOOo0((o000Oo0) OooOoO02.f3737OooO0O0, OooOo002);
        return (o000Oo0) OooOoO02.OooO00o();
    }

    public final synchronized boolean OooO0o0(int i) {
        for (o000Oo0 o000oo0 : Collections.unmodifiableList(((o000O00) ((o000O000) this.f5302OooO0O0).f3737OooO0O0).OooOo00())) {
            if (o000oo0.OooOo0() == i) {
                return true;
            }
        }
        return false;
    }

    public final void OooO0oo(int i, boolean z) {
        Oooo0 oooo0 = (Oooo0) this.f5302OooO0O0;
        oooo0.o0ooOOo(i, 0);
        oooo0.o00Oo0(z ? (byte) 1 : (byte) 0);
    }

    public final void OooOO0(int i, double d) {
        Oooo0 oooo0 = (Oooo0) this.f5302OooO0O0;
        oooo0.getClass();
        oooo0.oo000o(i, Double.doubleToRawLongBits(d));
    }

    public final void OooOO0O(int i, int i2) {
        Oooo0 oooo0 = (Oooo0) this.f5302OooO0O0;
        oooo0.o0ooOOo(i, 0);
        oooo0.o00oO0O(i2);
    }

    public final void OooOO0o(int i, int i2) {
        ((Oooo0) this.f5302OooO0O0).o00o0O(i, i2);
    }

    public final void OooOOO(int i, float f) {
        Oooo0 oooo0 = (Oooo0) this.f5302OooO0O0;
        oooo0.getClass();
        oooo0.o00o0O(i, Float.floatToRawIntBits(f));
    }

    public final void OooOOO0(int i, long j) {
        ((Oooo0) this.f5302OooO0O0).oo000o(i, j);
    }

    public final void OooOOOO(int i, com.google.crypto.tink.shaded.protobuf.o0O0ooO o0o0ooo, Object obj) {
        Oooo0 oooo0 = (Oooo0) this.f5302OooO0O0;
        oooo0.o0ooOOo(i, 3);
        o0o0ooo.OooO0oo((com.google.crypto.tink.shaded.protobuf.OooO0O0) obj, oooo0.f3631OooO00o);
        oooo0.o0ooOOo(i, 4);
    }

    public final void OooOOOo(int i, int i2) {
        Oooo0 oooo0 = (Oooo0) this.f5302OooO0O0;
        oooo0.o0ooOOo(i, 0);
        oooo0.o00oO0O(i2);
    }

    public final void OooOOo(int i, com.google.crypto.tink.shaded.protobuf.o0O0ooO o0o0ooo, Object obj) {
        Oooo0 oooo0 = (Oooo0) this.f5302OooO0O0;
        com.google.crypto.tink.shaded.protobuf.OooO0O0 oooO0O0 = (com.google.crypto.tink.shaded.protobuf.OooO0O0) obj;
        oooo0.o0ooOOo(i, 2);
        oooo0.o0ooOoO(oooO0O0.OooO0O0(o0o0ooo));
        o0o0ooo.OooO0oo(oooO0O0, oooo0.f3631OooO00o);
    }

    public final void OooOOo0(int i, long j) {
        ((Oooo0) this.f5302OooO0O0).o0OOO0o(i, j);
    }

    public final void OooOOoo(int i, int i2) {
        ((Oooo0) this.f5302OooO0O0).o00o0O(i, i2);
    }

    public final void OooOo(int i, long j) {
        ((Oooo0) this.f5302OooO0O0).o0OOO0o(i, j);
    }

    public final void OooOo0(int i, int i2) {
        Oooo0 oooo0 = (Oooo0) this.f5302OooO0O0;
        oooo0.o0ooOOo(i, 0);
        oooo0.o0ooOoO((i2 >> 31) ^ (i2 << 1));
    }

    public final void OooOo00(int i, long j) {
        ((Oooo0) this.f5302OooO0O0).oo000o(i, j);
    }

    public final void OooOo0O(int i, long j) {
        ((Oooo0) this.f5302OooO0O0).o0OOO0o(i, (j >> 63) ^ (j << 1));
    }

    public final void OooOo0o(int i, int i2) {
        Oooo0 oooo0 = (Oooo0) this.f5302OooO0O0;
        oooo0.o0ooOOo(i, 0);
        oooo0.o0ooOoO(i2);
    }

    public final String toString() {
        int i = this.f5301OooO00o;
        Object obj = this.f5302OooO0O0;
        switch (i) {
            case 2:
                return Oooo000.OooO00o((o000O00) obj).toString();
            case 7:
                return ((Field) obj).toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ OooO0OO(int i, Object obj) {
        this.f5301OooO00o = i;
        this.f5302OooO0O0 = obj;
    }

    public OooO0OO(Oooo0 oooo0) {
        this.f5301OooO00o = 5;
        Charset charset = o00000.f3650OooO00o;
        if (oooo0 == null) {
            throw new NullPointerException("output");
        }
        this.f5302OooO0O0 = oooo0;
        oooo0.f3631OooO00o = this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OooO0OO(TimeUnit timeUnit) {
        this(new o0000o0o.o0000O(o000000.f4454OooO, timeUnit));
        this.f5301OooO00o = 9;
        o0000O00.OooO00o.OooOoo0(timeUnit, "timeUnit");
    }

    public OooO0OO(o0000o0o.o0000O o0000o2) {
        this.f5301OooO00o = 9;
        this.f5302OooO0O0 = o0000o2;
    }
}