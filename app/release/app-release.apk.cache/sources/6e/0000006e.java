package OooO0oO;

import OooO0Oo.OooO;
import OooO0Oo.OooOOO;
import OooO0Oo.OooOOOO;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* loaded from: classes.dex */
public final class o00oOoo implements o00O, AdapterView.OnItemClickListener {

    /* renamed from: OooO00o  reason: collision with root package name */
    public Context f464OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public LayoutInflater f465OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public o00O00O f466OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public ExpandedMenuView f467OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public o0O0ooO f468OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public oo0oOO0 f469OooO0o0;

    public o00oOoo(Context context) {
        this.f464OooO00o = context;
        this.f465OooO0O0 = LayoutInflater.from(context);
    }

    @Override // OooO0oO.o00O
    public final void OooO00o(o00O00O o00o00o, boolean z) {
        oo0oOO0 oo0ooo0 = this.f469OooO0o0;
        if (oo0ooo0 != null) {
            oo0ooo0.OooO00o(o00o00o, z);
        }
    }

    @Override // OooO0oO.o00O
    public final void OooO0OO() {
        o0O0ooO o0o0ooo = this.f468OooO0o;
        if (o0o0ooo != null) {
            o0o0ooo.notifyDataSetChanged();
        }
    }

    @Override // OooO0oO.o00O
    public final boolean OooO0Oo(o00O00OO o00o00oo) {
        return false;
    }

    @Override // OooO0oO.o00O
    public final boolean OooO0o(o00OO o00oo) {
        if (!o00oo.hasVisibleItems()) {
            return false;
        }
        oOO00O ooo00o = new oOO00O(o00oo);
        Context context = o00oo.f390OooO00o;
        OooOOO oooOOO = new OooOOO(context);
        Object obj = oooOOO.f61OooO0O0;
        OooO oooO = (OooO) obj;
        o00oOoo o00oooo = new o00oOoo(oooO.f44OooO00o);
        ooo00o.f474OooO0OO = o00oooo;
        o00oooo.f469OooO0o0 = ooo00o;
        o00oo.OooO0O0(o00oooo, context);
        o00oOoo o00oooo2 = ooo00o.f474OooO0OO;
        if (o00oooo2.f468OooO0o == null) {
            o00oooo2.f468OooO0o = new o0O0ooO(o00oooo2);
        }
        oooO.f50OooO0oO = o00oooo2.f468OooO0o;
        oooO.f51OooO0oo = ooo00o;
        View view = o00oo.f402OooOOOO;
        if (view != null) {
            oooO.f49OooO0o0 = view;
        } else {
            oooO.f46OooO0OO = o00oo.f401OooOOO;
            ((OooO) obj).f47OooO0Oo = o00oo.OooOOO0;
        }
        oooO.f48OooO0o = ooo00o;
        OooOOOO OooO00o2 = oooOOO.OooO00o();
        ooo00o.f473OooO0O0 = OooO00o2;
        OooO00o2.setOnDismissListener(ooo00o);
        WindowManager.LayoutParams attributes = ooo00o.f473OooO0O0.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        ooo00o.f473OooO0O0.show();
        oo0oOO0 oo0ooo0 = this.f469OooO0o0;
        if (oo0ooo0 != null) {
            oo0ooo0.OooOOOO(o00oo);
            return true;
        }
        return true;
    }

    @Override // OooO0oO.o00O
    public final boolean OooO0oO() {
        return false;
    }

    @Override // OooO0oO.o00O
    public final boolean OooO0oo(o00O00OO o00o00oo) {
        return false;
    }

    @Override // OooO0oO.o00O
    public final void OooOO0(oo0oOO0 oo0ooo0) {
        this.f469OooO0o0 = oo0ooo0;
    }

    @Override // OooO0oO.o00O
    public final void OooOO0O(Context context, o00O00O o00o00o) {
        if (this.f464OooO00o != null) {
            this.f464OooO00o = context;
            if (this.f465OooO0O0 == null) {
                this.f465OooO0O0 = LayoutInflater.from(context);
            }
        }
        this.f466OooO0OO = o00o00o;
        o0O0ooO o0o0ooo = this.f468OooO0o;
        if (o0o0ooo != null) {
            o0o0ooo.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f466OooO0OO.OooOOo0(this.f468OooO0o.getItem(i), this, 0);
    }
}