package o0000Oo;

import java.io.Closeable;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import o0000O00.OooO00o;
import o0000Oo0.OooO0O0;

/* loaded from: classes.dex */
public abstract class o00000O implements Closeable {
    public final String OooOo() {
        o0Oo0oo o0oo0oo;
        Charset charset;
        o000O000.OooOOO0 oooOOO0 = ((o00000O0) this).f4267OooO0OO;
        try {
            o00000O0 o00000o02 = (o00000O0) this;
            int i = o00000o02.f4265OooO00o;
            Object obj = o00000o02.f4268OooO0Oo;
            switch (i) {
                case 0:
                    o0oo0oo = (o0Oo0oo) obj;
                    break;
                default:
                    String str = (String) obj;
                    if (str != null) {
                        Pattern pattern = o0Oo0oo.f4335OooO0OO;
                        try {
                            o0oo0oo = OooOOOO.OooOO0O(str);
                            break;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    o0oo0oo = null;
                    break;
            }
            if (o0oo0oo == null || (charset = o0oo0oo.OooO00o(OooO0O0.f4385OooO00o)) == null) {
                charset = OooO0O0.f4385OooO00o;
            }
            String OooOo002 = oooOOO0.OooOo00(o0000OoO.OooOO0O.OooOOo(oooOOO0, charset));
            OooO00o.Oooo00o(oooOOO0, null);
            return OooOo002;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                OooO00o.Oooo00o(oooOOO0, th);
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        o0000OoO.OooOO0O.OooO0OO(((o00000O0) this).f4267OooO0OO);
    }
}