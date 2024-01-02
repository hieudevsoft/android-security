package o0000o;

import androidx.appcompat.widget.o0OOO0o;
import java.util.List;
import o0000O00.OooO00o;
import o0000Oo.o00000;
import o0000Oo.o0ooOOo;
import o0000o0o.o00000OO;
import o0000o0o.o0000O0;

/* loaded from: classes.dex */
public final class OooOOOO {

    /* renamed from: OooO  reason: collision with root package name */
    public int f4438OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o0000O0 f4439OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final List f4440OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final int f4441OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final o00000OO f4442OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final int f4443OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final o0OOO0o f4444OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final int f4445OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final int f4446OooO0oo;

    public OooOOOO(o0000O0 o0000o02, List list, int i, o00000OO o00000oo2, o0OOO0o o0ooo0o, int i2, int i3, int i4) {
        OooO00o.OooOoo0(o0000o02, "call");
        OooO00o.OooOoo0(list, "interceptors");
        OooO00o.OooOoo0(o0ooo0o, "request");
        this.f4439OooO00o = o0000o02;
        this.f4440OooO0O0 = list;
        this.f4441OooO0OO = i;
        this.f4442OooO0Oo = o00000oo2;
        this.f4444OooO0o0 = o0ooo0o;
        this.f4443OooO0o = i2;
        this.f4445OooO0oO = i3;
        this.f4446OooO0oo = i4;
    }

    public static OooOOOO OooO00o(OooOOOO oooOOOO, int i, o00000OO o00000oo2, o0OOO0o o0ooo0o, int i2) {
        int i3;
        int i4;
        int i5;
        if ((i2 & 1) != 0) {
            i = oooOOOO.f4441OooO0OO;
        }
        int i6 = i;
        if ((i2 & 2) != 0) {
            o00000oo2 = oooOOOO.f4442OooO0Oo;
        }
        o00000OO o00000oo3 = o00000oo2;
        if ((i2 & 4) != 0) {
            o0ooo0o = oooOOOO.f4444OooO0o0;
        }
        o0OOO0o o0ooo0o2 = o0ooo0o;
        if ((i2 & 8) != 0) {
            i3 = oooOOOO.f4443OooO0o;
        } else {
            i3 = 0;
        }
        if ((i2 & 16) != 0) {
            i4 = oooOOOO.f4445OooO0oO;
        } else {
            i4 = 0;
        }
        if ((i2 & 32) != 0) {
            i5 = oooOOOO.f4446OooO0oo;
        } else {
            i5 = 0;
        }
        oooOOOO.getClass();
        OooO00o.OooOoo0(o0ooo0o2, "request");
        return new OooOOOO(oooOOOO.f4439OooO00o, oooOOOO.f4440OooO0O0, i6, o00000oo3, o0ooo0o2, i3, i4, i5);
    }

    public final o00000 OooO0O0(o0OOO0o o0ooo0o) {
        boolean z;
        boolean z2;
        boolean z3;
        OooO00o.OooOoo0(o0ooo0o, "request");
        List list = this.f4440OooO0O0;
        int size = list.size();
        boolean z4 = false;
        int i = this.f4441OooO0OO;
        if (i < size) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f4438OooO++;
            o00000OO o00000oo2 = this.f4442OooO0Oo;
            if (o00000oo2 != null) {
                if (o00000oo2.f4509OooO0OO.OooO0O0((o0ooOOo) o0ooo0o.f2519OooO0O0)) {
                    if (this.f4438OooO == 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        throw new IllegalStateException(("network interceptor " + list.get(i - 1) + " must call proceed() exactly once").toString());
                    }
                } else {
                    throw new IllegalStateException(("network interceptor " + list.get(i - 1) + " must retain the same host and port").toString());
                }
            }
            int i2 = i + 1;
            OooOOOO OooO00o2 = OooO00o(this, i2, null, o0ooo0o, 58);
            o0000Oo.o0OOO0o o0ooo0o2 = (o0000Oo.o0OOO0o) list.get(i);
            o00000 OooO00o3 = o0ooo0o2.OooO00o(OooO00o2);
            if (OooO00o3 != null) {
                if (o00000oo2 != null) {
                    if (i2 < list.size() && OooO00o2.f4438OooO != 1) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!z2) {
                        throw new IllegalStateException(("network interceptor " + o0ooo0o2 + " must call proceed() exactly once").toString());
                    }
                }
                if (OooO00o3.f4244OooO0oO != null) {
                    z4 = true;
                }
                if (z4) {
                    return OooO00o3;
                }
                throw new IllegalStateException(("interceptor " + o0ooo0o2 + " returned a response with no body").toString());
            }
            throw new NullPointerException("interceptor " + o0ooo0o2 + " returned null");
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}