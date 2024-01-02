package o000oOoO;

import OooOooo.o00O0O0;
import OooOooo.o0o0Oo;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class o00000 implements Runnable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f4944OooO00o;

    public /* synthetic */ o00000(RecyclerView recyclerView) {
        this.f4944OooO00o = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        ArrayList arrayList;
        long j;
        long j2;
        RecyclerView recyclerView = this.f4944OooO00o;
        o0000oo o0000ooVar = recyclerView.f3177Oooo00o;
        if (o0000ooVar != null) {
            OooOo00 oooOo00 = (OooOo00) o0000ooVar;
            ArrayList arrayList2 = oooOo00.f4929OooO0oo;
            boolean z2 = !arrayList2.isEmpty();
            ArrayList arrayList3 = oooOo00.f4930OooOO0;
            boolean z3 = !arrayList3.isEmpty();
            ArrayList arrayList4 = oooOo00.f4931OooOO0O;
            boolean z4 = !arrayList4.isEmpty();
            ArrayList arrayList5 = oooOo00.f4927OooO;
            boolean z5 = !arrayList5.isEmpty();
            if (z2 || z3 || z5 || z4) {
                Iterator it = arrayList2.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    arrayList = arrayList3;
                    j = oooOo00.f4969OooO0Oo;
                    if (!hasNext) {
                        break;
                    }
                    o000OOo0 o000ooo0 = (o000OOo0) it.next();
                    View view = o000ooo0.f5031OooO00o;
                    ViewPropertyAnimator animate = view.animate();
                    oooOo00.f4937OooOOo0.add(o000ooo0);
                    animate.setDuration(j).alpha(0.0f).setListener(new OooOO0(oooOo00, o000ooo0, animate, view)).start();
                    arrayList3 = arrayList;
                }
                arrayList2.clear();
                if (z3) {
                    ArrayList arrayList6 = new ArrayList();
                    arrayList6.addAll(arrayList);
                    oooOo00.OooOOO0.add(arrayList6);
                    arrayList.clear();
                    OooO oooO = new OooO(oooOo00, arrayList6, 0);
                    if (z2) {
                        View view2 = ((OooOOOO) arrayList6.get(0)).f4919OooO00o.f5031OooO00o;
                        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
                        o00O0O0.OooOOO(view2, oooO, j);
                    } else {
                        oooO.run();
                    }
                }
                if (z4) {
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.addAll(arrayList4);
                    oooOo00.f4933OooOOO.add(arrayList7);
                    arrayList4.clear();
                    OooO oooO2 = new OooO(oooOo00, arrayList7, 1);
                    if (z2) {
                        View view3 = ((OooOOO) arrayList7.get(0)).f4908OooO00o.f5031OooO00o;
                        WeakHashMap weakHashMap2 = o0o0Oo.f1363OooO00o;
                        o00O0O0.OooOOO(view3, oooO2, j);
                    } else {
                        oooO2.run();
                    }
                }
                if (z5) {
                    ArrayList arrayList8 = new ArrayList();
                    arrayList8.addAll(arrayList5);
                    oooOo00.f4932OooOO0o.add(arrayList8);
                    arrayList5.clear();
                    OooO oooO3 = new OooO(oooOo00, arrayList8, 2);
                    if (!z2 && !z3 && !z4) {
                        oooO3.run();
                    } else {
                        long j3 = 0;
                        if (!z2) {
                            j = 0;
                        }
                        if (z3) {
                            j2 = oooOo00.f4971OooO0o0;
                        } else {
                            j2 = 0;
                        }
                        if (z4) {
                            j3 = oooOo00.f4970OooO0o;
                        }
                        long max = Math.max(j2, j3) + j;
                        z = false;
                        View view4 = ((o000OOo0) arrayList8.get(0)).f5031OooO00o;
                        WeakHashMap weakHashMap3 = o0o0Oo.f1363OooO00o;
                        o00O0O0.OooOOO(view4, oooO3, max);
                        recyclerView.f3197OooooOo = z;
                    }
                }
            }
        }
        z = false;
        recyclerView.f3197OooooOo = z;
    }
}