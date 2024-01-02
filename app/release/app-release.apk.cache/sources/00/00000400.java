package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;

/* loaded from: classes.dex */
public final class OooO00o extends o00o0O.OooOo00 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ ChipTextInputComboView f3598OooO00o;

    public OooO00o(ChipTextInputComboView chipTextInputComboView) {
        this.f3598OooO00o = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean isEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f3598OooO00o;
        if (isEmpty) {
            chipTextInputComboView.f3568OooO00o.setText(ChipTextInputComboView.OooO00o(chipTextInputComboView, "00"));
            return;
        }
        String OooO00o2 = ChipTextInputComboView.OooO00o(chipTextInputComboView, editable);
        Chip chip = chipTextInputComboView.f3568OooO00o;
        if (TextUtils.isEmpty(OooO00o2)) {
            OooO00o2 = ChipTextInputComboView.OooO00o(chipTextInputComboView, "00");
        }
        chip.setText(OooO00o2);
    }
}