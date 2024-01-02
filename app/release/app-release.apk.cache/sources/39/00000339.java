package androidx.emoji2.text;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o0OO00O extends SpannableStringBuilder {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Class f2719OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final ArrayList f2720OooO0O0;

    public o0OO00O(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f2720OooO0O0 = new ArrayList();
        if (cls == null) {
            throw new NullPointerException("watcherClass cannot be null");
        }
        this.f2719OooO00o = cls;
    }

    public final void OooO00o() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f2720OooO0O0;
            if (i < arrayList.size()) {
                ((o0Oo0oo) arrayList.get(i)).f2724OooO0O0.incrementAndGet();
                i++;
            } else {
                return;
            }
        }
    }

    public final void OooO0O0() {
        OooO0o0();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f2720OooO0O0;
            if (i < arrayList.size()) {
                ((o0Oo0oo) arrayList.get(i)).onTextChanged(this, 0, length(), length());
                i++;
            } else {
                return;
            }
        }
    }

    public final o0Oo0oo OooO0OO(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f2720OooO0O0;
            if (i >= arrayList.size()) {
                return null;
            }
            o0Oo0oo o0oo0oo = (o0Oo0oo) arrayList.get(i);
            if (o0oo0oo.f2723OooO00o == obj) {
                return o0oo0oo;
            }
            i++;
        }
    }

    public final boolean OooO0Oo(Object obj) {
        boolean z;
        if (obj == null) {
            return false;
        }
        if (this.f2719OooO00o == obj.getClass()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    public final void OooO0o0() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f2720OooO0O0;
            if (i < arrayList.size()) {
                ((o0Oo0oo) arrayList.get(i)).f2724OooO0O0.decrementAndGet();
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        o0Oo0oo OooO0OO2;
        if (OooO0Oo(obj) && (OooO0OO2 = OooO0OO(obj)) != null) {
            obj = OooO0OO2;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        o0Oo0oo OooO0OO2;
        if (OooO0Oo(obj) && (OooO0OO2 = OooO0OO(obj)) != null) {
            obj = OooO0OO2;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        o0Oo0oo OooO0OO2;
        if (OooO0Oo(obj) && (OooO0OO2 = OooO0OO(obj)) != null) {
            obj = OooO0OO2;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        boolean z;
        if (this.f2719OooO00o == cls) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            o0Oo0oo[] o0oo0ooArr = (o0Oo0oo[]) super.getSpans(i, i2, o0Oo0oo.class);
            Object[] objArr = (Object[]) Array.newInstance(cls, o0oo0ooArr.length);
            for (int i3 = 0; i3 < o0oo0ooArr.length; i3++) {
                objArr[i3] = o0oo0ooArr[i3].f2723OooO00o;
            }
            return objArr;
        }
        return super.getSpans(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0009, code lost:
        if (r0 != false) goto L10;
     */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int nextSpanTransition(int r2, int r3, java.lang.Class r4) {
        /*
            r1 = this;
            if (r4 == 0) goto Lb
            java.lang.Class r0 = r1.f2719OooO00o
            if (r0 != r4) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto Ld
        Lb:
            java.lang.Class<androidx.emoji2.text.o0Oo0oo> r4 = androidx.emoji2.text.o0Oo0oo.class
        Ld:
            int r2 = super.nextSpanTransition(r2, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.o0OO00O.nextSpanTransition(int, int, java.lang.Class):int");
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        o0Oo0oo o0oo0oo;
        if (OooO0Oo(obj)) {
            o0oo0oo = OooO0OO(obj);
            if (o0oo0oo != null) {
                obj = o0oo0oo;
            }
        } else {
            o0oo0oo = null;
        }
        super.removeSpan(obj);
        if (o0oo0oo != null) {
            this.f2720OooO0O0.remove(o0oo0oo);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence) {
        replace(i, i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (OooO0Oo(obj)) {
            o0Oo0oo o0oo0oo = new o0Oo0oo(obj);
            this.f2720OooO0O0.add(o0oo0oo);
            obj = o0oo0oo;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new o0OO00O(this.f2719OooO00o, this, i, i2);
    }

    public o0OO00O(Class cls, CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        this.f2720OooO0O0 = new ArrayList();
        if (cls == null) {
            throw new NullPointerException("watcherClass cannot be null");
        }
        this.f2719OooO00o = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        replace(i, i2, charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        OooO00o();
        super.replace(i, i2, charSequence);
        OooO0o0();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        OooO00o();
        super.replace(i, i2, charSequence, i3, i4);
        OooO0o0();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }
}