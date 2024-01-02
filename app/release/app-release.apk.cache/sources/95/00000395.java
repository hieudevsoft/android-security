package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements o00O0O {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Object f3062OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final OooO00o f3063OooO0O0;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f3062OooO00o = obj;
        this.f3063OooO0O0 = OooO0OO.f3052OooO0OO.OooO0O0(obj.getClass());
    }

    @Override // androidx.lifecycle.o00O0O
    public final void OooO0O0(o00Ooo o00ooo2, OooOo oooOo) {
        HashMap hashMap = this.f3063OooO0O0.f3048OooO00o;
        Object obj = this.f3062OooO00o;
        OooO00o.OooO00o((List) hashMap.get(oooOo), o00ooo2, oooOo, obj);
        OooO00o.OooO00o((List) hashMap.get(OooOo.ON_ANY), o00ooo2, oooOo, obj);
    }
}