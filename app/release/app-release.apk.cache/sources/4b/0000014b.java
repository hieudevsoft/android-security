package OooOooo;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class o00OO {
    public static String[] OooO00o(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static o000O00 OooO0O0(View view, o000O00 o000o00) {
        ContentInfo OooOOO0 = o000o00.f1275OooO00o.OooOOO0();
        Objects.requireNonNull(OooOOO0);
        ContentInfo OooO0oO2 = o0000OO0.OooO0oO(OooOOO0);
        ContentInfo performReceiveContent = view.performReceiveContent(OooO0oO2);
        if (performReceiveContent == null) {
            return null;
        }
        if (performReceiveContent == OooO0oO2) {
            return o000o00;
        }
        return new o000O00(new OooO0Oo.o0000OO0(performReceiveContent));
    }

    public static void OooO0OO(View view, String[] strArr, o00oOoo o00oooo) {
        if (o00oooo == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new o00OOO00(o00oooo));
        }
    }
}