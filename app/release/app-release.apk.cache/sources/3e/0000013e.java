package OooOooo;

import android.view.View;
import androidx.activity.OooO0o;
import o0ooOO0.OooOOO0;

/* loaded from: classes.dex */
public class o00O00 extends OooOOO0 {

    /* renamed from: OooO0o  reason: collision with root package name */
    public final View f1291OooO0o;

    public o00O00(View view) {
        super(5, (Object) null);
        this.f1291OooO0o = view;
    }

    @Override // o0ooOO0.OooOOO0
    public void OooOoO0() {
        View view;
        View view2 = this.f1291OooO0o;
        if (view2 == null) {
            return;
        }
        if (view2.isInEditMode() || view2.onCheckIsTextEditor()) {
            view2.requestFocus();
            view = view2;
        } else {
            view = view2.getRootView().findFocus();
        }
        if (view == null) {
            view = view2.getRootView().findViewById(16908290);
        }
        if (view == null || !view.hasWindowFocus()) {
            return;
        }
        view.post(new OooO0o(5, view));
    }
}