package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class o00Oo00 implements OooO0oO.o00OO0OO {

    /* renamed from: OooOoOO  reason: collision with root package name */
    public static final Method f2372OooOoOO;

    /* renamed from: OooOoo0  reason: collision with root package name */
    public static final Method f2373OooOoo0;

    /* renamed from: OooO  reason: collision with root package name */
    public boolean f2374OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Context f2375OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public ListAdapter f2376OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public o00OO000 f2377OooO0OO;

    /* renamed from: OooO0o  reason: collision with root package name */
    public int f2379OooO0o;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public int f2381OooO0oO;

    /* renamed from: OooOO0  reason: collision with root package name */
    public boolean f2383OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public boolean f2384OooOO0O;

    /* renamed from: OooOOO  reason: collision with root package name */
    public o0o0Oo f2386OooOOO;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public View f2387OooOOOO;

    /* renamed from: OooOOOo  reason: collision with root package name */
    public AdapterView.OnItemClickListener f2388OooOOOo;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f2390OooOOo0;

    /* renamed from: OooOo  reason: collision with root package name */
    public Rect f2392OooOo;

    /* renamed from: OooOo0O  reason: collision with root package name */
    public final Handler f2395OooOo0O;

    /* renamed from: OooOoO  reason: collision with root package name */
    public final o00000O f2397OooOoO;

    /* renamed from: OooOoO0  reason: collision with root package name */
    public boolean f2398OooOoO0;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final int f2378OooO0Oo = -2;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public int f2380OooO0o0 = -2;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final int f2382OooO0oo = 1002;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public int f2385OooOO0o = 0;
    public final int OooOOO0 = Integer.MAX_VALUE;

    /* renamed from: OooOOo  reason: collision with root package name */
    public final o00OO f2389OooOOo = new o00OO(this, 2);

    /* renamed from: OooOOoo  reason: collision with root package name */
    public final o00OOOOo f2391OooOOoo = new o00OOOOo(this);

    /* renamed from: OooOo00  reason: collision with root package name */
    public final o00OOOO0 f2394OooOo00 = new o00OOOO0(this);

    /* renamed from: OooOo0  reason: collision with root package name */
    public final o00OO f2393OooOo0 = new o00OO(this, 1);

    /* renamed from: OooOo0o  reason: collision with root package name */
    public final Rect f2396OooOo0o = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f2372OooOoOO = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                f2373OooOoo0 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
    }

    public o00Oo00(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f2375OooO00o = context;
        this.f2395OooOo0O = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooO0OO.OooO00o.f30OooOOOO, i, i2);
        this.f2379OooO0o = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f2381OooO0oO = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f2374OooO = true;
        }
        obtainStyledAttributes.recycle();
        o00000O o00000o = new o00000O(context, attributeSet, i, i2);
        this.f2397OooOoO = o00000o;
        o00000o.setInputMethodMode(1);
    }

    @Override // OooO0oO.o00OO0OO
    public final void OooO() {
        int i;
        boolean z;
        int makeMeasureSpec;
        int i2;
        int i3;
        boolean z2;
        o00OO000 o00oo000;
        int i4;
        int i5;
        o00OO000 o00oo0002 = this.f2377OooO0OO;
        o00000O o00000o = this.f2397OooOoO;
        int i6 = 0;
        Context context = this.f2375OooO00o;
        if (o00oo0002 == null) {
            o00OO000 OooOOo02 = OooOOo0(context, !this.f2398OooOoO0);
            this.f2377OooO0OO = OooOOo02;
            OooOOo02.setAdapter(this.f2376OooO0O0);
            this.f2377OooO0OO.setOnItemClickListener(this.f2388OooOOOo);
            this.f2377OooO0OO.setFocusable(true);
            this.f2377OooO0OO.setFocusableInTouchMode(true);
            this.f2377OooO0OO.setOnItemSelectedListener(new o00OOO00(0, this));
            this.f2377OooO0OO.setOnScrollListener(this.f2394OooOo00);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f2390OooOOo0;
            if (onItemSelectedListener != null) {
                this.f2377OooO0OO.setOnItemSelectedListener(onItemSelectedListener);
            }
            o00000o.setContentView(this.f2377OooO0OO);
        } else {
            ViewGroup viewGroup = (ViewGroup) o00000o.getContentView();
        }
        Drawable background = o00000o.getBackground();
        Rect rect = this.f2396OooOo0o;
        if (background != null) {
            background.getPadding(rect);
            int i7 = rect.top;
            i = rect.bottom + i7;
            if (!this.f2374OooO) {
                this.f2381OooO0oO = -i7;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        if (o00000o.getInputMethodMode() == 2) {
            z = true;
        } else {
            z = false;
        }
        int OooO00o2 = o00OOO0.OooO00o(o00000o, this.f2387OooOOOO, this.f2381OooO0oO, z);
        int i8 = this.f2378OooO0Oo;
        if (i8 == -1) {
            i3 = OooO00o2 + i;
        } else {
            int i9 = this.f2380OooO0o0;
            if (i9 != -2) {
                if (i9 != -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int OooO00o3 = this.f2377OooO0OO.OooO00o(makeMeasureSpec, OooO00o2 + 0);
            if (OooO00o3 > 0) {
                i2 = this.f2377OooO0OO.getPaddingBottom() + this.f2377OooO0OO.getPaddingTop() + i + 0;
            } else {
                i2 = 0;
            }
            i3 = OooO00o3 + i2;
        }
        if (o00000o.getInputMethodMode() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        Oooo0.Oooo0.OooO0Oo(o00000o, this.f2382OooO0oo);
        if (o00000o.isShowing()) {
            View view = this.f2387OooOOOO;
            WeakHashMap weakHashMap = OooOooo.o0o0Oo.f1363OooO00o;
            if (!OooOooo.oo0o0O0.OooO0O0(view)) {
                return;
            }
            int i10 = this.f2380OooO0o0;
            if (i10 == -1) {
                i10 = -1;
            } else if (i10 == -2) {
                i10 = this.f2387OooOOOO.getWidth();
            }
            if (i8 == -1) {
                if (z2) {
                    i8 = i3;
                } else {
                    i8 = -1;
                }
                int i11 = this.f2380OooO0o0;
                if (z2) {
                    if (i11 == -1) {
                        i5 = -1;
                    } else {
                        i5 = 0;
                    }
                    o00000o.setWidth(i5);
                    o00000o.setHeight(0);
                } else {
                    if (i11 == -1) {
                        i6 = -1;
                    }
                    o00000o.setWidth(i6);
                    o00000o.setHeight(-1);
                }
            } else if (i8 == -2) {
                i8 = i3;
            }
            o00000o.setOutsideTouchable(true);
            View view2 = this.f2387OooOOOO;
            int i12 = this.f2379OooO0o;
            int i13 = this.f2381OooO0oO;
            if (i10 < 0) {
                i10 = -1;
            }
            if (i8 < 0) {
                i4 = -1;
            } else {
                i4 = i8;
            }
            o00000o.update(view2, i12, i13, i10, i4);
            return;
        }
        int i14 = this.f2380OooO0o0;
        if (i14 == -1) {
            i14 = -1;
        } else if (i14 == -2) {
            i14 = this.f2387OooOOOO.getWidth();
        }
        if (i8 == -1) {
            i8 = -1;
        } else if (i8 == -2) {
            i8 = i3;
        }
        o00000o.setWidth(i14);
        o00000o.setHeight(i8);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f2372OooOoOO;
            if (method != null) {
                try {
                    method.invoke(o00000o, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        } else {
            o00OOO0O.OooO0O0(o00000o, true);
        }
        o00000o.setOutsideTouchable(true);
        o00000o.setTouchInterceptor(this.f2391OooOOoo);
        if (this.f2384OooOO0O) {
            Oooo0.Oooo0.OooO0OO(o00000o, this.f2383OooOO0);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f2373OooOoo0;
            if (method2 != null) {
                try {
                    method2.invoke(o00000o, this.f2392OooOo);
                } catch (Exception unused2) {
                }
            }
        } else {
            o00OOO0O.OooO00o(o00000o, this.f2392OooOo);
        }
        Oooo0.Oooo000.OooO00o(o00000o, this.f2387OooOOOO, this.f2379OooO0o, this.f2381OooO0oO, this.f2385OooOO0o);
        this.f2377OooO0OO.setSelection(-1);
        if ((!this.f2398OooOoO0 || this.f2377OooO0OO.isInTouchMode()) && (o00oo000 = this.f2377OooO0OO) != null) {
            o00oo000.setListSelectionHidden(true);
            o00oo000.requestLayout();
        }
        if (!this.f2398OooOoO0) {
            this.f2395OooOo0O.post(this.f2393OooOo0);
        }
    }

    @Override // OooO0oO.o00OO0OO
    public final boolean OooO0O0() {
        return this.f2397OooOoO.isShowing();
    }

    public final void OooO0OO(int i) {
        this.f2379OooO0o = i;
    }

    public final int OooO0Oo() {
        return this.f2379OooO0o;
    }

    @Override // OooO0oO.o00OO0OO
    public final o00OO000 OooO0o0() {
        return this.f2377OooO0OO;
    }

    public final int OooOO0() {
        if (this.f2374OooO) {
            return this.f2381OooO0oO;
        }
        return 0;
    }

    public final void OooOO0o(Drawable drawable) {
        this.f2397OooOoO.setBackgroundDrawable(drawable);
    }

    public final Drawable OooOOO() {
        return this.f2397OooOoO.getBackground();
    }

    public final void OooOOO0(int i) {
        this.f2381OooO0oO = i;
        this.f2374OooO = true;
    }

    public void OooOOOO(ListAdapter listAdapter) {
        o0o0Oo o0o0oo = this.f2386OooOOO;
        if (o0o0oo == null) {
            this.f2386OooOOO = new o0o0Oo(0, this);
        } else {
            ListAdapter listAdapter2 = this.f2376OooO0O0;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(o0o0oo);
            }
        }
        this.f2376OooO0O0 = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2386OooOOO);
        }
        o00OO000 o00oo000 = this.f2377OooO0OO;
        if (o00oo000 != null) {
            o00oo000.setAdapter(this.f2376OooO0O0);
        }
    }

    public final void OooOOo(int i) {
        Drawable background = this.f2397OooOoO.getBackground();
        if (background != null) {
            Rect rect = this.f2396OooOo0o;
            background.getPadding(rect);
            this.f2380OooO0o0 = rect.left + rect.right + i;
            return;
        }
        this.f2380OooO0o0 = i;
    }

    public o00OO000 OooOOo0(Context context, boolean z) {
        return new o00OO000(context, z);
    }

    @Override // OooO0oO.o00OO0OO
    public final void dismiss() {
        o00000O o00000o = this.f2397OooOoO;
        o00000o.dismiss();
        o00000o.setContentView(null);
        this.f2377OooO0OO = null;
        this.f2395OooOo0O.removeCallbacks(this.f2389OooOOo);
    }
}