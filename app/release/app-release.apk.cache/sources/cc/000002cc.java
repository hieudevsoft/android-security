package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import hieubui.eup.android_app_security.R;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class o00OO000 extends ListView {

    /* renamed from: OooO  reason: collision with root package name */
    public final boolean f2338OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Rect f2339OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f2340OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f2341OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public int f2342OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public int f2343OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public int f2344OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public oo0oOO0 f2345OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public boolean f2346OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public boolean f2347OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public Oooo0.OooOO0O f2348OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public androidx.activity.OooOOO f2349OooOO0o;

    public o00OO000(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f2339OooO00o = new Rect();
        this.f2340OooO0O0 = 0;
        this.f2341OooO0OO = 0;
        this.f2342OooO0Oo = 0;
        this.f2344OooO0o0 = 0;
        this.f2338OooO = z;
        setCacheColorHint(0);
    }

    public final int OooO00o(int i, int i2) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i3 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i3;
        }
        dividerHeight = (dividerHeight <= 0 || divider == null) ? 0 : 0;
        int count = adapter.getCount();
        int i4 = 0;
        View view = null;
        for (int i5 = 0; i5 < count; i5++) {
            int itemViewType = adapter.getItemViewType(i5);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            view = adapter.getView(i5, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i6 = layoutParams.height;
            view.measure(i, i6 > 0 ? View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i5 > 0) {
                i3 += dividerHeight;
            }
            i3 += view.getMeasuredHeight();
            if (i3 >= i2) {
                return i2;
            }
        }
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0145 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooO0O0(android.view.MotionEvent r17, int r18) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.o00OO000.OooO0O0(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f2339OooO00o;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f2349OooOO0o != null) {
            return;
        }
        super.drawableStateChanged();
        oo0oOO0 oo0ooo0 = this.f2345OooO0oO;
        if (oo0ooo0 != null) {
            oo0ooo0.f2580OooO0O0 = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f2347OooOO0 && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f2338OooO || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f2338OooO || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f2338OooO || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f2338OooO && this.f2346OooO0oo) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f2349OooOO0o = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f2349OooOO0o == null) {
            androidx.activity.OooOOO oooOOO = new androidx.activity.OooOOO(2, this);
            this.f2349OooOO0o = oooOOO;
            post(oooOOO);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
        } else {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i >= 30 && o00O0OO.f2333OooO0Oo) {
                        try {
                            o00O0OO.f2330OooO00o.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                            o00O0OO.f2331OooO0O0.invoke(this, Integer.valueOf(pointToPosition));
                            o00O0OO.f2332OooO0OO.invoke(this, Integer.valueOf(pointToPosition));
                        } catch (IllegalAccessException | InvocationTargetException e) {
                            e.printStackTrace();
                        }
                    } else {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f2347OooOO0 && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f2343OooO0o = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        androidx.activity.OooOOO oooOOO = this.f2349OooOO0o;
        if (oooOOO != null) {
            o00OO000 o00oo000 = (o00OO000) oooOOO.f1921OooO0O0;
            o00oo000.f2349OooOO0o = null;
            o00oo000.removeCallbacks(oooOOO);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f2346OooO0oo = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        oo0oOO0 oo0ooo0 = drawable != null ? new oo0oOO0(drawable) : null;
        this.f2345OooO0oO = oo0ooo0;
        super.setSelector(oo0ooo0);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f2340OooO0O0 = rect.left;
        this.f2341OooO0OO = rect.top;
        this.f2342OooO0Oo = rect.right;
        this.f2344OooO0o0 = rect.bottom;
    }
}