package androidx.appcompat.widget;

import android.view.View;

/* loaded from: classes.dex */
public final class OooOo00 extends o00OO0OO {

    /* renamed from: OooOO0  reason: collision with root package name */
    public final /* synthetic */ int f2127OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public final /* synthetic */ Object f2128OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public final /* synthetic */ View f2129OooOO0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OooOo00(View view, View view2, Object obj, int i) {
        super(view2);
        this.f2127OooOO0 = i;
        this.f2129OooOO0o = view;
        this.f2128OooOO0O = obj;
    }

    @Override // androidx.appcompat.widget.o00OO0OO
    public final OooO0oO.o00OO0OO OooO0O0() {
        switch (this.f2127OooOO0) {
            case 0:
                OooOOO0 oooOOO0 = ((OooOo) this.f2129OooOO0o).f2126OooO0Oo.f2147OooOOoo;
                if (oooOOO0 == null) {
                    return null;
                }
                return oooOOO0.OooO00o();
            default:
                return (o000O0o) this.f2128OooOO0O;
        }
    }

    @Override // androidx.appcompat.widget.o00OO0OO
    public final boolean OooO0OO() {
        int i = this.f2127OooOO0;
        View view = this.f2129OooOO0o;
        switch (i) {
            case 0:
                ((OooOo) view).f2126OooO0Oo.OooOO0o();
                return true;
            default:
                o000O00O o000o00o = (o000O00O) view;
                if (!o000o00o.getInternalPopup().OooO0O0()) {
                    o000o00o.f2297OooO0o.OooO0o(o000OO.OooO0O0(o000o00o), o000OO.OooO00o(o000o00o));
                }
                return true;
        }
    }

    @Override // androidx.appcompat.widget.o00OO0OO
    public final boolean OooO0Oo() {
        switch (this.f2127OooOO0) {
            case 0:
                Oooo000 oooo000 = ((OooOo) this.f2129OooOO0o).f2126OooO0Oo;
                if (oooo000.f2148OooOo0 != null) {
                    return false;
                }
                oooo000.OooO0o0();
                return true;
            default:
                super.OooO0Oo();
                return true;
        }
    }
}