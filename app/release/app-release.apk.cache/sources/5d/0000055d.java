package o00000oO;

import hieubui.eup.android_app_security.NativeLib;
import java.util.concurrent.TimeUnit;
import o0000O0O.OooO00o;
import o0000Oo.o0OO00O;
import o0000Oo.oo0o0Oo;

/* loaded from: classes.dex */
public final class OooOOO extends o000OO.OooOO0 implements OooO00o {

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final OooOOO f4074OooO0O0 = new OooOOO(0);

    /* renamed from: OooO0OO  reason: collision with root package name */
    public static final OooOOO f4075OooO0OO = new OooOOO(1);

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f4076OooO00o;

    public /* synthetic */ OooOOO(int i) {
        this.f4076OooO00o = i;
    }

    @Override // o0000O0O.OooO00o
    public final Object OooO00o() {
        switch (this.f4076OooO00o) {
            case 0:
                o0OO00O o0oo00o = new o0OO00O(new oo0o0Oo(new o0OO00O()));
                TimeUnit timeUnit = TimeUnit.SECONDS;
                o0000O00.OooO00o.OooOoo0(timeUnit, "unit");
                o0oo00o.f4331OooOoO0 = o0000OoO.OooOO0O.OooO0O0(5L, timeUnit);
                o0oo00o.f4325OooOo = o0000OoO.OooOO0O.OooO0O0(5L, timeUnit);
                o0oo00o.f4330OooOoO = o0000OoO.OooOO0O.OooO0O0(5L, timeUnit);
                o0oo00o.f4329OooOo0o = o0000OoO.OooOO0O.OooO0O0(6L, timeUnit);
                return new oo0o0Oo(o0oo00o);
            default:
                return new NativeLib();
        }
    }
}