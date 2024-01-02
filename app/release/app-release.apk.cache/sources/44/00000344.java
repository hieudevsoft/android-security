package androidx.fragment.app;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class OooO00o implements o0000 {

    /* renamed from: OooO  reason: collision with root package name */
    public int f2740OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final ArrayList f2741OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f2742OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f2743OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public int f2744OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public int f2745OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public int f2746OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public boolean f2747OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public String f2748OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public CharSequence f2749OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public int f2750OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public CharSequence f2751OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public ArrayList f2752OooOOO;
    public ArrayList OooOOO0;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public boolean f2753OooOOOO;

    /* renamed from: OooOOOo  reason: collision with root package name */
    public final o0000oo f2754OooOOOo;

    /* renamed from: OooOOo  reason: collision with root package name */
    public int f2755OooOOo;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public boolean f2756OooOOo0;

    public OooO00o(o0000oo o0000ooVar) {
        o0000ooVar.OooOoo();
        o00oO0o o00oo0o = o0000ooVar.f2877OooOOOo;
        if (o00oo0o != null) {
            o00oo0o.f2994OoooOO0.getClassLoader();
        }
        this.f2741OooO00o = new ArrayList();
        this.f2753OooOOOO = false;
        this.f2755OooOOo = -1;
        this.f2754OooOOOo = o0000ooVar;
    }

    @Override // androidx.fragment.app.o0000
    public final boolean OooO00o(ArrayList arrayList, ArrayList arrayList2) {
        if (o0000oo.OooOooo(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f2747OooO0oO) {
            o0000oo o0000ooVar = this.f2754OooOOOo;
            if (o0000ooVar.f2867OooO0Oo == null) {
                o0000ooVar.f2867OooO0Oo = new ArrayList();
            }
            o0000ooVar.f2867OooO0Oo.add(this);
            return true;
        }
        return true;
    }

    public final void OooO0O0(o000O000 o000o000) {
        this.f2741OooO00o.add(o000o000);
        o000o000.f2908OooO0OO = this.f2742OooO0O0;
        o000o000.f2909OooO0Oo = this.f2743OooO0OO;
        o000o000.f2911OooO0o0 = this.f2744OooO0Oo;
        o000o000.f2910OooO0o = this.f2746OooO0o0;
    }

    public final void OooO0OO(int i) {
        if (this.f2747OooO0oO) {
            if (o0000oo.OooOooo(2)) {
                toString();
            }
            ArrayList arrayList = this.f2741OooO00o;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                o000O000 o000o000 = (o000O000) arrayList.get(i2);
                o00Oo0 o00oo0 = o000o000.f2907OooO0O0;
                if (o00oo0 != null) {
                    o00oo0.f2966OooOOo0 += i;
                    if (o0000oo.OooOooo(2)) {
                        Objects.toString(o000o000.f2907OooO0O0);
                        int i3 = o000o000.f2907OooO0O0.f2966OooOOo0;
                    }
                }
            }
        }
    }

    public final int OooO0Oo(boolean z) {
        int i;
        if (!this.f2756OooOOo0) {
            if (o0000oo.OooOooo(2)) {
                toString();
                PrintWriter printWriter = new PrintWriter(new o000OOo0());
                OooO0o0("  ", printWriter, true);
                printWriter.close();
            }
            this.f2756OooOOo0 = true;
            boolean z2 = this.f2747OooO0oO;
            o0000oo o0000ooVar = this.f2754OooOOOo;
            if (z2) {
                i = o0000ooVar.f2863OooO.getAndIncrement();
            } else {
                i = -1;
            }
            this.f2755OooOOo = i;
            o0000ooVar.OooOo0O(this, z);
            return this.f2755OooOOo;
        }
        throw new IllegalStateException("commit already called");
    }

    public final void OooO0o() {
        ArrayList arrayList = this.f2741OooO00o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            o000O000 o000o000 = (o000O000) arrayList.get(i);
            o00Oo0 o00oo0 = o000o000.f2907OooO0O0;
            if (o00oo0 != null) {
                if (o00oo0.f2984Oooo00o != null) {
                    o00oo0.OooO0o().f3022OooO0OO = false;
                }
                int i2 = this.f2745OooO0o;
                if (o00oo0.f2984Oooo00o != null || i2 != 0) {
                    o00oo0.OooO0o();
                    o00oo0.f2984Oooo00o.f3027OooO0oo = i2;
                }
                ArrayList arrayList2 = this.OooOOO0;
                ArrayList arrayList3 = this.f2752OooOOO;
                o00oo0.OooO0o();
                o0OoOo0 o0oooo0 = o00oo0.f2984Oooo00o;
                o0oooo0.f3019OooO = arrayList2;
                o0oooo0.f3028OooOO0 = arrayList3;
            }
            int i3 = o000o000.f2906OooO00o;
            o0000oo o0000ooVar = this.f2754OooOOOo;
            switch (i3) {
                case 1:
                    o00oo0.OooOooO(o000o000.f2908OooO0OO, o000o000.f2909OooO0Oo, o000o000.f2911OooO0o0, o000o000.f2910OooO0o);
                    o0000ooVar.OoooO0O(o00oo0, false);
                    o0000ooVar.OooO00o(o00oo0);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + o000o000.f2906OooO00o);
                case 3:
                    o00oo0.OooOooO(o000o000.f2908OooO0OO, o000o000.f2909OooO0Oo, o000o000.f2911OooO0o0, o000o000.f2910OooO0o);
                    o0000ooVar.Oooo0oO(o00oo0);
                    break;
                case 4:
                    o00oo0.OooOooO(o000o000.f2908OooO0OO, o000o000.f2909OooO0Oo, o000o000.f2911OooO0o0, o000o000.f2910OooO0o);
                    o0000ooVar.getClass();
                    if (o0000oo.OooOooo(2)) {
                        Objects.toString(o00oo0);
                    }
                    if (o00oo0.f2974OooOoO0) {
                        break;
                    } else {
                        o00oo0.f2974OooOoO0 = true;
                        o00oo0.f2981Oooo0 = !o00oo0.f2981Oooo0;
                        o0000ooVar.o000oOoO(o00oo0);
                        break;
                    }
                case o00000.o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                    o00oo0.OooOooO(o000o000.f2908OooO0OO, o000o000.f2909OooO0Oo, o000o000.f2911OooO0o0, o000o000.f2910OooO0o);
                    o0000ooVar.OoooO0O(o00oo0, false);
                    if (o0000oo.OooOooo(2)) {
                        Objects.toString(o00oo0);
                    }
                    if (o00oo0.f2974OooOoO0) {
                        o00oo0.f2974OooOoO0 = false;
                        o00oo0.f2981Oooo0 = !o00oo0.f2981Oooo0;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    o00oo0.OooOooO(o000o000.f2908OooO0OO, o000o000.f2909OooO0Oo, o000o000.f2911OooO0o0, o000o000.f2910OooO0o);
                    o0000ooVar.OooO0oO(o00oo0);
                    break;
                case 7:
                    o00oo0.OooOooO(o000o000.f2908OooO0OO, o000o000.f2909OooO0Oo, o000o000.f2911OooO0o0, o000o000.f2910OooO0o);
                    o0000ooVar.OoooO0O(o00oo0, false);
                    o0000ooVar.OooO0OO(o00oo0);
                    break;
                case 8:
                    o0000ooVar.OoooOO0(o00oo0);
                    break;
                case 9:
                    o0000ooVar.OoooOO0(null);
                    break;
                case 10:
                    o0000ooVar.OoooO(o00oo0, o000o000.f2913OooO0oo);
                    break;
            }
        }
    }

    public final void OooO0o0(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f2748OooO0oo);
            printWriter.print(" mIndex=");
            printWriter.print(this.f2755OooOOo);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f2756OooOOo0);
            if (this.f2745OooO0o != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f2745OooO0o));
            }
            if (this.f2742OooO0O0 != 0 || this.f2743OooO0OO != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2742OooO0O0));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2743OooO0OO));
            }
            if (this.f2744OooO0Oo != 0 || this.f2746OooO0o0 != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2744OooO0Oo));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2746OooO0o0));
            }
            if (this.f2740OooO != 0 || this.f2749OooOO0 != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2740OooO));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f2749OooOO0);
            }
            if (this.f2750OooOO0O != 0 || this.f2751OooOO0o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2750OooOO0O));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f2751OooOO0o);
            }
        }
        ArrayList arrayList = this.f2741OooO00o;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            o000O000 o000o000 = (o000O000) arrayList.get(i);
            switch (o000o000.f2906OooO00o) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case o00000.o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + o000o000.f2906OooO00o;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(o000o000.f2907OooO0O0);
            if (z) {
                if (o000o000.f2908OooO0OO != 0 || o000o000.f2909OooO0Oo != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(o000o000.f2908OooO0OO));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(o000o000.f2909OooO0Oo));
                }
                if (o000o000.f2911OooO0o0 != 0 || o000o000.f2910OooO0o != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(o000o000.f2911OooO0o0));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(o000o000.f2910OooO0o));
                }
            }
        }
    }

    public final void OooO0oO() {
        ArrayList arrayList = this.f2741OooO00o;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            o000O000 o000o000 = (o000O000) arrayList.get(size);
            o00Oo0 o00oo0 = o000o000.f2907OooO0O0;
            if (o00oo0 != null) {
                if (o00oo0.f2984Oooo00o != null) {
                    o00oo0.OooO0o().f3022OooO0OO = true;
                }
                int i = this.f2745OooO0o;
                int i2 = 8194;
                if (i != 4097) {
                    if (i != 4099) {
                        if (i != 8194) {
                            i2 = 0;
                        } else {
                            i2 = 4097;
                        }
                    } else {
                        i2 = 4099;
                    }
                }
                if (o00oo0.f2984Oooo00o != null || i2 != 0) {
                    o00oo0.OooO0o();
                    o00oo0.f2984Oooo00o.f3027OooO0oo = i2;
                }
                ArrayList arrayList2 = this.f2752OooOOO;
                ArrayList arrayList3 = this.OooOOO0;
                o00oo0.OooO0o();
                o0OoOo0 o0oooo0 = o00oo0.f2984Oooo00o;
                o0oooo0.f3019OooO = arrayList2;
                o0oooo0.f3028OooOO0 = arrayList3;
            }
            int i3 = o000o000.f2906OooO00o;
            o0000oo o0000ooVar = this.f2754OooOOOo;
            switch (i3) {
                case 1:
                    o00oo0.OooOooO(o000o000.f2908OooO0OO, o000o000.f2909OooO0Oo, o000o000.f2911OooO0o0, o000o000.f2910OooO0o);
                    o0000ooVar.OoooO0O(o00oo0, true);
                    o0000ooVar.Oooo0oO(o00oo0);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + o000o000.f2906OooO00o);
                case 3:
                    o00oo0.OooOooO(o000o000.f2908OooO0OO, o000o000.f2909OooO0Oo, o000o000.f2911OooO0o0, o000o000.f2910OooO0o);
                    o0000ooVar.OooO00o(o00oo0);
                    break;
                case 4:
                    o00oo0.OooOooO(o000o000.f2908OooO0OO, o000o000.f2909OooO0Oo, o000o000.f2911OooO0o0, o000o000.f2910OooO0o);
                    o0000ooVar.getClass();
                    if (o0000oo.OooOooo(2)) {
                        Objects.toString(o00oo0);
                    }
                    if (o00oo0.f2974OooOoO0) {
                        o00oo0.f2974OooOoO0 = false;
                        o00oo0.f2981Oooo0 = !o00oo0.f2981Oooo0;
                        break;
                    } else {
                        break;
                    }
                case o00000.o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                    o00oo0.OooOooO(o000o000.f2908OooO0OO, o000o000.f2909OooO0Oo, o000o000.f2911OooO0o0, o000o000.f2910OooO0o);
                    o0000ooVar.OoooO0O(o00oo0, true);
                    if (o0000oo.OooOooo(2)) {
                        Objects.toString(o00oo0);
                    }
                    if (o00oo0.f2974OooOoO0) {
                        break;
                    } else {
                        o00oo0.f2974OooOoO0 = true;
                        o00oo0.f2981Oooo0 = !o00oo0.f2981Oooo0;
                        o0000ooVar.o000oOoO(o00oo0);
                        break;
                    }
                case 6:
                    o00oo0.OooOooO(o000o000.f2908OooO0OO, o000o000.f2909OooO0Oo, o000o000.f2911OooO0o0, o000o000.f2910OooO0o);
                    o0000ooVar.OooO0OO(o00oo0);
                    break;
                case 7:
                    o00oo0.OooOooO(o000o000.f2908OooO0OO, o000o000.f2909OooO0Oo, o000o000.f2911OooO0o0, o000o000.f2910OooO0o);
                    o0000ooVar.OoooO0O(o00oo0, true);
                    o0000ooVar.OooO0oO(o00oo0);
                    break;
                case 8:
                    o0000ooVar.OoooOO0(null);
                    break;
                case 9:
                    o0000ooVar.OoooOO0(o00oo0);
                    break;
                case 10:
                    o0000ooVar.OoooO(o00oo0, o000o000.f2912OooO0oO);
                    break;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f2755OooOOo >= 0) {
            sb.append(" #");
            sb.append(this.f2755OooOOo);
        }
        if (this.f2748OooO0oo != null) {
            sb.append(" ");
            sb.append(this.f2748OooO0oo);
        }
        sb.append("}");
        return sb.toString();
    }
}