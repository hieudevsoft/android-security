package androidx.appcompat.widget;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class o0O0OO0 extends TouchDelegate {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final View f2444OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final Rect f2445OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final Rect f2446OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final Rect f2447OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public boolean f2448OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final int f2449OooO0o0;

    public o0O0OO0(Rect rect, Rect rect2, SearchView.SearchAutoComplete searchAutoComplete) {
        super(rect, searchAutoComplete);
        int scaledTouchSlop = ViewConfiguration.get(searchAutoComplete.getContext()).getScaledTouchSlop();
        this.f2449OooO0o0 = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f2445OooO0O0 = rect3;
        Rect rect4 = new Rect();
        this.f2447OooO0Oo = rect4;
        Rect rect5 = new Rect();
        this.f2446OooO0OO = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i = -scaledTouchSlop;
        rect4.inset(i, i);
        rect5.set(rect2);
        this.f2444OooO00o = searchAutoComplete;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        float f;
        int i;
        boolean z2;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z3 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z2 = this.f2448OooO0o;
                if (z2 && !this.f2447OooO0Oo.contains(x, y)) {
                    z3 = z2;
                    z = false;
                }
            } else {
                if (action == 3) {
                    z2 = this.f2448OooO0o;
                    this.f2448OooO0o = false;
                }
                z = true;
                z3 = false;
            }
            z3 = z2;
            z = true;
        } else {
            if (this.f2445OooO0O0.contains(x, y)) {
                this.f2448OooO0o = true;
                z = true;
            }
            z = true;
            z3 = false;
        }
        if (z3) {
            Rect rect = this.f2446OooO0OO;
            View view = this.f2444OooO00o;
            if (!z || rect.contains(x, y)) {
                f = x - rect.left;
                i = y - rect.top;
            } else {
                f = view.getWidth() / 2;
                i = view.getHeight() / 2;
            }
            motionEvent.setLocation(f, i);
            return view.dispatchTouchEvent(motionEvent);
        }
        return false;
    }
}