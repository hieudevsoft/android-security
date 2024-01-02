package o0OOO0o;

import OooOooo.o00O0O0;
import OooOooo.o0o0Oo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class o00Ooo extends ArrayAdapter {

    /* renamed from: OooO00o  reason: collision with root package name */
    public ColorStateList f5406OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public ColorStateList f5407OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ oo000o f5408OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Ooo(oo000o oo000oVar, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.f5408OooO0OO = oo000oVar;
        OooO00o();
    }

    public final void OooO00o() {
        boolean z;
        ColorStateList colorStateList;
        boolean z2;
        boolean z3;
        oo000o oo000oVar = this.f5408OooO0OO;
        ColorStateList colorStateList2 = oo000oVar.f5435OooOO0o;
        if (colorStateList2 != null) {
            z = true;
        } else {
            z = false;
        }
        ColorStateList colorStateList3 = null;
        if (!z) {
            colorStateList = null;
        } else {
            int[] iArr = {16842919};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        }
        this.f5407OooO0O0 = colorStateList;
        if (oo000oVar.f5434OooOO0O != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (oo000oVar.f5435OooOO0o != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                int[] iArr2 = {16843623, -16842919};
                int[] iArr3 = {16842913, -16842919};
                colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{OooOo.OooO00o.OooO0O0(oo000oVar.f5435OooOO0o.getColorForState(iArr3, 0), oo000oVar.f5434OooOO0O), OooOo.OooO00o.OooO0O0(oo000oVar.f5435OooOO0o.getColorForState(iArr2, 0), oo000oVar.f5434OooOO0O), oo000oVar.f5434OooOO0O});
            }
        }
        this.f5406OooO00o = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z;
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            oo000o oo000oVar = this.f5408OooO0OO;
            RippleDrawable rippleDrawable = null;
            if (oo000oVar.getText().toString().contentEquals(textView.getText())) {
                if (oo000oVar.f5434OooOO0O != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    ColorDrawable colorDrawable = new ColorDrawable(oo000oVar.f5434OooOO0O);
                    if (this.f5407OooO0O0 != null) {
                        OooOoO0.o0OOO0o.OooO0oo(colorDrawable, this.f5406OooO00o);
                        rippleDrawable = new RippleDrawable(this.f5407OooO0O0, colorDrawable, null);
                    } else {
                        rippleDrawable = colorDrawable;
                    }
                }
            }
            WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
            o00O0O0.OooOOo0(textView, rippleDrawable);
        }
        return view2;
    }
}