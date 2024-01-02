package com.google.android.material.theme;

import OooO0Oo.o0000O00;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.o0000Ooo;
import androidx.appcompat.widget.o00O0O;
import androidx.appcompat.widget.o00Ooo;
import androidx.appcompat.widget.o00oOoo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import o00ooo.OooO0O0;
import o0OOO0o.oo000o;
import o0OoOo0.OooO0OO;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends o0000O00 {
    @Override // OooO0Oo.o0000O00
    public final o00O0O OooO00o(Context context, AttributeSet attributeSet) {
        return new oo000o(context, attributeSet);
    }

    @Override // OooO0Oo.o0000O00
    public final o00Ooo OooO0O0(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // OooO0Oo.o0000O00
    public final androidx.appcompat.widget.oo000o OooO0OO(Context context, AttributeSet attributeSet) {
        return new OooO0OO(context, attributeSet);
    }

    @Override // OooO0Oo.o0000O00
    public final o0000Ooo OooO0Oo(Context context, AttributeSet attributeSet) {
        return new OooO0O0(context, attributeSet);
    }

    @Override // OooO0Oo.o0000O00
    public final o00oOoo OooO0o0(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}