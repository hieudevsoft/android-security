package OooO0Oo;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class OooOOO implements Oooo000.o000OOo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public int f60OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final Object f61OooO0O0;

    public OooOOO(int i, OooOoo0.o0000[] o0000VarArr) {
        this.f60OooO00o = i;
        this.f61OooO0O0 = o0000VarArr;
    }

    public final OooOOOO OooO00o() {
        int i;
        OooO oooO = (OooO) this.f61OooO0O0;
        OooOOOO oooOOOO = new OooOOOO(oooO.f44OooO00o, this.f60OooO00o);
        View view = oooO.f49OooO0o0;
        OooOOO0 oooOOO0 = oooOOOO.f86OooO0o;
        if (view != null) {
            oooOOO0.f75OooOOOO = view;
        } else {
            CharSequence charSequence = oooO.f47OooO0Oo;
            if (charSequence != null) {
                oooOOO0.f66OooO0Oo = charSequence;
                TextView textView = oooOOO0.OooOOO0;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = oooO.f46OooO0OO;
            if (drawable != null) {
                oooOOO0.f72OooOO0O = drawable;
                oooOOO0.f71OooOO0 = 0;
                ImageView imageView = oooOOO0.f73OooOO0o;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    oooOOO0.f73OooOO0o.setImageDrawable(drawable);
                }
            }
        }
        if (oooO.f50OooO0oO != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) oooO.f45OooO0O0.inflate(oooOOO0.f79OooOOoo, (ViewGroup) null);
            if (oooO.f43OooO) {
                i = oooOOO0.f82OooOo00;
            } else {
                i = oooOOO0.f81OooOo0;
            }
            ListAdapter listAdapter = oooO.f50OooO0oO;
            if (listAdapter == null) {
                listAdapter = new OooOO0O(oooO.f44OooO00o, i);
            }
            oooOOO0.f76OooOOOo = listAdapter;
            oooOOO0.f78OooOOo0 = oooO.f52OooOO0;
            if (oooO.f51OooO0oo != null) {
                alertController$RecycleListView.setOnItemClickListener(new OooO0o(oooO, 0, oooOOO0));
            }
            if (oooO.f43OooO) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            oooOOO0.f68OooO0o0 = alertController$RecycleListView;
        }
        oooO.getClass();
        oooOOOO.setCancelable(true);
        oooO.getClass();
        oooOOOO.setCanceledOnTouchOutside(true);
        oooO.getClass();
        oooOOOO.setOnCancelListener(null);
        oooO.getClass();
        oooOOOO.setOnDismissListener(null);
        DialogInterface.OnKeyListener onKeyListener = oooO.f48OooO0o;
        if (onKeyListener != null) {
            oooOOOO.setOnKeyListener(onKeyListener);
        }
        return oooOOOO;
    }

    public final boolean OooO0O0() {
        return this.f60OooO00o < ((List) this.f61OooO0O0).size();
    }

    public final o0000Oo.o00000OO OooO0OO() {
        if (OooO0O0()) {
            int i = this.f60OooO00o;
            this.f60OooO00o = i + 1;
            return (o0000Oo.o00000OO) ((List) this.f61OooO0O0).get(i);
        }
        throw new NoSuchElementException();
    }

    @Override // Oooo000.o000OOo
    public final boolean OooO0o(View view) {
        ((BottomSheetBehavior) this.f61OooO0O0).OooOooO(this.f60OooO00o);
        return true;
    }

    public OooOOO(Context context) {
        int OooOOOo2 = OooOOOO.OooOOOo(context, 0);
        this.f61OooO0O0 = new OooO(new ContextThemeWrapper(context, OooOOOO.OooOOOo(context, OooOOOo2)));
        this.f60OooO00o = OooOOOo2;
    }

    public OooOOO(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.f61OooO0O0 = bottomSheetBehavior;
        this.f60OooO00o = i;
    }

    public OooOOO(ArrayList arrayList) {
        this.f61OooO0O0 = arrayList;
    }
}