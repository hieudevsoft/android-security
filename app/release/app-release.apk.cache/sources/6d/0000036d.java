package androidx.fragment.app;

import java.io.Writer;
import java.util.Objects;

/* loaded from: classes.dex */
public final class o000OOo0 extends Writer {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f2930OooO00o = 0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final CharSequence f2932OooO0OO = new StringBuilder(128);

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final Object f2931OooO0O0 = "FragmentManager";

    public final void OooOo() {
        CharSequence charSequence = this.f2932OooO0OO;
        if (((StringBuilder) charSequence).length() > 0) {
            ((StringBuilder) charSequence).toString();
            ((StringBuilder) charSequence).delete(0, ((StringBuilder) charSequence).length());
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        switch (this.f2930OooO00o) {
            case 1:
                ((Appendable) this.f2931OooO0O0).append(charSequence);
                return this;
            default:
                return super.append(charSequence);
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f2930OooO00o) {
            case 0:
                OooOo();
                return;
            default:
                return;
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        switch (this.f2930OooO00o) {
            case 0:
                OooOo();
                return;
            default:
                return;
        }
    }

    @Override // java.io.Writer
    public final void write(int i) {
        switch (this.f2930OooO00o) {
            case 1:
                ((Appendable) this.f2931OooO0O0).append((char) i);
                return;
            default:
                super.write(i);
                return;
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i, int i2) {
        switch (this.f2930OooO00o) {
            case 1:
                ((Appendable) this.f2931OooO0O0).append(charSequence, i, i2);
                return this;
            default:
                return super.append(charSequence, i, i2);
        }
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) {
        switch (this.f2930OooO00o) {
            case 1:
                Objects.requireNonNull(str);
                ((Appendable) this.f2931OooO0O0).append(str, i, i2 + i);
                return;
            default:
                super.write(str, i, i2);
                return;
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        switch (this.f2930OooO00o) {
            case 1:
                return append(charSequence);
            default:
                return super.append(charSequence);
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        int i3 = this.f2930OooO00o;
        CharSequence charSequence = this.f2932OooO0OO;
        switch (i3) {
            case 0:
                for (int i4 = 0; i4 < i2; i4++) {
                    char c = cArr[i + i4];
                    if (c == '\n') {
                        OooOo();
                    } else {
                        ((StringBuilder) charSequence).append(c);
                    }
                }
                return;
            default:
                com.google.gson.internal.o00Ooo o00ooo2 = (com.google.gson.internal.o00Ooo) charSequence;
                o00ooo2.getClass();
                o00ooo2.getClass();
                ((Appendable) this.f2931OooO0O0).append(o00ooo2, i, i2 + i);
                return;
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) {
        switch (this.f2930OooO00o) {
            case 1:
                return append(charSequence, i, i2);
            default:
                return super.append(charSequence, i, i2);
        }
    }
}