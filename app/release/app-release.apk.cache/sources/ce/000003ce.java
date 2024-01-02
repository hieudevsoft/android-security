package com.google.android.material.datepicker;

import OooOooo.o0o0Oo;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import hieubui.eup.android_app_security.R;

/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final boolean f3356OooO00o;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        o0Oo0oo.OooO0Oo(null);
        if (o000oOoO.Oooo0OO(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.f3356OooO00o = o000oOoO.Oooo0o0(getContext(), R.attr.nestedScrollable);
        o0o0Oo.OooOO0o(this, new OooOOO(3, this));
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: OooO00o */
    public final o00Oo0 getAdapter2() {
        return (o00Oo0) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter2().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        o00Oo0 adapter2 = getAdapter2();
        adapter2.getClass();
        int max = Math.max(adapter2.OooO00o(), getFirstVisiblePosition());
        int min = Math.min((adapter2.OooO00o() + adapter2.f3435OooO00o.f3431OooO0o0) - 1, getLastVisiblePosition());
        adapter2.getItem(max);
        adapter2.getItem(min);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int OooO00o2;
        if (z) {
            if (i == 33) {
                o00Oo0 adapter2 = getAdapter2();
                OooO00o2 = (adapter2.OooO00o() + adapter2.f3435OooO00o.f3431OooO0o0) - 1;
            } else if (i == 130) {
                OooO00o2 = getAdapter2().OooO00o();
            } else {
                super.onFocusChanged(true, i, rect);
                return;
            }
            setSelection(OooO00o2);
            return;
        }
        super.onFocusChanged(false, i, rect);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (super.onKeyDown(i, keyEvent)) {
            if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter2().OooO00o()) {
                return true;
            }
            if (19 == i) {
                setSelection(getAdapter2().OooO00o());
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.f3356OooO00o) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < getAdapter2().OooO00o()) {
            i = getAdapter2().OooO00o();
        }
        super.setSelection(i);
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof o00Oo0)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), o00Oo0.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}