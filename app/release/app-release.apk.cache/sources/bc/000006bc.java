package o0OOO0o;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class Oooo000 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ Oooo0 f5373OooO00o;

    public Oooo000(Oooo0 oooo0) {
        this.f5373OooO00o = oooo0;
    }

    public final void OooO00o(TextInputLayout textInputLayout) {
        Oooo0 oooo0 = this.f5373OooO00o;
        if (oooo0.f5369OooOOoo == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = oooo0.f5369OooOOoo;
        OooOo oooOo = oooo0.f5372OooOo0O;
        if (editText != null) {
            editText.removeTextChangedListener(oooOo);
            if (oooo0.f5369OooOOoo.getOnFocusChangeListener() == oooo0.OooO0O0().OooO0o0()) {
                oooo0.f5369OooOOoo.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        oooo0.f5369OooOOoo = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(oooOo);
        }
        oooo0.OooO0O0().OooOOO0(oooo0.f5369OooOOoo);
        oooo0.OooOO0(oooo0.OooO0O0());
    }
}