package o00000oO;

import androidx.appcompat.widget.o0OOooO0;
import com.google.android.material.textview.MaterialTextView;
import hieubui.eup.android_app_security.MainActivity;
import o00000oo.o00Ooo;
import o0000O0O.OooO00o;
import o0000Oo.o00000;
import o0000Oo.o00000O;

/* loaded from: classes.dex */
public final class Oooo000 extends o000OO.OooOO0 implements OooO00o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f4089OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ MainActivity f4090OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ Object f4091OooO0OO;

    public /* synthetic */ Oooo000(MainActivity mainActivity, Object obj, int i) {
        this.f4089OooO00o = i;
        this.f4090OooO0O0 = mainActivity;
        this.f4091OooO0OO = obj;
    }

    @Override // o0000O0O.OooO00o
    public final /* bridge */ /* synthetic */ Object OooO00o() {
        o00Ooo o00ooo2 = o00Ooo.f4105OooO00o;
        switch (this.f4089OooO00o) {
            case 0:
                OooO0OO();
                return o00ooo2;
            default:
                OooO0OO();
                return o00ooo2;
        }
    }

    public final void OooO0OO() {
        int i = this.f4089OooO00o;
        Object obj = this.f4091OooO0OO;
        MainActivity mainActivity = this.f4090OooO0O0;
        String str = null;
        switch (i) {
            case 0:
                o0OOooO0 o0ooooo0 = mainActivity.f3945OooOo0O;
                if (o0ooooo0 != null) {
                    ((MaterialTextView) o0ooooo0.f2529OooO0o).setText((String) obj);
                    o0000O00.OooO00o.o000o0oo(mainActivity, "Update profile successfully~");
                    return;
                }
                o0000O00.OooO00o.o000ooo0("binding");
                throw null;
            default:
                o0OOooO0 o0ooooo02 = mainActivity.f3945OooOo0O;
                if (o0ooooo02 != null) {
                    MaterialTextView materialTextView = (MaterialTextView) o0ooooo02.f2529OooO0o;
                    o00000O o00000o = ((o00000) obj).f4244OooO0oO;
                    if (o00000o != null) {
                        str = o00000o.OooOo();
                    }
                    materialTextView.setText(str);
                    o0000O00.OooO00o.o000o0oo(mainActivity, "Get profile successfully~");
                    return;
                }
                o0000O00.OooO00o.o000ooo0("binding");
                throw null;
        }
    }
}