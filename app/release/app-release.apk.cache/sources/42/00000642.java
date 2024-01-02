package o000OO;

import androidx.activity.o0Oo0oo;
import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class OooO0o implements o0000OOO.OooO0O0, Serializable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public transient OooO0o f4865OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final Object f4866OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final Class f4867OooO0OO = o0Oo0oo.class;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final String f4868OooO0Oo = "updateEnabledCallbacks";

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final String f4870OooO0o0 = "updateEnabledCallbacks()V";

    /* renamed from: OooO0o  reason: collision with root package name */
    public final boolean f4869OooO0o = false;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final int f4871OooO0oO = 0;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final int f4872OooO0oo = 0;

    public OooO0o(o0Oo0oo o0oo0oo) {
        this.f4866OooO0O0 = o0oo0oo;
    }

    public final OooO00o OooO0O0() {
        OooO00o oooO0O0;
        Class cls = this.f4867OooO0OO;
        if (cls == null) {
            return null;
        }
        if (this.f4869OooO0o) {
            OooOOO.f4874OooO00o.getClass();
            oooO0O0 = new OooOO0O(cls);
        } else {
            OooOOO.f4874OooO00o.getClass();
            oooO0O0 = new OooO0O0(cls);
        }
        return oooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OooO0o) {
            OooO0o oooO0o = (OooO0o) obj;
            if (this.f4868OooO0Oo.equals(oooO0o.f4868OooO0Oo) && this.f4870OooO0o0.equals(oooO0o.f4870OooO0o0) && this.f4872OooO0oo == oooO0o.f4872OooO0oo && this.f4871OooO0oO == oooO0o.f4871OooO0oO && o0000O00.OooO00o.OooOOO0(this.f4866OooO0O0, oooO0o.f4866OooO0O0) && o0000O00.OooO00o.OooOOO0(OooO0O0(), oooO0o.OooO0O0())) {
                return true;
            }
            return false;
        } else if (!(obj instanceof o0000OOO.OooO0O0)) {
            return false;
        } else {
            OooO0o oooO0o2 = this.f4865OooO00o;
            if (oooO0o2 == null) {
                OooOOO.f4874OooO00o.getClass();
                this.f4865OooO00o = this;
                oooO0o2 = this;
            }
            return obj.equals(oooO0o2);
        }
    }

    public final int hashCode() {
        return this.f4870OooO0o0.hashCode() + ((this.f4868OooO0Oo.hashCode() + (OooO0O0() == null ? 0 : OooO0O0().hashCode() * 31)) * 31);
    }

    public final String toString() {
        OooO0o oooO0o = this.f4865OooO00o;
        if (oooO0o == null) {
            OooOOO.f4874OooO00o.getClass();
            this.f4865OooO00o = this;
            oooO0o = this;
        }
        if (oooO0o != this) {
            return oooO0o.toString();
        }
        String str = this.f4868OooO0Oo;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return OooO0O0.OooO00o.OooO0Oo("function ", str, " (Kotlin reflection is not available)");
    }
}