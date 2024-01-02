package androidx.lifecycle;

import OooO0oo.o00OOO0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o00oO0o extends Oooo0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final boolean f3090OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public OooO.OooO00o f3091OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public Oooo000 f3092OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final WeakReference f3093OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public boolean f3094OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public int f3095OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public boolean f3096OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final ArrayList f3097OooO0oo;

    public o00oO0o(o00Ooo o00ooo2) {
        o0000O00.OooO00o.OooOoo0(o00ooo2, "provider");
        this.f3090OooO00o = true;
        this.f3091OooO0O0 = new OooO.OooO00o();
        this.f3092OooO0OO = Oooo000.INITIALIZED;
        this.f3097OooO0oo = new ArrayList();
        this.f3093OooO0Oo = new WeakReference(o00ooo2);
    }

    @Override // androidx.lifecycle.Oooo0
    public final void OooO00o(o00Oo0 o00oo0) {
        o00Ooo o00ooo2;
        boolean z;
        o0000O00.OooO00o.OooOoo0(o00oo0, "observer");
        OooO0Oo("addObserver");
        Oooo000 oooo000 = this.f3092OooO0OO;
        Oooo000 oooo0002 = Oooo000.DESTROYED;
        if (oooo000 != oooo0002) {
            oooo0002 = Oooo000.INITIALIZED;
        }
        oo000o oo000oVar = new oo000o(o00oo0, oooo0002);
        if (((oo000o) this.f3091OooO0O0.OooO0oo(o00oo0, oo000oVar)) != null || (o00ooo2 = (o00Ooo) this.f3093OooO0Oo.get()) == null) {
            return;
        }
        if (this.f3095OooO0o0 == 0 && !this.f3094OooO0o) {
            z = false;
        } else {
            z = true;
        }
        Oooo000 OooO0OO2 = OooO0OO(o00oo0);
        this.f3095OooO0o0++;
        while (oo000oVar.f3115OooO00o.compareTo(OooO0OO2) < 0 && this.f3091OooO0O0.f2OooO0o0.containsKey(o00oo0)) {
            Oooo000 oooo0003 = oo000oVar.f3115OooO00o;
            ArrayList arrayList = this.f3097OooO0oo;
            arrayList.add(oooo0003);
            OooOOOO oooOOOO = OooOo.Companion;
            Oooo000 oooo0004 = oo000oVar.f3115OooO00o;
            oooOOOO.getClass();
            OooOo OooO00o2 = OooOOOO.OooO00o(oooo0004);
            if (OooO00o2 != null) {
                oo000oVar.OooO00o(o00ooo2, OooO00o2);
                arrayList.remove(arrayList.size() - 1);
                OooO0OO2 = OooO0OO(o00oo0);
            } else {
                throw new IllegalStateException("no event up from " + oo000oVar.f3115OooO00o);
            }
        }
        if (!z) {
            OooO0oo();
        }
        this.f3095OooO0o0--;
    }

    @Override // androidx.lifecycle.Oooo0
    public final void OooO0O0(o00Oo0 o00oo0) {
        o0000O00.OooO00o.OooOoo0(o00oo0, "observer");
        OooO0Oo("removeObserver");
        this.f3091OooO0O0.OooO0oO(o00oo0);
    }

    public final Oooo000 OooO0OO(o00Oo0 o00oo0) {
        OooO.OooO0OO oooO0OO;
        Oooo000 oooo000;
        oo000o oo000oVar;
        OooO.OooO00o oooO00o = this.f3091OooO0O0;
        Oooo000 oooo0002 = null;
        if (oooO00o.f2OooO0o0.containsKey(o00oo0)) {
            oooO0OO = ((OooO.OooO0OO) oooO00o.f2OooO0o0.get(o00oo0)).f7OooO0Oo;
        } else {
            oooO0OO = null;
        }
        if (oooO0OO != null && (oo000oVar = (oo000o) oooO0OO.f5OooO0O0) != null) {
            oooo000 = oo000oVar.f3115OooO00o;
        } else {
            oooo000 = null;
        }
        ArrayList arrayList = this.f3097OooO0oo;
        if (!arrayList.isEmpty()) {
            oooo0002 = (Oooo000) arrayList.get(arrayList.size() - 1);
        }
        Oooo000 oooo0003 = this.f3092OooO0OO;
        o0000O00.OooO00o.OooOoo0(oooo0003, "state1");
        if (oooo000 == null || oooo000.compareTo(oooo0003) >= 0) {
            oooo000 = oooo0003;
        }
        if (oooo0002 == null || oooo0002.compareTo(oooo000) >= 0) {
            return oooo000;
        }
        return oooo0002;
    }

    public final void OooO0Oo(String str) {
        if (this.f3090OooO00o && !o00OOO0.OooOOo0().OooOOo()) {
            throw new IllegalStateException(OooO0O0.OooO00o.OooO0Oo("Method ", str, " must be called on the main thread").toString());
        }
    }

    public final void OooO0o(Oooo000 oooo000) {
        Oooo000 oooo0002 = this.f3092OooO0OO;
        if (oooo0002 == oooo000) {
            return;
        }
        Oooo000 oooo0003 = Oooo000.INITIALIZED;
        Oooo000 oooo0004 = Oooo000.DESTROYED;
        if (!((oooo0002 == oooo0003 && oooo000 == oooo0004) ? false : true)) {
            throw new IllegalStateException(("no event down from " + this.f3092OooO0OO + " in component " + this.f3093OooO0Oo.get()).toString());
        }
        this.f3092OooO0OO = oooo000;
        if (this.f3094OooO0o || this.f3095OooO0o0 != 0) {
            this.f3096OooO0oO = true;
            return;
        }
        this.f3094OooO0o = true;
        OooO0oo();
        this.f3094OooO0o = false;
        if (this.f3092OooO0OO == oooo0004) {
            this.f3091OooO0O0 = new OooO.OooO00o();
        }
    }

    public final void OooO0o0(OooOo oooOo) {
        o0000O00.OooO00o.OooOoo0(oooOo, "event");
        OooO0Oo("handleLifecycleEvent");
        OooO0o(oooOo.OooO00o());
    }

    public final void OooO0oO() {
        Oooo000 oooo000 = Oooo000.CREATED;
        OooO0Oo("setCurrentState");
        OooO0o(oooo000);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0oo() {
        /*
            Method dump skipped, instructions count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.o00oO0o.OooO0oo():void");
    }
}