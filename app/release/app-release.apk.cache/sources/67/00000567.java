package o00000oo;

import OooOoo.o0ooOOo;
import java.io.Serializable;
import o0000O0O.OooO00o;

/* loaded from: classes.dex */
public final class o00Oo0 implements Serializable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public OooO00o f4102OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public volatile Object f4103OooO0O0 = o0ooOOo.f1229OooO0oo;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final Object f4104OooO0OO = this;

    public o00Oo0(OooO00o oooO00o) {
        this.f4102OooO00o = oooO00o;
    }

    public final Object OooO00o() {
        Object obj;
        Object obj2 = this.f4103OooO0O0;
        o0ooOOo o0ooooo = o0ooOOo.f1229OooO0oo;
        if (obj2 != o0ooooo) {
            return obj2;
        }
        synchronized (this.f4104OooO0OO) {
            obj = this.f4103OooO0O0;
            if (obj == o0ooooo) {
                OooO00o oooO00o = this.f4102OooO00o;
                o0000O00.OooO00o.OooOo(oooO00o);
                obj = oooO00o.OooO00o();
                this.f4103OooO0O0 = obj;
                this.f4102OooO00o = null;
            }
        }
        return obj;
    }

    public final String toString() {
        boolean z;
        if (this.f4103OooO0O0 != o0ooOOo.f1229OooO0oo) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return String.valueOf(OooO00o());
        }
        return "Lazy value not initialized yet.";
    }
}