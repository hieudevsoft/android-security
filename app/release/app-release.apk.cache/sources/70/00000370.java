package androidx.fragment.app;

import OooOooo.o0o0Oo;
import OooOooo.oo0o0O0;
import android.view.ViewGroup;
import hieubui.eup.android_app_security.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class o00O000 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final ViewGroup f2936OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final ArrayList f2937OooO0O0 = new ArrayList();

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final ArrayList f2938OooO0OO = new ArrayList();

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public boolean f2939OooO0Oo = false;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public boolean f2940OooO0o0 = false;

    public o00O000(ViewGroup viewGroup) {
        this.f2936OooO00o = viewGroup;
    }

    public static o00O000 OooO0o(ViewGroup viewGroup, o000000O o000000o2) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof o00O000) {
            return (o00O000) tag;
        }
        o000000o2.getClass();
        OooOOO oooOOO = new OooOOO(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, oooOOO);
        return oooOOO;
    }

    public final void OooO00o(o00oOoo o00oooo, o0O0ooO o0o0ooo, o0000OO0 o0000oo02) {
        synchronized (this.f2937OooO0O0) {
            OooOoOO.o000000 o000000Var = new OooOoOO.o000000();
            o00O0000 OooO0Oo2 = OooO0Oo(o0000oo02.f2858OooO0OO);
            if (OooO0Oo2 != null) {
                OooO0Oo2.OooO0OO(o00oooo, o0o0ooo);
                return;
            }
            o00O0000 o00o0000 = new o00O0000(o00oooo, o0o0ooo, o0000oo02, o000000Var);
            this.f2937OooO0O0.add(o00o0000);
            o00o0000.f2944OooO0Oo.add(new o00(this, o00o0000, 0));
            o00o0000.f2944OooO0Oo.add(new o00(this, o00o0000, 1));
        }
    }

    public abstract void OooO0O0(ArrayList arrayList, boolean z);

    public final void OooO0OO() {
        if (this.f2940OooO0o0) {
            return;
        }
        ViewGroup viewGroup = this.f2936OooO00o;
        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
        if (!oo0o0O0.OooO0O0(viewGroup)) {
            OooO0o0();
            this.f2939OooO0Oo = false;
            return;
        }
        synchronized (this.f2937OooO0O0) {
            if (!this.f2937OooO0O0.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.f2938OooO0OO);
                this.f2938OooO0OO.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    o00O0000 o00o0000 = (o00O0000) it.next();
                    if (o0000oo.OooOooo(2)) {
                        Objects.toString(o00o0000);
                    }
                    o00o0000.OooO00o();
                    if (!o00o0000.f2947OooO0oO) {
                        this.f2938OooO0OO.add(o00o0000);
                    }
                }
                OooO0oo();
                ArrayList arrayList2 = new ArrayList(this.f2937OooO0O0);
                this.f2937OooO0O0.clear();
                this.f2938OooO0OO.addAll(arrayList2);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((o00O0000) it2.next()).OooO0Oo();
                }
                OooO0O0(arrayList2, this.f2939OooO0Oo);
                this.f2939OooO0Oo = false;
            }
        }
    }

    public final o00O0000 OooO0Oo(o00Oo0 o00oo0) {
        Iterator it = this.f2937OooO0O0.iterator();
        while (it.hasNext()) {
            o00O0000 o00o0000 = (o00O0000) it.next();
            if (o00o0000.f2943OooO0OO.equals(o00oo0) && !o00o0000.f2945OooO0o) {
                return o00o0000;
            }
        }
        return null;
    }

    public final void OooO0o0() {
        ViewGroup viewGroup = this.f2936OooO00o;
        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
        boolean OooO0O02 = oo0o0O0.OooO0O0(viewGroup);
        synchronized (this.f2937OooO0O0) {
            OooO0oo();
            Iterator it = this.f2937OooO0O0.iterator();
            while (it.hasNext()) {
                ((o00O0000) it.next()).OooO0Oo();
            }
            Iterator it2 = new ArrayList(this.f2938OooO0OO).iterator();
            while (it2.hasNext()) {
                o00O0000 o00o0000 = (o00O0000) it2.next();
                if (o0000oo.OooOooo(2)) {
                    if (!OooO0O02) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Container ");
                        sb.append(this.f2936OooO00o);
                        sb.append(" is not attached to window. ");
                    }
                    Objects.toString(o00o0000);
                }
                o00o0000.OooO00o();
            }
            Iterator it3 = new ArrayList(this.f2937OooO0O0).iterator();
            while (it3.hasNext()) {
                o00O0000 o00o00002 = (o00O0000) it3.next();
                if (o0000oo.OooOooo(2)) {
                    if (!OooO0O02) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Container ");
                        sb2.append(this.f2936OooO00o);
                        sb2.append(" is not attached to window. ");
                    }
                    Objects.toString(o00o00002);
                }
                o00o00002.OooO00o();
            }
        }
    }

    public final void OooO0oO() {
        synchronized (this.f2937OooO0O0) {
            OooO0oo();
            this.f2940OooO0o0 = false;
            int size = this.f2937OooO0O0.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                o00O0000 o00o0000 = (o00O0000) this.f2937OooO0O0.get(size);
                o00oOoo OooO0OO2 = o00oOoo.OooO0OO(o00o0000.f2943OooO0OO.f2979OooOooo);
                o00oOoo o00oooo = o00o0000.f2941OooO00o;
                o00oOoo o00oooo2 = o00oOoo.VISIBLE;
                if (o00oooo == o00oooo2 && OooO0OO2 != o00oooo2) {
                    o00o0000.f2943OooO0OO.getClass();
                    this.f2940OooO0o0 = false;
                    break;
                }
            }
        }
    }

    public final void OooO0oo() {
        Iterator it = this.f2937OooO0O0.iterator();
        while (it.hasNext()) {
            o00O0000 o00o0000 = (o00O0000) it.next();
            if (o00o0000.f2942OooO0O0 == o0O0ooO.ADDING) {
                o00o0000.OooO0OO(o00oOoo.OooO0O0(o00o0000.f2943OooO0OO.OooOoo().getVisibility()), o0O0ooO.NONE);
            }
        }
    }
}