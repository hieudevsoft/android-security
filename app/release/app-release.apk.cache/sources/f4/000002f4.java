package androidx.appcompat.widget;

import android.view.MenuItem;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class o0O0oo00 implements o0OoOo0, OooO0oO.o00O000o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ Toolbar f2479OooO00o;

    public /* synthetic */ o0O0oo00(Toolbar toolbar) {
        this.f2479OooO00o = toolbar;
    }

    @Override // OooO0oO.o00O000o
    public final boolean OooO0o0(OooO0oO.o00O00O o00o00o, MenuItem menuItem) {
        this.f2479OooO00o.getClass();
        return false;
    }

    @Override // OooO0oO.o00O000o
    public final void OooOO0(OooO0oO.o00O00O o00o00o) {
        boolean z;
        Toolbar toolbar = this.f2479OooO00o;
        Oooo000 oooo000 = toolbar.f2197OooO00o.f2076OooOo00;
        if (oooo000 != null && oooo000.OooO()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.f2229Oooo00O.f1983OooO0OO).iterator();
            if (it.hasNext()) {
                OooO0O0.OooO00o.OooO0oO(it.next());
                throw null;
            }
        }
    }
}