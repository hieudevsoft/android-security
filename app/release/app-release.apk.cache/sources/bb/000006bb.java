package o0OOO0o;

import OooO0oO.o000OO00;
import OooOooo.o000O0O0;
import OooOooo.o00O0O0;
import OooOooo.o00O0O0O;
import OooOooo.o0o0Oo;
import OooOooo.oo0o0O0;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.o00oOoo;
import androidx.appcompat.widget.o0oO0O0o;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import hieubui.eup.android_app_security.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class Oooo0 extends LinearLayout {

    /* renamed from: OooOo0o  reason: collision with root package name */
    public static final /* synthetic */ int f5351OooOo0o = 0;

    /* renamed from: OooO  reason: collision with root package name */
    public int f5352OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final TextInputLayout f5353OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final FrameLayout f5354OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final CheckableImageButton f5355OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public ColorStateList f5356OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public View.OnLongClickListener f5357OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public PorterDuff.Mode f5358OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final CheckableImageButton f5359OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final OooOOo0.OooOO0 f5360OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public final LinkedHashSet f5361OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public ColorStateList f5362OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public PorterDuff.Mode f5363OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public ImageView.ScaleType f5364OooOOO;
    public int OooOOO0;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public View.OnLongClickListener f5365OooOOOO;

    /* renamed from: OooOOOo  reason: collision with root package name */
    public CharSequence f5366OooOOOo;

    /* renamed from: OooOOo  reason: collision with root package name */
    public boolean f5367OooOOo;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public final o00oOoo f5368OooOOo0;

    /* renamed from: OooOOoo  reason: collision with root package name */
    public EditText f5369OooOOoo;

    /* renamed from: OooOo0  reason: collision with root package name */
    public Oooo000.OooO0o f5370OooOo0;

    /* renamed from: OooOo00  reason: collision with root package name */
    public final AccessibilityManager f5371OooOo00;

    /* renamed from: OooOo0O  reason: collision with root package name */
    public final OooOo f5372OooOo0O;

    public Oooo0(TextInputLayout textInputLayout, o0oO0O0o o0oo0o0o) {
        super(textInputLayout.getContext());
        CharSequence OooOO0O2;
        this.f5352OooO = 0;
        this.f5361OooOO0 = new LinkedHashSet();
        this.f5372OooOo0O = new OooOo(this);
        Oooo000 oooo000 = new Oooo000(this);
        this.f5371OooOo00 = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f5353OooO00o = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f5354OooO0O0 = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton OooO00o2 = OooO00o(this, from, R.id.text_input_error_icon);
        this.f5355OooO0OO = OooO00o2;
        CheckableImageButton OooO00o3 = OooO00o(frameLayout, from, R.id.text_input_end_icon);
        this.f5359OooO0oO = OooO00o3;
        this.f5360OooO0oo = new OooOOo0.OooOO0(this, o0oo0o0o);
        o00oOoo o00oooo = new o00oOoo(getContext(), null);
        this.f5368OooOOo0 = o00oooo;
        if (o0oo0o0o.OooOO0o(38)) {
            this.f5356OooO0Oo = o0000O00.OooO00o.o00oO0O(getContext(), o0oo0o0o, 38);
        }
        if (o0oo0o0o.OooOO0o(39)) {
            this.f5358OooO0o0 = o0000O00.OooO00o.o000OO0O(o0oo0o0o.OooO0oo(39, -1), null);
        }
        if (o0oo0o0o.OooOO0o(37)) {
            OooO(o0oo0o0o.OooO0o0(37));
        }
        OooO00o2.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
        o00O0O0.OooOOoo(OooO00o2, 2);
        OooO00o2.setClickable(false);
        OooO00o2.setPressable(false);
        OooO00o2.setFocusable(false);
        if (!o0oo0o0o.OooOO0o(53)) {
            if (o0oo0o0o.OooOO0o(32)) {
                this.f5362OooOO0O = o0000O00.OooO00o.o00oO0O(getContext(), o0oo0o0o, 32);
            }
            if (o0oo0o0o.OooOO0o(33)) {
                this.f5363OooOO0o = o0000O00.OooO00o.o000OO0O(o0oo0o0o.OooO0oo(33, -1), null);
            }
        }
        if (o0oo0o0o.OooOO0o(30)) {
            OooO0oO(o0oo0o0o.OooO0oo(30, 0));
            if (o0oo0o0o.OooOO0o(27) && OooO00o3.getContentDescription() != (OooOO0O2 = o0oo0o0o.OooOO0O(27))) {
                OooO00o3.setContentDescription(OooOO0O2);
            }
            OooO00o3.setCheckable(o0oo0o0o.OooO00o(26, true));
        } else if (o0oo0o0o.OooOO0o(53)) {
            if (o0oo0o0o.OooOO0o(54)) {
                this.f5362OooOO0O = o0000O00.OooO00o.o00oO0O(getContext(), o0oo0o0o, 54);
            }
            if (o0oo0o0o.OooOO0o(55)) {
                this.f5363OooOO0o = o0000O00.OooO00o.o000OO0O(o0oo0o0o.OooO0oo(55, -1), null);
            }
            OooO0oO(o0oo0o0o.OooO00o(53, false) ? 1 : 0);
            CharSequence OooOO0O3 = o0oo0o0o.OooOO0O(51);
            if (OooO00o3.getContentDescription() != OooOO0O3) {
                OooO00o3.setContentDescription(OooOO0O3);
            }
        }
        int OooO0Oo2 = o0oo0o0o.OooO0Oo(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (OooO0Oo2 >= 0) {
            if (OooO0Oo2 != this.OooOOO0) {
                this.OooOOO0 = OooO0Oo2;
                OooO00o3.setMinimumWidth(OooO0Oo2);
                OooO00o3.setMinimumHeight(OooO0Oo2);
                OooO00o2.setMinimumWidth(OooO0Oo2);
                OooO00o2.setMinimumHeight(OooO0Oo2);
            }
            if (o0oo0o0o.OooOO0o(31)) {
                ImageView.ScaleType OoooO002 = o0000O00.OooO00o.OoooO00(o0oo0o0o.OooO0oo(31, -1));
                this.f5364OooOOO = OoooO002;
                OooO00o3.setScaleType(OoooO002);
                OooO00o2.setScaleType(OoooO002);
            }
            o00oooo.setVisibility(8);
            o00oooo.setId(R.id.textinput_suffix_text);
            o00oooo.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
            oo0o0O0.OooO0o(o00oooo, 1);
            o00oooo.setTextAppearance(o0oo0o0o.OooO(72, 0));
            if (o0oo0o0o.OooOO0o(73)) {
                o00oooo.setTextColor(o0oo0o0o.OooO0O0(73));
            }
            CharSequence OooOO0O4 = o0oo0o0o.OooOO0O(71);
            this.f5366OooOOOo = TextUtils.isEmpty(OooOO0O4) ? null : OooOO0O4;
            o00oooo.setText(OooOO0O4);
            OooOOO();
            frameLayout.addView(OooO00o3);
            addView(o00oooo);
            addView(frameLayout);
            addView(OooO00o2);
            textInputLayout.f3546Ooooo00.add(oooo000);
            if (textInputLayout.f3500OooO0Oo != null) {
                oooo000.OooO00o(textInputLayout);
            }
            addOnAttachStateChangeListener(new o000OO00(2, this));
            return;
        }
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    public final void OooO(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f5355OooO0OO;
        checkableImageButton.setImageDrawable(drawable);
        OooOO0o();
        o0000O00.OooO00o.OooOO0o(this.f5353OooO00o, checkableImageButton, this.f5356OooO0Oo, this.f5358OooO0o0);
    }

    public final CheckableImageButton OooO00o(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (o0000O00.OooO00o.o000OO(getContext())) {
            o000O0O0.OooO0oo((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    public final o000oOoO OooO0O0() {
        int i = this.f5352OooO;
        OooOOo0.OooOO0 oooOO0 = this.f5360OooO0oo;
        SparseArray sparseArray = (SparseArray) oooOO0.f948OooO0OO;
        o000oOoO o000oooo = (o000oOoO) sparseArray.get(i);
        if (o000oooo == null) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                o000oooo = new OooOo00((Oooo0) oooOO0.f949OooO0Oo);
                            } else {
                                throw new IllegalArgumentException(OooO0O0.OooO00o.OooO0O0("Invalid end icon mode: ", i));
                            }
                        } else {
                            o000oooo = new OooO0o((Oooo0) oooOO0.f949OooO0Oo);
                        }
                    } else {
                        o000oooo = new o00oO0o((Oooo0) oooOO0.f949OooO0Oo, oooOO0.f947OooO0O0);
                    }
                } else {
                    o000oooo = new OooO((Oooo0) oooOO0.f949OooO0Oo, 1);
                }
            } else {
                o000oooo = new OooO((Oooo0) oooOO0.f949OooO0Oo, 0);
            }
            sparseArray.append(i, o000oooo);
        }
        return o000oooo;
    }

    public final int OooO0OO() {
        int OooO0OO2;
        if (!OooO0Oo() && !OooO0o0()) {
            OooO0OO2 = 0;
        } else {
            CheckableImageButton checkableImageButton = this.f5359OooO0oO;
            OooO0OO2 = o000O0O0.OooO0OO((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()) + checkableImageButton.getMeasuredWidth();
        }
        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
        return o00O0O0O.OooO0o0(this.f5368OooOOo0) + o00O0O0O.OooO0o0(this) + OooO0OO2;
    }

    public final boolean OooO0Oo() {
        return this.f5354OooO0O0.getVisibility() == 0 && this.f5359OooO0oO.getVisibility() == 0;
    }

    public final void OooO0o(boolean z) {
        boolean z2;
        boolean isActivated;
        boolean isChecked;
        o000oOoO OooO0O02 = OooO0O0();
        boolean OooOO0O2 = OooO0O02.OooOO0O();
        CheckableImageButton checkableImageButton = this.f5359OooO0oO;
        boolean z3 = true;
        if (OooOO0O2 && (isChecked = checkableImageButton.isChecked()) != OooO0O02.OooOO0o()) {
            checkableImageButton.setChecked(!isChecked);
            z2 = true;
        } else {
            z2 = false;
        }
        if ((OooO0O02 instanceof OooOo00) && (isActivated = checkableImageButton.isActivated()) != OooO0O02.OooOO0()) {
            checkableImageButton.setActivated(!isActivated);
        } else {
            z3 = z2;
        }
        if (z || z3) {
            o0000O00.OooO00o.o000OoOO(this.f5353OooO00o, checkableImageButton, this.f5362OooOO0O);
        }
    }

    public final boolean OooO0o0() {
        return this.f5355OooO0OO.getVisibility() == 0;
    }

    public final void OooO0oO(int i) {
        boolean z;
        Drawable drawable;
        if (this.f5352OooO == i) {
            return;
        }
        o000oOoO OooO0O02 = OooO0O0();
        Oooo000.OooO0o oooO0o = this.f5370OooOo0;
        AccessibilityManager accessibilityManager = this.f5371OooOo00;
        if (oooO0o != null && accessibilityManager != null) {
            Oooo000.OooO0OO.OooO0O0(accessibilityManager, oooO0o);
        }
        CharSequence charSequence = null;
        this.f5370OooOo0 = null;
        OooO0O02.OooOOoo();
        this.f5352OooO = i;
        Iterator it = this.f5361OooOO0.iterator();
        if (!it.hasNext()) {
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            OooO0oo(z);
            o000oOoO OooO0O03 = OooO0O0();
            int i2 = this.f5360OooO0oo.f946OooO00o;
            if (i2 == 0) {
                i2 = OooO0O03.OooO0Oo();
            }
            if (i2 != 0) {
                drawable = o0000O00.OooO00o.o0ooOoO(getContext(), i2);
            } else {
                drawable = null;
            }
            CheckableImageButton checkableImageButton = this.f5359OooO0oO;
            checkableImageButton.setImageDrawable(drawable);
            TextInputLayout textInputLayout = this.f5353OooO00o;
            if (drawable != null) {
                o0000O00.OooO00o.OooOO0o(textInputLayout, checkableImageButton, this.f5362OooOO0O, this.f5363OooOO0o);
                o0000O00.OooO00o.o000OoOO(textInputLayout, checkableImageButton, this.f5362OooOO0O);
            }
            int OooO0OO2 = OooO0O03.OooO0OO();
            if (OooO0OO2 != 0) {
                charSequence = getResources().getText(OooO0OO2);
            }
            if (checkableImageButton.getContentDescription() != charSequence) {
                checkableImageButton.setContentDescription(charSequence);
            }
            checkableImageButton.setCheckable(OooO0O03.OooOO0O());
            if (OooO0O03.OooO(textInputLayout.getBoxBackgroundMode())) {
                OooO0O03.OooOOo();
                Oooo000.OooO0o OooO0oo2 = OooO0O03.OooO0oo();
                this.f5370OooOo0 = OooO0oo2;
                if (OooO0oo2 != null && accessibilityManager != null) {
                    WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
                    if (oo0o0O0.OooO0O0(this)) {
                        Oooo000.OooO0OO.OooO00o(accessibilityManager, this.f5370OooOo0);
                    }
                }
                View.OnClickListener OooO0o2 = OooO0O03.OooO0o();
                View.OnLongClickListener onLongClickListener = this.f5365OooOOOO;
                checkableImageButton.setOnClickListener(OooO0o2);
                o0000O00.OooO00o.oooo00o(checkableImageButton, onLongClickListener);
                EditText editText = this.f5369OooOOoo;
                if (editText != null) {
                    OooO0O03.OooOOO0(editText);
                    OooOO0(OooO0O03);
                }
                o0000O00.OooO00o.OooOO0o(textInputLayout, checkableImageButton, this.f5362OooOO0O, this.f5363OooOO0o);
                OooO0o(true);
                return;
            }
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        OooO0O0.OooO00o.OooO0oO(it.next());
        throw null;
    }

    public final void OooO0oo(boolean z) {
        if (OooO0Oo() != z) {
            this.f5359OooO0oO.setVisibility(z ? 0 : 8);
            OooOO0O();
            OooOOO0();
            this.f5353OooO00o.OooOOOo();
        }
    }

    public final void OooOO0(o000oOoO o000oooo) {
        if (this.f5369OooOOoo == null) {
            return;
        }
        if (o000oooo.OooO0o0() != null) {
            this.f5369OooOOoo.setOnFocusChangeListener(o000oooo.OooO0o0());
        }
        if (o000oooo.OooO0oO() != null) {
            this.f5359OooO0oO.setOnFocusChangeListener(o000oooo.OooO0oO());
        }
    }

    public final void OooOO0O() {
        this.f5354OooO0O0.setVisibility((this.f5359OooO0oO.getVisibility() != 0 || OooO0o0()) ? 8 : 0);
        setVisibility(OooO0Oo() || OooO0o0() || !((this.f5366OooOOOo == null || this.f5367OooOOo) ? true : false) ? 0 : 8);
    }

    public final void OooOO0o() {
        boolean z;
        int i;
        CheckableImageButton checkableImageButton = this.f5355OooO0OO;
        Drawable drawable = checkableImageButton.getDrawable();
        boolean z2 = true;
        TextInputLayout textInputLayout = this.f5353OooO00o;
        if (drawable != null && textInputLayout.f3505OooOO0.f5395OooOOo0 && textInputLayout.OooOO0o()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        checkableImageButton.setVisibility(i);
        OooOO0O();
        OooOOO0();
        if (this.f5352OooO == 0) {
            z2 = false;
        }
        if (!z2) {
            textInputLayout.OooOOOo();
        }
    }

    public final void OooOOO() {
        o00oOoo o00oooo = this.f5368OooOOo0;
        int visibility = o00oooo.getVisibility();
        int i = (this.f5366OooOOOo == null || this.f5367OooOOo) ? 8 : 0;
        if (visibility != i) {
            OooO0O0().OooOOOo(i == 0);
        }
        OooOO0O();
        o00oooo.setVisibility(i);
        this.f5353OooO00o.OooOOOo();
    }

    public final void OooOOO0() {
        int i;
        TextInputLayout textInputLayout = this.f5353OooO00o;
        if (textInputLayout.f3500OooO0Oo == null) {
            return;
        }
        if (!OooO0Oo() && !OooO0o0()) {
            EditText editText = textInputLayout.f3500OooO0Oo;
            WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
            i = o00O0O0O.OooO0o0(editText);
        } else {
            i = 0;
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f3500OooO0Oo.getPaddingTop();
        int paddingBottom = textInputLayout.f3500OooO0Oo.getPaddingBottom();
        WeakHashMap weakHashMap2 = o0o0Oo.f1363OooO00o;
        o00O0O0O.OooOO0O(this.f5368OooOOo0, dimensionPixelSize, paddingTop, i, paddingBottom);
    }
}