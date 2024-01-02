package o0OOO0o;

import OooOooo.o00O0O0;
import OooOooo.o0o0Oo;
import OooooOO.oO00O0o0;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import hieubui.eup.android_app_security.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class OooOo00 extends o000oOoO {

    /* renamed from: OooO  reason: collision with root package name */
    public final com.google.android.material.datepicker.Oooo0 f5338OooO;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final int f5339OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final int f5340OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final TimeInterpolator f5341OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public AutoCompleteTextView f5342OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public final OooO0O0 f5343OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public final Oooo00o.OooOO0 f5344OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public boolean f5345OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public boolean f5346OooOOO;
    public boolean OooOOO0;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public long f5347OooOOOO;

    /* renamed from: OooOOOo  reason: collision with root package name */
    public AccessibilityManager f5348OooOOOo;

    /* renamed from: OooOOo  reason: collision with root package name */
    public ValueAnimator f5349OooOOo;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public ValueAnimator f5350OooOOo0;

    public OooOo00(Oooo0 oooo0) {
        super(oooo0);
        this.f5338OooO = new com.google.android.material.datepicker.Oooo0(2, this);
        this.f5343OooOO0 = new OooO0O0(this, 1);
        this.f5344OooOO0O = new Oooo00o.OooOO0(this);
        this.f5347OooOOOO = Long.MAX_VALUE;
        this.f5339OooO0o = o0000O00.OooO00o.o000OooO(oooo0.getContext(), R.attr.motionDurationShort3, 67);
        this.f5340OooO0o0 = o0000O00.OooO00o.o000OooO(oooo0.getContext(), R.attr.motionDurationShort3, 50);
        this.f5341OooO0oO = o0000O00.OooO00o.o000Oooo(oooo0.getContext(), R.attr.motionEasingLinearInterpolator, oO00O0o0.f1815OooO00o);
    }

    @Override // o0OOO0o.o000oOoO
    public final boolean OooO(int i) {
        return i != 0;
    }

    @Override // o0OOO0o.o000oOoO
    public final void OooO00o() {
        boolean z;
        if (this.f5348OooOOOo.isTouchExplorationEnabled()) {
            if (this.f5342OooO0oo.getInputType() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && !this.f5377OooO0Oo.hasFocus()) {
                this.f5342OooO0oo.dismissDropDown();
            }
        }
        this.f5342OooO0oo.post(new androidx.activity.OooO0o(11, this));
    }

    @Override // o0OOO0o.o000oOoO
    public final int OooO0OO() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // o0OOO0o.o000oOoO
    public final int OooO0Oo() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // o0OOO0o.o000oOoO
    public final View.OnClickListener OooO0o() {
        return this.f5338OooO;
    }

    @Override // o0OOO0o.o000oOoO
    public final View.OnFocusChangeListener OooO0o0() {
        return this.f5343OooOO0;
    }

    @Override // o0OOO0o.o000oOoO
    public final Oooo000.OooO0o OooO0oo() {
        return this.f5344OooOO0O;
    }

    @Override // o0OOO0o.o000oOoO
    public final boolean OooOO0() {
        return this.f5345OooOO0o;
    }

    @Override // o0OOO0o.o000oOoO
    public final boolean OooOO0o() {
        return this.f5346OooOOO;
    }

    @Override // o0OOO0o.o000oOoO
    public final void OooOOO(Oooo000.o000oOoO o000oooo) {
        boolean z;
        boolean OooO0o02;
        if (this.f5342OooO0oo.getInputType() != 0) {
            z = true;
        } else {
            z = false;
        }
        AccessibilityNodeInfo accessibilityNodeInfo = o000oooo.f1437OooO00o;
        if (!z) {
            accessibilityNodeInfo.setClassName(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26) {
            OooO0o02 = OooO0Oo.o0Oo0oo.OooO0oo(accessibilityNodeInfo);
        } else {
            OooO0o02 = o000oooo.OooO0o0(4);
        }
        if (OooO0o02) {
            o000oooo.OooOO0(null);
        }
    }

    @Override // o0OOO0o.o000oOoO
    public final void OooOOO0(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            this.f5342OooO0oo = autoCompleteTextView;
            autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: o0OOO0o.OooOOO
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean z;
                    OooOo00 oooOo00 = OooOo00.this;
                    oooOo00.getClass();
                    if (motionEvent.getAction() == 1) {
                        long currentTimeMillis = System.currentTimeMillis() - oooOo00.f5347OooOOOO;
                        if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            oooOo00.OooOOO0 = false;
                        }
                        oooOo00.OooOo0();
                        oooOo00.OooOOO0 = true;
                        oooOo00.f5347OooOOOO = System.currentTimeMillis();
                    }
                    return false;
                }
            });
            this.f5342OooO0oo.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: o0OOO0o.OooOOOO
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    OooOo00 oooOo00 = OooOo00.this;
                    oooOo00.OooOOO0 = true;
                    oooOo00.f5347OooOOOO = System.currentTimeMillis();
                    oooOo00.OooOo00(false);
                }
            });
            boolean z = false;
            this.f5342OooO0oo.setThreshold(0);
            TextInputLayout textInputLayout = this.f5374OooO00o;
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (editText.getInputType() != 0) {
                z = true;
            }
            if (!z && this.f5348OooOOOo.isTouchExplorationEnabled()) {
                WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
                o00O0O0.OooOOoo(this.f5377OooO0Oo, 2);
            }
            textInputLayout.setEndIconVisible(true);
            return;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    @Override // o0OOO0o.o000oOoO
    public final void OooOOOO(AccessibilityEvent accessibilityEvent) {
        boolean z;
        if (this.f5348OooOOOo.isEnabled()) {
            boolean z2 = false;
            if (this.f5342OooO0oo.getInputType() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (accessibilityEvent.getEventType() == 32768 && this.f5346OooOOO && !this.f5342OooO0oo.isPopupShowing()) {
                    z2 = true;
                }
                if (accessibilityEvent.getEventType() == 1 || z2) {
                    OooOo0();
                    this.OooOOO0 = true;
                    this.f5347OooOOOO = System.currentTimeMillis();
                }
            }
        }
    }

    @Override // o0OOO0o.o000oOoO
    public final void OooOOo() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f5341OooO0oO;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f5339OooO0o);
        ofFloat.addUpdateListener(new OooO00o(this, 2));
        this.f5349OooOOo = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f5340OooO0o0);
        ofFloat2.addUpdateListener(new OooO00o(this, 2));
        this.f5350OooOOo0 = ofFloat2;
        ofFloat2.addListener(new androidx.appcompat.widget.OooO0o(6, this));
        this.f5348OooOOOo = (AccessibilityManager) this.f5376OooO0OO.getSystemService("accessibility");
    }

    @Override // o0OOO0o.o000oOoO
    public final void OooOOoo() {
        AutoCompleteTextView autoCompleteTextView = this.f5342OooO0oo;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f5342OooO0oo.setOnDismissListener(null);
        }
    }

    public final void OooOo0() {
        boolean z;
        if (this.f5342OooO0oo == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f5347OooOOOO;
        if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.OooOOO0 = false;
        }
        if (!this.OooOOO0) {
            OooOo00(!this.f5346OooOOO);
            if (this.f5346OooOOO) {
                this.f5342OooO0oo.requestFocus();
                this.f5342OooO0oo.showDropDown();
                return;
            }
            this.f5342OooO0oo.dismissDropDown();
            return;
        }
        this.OooOOO0 = false;
    }

    public final void OooOo00(boolean z) {
        if (this.f5346OooOOO != z) {
            this.f5346OooOOO = z;
            this.f5349OooOOo.cancel();
            this.f5350OooOOo0.start();
        }
    }
}