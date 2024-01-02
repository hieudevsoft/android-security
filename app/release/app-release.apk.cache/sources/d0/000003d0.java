package com.google.android.material.datepicker;

import java.util.Calendar;

/* loaded from: classes.dex */
public final class OooO00o {

    /* renamed from: OooO0o  reason: collision with root package name */
    public static final long f3358OooO0o;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public static final long f3359OooO0oO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final long f3360OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final long f3361OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public Long f3362OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final int f3363OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final OooO0O0 f3364OooO0o0;

    static {
        o00O0O OooO00o2 = o00O0O.OooO00o(1900, 0);
        Calendar OooO0Oo2 = o0Oo0oo.OooO0Oo(null);
        OooO0Oo2.setTimeInMillis(OooO00o2.f3430OooO0o);
        f3358OooO0o = o0Oo0oo.OooO0O0(OooO0Oo2).getTimeInMillis();
        o00O0O OooO00o3 = o00O0O.OooO00o(2100, 11);
        Calendar OooO0Oo3 = o0Oo0oo.OooO0Oo(null);
        OooO0Oo3.setTimeInMillis(OooO00o3.f3430OooO0o);
        f3359OooO0oO = o0Oo0oo.OooO0O0(OooO0Oo3).getTimeInMillis();
    }

    public OooO00o(OooO0OO oooO0OO) {
        this.f3360OooO00o = f3358OooO0o;
        this.f3361OooO0O0 = f3359OooO0oO;
        this.f3364OooO0o0 = new OooO(Long.MIN_VALUE);
        this.f3360OooO00o = oooO0OO.f3365OooO00o.f3430OooO0o;
        this.f3361OooO0O0 = oooO0OO.f3366OooO0O0.f3430OooO0o;
        this.f3362OooO0OO = Long.valueOf(oooO0OO.f3368OooO0Oo.f3430OooO0o);
        this.f3363OooO0Oo = oooO0OO.f3370OooO0o0;
        this.f3364OooO0o0 = oooO0OO.f3367OooO0OO;
    }
}