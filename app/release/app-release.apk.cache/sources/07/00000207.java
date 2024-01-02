package OoooOoo;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o0OOo000 implements o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ View f1621OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1622OooO0O0;

    public o0OOo000(View view, ArrayList arrayList) {
        this.f1621OooO00o = view;
        this.f1622OooO0O0 = arrayList;
    }

    @Override // OoooOoo.o
    public final void OooO00o() {
    }

    @Override // OoooOoo.o
    public final void OooO0O0() {
    }

    @Override // OoooOoo.o
    public final void OooO0OO() {
    }

    @Override // OoooOoo.o
    public final void OooO0Oo() {
    }

    @Override // OoooOoo.o
    public final void OooO0o0(oO00000 oo00000) {
        oo00000.OooOo0O(this);
        this.f1621OooO00o.setVisibility(8);
        ArrayList arrayList = this.f1622OooO0O0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
    }
}