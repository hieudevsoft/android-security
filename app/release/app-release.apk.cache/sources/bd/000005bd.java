package o0000Ooo;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class OooOOO implements Closeable, Flushable {

    /* renamed from: OooO  reason: collision with root package name */
    public static final Pattern f4410OooO = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: OooOO0  reason: collision with root package name */
    public static final String[] f4411OooOO0 = new String[128];

    /* renamed from: OooOO0O  reason: collision with root package name */
    public static final String[] f4412OooOO0O;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Writer f4413OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int[] f4414OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f4415OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public String f4416OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public boolean f4417OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public boolean f4418OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public String f4419OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public boolean f4420OooO0oo;

    static {
        for (int i = 0; i <= 31; i++) {
            f4411OooOO0[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f4411OooOO0;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f4412OooOO0O = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public OooOOO(Writer writer) {
        int[] iArr = new int[32];
        this.f4414OooO0O0 = iArr;
        this.f4415OooO0OO = 0;
        if (iArr.length == 0) {
            this.f4414OooO0O0 = Arrays.copyOf(iArr, 0 * 2);
        }
        int[] iArr2 = this.f4414OooO0O0;
        int i = this.f4415OooO0OO;
        this.f4415OooO0OO = i + 1;
        iArr2[i] = 6;
        this.f4416OooO0Oo = ":";
        this.f4420OooO0oo = true;
        Objects.requireNonNull(writer, "out == null");
        this.f4413OooO00o = writer;
    }

    public final void OooOo() {
        int Oooo00O2 = Oooo00O();
        if (Oooo00O2 != 1) {
            Writer writer = this.f4413OooO00o;
            if (Oooo00O2 != 2) {
                if (Oooo00O2 != 4) {
                    if (Oooo00O2 != 6) {
                        if (Oooo00O2 == 7) {
                            if (!this.f4418OooO0o0) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                        } else {
                            throw new IllegalStateException("Nesting problem.");
                        }
                    }
                    this.f4414OooO0O0[this.f4415OooO0OO - 1] = 7;
                    return;
                }
                writer.append((CharSequence) this.f4416OooO0Oo);
                this.f4414OooO0O0[this.f4415OooO0OO - 1] = 5;
                return;
            }
            writer.append(',');
        } else {
            this.f4414OooO0O0[this.f4415OooO0OO - 1] = 2;
        }
        OooOooo();
    }

    public void OooOoO() {
        Oooo0oo();
        OooOo();
        int i = this.f4415OooO0OO;
        int[] iArr = this.f4414OooO0O0;
        if (i == iArr.length) {
            this.f4414OooO0O0 = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.f4414OooO0O0;
        int i2 = this.f4415OooO0OO;
        this.f4415OooO0OO = i2 + 1;
        iArr2[i2] = 3;
        this.f4413OooO00o.write(123);
    }

    public void OooOoO0() {
        Oooo0oo();
        OooOo();
        int i = this.f4415OooO0OO;
        int[] iArr = this.f4414OooO0O0;
        if (i == iArr.length) {
            this.f4414OooO0O0 = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.f4414OooO0O0;
        int i2 = this.f4415OooO0OO;
        this.f4415OooO0OO = i2 + 1;
        iArr2[i2] = 1;
        this.f4413OooO00o.write(91);
    }

    public final void OooOoOO(int i, int i2, char c) {
        int Oooo00O2 = Oooo00O();
        if (Oooo00O2 != i2 && Oooo00O2 != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f4419OooO0oO != null) {
            throw new IllegalStateException("Dangling name: " + this.f4419OooO0oO);
        }
        this.f4415OooO0OO--;
        if (Oooo00O2 == i2) {
            OooOooo();
        }
        this.f4413OooO00o.write(c);
    }

    public void OooOoo() {
        OooOoOO(3, 5, '}');
    }

    public void OooOoo0() {
        OooOoOO(1, 2, ']');
    }

    public void OooOooO(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f4419OooO0oO != null) {
            throw new IllegalStateException();
        }
        if (this.f4415OooO0OO == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f4419OooO0oO = str;
    }

    public final void OooOooo() {
    }

    public void Oooo0(double d) {
        Oooo0oo();
        if (this.f4418OooO0o0 || !(Double.isNaN(d) || Double.isInfinite(d))) {
            OooOo();
            this.f4413OooO00o.append((CharSequence) Double.toString(d));
            return;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
    }

    public OooOOO Oooo000() {
        if (this.f4419OooO0oO != null) {
            if (!this.f4420OooO0oo) {
                this.f4419OooO0oO = null;
                return this;
            }
            Oooo0oo();
        }
        OooOo();
        this.f4413OooO00o.write("null");
        return this;
    }

    public final int Oooo00O() {
        int i = this.f4415OooO0OO;
        if (i != 0) {
            return this.f4414OooO0O0[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Oooo00o(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = r8.f4417OooO0o
            if (r0 == 0) goto L7
            java.lang.String[] r0 = o0000Ooo.OooOOO.f4412OooOO0O
            goto L9
        L7:
            java.lang.String[] r0 = o0000Ooo.OooOOO.f4411OooOO0
        L9:
            java.io.Writer r1 = r8.f4413OooO00o
            r2 = 34
            r1.write(r2)
            int r3 = r9.length()
            r4 = 0
            r5 = r4
        L16:
            if (r4 >= r3) goto L41
            char r6 = r9.charAt(r4)
            r7 = 128(0x80, float:1.8E-43)
            if (r6 >= r7) goto L25
            r6 = r0[r6]
            if (r6 != 0) goto L32
            goto L3e
        L25:
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r6 != r7) goto L2c
            java.lang.String r6 = "\\u2028"
            goto L32
        L2c:
            r7 = 8233(0x2029, float:1.1537E-41)
            if (r6 != r7) goto L3e
            java.lang.String r6 = "\\u2029"
        L32:
            if (r5 >= r4) goto L39
            int r7 = r4 - r5
            r1.write(r9, r5, r7)
        L39:
            r1.write(r6)
            int r5 = r4 + 1
        L3e:
            int r4 = r4 + 1
            goto L16
        L41:
            if (r5 >= r3) goto L47
            int r3 = r3 - r5
            r1.write(r9, r5, r3)
        L47:
            r1.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o0000Ooo.OooOOO.Oooo00o(java.lang.String):void");
    }

    public void Oooo0O0(long j) {
        Oooo0oo();
        OooOo();
        this.f4413OooO00o.write(Long.toString(j));
    }

    public void Oooo0OO(Boolean bool) {
        if (bool == null) {
            Oooo000();
            return;
        }
        Oooo0oo();
        OooOo();
        this.f4413OooO00o.write(bool.booleanValue() ? "true" : "false");
    }

    public void Oooo0o(String str) {
        if (str == null) {
            Oooo000();
            return;
        }
        Oooo0oo();
        OooOo();
        Oooo00o(str);
    }

    public void Oooo0o0(Number number) {
        boolean z;
        if (number == null) {
            Oooo000();
            return;
        }
        Oooo0oo();
        String obj = number.toString();
        if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
                z = false;
            } else {
                z = true;
            }
            if (!z && !f4410OooO.matcher(obj).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        } else if (!this.f4418OooO0o0) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(obj));
        }
        OooOo();
        this.f4413OooO00o.append((CharSequence) obj);
    }

    public void Oooo0oO(boolean z) {
        Oooo0oo();
        OooOo();
        this.f4413OooO00o.write(z ? "true" : "false");
    }

    public final void Oooo0oo() {
        if (this.f4419OooO0oO != null) {
            int Oooo00O2 = Oooo00O();
            if (Oooo00O2 == 5) {
                this.f4413OooO00o.write(44);
            } else if (Oooo00O2 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            OooOooo();
            this.f4414OooO0O0[this.f4415OooO0OO - 1] = 4;
            Oooo00o(this.f4419OooO0oO);
            this.f4419OooO0oO = null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f4413OooO00o.close();
        int i = this.f4415OooO0OO;
        if (i > 1 || (i == 1 && this.f4414OooO0O0[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f4415OooO0OO = 0;
    }

    public void flush() {
        if (this.f4415OooO0OO == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f4413OooO00o.flush();
    }
}