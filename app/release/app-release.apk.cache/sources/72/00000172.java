package OooOooo;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.appcompat.widget.o0O0O00;

/* loaded from: classes.dex */
public final class o0OoOoOo implements Runnable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ View f1360OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ o0O0O00 f1361OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ ValueAnimator f1362OooO0OO;

    public o0OoOoOo(View view, o0O00O o0o00o, o0O0O00 o0o0o00, ValueAnimator valueAnimator) {
        this.f1360OooO00o = view;
        this.f1361OooO0O0 = o0o0o00;
        this.f1362OooO0OO = valueAnimator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o0O000o0.OooO0oo(this.f1360OooO00o, this.f1361OooO0O0);
        this.f1362OooO0OO.start();
    }
}