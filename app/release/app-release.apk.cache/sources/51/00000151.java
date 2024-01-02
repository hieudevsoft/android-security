package OooOooo;

import Oooo0.o00oO0o;
import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public final class o00OOO00 implements OnReceiveContentListener {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o00oOoo f1301OooO00o;

    public o00OOO00(o00oOoo o00oooo) {
        this.f1301OooO00o = o00oooo;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        o000O00 o000o00 = new o000O00(new OooO0Oo.o0000OO0(contentInfo));
        o000O00 OooO00o2 = ((o00oO0o) this.f1301OooO00o).OooO00o(view, o000o00);
        if (OooO00o2 == null) {
            return null;
        }
        if (OooO00o2 == o000o00) {
            return contentInfo;
        }
        ContentInfo OooOOO0 = OooO00o2.f1275OooO00o.OooOOO0();
        Objects.requireNonNull(OooOOO0);
        return o0000OO0.OooO0oO(OooOOO0);
    }
}