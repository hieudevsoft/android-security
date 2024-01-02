package Oooo0O0;

import OooO0O0.OooO00o;
import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.appcompat.widget.o0O0OOOo;
import androidx.appcompat.widget.o0o0Oo;

/* loaded from: classes.dex */
public abstract class OooOOO extends BaseAdapter implements Filterable, OooOOOO {

    /* renamed from: OooO0oO  reason: collision with root package name */
    public OooOo00 f1451OooO0oO;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public boolean f1446OooO0O0 = true;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public Cursor f1447OooO0OO = null;

    /* renamed from: OooO00o  reason: collision with root package name */
    public boolean f1445OooO00o = false;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public int f1448OooO0Oo = -1;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public OooOOO0 f1450OooO0o0 = new OooOOO0(this);

    /* renamed from: OooO0o  reason: collision with root package name */
    public o0o0Oo f1449OooO0o = new o0o0Oo(1, this);

    public OooOOO(Context context) {
    }

    public abstract void OooO00o(View view, Cursor cursor);

    public void OooO0O0(Cursor cursor) {
        Cursor cursor2 = this.f1447OooO0OO;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                OooOOO0 oooOOO0 = this.f1450OooO0o0;
                if (oooOOO0 != null) {
                    cursor2.unregisterContentObserver(oooOOO0);
                }
                o0o0Oo o0o0oo = this.f1449OooO0o;
                if (o0o0oo != null) {
                    cursor2.unregisterDataSetObserver(o0o0oo);
                }
            }
            this.f1447OooO0OO = cursor;
            if (cursor != null) {
                OooOOO0 oooOOO02 = this.f1450OooO0o0;
                if (oooOOO02 != null) {
                    cursor.registerContentObserver(oooOOO02);
                }
                o0o0Oo o0o0oo2 = this.f1449OooO0o;
                if (o0o0oo2 != null) {
                    cursor.registerDataSetObserver(o0o0oo2);
                }
                this.f1448OooO0Oo = cursor.getColumnIndexOrThrow("_id");
                this.f1445OooO00o = true;
                notifyDataSetChanged();
            } else {
                this.f1448OooO0Oo = -1;
                this.f1445OooO00o = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String OooO0OO(Cursor cursor);

    public abstract View OooO0Oo(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f1445OooO00o || (cursor = this.f1447OooO0OO) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (this.f1445OooO00o) {
            this.f1447OooO0OO.moveToPosition(i);
            if (view == null) {
                o0O0OOOo o0o0oooo = (o0O0OOOo) this;
                view = o0o0oooo.f2458OooOO0.inflate(o0o0oooo.f2456OooO, viewGroup, false);
            }
            OooO00o(view, this.f1447OooO0OO);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f1451OooO0oO == null) {
            this.f1451OooO0oO = new OooOo00(this);
        }
        return this.f1451OooO0oO;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.f1445OooO00o || (cursor = this.f1447OooO0OO) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f1447OooO0OO;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.f1445OooO00o && (cursor = this.f1447OooO0OO) != null && cursor.moveToPosition(i)) {
            return this.f1447OooO0OO.getLong(this.f1448OooO0Oo);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (this.f1445OooO00o) {
            if (this.f1447OooO0OO.moveToPosition(i)) {
                if (view == null) {
                    view = OooO0Oo(viewGroup);
                }
                OooO00o(view, this.f1447OooO0OO);
                return view;
            }
            throw new IllegalStateException(OooO00o.OooO0O0("couldn't move cursor to position ", i));
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}