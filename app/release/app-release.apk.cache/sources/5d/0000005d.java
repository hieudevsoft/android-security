package OooO0oO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o00O000 extends BaseAdapter {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o00O00O f357OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f358OooO0O0 = -1;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public boolean f359OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final boolean f360OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final int f361OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final LayoutInflater f362OooO0o0;

    public o00O000(o00O00O o00o00o, LayoutInflater layoutInflater, boolean z, int i) {
        this.f360OooO0Oo = z;
        this.f362OooO0o0 = layoutInflater;
        this.f357OooO00o = o00o00o;
        this.f361OooO0o = i;
        OooO00o();
    }

    public final void OooO00o() {
        o00O00O o00o00o = this.f357OooO00o;
        o00O00OO o00o00oo = o00o00o.f410OooOo0O;
        if (o00o00oo != null) {
            o00o00o.OooO();
            ArrayList arrayList = o00o00o.f398OooOO0;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((o00O00OO) arrayList.get(i)) == o00o00oo) {
                    this.f358OooO0O0 = i;
                    return;
                }
            }
        }
        this.f358OooO0O0 = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: OooO0O0 */
    public final o00O00OO getItem(int i) {
        ArrayList OooOO0o2;
        boolean z = this.f360OooO0Oo;
        o00O00O o00o00o = this.f357OooO00o;
        if (z) {
            o00o00o.OooO();
            OooOO0o2 = o00o00o.f398OooOO0;
        } else {
            OooOO0o2 = o00o00o.OooOO0o();
        }
        int i2 = this.f358OooO0O0;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (o00O00OO) OooOO0o2.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList OooOO0o2;
        boolean z = this.f360OooO0Oo;
        o00O00O o00o00o = this.f357OooO00o;
        if (z) {
            o00o00o.OooO();
            OooOO0o2 = o00o00o.f398OooOO0;
        } else {
            OooOO0o2 = o00o00o.OooOO0o();
        }
        int i = this.f358OooO0O0;
        int size = OooOO0o2.size();
        if (i < 0) {
            return size;
        }
        return size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        boolean z = false;
        if (view == null) {
            view = this.f362OooO0o0.inflate(this.f361OooO0o, viewGroup, false);
        }
        int i3 = getItem(i).f414OooO0O0;
        int i4 = i - 1;
        if (i4 >= 0) {
            i2 = getItem(i4).f414OooO0O0;
        } else {
            i2 = i3;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f357OooO00o.OooOOO0() && i3 != i2) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        o00OO000 o00oo000 = (o00OO000) view;
        if (this.f359OooO0OO) {
            listMenuItemView.setForceShowIcon(true);
        }
        o00oo000.OooO0Oo(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        OooO00o();
        super.notifyDataSetChanged();
    }
}