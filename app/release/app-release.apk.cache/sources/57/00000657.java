package o000oOoO;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class OooOo00 extends o0000oo {

    /* renamed from: OooOOoo  reason: collision with root package name */
    public static TimeInterpolator f4926OooOOoo;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final boolean f4928OooO0oO = true;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final ArrayList f4929OooO0oo = new ArrayList();

    /* renamed from: OooO  reason: collision with root package name */
    public final ArrayList f4927OooO = new ArrayList();

    /* renamed from: OooOO0  reason: collision with root package name */
    public final ArrayList f4930OooOO0 = new ArrayList();

    /* renamed from: OooOO0O  reason: collision with root package name */
    public final ArrayList f4931OooOO0O = new ArrayList();

    /* renamed from: OooOO0o  reason: collision with root package name */
    public final ArrayList f4932OooOO0o = new ArrayList();
    public final ArrayList OooOOO0 = new ArrayList();

    /* renamed from: OooOOO  reason: collision with root package name */
    public final ArrayList f4933OooOOO = new ArrayList();

    /* renamed from: OooOOOO  reason: collision with root package name */
    public final ArrayList f4934OooOOOO = new ArrayList();

    /* renamed from: OooOOOo  reason: collision with root package name */
    public final ArrayList f4935OooOOOo = new ArrayList();

    /* renamed from: OooOOo0  reason: collision with root package name */
    public final ArrayList f4937OooOOo0 = new ArrayList();

    /* renamed from: OooOOo  reason: collision with root package name */
    public final ArrayList f4936OooOOo = new ArrayList();

    public static void OooO0oo(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            ((o000OOo0) arrayList.get(size)).f5031OooO00o.animate().cancel();
        }
    }

    public final void OooO() {
        if (!OooO0o()) {
            ArrayList arrayList = this.f4967OooO0O0;
            if (arrayList.size() <= 0) {
                arrayList.clear();
            } else {
                OooO0O0.OooO00o.OooO0oO(arrayList.get(0));
                throw null;
            }
        }
    }

    @Override // o000oOoO.o0000oo
    public final boolean OooO00o(o000OOo0 o000ooo0, o000OOo0 o000ooo02, o0000O00 o0000o00, o0000O00 o0000o002) {
        int i;
        int i2;
        int i3 = o0000o00.f4958OooO00o;
        int i4 = o0000o00.f4959OooO0O0;
        if (o000ooo02.OooOOOO()) {
            int i5 = o0000o00.f4958OooO00o;
            i2 = o0000o00.f4959OooO0O0;
            i = i5;
        } else {
            i = o0000o002.f4958OooO00o;
            i2 = o0000o002.f4959OooO0O0;
        }
        if (o000ooo0 == o000ooo02) {
            return OooO0oO(o000ooo0, i3, i4, i, i2);
        }
        View view = o000ooo0.f5031OooO00o;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        OooOO0o(o000ooo0);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        OooOO0o(o000ooo02);
        View view2 = o000ooo02.f5031OooO00o;
        view2.setTranslationX(-((int) ((i - i3) - translationX)));
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        this.f4931OooOO0O.add(new OooOOO(o000ooo0, o000ooo02, i3, i4, i, i2));
        return true;
    }

    @Override // o000oOoO.o0000oo
    public final void OooO0Oo(o000OOo0 o000ooo0) {
        View view = o000ooo0.f5031OooO00o;
        view.animate().cancel();
        ArrayList arrayList = this.f4930OooOO0;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((OooOOOO) arrayList.get(size)).f4919OooO00o == o000ooo0) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                OooO0OO(o000ooo0);
                arrayList.remove(size);
            }
        }
        OooOO0(o000ooo0, this.f4931OooOO0O);
        if (this.f4929OooO0oo.remove(o000ooo0)) {
            view.setAlpha(1.0f);
            OooO0OO(o000ooo0);
        }
        if (this.f4927OooO.remove(o000ooo0)) {
            view.setAlpha(1.0f);
            OooO0OO(o000ooo0);
        }
        ArrayList arrayList2 = this.f4933OooOOO;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            OooOO0(o000ooo0, arrayList3);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.OooOOO0;
        int size3 = arrayList4.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (((OooOOOO) arrayList5.get(size4)).f4919OooO00o == o000ooo0) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    OooO0OO(o000ooo0);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                }
            }
        }
        ArrayList arrayList6 = this.f4932OooOO0o;
        int size5 = arrayList6.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
                if (arrayList7.remove(o000ooo0)) {
                    view.setAlpha(1.0f);
                    OooO0OO(o000ooo0);
                    if (arrayList7.isEmpty()) {
                        arrayList6.remove(size5);
                    }
                }
            } else {
                this.f4937OooOOo0.remove(o000ooo0);
                this.f4934OooOOOO.remove(o000ooo0);
                this.f4936OooOOo.remove(o000ooo0);
                this.f4935OooOOOo.remove(o000ooo0);
                OooO();
                return;
            }
        }
    }

    @Override // o000oOoO.o0000oo
    public final boolean OooO0o() {
        return (this.f4927OooO.isEmpty() && this.f4931OooOO0O.isEmpty() && this.f4930OooOO0.isEmpty() && this.f4929OooO0oo.isEmpty() && this.f4935OooOOOo.isEmpty() && this.f4937OooOOo0.isEmpty() && this.f4934OooOOOO.isEmpty() && this.f4936OooOOo.isEmpty() && this.OooOOO0.isEmpty() && this.f4932OooOO0o.isEmpty() && this.f4933OooOOO.isEmpty()) ? false : true;
    }

    @Override // o000oOoO.o0000oo
    public final void OooO0o0() {
        ArrayList arrayList = this.f4930OooOO0;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            OooOOOO oooOOOO = (OooOOOO) arrayList.get(size);
            View view = oooOOOO.f4919OooO00o.f5031OooO00o;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            OooO0OO(oooOOOO.f4919OooO00o);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f4929OooO0oo;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            OooO0OO((o000OOo0) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f4927OooO;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            o000OOo0 o000ooo0 = (o000OOo0) arrayList3.get(size3);
            o000ooo0.f5031OooO00o.setAlpha(1.0f);
            OooO0OO(o000ooo0);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f4931OooOO0O;
        int size4 = arrayList4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            OooOOO oooOOO = (OooOOO) arrayList4.get(size4);
            o000OOo0 o000ooo02 = oooOOO.f4908OooO00o;
            if (o000ooo02 != null) {
                OooOO0O(oooOOO, o000ooo02);
            }
            o000OOo0 o000ooo03 = oooOOO.f4909OooO0O0;
            if (o000ooo03 != null) {
                OooOO0O(oooOOO, o000ooo03);
            }
        }
        arrayList4.clear();
        if (!OooO0o()) {
            return;
        }
        ArrayList arrayList5 = this.OooOOO0;
        int size5 = arrayList5.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            int size6 = arrayList6.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    OooOOOO oooOOOO2 = (OooOOOO) arrayList6.get(size6);
                    View view2 = oooOOOO2.f4919OooO00o.f5031OooO00o;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    OooO0OO(oooOOOO2.f4919OooO00o);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
        }
        ArrayList arrayList7 = this.f4932OooOO0o;
        int size7 = arrayList7.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            int size8 = arrayList8.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    o000OOo0 o000ooo04 = (o000OOo0) arrayList8.get(size8);
                    o000ooo04.f5031OooO00o.setAlpha(1.0f);
                    OooO0OO(o000ooo04);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
        }
        ArrayList arrayList9 = this.f4933OooOOO;
        int size9 = arrayList9.size();
        while (true) {
            size9--;
            if (size9 < 0) {
                break;
            }
            ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
            int size10 = arrayList10.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    OooOOO oooOOO2 = (OooOOO) arrayList10.get(size10);
                    o000OOo0 o000ooo05 = oooOOO2.f4908OooO00o;
                    if (o000ooo05 != null) {
                        OooOO0O(oooOOO2, o000ooo05);
                    }
                    o000OOo0 o000ooo06 = oooOOO2.f4909OooO0O0;
                    if (o000ooo06 != null) {
                        OooOO0O(oooOOO2, o000ooo06);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
        }
        OooO0oo(this.f4937OooOOo0);
        OooO0oo(this.f4935OooOOOo);
        OooO0oo(this.f4934OooOOOO);
        OooO0oo(this.f4936OooOOo);
        ArrayList arrayList11 = this.f4967OooO0O0;
        if (arrayList11.size() <= 0) {
            arrayList11.clear();
        } else {
            OooO0O0.OooO00o.OooO0oO(arrayList11.get(0));
            throw null;
        }
    }

    public final boolean OooO0oO(o000OOo0 o000ooo0, int i, int i2, int i3, int i4) {
        View view = o000ooo0.f5031OooO00o;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) o000ooo0.f5031OooO00o.getTranslationY());
        OooOO0o(o000ooo0);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            OooO0OO(o000ooo0);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.f4930OooOO0.add(new OooOOOO(o000ooo0, translationX, translationY, i3, i4));
        return true;
    }

    public final void OooOO0(o000OOo0 o000ooo0, ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            OooOOO oooOOO = (OooOOO) arrayList.get(size);
            if (OooOO0O(oooOOO, o000ooo0) && oooOOO.f4908OooO00o == null && oooOOO.f4909OooO0O0 == null) {
                arrayList.remove(oooOOO);
            }
        }
    }

    public final boolean OooOO0O(OooOOO oooOOO, o000OOo0 o000ooo0) {
        if (oooOOO.f4909OooO0O0 == o000ooo0) {
            oooOOO.f4909OooO0O0 = null;
        } else if (oooOOO.f4908OooO00o == o000ooo0) {
            oooOOO.f4908OooO00o = null;
        } else {
            return false;
        }
        o000ooo0.f5031OooO00o.setAlpha(1.0f);
        View view = o000ooo0.f5031OooO00o;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        OooO0OO(o000ooo0);
        return true;
    }

    public final void OooOO0o(o000OOo0 o000ooo0) {
        if (f4926OooOOoo == null) {
            f4926OooOOoo = new ValueAnimator().getInterpolator();
        }
        o000ooo0.f5031OooO00o.animate().setInterpolator(f4926OooOOoo);
        OooO0Oo(o000ooo0);
    }
}