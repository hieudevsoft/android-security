package androidx.appcompat.widget;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* loaded from: classes.dex */
public final class o0000OO0 implements o000O00, DialogInterface.OnClickListener {

    /* renamed from: OooO00o  reason: collision with root package name */
    public OooO0Oo.OooOOOO f2281OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public ListAdapter f2282OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public CharSequence f2283OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final /* synthetic */ o000O00O f2284OooO0Oo;

    public o0000OO0(o000O00O o000o00o) {
        this.f2284OooO0Oo = o000o00o;
    }

    @Override // androidx.appcompat.widget.o000O00
    public final CharSequence OooO00o() {
        return this.f2283OooO0OO;
    }

    @Override // androidx.appcompat.widget.o000O00
    public final boolean OooO0O0() {
        OooO0Oo.OooOOOO oooOOOO = this.f2281OooO00o;
        if (oooOOOO != null) {
            return oooOOOO.isShowing();
        }
        return false;
    }

    @Override // androidx.appcompat.widget.o000O00
    public final void OooO0OO(int i) {
    }

    @Override // androidx.appcompat.widget.o000O00
    public final int OooO0Oo() {
        return 0;
    }

    @Override // androidx.appcompat.widget.o000O00
    public final void OooO0o(int i, int i2) {
        if (this.f2282OooO0O0 == null) {
            return;
        }
        o000O00O o000o00o = this.f2284OooO0Oo;
        OooO0Oo.OooOOO oooOOO = new OooO0Oo.OooOOO(o000o00o.getPopupContext());
        CharSequence charSequence = this.f2283OooO0OO;
        Object obj = oooOOO.f61OooO0O0;
        if (charSequence != null) {
            ((OooO0Oo.OooO) obj).f47OooO0Oo = charSequence;
        }
        ListAdapter listAdapter = this.f2282OooO0O0;
        int selectedItemPosition = o000o00o.getSelectedItemPosition();
        OooO0Oo.OooO oooO = (OooO0Oo.OooO) obj;
        oooO.f50OooO0oO = listAdapter;
        oooO.f51OooO0oo = this;
        oooO.f52OooOO0 = selectedItemPosition;
        oooO.f43OooO = true;
        OooO0Oo.OooOOOO OooO00o2 = oooOOO.OooO00o();
        this.f2281OooO00o = OooO00o2;
        AlertController$RecycleListView alertController$RecycleListView = OooO00o2.f86OooO0o.f68OooO0o0;
        o000OO.OooO0Oo(alertController$RecycleListView, i);
        o000OO.OooO0OO(alertController$RecycleListView, i2);
        this.f2281OooO00o.show();
    }

    @Override // androidx.appcompat.widget.o000O00
    public final void OooO0oo(CharSequence charSequence) {
        this.f2283OooO0OO = charSequence;
    }

    @Override // androidx.appcompat.widget.o000O00
    public final int OooOO0() {
        return 0;
    }

    @Override // androidx.appcompat.widget.o000O00
    public final void OooOO0o(Drawable drawable) {
    }

    @Override // androidx.appcompat.widget.o000O00
    public final Drawable OooOOO() {
        return null;
    }

    @Override // androidx.appcompat.widget.o000O00
    public final void OooOOO0(int i) {
    }

    @Override // androidx.appcompat.widget.o000O00
    public final void OooOOOO(ListAdapter listAdapter) {
        this.f2282OooO0O0 = listAdapter;
    }

    @Override // androidx.appcompat.widget.o000O00
    public final void OooOOOo(int i) {
    }

    @Override // androidx.appcompat.widget.o000O00
    public final void dismiss() {
        OooO0Oo.OooOOOO oooOOOO = this.f2281OooO00o;
        if (oooOOOO != null) {
            oooOOOO.dismiss();
            this.f2281OooO00o = null;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        o000O00O o000o00o = this.f2284OooO0Oo;
        o000o00o.setSelection(i);
        if (o000o00o.getOnItemClickListener() != null) {
            o000o00o.performItemClick(null, i, this.f2282OooO0O0.getItemId(i));
        }
        dismiss();
    }
}