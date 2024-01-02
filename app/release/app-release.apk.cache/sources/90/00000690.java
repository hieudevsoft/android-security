package o00O0O;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class OooO00o implements View.OnTouchListener {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Dialog f5188OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final int f5189OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final int f5190OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final int f5191OooO0Oo;

    public OooO00o(Dialog dialog, Rect rect) {
        this.f5188OooO00o = dialog;
        this.f5189OooO0O0 = rect.left;
        this.f5190OooO0OO = rect.top;
        this.f5191OooO0Oo = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = findViewById.getLeft() + this.f5189OooO0O0;
        int width = findViewById.getWidth() + left;
        int top = findViewById.getTop() + this.f5190OooO0OO;
        if (new RectF(left, top, width, findViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.f5191OooO0Oo;
            obtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.f5188OooO00o.onTouchEvent(obtain);
    }
}