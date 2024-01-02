package OoooOoo;

import OooO0O0.OooO0OO;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.o000O;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class oO0Oo extends o000O {
    @Override // androidx.fragment.app.o000O
    public final Object OooO(Object obj, Object obj2, Object obj3) {
        oO00000 oo00000 = (oO00000) obj;
        oO00000 oo000002 = (oO00000) obj2;
        oO00000 oo000003 = (oO00000) obj3;
        if (oo00000 != null && oo000002 != null) {
            oO000 oo000 = new oO000();
            oo000.Oooo00o(oo00000);
            oo000.Oooo00o(oo000002);
            oo000.f1634OooOoO0 = false;
            oo00000 = oo000;
        } else if (oo00000 == null) {
            if (oo000002 != null) {
                oo00000 = oo000002;
            } else {
                oo00000 = null;
            }
        }
        if (oo000003 != null) {
            oO000 oo0002 = new oO000();
            if (oo00000 != null) {
                oo0002.Oooo00o(oo00000);
            }
            oo0002.Oooo00o(oo000003);
            return oo0002;
        }
        return oo00000;
    }

    @Override // androidx.fragment.app.o000O
    public final void OooO00o(View view, Object obj) {
        if (obj != null) {
            ((oO00000) obj).OooO0O0(view);
        }
    }

    @Override // androidx.fragment.app.o000O
    public final void OooO0O0(Object obj, ArrayList arrayList) {
        boolean z;
        oO00000 oo00000;
        oO00000 oo000002 = (oO00000) obj;
        if (oo000002 == null) {
            return;
        }
        int i = 0;
        if (oo000002 instanceof oO000) {
            oO000 oo000 = (oO000) oo000002;
            int size = oo000.f1632OooOo.size();
            while (i < size) {
                if (i >= 0 && i < oo000.f1632OooOo.size()) {
                    oo00000 = (oO00000) oo000.f1632OooOo.get(i);
                } else {
                    oo00000 = null;
                }
                OooO0O0(oo00000, arrayList);
                i++;
            }
            return;
        }
        if (o000O.OooO0oo(oo000002.f1646OooO0o0) && o000O.OooO0oo(null) && o000O.OooO0oo(null)) {
            z = false;
        } else {
            z = true;
        }
        if (!z && o000O.OooO0oo(oo000002.f1645OooO0o)) {
            int size2 = arrayList.size();
            while (i < size2) {
                oo000002.OooO0O0((View) arrayList.get(i));
                i++;
            }
        }
    }

    @Override // androidx.fragment.app.o000O
    public final void OooO0OO(ViewGroup viewGroup, Object obj) {
        oO0000Oo.OooO00o(viewGroup, (oO00000) obj);
    }

    @Override // androidx.fragment.app.o000O
    public final Object OooO0o(Object obj) {
        if (obj != null) {
            return ((oO00000) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.o000O
    public final boolean OooO0o0(Object obj) {
        return obj instanceof oO00000;
    }

    @Override // androidx.fragment.app.o000O
    public final Object OooOO0(Object obj, Object obj2, Object obj3) {
        oO000 oo000 = new oO000();
        if (obj != null) {
            oo000.Oooo00o((oO00000) obj);
        }
        if (obj2 != null) {
            oo000.Oooo00o((oO00000) obj2);
        }
        if (obj3 != null) {
            oo000.Oooo00o((oO00000) obj3);
        }
        return oo000;
    }

    @Override // androidx.fragment.app.o000O
    public final void OooOO0o(Object obj, View view, ArrayList arrayList) {
        ((oO00000) obj).OooO00o(new o0OOo000(view, arrayList));
    }

    @Override // androidx.fragment.app.o000O
    public final void OooOOO(View view, Object obj) {
        if (view != null) {
            o000O.OooO0oO(view, new Rect());
            ((oO00000) obj).OooOoOO(new OooO0OO());
        }
    }

    @Override // androidx.fragment.app.o000O
    public final void OooOOO0(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((oO00000) obj).OooO00o(new o0o0000(this, obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.o000O
    public final void OooOOOO(Object obj, Rect rect) {
        if (obj != null) {
            ((oO00000) obj).OooOoOO(new OooO0OO());
        }
    }

    @Override // androidx.fragment.app.o000O
    public final void OooOOo(Object obj, View view, ArrayList arrayList) {
        oO000 oo000 = (oO000) obj;
        ArrayList arrayList2 = oo000.f1645OooO0o;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            o000O.OooO0Oo((View) arrayList.get(i), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        OooO0O0(oo000, arrayList);
    }

    @Override // androidx.fragment.app.o000O
    public final void OooOOoo(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        oO000 oo000 = (oO000) obj;
        if (oo000 != null) {
            ArrayList arrayList3 = oo000.f1645OooO0o;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            OooOo0(oo000, arrayList, arrayList2);
        }
    }

    public final void OooOo0(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        boolean z;
        int size;
        oO00000 oo00000;
        oO00000 oo000002 = (oO00000) obj;
        int i = 0;
        if (oo000002 instanceof oO000) {
            oO000 oo000 = (oO000) oo000002;
            int size2 = oo000.f1632OooOo.size();
            while (i < size2) {
                if (i >= 0 && i < oo000.f1632OooOo.size()) {
                    oo00000 = (oO00000) oo000.f1632OooOo.get(i);
                } else {
                    oo00000 = null;
                }
                OooOo0(oo00000, arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (o000O.OooO0oo(oo000002.f1646OooO0o0) && o000O.OooO0oo(null) && o000O.OooO0oo(null)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            ArrayList arrayList3 = oo000002.f1645OooO0o;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                while (i < size) {
                    oo000002.OooO0O0((View) arrayList2.get(i));
                    i++;
                }
                int size3 = arrayList.size();
                while (true) {
                    size3--;
                    if (size3 >= 0) {
                        oo000002.OooOo0o((View) arrayList.get(size3));
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override // androidx.fragment.app.o000O
    public final Object OooOo00(Object obj) {
        if (obj == null) {
            return null;
        }
        oO000 oo000 = new oO000();
        oo000.Oooo00o((oO00000) obj);
        return oo000;
    }
}