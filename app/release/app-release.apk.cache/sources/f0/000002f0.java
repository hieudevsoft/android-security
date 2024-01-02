package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* loaded from: classes.dex */
public final class o0O0o extends o00OO000 {

    /* renamed from: OooOOO  reason: collision with root package name */
    public final int f2471OooOOO;
    public final int OooOOO0;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public o0oOO f2472OooOOOO;

    /* renamed from: OooOOOo  reason: collision with root package name */
    public OooO0oO.o00O00OO f2473OooOOOo;

    public o0O0o(Context context, boolean z) {
        super(context, z);
        if (1 == o0oOOo.OooO00o(context.getResources().getConfiguration())) {
            this.OooOOO0 = 21;
            this.f2471OooOOO = 22;
            return;
        }
        this.OooOOO0 = 22;
        this.f2471OooOOO = 21;
    }

    @Override // androidx.appcompat.widget.o00OO000, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        OooO0oO.o00O000 o00o000;
        int i;
        OooO0oO.o00O00OO o00o00oo;
        int pointToPosition;
        int i2;
        if (this.f2472OooOOOO != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                o00o000 = (OooO0oO.o00O000) headerViewListAdapter.getWrappedAdapter();
            } else {
                o00o000 = (OooO0oO.o00O000) adapter;
                i = 0;
            }
            if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < o00o000.getCount()) {
                o00o00oo = o00o000.getItem(i2);
            } else {
                o00o00oo = null;
            }
            OooO0oO.o00O00OO o00o00oo2 = this.f2473OooOOOo;
            if (o00o00oo2 != o00o00oo) {
                OooO0oO.o00O00O o00o00o = o00o000.f357OooO00o;
                if (o00o00oo2 != null) {
                    this.f2472OooOOOO.OooO0oO(o00o00o, o00o00oo2);
                }
                this.f2473OooOOOo = o00o00oo;
                if (o00o00oo != null) {
                    this.f2472OooOOOO.OooOO0O(o00o00o, o00o00oo);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.OooOOO0) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        } else if (listMenuItemView != null && i == this.f2471OooOOO) {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((OooO0oO.o00O000) adapter).f357OooO00o.OooO0OO(false);
            return true;
        } else {
            return super.onKeyDown(i, keyEvent);
        }
    }

    public void setHoverListener(o0oOO o0ooo) {
        this.f2472OooOOOO = o0ooo;
    }

    @Override // androidx.appcompat.widget.o00OO000, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}