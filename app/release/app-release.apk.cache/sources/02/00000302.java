package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import hieubui.eup.android_app_security.R;

/* loaded from: classes.dex */
public final class o0OOooO0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Object f2525OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final View f2526OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final TextView f2527OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final Object f2528OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final Object f2529OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final Object f2530OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final Object f2531OooO0oO;

    public o0OOooO0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f2528OooO0Oo = layoutParams;
        this.f2530OooO0o0 = new Rect();
        this.f2529OooO0o = new int[2];
        this.f2531OooO0oO = new int[2];
        this.f2525OooO00o = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f2526OooO0O0 = inflate;
        this.f2527OooO0OO = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(o0OOooO0.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2131755012;
        layoutParams.flags = 24;
    }

    public o0OOooO0(RelativeLayout relativeLayout, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, MaterialButton materialButton4, MaterialTextView materialTextView, MaterialButton materialButton5) {
        this.f2525OooO00o = relativeLayout;
        this.f2526OooO0O0 = materialButton;
        this.f2527OooO0OO = materialButton2;
        this.f2528OooO0Oo = materialButton3;
        this.f2530OooO0o0 = materialButton4;
        this.f2529OooO0o = materialTextView;
        this.f2531OooO0oO = materialButton5;
    }
}