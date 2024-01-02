package androidx.lifecycle;

import OooO0oo.o00OOO0;
import android.view.View;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class o0OO00O {

    /* renamed from: OooOO0  reason: collision with root package name */
    public static final Object f3098OooOO0 = new Object();

    /* renamed from: OooO  reason: collision with root package name */
    public boolean f3099OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Object f3100OooO00o = new Object();

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final OooO.OooOO0O f3101OooO0O0 = new OooO.OooOO0O();

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f3102OooO0OO = 0;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public boolean f3103OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public volatile Object f3104OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public volatile Object f3105OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public int f3106OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public boolean f3107OooO0oo;

    public o0OO00O() {
        Object obj = f3098OooOO0;
        this.f3104OooO0o = obj;
        this.f3105OooO0o0 = obj;
        this.f3106OooO0oO = -1;
    }

    public static void OooO00o(String str) {
        if (o00OOO0.OooOOo0().OooOOo()) {
            return;
        }
        throw new IllegalStateException(OooO0O0.OooO00o.OooO0Oo("Cannot invoke ", str, " on a background thread"));
    }

    public final void OooO0O0(o0Oo0oo o0oo0oo) {
        if (o0oo0oo.f3109OooO0O0) {
            if (!o0oo0oo.OooO0o0()) {
                o0oo0oo.OooO0OO(false);
                return;
            }
            int i = o0oo0oo.f3110OooO0OO;
            int i2 = this.f3106OooO0oO;
            if (i < i2) {
                o0oo0oo.f3110OooO0OO = i2;
                androidx.fragment.app.OooOo oooOo = o0oo0oo.f3108OooO00o;
                Object obj = this.f3105OooO0o0;
                oooOo.getClass();
                if (((o00Ooo) obj) != null) {
                    androidx.fragment.app.Oooo0 oooo0 = (androidx.fragment.app.Oooo0) oooOo.f2791OooO0O0;
                    if (oooo0.OoooOoO) {
                        View OooOoo2 = oooo0.OooOoo();
                        if (OooOoo2.getParent() == null) {
                            if (oooo0.f2802OooooO0 != null) {
                                if (androidx.fragment.app.o0000oo.OooOooo(3)) {
                                    Objects.toString(oooo0.f2802OooooO0);
                                }
                                oooo0.f2802OooooO0.setContentView(OooOoo2);
                                return;
                            }
                            return;
                        }
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                }
            }
        }
    }

    public final void OooO0OO(o0Oo0oo o0oo0oo) {
        if (this.f3107OooO0oo) {
            this.f3099OooO = true;
            return;
        }
        this.f3107OooO0oo = true;
        do {
            this.f3099OooO = false;
            if (o0oo0oo != null) {
                OooO0O0(o0oo0oo);
                o0oo0oo = null;
            } else {
                OooO.OooOO0O oooOO0O = this.f3101OooO0O0;
                oooOO0O.getClass();
                OooO.OooO0o oooO0o = new OooO.OooO0o(oooOO0O);
                oooOO0O.f13OooO0OO.put(oooO0o, Boolean.FALSE);
                while (oooO0o.hasNext()) {
                    OooO0O0((o0Oo0oo) ((Map.Entry) oooO0o.next()).getValue());
                    if (this.f3099OooO) {
                        break;
                    }
                }
            }
        } while (this.f3099OooO);
        this.f3107OooO0oo = false;
    }

    public final void OooO0Oo(androidx.fragment.app.OooOo oooOo) {
        Object obj;
        OooO00o("observeForever");
        o0OOO0o o0ooo0o = new o0OOO0o(this, oooOo);
        OooO.OooOO0O oooOO0O = this.f3101OooO0O0;
        OooO.OooO0OO OooO0o2 = oooOO0O.OooO0o(oooOo);
        if (OooO0o2 != null) {
            obj = OooO0o2.f5OooO0O0;
        } else {
            OooO.OooO0OO oooO0OO = new OooO.OooO0OO(oooOo, o0ooo0o);
            oooOO0O.f14OooO0Oo++;
            OooO.OooO0OO oooO0OO2 = oooOO0O.f12OooO0O0;
            if (oooO0OO2 == null) {
                oooOO0O.f11OooO00o = oooO0OO;
            } else {
                oooO0OO2.f6OooO0OO = oooO0OO;
                oooO0OO.f7OooO0Oo = oooO0OO2;
            }
            oooOO0O.f12OooO0O0 = oooO0OO;
            obj = null;
        }
        o0Oo0oo o0oo0oo = (o0Oo0oo) obj;
        if (!(o0oo0oo instanceof LiveData$LifecycleBoundObserver)) {
            if (o0oo0oo == null) {
                o0ooo0o.OooO0OO(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }

    public final void OooO0o0(Object obj) {
        OooO00o("setValue");
        this.f3106OooO0oO++;
        this.f3105OooO0o0 = obj;
        OooO0OO(null);
    }
}