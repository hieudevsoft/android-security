package o000oOoO;

import OooOooo.o00O0O0;
import OooOooo.o0o0Oo;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class o000OOo0 {

    /* renamed from: OooOOoo  reason: collision with root package name */
    public static final List f5029OooOOoo = Collections.emptyList();

    /* renamed from: OooO00o  reason: collision with root package name */
    public final View f5031OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public WeakReference f5032OooO0O0;

    /* renamed from: OooOO0  reason: collision with root package name */
    public int f5039OooOO0;

    /* renamed from: OooOOo  reason: collision with root package name */
    public RecyclerView f5045OooOOo;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f5033OooO0OO = -1;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public int f5034OooO0Oo = -1;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public long f5036OooO0o0 = -1;

    /* renamed from: OooO0o  reason: collision with root package name */
    public int f5035OooO0o = -1;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public int f5037OooO0oO = -1;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public o000OOo0 f5038OooO0oo = null;

    /* renamed from: OooO  reason: collision with root package name */
    public o000OOo0 f5030OooO = null;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public ArrayList f5040OooOO0O = null;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public List f5041OooOO0o = null;
    public int OooOOO0 = 0;

    /* renamed from: OooOOO  reason: collision with root package name */
    public o000O00 f5042OooOOO = null;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public boolean f5043OooOOOO = false;

    /* renamed from: OooOOOo  reason: collision with root package name */
    public int f5044OooOOOo = 0;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public int f5046OooOOo0 = -1;

    public o000OOo0(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f5031OooO00o = view;
    }

    public final boolean OooO() {
        return (this.f5039OooOO0 & 8) != 0;
    }

    public final void OooO00o(Object obj) {
        if (obj == null) {
            OooO0O0(1024);
        } else if ((1024 & this.f5039OooOO0) == 0) {
            if (this.f5040OooOO0O == null) {
                ArrayList arrayList = new ArrayList();
                this.f5040OooOO0O = arrayList;
                this.f5041OooOO0o = Collections.unmodifiableList(arrayList);
            }
            this.f5040OooOO0O.add(obj);
        }
    }

    public final void OooO0O0(int i) {
        this.f5039OooOO0 = i | this.f5039OooOO0;
    }

    public final int OooO0OO() {
        int i = this.f5037OooO0oO;
        return i == -1 ? this.f5033OooO0OO : i;
    }

    public final List OooO0Oo() {
        ArrayList arrayList;
        return ((this.f5039OooOO0 & 1024) != 0 || (arrayList = this.f5040OooOO0O) == null || arrayList.size() == 0) ? f5029OooOOoo : this.f5041OooOO0o;
    }

    public final boolean OooO0o() {
        return (this.f5039OooOO0 & 1) != 0;
    }

    public final boolean OooO0o0() {
        View view = this.f5031OooO00o;
        return (view.getParent() == null || view.getParent() == this.f5045OooOOo) ? false : true;
    }

    public final boolean OooO0oO() {
        return (this.f5039OooOO0 & 4) != 0;
    }

    public final boolean OooO0oo() {
        if ((this.f5039OooOO0 & 16) == 0) {
            WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
            if (!o00O0O0.OooO(this.f5031OooO00o)) {
                return true;
            }
        }
        return false;
    }

    public final boolean OooOO0() {
        return this.f5042OooOOO != null;
    }

    public final boolean OooOO0O() {
        return (this.f5039OooOO0 & 256) != 0;
    }

    public final void OooOO0o(int i, boolean z) {
        if (this.f5034OooO0Oo == -1) {
            this.f5034OooO0Oo = this.f5033OooO0OO;
        }
        if (this.f5037OooO0oO == -1) {
            this.f5037OooO0oO = this.f5033OooO0OO;
        }
        if (z) {
            this.f5037OooO0oO += i;
        }
        this.f5033OooO0OO += i;
        View view = this.f5031OooO00o;
        if (view.getLayoutParams() != null) {
            ((o0000O) view.getLayoutParams()).f4956OooO0OO = true;
        }
    }

    public final void OooOOO(boolean z) {
        int i;
        int i2 = this.OooOOO0;
        int i3 = z ? i2 - 1 : i2 + 1;
        this.OooOOO0 = i3;
        if (i3 < 0) {
            this.OooOOO0 = 0;
            toString();
            return;
        }
        if (!z && i3 == 1) {
            i = this.f5039OooOO0 | 16;
        } else if (!z || i3 != 0) {
            return;
        } else {
            i = this.f5039OooOO0 & (-17);
        }
        this.f5039OooOO0 = i;
    }

    public final void OooOOO0() {
        this.f5039OooOO0 = 0;
        this.f5033OooO0OO = -1;
        this.f5034OooO0Oo = -1;
        this.f5036OooO0o0 = -1L;
        this.f5037OooO0oO = -1;
        this.OooOOO0 = 0;
        this.f5038OooO0oo = null;
        this.f5030OooO = null;
        ArrayList arrayList = this.f5040OooOO0O;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f5039OooOO0 &= -1025;
        this.f5044OooOOOo = 0;
        this.f5046OooOOo0 = -1;
        RecyclerView.OooOO0(this);
    }

    public final boolean OooOOOO() {
        return (this.f5039OooOO0 & 128) != 0;
    }

    public final boolean OooOOOo() {
        return (this.f5039OooOO0 & 32) != 0;
    }

    public final String toString() {
        String simpleName;
        boolean z;
        String str;
        if (getClass().isAnonymousClass()) {
            simpleName = "ViewHolder";
        } else {
            simpleName = getClass().getSimpleName();
        }
        StringBuilder sb = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.f5033OooO0OO + " id=" + this.f5036OooO0o0 + ", oldPos=" + this.f5034OooO0Oo + ", pLpos:" + this.f5037OooO0oO);
        if (OooOO0()) {
            sb.append(" scrap ");
            if (this.f5043OooOOOO) {
                str = "[changeScrap]";
            } else {
                str = "[attachedScrap]";
            }
            sb.append(str);
        }
        if (OooO0oO()) {
            sb.append(" invalid");
        }
        if (!OooO0o()) {
            sb.append(" unbound");
        }
        boolean z2 = true;
        if ((this.f5039OooOO0 & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            sb.append(" update");
        }
        if (OooO()) {
            sb.append(" removed");
        }
        if (OooOOOO()) {
            sb.append(" ignored");
        }
        if (OooOO0O()) {
            sb.append(" tmpDetached");
        }
        if (!OooO0oo()) {
            sb.append(" not recyclable(" + this.OooOOO0 + ")");
        }
        if ((this.f5039OooOO0 & 512) == 0 && !OooO0oO()) {
            z2 = false;
        }
        if (z2) {
            sb.append(" undefined adapter position");
        }
        if (this.f5031OooO00o.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}