package com.google.android.material.datepicker;

import OooO0Oo.o0000OO0;
import OooOooo.o0O000;
import OooOooo.o0O0000O;
import OooOooo.o0O0o0;
import OooOooo.o0O0o000;
import OooOooo.o0O0o00O;
import OooOooo.o0o0Oo;
import OooOooo.oo0o0O0;
import OooOooo.oo0oOO0;
import OooooO0.o0000O;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import hieubui.eup.android_app_security.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class o000oOoO<S> extends androidx.fragment.app.Oooo0 {

    /* renamed from: o000000o  reason: collision with root package name */
    public static final /* synthetic */ int f3404o000000o = 0;

    /* renamed from: Oooooo  reason: collision with root package name */
    public final LinkedHashSet f3405Oooooo;

    /* renamed from: OoooooO  reason: collision with root package name */
    public final LinkedHashSet f3406OoooooO;

    /* renamed from: Ooooooo  reason: collision with root package name */
    public int f3407Ooooooo;

    /* renamed from: o000000  reason: collision with root package name */
    public CharSequence f3408o000000;

    /* renamed from: o000000O  reason: collision with root package name */
    public CharSequence f3409o000000O;

    /* renamed from: o000OOo  reason: collision with root package name */
    public boolean f3410o000OOo;

    /* renamed from: o00O0O  reason: collision with root package name */
    public Oooo000 f3411o00O0O;
    public int o00Oo0;

    /* renamed from: o00Ooo  reason: collision with root package name */
    public CharSequence f3412o00Ooo;

    /* renamed from: o00o0O  reason: collision with root package name */
    public boolean f3413o00o0O;

    /* renamed from: o00oO0O  reason: collision with root package name */
    public int f3414o00oO0O;
    public CharSequence o00oO0o;

    /* renamed from: o00ooo  reason: collision with root package name */
    public int f3415o00ooo;

    /* renamed from: o0O0O00  reason: collision with root package name */
    public o0ooOO0.OooOOOO f3416o0O0O00;

    /* renamed from: o0OO00O  reason: collision with root package name */
    public TextView f3417o0OO00O;

    /* renamed from: o0OOO0o  reason: collision with root package name */
    public int f3418o0OOO0o;
    public CharSequence o0Oo0oo;

    /* renamed from: o0OoOo0  reason: collision with root package name */
    public o0ooOOo f3419o0OoOo0;

    /* renamed from: o0ooOO0  reason: collision with root package name */
    public CharSequence f3420o0ooOO0;

    /* renamed from: o0ooOOo  reason: collision with root package name */
    public int f3421o0ooOOo;

    /* renamed from: o0ooOoO  reason: collision with root package name */
    public CharSequence f3422o0ooOoO;

    /* renamed from: oo000o  reason: collision with root package name */
    public int f3423oo000o;

    /* renamed from: oo0o0Oo  reason: collision with root package name */
    public CheckableImageButton f3424oo0o0Oo;

    /* renamed from: ooOO  reason: collision with root package name */
    public OooO0OO f3425ooOO;

    public o000oOoO() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f3405Oooooo = new LinkedHashSet();
        this.f3406OoooooO = new LinkedHashSet();
    }

    public static int Oooo0O0(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar OooO0OO2 = o0Oo0oo.OooO0OO();
        OooO0OO2.set(5, 1);
        Calendar OooO0O02 = o0Oo0oo.OooO0O0(OooO0OO2);
        OooO0O02.get(2);
        OooO0O02.get(1);
        int maximum = OooO0O02.getMaximum(7);
        OooO0O02.getActualMaximum(5);
        OooO0O02.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean Oooo0OO(Context context) {
        return Oooo0o0(context, 16843277);
    }

    public static boolean Oooo0o0(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(o0000O00.OooO00o.o000o000(context, R.attr.materialCalendarStyle, Oooo000.class.getCanonicalName()).data, new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    @Override // androidx.fragment.app.o00Oo0
    public final View OooOOo(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        View findViewById;
        LinearLayout.LayoutParams layoutParams;
        boolean z;
        int i2;
        if (this.f3413o00o0O) {
            i = R.layout.mtrl_picker_fullscreen;
        } else {
            i = R.layout.mtrl_picker_dialog;
        }
        View inflate = layoutInflater.inflate(i, viewGroup);
        Context context = inflate.getContext();
        if (this.f3413o00o0O) {
            findViewById = inflate.findViewById(R.id.mtrl_calendar_frame);
            layoutParams = new LinearLayout.LayoutParams(Oooo0O0(context), -2);
        } else {
            findViewById = inflate.findViewById(R.id.mtrl_calendar_main_pane);
            layoutParams = new LinearLayout.LayoutParams(Oooo0O0(context), -1);
        }
        findViewById.setLayoutParams(layoutParams);
        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
        oo0o0O0.OooO0o((TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text), 1);
        this.f3424oo0o0Oo = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f3417o0OO00O = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.f3424oo0o0Oo.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f3424oo0o0Oo;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, o0000O00.OooO00o.o0ooOoO(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], o0000O00.OooO00o.o0ooOoO(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        CheckableImageButton checkableImageButton2 = this.f3424oo0o0Oo;
        if (this.f3415o00ooo != 0) {
            z = true;
        } else {
            z = false;
        }
        checkableImageButton2.setChecked(z);
        o0o0Oo.OooOO0o(this.f3424oo0o0Oo, null);
        CheckableImageButton checkableImageButton3 = this.f3424oo0o0Oo;
        int i3 = this.f3415o00ooo;
        Context context2 = checkableImageButton3.getContext();
        if (i3 == 1) {
            i2 = R.string.mtrl_picker_toggle_to_calendar_input_mode;
        } else {
            i2 = R.string.mtrl_picker_toggle_to_text_input_mode;
        }
        this.f3424oo0o0Oo.setContentDescription(context2.getString(i2));
        this.f3424oo0o0Oo.setOnClickListener(new Oooo0(0, this));
        Button button = (Button) inflate.findViewById(R.id.confirm_button);
        Oooo0();
        throw null;
    }

    @Override // androidx.fragment.app.Oooo0, androidx.fragment.app.o00Oo0
    public final void OooOOo0(Bundle bundle) {
        super.OooOOo0(bundle);
        if (bundle == null) {
            bundle = this.f2955OooO0o;
        }
        this.f3407Ooooooo = bundle.getInt("OVERRIDE_THEME_RES_ID");
        OooO0O0.OooO00o.OooO0o(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f3425ooOO = (OooO0OO) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        OooO0O0.OooO00o.OooO0o(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.o00Oo0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f3412o00Ooo = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f3415o00ooo = bundle.getInt("INPUT_MODE_KEY");
        this.f3423oo000o = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.o00oO0o = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f3414o00oO0O = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f3420o0ooOO0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f3421o0ooOOo = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f3422o0ooOoO = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f3418o0OOO0o = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.o0Oo0oo = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.f3412o00Ooo;
        if (charSequence == null) {
            charSequence = OooOoo0().getResources().getText(this.o00Oo0);
        }
        this.f3408o000000 = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.f3409o000000O = charSequence;
    }

    @Override // androidx.fragment.app.Oooo0, androidx.fragment.app.o00Oo0
    public final void OooOo() {
        this.f3419o0OoOo0.f3447OoooO0O.clear();
        super.OooOo();
    }

    @Override // androidx.fragment.app.Oooo0, androidx.fragment.app.o00Oo0
    public final void OooOo0O(Bundle bundle) {
        o00O0O o00o0o;
        o00O0O OooO0O02;
        super.OooOo0O(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f3407Ooooooo);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        OooO00o oooO00o = new OooO00o(this.f3425ooOO);
        Oooo000 oooo000 = this.f3411o00O0O;
        if (oooo000 == null) {
            o00o0o = null;
        } else {
            o00o0o = oooo000.f3403o000oOoO;
        }
        if (o00o0o != null) {
            oooO00o.f3362OooO0OO = Long.valueOf(o00o0o.f3430OooO0o);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", oooO00o.f3364OooO0o0);
        o00O0O OooO0O03 = o00O0O.OooO0O0(oooO00o.f3360OooO00o);
        o00O0O OooO0O04 = o00O0O.OooO0O0(oooO00o.f3361OooO0O0);
        OooO0O0 oooO0O0 = (OooO0O0) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = oooO00o.f3362OooO0OO;
        if (l == null) {
            OooO0O02 = null;
        } else {
            OooO0O02 = o00O0O.OooO0O0(l.longValue());
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new OooO0OO(OooO0O03, OooO0O04, oooO0O0, OooO0O02, oooO00o.f3363OooO0Oo));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.o00Oo0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f3412o00Ooo);
        bundle.putInt("INPUT_MODE_KEY", this.f3415o00ooo);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f3423oo000o);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.o00oO0o);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f3414o00oO0O);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f3420o0ooOO0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f3421o0ooOOo);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f3422o0ooOoO);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f3418o0OOO0o);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.o0Oo0oo);
    }

    @Override // androidx.fragment.app.Oooo0, androidx.fragment.app.o00Oo0
    public final void OooOo0o() {
        CharSequence charSequence;
        Integer num;
        boolean z;
        int i;
        boolean z2;
        o0ooOO0.OooOOO0 o0o0o000;
        boolean z3;
        o0ooOO0.OooOOO0 o0o0o0002;
        super.OooOo0o();
        Window window = Oooo00o().getWindow();
        boolean z4 = false;
        if (this.f3413o00o0O) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f3416o0O0O00);
            if (!this.f3410o000OOo) {
                View findViewById = OooOoo().findViewById(R.id.fullscreen_header);
                ColorStateList o0ooOO02 = o0000O00.OooO00o.o0ooOO0(findViewById.getBackground());
                if (o0ooOO02 != null) {
                    num = Integer.valueOf(o0ooOO02.getDefaultColor());
                } else {
                    num = null;
                }
                int i2 = Build.VERSION.SDK_INT;
                if (num != null && num.intValue() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                int o00ooo2 = o0000O00.OooO00o.o00ooo(window.getContext(), 16842801, -16777216);
                if (z) {
                    num = Integer.valueOf(o00ooo2);
                }
                Integer valueOf = Integer.valueOf(o00ooo2);
                if (i2 >= 30) {
                    o0O000.OooO00o(window, false);
                } else {
                    o0O0000O.OooO00o(window, false);
                }
                window.getContext();
                Context context = window.getContext();
                if (i2 < 27) {
                    i = OooOo.OooO00o.OooO0OO(o0000O00.OooO00o.o00ooo(context, 16843858, -16777216), 128);
                } else {
                    i = 0;
                }
                window.setStatusBarColor(0);
                window.setNavigationBarColor(i);
                boolean o0000O02 = o0000O00.OooO00o.o0000O0(num.intValue());
                if (!o0000O00.OooO00o.o0000O0(0) && !o0000O02) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                o0000OO0 o0000oo02 = new o0000OO0(window.getDecorView(), 12);
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 30) {
                    o0o0o000 = new o0O0o0(window, o0000oo02);
                } else if (i3 >= 26) {
                    o0o0o000 = new o0O0o00O(window, o0000oo02);
                } else {
                    o0o0o000 = new o0O0o000(window, o0000oo02);
                }
                o0o0o000.OooOo0O(z2);
                boolean o0000O03 = o0000O00.OooO00o.o0000O0(valueOf.intValue());
                if (!o0000O00.OooO00o.o0000O0(i) && (i != 0 || !o0000O03)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                o0000OO0 o0000oo03 = new o0000OO0(window.getDecorView(), 12);
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 30) {
                    o0o0o0002 = new o0O0o0(window, o0000oo03);
                } else if (i4 >= 26) {
                    o0o0o0002 = new o0O0o00O(window, o0000oo03);
                } else {
                    o0o0o0002 = new o0O0o000(window, o0000oo03);
                }
                o0o0o0002.OooOo0(z3);
                OooOOo0.OooOO0 oooOO0 = new OooOOo0.OooOO0(this, findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop());
                WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
                oo0oOO0.OooOo0(findViewById, oooOO0);
                this.f3410o000OOo = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = OooOoo0().getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f3416o0O0O00, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new o00O0O.OooO00o(Oooo00o(), rect));
        }
        OooOoo0();
        int i5 = this.f3407Ooooooo;
        if (i5 != 0) {
            Oooo0();
            OooO0OO oooO0OO = this.f3425ooOO;
            Oooo000 oooo000 = new Oooo000();
            Bundle bundle = new Bundle();
            bundle.putInt("THEME_RES_ID_KEY", i5);
            bundle.putParcelable("GRID_SELECTOR_KEY", null);
            bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", oooO0OO);
            bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
            bundle.putParcelable("CURRENT_MONTH_KEY", oooO0OO.f3368OooO0Oo);
            oooo000.OooOooo(bundle);
            this.f3411o00O0O = oooo000;
            o0ooOOo o0ooooo = oooo000;
            if (this.f3415o00ooo == 1) {
                Oooo0();
                OooO0OO oooO0OO2 = this.f3425ooOO;
                o0ooOOo o0oooo0 = new o0OoOo0();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("THEME_RES_ID_KEY", i5);
                bundle2.putParcelable("DATE_SELECTOR_KEY", null);
                bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", oooO0OO2);
                o0oooo0.OooOooo(bundle2);
                o0ooooo = o0oooo0;
            }
            this.f3419o0OoOo0 = o0ooooo;
            TextView textView = this.f3417o0OO00O;
            if (this.f3415o00ooo == 1) {
                if (OooOoo0().getResources().getConfiguration().orientation == 2) {
                    z4 = true;
                }
                if (z4) {
                    charSequence = this.f3409o000000O;
                    textView.setText(charSequence);
                    Oooo0();
                    OooO();
                    throw null;
                }
            }
            charSequence = this.f3408o000000;
            textView.setText(charSequence);
            Oooo0();
            OooO();
            throw null;
        }
        Oooo0();
        throw null;
    }

    public final void Oooo0() {
        OooO0O0.OooO00o.OooO0o(this.f2955OooO0o.getParcelable("DATE_SELECTOR_KEY"));
    }

    @Override // androidx.fragment.app.Oooo0
    public final Dialog Oooo00O() {
        Context OooOoo02 = OooOoo0();
        OooOoo0();
        int i = this.f3407Ooooooo;
        if (i != 0) {
            Dialog dialog = new Dialog(OooOoo02, i);
            Context context = dialog.getContext();
            this.f3413o00o0O = Oooo0OO(context);
            this.f3416o0O0O00 = new o0ooOO0.OooOOOO(context, null, R.attr.materialCalendarStyle, 2131756053);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, o0000O.f1797OooOO0o, R.attr.materialCalendarStyle, 2131756053);
            int color = obtainStyledAttributes.getColor(1, 0);
            obtainStyledAttributes.recycle();
            this.f3416o0O0O00.OooO0oo(context);
            this.f3416o0O0O00.OooOO0(ColorStateList.valueOf(color));
            o0ooOO0.OooOOOO oooOOOO = this.f3416o0O0O00;
            View decorView = dialog.getWindow().getDecorView();
            WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
            oooOOOO.OooO(oo0oOO0.OooO(decorView));
            return dialog;
        }
        Oooo0();
        throw null;
    }

    @Override // androidx.fragment.app.Oooo0, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f3405Oooooo.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.Oooo0, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f3406OoooooO.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f2979OooOooo;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }
}