package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public final class o0O00OOO implements AdapterView.OnItemClickListener {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f2437OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ View f2438OooO0O0;

    public /* synthetic */ o0O00OOO(View view, int i) {
        this.f2437OooO00o = i;
        this.f2438OooO0O0 = view;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        int selectedItemPosition;
        int i2 = this.f2437OooO00o;
        View view2 = this.f2438OooO0O0;
        switch (i2) {
            case 0:
                ((SearchView) view2).OooOOOo(i);
                return;
            default:
                o0OOO0o.oo000o oo000oVar = (o0OOO0o.oo000o) view2;
                View view3 = null;
                if (i < 0) {
                    o00Oo00 o00oo00 = oo000oVar.f5430OooO0o0;
                    if (!o00oo00.OooO0O0()) {
                        item = null;
                    } else {
                        item = o00oo00.f2377OooO0OO.getSelectedItem();
                    }
                } else {
                    item = oo000oVar.getAdapter().getItem(i);
                }
                o0OOO0o.oo000o.OooO00o(oo000oVar, item);
                AdapterView.OnItemClickListener onItemClickListener = oo000oVar.getOnItemClickListener();
                o00Oo00 o00oo002 = oo000oVar.f5430OooO0o0;
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        if (o00oo002.OooO0O0()) {
                            view3 = o00oo002.f2377OooO0OO.getSelectedView();
                        }
                        view = view3;
                        if (!o00oo002.OooO0O0()) {
                            selectedItemPosition = -1;
                        } else {
                            selectedItemPosition = o00oo002.f2377OooO0OO.getSelectedItemPosition();
                        }
                        i = selectedItemPosition;
                        if (!o00oo002.OooO0O0()) {
                            j = Long.MIN_VALUE;
                        } else {
                            j = o00oo002.f2377OooO0OO.getSelectedItemId();
                        }
                    }
                    onItemClickListener.onItemClick(o00oo002.f2377OooO0OO, view, i, j);
                }
                o00oo002.dismiss();
                return;
        }
    }
}