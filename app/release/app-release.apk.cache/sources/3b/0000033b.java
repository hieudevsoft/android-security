package androidx.emoji2.text;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class o0Oo0oo implements TextWatcher, SpanWatcher {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Object f2723OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final AtomicInteger f2724OooO0O0 = new AtomicInteger(0);

    public o0Oo0oo(Object obj) {
        this.f2723OooO00o = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f2723OooO00o).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.f2723OooO00o).beforeTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
        if (this.f2724OooO0O0.get() > 0 && (obj instanceof oo0o0Oo)) {
            return;
        }
        ((SpanWatcher) this.f2723OooO00o).onSpanAdded(spannable, obj, i, i2);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (this.f2724OooO0O0.get() > 0 && (obj instanceof oo0o0Oo)) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28) {
            if (i > i2) {
                i = 0;
            }
            if (i3 > i4) {
                i5 = i;
                i6 = 0;
                ((SpanWatcher) this.f2723OooO00o).onSpanChanged(spannable, obj, i5, i2, i6, i4);
            }
        }
        i5 = i;
        i6 = i3;
        ((SpanWatcher) this.f2723OooO00o).onSpanChanged(spannable, obj, i5, i2, i6, i4);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
        if (this.f2724OooO0O0.get() > 0 && (obj instanceof oo0o0Oo)) {
            return;
        }
        ((SpanWatcher) this.f2723OooO00o).onSpanRemoved(spannable, obj, i, i2);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.f2723OooO00o).onTextChanged(charSequence, i, i2, i3);
    }
}