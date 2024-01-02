package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class o00O0000 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public o00oOoo f2941OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public o0O0ooO f2942OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final o00Oo0 f2943OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final ArrayList f2944OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public boolean f2945OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final HashSet f2946OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public boolean f2947OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final o0000OO0 f2948OooO0oo;

    public o00O0000(o00oOoo o00oooo, o0O0ooO o0o0ooo, o0000OO0 o0000oo02, OooOoOO.o000000 o000000Var) {
        o00Oo0 o00oo0 = o0000oo02.f2858OooO0OO;
        this.f2944OooO0Oo = new ArrayList();
        this.f2946OooO0o0 = new HashSet();
        this.f2945OooO0o = false;
        this.f2947OooO0oO = false;
        this.f2941OooO00o = o00oooo;
        this.f2942OooO0O0 = o0o0ooo;
        this.f2943OooO0OO = o00oo0;
        o000000Var.OooO0O0(new OooOo(3, this));
        this.f2948OooO0oo = o0000oo02;
    }

    public final void OooO00o() {
        if (!this.f2945OooO0o) {
            this.f2945OooO0o = true;
            HashSet hashSet = this.f2946OooO0o0;
            if (hashSet.isEmpty()) {
                OooO0O0();
                return;
            }
            Iterator it = new ArrayList(hashSet).iterator();
            while (it.hasNext()) {
                ((OooOoOO.o000000) it.next()).OooO00o();
            }
        }
    }

    public final void OooO0O0() {
        if (!this.f2947OooO0oO) {
            if (o0000oo.OooOooo(2)) {
                toString();
            }
            this.f2947OooO0oO = true;
            Iterator it = this.f2944OooO0Oo.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f2948OooO0oo.OooOO0O();
    }

    public final void OooO0OO(o00oOoo o00oooo, o0O0ooO o0o0ooo) {
        o0O0ooO o0o0ooo2;
        int ordinal = o0o0ooo.ordinal();
        o00oOoo o00oooo2 = o00oOoo.REMOVED;
        o00Oo0 o00oo0 = this.f2943OooO0OO;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    if (o0000oo.OooOooo(2)) {
                        Objects.toString(o00oo0);
                        Objects.toString(this.f2941OooO00o);
                        Objects.toString(this.f2942OooO0O0);
                    }
                    this.f2941OooO00o = o00oooo2;
                    o0o0ooo2 = o0O0ooO.REMOVING;
                } else {
                    return;
                }
            } else if (this.f2941OooO00o == o00oooo2) {
                if (o0000oo.OooOooo(2)) {
                    Objects.toString(o00oo0);
                    Objects.toString(this.f2942OooO0O0);
                }
                this.f2941OooO00o = o00oOoo.VISIBLE;
                o0o0ooo2 = o0O0ooO.ADDING;
            } else {
                return;
            }
            this.f2942OooO0O0 = o0o0ooo2;
        } else if (this.f2941OooO00o != o00oooo2) {
            if (o0000oo.OooOooo(2)) {
                Objects.toString(o00oo0);
                Objects.toString(this.f2941OooO00o);
                Objects.toString(o00oooo);
            }
            this.f2941OooO00o = o00oooo;
        }
    }

    public final void OooO0Oo() {
        float f;
        if (this.f2942OooO0O0 == o0O0ooO.ADDING) {
            o0000OO0 o0000oo02 = this.f2948OooO0oo;
            o00Oo0 o00oo0 = o0000oo02.f2858OooO0OO;
            View findFocus = o00oo0.f2979OooOooo.findFocus();
            if (findFocus != null) {
                o00oo0.OooO0o().f3032OooOOOO = findFocus;
                if (o0000oo.OooOooo(2)) {
                    findFocus.toString();
                    o00oo0.toString();
                }
            }
            View OooOoo2 = this.f2943OooO0OO.OooOoo();
            if (OooOoo2.getParent() == null) {
                o0000oo02.OooO0O0();
                OooOoo2.setAlpha(0.0f);
            }
            if (OooOoo2.getAlpha() == 0.0f && OooOoo2.getVisibility() == 0) {
                OooOoo2.setVisibility(4);
            }
            o0OoOo0 o0oooo0 = o00oo0.f2984Oooo00o;
            if (o0oooo0 == null) {
                f = 1.0f;
            } else {
                f = o0oooo0.f3031OooOOO;
            }
            OooOoo2.setAlpha(f);
        }
    }

    /* renamed from: OooO0o0 */
    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f2941OooO00o + "} {mLifecycleImpact = " + this.f2942OooO0O0 + "} {mFragment = " + this.f2943OooO0OO + "}";
    }
}