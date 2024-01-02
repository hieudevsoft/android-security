package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import hieubui.eup.android_app_security.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class Oooo000 implements OooO0oO.o00O {

    /* renamed from: OooO  reason: collision with root package name */
    public OooOo f2130OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Context f2131OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public Context f2132OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public OooO0oO.o00O00O f2133OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final LayoutInflater f2134OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public OooO0oO.oo0oOO0 f2136OooO0o0;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public OooO0oO.o00OO00O f2138OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public Drawable f2139OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public boolean f2140OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public boolean f2141OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public int f2142OooOOO;
    public boolean OooOOO0;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public int f2143OooOOOO;

    /* renamed from: OooOOOo  reason: collision with root package name */
    public int f2144OooOOOo;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public boolean f2146OooOOo0;

    /* renamed from: OooOOoo  reason: collision with root package name */
    public OooOOO0 f2147OooOOoo;

    /* renamed from: OooOo0  reason: collision with root package name */
    public OooOOOO f2148OooOo0;

    /* renamed from: OooOo00  reason: collision with root package name */
    public OooOOO0 f2149OooOo00;

    /* renamed from: OooOo0O  reason: collision with root package name */
    public OooOOO f2150OooOo0O;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final int f2135OooO0o = R.layout.abc_action_menu_layout;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final int f2137OooO0oO = R.layout.abc_action_menu_item_layout;

    /* renamed from: OooOOo  reason: collision with root package name */
    public final SparseBooleanArray f2145OooOOo = new SparseBooleanArray();

    /* renamed from: OooOo0o  reason: collision with root package name */
    public final OooO0Oo.o0000OO0 f2151OooOo0o = new OooO0Oo.o0000OO0(4, this);

    public Oooo000(Context context) {
        this.f2131OooO00o = context;
        this.f2134OooO0Oo = LayoutInflater.from(context);
    }

    public final boolean OooO() {
        OooOOO0 oooOOO0 = this.f2147OooOOoo;
        return oooOOO0 != null && oooOOO0.OooO0O0();
    }

    @Override // OooO0oO.o00O
    public final void OooO00o(OooO0oO.o00O00O o00o00o, boolean z) {
        OooO0o0();
        OooOOO0 oooOOO0 = this.f2149OooOo00;
        if (oooOOO0 != null && oooOOO0.OooO0O0()) {
            oooOOO0.f458OooOO0.dismiss();
        }
        OooO0oO.oo0oOO0 oo0ooo0 = this.f2136OooO0o0;
        if (oo0ooo0 != null) {
            oo0ooo0.OooO00o(o00o00o, z);
        }
    }

    public final View OooO0O0(OooO0oO.o00O00OO o00o00oo, View view, ViewGroup viewGroup) {
        OooO0oO.o00OO000 o00oo000;
        View actionView = o00o00oo.getActionView();
        int i = 0;
        if (actionView == null || o00o00oo.OooO0o0()) {
            if (view instanceof OooO0oO.o00OO000) {
                o00oo000 = (OooO0oO.o00OO000) view;
            } else {
                o00oo000 = (OooO0oO.o00OO000) this.f2134OooO0Oo.inflate(this.f2137OooO0oO, viewGroup, false);
            }
            o00oo000.OooO0Oo(o00o00oo);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) o00oo000;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f2138OooO0oo);
            if (this.f2150OooOo0O == null) {
                this.f2150OooOo0O = new OooOOO(this);
            }
            actionMenuItemView.setPopupCallback(this.f2150OooOo0O);
            actionView = (View) o00oo000;
        }
        if (o00o00oo.f438OooOoo) {
            i = 8;
        }
        actionView.setVisibility(i);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!((ActionMenuView) viewGroup).checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(ActionMenuView.OooOO0o(layoutParams));
        }
        return actionView;
    }

    @Override // OooO0oO.o00O
    public final void OooO0OO() {
        int i;
        boolean z;
        OooO0oO.o00O00OO o00o00oo;
        ViewGroup viewGroup = (ViewGroup) this.f2138OooO0oo;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            OooO0oO.o00O00O o00o00o = this.f2133OooO0OO;
            if (o00o00o != null) {
                o00o00o.OooO();
                ArrayList OooOO0o2 = this.f2133OooO0OO.OooOO0o();
                int size = OooOO0o2.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    OooO0oO.o00O00OO o00o00oo2 = (OooO0oO.o00O00OO) OooOO0o2.get(i2);
                    if (o00o00oo2.OooO0o()) {
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt instanceof OooO0oO.o00OO000) {
                            o00o00oo = ((OooO0oO.o00OO000) childAt).getItemData();
                        } else {
                            o00o00oo = null;
                        }
                        View OooO0O02 = OooO0O0(o00o00oo2, childAt, viewGroup);
                        if (o00o00oo2 != o00o00oo) {
                            OooO0O02.setPressed(false);
                            OooO0O02.jumpDrawablesToCurrentState();
                        }
                        if (OooO0O02 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) OooO0O02.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(OooO0O02);
                            }
                            ((ViewGroup) this.f2138OooO0oo).addView(OooO0O02, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f2130OooO) {
                    z = false;
                } else {
                    viewGroup.removeViewAt(i);
                    z = true;
                }
                if (!z) {
                    i++;
                }
            }
        }
        ((View) this.f2138OooO0oo).requestLayout();
        OooO0oO.o00O00O o00o00o2 = this.f2133OooO0OO;
        if (o00o00o2 != null) {
            o00o00o2.OooO();
            ArrayList arrayList2 = o00o00o2.f389OooO;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                OooO0oO.o00O00o0 o00o00o0 = ((OooO0oO.o00O00OO) arrayList2.get(i3)).f437OooOoOO;
            }
        }
        OooO0oO.o00O00O o00o00o3 = this.f2133OooO0OO;
        if (o00o00o3 != null) {
            o00o00o3.OooO();
            arrayList = o00o00o3.f398OooOO0;
        }
        if (this.f2141OooOO0o && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((OooO0oO.o00O00OO) arrayList.get(0)).f438OooOoo;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        OooOo oooOo = this.f2130OooO;
        if (z2) {
            if (oooOo == null) {
                this.f2130OooO = new OooOo(this, this.f2131OooO00o);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f2130OooO.getParent();
            if (viewGroup3 != this.f2138OooO0oo) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f2130OooO);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f2138OooO0oo;
                OooOo oooOo2 = this.f2130OooO;
                actionMenuView.getClass();
                o000oOoO o000oooo = new o000oOoO();
                ((LinearLayout.LayoutParams) o000oooo).gravity = 16;
                o000oooo.f2316OooO00o = true;
                actionMenuView.addView(oooOo2, o000oooo);
            }
        } else if (oooOo != null) {
            ViewParent parent = oooOo.getParent();
            OooO0oO.o00OO00O o00oo00o = this.f2138OooO0oo;
            if (parent == o00oo00o) {
                ((ViewGroup) o00oo00o).removeView(this.f2130OooO);
            }
        }
        ((ActionMenuView) this.f2138OooO0oo).setOverflowReserved(this.f2141OooOO0o);
    }

    @Override // OooO0oO.o00O
    public final /* bridge */ /* synthetic */ boolean OooO0Oo(OooO0oO.o00O00OO o00o00oo) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    @Override // OooO0oO.o00O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooO0o(OooO0oO.o00OO r9) {
        /*
            r8 = this;
            boolean r0 = r9.hasVisibleItems()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = r9
        L9:
            OooO0oO.o00O00O r2 = r0.f461OooOoO
            OooO0oO.o00O00O r3 = r8.f2133OooO0OO
            if (r2 == r3) goto L13
            r0 = r2
            OooO0oO.o00OO r0 = (OooO0oO.o00OO) r0
            goto L9
        L13:
            OooO0oO.o00OO00O r2 = r8.f2138OooO0oo
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 != 0) goto L1a
            goto L38
        L1a:
            int r3 = r2.getChildCount()
            r4 = r1
        L1f:
            if (r4 >= r3) goto L38
            android.view.View r5 = r2.getChildAt(r4)
            boolean r6 = r5 instanceof OooO0oO.o00OO000
            if (r6 == 0) goto L35
            r6 = r5
            OooO0oO.o00OO000 r6 = (OooO0oO.o00OO000) r6
            OooO0oO.o00O00OO r6 = r6.getItemData()
            OooO0oO.o00O00OO r7 = r0.f462OooOoOO
            if (r6 != r7) goto L35
            goto L39
        L35:
            int r4 = r4 + 1
            goto L1f
        L38:
            r5 = 0
        L39:
            if (r5 != 0) goto L3c
            return r1
        L3c:
            OooO0oO.o00O00OO r0 = r9.f462OooOoOO
            r0.getClass()
            int r0 = r9.size()
            r2 = r1
        L46:
            r3 = 1
            if (r2 >= r0) goto L5e
            android.view.MenuItem r4 = r9.getItem(r2)
            boolean r6 = r4.isVisible()
            if (r6 == 0) goto L5b
            android.graphics.drawable.Drawable r4 = r4.getIcon()
            if (r4 == 0) goto L5b
            r0 = r3
            goto L5f
        L5b:
            int r2 = r2 + 1
            goto L46
        L5e:
            r0 = r1
        L5f:
            androidx.appcompat.widget.OooOOO0 r2 = new androidx.appcompat.widget.OooOOO0
            android.content.Context r4 = r8.f2132OooO0O0
            r2.<init>(r8, r4, r9, r5)
            r8.f2149OooOo00 = r2
            r2.f457OooO0oo = r0
            OooO0oO.o00O0OO0 r2 = r2.f458OooOO0
            if (r2 == 0) goto L71
            r2.OooOOOO(r0)
        L71:
            androidx.appcompat.widget.OooOOO0 r0 = r8.f2149OooOo00
            boolean r2 = r0.OooO0O0()
            if (r2 == 0) goto L7b
        L79:
            r1 = r3
            goto L84
        L7b:
            android.view.View r2 = r0.f454OooO0o
            if (r2 != 0) goto L80
            goto L84
        L80:
            r0.OooO0Oo(r1, r1, r1, r1)
            goto L79
        L84:
            if (r1 == 0) goto L8e
            OooO0oO.oo0oOO0 r0 = r8.f2136OooO0o0
            if (r0 == 0) goto L8d
            r0.OooOOOO(r9)
        L8d:
            return r3
        L8e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "MenuPopupHelper cannot be used without an anchor"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Oooo000.OooO0o(OooO0oO.o00OO):boolean");
    }

    public final boolean OooO0o0() {
        OooO0oO.o00OO00O o00oo00o;
        OooOOOO oooOOOO = this.f2148OooOo0;
        if (oooOOOO != null && (o00oo00o = this.f2138OooO0oo) != null) {
            ((View) o00oo00o).removeCallbacks(oooOOOO);
            this.f2148OooOo0 = null;
            return true;
        }
        OooOOO0 oooOOO0 = this.f2147OooOOoo;
        if (oooOOO0 != null) {
            if (oooOOO0.OooO0O0()) {
                oooOOO0.f458OooOO0.dismiss();
            }
            return true;
        }
        return false;
    }

    @Override // OooO0oO.o00O
    public final boolean OooO0oO() {
        int i;
        ArrayList arrayList;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        OooO0oO.o00O00O o00o00o = this.f2133OooO0OO;
        if (o00o00o != null) {
            arrayList = o00o00o.OooOO0o();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = this.f2144OooOOOo;
        int i4 = this.f2143OooOOOO;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f2138OooO0oo;
        int i5 = 0;
        boolean z8 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z = true;
            if (i5 >= i) {
                break;
            }
            OooO0oO.o00O00OO o00o00oo = (OooO0oO.o00O00OO) arrayList.get(i5);
            int i8 = o00o00oo.f436OooOoO0;
            if ((i8 & 2) == 2) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6) {
                i6++;
            } else {
                if ((i8 & 1) == 1) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z7) {
                    i7++;
                } else {
                    z8 = true;
                }
            }
            if (this.f2146OooOOo0 && o00o00oo.f438OooOoo) {
                i3 = 0;
            }
            i5++;
        }
        if (this.f2141OooOO0o && (z8 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = this.f2145OooOOo;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            OooO0oO.o00O00OO o00o00oo2 = (OooO0oO.o00O00OO) arrayList.get(i10);
            int i12 = o00o00oo2.f436OooOoO0;
            if ((i12 & 2) == i2) {
                z2 = z;
            } else {
                z2 = false;
            }
            int i13 = o00o00oo2.f414OooO0O0;
            if (z2) {
                View OooO0O02 = OooO0O0(o00o00oo2, null, viewGroup);
                OooO0O02.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = OooO0O02.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z);
                }
                o00o00oo2.OooO0oO(z);
            } else {
                if ((i12 & 1) == z) {
                    z3 = z;
                } else {
                    z3 = false;
                }
                if (z3) {
                    boolean z9 = sparseBooleanArray.get(i13);
                    if ((i9 > 0 || z9) && i4 > 0) {
                        z4 = z;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        View OooO0O03 = OooO0O0(o00o00oo2, null, viewGroup);
                        OooO0O03.measure(makeMeasureSpec, makeMeasureSpec);
                        int measuredWidth2 = OooO0O03.getMeasuredWidth();
                        i4 -= measuredWidth2;
                        if (i11 == 0) {
                            i11 = measuredWidth2;
                        }
                        if (i4 + i11 > 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        z4 &= z5;
                    }
                    if (z4 && i13 != 0) {
                        sparseBooleanArray.put(i13, true);
                    } else if (z9) {
                        sparseBooleanArray.put(i13, false);
                        for (int i14 = 0; i14 < i10; i14++) {
                            OooO0oO.o00O00OO o00o00oo3 = (OooO0oO.o00O00OO) arrayList.get(i14);
                            if (o00o00oo3.f414OooO0O0 == i13) {
                                if (o00o00oo3.OooO0o()) {
                                    i9++;
                                }
                                o00o00oo3.OooO0oO(false);
                            }
                        }
                    }
                    if (z4) {
                        i9--;
                    }
                    o00o00oo2.OooO0oO(z4);
                } else {
                    o00o00oo2.OooO0oO(false);
                    i10++;
                    i2 = 2;
                    z = true;
                }
            }
            i10++;
            i2 = 2;
            z = true;
        }
        return z;
    }

    @Override // OooO0oO.o00O
    public final /* bridge */ /* synthetic */ boolean OooO0oo(OooO0oO.o00O00OO o00o00oo) {
        return false;
    }

    @Override // OooO0oO.o00O
    public final void OooOO0(OooO0oO.oo0oOO0 oo0ooo0) {
        this.f2136OooO0o0 = oo0ooo0;
    }

    @Override // OooO0oO.o00O
    public final void OooOO0O(Context context, OooO0oO.o00O00O o00o00o) {
        this.f2132OooO0O0 = context;
        LayoutInflater.from(context);
        this.f2133OooO0OO = o00o00o;
        Resources resources = context.getResources();
        if (!this.OooOOO0) {
            this.f2141OooOO0o = true;
        }
        int i = 2;
        this.f2142OooOOO = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && i2 <= 600 && ((i2 <= 960 || i3 <= 720) && (i2 <= 720 || i3 <= 960))) {
            if (i2 < 500 && ((i2 <= 640 || i3 <= 480) && (i2 <= 480 || i3 <= 640))) {
                if (i2 >= 360) {
                    i = 3;
                }
            } else {
                i = 4;
            }
        } else {
            i = 5;
        }
        this.f2144OooOOOo = i;
        int i4 = this.f2142OooOOO;
        if (this.f2141OooOO0o) {
            if (this.f2130OooO == null) {
                OooOo oooOo = new OooOo(this, this.f2131OooO00o);
                this.f2130OooO = oooOo;
                if (this.f2140OooOO0O) {
                    oooOo.setImageDrawable(this.f2139OooOO0);
                    this.f2139OooOO0 = null;
                    this.f2140OooOO0O = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f2130OooO.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.f2130OooO.getMeasuredWidth();
        } else {
            this.f2130OooO = null;
        }
        this.f2143OooOOOO = i4;
        float f = resources.getDisplayMetrics().density;
    }

    public final boolean OooOO0o() {
        OooO0oO.o00O00O o00o00o;
        if (this.f2141OooOO0o && !OooO() && (o00o00o = this.f2133OooO0OO) != null && this.f2138OooO0oo != null && this.f2148OooOo0 == null) {
            o00o00o.OooO();
            if (!o00o00o.f398OooOO0.isEmpty()) {
                OooOOOO oooOOOO = new OooOOOO(this, new OooOOO0(this, this.f2132OooO0O0, this.f2133OooO0OO, this.f2130OooO));
                this.f2148OooOo0 = oooOOOO;
                ((View) this.f2138OooO0oo).post(oooOOOO);
                return true;
            }
            return false;
        }
        return false;
    }
}