package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public final class o00OOO00 implements AdapterView.OnItemSelectedListener {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f2361OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ Object f2362OooO0O0;

    public /* synthetic */ o00OOO00(int i, Object obj) {
        this.f2361OooO00o = i;
        this.f2362OooO0O0 = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        o00OO000 o00oo000;
        int i2 = this.f2361OooO00o;
        Object obj = this.f2362OooO0O0;
        switch (i2) {
            case 0:
                if (i != -1 && (o00oo000 = ((o00Oo00) obj).f2377OooO0OO) != null) {
                    o00oo000.setListSelectionHidden(false);
                    return;
                }
                return;
            default:
                ((SearchView) obj).OooOOo0(i);
                return;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}