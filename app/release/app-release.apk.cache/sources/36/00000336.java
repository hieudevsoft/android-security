package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class o00Ooo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o0ooOO0.OooOOO0 f2707OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final OooO0o.OooOOO0 f2708OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final OooOOO f2709OooO0OO;

    public o00Ooo(OooO0o.OooOOO0 oooOOO0, o0ooOO0.OooOOO0 oooOOO02, OooO oooO) {
        this.f2707OooO00o = oooOOO02;
        this.f2708OooO0O0 = oooOOO0;
        this.f2709OooO0OO = oooO;
    }

    public static boolean OooO00o(Editable editable, KeyEvent keyEvent, boolean z) {
        boolean z2;
        oo0o0Oo[] oo0o0ooArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2 && (oo0o0ooArr = (oo0o0Oo[]) editable.getSpans(selectionStart, selectionEnd, oo0o0Oo.class)) != null && oo0o0ooArr.length > 0) {
            for (oo0o0Oo oo0o0oo : oo0o0ooArr) {
                int spanStart = editable.getSpanStart(oo0o0oo);
                int spanEnd = editable.getSpanEnd(oo0o0oo);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean OooO0O0(CharSequence charSequence, int i, int i2, o00O0O o00o0o) {
        int i3;
        if (o00o0o.f2700OooO0OO == 0) {
            OooOOO oooOOO = this.f2709OooO0OO;
            Oooo0o.o00Oo0 OooO0OO2 = o00o0o.OooO0OO();
            int OooO00o2 = OooO0OO2.OooO00o(8);
            if (OooO00o2 != 0) {
                ((ByteBuffer) OooO0OO2.f1460OooO0Oo).getShort(OooO00o2 + OooO0OO2.f1457OooO00o);
            }
            OooO oooO = (OooO) oooOOO;
            oooO.getClass();
            ThreadLocal threadLocal = OooO.f2670OooO0O0;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = oooO.f2671OooO00o;
            String sb2 = sb.toString();
            int i4 = OooOo.OooO.f1107OooO00o;
            if (OooOo.OooO0o.OooO00o(textPaint, sb2)) {
                i3 = 2;
            } else {
                i3 = 1;
            }
            o00o0o.f2700OooO0OO = i3;
        }
        if (o00o0o.f2700OooO0OO != 2) {
            return false;
        }
        return true;
    }
}