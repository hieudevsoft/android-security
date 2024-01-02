package o00000oO;

import android.util.Base64;
import androidx.appcompat.widget.o0OOooO0;
import hieubui.eup.android_app_security.MainActivity;
import java.io.IOException;
import java.nio.charset.Charset;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import o0000O00.OooO00o;
import o0000Oo.o00000;
import o0000Oo.o00000O;
import o0000Oo0.OooO0O0;
import o0000o0o.o0000O0;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class OooOo implements o0000Oo.OooOOO0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f4081OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ MainActivity f4082OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ Object f4083OooO0OO;

    public /* synthetic */ OooOo(MainActivity mainActivity, Object obj, int i) {
        this.f4081OooO00o = i;
        this.f4082OooO0O0 = mainActivity;
        this.f4083OooO0OO = obj;
    }

    @Override // o0000Oo.OooOOO0
    public final void OooO00o(o0000O0 o0000o02, IOException iOException) {
        switch (this.f4081OooO00o) {
            case 0:
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
        boolean z;
        int i = o00000Var.f4241OooO0Oo;
        int i2 = this.f4081OooO00o;
        MainActivity mainActivity = this.f4082OooO0O0;
        Object obj = this.f4083OooO0OO;
        switch (i2) {
            case 0:
                o00000O o00000o = o00000Var.f4244OooO0oO;
                if (o00000o != null) {
                    o0OOooO0 o0ooooo0 = (o0OOooO0) obj;
                    o0OoOo0 o0oooo0 = (o0OoOo0) new com.google.gson.OooOOOO().OooO0O0(o0OoOo0.class, o00000o.OooOo());
                    if (i == 200) {
                        String OooO00o2 = o0oooo0.OooO00o();
                        if (OooO00o2 != null && OooO00o2.length() != 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (!z) {
                            int i3 = MainActivity.f3943OooOoO0;
                            String str = "";
                            String string = ((OooO) mainActivity.f3946OooOo0o.OooO00o()).f4068OooO00o.getString("aes_key", "");
                            if (string != null) {
                                str = string;
                            }
                            byte[] decode = Base64.decode(str, 0);
                            OooO00o.OooOo(decode);
                            OooO00o.OooOoo0(OooO00o2, "payload");
                            byte[] decode2 = Base64.decode(OooO00o2, 0);
                            OooO00o.OooOoOO(decode2, "decode(...)");
                            Charset charset = OooO0O0.f4385OooO00o;
                            JSONObject jSONObject = new JSONObject(new String(decode2, charset));
                            byte[] decode3 = Base64.decode(jSONObject.getString("iv"), 0);
                            byte[] decode4 = Base64.decode(jSONObject.getString("value"), 0);
                            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                            cipher.init(2, new SecretKeySpec(decode, "AES"), new IvParameterSpec(decode3));
                            byte[] doFinal = cipher.doFinal(decode4);
                            OooO00o.OooOo(doFinal);
                            OooO00o.o00000oO(mainActivity, new OooOo00(o0ooooo0, OooO00o2, new String(doFinal, charset), 0));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i == 200) {
                    OooO00o.o00000oO(mainActivity, new Oooo000(mainActivity, (String) obj, 0));
                    return;
                }
                return;
        }
    }
}