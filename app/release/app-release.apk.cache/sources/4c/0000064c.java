package o000oOoO;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OooO implements Runnable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f4880OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ ArrayList f4881OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ OooOo00 f4882OooO0OO;

    public /* synthetic */ OooO(OooOo00 oooOo00, ArrayList arrayList, int i) {
        this.f4880OooO00o = i;
        this.f4882OooO0OO = oooOo00;
        this.f4881OooO0O0 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        View view2;
        long j;
        int i = this.f4880OooO00o;
        OooOo00 oooOo00 = this.f4882OooO0OO;
        ArrayList arrayList = this.f4881OooO0O0;
        switch (i) {
            case 0:
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    OooOOOO oooOOOO = (OooOOOO) it.next();
                    o000OOo0 o000ooo0 = oooOOOO.f4919OooO00o;
                    oooOo00.getClass();
                    View view3 = o000ooo0.f5031OooO00o;
                    int i2 = oooOOOO.f4922OooO0Oo - oooOOOO.f4920OooO0O0;
                    int i3 = oooOOOO.f4923OooO0o0 - oooOOOO.f4921OooO0OO;
                    if (i2 != 0) {
                        view3.animate().translationX(0.0f);
                    }
                    if (i3 != 0) {
                        view3.animate().translationY(0.0f);
                    }
                    ViewPropertyAnimator animate = view3.animate();
                    oooOo00.f4935OooOOOo.add(o000ooo0);
                    animate.setDuration(oooOo00.f4971OooO0o0).setListener(new OooOO0O(oooOo00, o000ooo0, i2, view3, i3, animate)).start();
                }
                arrayList.clear();
                oooOo00.OooOOO0.remove(arrayList);
                return;
            case 1:
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    OooOOO oooOOO = (OooOOO) it2.next();
                    oooOo00.getClass();
                    o000OOo0 o000ooo02 = oooOOO.f4908OooO00o;
                    if (o000ooo02 == null) {
                        view = null;
                    } else {
                        view = o000ooo02.f5031OooO00o;
                    }
                    o000OOo0 o000ooo03 = oooOOO.f4909OooO0O0;
                    if (o000ooo03 != null) {
                        view2 = o000ooo03.f5031OooO00o;
                    } else {
                        view2 = null;
                    }
                    ArrayList arrayList2 = oooOo00.f4936OooOOo;
                    long j2 = oooOo00.f4970OooO0o;
                    if (view != null) {
                        ViewPropertyAnimator duration = view.animate().setDuration(j2);
                        arrayList2.add(oooOOO.f4908OooO00o);
                        duration.translationX(oooOOO.f4913OooO0o0 - oooOOO.f4910OooO0OO);
                        duration.translationY(oooOOO.f4912OooO0o - oooOOO.f4911OooO0Oo);
                        j = j2;
                        duration.alpha(0.0f).setListener(new OooOOO0(oooOo00, oooOOO, duration, view, 0)).start();
                    } else {
                        j = j2;
                    }
                    if (view2 != null) {
                        ViewPropertyAnimator animate2 = view2.animate();
                        arrayList2.add(oooOOO.f4909OooO0O0);
                        animate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new OooOOO0(oooOo00, oooOOO, animate2, view2, 1)).start();
                    }
                }
                arrayList.clear();
                oooOo00.f4933OooOOO.remove(arrayList);
                return;
            default:
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    o000OOo0 o000ooo04 = (o000OOo0) it3.next();
                    oooOo00.getClass();
                    View view4 = o000ooo04.f5031OooO00o;
                    ViewPropertyAnimator animate3 = view4.animate();
                    oooOo00.f4934OooOOOO.add(o000ooo04);
                    animate3.alpha(1.0f).setDuration(oooOo00.f4968OooO0OO).setListener(new OooOO0(oooOo00, o000ooo04, view4, animate3, 1)).start();
                }
                arrayList.clear();
                oooOo00.f4932OooOO0o.remove(arrayList);
                return;
        }
    }
}