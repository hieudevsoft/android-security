package androidx.fragment.app;

import OooOooo.o00O0OO;
import OooOooo.o0o0Oo;
import OooOooo.oo0o0O0;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import hieubui.eup.android_app_security.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class o0000OO0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o000000 f2856OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final o000 f2857OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final o00Oo0 f2858OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public boolean f2859OooO0Oo = false;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public int f2860OooO0o0 = -1;

    public o0000OO0(o000000 o000000Var, o000 o000Var, o00Oo0 o00oo0) {
        this.f2856OooO00o = o000000Var;
        this.f2857OooO0O0 = o000Var;
        this.f2858OooO0OO = o00oo0;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO() {
        /*
            r8 = this;
            r0 = 3
            boolean r1 = androidx.fragment.app.o0000oo.OooOooo(r0)
            androidx.fragment.app.o00Oo0 r2 = r8.f2858OooO0OO
            if (r1 == 0) goto Lc
            java.util.Objects.toString(r2)
        Lc:
            r1 = -1
            r2.f2951OooO00o = r1
            r3 = 0
            r2.f2976OooOoo = r3
            r2.OooOo00()
            boolean r4 = r2.f2976OooOoo
            if (r4 == 0) goto La3
            androidx.fragment.app.o0000oo r4 = r2.f2970OooOo00
            boolean r5 = r4.f2889OooOoo
            if (r5 != 0) goto L29
            r4.OooOO0O()
            androidx.fragment.app.o0000oo r4 = new androidx.fragment.app.o0000oo
            r4.<init>()
            r2.f2970OooOo00 = r4
        L29:
            androidx.fragment.app.o000000 r4 = r8.f2856OooO00o
            r4.OooO0o(r3)
            r2.f2951OooO00o = r1
            r1 = 0
            r2.f2967OooOOoo = r1
            r2.f2969OooOo0 = r1
            r2.f2965OooOOo = r1
            boolean r4 = r2.f2961OooOO0o
            r5 = 1
            if (r4 == 0) goto L47
            int r4 = r2.f2966OooOOo0
            if (r4 <= 0) goto L42
            r4 = r5
            goto L43
        L42:
            r4 = r3
        L43:
            if (r4 != 0) goto L47
            r4 = r5
            goto L48
        L47:
            r4 = r3
        L48:
            if (r4 != 0) goto L61
            androidx.fragment.app.o000 r4 = r8.f2857OooO0O0
            androidx.fragment.app.o0000O0O r4 = r4.f2814OooO0OO
            java.util.HashMap r6 = r4.f2850OooO0OO
            java.lang.String r7 = r2.f2956OooO0o0
            boolean r6 = r6.containsKey(r7)
            if (r6 != 0) goto L59
            goto L5f
        L59:
            boolean r6 = r4.f2852OooO0o
            if (r6 == 0) goto L5f
            boolean r5 = r4.f2854OooO0oO
        L5f:
            if (r5 == 0) goto La2
        L61:
            boolean r0 = androidx.fragment.app.o0000oo.OooOooo(r0)
            if (r0 == 0) goto L6a
            java.util.Objects.toString(r2)
        L6a:
            androidx.lifecycle.o00oO0o r0 = new androidx.lifecycle.o00oO0o
            r0.<init>(r2)
            r2.f2987Oooo0o = r0
            OoooOOO.oo0oO0 r0 = o0ooOO0.OooOOO0.OooO0o0(r2)
            r2.f2980Oooo = r0
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r2.f2956OooO0o0 = r0
            r2.f2960OooOO0O = r3
            r2.f2961OooOO0o = r3
            r2.OooOOO0 = r3
            r2.f2962OooOOO = r3
            r2.f2963OooOOOO = r3
            r2.f2966OooOOo0 = r3
            r2.f2965OooOOo = r1
            androidx.fragment.app.o0000oo r0 = new androidx.fragment.app.o0000oo
            r0.<init>()
            r2.f2970OooOo00 = r0
            r2.f2967OooOOoo = r1
            r2.f2971OooOo0O = r3
            r2.f2972OooOo0o = r3
            r2.f2968OooOo = r1
            r2.f2974OooOoO0 = r3
            r2.f2973OooOoO = r3
        La2:
            return
        La3:
            androidx.fragment.app.o00O000o r0 = new androidx.fragment.app.o00O000o
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Fragment "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r2 = " did not call through to super.onDetach()"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.o0000OO0.OooO():void");
    }

    public final void OooO00o() {
        boolean OooOooo2 = o0000oo.OooOooo(3);
        o00Oo0 o00oo0 = this.f2858OooO0OO;
        if (OooOooo2) {
            Objects.toString(o00oo0);
        }
        Bundle bundle = o00oo0.f2952OooO0O0;
        o00oo0.f2970OooOo00.Oooo0OO();
        o00oo0.f2951OooO00o = 3;
        o00oo0.f2976OooOoo = true;
        if (o0000oo.OooOooo(3)) {
            o00oo0.toString();
        }
        View view = o00oo0.f2979OooOooo;
        if (view != null) {
            Bundle bundle2 = o00oo0.f2952OooO0O0;
            SparseArray<Parcelable> sparseArray = o00oo0.f2953OooO0OO;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                o00oo0.f2953OooO0OO = null;
            }
            if (o00oo0.f2979OooOooo != null) {
                o000OO00 o000oo00 = o00oo0.f2989Oooo0oO;
                o000oo00.f2928OooO0OO.OooO0O0(o00oo0.f2954OooO0Oo);
                o00oo0.f2954OooO0Oo = null;
            }
            o00oo0.f2976OooOoo = false;
            o00oo0.OooOoO0(bundle2);
            if (o00oo0.f2976OooOoo) {
                if (o00oo0.f2979OooOooo != null) {
                    o00oo0.f2989Oooo0oO.OooO0Oo(androidx.lifecycle.OooOo.ON_CREATE);
                }
            } else {
                throw new o00O000o("Fragment " + o00oo0 + " did not call through to super.onViewStateRestored()");
            }
        }
        o00oo0.f2952OooO0O0 = null;
        o0000oo o0000ooVar = o00oo0.f2970OooOo00;
        o0000ooVar.f2888OooOoOO = false;
        o0000ooVar.f2890OooOoo0 = false;
        o0000ooVar.f2896Oooo00o.f2855OooO0oo = false;
        o0000ooVar.OooOOoo(4);
        this.f2856OooO00o.OooO00o(false);
    }

    public final void OooO0O0() {
        View view;
        View view2;
        o000 o000Var = this.f2857OooO0O0;
        o000Var.getClass();
        o00Oo0 o00oo0 = this.f2858OooO0OO;
        ViewGroup viewGroup = o00oo0.f2978OooOooO;
        int i = -1;
        if (viewGroup != null) {
            ArrayList arrayList = o000Var.f2812OooO00o;
            int indexOf = arrayList.indexOf(o00oo0);
            int i2 = indexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        o00Oo0 o00oo02 = (o00Oo0) arrayList.get(indexOf);
                        if (o00oo02.f2978OooOooO == viewGroup && (view = o00oo02.f2979OooOooo) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    o00Oo0 o00oo03 = (o00Oo0) arrayList.get(i2);
                    if (o00oo03.f2978OooOooO == viewGroup && (view2 = o00oo03.f2979OooOooo) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        o00oo0.f2978OooOooO.addView(o00oo0.f2979OooOooo, i);
    }

    public final void OooO0OO() {
        o0000OO0 o0000oo02;
        boolean OooOooo2 = o0000oo.OooOooo(3);
        o00Oo0 o00oo0 = this.f2858OooO0OO;
        if (OooOooo2) {
            Objects.toString(o00oo0);
        }
        o00Oo0 o00oo02 = o00oo0.f2957OooO0oO;
        o000 o000Var = this.f2857OooO0O0;
        if (o00oo02 != null) {
            o0000oo02 = (o0000OO0) o000Var.f2813OooO0O0.get(o00oo02.f2956OooO0o0);
            if (o0000oo02 != null) {
                o00oo0.f2958OooO0oo = o00oo0.f2957OooO0oO.f2956OooO0o0;
                o00oo0.f2957OooO0oO = null;
            } else {
                throw new IllegalStateException("Fragment " + o00oo0 + " declared target fragment " + o00oo0.f2957OooO0oO + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = o00oo0.f2958OooO0oo;
            if (str != null) {
                o0000oo02 = (o0000OO0) o000Var.f2813OooO0O0.get(str);
                if (o0000oo02 == null) {
                    throw new IllegalStateException("Fragment " + o00oo0 + " declared target fragment " + o00oo0.f2958OooO0oo + " that does not belong to this FragmentManager!");
                }
            } else {
                o0000oo02 = null;
            }
        }
        if (o0000oo02 != null) {
            o0000oo02.OooOO0O();
        }
        o0000oo o0000ooVar = o00oo0.f2965OooOOo;
        o00oo0.f2967OooOOoo = o0000ooVar.f2877OooOOOo;
        o00oo0.f2969OooOo0 = o0000ooVar.f2878OooOOo;
        o000000 o000000Var = this.f2856OooO00o;
        o000000Var.OooO0oo(false);
        ArrayList arrayList = o00oo0.f2991OoooO00;
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            arrayList.clear();
            o00oo0.f2970OooOo00.OooO0O0(o00oo0.f2967OooOOoo, o00oo0.OooO0Oo(), o00oo0);
            o00oo0.f2951OooO00o = 0;
            o00oo0.f2976OooOoo = false;
            o00oo0.OooOOOo(o00oo0.f2967OooOOoo.f2994OoooOO0);
            if (o00oo0.f2976OooOoo) {
                Iterator it2 = o00oo0.f2965OooOOo.f2875OooOOO.iterator();
                while (it2.hasNext()) {
                    ((o000OO) it2.next()).OooO0o0();
                }
                o0000oo o0000ooVar2 = o00oo0.f2970OooOo00;
                o0000ooVar2.f2888OooOoOO = false;
                o0000ooVar2.f2890OooOoo0 = false;
                o0000ooVar2.f2896Oooo00o.f2855OooO0oo = false;
                o0000ooVar2.OooOOoo(0);
                o000000Var.OooO0O0(false);
                return;
            }
            throw new o00O000o("Fragment " + o00oo0 + " did not call through to super.onAttach()");
        }
        OooO0O0.OooO00o.OooO0oO(it.next());
        throw null;
    }

    public final int OooO0Oo() {
        o0O0ooO o0o0ooo;
        o00Oo0 o00oo0 = this.f2858OooO0OO;
        if (o00oo0.f2965OooOOo == null) {
            return o00oo0.f2951OooO00o;
        }
        int i = this.f2860OooO0o0;
        int ordinal = o00oo0.f2988Oooo0o0.ordinal();
        boolean z = false;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        i = Math.min(i, -1);
                    }
                } else {
                    i = Math.min(i, 5);
                }
            } else {
                i = Math.min(i, 1);
            }
        } else {
            i = Math.min(i, 0);
        }
        if (o00oo0.OooOOO0) {
            if (o00oo0.f2962OooOOO) {
                i = Math.max(this.f2860OooO0o0, 2);
                View view = o00oo0.f2979OooOooo;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.f2860OooO0o0 < 4 ? Math.min(i, o00oo0.f2951OooO00o) : Math.min(i, 1);
            }
        }
        if (!o00oo0.f2960OooOO0O) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = o00oo0.f2978OooOooO;
        o0O0ooO o0o0ooo2 = null;
        o00O0000 o00o0000 = null;
        if (viewGroup != null) {
            o00O000 OooO0o2 = o00O000.OooO0o(viewGroup, o00oo0.OooOO0O().OooOooO());
            OooO0o2.getClass();
            o00O0000 OooO0Oo2 = OooO0o2.OooO0Oo(o00oo0);
            if (OooO0Oo2 != null) {
                o0o0ooo = OooO0Oo2.f2942OooO0O0;
            } else {
                o0o0ooo = null;
            }
            Iterator it = OooO0o2.f2938OooO0OO.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                o00O0000 o00o00002 = (o00O0000) it.next();
                if (o00o00002.f2943OooO0OO.equals(o00oo0) && !o00o00002.f2945OooO0o) {
                    o00o0000 = o00o00002;
                    break;
                }
            }
            if (o00o0000 != null && (o0o0ooo == null || o0o0ooo == o0O0ooO.NONE)) {
                o0o0ooo2 = o00o0000.f2942OooO0O0;
            } else {
                o0o0ooo2 = o0o0ooo;
            }
        }
        if (o0o0ooo2 == o0O0ooO.ADDING) {
            i = Math.min(i, 6);
        } else if (o0o0ooo2 == o0O0ooO.REMOVING) {
            i = Math.max(i, 3);
        } else if (o00oo0.f2961OooOO0o) {
            if (o00oo0.f2966OooOOo0 > 0) {
                z = true;
            }
            if (z) {
                i = Math.min(i, 1);
            } else {
                i = Math.min(i, -1);
            }
        }
        if (o00oo0.f2982Oooo000 && o00oo0.f2951OooO00o < 5) {
            i = Math.min(i, 4);
        }
        if (o0000oo.OooOooo(2)) {
            Objects.toString(o00oo0);
        }
        return i;
    }

    public final void OooO0o() {
        String str;
        o00Oo0 o00oo0 = this.f2858OooO0OO;
        if (o00oo0.OooOOO0) {
            return;
        }
        if (o0000oo.OooOooo(3)) {
            Objects.toString(o00oo0);
        }
        LayoutInflater OooOo02 = o00oo0.OooOo0(o00oo0.f2952OooO0O0);
        ViewGroup viewGroup = o00oo0.f2978OooOooO;
        if (viewGroup == null) {
            int i = o00oo0.f2972OooOo0o;
            if (i != 0) {
                if (i != -1) {
                    viewGroup = (ViewGroup) o00oo0.f2965OooOOo.f2879OooOOo0.o000OoO(i);
                    if (viewGroup == null && !o00oo0.f2963OooOOOO) {
                        try {
                            str = o00oo0.OooOoo0().getResources().getResourceName(o00oo0.f2972OooOo0o);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(o00oo0.f2972OooOo0o) + " (" + str + ") for fragment " + o00oo0);
                    }
                } else {
                    throw new IllegalArgumentException("Cannot create fragment " + o00oo0 + " for a container view with no id");
                }
            } else {
                viewGroup = null;
            }
        }
        o00oo0.f2978OooOooO = viewGroup;
        o00oo0.OooOoO(OooOo02, viewGroup, o00oo0.f2952OooO0O0);
        View view = o00oo0.f2979OooOooo;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            o00oo0.f2979OooOooo.setTag(R.id.fragment_container_view_tag, o00oo0);
            if (viewGroup != null) {
                OooO0O0();
            }
            if (o00oo0.f2974OooOoO0) {
                o00oo0.f2979OooOooo.setVisibility(8);
            }
            View view2 = o00oo0.f2979OooOooo;
            WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
            if (oo0o0O0.OooO0O0(view2)) {
                o00O0OO.OooO0OO(o00oo0.f2979OooOooo);
            } else {
                View view3 = o00oo0.f2979OooOooo;
                view3.addOnAttachStateChangeListener(new o0O0O00(this, view3));
            }
            o00oo0.f2970OooOo00.OooOOoo(2);
            this.f2856OooO00o.OooOOO(false);
            int visibility = o00oo0.f2979OooOooo.getVisibility();
            o00oo0.OooO0o().f3031OooOOO = o00oo0.f2979OooOooo.getAlpha();
            if (o00oo0.f2978OooOooO != null && visibility == 0) {
                View findFocus = o00oo0.f2979OooOooo.findFocus();
                if (findFocus != null) {
                    o00oo0.OooO0o().f3032OooOOOO = findFocus;
                    if (o0000oo.OooOooo(2)) {
                        findFocus.toString();
                        Objects.toString(o00oo0);
                    }
                }
                o00oo0.f2979OooOooo.setAlpha(0.0f);
            }
        }
        o00oo0.f2951OooO00o = 2;
    }

    public final void OooO0o0() {
        Parcelable parcelable;
        boolean OooOooo2 = o0000oo.OooOooo(3);
        final o00Oo0 o00oo0 = this.f2858OooO0OO;
        if (OooOooo2) {
            Objects.toString(o00oo0);
        }
        if (!o00oo0.f2986Oooo0OO) {
            o000000 o000000Var = this.f2856OooO00o;
            o000000Var.OooO(false);
            Bundle bundle = o00oo0.f2952OooO0O0;
            o00oo0.f2970OooOo00.Oooo0OO();
            o00oo0.f2951OooO00o = 1;
            o00oo0.f2976OooOoo = false;
            o00oo0.f2987Oooo0o.OooO00o(new androidx.lifecycle.o00O0O() { // from class: androidx.fragment.app.Fragment$5
                @Override // androidx.lifecycle.o00O0O
                public final void OooO0O0(androidx.lifecycle.o00Ooo o00ooo2, androidx.lifecycle.OooOo oooOo) {
                    View view;
                    if (oooOo != androidx.lifecycle.OooOo.ON_STOP || (view = o00Oo0.this.f2979OooOooo) == null) {
                        return;
                    }
                    view.cancelPendingInputEvents();
                }
            });
            o00oo0.f2980Oooo.OooO0O0(bundle);
            o00oo0.OooOOo0(bundle);
            o00oo0.f2986Oooo0OO = true;
            if (o00oo0.f2976OooOoo) {
                o00oo0.f2987Oooo0o.OooO0o0(androidx.lifecycle.OooOo.ON_CREATE);
                o000000Var.OooO0Oo(false);
                return;
            }
            throw new o00O000o("Fragment " + o00oo0 + " did not call through to super.onCreate()");
        }
        Bundle bundle2 = o00oo0.f2952OooO0O0;
        if (bundle2 != null && (parcelable = bundle2.getParcelable("android:support:fragments")) != null) {
            o00oo0.f2970OooOo00.Oooo(parcelable);
            o0000oo o0000ooVar = o00oo0.f2970OooOo00;
            o0000ooVar.f2888OooOoOO = false;
            o0000ooVar.f2890OooOoo0 = false;
            o0000ooVar.f2896Oooo00o.f2855OooO0oo = false;
            o0000ooVar.OooOOoo(1);
        }
        o00oo0.f2951OooO00o = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0oO() {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.o0000OO0.OooO0oO():void");
    }

    public final void OooO0oo() {
        View view;
        boolean OooOooo2 = o0000oo.OooOooo(3);
        o00Oo0 o00oo0 = this.f2858OooO0OO;
        if (OooOooo2) {
            Objects.toString(o00oo0);
        }
        ViewGroup viewGroup = o00oo0.f2978OooOooO;
        if (viewGroup != null && (view = o00oo0.f2979OooOooo) != null) {
            viewGroup.removeView(view);
        }
        o00oo0.OooOoOO();
        this.f2856OooO00o.OooOOOO(false);
        o00oo0.f2978OooOooO = null;
        o00oo0.f2979OooOooo = null;
        o00oo0.f2989Oooo0oO = null;
        o00oo0.f2990Oooo0oo.OooO0o0(null);
        o00oo0.f2962OooOOO = false;
    }

    public final void OooOO0() {
        o00Oo0 o00oo0 = this.f2858OooO0OO;
        if (o00oo0.OooOOO0 && o00oo0.f2962OooOOO && !o00oo0.f2964OooOOOo) {
            if (o0000oo.OooOooo(3)) {
                Objects.toString(o00oo0);
            }
            o00oo0.OooOoO(o00oo0.OooOo0(o00oo0.f2952OooO0O0), null, o00oo0.f2952OooO0O0);
            View view = o00oo0.f2979OooOooo;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                o00oo0.f2979OooOooo.setTag(R.id.fragment_container_view_tag, o00oo0);
                if (o00oo0.f2974OooOoO0) {
                    o00oo0.f2979OooOooo.setVisibility(8);
                }
                o00oo0.f2970OooOo00.OooOOoo(2);
                this.f2856OooO00o.OooOOO(false);
                o00oo0.f2951OooO00o = 2;
            }
        }
    }

    public final void OooOO0O() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z = this.f2859OooO0Oo;
        o00Oo0 o00oo0 = this.f2858OooO0OO;
        if (z) {
            if (o0000oo.OooOooo(2)) {
                Objects.toString(o00oo0);
                return;
            }
            return;
        }
        try {
            this.f2859OooO0Oo = true;
            while (true) {
                int OooO0Oo2 = OooO0Oo();
                int i = o00oo0.f2951OooO00o;
                if (OooO0Oo2 != i) {
                    if (OooO0Oo2 > i) {
                        switch (i + 1) {
                            case 0:
                                OooO0OO();
                                continue;
                            case 1:
                                OooO0o0();
                                continue;
                            case 2:
                                OooOO0();
                                OooO0o();
                                continue;
                            case 3:
                                OooO00o();
                                continue;
                            case 4:
                                if (o00oo0.f2979OooOooo != null && (viewGroup2 = o00oo0.f2978OooOooO) != null) {
                                    o00O000 OooO0o2 = o00O000.OooO0o(viewGroup2, o00oo0.OooOO0O().OooOooO());
                                    o00oOoo OooO0O02 = o00oOoo.OooO0O0(o00oo0.f2979OooOooo.getVisibility());
                                    OooO0o2.getClass();
                                    if (o0000oo.OooOooo(2)) {
                                        Objects.toString(o00oo0);
                                    }
                                    OooO0o2.OooO00o(OooO0O02, o0O0ooO.ADDING, this);
                                }
                                o00oo0.f2951OooO00o = 4;
                                continue;
                            case o00000.o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                                OooOOOo();
                                continue;
                            case 6:
                                o00oo0.f2951OooO00o = 6;
                                continue;
                            case 7:
                                OooOOO();
                                continue;
                            default:
                                continue;
                        }
                    } else {
                        switch (i - 1) {
                            case -1:
                                OooO();
                                continue;
                            case 0:
                                OooO0oO();
                                continue;
                            case 1:
                                OooO0oo();
                                o00oo0.f2951OooO00o = 1;
                                continue;
                            case 2:
                                o00oo0.f2962OooOOO = false;
                                o00oo0.f2951OooO00o = 2;
                                continue;
                            case 3:
                                if (o0000oo.OooOooo(3)) {
                                    Objects.toString(o00oo0);
                                }
                                if (o00oo0.f2979OooOooo != null && o00oo0.f2953OooO0OO == null) {
                                    OooOOOO();
                                }
                                if (o00oo0.f2979OooOooo != null && (viewGroup3 = o00oo0.f2978OooOooO) != null) {
                                    o00O000 OooO0o3 = o00O000.OooO0o(viewGroup3, o00oo0.OooOO0O().OooOooO());
                                    OooO0o3.getClass();
                                    if (o0000oo.OooOooo(2)) {
                                        Objects.toString(o00oo0);
                                    }
                                    OooO0o3.OooO00o(o00oOoo.REMOVED, o0O0ooO.REMOVING, this);
                                }
                                o00oo0.f2951OooO00o = 3;
                                continue;
                            case 4:
                                OooOOo0();
                                continue;
                            case o00000.o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                                o00oo0.f2951OooO00o = 5;
                                continue;
                            case 6:
                                OooOO0o();
                                continue;
                            default:
                                continue;
                        }
                    }
                } else {
                    if (o00oo0.f2981Oooo0) {
                        if (o00oo0.f2979OooOooo != null && (viewGroup = o00oo0.f2978OooOooO) != null) {
                            o00O000 OooO0o4 = o00O000.OooO0o(viewGroup, o00oo0.OooOO0O().OooOooO());
                            boolean z2 = o00oo0.f2974OooOoO0;
                            o0O0ooO o0o0ooo = o0O0ooO.NONE;
                            if (z2) {
                                OooO0o4.getClass();
                                if (o0000oo.OooOooo(2)) {
                                    Objects.toString(o00oo0);
                                }
                                OooO0o4.OooO00o(o00oOoo.GONE, o0o0ooo, this);
                            } else {
                                OooO0o4.getClass();
                                if (o0000oo.OooOooo(2)) {
                                    Objects.toString(o00oo0);
                                }
                                OooO0o4.OooO00o(o00oOoo.VISIBLE, o0o0ooo, this);
                            }
                        }
                        o0000oo o0000ooVar = o00oo0.f2965OooOOo;
                        if (o0000ooVar != null && o00oo0.f2960OooOO0O && o0000oo.Oooo000(o00oo0)) {
                            o0000ooVar.f2886OooOoO = true;
                        }
                        o00oo0.f2981Oooo0 = false;
                    }
                    return;
                }
            }
        } finally {
            this.f2859OooO0Oo = false;
        }
    }

    public final void OooOO0o() {
        boolean OooOooo2 = o0000oo.OooOooo(3);
        o00Oo0 o00oo0 = this.f2858OooO0OO;
        if (OooOooo2) {
            Objects.toString(o00oo0);
        }
        o00oo0.f2970OooOo00.OooOOoo(5);
        if (o00oo0.f2979OooOooo != null) {
            o00oo0.f2989Oooo0oO.OooO0Oo(androidx.lifecycle.OooOo.ON_PAUSE);
        }
        o00oo0.f2987Oooo0o.OooO0o0(androidx.lifecycle.OooOo.ON_PAUSE);
        o00oo0.f2951OooO00o = 6;
        o00oo0.f2976OooOoo = true;
        this.f2856OooO00o.OooO0oO(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooOOO() {
        /*
            r7 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.o0000oo.OooOooo(r0)
            androidx.fragment.app.o00Oo0 r1 = r7.f2858OooO0OO
            if (r0 == 0) goto Lc
            java.util.Objects.toString(r1)
        Lc:
            androidx.fragment.app.o0OoOo0 r0 = r1.f2984Oooo00o
            r2 = 0
            if (r0 != 0) goto L13
            r0 = r2
            goto L15
        L13:
            android.view.View r0 = r0.f3032OooOOOO
        L15:
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L4b
            android.view.View r5 = r1.f2979OooOooo
            if (r0 != r5) goto L1e
            goto L28
        L1e:
            android.view.ViewParent r5 = r0.getParent()
        L22:
            if (r5 == 0) goto L2f
            android.view.View r6 = r1.f2979OooOooo
            if (r5 != r6) goto L2a
        L28:
            r5 = r4
            goto L30
        L2a:
            android.view.ViewParent r5 = r5.getParent()
            goto L22
        L2f:
            r5 = r3
        L30:
            if (r5 == 0) goto L4b
            r0.requestFocus()
            r5 = 2
            boolean r5 = androidx.fragment.app.o0000oo.OooOooo(r5)
            if (r5 == 0) goto L4b
            r0.toString()
            java.util.Objects.toString(r1)
            android.view.View r0 = r1.f2979OooOooo
            android.view.View r0 = r0.findFocus()
            java.util.Objects.toString(r0)
        L4b:
            androidx.fragment.app.o0OoOo0 r0 = r1.OooO0o()
            r0.f3032OooOOOO = r2
            androidx.fragment.app.o0000oo r0 = r1.f2970OooOo00
            r0.Oooo0OO()
            androidx.fragment.app.o0000oo r0 = r1.f2970OooOo00
            r0.OooOo(r4)
            r0 = 7
            r1.f2951OooO00o = r0
            r1.f2976OooOoo = r4
            androidx.lifecycle.o00oO0o r4 = r1.f2987Oooo0o
            androidx.lifecycle.OooOo r5 = androidx.lifecycle.OooOo.ON_RESUME
            r4.OooO0o0(r5)
            android.view.View r4 = r1.f2979OooOooo
            if (r4 == 0) goto L72
            androidx.fragment.app.o000OO00 r4 = r1.f2989Oooo0oO
            androidx.lifecycle.o00oO0o r4 = r4.f2927OooO0O0
            r4.OooO0o0(r5)
        L72:
            androidx.fragment.app.o0000oo r4 = r1.f2970OooOo00
            r4.f2888OooOoOO = r3
            r4.f2890OooOoo0 = r3
            androidx.fragment.app.o0000O0O r5 = r4.f2896Oooo00o
            r5.f2855OooO0oo = r3
            r4.OooOOoo(r0)
            androidx.fragment.app.o000000 r0 = r7.f2856OooO00o
            r0.OooOO0(r3)
            r1.f2952OooO0O0 = r2
            r1.f2953OooO0OO = r2
            r1.f2954OooO0Oo = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.o0000OO0.OooOOO():void");
    }

    public final void OooOOO0(ClassLoader classLoader) {
        o00Oo0 o00oo0 = this.f2858OooO0OO;
        Bundle bundle = o00oo0.f2952OooO0O0;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        o00oo0.f2953OooO0OO = o00oo0.f2952OooO0O0.getSparseParcelableArray("android:view_state");
        o00oo0.f2954OooO0Oo = o00oo0.f2952OooO0O0.getBundle("android:view_registry_state");
        String string = o00oo0.f2952OooO0O0.getString("android:target_state");
        o00oo0.f2958OooO0oo = string;
        if (string != null) {
            o00oo0.f2950OooO = o00oo0.f2952OooO0O0.getInt("android:target_req_state", 0);
        }
        boolean z = o00oo0.f2952OooO0O0.getBoolean("android:user_visible_hint", true);
        o00oo0.f2983Oooo00O = z;
        if (z) {
            return;
        }
        o00oo0.f2982Oooo000 = true;
    }

    public final void OooOOOO() {
        o00Oo0 o00oo0 = this.f2858OooO0OO;
        if (o00oo0.f2979OooOooo == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        o00oo0.f2979OooOooo.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            o00oo0.f2953OooO0OO = sparseArray;
        }
        Bundle bundle = new Bundle();
        o00oo0.f2989Oooo0oO.f2928OooO0OO.OooO0OO(bundle);
        if (!bundle.isEmpty()) {
            o00oo0.f2954OooO0Oo = bundle;
        }
    }

    public final void OooOOOo() {
        boolean OooOooo2 = o0000oo.OooOooo(3);
        o00Oo0 o00oo0 = this.f2858OooO0OO;
        if (OooOooo2) {
            Objects.toString(o00oo0);
        }
        o00oo0.f2970OooOo00.Oooo0OO();
        o00oo0.f2970OooOo00.OooOo(true);
        o00oo0.f2951OooO00o = 5;
        o00oo0.f2976OooOoo = false;
        o00oo0.OooOo0o();
        if (o00oo0.f2976OooOoo) {
            androidx.lifecycle.o00oO0o o00oo0o = o00oo0.f2987Oooo0o;
            androidx.lifecycle.OooOo oooOo = androidx.lifecycle.OooOo.ON_START;
            o00oo0o.OooO0o0(oooOo);
            if (o00oo0.f2979OooOooo != null) {
                o00oo0.f2989Oooo0oO.f2927OooO0O0.OooO0o0(oooOo);
            }
            o0000oo o0000ooVar = o00oo0.f2970OooOo00;
            o0000ooVar.f2888OooOoOO = false;
            o0000ooVar.f2890OooOoo0 = false;
            o0000ooVar.f2896Oooo00o.f2855OooO0oo = false;
            o0000ooVar.OooOOoo(5);
            this.f2856OooO00o.OooOO0o(false);
            return;
        }
        throw new o00O000o("Fragment " + o00oo0 + " did not call through to super.onStart()");
    }

    public final void OooOOo0() {
        boolean OooOooo2 = o0000oo.OooOooo(3);
        o00Oo0 o00oo0 = this.f2858OooO0OO;
        if (OooOooo2) {
            Objects.toString(o00oo0);
        }
        o0000oo o0000ooVar = o00oo0.f2970OooOo00;
        o0000ooVar.f2890OooOoo0 = true;
        o0000ooVar.f2896Oooo00o.f2855OooO0oo = true;
        o0000ooVar.OooOOoo(4);
        if (o00oo0.f2979OooOooo != null) {
            o00oo0.f2989Oooo0oO.OooO0Oo(androidx.lifecycle.OooOo.ON_STOP);
        }
        o00oo0.f2987Oooo0o.OooO0o0(androidx.lifecycle.OooOo.ON_STOP);
        o00oo0.f2951OooO00o = 4;
        o00oo0.f2976OooOoo = false;
        o00oo0.OooOo();
        if (o00oo0.f2976OooOoo) {
            this.f2856OooO00o.OooOOO0(false);
            return;
        }
        throw new o00O000o("Fragment " + o00oo0 + " did not call through to super.onStop()");
    }

    public o0000OO0(o000000 o000000Var, o000 o000Var, o00Oo0 o00oo0, o0000O o0000o2) {
        this.f2856OooO00o = o000000Var;
        this.f2857OooO0O0 = o000Var;
        this.f2858OooO0OO = o00oo0;
        o00oo0.f2953OooO0OO = null;
        o00oo0.f2954OooO0Oo = null;
        o00oo0.f2966OooOOo0 = 0;
        o00oo0.f2962OooOOO = false;
        o00oo0.f2960OooOO0O = false;
        o00Oo0 o00oo02 = o00oo0.f2957OooO0oO;
        o00oo0.f2958OooO0oo = o00oo02 != null ? o00oo02.f2956OooO0o0 : null;
        o00oo0.f2957OooO0oO = null;
        Bundle bundle = o0000o2.OooOOO0;
        o00oo0.f2952OooO0O0 = bundle == null ? new Bundle() : bundle;
    }

    public o0000OO0(o000000 o000000Var, o000 o000Var, ClassLoader classLoader, o00000O0 o00000o02, o0000O o0000o2) {
        this.f2856OooO00o = o000000Var;
        this.f2857OooO0O0 = o000Var;
        o00Oo0 OooO00o2 = o00000o02.OooO00o(o0000o2.f2827OooO00o);
        this.f2858OooO0OO = OooO00o2;
        Bundle bundle = o0000o2.f2835OooOO0;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        OooO00o2.OooOooo(bundle);
        OooO00o2.f2956OooO0o0 = o0000o2.f2828OooO0O0;
        OooO00o2.OooOOO0 = o0000o2.f2829OooO0OO;
        OooO00o2.f2963OooOOOO = true;
        OooO00o2.f2971OooOo0O = o0000o2.f2830OooO0Oo;
        OooO00o2.f2972OooOo0o = o0000o2.f2832OooO0o0;
        OooO00o2.f2968OooOo = o0000o2.f2831OooO0o;
        OooO00o2.f2975OooOoOO = o0000o2.f2833OooO0oO;
        OooO00o2.f2961OooOO0o = o0000o2.f2834OooO0oo;
        OooO00o2.f2973OooOoO = o0000o2.f2826OooO;
        OooO00o2.f2974OooOoO0 = o0000o2.f2836OooOO0O;
        OooO00o2.f2988Oooo0o0 = androidx.lifecycle.Oooo000.values()[o0000o2.f2837OooOO0o];
        Bundle bundle2 = o0000o2.OooOOO0;
        OooO00o2.f2952OooO0O0 = bundle2 == null ? new Bundle() : bundle2;
        if (o0000oo.OooOooo(2)) {
            Objects.toString(OooO00o2);
        }
    }
}