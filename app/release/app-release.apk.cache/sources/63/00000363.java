package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;

/* loaded from: classes.dex */
public final class o000O00 extends Transition.EpicenterCallback {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f2904OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ Rect f2905OooO0O0;

    public /* synthetic */ o000O00(Rect rect, int i) {
        this.f2904OooO00o = i;
        this.f2905OooO0O0 = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        int i = this.f2904OooO00o;
        Rect rect = this.f2905OooO0O0;
        switch (i) {
            case 0:
                return rect;
            default:
                if (rect == null || rect.isEmpty()) {
                    return null;
                }
                return rect;
        }
    }
}