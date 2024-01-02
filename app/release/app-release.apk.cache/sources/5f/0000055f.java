package o00000oO;

import OoooOOo.o0OO00OO;
import hieubui.eup.android_app_security.MainActivity;
import java.io.IOException;
import o0000O00.OooO00o;
import o0000Oo.o00000;
import o0000Oo.o00000O;
import o0000o0o.o0000O0;

/* loaded from: classes.dex */
public final class OooOOOO implements o0000Oo.OooOOO0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f4079OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ MainActivity f4080OooO0O0;

    public /* synthetic */ OooOOOO(MainActivity mainActivity, int i) {
        this.f4079OooO00o = i;
        this.f4080OooO0O0 = mainActivity;
    }

    @Override // o0000Oo.OooOOO0
    public final void OooO00o(o0000O0 o0000o02, IOException iOException) {
        switch (this.f4079OooO00o) {
            case 0:
                OooO00o.OooOoo0(o0000o02, "call");
                return;
            case 1:
                OooO00o.OooOoo0(o0000o02, "call");
                return;
            default:
                OooO00o.OooOoo0(o0000o02, "call");
                iOException.getLocalizedMessage();
                return;
        }
    }

    @Override // o0000Oo.OooOOO0
    public final void OooO0O0(o0000O0 o0000o02, o00000 o00000Var) {
        o00000O o00000o = o00000Var.f4244OooO0oO;
        int i = o00000Var.f4241OooO0Oo;
        int i2 = this.f4079OooO00o;
        boolean z = false;
        MainActivity mainActivity = this.f4080OooO0O0;
        switch (i2) {
            case 0:
                if (o00000o != null) {
                    OooOO0 oooOO0 = (OooOO0) new com.google.gson.OooOOOO().OooO0O0(OooOO0.class, o00000o.OooOo());
                    if (i == 200) {
                        String OooO00o2 = oooOO0.OooO00o();
                        if (OooO00o2 == null || OooO00o2.length() == 0) {
                            z = true;
                        }
                        if (!z) {
                            int i3 = MainActivity.f3943OooOoO0;
                            OooO oooO = (OooO) mainActivity.f3946OooOo0o.OooO00o();
                            oooO.getClass();
                            OooO00o.OooOoo0(OooO00o2, "value");
                            o0OO00OO o0oo00oo = (o0OO00OO) oooO.f4068OooO00o.edit();
                            o0oo00oo.putString("aes_key", OooO00o2);
                            o0oo00oo.apply();
                            OooO00o.o000o0oo(mainActivity, "GET AES KEY SUCCESSFULLY~");
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (o00000o != null) {
                    OooOO0 oooOO02 = (OooOO0) new com.google.gson.OooOOOO().OooO0O0(OooOO0.class, o00000o.OooOo());
                    if (i == 200) {
                        String OooO00o3 = oooOO02.OooO00o();
                        if (OooO00o3 == null || OooO00o3.length() == 0) {
                            z = true;
                        }
                        if (!z) {
                            int i4 = MainActivity.f3943OooOoO0;
                            OooO oooO2 = (OooO) mainActivity.f3946OooOo0o.OooO00o();
                            oooO2.getClass();
                            OooO00o.OooOoo0(OooO00o3, "value");
                            o0OO00OO o0oo00oo2 = (o0OO00OO) oooO2.f4068OooO00o.edit();
                            o0oo00oo2.putString("rsa_key", OooO00o3);
                            o0oo00oo2.apply();
                            OooO00o.o000o0oo(mainActivity, "GET PUBLIC RSA KEY SUCCESSFULLY~");
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i == 200) {
                    OooO00o.o00000oO(mainActivity, new Oooo000(mainActivity, o00000Var, 1));
                    return;
                }
                return;
        }
    }
}