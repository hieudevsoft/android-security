package o000000;

import android.content.SharedPreferences;
import androidx.appcompat.widget.o0O0O00;
import com.google.crypto.tink.shaded.protobuf.OooOo;
import com.google.crypto.tink.shaded.protobuf.OooOo00;
import com.google.crypto.tink.shaded.protobuf.o00000O;
import com.google.crypto.tink.shaded.protobuf.o00Oo0;
import com.google.crypto.tink.shaded.protobuf.o0Oo0oo;
import com.google.crypto.tink.shaded.protobuf.oo0o0Oo;
import hieubui.eup.android_app_security.MainActivity;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import o00000.o00000;
import o00000.o00000O0;
import o00000.o0000OO0;
import o00000.o000O00;
import o00000.o000O000;
import o00000.o000OO;
import o00000.o000OO0O;
import o00000.o000Oo0;
import o0OO00O.Oooo000;

/* loaded from: classes.dex */
public final class OooO00o {

    /* renamed from: OooO0o  reason: collision with root package name */
    public o0OO00O.OooO0OO f4005OooO0o;

    /* renamed from: OooO00o  reason: collision with root package name */
    public o0O0O00 f4001OooO00o = null;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public o0O0O00 f4002OooO0O0 = null;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public String f4003OooO0OO = null;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public OooO0OO f4004OooO0Oo = null;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public o0OO00O.OooO0OO f4006OooO0o0 = null;

    public final o0OO00O.OooO0OO OooO00o() {
        try {
            OooO0OO oooO0OO = this.f4004OooO0Oo;
            if (oooO0OO != null) {
                try {
                    o000O00 o000o00 = (o000O00) o0OO00O.OooO0OO.OooO0oO(this.f4001OooO00o, oooO0OO).f5302OooO0O0;
                    o0Oo0oo o0oo0oo = (o0Oo0oo) o000o00.OooO0oO(oo0o0Oo.NEW_BUILDER);
                    o0oo0oo.OooO0OO();
                    o0Oo0oo.OooO0Oo(o0oo0oo.f3737OooO0O0, o000o00);
                    return new o0OO00O.OooO0OO(3, (o000O000) o0oo0oo);
                } catch (o00000O | GeneralSecurityException unused) {
                    int i = OooO0O0.f4007OooO0O0;
                }
            }
            o000O00 OooOo0o2 = o000O00.OooOo0o(this.f4001OooO00o.OooO(), o00Oo0.OooO00o());
            if (OooOo0o2.OooOOoo() > 0) {
                o0Oo0oo o0oo0oo2 = (o0Oo0oo) OooOo0o2.OooO0oO(oo0o0Oo.NEW_BUILDER);
                o0oo0oo2.OooO0OO();
                o0Oo0oo.OooO0Oo(o0oo0oo2.f3737OooO0O0, OooOo0o2);
                return new o0OO00O.OooO0OO(3, (o000O000) o0oo0oo2);
            }
            throw new GeneralSecurityException("empty keyset");
        } catch (FileNotFoundException unused2) {
            int i2 = OooO0O0.f4007OooO0O0;
            if (this.f4006OooO0o0 != null) {
                o0OO00O.OooO0OO oooO0OO2 = new o0OO00O.OooO0OO(3, o000O00.OooOo0O());
                o0OO00O.OooO0OO oooO0OO3 = this.f4006OooO0o0;
                synchronized (oooO0OO2) {
                    oooO0OO2.OooO00o((o0000OO0) oooO0OO3.f5302OooO0O0);
                    int OooOo002 = Oooo000.OooO00o((o000O00) oooO0OO2.OooO0OO().f5302OooO0O0).OooOOo().OooOo00();
                    synchronized (oooO0OO2) {
                        for (int i3 = 0; i3 < ((o000O00) ((o000O000) oooO0OO2.f5302OooO0O0).f3737OooO0O0).OooOOoo(); i3++) {
                            o000Oo0 OooOOo2 = ((o000O00) ((o000O000) oooO0OO2.f5302OooO0O0).f3737OooO0O0).OooOOo(i3);
                            if (OooOOo2.OooOo0() == OooOo002) {
                                if (OooOOo2.OooOo0o().equals(o000OO.ENABLED)) {
                                    o000O000 o000o000 = (o000O000) oooO0OO2.f5302OooO0O0;
                                    o000o000.OooO0OO();
                                    o000O00.OooOOOo((o000O00) o000o000.f3737OooO0O0, OooOo002);
                                    if (this.f4004OooO0Oo != null) {
                                        o0OO00O.OooO0OO OooO0OO2 = oooO0OO2.OooO0OO();
                                        o0O0O00 o0o0o00 = this.f4002OooO0O0;
                                        OooO0OO oooO0OO4 = this.f4004OooO0Oo;
                                        o000O00 o000o002 = (o000O00) OooO0OO2.f5302OooO0O0;
                                        byte[] OooO00o2 = oooO0OO4.OooO00o(o000o002.OooO0Oo(), new byte[0]);
                                        try {
                                            if (o000O00.OooOo0o(oooO0OO4.OooO0O0(OooO00o2, new byte[0]), o00Oo0.OooO00o()).equals(o000o002)) {
                                                o00000 OooOOoo2 = o00000O0.OooOOoo();
                                                OooOo00 OooO0oo2 = OooOo.OooO0oo(OooO00o2, 0, OooO00o2.length);
                                                OooOOoo2.OooO0OO();
                                                o00000O0.OooOOOo((o00000O0) OooOOoo2.f3737OooO0O0, OooO0oo2);
                                                o000OO0O OooO00o3 = Oooo000.OooO00o(o000o002);
                                                OooOOoo2.OooO0OO();
                                                o00000O0.OooOOo0((o00000O0) OooOOoo2.f3737OooO0O0, OooO00o3);
                                                if (!((SharedPreferences.Editor) o0o0o00.f2440OooO0O0).putString((String) o0o0o00.f2441OooO0OO, o0000O00.OooO00o.OoooooO(((o00000O0) OooOOoo2.OooO00o()).OooO0Oo())).commit()) {
                                                    throw new IOException("Failed to write to SharedPreferences");
                                                }
                                            } else {
                                                throw new GeneralSecurityException("cannot encrypt keyset");
                                            }
                                        } catch (o00000O unused3) {
                                            throw new GeneralSecurityException("invalid keyset, corrupted key material");
                                        }
                                    } else {
                                        o0OO00O.OooO0OO OooO0OO3 = oooO0OO2.OooO0OO();
                                        o0O0O00 o0o0o002 = this.f4002OooO0O0;
                                        if (!((SharedPreferences.Editor) o0o0o002.f2440OooO0O0).putString((String) o0o0o002.f2441OooO0OO, o0000O00.OooO00o.OoooooO(((o000O00) OooO0OO3.f5302OooO0O0).OooO0Oo())).commit()) {
                                            throw new IOException("Failed to write to SharedPreferences");
                                        }
                                    }
                                    return oooO0OO2;
                                }
                                throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + OooOo002);
                            }
                        }
                        throw new GeneralSecurityException("key not found: " + OooOo002);
                    }
                }
            }
            throw new GeneralSecurityException("cannot read or generate keyset");
        }
    }

    public final OooO0OO OooO0O0() {
        int i = OooO0O0.f4007OooO0O0;
        OooO0o oooO0o = new OooO0o();
        boolean OooO0OO2 = oooO0o.OooO0OO(this.f4003OooO0OO);
        if (!OooO0OO2) {
            try {
                OooO0o.OooO00o(this.f4003OooO0OO);
            } catch (GeneralSecurityException | ProviderException unused) {
                int i2 = OooO0O0.f4007OooO0O0;
                return null;
            }
        }
        try {
            return oooO0o.OooO0O0(this.f4003OooO0OO);
        } catch (GeneralSecurityException | ProviderException e) {
            if (OooO0OO2) {
                throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.f4003OooO0OO), e);
            }
            int i3 = OooO0O0.f4007OooO0O0;
            return null;
        }
    }

    public final void OooO0OO(MainActivity mainActivity, String str) {
        if (mainActivity == null) {
            throw new IllegalArgumentException("need an Android context");
        }
        this.f4001OooO00o = new o0O0O00(10, mainActivity, str);
        this.f4002OooO0O0 = new o0O0O00(11, mainActivity, str);
    }
}