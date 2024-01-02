package OooO0oO;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public abstract class o00O0OO0 implements o00OO0OO, o00O, AdapterView.OnItemClickListener {

    /* renamed from: OooO00o  reason: collision with root package name */
    public Rect f448OooO00o;

    public static int OooOOO0(o00O000 o00o000, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = o00o000.getCount();
        int i2 = 0;
        int i3 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = o00o000.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = o00o000.getView(i4, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    public static boolean OooOo0(o00O00O o00o00o) {
        int size = o00o00o.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = o00o00o.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // OooO0oO.o00O
    public final boolean OooO0Oo(o00O00OO o00o00oo) {
        return false;
    }

    @Override // OooO0oO.o00O
    public final boolean OooO0oo(o00O00OO o00o00oo) {
        return false;
    }

    @Override // OooO0oO.o00O
    public final void OooOO0O(Context context, o00O00O o00o00o) {
    }

    public abstract void OooOO0o(o00O00O o00o00o);

    public abstract void OooOOO(View view);

    public abstract void OooOOOO(boolean z);

    public abstract void OooOOOo(int i);

    public abstract void OooOOo(PopupWindow.OnDismissListener onDismissListener);

    public abstract void OooOOo0(int i);

    public abstract void OooOOoo(boolean z);

    public abstract void OooOo00(int i);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        o00O000 o00o000;
        int i2;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            o00o000 = (o00O000) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        } else {
            o00o000 = (o00O000) listAdapter;
        }
        o00O00O o00o00o = o00o000.f357OooO00o;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i);
        if (!(this instanceof o00O0000)) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        o00o00o.OooOOo0(menuItem, this, i2);
    }
}