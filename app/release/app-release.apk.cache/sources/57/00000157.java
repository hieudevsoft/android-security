package OooOooo;

import OooOo.OooO0OO;
import Oooooo.o00000O;
import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class o0O00 extends WindowInsetsAnimation$Callback {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o00000O f1307OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public List f1308OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public ArrayList f1309OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final HashMap f1310OooO0Oo;

    public o0O00(o00000O o00000o) {
        super(0);
        this.f1310OooO0Oo = new HashMap();
        this.f1307OooO00o = o00000o;
    }

    public final o0O00O OooO00o(WindowInsetsAnimation windowInsetsAnimation) {
        o0O00O o0o00o = (o0O00O) this.f1310OooO0Oo.get(windowInsetsAnimation);
        if (o0o00o == null) {
            o0O00O o0o00o2 = new o0O00O(windowInsetsAnimation);
            this.f1310OooO0Oo.put(windowInsetsAnimation, o0o00o2);
            return o0o00o2;
        }
        return o0o00o;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        o00000O o00000o = this.f1307OooO00o;
        OooO00o(windowInsetsAnimation);
        o00000o.f1855OooO0O0.setTranslationY(0.0f);
        this.f1310OooO0Oo.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        o00000O o00000o = this.f1307OooO00o;
        OooO00o(windowInsetsAnimation);
        View view = o00000o.f1855OooO0O0;
        int[] iArr = o00000o.f1858OooO0o0;
        view.getLocationOnScreen(iArr);
        o00000o.f1856OooO0OO = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.f1309OooO0OO;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f1309OooO0OO = arrayList2;
            this.f1308OooO0O0 = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                WindowInsetsAnimation OooOO02 = o00O00O.OooOO0(list.get(size));
                o0O00O OooO00o2 = OooO00o(OooOO02);
                fraction = OooOO02.getFraction();
                OooO00o2.f1321OooO00o.OooO0Oo(fraction);
                this.f1309OooO0OO.add(OooO00o2);
            } else {
                o00000O o00000o = this.f1307OooO00o;
                o0O0OOOo OooO0oo2 = o0O0OOOo.OooO0oo(null, windowInsets);
                o00000o.OooO00o(OooO0oo2, this.f1308OooO0O0);
                return OooO0oo2.OooO0oO();
            }
        }
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        o00000O o00000o = this.f1307OooO00o;
        OooO00o(windowInsetsAnimation);
        lowerBound = bounds.getLowerBound();
        OooO0OO OooO0OO2 = OooO0OO.OooO0OO(lowerBound);
        upperBound = bounds.getUpperBound();
        OooO0OO OooO0OO3 = OooO0OO.OooO0OO(upperBound);
        View view = o00000o.f1855OooO0O0;
        int[] iArr = o00000o.f1858OooO0o0;
        view.getLocationOnScreen(iArr);
        int i = o00000o.f1856OooO0OO - iArr[1];
        o00000o.f1857OooO0Oo = i;
        view.setTranslationY(i);
        o00O00O.OooOOO0();
        return o00O00O.OooO0oo(OooO0OO2.OooO0Oo(), OooO0OO3.OooO0Oo());
    }
}