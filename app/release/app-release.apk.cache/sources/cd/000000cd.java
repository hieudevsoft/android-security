package OooOOoo;

import OooOooo.o0o0Oo;
import OooOooo.oo0oOO0;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;
import java.util.WeakHashMap;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class o0Oo0oo implements Comparator {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f1104OooO00o;

    public /* synthetic */ o0Oo0oo(int i) {
        this.f1104OooO00o = i;
    }

    public final int OooO00o(View view, View view2) {
        switch (this.f1104OooO00o) {
            case 0:
                WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
                float OooOOO0 = oo0oOO0.OooOOO0(view);
                float OooOOO02 = oo0oOO0.OooOOO0(view2);
                if (OooOOO0 > OooOOO02) {
                    return -1;
                }
                if (OooOOO0 < OooOOO02) {
                    return 1;
                }
                return 0;
            default:
                return view.getTop() - view2.getTop();
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        switch (this.f1104OooO00o) {
            case 0:
                return OooO00o((View) obj, (View) obj2);
            case 1:
                o000oOoO.o00Oo0 o00oo0 = (o000oOoO.o00Oo0) obj;
                o000oOoO.o00Oo0 o00oo02 = (o000oOoO.o00Oo0) obj2;
                RecyclerView recyclerView = o00oo0.f5084OooO0Oo;
                if (recyclerView == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (o00oo02.f5084OooO0Oo == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z != z2) {
                    if (recyclerView != null) {
                        return -1;
                    }
                } else {
                    boolean z3 = o00oo0.f5081OooO00o;
                    if (z3 != o00oo02.f5081OooO00o) {
                        if (z3) {
                            return -1;
                        }
                    } else {
                        int i = o00oo02.f5082OooO0O0 - o00oo0.f5082OooO0O0;
                        if (i == 0) {
                            int i2 = o00oo0.f5083OooO0OO - o00oo02.f5083OooO0OO;
                            if (i2 == 0) {
                                return 0;
                            }
                            return i2;
                        }
                        return i;
                    }
                }
                return 1;
            case 2:
                return OooO00o((View) obj, (View) obj2);
            case 3:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            default:
                String str = (String) obj;
                String str2 = (String) obj2;
                OooO00o.OooOoo0(str, "a");
                OooO00o.OooOoo0(str2, "b");
                int min = Math.min(str.length(), str2.length());
                int i3 = 4;
                while (true) {
                    if (i3 < min) {
                        char charAt = str.charAt(i3);
                        char charAt2 = str2.charAt(i3);
                        if (charAt != charAt2) {
                            if (OooO00o.Oooo0O0(charAt, charAt2) < 0) {
                                return -1;
                            }
                        } else {
                            i3++;
                        }
                    } else {
                        int length = str.length();
                        int length2 = str2.length();
                        if (length == length2) {
                            return 0;
                        }
                        if (length < length2) {
                            return -1;
                        }
                    }
                }
                return 1;
        }
    }
}