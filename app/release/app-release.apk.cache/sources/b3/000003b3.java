package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class oo000o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public Oooo000 f3115OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final o00O0O f3116OooO0O0;

    public oo000o(o00Oo0 o00oo0, Oooo000 oooo000) {
        o00O0O reflectiveGenericLifecycleObserver;
        o0000O00.OooO00o.OooOo(o00oo0);
        HashMap hashMap = o0ooOOo.f3113OooO00o;
        boolean z = o00oo0 instanceof o00O0O;
        boolean z2 = o00oo0 instanceof OooO0o;
        if (z && z2) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((OooO0o) o00oo0, (o00O0O) o00oo0);
        } else if (z2) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((OooO0o) o00oo0, null);
        } else if (z) {
            reflectiveGenericLifecycleObserver = (o00O0O) o00oo0;
        } else {
            Class<?> cls = o00oo0.getClass();
            if (o0ooOOo.OooO0O0(cls) == 2) {
                Object obj = o0ooOOo.f3114OooO0O0.get(cls);
                o0000O00.OooO00o.OooOo(obj);
                List list = (List) obj;
                if (list.size() != 1) {
                    int size = list.size();
                    OooOO0O[] oooOO0OArr = new OooOO0O[size];
                    if (size <= 0) {
                        reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(oooOO0OArr);
                    } else {
                        o0ooOOo.OooO00o((Constructor) list.get(0), o00oo0);
                        throw null;
                    }
                } else {
                    o0ooOOo.OooO00o((Constructor) list.get(0), o00oo0);
                    throw null;
                }
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(o00oo0);
            }
        }
        this.f3116OooO0O0 = reflectiveGenericLifecycleObserver;
        this.f3115OooO00o = oooo000;
    }

    public final void OooO00o(o00Ooo o00ooo2, OooOo oooOo) {
        Oooo000 OooO00o2 = oooOo.OooO00o();
        Oooo000 oooo000 = this.f3115OooO00o;
        o0000O00.OooO00o.OooOoo0(oooo000, "state1");
        if (OooO00o2.compareTo(oooo000) < 0) {
            oooo000 = OooO00o2;
        }
        this.f3115OooO00o = oooo000;
        this.f3116OooO0O0.OooO0O0(o00ooo2, oooOo);
        this.f3115OooO00o = OooO00o2;
    }
}