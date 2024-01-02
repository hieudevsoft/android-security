package OooO0Oo;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public final class OooO0o implements AdapterView.OnItemClickListener {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f56OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ Object f57OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ Object f58OooO0OO;

    public /* synthetic */ OooO0o(Object obj, int i, Object obj2) {
        this.f56OooO00o = i;
        this.f58OooO0OO = obj;
        this.f57OooO0O0 = obj2;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        int i2 = this.f56OooO00o;
        Object obj = this.f58OooO0OO;
        switch (i2) {
            case 0:
                OooO oooO = (OooO) obj;
                DialogInterface.OnClickListener onClickListener = oooO.f51OooO0oo;
                OooOOO0 oooOOO0 = (OooOOO0) this.f57OooO0O0;
                onClickListener.onClick(oooOOO0.f64OooO0O0, i);
                if (!oooO.f43OooO) {
                    oooOOO0.f64OooO0O0.dismiss();
                    return;
                }
                return;
            default:
                androidx.appcompat.widget.o000O0o o000o0o = (androidx.appcompat.widget.o000O0o) obj;
                o000o0o.f2309Oooo00O.setSelection(i);
                androidx.appcompat.widget.o000O00O o000o00o = o000o0o.f2309Oooo00O;
                if (o000o00o.getOnItemClickListener() != null) {
                    o000o00o.performItemClick(view, i, o000o0o.f2306OooOooO.getItemId(i));
                }
                o000o0o.dismiss();
                return;
        }
    }
}