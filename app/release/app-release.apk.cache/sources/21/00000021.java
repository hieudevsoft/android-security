package OooO0Oo;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class o00000O0 extends ContentFrameLayout {

    /* renamed from: OooO  reason: collision with root package name */
    public final /* synthetic */ o00000OO f117OooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O0(o00000OO o00000oo2, OooO0o.OooOO0 oooOO0) {
        super(oooOO0, null);
        this.f117OooO = o00000oo2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f117OooO.OooOo0(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x >= -5 && y >= -5 && x <= getWidth() + 5 && y <= getHeight() + 5) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                o00000OO o00000oo2 = this.f117OooO;
                o00000oo2.OooOOoo(o00000oo2.OooOoO(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(OooO00o.o0ooOoO(getContext(), i));
    }
}