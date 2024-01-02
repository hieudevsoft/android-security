package androidx.appcompat.widget;

import android.database.DataSetObserver;

/* loaded from: classes.dex */
public final class o0o0Oo extends DataSetObserver {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f2537OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ Object f2538OooO0O0;

    public /* synthetic */ o0o0Oo(int i, Object obj) {
        this.f2537OooO00o = i;
        this.f2538OooO0O0 = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        int i = this.f2537OooO00o;
        Object obj = this.f2538OooO0O0;
        switch (i) {
            case 0:
                o00Oo00 o00oo00 = (o00Oo00) obj;
                if (o00oo00.OooO0O0()) {
                    o00oo00.OooO();
                    return;
                }
                return;
            default:
                Oooo0O0.OooOOO oooOOO = (Oooo0O0.OooOOO) obj;
                oooOOO.f1445OooO00o = true;
                oooOOO.notifyDataSetChanged();
                return;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        int i = this.f2537OooO00o;
        Object obj = this.f2538OooO0O0;
        switch (i) {
            case 0:
                ((o00Oo00) obj).dismiss();
                return;
            default:
                Oooo0O0.OooOOO oooOOO = (Oooo0O0.OooOOO) obj;
                oooOOO.f1445OooO00o = false;
                oooOOO.notifyDataSetInvalidated();
                return;
        }
    }
}