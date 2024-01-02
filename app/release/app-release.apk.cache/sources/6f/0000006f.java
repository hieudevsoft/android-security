package OooO0oO;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import hieubui.eup.android_app_security.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o0O0ooO extends BaseAdapter {

    /* renamed from: OooO00o  reason: collision with root package name */
    public int f470OooO00o = -1;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ o00oOoo f471OooO0O0;

    public o0O0ooO(o00oOoo o00oooo) {
        this.f471OooO0O0 = o00oooo;
        OooO00o();
    }

    public final void OooO00o() {
        o00O00O o00o00o = this.f471OooO0O0.f466OooO0OO;
        o00O00OO o00o00oo = o00o00o.f410OooOo0O;
        if (o00o00oo != null) {
            o00o00o.OooO();
            ArrayList arrayList = o00o00o.f398OooOO0;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((o00O00OO) arrayList.get(i)) == o00o00oo) {
                    this.f470OooO00o = i;
                    return;
                }
            }
        }
        this.f470OooO00o = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: OooO0O0 */
    public final o00O00OO getItem(int i) {
        o00oOoo o00oooo = this.f471OooO0O0;
        o00O00O o00o00o = o00oooo.f466OooO0OO;
        o00o00o.OooO();
        ArrayList arrayList = o00o00o.f398OooOO0;
        o00oooo.getClass();
        int i2 = i + 0;
        int i3 = this.f470OooO00o;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return (o00O00OO) arrayList.get(i2);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        o00oOoo o00oooo = this.f471OooO0O0;
        o00O00O o00o00o = o00oooo.f466OooO0OO;
        o00o00o.OooO();
        int size = o00o00o.f398OooOO0.size();
        o00oooo.getClass();
        int i = size + 0;
        if (this.f470OooO00o < 0) {
            return i;
        }
        return i - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f471OooO0O0.f465OooO0O0.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((o00OO000) view).OooO0Oo(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        OooO00o();
        super.notifyDataSetChanged();
    }
}