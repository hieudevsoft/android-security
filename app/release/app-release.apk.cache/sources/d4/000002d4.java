package androidx.appcompat.widget;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class o00OOOOo implements View.OnTouchListener {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ o00Oo00 f2364OooO00o;

    public o00OOOOo(o00Oo00 o00oo00) {
        this.f2364OooO00o = o00oo00;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        o00000O o00000o;
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        o00Oo00 o00oo00 = this.f2364OooO00o;
        if (action == 0 && (o00000o = o00oo00.f2397OooOoO) != null && o00000o.isShowing() && x >= 0) {
            o00000O o00000o2 = o00oo00.f2397OooOoO;
            if (x < o00000o2.getWidth() && y >= 0 && y < o00000o2.getHeight()) {
                o00oo00.f2395OooOo0O.postDelayed(o00oo00.f2389OooOOo, 250L);
                return false;
            }
        }
        if (action == 1) {
            o00oo00.f2395OooOo0O.removeCallbacks(o00oo00.f2389OooOOo);
            return false;
        }
        return false;
    }
}