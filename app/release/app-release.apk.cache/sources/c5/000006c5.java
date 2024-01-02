package o0OOO0o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.o00oOoo;

/* loaded from: classes.dex */
public final class o0OoOo0 extends AnimatorListenerAdapter {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f5413OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ TextView f5414OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ int f5415OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final /* synthetic */ TextView f5416OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final /* synthetic */ o00Oo0 f5417OooO0o0;

    public o0OoOo0(o00Oo0 o00oo0, int i, TextView textView, int i2, TextView textView2) {
        this.f5417OooO0o0 = o00oo0;
        this.f5413OooO00o = i;
        this.f5414OooO0O0 = textView;
        this.f5415OooO0OO = i2;
        this.f5416OooO0Oo = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        o00oOoo o00oooo;
        int i = this.f5413OooO00o;
        o00Oo0 o00oo0 = this.f5417OooO0o0;
        o00oo0.f5391OooOOO = i;
        o00oo0.f5390OooOO0o = null;
        TextView textView = this.f5414OooO0O0;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f5415OooO0OO == 1 && (o00oooo = o00oo0.f5394OooOOo) != null) {
                o00oooo.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f5416OooO0Oo;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f5416OooO0Oo;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}