package OooOoo;

import androidx.recyclerview.widget.RecyclerView;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import o0000.OooOOO0;
import o0000O00.OooO00o;
import o0000Oo.OooO;
import o0000Oo.o000oOoO;
import o0000oOO.o000OO;

/* loaded from: classes.dex */
public final class o0ooOOo implements o0OOO0o, OooO, o000oOoO, o0000Oo.o00O0O, o000OO {

    /* renamed from: OooO0o0  reason: collision with root package name */
    public static final o0ooOOo f1227OooO0o0 = new o0ooOOo();

    /* renamed from: OooO0o  reason: collision with root package name */
    public static final o0ooOOo f1226OooO0o = new o0ooOOo();

    /* renamed from: OooO0oO  reason: collision with root package name */
    public static final o0ooOOo f1228OooO0oO = new o0ooOOo();

    /* renamed from: OooO0oo  reason: collision with root package name */
    public static final o0ooOOo f1229OooO0oo = new o0ooOOo();

    /* renamed from: OooO  reason: collision with root package name */
    public static final o0ooOOo f1225OooO = new o0ooOOo();

    public o0ooOOo() {
    }

    @Override // OooOoo.o0OOO0o
    public int OooO00o(CharSequence charSequence, int i) {
        int i2 = i + 0;
        int i3 = 2;
        for (int i4 = 0; i4 < i2 && i3 == 2; i4++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i4));
            o0OO00O o0oo00o = oo0o0Oo.f1234OooO00o;
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            i3 = 2;
                            break;
                    }
                }
                i3 = 0;
            }
            i3 = 1;
        }
        return i3;
    }

    public List OooO0O0(String str) {
        OooO00o.OooOoo0(str, "hostname");
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            OooO00o.OooOoOO(allByName, "getAllByName(hostname)");
            int length = allByName.length;
            if (length != 0) {
                if (length != 1) {
                    return new ArrayList(new OooOOO0(allByName, false));
                }
                return OooO00o.o0000Oo(allByName[0]);
            }
            return o0000.o0OoOo0.f3970OooO00o;
        } catch (NullPointerException e) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
            unknownHostException.initCause(e);
            throw unknownHostException;
        }
    }

    public o0ooOOo(RecyclerView recyclerView) {
    }
}