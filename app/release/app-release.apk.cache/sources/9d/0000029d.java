package androidx.appcompat.widget;

import android.content.res.Resources;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* loaded from: classes.dex */
public final class o000 implements ListAdapter, SpinnerAdapter {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final SpinnerAdapter f2256OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final ListAdapter f2257OooO0O0;

    public o000(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
        this.f2256OooO00o = spinnerAdapter;
        if (spinnerAdapter instanceof ListAdapter) {
            this.f2257OooO0O0 = (ListAdapter) spinnerAdapter;
        }
        if (theme == null || !(spinnerAdapter instanceof ThemedSpinnerAdapter)) {
            return;
        }
        o0000O.OooO00o((ThemedSpinnerAdapter) spinnerAdapter, theme);
    }

    @Override // android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        ListAdapter listAdapter = this.f2257OooO0O0;
        if (listAdapter != null) {
            return listAdapter.areAllItemsEnabled();
        }
        return true;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        SpinnerAdapter spinnerAdapter = this.f2256OooO00o;
        if (spinnerAdapter == null) {
            return 0;
        }
        return spinnerAdapter.getCount();
    }

    @Override // android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        SpinnerAdapter spinnerAdapter = this.f2256OooO00o;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getDropDownView(i, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        SpinnerAdapter spinnerAdapter = this.f2256OooO00o;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getItem(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        SpinnerAdapter spinnerAdapter = this.f2256OooO00o;
        if (spinnerAdapter == null) {
            return -1L;
        }
        return spinnerAdapter.getItemId(i);
    }

    @Override // android.widget.Adapter
    public final int getItemViewType(int i) {
        return 0;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        return getDropDownView(i, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // android.widget.Adapter
    public final boolean hasStableIds() {
        SpinnerAdapter spinnerAdapter = this.f2256OooO00o;
        return spinnerAdapter != null && spinnerAdapter.hasStableIds();
    }

    @Override // android.widget.Adapter
    public final boolean isEmpty() {
        return getCount() == 0;
    }

    @Override // android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        ListAdapter listAdapter = this.f2257OooO0O0;
        if (listAdapter != null) {
            return listAdapter.isEnabled(i);
        }
        return true;
    }

    @Override // android.widget.Adapter
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.f2256OooO00o;
        if (spinnerAdapter != null) {
            spinnerAdapter.registerDataSetObserver(dataSetObserver);
        }
    }

    @Override // android.widget.Adapter
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.f2256OooO00o;
        if (spinnerAdapter != null) {
            spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
        }
    }
}