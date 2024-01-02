package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o0OO000 implements OooO0oO.o00O {

    /* renamed from: OooO00o  reason: collision with root package name */
    public OooO0oO.o00O00O f2484OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public OooO0oO.o00O00OO f2485OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ Toolbar f2486OooO0OO;

    public o0OO000(Toolbar toolbar) {
        this.f2486OooO0OO = toolbar;
    }

    @Override // OooO0oO.o00O
    public final void OooO00o(OooO0oO.o00O00O o00o00o, boolean z) {
    }

    @Override // OooO0oO.o00O
    public final void OooO0OO() {
        if (this.f2485OooO0O0 != null) {
            OooO0oO.o00O00O o00o00o = this.f2484OooO00o;
            boolean z = false;
            if (o00o00o != null) {
                int size = o00o00o.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    } else if (this.f2484OooO00o.getItem(i) == this.f2485OooO0O0) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
            }
            if (z) {
                return;
            }
            OooO0Oo(this.f2485OooO0O0);
        }
    }

    @Override // OooO0oO.o00O
    public final boolean OooO0Oo(OooO0oO.o00O00OO o00o00oo) {
        Toolbar toolbar = this.f2486OooO0OO;
        View view = toolbar.f2196OooO;
        if (view instanceof OooO0o.OooO0o) {
            ((OooO0o.OooO0o) view).OooO0o0();
        }
        toolbar.removeView(toolbar.f2196OooO);
        toolbar.removeView(toolbar.f2204OooO0oo);
        toolbar.f2196OooO = null;
        ArrayList arrayList = toolbar.f2225OooOooo;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                toolbar.addView((View) arrayList.get(size));
            } else {
                arrayList.clear();
                this.f2485OooO0O0 = null;
                toolbar.requestLayout();
                o00o00oo.f438OooOoo = false;
                o00o00oo.f424OooOOO.OooOOOo(false);
                toolbar.OooOOoo();
                return true;
            }
        }
    }

    @Override // OooO0oO.o00O
    public final boolean OooO0o(OooO0oO.o00OO o00oo) {
        return false;
    }

    @Override // OooO0oO.o00O
    public final boolean OooO0oO() {
        return false;
    }

    @Override // OooO0oO.o00O
    public final boolean OooO0oo(OooO0oO.o00O00OO o00o00oo) {
        Toolbar toolbar = this.f2486OooO0OO;
        toolbar.OooO0OO();
        ViewParent parent = toolbar.f2204OooO0oo.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f2204OooO0oo);
            }
            toolbar.addView(toolbar.f2204OooO0oo);
        }
        View actionView = o00o00oo.getActionView();
        toolbar.f2196OooO = actionView;
        this.f2485OooO0O0 = o00o00oo;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f2196OooO);
            }
            o0OO000o o0oo000o = new o0OO000o();
            o0oo000o.f53OooO00o = (toolbar.f2208OooOOO & 112) | 8388611;
            o0oo000o.f2487OooO0O0 = 2;
            toolbar.f2196OooO.setLayoutParams(o0oo000o);
            toolbar.addView(toolbar.f2196OooO);
        }
        int childCount = toolbar.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            View childAt = toolbar.getChildAt(childCount);
            if (((o0OO000o) childAt.getLayoutParams()).f2487OooO0O0 != 2 && childAt != toolbar.f2197OooO00o) {
                toolbar.removeViewAt(childCount);
                toolbar.f2225OooOooo.add(childAt);
            }
        }
        toolbar.requestLayout();
        o00o00oo.f438OooOoo = true;
        o00o00oo.f424OooOOO.OooOOOo(false);
        View view = toolbar.f2196OooO;
        if (view instanceof OooO0o.OooO0o) {
            ((OooO0o.OooO0o) view).OooO00o();
        }
        toolbar.OooOOoo();
        return true;
    }

    @Override // OooO0oO.o00O
    public final void OooOO0O(Context context, OooO0oO.o00O00O o00o00o) {
        OooO0oO.o00O00OO o00o00oo;
        OooO0oO.o00O00O o00o00o2 = this.f2484OooO00o;
        if (o00o00o2 != null && (o00o00oo = this.f2485OooO0O0) != null) {
            o00o00o2.OooO0Oo(o00o00oo);
        }
        this.f2484OooO00o = o00o00o;
    }
}