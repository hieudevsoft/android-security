package OooO0Oo;

import OooO0OO.OooO00o;
import OooOooo.o0;
import OooOooo.o00O0OO;
import OooOooo.o0O0o;
import OooOooo.o0o0Oo;
import OooOooo.oo0o0O0;
import OooOooo.oo0oOO0;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.o00O0O0O;
import androidx.appcompat.widget.o0OO00OO;
import hieubui.eup.android_app_security.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class o000O00O extends OooO0O0.OooO0O0 implements androidx.appcompat.widget.OooOO0 {

    /* renamed from: OooO  reason: collision with root package name */
    public o000O00 f196OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public Context f197OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public Context f198OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public ActionBarOverlayLayout f199OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public ActionBarContainer f200OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public ActionBarContextView f201OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public o00O0O0O f202OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final View f203OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public boolean f204OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public o000O00 f205OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public OooO0o.OooO0O0 f206OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public boolean f207OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public int f208OooOOO;
    public final ArrayList OooOOO0;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public boolean f209OooOOOO;

    /* renamed from: OooOOOo  reason: collision with root package name */
    public boolean f210OooOOOo;

    /* renamed from: OooOOo  reason: collision with root package name */
    public boolean f211OooOOo;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public boolean f212OooOOo0;

    /* renamed from: OooOOoo  reason: collision with root package name */
    public OooO0o.Oooo0 f213OooOOoo;

    /* renamed from: OooOo  reason: collision with root package name */
    public final o0000OO0 f214OooOo;

    /* renamed from: OooOo0  reason: collision with root package name */
    public boolean f215OooOo0;

    /* renamed from: OooOo00  reason: collision with root package name */
    public boolean f216OooOo00;

    /* renamed from: OooOo0O  reason: collision with root package name */
    public final o000Oo0 f217OooOo0O;

    /* renamed from: OooOo0o  reason: collision with root package name */
    public final o000Oo0 f218OooOo0o;

    /* renamed from: OooOoO0  reason: collision with root package name */
    public static final AccelerateInterpolator f195OooOoO0 = new AccelerateInterpolator();

    /* renamed from: OooOoO  reason: collision with root package name */
    public static final DecelerateInterpolator f194OooOoO = new DecelerateInterpolator();

    public o000O00O(Activity activity, boolean z) {
        new ArrayList();
        this.OooOOO0 = new ArrayList();
        this.f208OooOOO = 0;
        this.f209OooOOOO = true;
        this.f211OooOOo = true;
        this.f217OooOo0O = new o000Oo0(this, 0);
        this.f218OooOo0o = new o000Oo0(this, 1);
        this.f214OooOo = new o0000OO0(1, this);
        View decorView = activity.getWindow().getDecorView();
        OooOOoo(decorView);
        if (z) {
            return;
        }
        this.f203OooO0oO = decorView.findViewById(16908290);
    }

    public final Context OooOOo() {
        if (this.f198OooO0O0 == null) {
            TypedValue typedValue = new TypedValue();
            this.f197OooO00o.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f198OooO0O0 = new ContextThemeWrapper(this.f197OooO00o, i);
            } else {
                this.f198OooO0O0 = this.f197OooO00o;
            }
        }
        return this.f198OooO0O0;
    }

    public final void OooOOo0(boolean z) {
        o0 OooOO0o2;
        o0 o0Var;
        long j;
        if (z) {
            if (!this.f212OooOOo0) {
                this.f212OooOOo0 = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f199OooO0OO;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                OooOo0o(false);
            }
        } else if (this.f212OooOOo0) {
            this.f212OooOOo0 = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f199OooO0OO;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            OooOo0o(false);
        }
        ActionBarContainer actionBarContainer = this.f200OooO0Oo;
        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
        if (oo0o0O0.OooO0OO(actionBarContainer)) {
            if (z) {
                o0OO00OO o0oo00oo = (o0OO00OO) this.f202OooO0o0;
                OooOO0o2 = o0o0Oo.OooO00o(o0oo00oo.f2490OooO00o);
                OooOO0o2.OooO00o(0.0f);
                OooOO0o2.OooO0OO(100L);
                OooOO0o2.OooO0Oo(new OooO0o.Oooo000(o0oo00oo, 4));
                o0Var = this.f201OooO0o.OooOO0o(0, 200L);
            } else {
                o0OO00OO o0oo00oo2 = (o0OO00OO) this.f202OooO0o0;
                o0 OooO00o2 = o0o0Oo.OooO00o(o0oo00oo2.f2490OooO00o);
                OooO00o2.OooO00o(1.0f);
                OooO00o2.OooO0OO(200L);
                OooO00o2.OooO0Oo(new OooO0o.Oooo000(o0oo00oo2, 0));
                OooOO0o2 = this.f201OooO0o.OooOO0o(8, 100L);
                o0Var = OooO00o2;
            }
            OooO0o.Oooo0 oooo0 = new OooO0o.Oooo0();
            ArrayList arrayList = oooo0.f312OooO00o;
            arrayList.add(OooOO0o2);
            View view = (View) OooOO0o2.f1268OooO00o.get();
            if (view != null) {
                j = view.animate().getDuration();
            } else {
                j = 0;
            }
            View view2 = (View) o0Var.f1268OooO00o.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j);
            }
            arrayList.add(o0Var);
            oooo0.OooO0O0();
        } else if (z) {
            ((o0OO00OO) this.f202OooO0o0).f2490OooO00o.setVisibility(4);
            this.f201OooO0o.setVisibility(0);
        } else {
            ((o0OO00OO) this.f202OooO0o0).f2490OooO00o.setVisibility(0);
            this.f201OooO0o.setVisibility(8);
        }
    }

    public final void OooOOoo(View view) {
        String str;
        o00O0O0O wrapper;
        boolean z;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.f199OooO0OO = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof o00O0O0O) {
            wrapper = (o00O0O0O) findViewById;
        } else if (findViewById instanceof Toolbar) {
            wrapper = ((Toolbar) findViewById).getWrapper();
        } else {
            if (findViewById != null) {
                str = findViewById.getClass().getSimpleName();
            } else {
                str = "null";
            }
            throw new IllegalStateException("Can't make a decor toolbar out of ".concat(str));
        }
        this.f202OooO0o0 = wrapper;
        this.f201OooO0o = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.f200OooO0Oo = actionBarContainer;
        o00O0O0O o00o0o0o = this.f202OooO0o0;
        if (o00o0o0o != null && this.f201OooO0o != null && actionBarContainer != null) {
            Context context = ((o0OO00OO) o00o0o0o).f2490OooO00o.getContext();
            this.f197OooO00o = context;
            if ((((o0OO00OO) this.f202OooO0o0).f2491OooO0O0 & 4) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f204OooO0oo = true;
            }
            int i = context.getApplicationInfo().targetSdkVersion;
            this.f202OooO0o0.getClass();
            OooOo0(context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
            TypedArray obtainStyledAttributes = this.f197OooO00o.obtainStyledAttributes(null, OooO00o.f18OooO00o, R.attr.actionBarStyle, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f199OooO0OO;
                if (actionBarOverlayLayout2.f2052OooO0oo) {
                    this.f215OooOo0 = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                ActionBarContainer actionBarContainer2 = this.f200OooO0Oo;
                WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
                oo0oOO0.OooOOoo(actionBarContainer2, dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(o000O00O.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
    }

    public final void OooOo0(boolean z) {
        if (!z) {
            ((o0OO00OO) this.f202OooO0o0).getClass();
            this.f200OooO0Oo.setTabContainer(null);
        } else {
            this.f200OooO0Oo.setTabContainer(null);
            ((o0OO00OO) this.f202OooO0o0).getClass();
        }
        this.f202OooO0o0.getClass();
        ((o0OO00OO) this.f202OooO0o0).f2490OooO00o.setCollapsible(false);
        this.f199OooO0OO.setHasNonEmbeddedTabs(false);
    }

    public final void OooOo00(boolean z) {
        int i;
        if (!this.f204OooO0oo) {
            if (z) {
                i = 4;
            } else {
                i = 0;
            }
            o0OO00OO o0oo00oo = (o0OO00OO) this.f202OooO0o0;
            int i2 = o0oo00oo.f2491OooO0O0;
            this.f204OooO0oo = true;
            o0oo00oo.OooO00o((i & 4) | (i2 & (-5)));
        }
    }

    public final void OooOo0O(CharSequence charSequence) {
        o0OO00OO o0oo00oo = (o0OO00OO) this.f202OooO0o0;
        if (!o0oo00oo.f2496OooO0oO) {
            o0oo00oo.f2497OooO0oo = charSequence;
            if ((o0oo00oo.f2491OooO0O0 & 8) != 0) {
                Toolbar toolbar = o0oo00oo.f2490OooO00o;
                toolbar.setTitle(charSequence);
                if (o0oo00oo.f2496OooO0oO) {
                    o0o0Oo.OooOOO0(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    public final void OooOo0o(boolean z) {
        boolean z2;
        int[] iArr;
        int[] iArr2;
        boolean z3 = this.f210OooOOOo;
        if (this.f212OooOOo0 || !z3) {
            z2 = true;
        } else {
            z2 = false;
        }
        final o0000OO0 o0000oo02 = this.f214OooOo;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        View view = this.f203OooO0oO;
        if (z2) {
            if (!this.f211OooOOo) {
                this.f211OooOOo = true;
                OooO0o.Oooo0 oooo0 = this.f213OooOOoo;
                if (oooo0 != null) {
                    oooo0.OooO00o();
                }
                this.f200OooO0Oo.setVisibility(0);
                int i = this.f208OooOOO;
                o000Oo0 o000oo0 = this.f218OooOo0o;
                if (i == 0 && (this.f216OooOo00 || z)) {
                    this.f200OooO0Oo.setTranslationY(0.0f);
                    float f = -this.f200OooO0Oo.getHeight();
                    if (z) {
                        this.f200OooO0Oo.getLocationInWindow(new int[]{0, 0});
                        f -= iArr2[1];
                    }
                    this.f200OooO0Oo.setTranslationY(f);
                    OooO0o.Oooo0 oooo02 = new OooO0o.Oooo0();
                    o0 OooO00o2 = o0o0Oo.OooO00o(this.f200OooO0Oo);
                    OooO00o2.OooO0o0(0.0f);
                    final View view2 = (View) OooO00o2.f1268OooO00o.get();
                    if (view2 != null) {
                        if (o0000oo02 != null) {
                            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener(view2) { // from class: OooOooo.oo00oO
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    ((View) ((OooO0Oo.o000O00O) OooO0Oo.o0000OO0.this.f183OooO0O0).f200OooO0Oo.getParent()).invalidate();
                                }
                            };
                        }
                        o0O0o.OooO00o(view2.animate(), animatorUpdateListener);
                    }
                    boolean z4 = oooo02.f317OooO0o0;
                    ArrayList arrayList = oooo02.f312OooO00o;
                    if (!z4) {
                        arrayList.add(OooO00o2);
                    }
                    if (this.f209OooOOOO && view != null) {
                        view.setTranslationY(f);
                        o0 OooO00o3 = o0o0Oo.OooO00o(view);
                        OooO00o3.OooO0o0(0.0f);
                        if (!oooo02.f317OooO0o0) {
                            arrayList.add(OooO00o3);
                        }
                    }
                    DecelerateInterpolator decelerateInterpolator = f194OooOoO;
                    boolean z5 = oooo02.f317OooO0o0;
                    if (!z5) {
                        oooo02.f314OooO0OO = decelerateInterpolator;
                    }
                    if (!z5) {
                        oooo02.f313OooO0O0 = 250L;
                    }
                    if (!z5) {
                        oooo02.f315OooO0Oo = o000oo0;
                    }
                    this.f213OooOOoo = oooo02;
                    oooo02.OooO0O0();
                } else {
                    this.f200OooO0Oo.setAlpha(1.0f);
                    this.f200OooO0Oo.setTranslationY(0.0f);
                    if (this.f209OooOOOO && view != null) {
                        view.setTranslationY(0.0f);
                    }
                    o000oo0.OooO00o();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.f199OooO0OO;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
                    o00O0OO.OooO0OO(actionBarOverlayLayout);
                }
            }
        } else if (this.f211OooOOo) {
            this.f211OooOOo = false;
            OooO0o.Oooo0 oooo03 = this.f213OooOOoo;
            if (oooo03 != null) {
                oooo03.OooO00o();
            }
            int i2 = this.f208OooOOO;
            o000Oo0 o000oo02 = this.f217OooOo0O;
            if (i2 == 0 && (this.f216OooOo00 || z)) {
                this.f200OooO0Oo.setAlpha(1.0f);
                this.f200OooO0Oo.setTransitioning(true);
                OooO0o.Oooo0 oooo04 = new OooO0o.Oooo0();
                float f2 = -this.f200OooO0Oo.getHeight();
                if (z) {
                    this.f200OooO0Oo.getLocationInWindow(new int[]{0, 0});
                    f2 -= iArr[1];
                }
                o0 OooO00o4 = o0o0Oo.OooO00o(this.f200OooO0Oo);
                OooO00o4.OooO0o0(f2);
                final View view3 = (View) OooO00o4.f1268OooO00o.get();
                if (view3 != null) {
                    if (o0000oo02 != null) {
                        animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener(view3) { // from class: OooOooo.oo00oO
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                ((View) ((OooO0Oo.o000O00O) OooO0Oo.o0000OO0.this.f183OooO0O0).f200OooO0Oo.getParent()).invalidate();
                            }
                        };
                    }
                    o0O0o.OooO00o(view3.animate(), animatorUpdateListener);
                }
                boolean z6 = oooo04.f317OooO0o0;
                ArrayList arrayList2 = oooo04.f312OooO00o;
                if (!z6) {
                    arrayList2.add(OooO00o4);
                }
                if (this.f209OooOOOO && view != null) {
                    o0 OooO00o5 = o0o0Oo.OooO00o(view);
                    OooO00o5.OooO0o0(f2);
                    if (!oooo04.f317OooO0o0) {
                        arrayList2.add(OooO00o5);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f195OooOoO0;
                boolean z7 = oooo04.f317OooO0o0;
                if (!z7) {
                    oooo04.f314OooO0OO = accelerateInterpolator;
                }
                if (!z7) {
                    oooo04.f313OooO0O0 = 250L;
                }
                if (!z7) {
                    oooo04.f315OooO0Oo = o000oo02;
                }
                this.f213OooOOoo = oooo04;
                oooo04.OooO0O0();
                return;
            }
            o000oo02.OooO00o();
        }
    }

    public o000O00O(Dialog dialog) {
        new ArrayList();
        this.OooOOO0 = new ArrayList();
        this.f208OooOOO = 0;
        this.f209OooOOOO = true;
        this.f211OooOOo = true;
        this.f217OooOo0O = new o000Oo0(this, 0);
        this.f218OooOo0o = new o000Oo0(this, 1);
        this.f214OooOo = new o0000OO0(1, this);
        OooOOoo(dialog.getWindow().getDecorView());
    }
}