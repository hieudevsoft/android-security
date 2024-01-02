package hieubui.eup.android_app_security;

import OooO0Oo.Oooo000;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.o0OOO0o;
import androidx.appcompat.widget.o0OOooO0;
import androidx.lifecycle.o0000;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import hieubui.eup.android_app_security.MainActivity;
import java.nio.charset.Charset;
import java.security.KeyFactory;
import java.security.spec.X509EncodedKeySpec;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import o00000oO.OooOOO;
import o00000oo.o00Oo0;
import o0000O00.OooO00o;
import o0000Oo.o000000;
import o0000Oo.o000OOo;
import o0000Oo.o00Ooo;
import o0000Oo.o0Oo0oo;
import o0000Oo.oo0o0Oo;
import o0000Oo0.OooO0O0;
import o0000o0o.o0000O0;

/* loaded from: classes.dex */
public final class MainActivity extends Oooo000 {

    /* renamed from: OooOoO0  reason: collision with root package name */
    public static final /* synthetic */ int f3943OooOoO0 = 0;

    /* renamed from: OooOo0O  reason: collision with root package name */
    public o0OOooO0 f3945OooOo0O;

    /* renamed from: OooOo0o  reason: collision with root package name */
    public final o00Oo0 f3946OooOo0o = OooO00o.o0000OOo(new o0000(1, this));

    /* renamed from: OooOo  reason: collision with root package name */
    public final o00Oo0 f3944OooOo = OooO00o.o0000OOo(OooOOO.f4074OooO0O0);

    @Override // androidx.fragment.app.o0ooOOo, androidx.activity.Oooo000, OooOo0.o00Oo0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
        int i = R.id.get_aes_key;
        MaterialButton materialButton = (MaterialButton) OooO00o.o00O0O(inflate, R.id.get_aes_key);
        if (materialButton != null) {
            i = R.id.get_profile;
            MaterialButton materialButton2 = (MaterialButton) OooO00o.o00O0O(inflate, R.id.get_profile);
            if (materialButton2 != null) {
                i = R.id.get_public_rsa_key;
                MaterialButton materialButton3 = (MaterialButton) OooO00o.o00O0O(inflate, R.id.get_public_rsa_key);
                if (materialButton3 != null) {
                    i = R.id.get_test;
                    MaterialButton materialButton4 = (MaterialButton) OooO00o.o00O0O(inflate, R.id.get_test);
                    if (materialButton4 != null) {
                        i = R.id.txt_content;
                        MaterialTextView materialTextView = (MaterialTextView) OooO00o.o00O0O(inflate, R.id.txt_content);
                        if (materialTextView != null) {
                            i = R.id.update_profile;
                            MaterialButton materialButton5 = (MaterialButton) OooO00o.o00O0O(inflate, R.id.update_profile);
                            if (materialButton5 != null) {
                                RelativeLayout relativeLayout = (RelativeLayout) inflate;
                                this.f3945OooOo0O = new o0OOooO0(relativeLayout, materialButton, materialButton2, materialButton3, materialButton4, materialTextView, materialButton5);
                                setContentView(relativeLayout);
                                final o0OOooO0 o0ooooo0 = this.f3945OooOo0O;
                                if (o0ooooo0 != null) {
                                    ((MaterialButton) o0ooooo0.f2526OooO0O0).setOnClickListener(new View.OnClickListener(this) { // from class: o00000oO.OooOO0O

                                        /* renamed from: OooO0O0  reason: collision with root package name */
                                        public final /* synthetic */ MainActivity f4073OooO0O0;

                                        {
                                            this.f4073OooO0O0 = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            int i2 = r2;
                                            MainActivity mainActivity = this.f4073OooO0O0;
                                            switch (i2) {
                                                case 0:
                                                    int i3 = MainActivity.f3943OooOoO0;
                                                    OooO00o.OooOoo0(mainActivity, "this$0");
                                                    o000OOo o000ooo = new o000OOo();
                                                    o000ooo.OooO0Oo("https://secure.eup.ai/api/aes/key");
                                                    o0OOO0o OooO00o2 = o000ooo.OooO00o();
                                                    oo0o0Oo oo0o0oo = (oo0o0Oo) mainActivity.f3944OooOo.OooO00o();
                                                    oo0o0oo.getClass();
                                                    new o0000O0(oo0o0oo, OooO00o2, false).OooO0o0(new OooOOOO(mainActivity, 0));
                                                    return;
                                                case 1:
                                                    int i4 = MainActivity.f3943OooOoO0;
                                                    OooO00o.OooOoo0(mainActivity, "this$0");
                                                    o000OOo o000ooo2 = new o000OOo();
                                                    o000ooo2.OooO0Oo("https://secure.eup.ai/api/rsa/public-key");
                                                    o0OOO0o OooO00o3 = o000ooo2.OooO00o();
                                                    oo0o0Oo oo0o0oo2 = (oo0o0Oo) mainActivity.f3944OooOo.OooO00o();
                                                    oo0o0oo2.getClass();
                                                    new o0000O0(oo0o0oo2, OooO00o3, false).OooO0o0(new OooOOOO(mainActivity, 1));
                                                    return;
                                                case 2:
                                                    int i5 = MainActivity.f3943OooOoO0;
                                                    OooO00o.OooOoo0(mainActivity, "this$0");
                                                    o000oOoO o000oooo = new o000oOoO(3, 3, 3);
                                                    String string = ((OooO) mainActivity.f3946OooOo0o.OooO00o()).f4068OooO00o.getString("rsa_key", "");
                                                    if (string == null) {
                                                        string = "";
                                                    }
                                                    byte[] decode = Base64.decode(o0000Oo0.OooOOOO.o00O0oOo(o0000Oo0.OooOOOO.o00oOOo(o0000Oo0.OooOOOO.o00oOOo(string, "-----BEGIN PUBLIC KEY-----", ""), "-----END PUBLIC KEY-----", "")).toString(), 0);
                                                    String OooO0o2 = new com.google.gson.OooOOOO().OooO0o(o000oooo);
                                                    OooO00o.OooOo(OooO0o2);
                                                    OooO00o.OooOo(decode);
                                                    Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                                                    cipher.init(1, KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decode)));
                                                    Charset charset = OooO0O0.f4385OooO00o;
                                                    byte[] bytes = OooO0o2.getBytes(charset);
                                                    OooO00o.OooOoOO(bytes, "this as java.lang.String).getBytes(charset)");
                                                    String encodeToString = Base64.encodeToString(cipher.doFinal(bytes), 0);
                                                    OooO00o.OooOoOO(encodeToString, "encodeToString(...)");
                                                    String OooO0o3 = new com.google.gson.OooOOOO().OooO0o(new Oooo0(encodeToString));
                                                    o000OOo o000ooo3 = new o000OOo();
                                                    o00Ooo o00ooo2 = o000ooo3.f4281OooO0OO;
                                                    o00ooo2.getClass();
                                                    o0000Oo.OooOOOO.OooO0Oo("Authorization");
                                                    o0000Oo.OooOOOO.OooO0o0("wv7Q909F2rlvMHP00OfCRPcRkGJORFrL", "Authorization");
                                                    o00ooo2.OooO00o("Authorization", "wv7Q909F2rlvMHP00OfCRPcRkGJORFrL");
                                                    o000ooo3.OooO0Oo("https://secure.eup.ai/api/user/profile/update");
                                                    OooO00o.OooOo(OooO0o3);
                                                    Pattern pattern = o0Oo0oo.f4335OooO0OO;
                                                    o0Oo0oo OooOO0O2 = o0000Oo.OooOOOO.OooOO0O("application/json");
                                                    Charset OooO00o4 = OooOO0O2.OooO00o(null);
                                                    if (OooO00o4 == null) {
                                                        String str = OooOO0O2 + "; charset=utf-8";
                                                        OooO00o.OooOoo0(str, "<this>");
                                                        try {
                                                            OooOO0O2 = o0000Oo.OooOOOO.OooOO0O(str);
                                                        } catch (IllegalArgumentException unused) {
                                                            OooOO0O2 = null;
                                                        }
                                                    } else {
                                                        charset = OooO00o4;
                                                    }
                                                    byte[] bytes2 = OooO0o3.getBytes(charset);
                                                    OooO00o.OooOoOO(bytes2, "this as java.lang.String).getBytes(charset)");
                                                    int length = bytes2.length;
                                                    long length2 = bytes2.length;
                                                    long j = 0;
                                                    long j2 = length;
                                                    byte[] bArr = o0000OoO.OooOO0O.f4403OooO00o;
                                                    if ((j | j2) >= 0 && j <= length2 && length2 - j >= j2) {
                                                        o000ooo3.OooO0OO("POST", new o000000(length, 0, OooOO0O2, bytes2));
                                                        o0OOO0o OooO00o5 = o000ooo3.OooO00o();
                                                        oo0o0Oo oo0o0oo3 = (oo0o0Oo) mainActivity.f3944OooOo.OooO00o();
                                                        oo0o0oo3.getClass();
                                                        new o0000O0(oo0o0oo3, OooO00o5, false).OooO0o0(new OooOo(mainActivity, OooO0o3, 1));
                                                        return;
                                                    }
                                                    throw new ArrayIndexOutOfBoundsException();
                                                default:
                                                    int i6 = MainActivity.f3943OooOoO0;
                                                    OooO00o.OooOoo0(mainActivity, "this$0");
                                                    o000OOo o000ooo4 = new o000OOo();
                                                    o00Ooo o00ooo3 = o000ooo4.f4281OooO0OO;
                                                    o00ooo3.getClass();
                                                    o0000Oo.OooOOOO.OooO0Oo("Authorization");
                                                    o0000Oo.OooOOOO.OooO0o0("wv7Q909F2rlvMHP00OfCRPcRkGJORFrL", "Authorization");
                                                    o00ooo3.OooO00o("Authorization", "wv7Q909F2rlvMHP00OfCRPcRkGJORFrL");
                                                    o000ooo4.OooO0Oo("https://secure.eup.ai/api/user/profile/detail");
                                                    o0OOO0o OooO00o6 = o000ooo4.OooO00o();
                                                    oo0o0Oo oo0o0oo4 = (oo0o0Oo) mainActivity.f3944OooOo.OooO00o();
                                                    oo0o0oo4.getClass();
                                                    new o0000O0(oo0o0oo4, OooO00o6, false).OooO0o0(new OooOOOO(mainActivity, 2));
                                                    return;
                                            }
                                        }
                                    });
                                    ((MaterialButton) o0ooooo0.f2528OooO0Oo).setOnClickListener(new View.OnClickListener(this) { // from class: o00000oO.OooOO0O

                                        /* renamed from: OooO0O0  reason: collision with root package name */
                                        public final /* synthetic */ MainActivity f4073OooO0O0;

                                        {
                                            this.f4073OooO0O0 = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            int i2 = r2;
                                            MainActivity mainActivity = this.f4073OooO0O0;
                                            switch (i2) {
                                                case 0:
                                                    int i3 = MainActivity.f3943OooOoO0;
                                                    OooO00o.OooOoo0(mainActivity, "this$0");
                                                    o000OOo o000ooo = new o000OOo();
                                                    o000ooo.OooO0Oo("https://secure.eup.ai/api/aes/key");
                                                    o0OOO0o OooO00o2 = o000ooo.OooO00o();
                                                    oo0o0Oo oo0o0oo = (oo0o0Oo) mainActivity.f3944OooOo.OooO00o();
                                                    oo0o0oo.getClass();
                                                    new o0000O0(oo0o0oo, OooO00o2, false).OooO0o0(new OooOOOO(mainActivity, 0));
                                                    return;
                                                case 1:
                                                    int i4 = MainActivity.f3943OooOoO0;
                                                    OooO00o.OooOoo0(mainActivity, "this$0");
                                                    o000OOo o000ooo2 = new o000OOo();
                                                    o000ooo2.OooO0Oo("https://secure.eup.ai/api/rsa/public-key");
                                                    o0OOO0o OooO00o3 = o000ooo2.OooO00o();
                                                    oo0o0Oo oo0o0oo2 = (oo0o0Oo) mainActivity.f3944OooOo.OooO00o();
                                                    oo0o0oo2.getClass();
                                                    new o0000O0(oo0o0oo2, OooO00o3, false).OooO0o0(new OooOOOO(mainActivity, 1));
                                                    return;
                                                case 2:
                                                    int i5 = MainActivity.f3943OooOoO0;
                                                    OooO00o.OooOoo0(mainActivity, "this$0");
                                                    o000oOoO o000oooo = new o000oOoO(3, 3, 3);
                                                    String string = ((OooO) mainActivity.f3946OooOo0o.OooO00o()).f4068OooO00o.getString("rsa_key", "");
                                                    if (string == null) {
                                                        string = "";
                                                    }
                                                    byte[] decode = Base64.decode(o0000Oo0.OooOOOO.o00O0oOo(o0000Oo0.OooOOOO.o00oOOo(o0000Oo0.OooOOOO.o00oOOo(string, "-----BEGIN PUBLIC KEY-----", ""), "-----END PUBLIC KEY-----", "")).toString(), 0);
                                                    String OooO0o2 = new com.google.gson.OooOOOO().OooO0o(o000oooo);
                                                    OooO00o.OooOo(OooO0o2);
                                                    OooO00o.OooOo(decode);
                                                    Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                                                    cipher.init(1, KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decode)));
                                                    Charset charset = OooO0O0.f4385OooO00o;
                                                    byte[] bytes = OooO0o2.getBytes(charset);
                                                    OooO00o.OooOoOO(bytes, "this as java.lang.String).getBytes(charset)");
                                                    String encodeToString = Base64.encodeToString(cipher.doFinal(bytes), 0);
                                                    OooO00o.OooOoOO(encodeToString, "encodeToString(...)");
                                                    String OooO0o3 = new com.google.gson.OooOOOO().OooO0o(new Oooo0(encodeToString));
                                                    o000OOo o000ooo3 = new o000OOo();
                                                    o00Ooo o00ooo2 = o000ooo3.f4281OooO0OO;
                                                    o00ooo2.getClass();
                                                    o0000Oo.OooOOOO.OooO0Oo("Authorization");
                                                    o0000Oo.OooOOOO.OooO0o0("wv7Q909F2rlvMHP00OfCRPcRkGJORFrL", "Authorization");
                                                    o00ooo2.OooO00o("Authorization", "wv7Q909F2rlvMHP00OfCRPcRkGJORFrL");
                                                    o000ooo3.OooO0Oo("https://secure.eup.ai/api/user/profile/update");
                                                    OooO00o.OooOo(OooO0o3);
                                                    Pattern pattern = o0Oo0oo.f4335OooO0OO;
                                                    o0Oo0oo OooOO0O2 = o0000Oo.OooOOOO.OooOO0O("application/json");
                                                    Charset OooO00o4 = OooOO0O2.OooO00o(null);
                                                    if (OooO00o4 == null) {
                                                        String str = OooOO0O2 + "; charset=utf-8";
                                                        OooO00o.OooOoo0(str, "<this>");
                                                        try {
                                                            OooOO0O2 = o0000Oo.OooOOOO.OooOO0O(str);
                                                        } catch (IllegalArgumentException unused) {
                                                            OooOO0O2 = null;
                                                        }
                                                    } else {
                                                        charset = OooO00o4;
                                                    }
                                                    byte[] bytes2 = OooO0o3.getBytes(charset);
                                                    OooO00o.OooOoOO(bytes2, "this as java.lang.String).getBytes(charset)");
                                                    int length = bytes2.length;
                                                    long length2 = bytes2.length;
                                                    long j = 0;
                                                    long j2 = length;
                                                    byte[] bArr = o0000OoO.OooOO0O.f4403OooO00o;
                                                    if ((j | j2) >= 0 && j <= length2 && length2 - j >= j2) {
                                                        o000ooo3.OooO0OO("POST", new o000000(length, 0, OooOO0O2, bytes2));
                                                        o0OOO0o OooO00o5 = o000ooo3.OooO00o();
                                                        oo0o0Oo oo0o0oo3 = (oo0o0Oo) mainActivity.f3944OooOo.OooO00o();
                                                        oo0o0oo3.getClass();
                                                        new o0000O0(oo0o0oo3, OooO00o5, false).OooO0o0(new OooOo(mainActivity, OooO0o3, 1));
                                                        return;
                                                    }
                                                    throw new ArrayIndexOutOfBoundsException();
                                                default:
                                                    int i6 = MainActivity.f3943OooOoO0;
                                                    OooO00o.OooOoo0(mainActivity, "this$0");
                                                    o000OOo o000ooo4 = new o000OOo();
                                                    o00Ooo o00ooo3 = o000ooo4.f4281OooO0OO;
                                                    o00ooo3.getClass();
                                                    o0000Oo.OooOOOO.OooO0Oo("Authorization");
                                                    o0000Oo.OooOOOO.OooO0o0("wv7Q909F2rlvMHP00OfCRPcRkGJORFrL", "Authorization");
                                                    o00ooo3.OooO00o("Authorization", "wv7Q909F2rlvMHP00OfCRPcRkGJORFrL");
                                                    o000ooo4.OooO0Oo("https://secure.eup.ai/api/user/profile/detail");
                                                    o0OOO0o OooO00o6 = o000ooo4.OooO00o();
                                                    oo0o0Oo oo0o0oo4 = (oo0o0Oo) mainActivity.f3944OooOo.OooO00o();
                                                    oo0o0oo4.getClass();
                                                    new o0000O0(oo0o0oo4, OooO00o6, false).OooO0o0(new OooOOOO(mainActivity, 2));
                                                    return;
                                            }
                                        }
                                    });
                                    ((MaterialButton) o0ooooo0.f2530OooO0o0).setOnClickListener(new View.OnClickListener() { // from class: o00000oO.OooOOO0
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            int i2 = MainActivity.f3943OooOoO0;
                                            MainActivity mainActivity = MainActivity.this;
                                            OooO00o.OooOoo0(mainActivity, "this$0");
                                            o0OOooO0 o0ooooo02 = o0ooooo0;
                                            OooO00o.OooOoo0(o0ooooo02, "$this_apply");
                                            o000OOo o000ooo = new o000OOo();
                                            o00Ooo o00ooo2 = o000ooo.f4281OooO0OO;
                                            o00ooo2.getClass();
                                            o0000Oo.OooOOOO.OooO0Oo("Authorization");
                                            o0000Oo.OooOOOO.OooO0o0("wv7Q909F2rlvMHP00OfCRPcRkGJORFrL", "Authorization");
                                            o00ooo2.OooO00o("Authorization", "wv7Q909F2rlvMHP00OfCRPcRkGJORFrL");
                                            o000ooo.OooO0Oo("https://secure.eup.ai/api/test/1/detail");
                                            o0OOO0o OooO00o2 = o000ooo.OooO00o();
                                            oo0o0Oo oo0o0oo = (oo0o0Oo) mainActivity.f3944OooOo.OooO00o();
                                            oo0o0oo.getClass();
                                            new o0000O0(oo0o0oo, OooO00o2, false).OooO0o0(new OooOo(mainActivity, o0ooooo02, 0));
                                        }
                                    });
                                    ((MaterialButton) o0ooooo0.f2531OooO0oO).setOnClickListener(new View.OnClickListener(this) { // from class: o00000oO.OooOO0O

                                        /* renamed from: OooO0O0  reason: collision with root package name */
                                        public final /* synthetic */ MainActivity f4073OooO0O0;

                                        {
                                            this.f4073OooO0O0 = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            int i2 = r2;
                                            MainActivity mainActivity = this.f4073OooO0O0;
                                            switch (i2) {
                                                case 0:
                                                    int i3 = MainActivity.f3943OooOoO0;
                                                    OooO00o.OooOoo0(mainActivity, "this$0");
                                                    o000OOo o000ooo = new o000OOo();
                                                    o000ooo.OooO0Oo("https://secure.eup.ai/api/aes/key");
                                                    o0OOO0o OooO00o2 = o000ooo.OooO00o();
                                                    oo0o0Oo oo0o0oo = (oo0o0Oo) mainActivity.f3944OooOo.OooO00o();
                                                    oo0o0oo.getClass();
                                                    new o0000O0(oo0o0oo, OooO00o2, false).OooO0o0(new OooOOOO(mainActivity, 0));
                                                    return;
                                                case 1:
                                                    int i4 = MainActivity.f3943OooOoO0;
                                                    OooO00o.OooOoo0(mainActivity, "this$0");
                                                    o000OOo o000ooo2 = new o000OOo();
                                                    o000ooo2.OooO0Oo("https://secure.eup.ai/api/rsa/public-key");
                                                    o0OOO0o OooO00o3 = o000ooo2.OooO00o();
                                                    oo0o0Oo oo0o0oo2 = (oo0o0Oo) mainActivity.f3944OooOo.OooO00o();
                                                    oo0o0oo2.getClass();
                                                    new o0000O0(oo0o0oo2, OooO00o3, false).OooO0o0(new OooOOOO(mainActivity, 1));
                                                    return;
                                                case 2:
                                                    int i5 = MainActivity.f3943OooOoO0;
                                                    OooO00o.OooOoo0(mainActivity, "this$0");
                                                    o000oOoO o000oooo = new o000oOoO(3, 3, 3);
                                                    String string = ((OooO) mainActivity.f3946OooOo0o.OooO00o()).f4068OooO00o.getString("rsa_key", "");
                                                    if (string == null) {
                                                        string = "";
                                                    }
                                                    byte[] decode = Base64.decode(o0000Oo0.OooOOOO.o00O0oOo(o0000Oo0.OooOOOO.o00oOOo(o0000Oo0.OooOOOO.o00oOOo(string, "-----BEGIN PUBLIC KEY-----", ""), "-----END PUBLIC KEY-----", "")).toString(), 0);
                                                    String OooO0o2 = new com.google.gson.OooOOOO().OooO0o(o000oooo);
                                                    OooO00o.OooOo(OooO0o2);
                                                    OooO00o.OooOo(decode);
                                                    Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                                                    cipher.init(1, KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decode)));
                                                    Charset charset = OooO0O0.f4385OooO00o;
                                                    byte[] bytes = OooO0o2.getBytes(charset);
                                                    OooO00o.OooOoOO(bytes, "this as java.lang.String).getBytes(charset)");
                                                    String encodeToString = Base64.encodeToString(cipher.doFinal(bytes), 0);
                                                    OooO00o.OooOoOO(encodeToString, "encodeToString(...)");
                                                    String OooO0o3 = new com.google.gson.OooOOOO().OooO0o(new Oooo0(encodeToString));
                                                    o000OOo o000ooo3 = new o000OOo();
                                                    o00Ooo o00ooo2 = o000ooo3.f4281OooO0OO;
                                                    o00ooo2.getClass();
                                                    o0000Oo.OooOOOO.OooO0Oo("Authorization");
                                                    o0000Oo.OooOOOO.OooO0o0("wv7Q909F2rlvMHP00OfCRPcRkGJORFrL", "Authorization");
                                                    o00ooo2.OooO00o("Authorization", "wv7Q909F2rlvMHP00OfCRPcRkGJORFrL");
                                                    o000ooo3.OooO0Oo("https://secure.eup.ai/api/user/profile/update");
                                                    OooO00o.OooOo(OooO0o3);
                                                    Pattern pattern = o0Oo0oo.f4335OooO0OO;
                                                    o0Oo0oo OooOO0O2 = o0000Oo.OooOOOO.OooOO0O("application/json");
                                                    Charset OooO00o4 = OooOO0O2.OooO00o(null);
                                                    if (OooO00o4 == null) {
                                                        String str = OooOO0O2 + "; charset=utf-8";
                                                        OooO00o.OooOoo0(str, "<this>");
                                                        try {
                                                            OooOO0O2 = o0000Oo.OooOOOO.OooOO0O(str);
                                                        } catch (IllegalArgumentException unused) {
                                                            OooOO0O2 = null;
                                                        }
                                                    } else {
                                                        charset = OooO00o4;
                                                    }
                                                    byte[] bytes2 = OooO0o3.getBytes(charset);
                                                    OooO00o.OooOoOO(bytes2, "this as java.lang.String).getBytes(charset)");
                                                    int length = bytes2.length;
                                                    long length2 = bytes2.length;
                                                    long j = 0;
                                                    long j2 = length;
                                                    byte[] bArr = o0000OoO.OooOO0O.f4403OooO00o;
                                                    if ((j | j2) >= 0 && j <= length2 && length2 - j >= j2) {
                                                        o000ooo3.OooO0OO("POST", new o000000(length, 0, OooOO0O2, bytes2));
                                                        o0OOO0o OooO00o5 = o000ooo3.OooO00o();
                                                        oo0o0Oo oo0o0oo3 = (oo0o0Oo) mainActivity.f3944OooOo.OooO00o();
                                                        oo0o0oo3.getClass();
                                                        new o0000O0(oo0o0oo3, OooO00o5, false).OooO0o0(new OooOo(mainActivity, OooO0o3, 1));
                                                        return;
                                                    }
                                                    throw new ArrayIndexOutOfBoundsException();
                                                default:
                                                    int i6 = MainActivity.f3943OooOoO0;
                                                    OooO00o.OooOoo0(mainActivity, "this$0");
                                                    o000OOo o000ooo4 = new o000OOo();
                                                    o00Ooo o00ooo3 = o000ooo4.f4281OooO0OO;
                                                    o00ooo3.getClass();
                                                    o0000Oo.OooOOOO.OooO0Oo("Authorization");
                                                    o0000Oo.OooOOOO.OooO0o0("wv7Q909F2rlvMHP00OfCRPcRkGJORFrL", "Authorization");
                                                    o00ooo3.OooO00o("Authorization", "wv7Q909F2rlvMHP00OfCRPcRkGJORFrL");
                                                    o000ooo4.OooO0Oo("https://secure.eup.ai/api/user/profile/detail");
                                                    o0OOO0o OooO00o6 = o000ooo4.OooO00o();
                                                    oo0o0Oo oo0o0oo4 = (oo0o0Oo) mainActivity.f3944OooOo.OooO00o();
                                                    oo0o0oo4.getClass();
                                                    new o0000O0(oo0o0oo4, OooO00o6, false).OooO0o0(new OooOOOO(mainActivity, 2));
                                                    return;
                                            }
                                        }
                                    });
                                    ((MaterialButton) o0ooooo0.f2527OooO0OO).setOnClickListener(new View.OnClickListener(this) { // from class: o00000oO.OooOO0O

                                        /* renamed from: OooO0O0  reason: collision with root package name */
                                        public final /* synthetic */ MainActivity f4073OooO0O0;

                                        {
                                            this.f4073OooO0O0 = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            int i2 = r2;
                                            MainActivity mainActivity = this.f4073OooO0O0;
                                            switch (i2) {
                                                case 0:
                                                    int i3 = MainActivity.f3943OooOoO0;
                                                    OooO00o.OooOoo0(mainActivity, "this$0");
                                                    o000OOo o000ooo = new o000OOo();
                                                    o000ooo.OooO0Oo("https://secure.eup.ai/api/aes/key");
                                                    o0OOO0o OooO00o2 = o000ooo.OooO00o();
                                                    oo0o0Oo oo0o0oo = (oo0o0Oo) mainActivity.f3944OooOo.OooO00o();
                                                    oo0o0oo.getClass();
                                                    new o0000O0(oo0o0oo, OooO00o2, false).OooO0o0(new OooOOOO(mainActivity, 0));
                                                    return;
                                                case 1:
                                                    int i4 = MainActivity.f3943OooOoO0;
                                                    OooO00o.OooOoo0(mainActivity, "this$0");
                                                    o000OOo o000ooo2 = new o000OOo();
                                                    o000ooo2.OooO0Oo("https://secure.eup.ai/api/rsa/public-key");
                                                    o0OOO0o OooO00o3 = o000ooo2.OooO00o();
                                                    oo0o0Oo oo0o0oo2 = (oo0o0Oo) mainActivity.f3944OooOo.OooO00o();
                                                    oo0o0oo2.getClass();
                                                    new o0000O0(oo0o0oo2, OooO00o3, false).OooO0o0(new OooOOOO(mainActivity, 1));
                                                    return;
                                                case 2:
                                                    int i5 = MainActivity.f3943OooOoO0;
                                                    OooO00o.OooOoo0(mainActivity, "this$0");
                                                    o000oOoO o000oooo = new o000oOoO(3, 3, 3);
                                                    String string = ((OooO) mainActivity.f3946OooOo0o.OooO00o()).f4068OooO00o.getString("rsa_key", "");
                                                    if (string == null) {
                                                        string = "";
                                                    }
                                                    byte[] decode = Base64.decode(o0000Oo0.OooOOOO.o00O0oOo(o0000Oo0.OooOOOO.o00oOOo(o0000Oo0.OooOOOO.o00oOOo(string, "-----BEGIN PUBLIC KEY-----", ""), "-----END PUBLIC KEY-----", "")).toString(), 0);
                                                    String OooO0o2 = new com.google.gson.OooOOOO().OooO0o(o000oooo);
                                                    OooO00o.OooOo(OooO0o2);
                                                    OooO00o.OooOo(decode);
                                                    Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                                                    cipher.init(1, KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decode)));
                                                    Charset charset = OooO0O0.f4385OooO00o;
                                                    byte[] bytes = OooO0o2.getBytes(charset);
                                                    OooO00o.OooOoOO(bytes, "this as java.lang.String).getBytes(charset)");
                                                    String encodeToString = Base64.encodeToString(cipher.doFinal(bytes), 0);
                                                    OooO00o.OooOoOO(encodeToString, "encodeToString(...)");
                                                    String OooO0o3 = new com.google.gson.OooOOOO().OooO0o(new Oooo0(encodeToString));
                                                    o000OOo o000ooo3 = new o000OOo();
                                                    o00Ooo o00ooo2 = o000ooo3.f4281OooO0OO;
                                                    o00ooo2.getClass();
                                                    o0000Oo.OooOOOO.OooO0Oo("Authorization");
                                                    o0000Oo.OooOOOO.OooO0o0("wv7Q909F2rlvMHP00OfCRPcRkGJORFrL", "Authorization");
                                                    o00ooo2.OooO00o("Authorization", "wv7Q909F2rlvMHP00OfCRPcRkGJORFrL");
                                                    o000ooo3.OooO0Oo("https://secure.eup.ai/api/user/profile/update");
                                                    OooO00o.OooOo(OooO0o3);
                                                    Pattern pattern = o0Oo0oo.f4335OooO0OO;
                                                    o0Oo0oo OooOO0O2 = o0000Oo.OooOOOO.OooOO0O("application/json");
                                                    Charset OooO00o4 = OooOO0O2.OooO00o(null);
                                                    if (OooO00o4 == null) {
                                                        String str = OooOO0O2 + "; charset=utf-8";
                                                        OooO00o.OooOoo0(str, "<this>");
                                                        try {
                                                            OooOO0O2 = o0000Oo.OooOOOO.OooOO0O(str);
                                                        } catch (IllegalArgumentException unused) {
                                                            OooOO0O2 = null;
                                                        }
                                                    } else {
                                                        charset = OooO00o4;
                                                    }
                                                    byte[] bytes2 = OooO0o3.getBytes(charset);
                                                    OooO00o.OooOoOO(bytes2, "this as java.lang.String).getBytes(charset)");
                                                    int length = bytes2.length;
                                                    long length2 = bytes2.length;
                                                    long j = 0;
                                                    long j2 = length;
                                                    byte[] bArr = o0000OoO.OooOO0O.f4403OooO00o;
                                                    if ((j | j2) >= 0 && j <= length2 && length2 - j >= j2) {
                                                        o000ooo3.OooO0OO("POST", new o000000(length, 0, OooOO0O2, bytes2));
                                                        o0OOO0o OooO00o5 = o000ooo3.OooO00o();
                                                        oo0o0Oo oo0o0oo3 = (oo0o0Oo) mainActivity.f3944OooOo.OooO00o();
                                                        oo0o0oo3.getClass();
                                                        new o0000O0(oo0o0oo3, OooO00o5, false).OooO0o0(new OooOo(mainActivity, OooO0o3, 1));
                                                        return;
                                                    }
                                                    throw new ArrayIndexOutOfBoundsException();
                                                default:
                                                    int i6 = MainActivity.f3943OooOoO0;
                                                    OooO00o.OooOoo0(mainActivity, "this$0");
                                                    o000OOo o000ooo4 = new o000OOo();
                                                    o00Ooo o00ooo3 = o000ooo4.f4281OooO0OO;
                                                    o00ooo3.getClass();
                                                    o0000Oo.OooOOOO.OooO0Oo("Authorization");
                                                    o0000Oo.OooOOOO.OooO0o0("wv7Q909F2rlvMHP00OfCRPcRkGJORFrL", "Authorization");
                                                    o00ooo3.OooO00o("Authorization", "wv7Q909F2rlvMHP00OfCRPcRkGJORFrL");
                                                    o000ooo4.OooO0Oo("https://secure.eup.ai/api/user/profile/detail");
                                                    o0OOO0o OooO00o6 = o000ooo4.OooO00o();
                                                    oo0o0Oo oo0o0oo4 = (oo0o0Oo) mainActivity.f3944OooOo.OooO00o();
                                                    oo0o0oo4.getClass();
                                                    new o0000O0(oo0o0oo4, OooO00o6, false).OooO0o0(new OooOOOO(mainActivity, 2));
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                OooO00o.o000ooo0("binding");
                                throw null;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}