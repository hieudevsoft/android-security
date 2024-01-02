package OoooOoo;

import OooO0O0.OooO0O0;
import OooOO0.OooO0o;
import OooOooo.o00O0O0;
import OooOooo.o0o0Oo;
import OooOooo.oo0oOO0;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import o0000O00.OooO00o;
import o0ooOO0.OooOOO0;

/* loaded from: classes.dex */
public abstract class oO00000 implements Cloneable {

    /* renamed from: OooOo0  reason: collision with root package name */
    public static final int[] f1637OooOo0 = {2, 1, 3, 4};

    /* renamed from: OooOo0O  reason: collision with root package name */
    public static final OooOOO0 f1638OooOo0O = new OooOOO0(29);

    /* renamed from: OooOo0o  reason: collision with root package name */
    public static final ThreadLocal f1639OooOo0o = new ThreadLocal();

    /* renamed from: OooOO0O  reason: collision with root package name */
    public ArrayList f1650OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public ArrayList f1651OooOO0o;

    /* renamed from: OooOOoo  reason: collision with root package name */
    public OooO0O0 f1657OooOOoo;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final String f1641OooO00o = getClass().getName();

    /* renamed from: OooO0O0  reason: collision with root package name */
    public long f1642OooO0O0 = -1;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public long f1643OooO0OO = -1;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public TimeInterpolator f1644OooO0Oo = null;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final ArrayList f1646OooO0o0 = new ArrayList();

    /* renamed from: OooO0o  reason: collision with root package name */
    public final ArrayList f1645OooO0o = new ArrayList();

    /* renamed from: OooO0oO  reason: collision with root package name */
    public OooO0o.OooOOO0 f1647OooO0oO = new OooO0o.OooOOO0(5);

    /* renamed from: OooO0oo  reason: collision with root package name */
    public OooO0o.OooOOO0 f1648OooO0oo = new OooO0o.OooOOO0(5);

    /* renamed from: OooO  reason: collision with root package name */
    public oO000 f1640OooO = null;

    /* renamed from: OooOO0  reason: collision with root package name */
    public final int[] f1649OooOO0 = f1637OooOo0;
    public final ArrayList OooOOO0 = new ArrayList();

    /* renamed from: OooOOO  reason: collision with root package name */
    public int f1652OooOOO = 0;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public boolean f1653OooOOOO = false;

    /* renamed from: OooOOOo  reason: collision with root package name */
    public boolean f1654OooOOOo = false;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public ArrayList f1656OooOOo0 = null;

    /* renamed from: OooOOo  reason: collision with root package name */
    public ArrayList f1655OooOOo = new ArrayList();

    /* renamed from: OooOo00  reason: collision with root package name */
    public OooOOO0 f1658OooOo00 = f1638OooOo0O;

    public static void OooO0OO(OooO0o.OooOOO0 oooOOO0, View view, oO000O0O oo000o0o) {
        ((OooOO0.OooO0O0) oooOOO0.f269OooO00o).put(view, oo000o0o);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) oooOOO0.f270OooO0O0;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
        String OooOO0O2 = oo0oOO0.OooOO0O(view);
        if (OooOO0O2 != null) {
            if (((OooOO0.OooO0O0) oooOOO0.f272OooO0Oo).containsKey(OooOO0O2)) {
                ((OooOO0.OooO0O0) oooOOO0.f272OooO0Oo).put(OooOO0O2, null);
            } else {
                ((OooOO0.OooO0O0) oooOOO0.f272OooO0Oo).put(OooOO0O2, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                OooO0o oooO0o = (OooO0o) oooOOO0.f271OooO0OO;
                if (oooO0o.f520OooO00o) {
                    oooO0o.OooO0OO();
                }
                if (OooO00o.OooOOo0(oooO0o.f521OooO0O0, oooO0o.f523OooO0Oo, itemIdAtPosition) >= 0) {
                    View view2 = (View) oooO0o.OooO0Oo(itemIdAtPosition, null);
                    if (view2 != null) {
                        o00O0O0.OooOOo(view2, false);
                        oooO0o.OooO0o0(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                o00O0O0.OooOOo(view, true);
                oooO0o.OooO0o0(itemIdAtPosition, view);
            }
        }
    }

    public static OooOO0.OooO0O0 OooOOOO() {
        ThreadLocal threadLocal = f1639OooOo0o;
        OooOO0.OooO0O0 oooO0O0 = (OooOO0.OooO0O0) threadLocal.get();
        if (oooO0O0 == null) {
            OooOO0.OooO0O0 oooO0O02 = new OooOO0.OooO0O0();
            threadLocal.set(oooO0O02);
            return oooO0O02;
        }
        return oooO0O0;
    }

    public static boolean OooOo00(oO000O0O oo000o0o, oO000O0O oo000o0o2, String str) {
        Object obj = oo000o0o.f1668OooO00o.get(str);
        Object obj2 = oo000o0o2.f1668OooO00o.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public final void OooO(boolean z) {
        OooO0o.OooOOO0 oooOOO0;
        if (z) {
            ((OooOO0.OooO0O0) this.f1647OooO0oO.f269OooO00o).clear();
            ((SparseArray) this.f1647OooO0oO.f270OooO0O0).clear();
            oooOOO0 = this.f1647OooO0oO;
        } else {
            ((OooOO0.OooO0O0) this.f1648OooO0oo.f269OooO00o).clear();
            ((SparseArray) this.f1648OooO0oo.f270OooO0O0).clear();
            oooOOO0 = this.f1648OooO0oo;
        }
        ((OooO0o) oooOOO0.f271OooO0OO).OooO00o();
    }

    public void OooO00o(o oVar) {
        if (this.f1656OooOOo0 == null) {
            this.f1656OooOOo0 = new ArrayList();
        }
        this.f1656OooOOo0.add(oVar);
    }

    public void OooO0O0(View view) {
        this.f1645OooO0o.add(view);
    }

    public abstract void OooO0Oo(oO000O0O oo000o0o);

    public void OooO0o(oO000O0O oo000o0o) {
    }

    public final void OooO0o0(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            oO000O0O oo000o0o = new oO000O0O(view);
            if (z) {
                OooO0oO(oo000o0o);
            } else {
                OooO0Oo(oo000o0o);
            }
            oo000o0o.f1670OooO0OO.add(this);
            OooO0o(oo000o0o);
            OooO0OO(z ? this.f1647OooO0oO : this.f1648OooO0oo, view, oo000o0o);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                OooO0o0(viewGroup.getChildAt(i), z);
            }
        }
    }

    public abstract void OooO0oO(oO000O0O oo000o0o);

    public final void OooO0oo(ViewGroup viewGroup, boolean z) {
        OooO(z);
        ArrayList arrayList = this.f1646OooO0o0;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f1645OooO0o;
        if (size <= 0 && arrayList2.size() <= 0) {
            OooO0o0(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (findViewById != null) {
                oO000O0O oo000o0o = new oO000O0O(findViewById);
                if (z) {
                    OooO0oO(oo000o0o);
                } else {
                    OooO0Oo(oo000o0o);
                }
                oo000o0o.f1670OooO0OO.add(this);
                OooO0o(oo000o0o);
                OooO0OO(z ? this.f1647OooO0oO : this.f1648OooO0oo, findViewById, oo000o0o);
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            oO000O0O oo000o0o2 = new oO000O0O(view);
            if (z) {
                OooO0oO(oo000o0o2);
            } else {
                OooO0Oo(oo000o0o2);
            }
            oo000o0o2.f1670OooO0OO.add(this);
            OooO0o(oo000o0o2);
            OooO0OO(z ? this.f1647OooO0oO : this.f1648OooO0oo, view, oo000o0o2);
        }
    }

    @Override // 
    /* renamed from: OooOO0 */
    public oO00000 clone() {
        try {
            oO00000 oo00000 = (oO00000) super.clone();
            oo00000.f1655OooOOo = new ArrayList();
            oo00000.f1647OooO0oO = new OooO0o.OooOOO0(5);
            oo00000.f1648OooO0oo = new OooO0o.OooOOO0(5);
            oo00000.f1650OooOO0O = null;
            oo00000.f1651OooOO0o = null;
            return oo00000;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator OooOO0O(ViewGroup viewGroup, oO000O0O oo000o0o, oO000O0O oo000o0o2) {
        return null;
    }

    public void OooOO0o(ViewGroup viewGroup, OooO0o.OooOOO0 oooOOO0, OooO0o.OooOOO0 oooOOO02, ArrayList arrayList, ArrayList arrayList2) {
        boolean z;
        Animator OooOO0O2;
        View view;
        Animator animator;
        oO000O0O oo000o0o;
        Animator animator2;
        oO000O0O oo000o0o2;
        ViewGroup viewGroup2 = viewGroup;
        OooOO0.OooO0O0 OooOOOO2 = OooOOOO();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            oO000O0O oo000o0o3 = (oO000O0O) arrayList.get(i);
            oO000O0O oo000o0o4 = (oO000O0O) arrayList2.get(i);
            if (oo000o0o3 != null && !oo000o0o3.f1670OooO0OO.contains(this)) {
                oo000o0o3 = null;
            }
            if (oo000o0o4 != null && !oo000o0o4.f1670OooO0OO.contains(this)) {
                oo000o0o4 = null;
            }
            if (oo000o0o3 != null || oo000o0o4 != null) {
                if (oo000o0o3 != null && oo000o0o4 != null && !OooOOo(oo000o0o3, oo000o0o4)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z && (OooOO0O2 = OooOO0O(viewGroup2, oo000o0o3, oo000o0o4)) != null) {
                    if (oo000o0o4 != null) {
                        String[] OooOOOo2 = OooOOOo();
                        view = oo000o0o4.f1669OooO0O0;
                        if (OooOOOo2 != null && OooOOOo2.length > 0) {
                            oo000o0o2 = new oO000O0O(view);
                            oO000O0O oo000o0o5 = (oO000O0O) ((OooOO0.OooO0O0) oooOOO02.f269OooO00o).getOrDefault(view, null);
                            if (oo000o0o5 != null) {
                                int i2 = 0;
                                while (i2 < OooOOOo2.length) {
                                    HashMap hashMap = oo000o0o2.f1668OooO00o;
                                    Animator animator3 = OooOO0O2;
                                    String str = OooOOOo2[i2];
                                    hashMap.put(str, oo000o0o5.f1668OooO00o.get(str));
                                    i2++;
                                    OooOO0O2 = animator3;
                                    OooOOOo2 = OooOOOo2;
                                }
                            }
                            Animator animator4 = OooOO0O2;
                            int i3 = OooOOOO2.f542OooO0OO;
                            int i4 = 0;
                            while (true) {
                                if (i4 < i3) {
                                    ooo0Oo0 ooo0oo0 = (ooo0Oo0) OooOOOO2.getOrDefault((Animator) OooOOOO2.OooO0oo(i4), null);
                                    if (ooo0oo0.f1697OooO0OO != null && ooo0oo0.f1695OooO00o == view && ooo0oo0.f1696OooO0O0.equals(this.f1641OooO00o) && ooo0oo0.f1697OooO0OO.equals(oo000o0o2)) {
                                        animator2 = null;
                                        break;
                                    }
                                    i4++;
                                } else {
                                    animator2 = animator4;
                                    break;
                                }
                            }
                        } else {
                            animator2 = OooOO0O2;
                            oo000o0o2 = null;
                        }
                        animator = animator2;
                        oo000o0o = oo000o0o2;
                    } else {
                        view = oo000o0o3.f1669OooO0O0;
                        animator = OooOO0O2;
                        oo000o0o = null;
                    }
                    if (animator != null) {
                        String str2 = this.f1641OooO00o;
                        oO000OOo oo000ooo = oO0Ooooo.f1692OooO00o;
                        OooOOOO2.put(animator, new ooo0Oo0(view, str2, this, new oO000o00(viewGroup2), oo000o0o));
                        this.f1655OooOOo.add(animator);
                    }
                    i++;
                    viewGroup2 = viewGroup;
                }
            }
            i++;
            viewGroup2 = viewGroup;
        }
        if (sparseIntArray.size() != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                Animator animator5 = (Animator) this.f1655OooOOo.get(sparseIntArray.keyAt(i5));
                animator5.setStartDelay(animator5.getStartDelay() + (sparseIntArray.valueAt(i5) - Long.MAX_VALUE));
            }
        }
    }

    public final oO000O0O OooOOO(View view, boolean z) {
        oO000 oo000 = this.f1640OooO;
        if (oo000 != null) {
            return oo000.OooOOO(view, z);
        }
        ArrayList arrayList = z ? this.f1650OooOO0O : this.f1651OooOO0o;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            oO000O0O oo000o0o = (oO000O0O) arrayList.get(i);
            if (oo000o0o == null) {
                return null;
            }
            if (oo000o0o.f1669OooO0O0 == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (oO000O0O) (z ? this.f1651OooOO0o : this.f1650OooOO0O).get(i);
        }
        return null;
    }

    public final void OooOOO0() {
        int i = this.f1652OooOOO - 1;
        this.f1652OooOOO = i;
        if (i == 0) {
            ArrayList arrayList = this.f1656OooOOo0;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f1656OooOOo0.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((o) arrayList2.get(i2)).OooO0o0(this);
                }
            }
            int i3 = 0;
            while (true) {
                OooO0o oooO0o = (OooO0o) this.f1647OooO0oO.f271OooO0OO;
                if (oooO0o.f520OooO00o) {
                    oooO0o.OooO0OO();
                }
                if (i3 >= oooO0o.f523OooO0Oo) {
                    break;
                }
                View view = (View) ((OooO0o) this.f1647OooO0oO.f271OooO0OO).OooO0o(i3);
                if (view != null) {
                    WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
                    o00O0O0.OooOOo(view, false);
                }
                i3++;
            }
            int i4 = 0;
            while (true) {
                OooO0o oooO0o2 = (OooO0o) this.f1648OooO0oo.f271OooO0OO;
                if (oooO0o2.f520OooO00o) {
                    oooO0o2.OooO0OO();
                }
                if (i4 < oooO0o2.f523OooO0Oo) {
                    View view2 = (View) ((OooO0o) this.f1648OooO0oo.f271OooO0OO).OooO0o(i4);
                    if (view2 != null) {
                        WeakHashMap weakHashMap2 = o0o0Oo.f1363OooO00o;
                        o00O0O0.OooOOo(view2, false);
                    }
                    i4++;
                } else {
                    this.f1654OooOOOo = true;
                    return;
                }
            }
        }
    }

    public String[] OooOOOo() {
        return null;
    }

    public boolean OooOOo(oO000O0O oo000o0o, oO000O0O oo000o0o2) {
        if (oo000o0o == null || oo000o0o2 == null) {
            return false;
        }
        String[] OooOOOo2 = OooOOOo();
        if (OooOOOo2 != null) {
            for (String str : OooOOOo2) {
                if (!OooOo00(oo000o0o, oo000o0o2, str)) {
                }
            }
            return false;
        }
        for (String str2 : oo000o0o.f1668OooO00o.keySet()) {
            if (OooOo00(oo000o0o, oo000o0o2, str2)) {
            }
        }
        return false;
        return true;
    }

    public final oO000O0O OooOOo0(View view, boolean z) {
        OooO0o.OooOOO0 oooOOO0;
        oO000 oo000 = this.f1640OooO;
        if (oo000 != null) {
            return oo000.OooOOo0(view, z);
        }
        if (z) {
            oooOOO0 = this.f1647OooO0oO;
        } else {
            oooOOO0 = this.f1648OooO0oo;
        }
        return (oO000O0O) ((OooOO0.OooO0O0) oooOOO0.f269OooO00o).getOrDefault(view, null);
    }

    public final boolean OooOOoo(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f1646OooO0o0;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f1645OooO0o;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public void OooOo(ViewGroup viewGroup) {
        boolean z;
        if (this.f1653OooOOOO) {
            if (!this.f1654OooOOOo) {
                OooOO0.OooO0O0 OooOOOO2 = OooOOOO();
                int i = OooOOOO2.f542OooO0OO;
                oO000OOo oo000ooo = oO0Ooooo.f1692OooO00o;
                WindowId windowId = viewGroup.getWindowId();
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    ooo0Oo0 ooo0oo0 = (ooo0Oo0) OooOOOO2.OooOO0(i2);
                    if (ooo0oo0.f1695OooO00o != null) {
                        oO0O0OoO oo0o0ooo = ooo0oo0.f1698OooO0Oo;
                        if ((oo0o0ooo instanceof oO000o00) && ((oO000o00) oo0o0ooo).f1684OooO00o.equals(windowId)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            ((Animator) OooOOOO2.OooO0oo(i2)).resume();
                        }
                    }
                }
                ArrayList arrayList = this.f1656OooOOo0;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f1656OooOOo0.clone();
                    int size = arrayList2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((o) arrayList2.get(i3)).OooO0Oo();
                    }
                }
            }
            this.f1653OooOOOO = false;
        }
    }

    public void OooOo0(View view) {
        int i;
        if (!this.f1654OooOOOo) {
            OooOO0.OooO0O0 OooOOOO2 = OooOOOO();
            int i2 = OooOOOO2.f542OooO0OO;
            oO000OOo oo000ooo = oO0Ooooo.f1692OooO00o;
            WindowId windowId = view.getWindowId();
            int i3 = i2 - 1;
            while (true) {
                i = 0;
                if (i3 < 0) {
                    break;
                }
                ooo0Oo0 ooo0oo0 = (ooo0Oo0) OooOOOO2.OooOO0(i3);
                if (ooo0oo0.f1695OooO00o != null) {
                    oO0O0OoO oo0o0ooo = ooo0oo0.f1698OooO0Oo;
                    if ((oo0o0ooo instanceof oO000o00) && ((oO000o00) oo0o0ooo).f1684OooO00o.equals(windowId)) {
                        i = 1;
                    }
                    if (i != 0) {
                        ((Animator) OooOOOO2.OooO0oo(i3)).pause();
                    }
                }
                i3--;
            }
            ArrayList arrayList = this.f1656OooOOo0;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f1656OooOOo0.clone();
                int size = arrayList2.size();
                while (i < size) {
                    ((o) arrayList2.get(i)).OooO0O0();
                    i++;
                }
            }
            this.f1653OooOOOO = true;
        }
    }

    public void OooOo0O(o oVar) {
        ArrayList arrayList = this.f1656OooOOo0;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(oVar);
        if (this.f1656OooOOo0.size() == 0) {
            this.f1656OooOOo0 = null;
        }
    }

    public void OooOo0o(View view) {
        this.f1645OooO0o.remove(view);
    }

    public void OooOoO(long j) {
        this.f1643OooO0OO = j;
    }

    public void OooOoO0() {
        Oooo000();
        OooOO0.OooO0O0 OooOOOO2 = OooOOOO();
        Iterator it = this.f1655OooOOo.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (OooOOOO2.containsKey(animator)) {
                Oooo000();
                if (animator != null) {
                    animator.addListener(new o0oo0000(this, OooOOOO2));
                    long j = this.f1643OooO0OO;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.f1642OooO0O0;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.f1644OooO0Oo;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new androidx.appcompat.widget.OooO0o(1, this));
                    animator.start();
                }
            }
        }
        this.f1655OooOOo.clear();
        OooOOO0();
    }

    public void OooOoOO(OooO0O0 oooO0O0) {
        this.f1657OooOOoo = oooO0O0;
    }

    public void OooOoo(OooOOO0 oooOOO0) {
        if (oooOOO0 == null) {
            oooOOO0 = f1638OooOo0O;
        }
        this.f1658OooOo00 = oooOOO0;
    }

    public void OooOoo0(TimeInterpolator timeInterpolator) {
        this.f1644OooO0Oo = timeInterpolator;
    }

    public void OooOooO() {
    }

    public void OooOooo(long j) {
        this.f1642OooO0O0 = j;
    }

    public final void Oooo000() {
        if (this.f1652OooOOO == 0) {
            ArrayList arrayList = this.f1656OooOOo0;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f1656OooOOo0.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((o) arrayList2.get(i)).OooO0OO();
                }
            }
            this.f1654OooOOOo = false;
        }
        this.f1652OooOOO++;
    }

    public String Oooo00O(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f1643OooO0OO != -1) {
            str2 = str2 + "dur(" + this.f1643OooO0OO + ") ";
        }
        if (this.f1642OooO0O0 != -1) {
            str2 = str2 + "dly(" + this.f1642OooO0O0 + ") ";
        }
        if (this.f1644OooO0Oo != null) {
            str2 = str2 + "interp(" + this.f1644OooO0Oo + ") ";
        }
        ArrayList arrayList = this.f1646OooO0o0;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f1645OooO0o;
        if (size > 0 || arrayList2.size() > 0) {
            String OooO0OO2 = OooO0O0.OooO00o.OooO0OO(str2, "tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        OooO0OO2 = OooO0O0.OooO00o.OooO0OO(OooO0OO2, ", ");
                    }
                    OooO0OO2 = OooO0OO2 + arrayList.get(i);
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        OooO0OO2 = OooO0O0.OooO00o.OooO0OO(OooO0OO2, ", ");
                    }
                    OooO0OO2 = OooO0OO2 + arrayList2.get(i2);
                }
            }
            return OooO0O0.OooO00o.OooO0OO(OooO0OO2, ")");
        }
        return str2;
    }

    public final String toString() {
        return Oooo00O("");
    }
}