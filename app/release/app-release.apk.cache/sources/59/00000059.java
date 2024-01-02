package OooO0oO;

import OooO0Oo.o0000OO0;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;

/* loaded from: classes.dex */
public final class o000OOo0 implements Runnable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f351OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ Object f352OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ Object f353OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final /* synthetic */ Object f354OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final /* synthetic */ Object f355OooO0o0;

    public /* synthetic */ o000OOo0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f351OooO00o = i;
        this.f355OooO0o0 = obj;
        this.f352OooO0O0 = obj2;
        this.f353OooO0OO = obj3;
        this.f354OooO0Oo = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f351OooO00o;
        Object obj = this.f354OooO0Oo;
        Object obj2 = this.f353OooO0OO;
        Object obj3 = this.f352OooO0O0;
        switch (i) {
            case 0:
                o00 o00Var = (o00) obj3;
                if (o00Var != null) {
                    o0000OO0 o0000oo02 = (o0000OO0) this.f355OooO0o0;
                    ((o00O0000) o0000oo02.f183OooO0O0).f387OooOoOO = true;
                    o00Var.f326OooO0O0.OooO0OO(false);
                    ((o00O0000) o0000oo02.f183OooO0O0).f387OooOoOO = false;
                }
                MenuItem menuItem = (MenuItem) obj2;
                if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                    ((o00O00O) obj).OooOOo0(menuItem, null, 4);
                    return;
                }
                return;
            default:
                ((androidx.fragment.app.o000O) obj3).getClass();
                androidx.fragment.app.o000O.OooO0oO((View) obj2, (Rect) obj);
                return;
        }
    }
}