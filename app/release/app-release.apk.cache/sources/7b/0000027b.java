package androidx.appcompat.view.menu;

import OooO0oO.o00O00;
import OooO0oO.o00O00O;
import OooO0oO.o00O00OO;
import OooO0oO.o00OO00O;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.widget.o0oO0O0o;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements o00O00, o00OO00O, AdapterView.OnItemClickListener {

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final int[] f1997OooO0O0 = {16842964, 16843049};

    /* renamed from: OooO00o  reason: collision with root package name */
    public o00O00O f1998OooO00o;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        o0oO0O0o o0oo0o0o = new o0oO0O0o(context, context.obtainStyledAttributes(attributeSet, f1997OooO0O0, 16842868, 0));
        if (o0oo0o0o.OooOO0o(0)) {
            setBackgroundDrawable(o0oo0o0o.OooO0o0(0));
        }
        if (o0oo0o0o.OooOO0o(1)) {
            setDivider(o0oo0o0o.OooO0o0(1));
        }
        o0oo0o0o.OooOOOO();
    }

    @Override // OooO0oO.o00O00
    public final boolean OooO0O0(o00O00OO o00o00oo) {
        return this.f1998OooO00o.OooOOo0(o00o00oo, null, 0);
    }

    @Override // OooO0oO.o00OO00O
    public final void OooO0OO(o00O00O o00o00o) {
        this.f1998OooO00o = o00o00o;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        OooO0O0((o00O00OO) getAdapter().getItem(i));
    }
}