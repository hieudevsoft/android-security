package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import hieubui.eup.android_app_security.R;

/* loaded from: classes.dex */
public final class o0OO00OO implements o00O0O0O {

    /* renamed from: OooO  reason: collision with root package name */
    public CharSequence f2489OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Toolbar f2490OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f2491OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public View f2492OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public Drawable f2493OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public Drawable f2494OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public Drawable f2495OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public boolean f2496OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public CharSequence f2497OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public CharSequence f2498OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public Window.Callback f2499OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public boolean f2500OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public int f2501OooOOO;
    public Oooo000 OooOOO0;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public Drawable f2502OooOOOO;

    public o0OO00OO(Toolbar toolbar) {
        boolean z;
        Drawable drawable;
        this.f2501OooOOO = 0;
        this.f2490OooO00o = toolbar;
        this.f2497OooO0oo = toolbar.getTitle();
        this.f2489OooO = toolbar.getSubtitle();
        if (this.f2497OooO0oo != null) {
            z = true;
        } else {
            z = false;
        }
        this.f2496OooO0oO = z;
        this.f2494OooO0o = toolbar.getNavigationIcon();
        o0oO0O0o OooOOO0 = o0oO0O0o.OooOOO0(toolbar.getContext(), null, OooO0OO.OooO00o.f18OooO00o, R.attr.actionBarStyle);
        this.f2502OooOOOO = OooOOO0.OooO0o0(15);
        CharSequence OooOO0O2 = OooOOO0.OooOO0O(27);
        if (!TextUtils.isEmpty(OooOO0O2)) {
            this.f2496OooO0oO = true;
            this.f2497OooO0oo = OooOO0O2;
            if ((this.f2491OooO0O0 & 8) != 0) {
                toolbar.setTitle(OooOO0O2);
                if (this.f2496OooO0oO) {
                    OooOooo.o0o0Oo.OooOOO0(toolbar.getRootView(), OooOO0O2);
                }
            }
        }
        CharSequence OooOO0O3 = OooOOO0.OooOO0O(25);
        if (!TextUtils.isEmpty(OooOO0O3)) {
            this.f2489OooO = OooOO0O3;
            if ((this.f2491OooO0O0 & 8) != 0) {
                toolbar.setSubtitle(OooOO0O3);
            }
        }
        Drawable OooO0o02 = OooOOO0.OooO0o0(20);
        if (OooO0o02 != null) {
            this.f2495OooO0o0 = OooO0o02;
            OooO0O0();
        }
        Drawable OooO0o03 = OooOOO0.OooO0o0(17);
        if (OooO0o03 != null) {
            this.f2493OooO0Oo = OooO0o03;
            OooO0O0();
        }
        if (this.f2494OooO0o == null && (drawable = this.f2502OooOOOO) != null) {
            this.f2494OooO0o = drawable;
            toolbar.setNavigationIcon((this.f2491OooO0O0 & 4) == 0 ? null : drawable);
        }
        OooO00o(OooOOO0.OooO0oo(10, 0));
        int OooO2 = OooOOO0.OooO(9, 0);
        if (OooO2 != 0) {
            View inflate = LayoutInflater.from(toolbar.getContext()).inflate(OooO2, (ViewGroup) toolbar, false);
            View view = this.f2492OooO0OO;
            if (view != null && (this.f2491OooO0O0 & 16) != 0) {
                toolbar.removeView(view);
            }
            this.f2492OooO0OO = inflate;
            if (inflate != null && (this.f2491OooO0O0 & 16) != 0) {
                toolbar.addView(inflate);
            }
            OooO00o(this.f2491OooO0O0 | 16);
        }
        int layoutDimension = ((TypedArray) OooOOO0.f2540OooO0O0).getLayoutDimension(13, 0);
        if (layoutDimension > 0) {
            ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
            layoutParams.height = layoutDimension;
            toolbar.setLayoutParams(layoutParams);
        }
        int OooO0OO2 = OooOOO0.OooO0OO(7, -1);
        int OooO0OO3 = OooOOO0.OooO0OO(3, -1);
        if (OooO0OO2 >= 0 || OooO0OO3 >= 0) {
            int max = Math.max(OooO0OO2, 0);
            int max2 = Math.max(OooO0OO3, 0);
            if (toolbar.f2216OooOo00 == null) {
                toolbar.f2216OooOo00 = new o0O000O();
            }
            toolbar.f2216OooOo00.OooO00o(max, max2);
        }
        int OooO3 = OooOOO0.OooO(28, 0);
        if (OooO3 != 0) {
            Context context = toolbar.getContext();
            toolbar.f2207OooOO0o = OooO3;
            o00oOoo o00oooo = toolbar.f2198OooO0O0;
            if (o00oooo != null) {
                o00oooo.setTextAppearance(context, OooO3);
            }
        }
        int OooO4 = OooOOO0.OooO(26, 0);
        if (OooO4 != 0) {
            Context context2 = toolbar.getContext();
            toolbar.OooOOO0 = OooO4;
            o00oOoo o00oooo2 = toolbar.f2199OooO0OO;
            if (o00oooo2 != null) {
                o00oooo2.setTextAppearance(context2, OooO4);
            }
        }
        int OooO5 = OooOOO0.OooO(22, 0);
        if (OooO5 != 0) {
            toolbar.setPopupTheme(OooO5);
        }
        OooOOO0.OooOOOO();
        if (R.string.abc_action_bar_up_description != this.f2501OooOOO) {
            this.f2501OooOOO = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i = this.f2501OooOOO;
                String string = i != 0 ? toolbar.getContext().getString(i) : null;
                this.f2498OooOO0 = string;
                if ((this.f2491OooO0O0 & 4) != 0) {
                    if (TextUtils.isEmpty(string)) {
                        toolbar.setNavigationContentDescription(this.f2501OooOOO);
                    } else {
                        toolbar.setNavigationContentDescription(this.f2498OooOO0);
                    }
                }
            }
        }
        this.f2498OooOO0 = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new OooO0OO(this));
    }

    public final void OooO00o(int i) {
        View view;
        Drawable drawable;
        int i2 = this.f2491OooO0O0 ^ i;
        this.f2491OooO0O0 = i;
        if (i2 != 0) {
            int i3 = i2 & 4;
            CharSequence charSequence = null;
            Toolbar toolbar = this.f2490OooO00o;
            if (i3 != 0) {
                if ((i & 4) != 0 && (i & 4) != 0) {
                    if (TextUtils.isEmpty(this.f2498OooOO0)) {
                        toolbar.setNavigationContentDescription(this.f2501OooOOO);
                    } else {
                        toolbar.setNavigationContentDescription(this.f2498OooOO0);
                    }
                }
                if ((this.f2491OooO0O0 & 4) != 0) {
                    drawable = this.f2494OooO0o;
                    if (drawable == null) {
                        drawable = this.f2502OooOOOO;
                    }
                } else {
                    drawable = null;
                }
                toolbar.setNavigationIcon(drawable);
            }
            if ((i2 & 3) != 0) {
                OooO0O0();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    toolbar.setTitle(this.f2497OooO0oo);
                    charSequence = this.f2489OooO;
                } else {
                    toolbar.setTitle((CharSequence) null);
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i2 & 16) != 0 && (view = this.f2492OooO0OO) != null) {
                if ((i & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void OooO0O0() {
        Drawable drawable;
        int i = this.f2491OooO0O0;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f2495OooO0o0) == null) {
            drawable = this.f2493OooO0Oo;
        }
        this.f2490OooO00o.setLogo(drawable);
    }
}