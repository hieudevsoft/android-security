package androidx.appcompat.widget;

import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class o00OO implements Runnable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f2336OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ o00Oo00 f2337OooO0O0;

    public /* synthetic */ o00OO(o00Oo00 o00oo00, int i) {
        this.f2336OooO00o = i;
        this.f2337OooO0O0 = o00oo00;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2336OooO00o;
        o00Oo00 o00oo00 = this.f2337OooO0O0;
        switch (i) {
            case 1:
                o00OO000 o00oo000 = o00oo00.f2377OooO0OO;
                if (o00oo000 != null) {
                    o00oo000.setListSelectionHidden(true);
                    o00oo000.requestLayout();
                    return;
                }
                return;
            default:
                o00OO000 o00oo0002 = o00oo00.f2377OooO0OO;
                if (o00oo0002 != null) {
                    WeakHashMap weakHashMap = OooOooo.o0o0Oo.f1363OooO00o;
                    if (OooOooo.oo0o0O0.OooO0O0(o00oo0002) && o00oo00.f2377OooO0OO.getCount() > o00oo00.f2377OooO0OO.getChildCount() && o00oo00.f2377OooO0OO.getChildCount() <= o00oo00.OooOOO0) {
                        o00oo00.f2397OooOoO.setInputMethodMode(2);
                        o00oo00.OooO();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}