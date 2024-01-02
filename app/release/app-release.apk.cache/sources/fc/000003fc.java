package com.google.android.material.timepicker;

import OooOo0O.oo000o;
import OooOooo.o00O0O0O;
import OooOooo.o0o0Oo;
import OooOooo.o0oOo0O0;
import OooOooo.oo0O;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import hieubui.eup.android_app_security.R;
import java.util.WeakHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Chip f3568OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final EditText f3569OooO0O0;

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.f3568OooO00o = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        EditText editText = textInputLayout.getEditText();
        this.f3569OooO0O0 = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new OooO00o(this));
        editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        addView(chip);
        addView(textInputLayout);
        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
        editText.setId(o00O0O0O.OooO00o());
        o00O0O0O.OooO0oo((TextView) findViewById(R.id.material_label), editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    public static String OooO00o(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        try {
            return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f3568OooO00o.isChecked();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f3569OooO0O0.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        int i;
        Chip chip = this.f3568OooO00o;
        chip.setChecked(z);
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        final EditText editText = this.f3569OooO0O0;
        editText.setVisibility(i);
        if (z) {
            i2 = 8;
        }
        chip.setVisibility(i2);
        if (isChecked()) {
            editText.requestFocus();
            editText.post(new Runnable() { // from class: o00o0O.OooOo

                /* renamed from: OooO0O0  reason: collision with root package name */
                public final /* synthetic */ boolean f5282OooO0O0 = false;

                @Override // java.lang.Runnable
                public final void run() {
                    o0oOo0O0 o0ooo0o0;
                    boolean z2 = this.f5282OooO0O0;
                    View view = editText;
                    if (z2) {
                        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
                        if (Build.VERSION.SDK_INT >= 30) {
                            o0ooo0o0 = oo0O.OooO0OO(view);
                        } else {
                            Context context = view.getContext();
                            while (true) {
                                if (!(context instanceof ContextWrapper)) {
                                    break;
                                } else if (context instanceof Activity) {
                                    Window window = ((Activity) context).getWindow();
                                    if (window != null) {
                                        o0ooo0o0 = new o0oOo0O0(window, view);
                                    }
                                } else {
                                    context = ((ContextWrapper) context).getBaseContext();
                                }
                            }
                            o0ooo0o0 = null;
                        }
                        if (o0ooo0o0 != null) {
                            o0ooo0o0.f1374OooO00o.OooOoO();
                            return;
                        }
                    }
                    Context context2 = view.getContext();
                    Object obj = OooOo0.Oooo000.f1139OooO00o;
                    ((InputMethodManager) oo000o.OooO0O0(context2, InputMethodManager.class)).showSoftInput(view, 1);
                }
            });
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f3568OooO00o.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        this.f3568OooO00o.setTag(i, obj);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.f3568OooO00o.toggle();
    }
}