package o0000Ooo;

import OooO0O0.OooO00o;
import java.io.Closeable;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;
import o00000.o000;

/* loaded from: classes.dex */
public class OooOOO0 implements Closeable {

    /* renamed from: OooO  reason: collision with root package name */
    public long f4421OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Reader f4422OooO00o;

    /* renamed from: OooOO0  reason: collision with root package name */
    public int f4430OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public String f4431OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public int[] f4432OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public String[] f4433OooOOO;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public int[] f4434OooOOOO;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public boolean f4423OooO0O0 = false;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final char[] f4424OooO0OO = new char[1024];

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public int f4425OooO0Oo = 0;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public int f4427OooO0o0 = 0;

    /* renamed from: OooO0o  reason: collision with root package name */
    public int f4426OooO0o = 0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public int f4428OooO0oO = 0;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public int f4429OooO0oo = 0;
    public int OooOOO0 = 1;

    static {
        o0ooOO0.OooOOO0.f5490OooO0o0 = new o0ooOO0.OooOOO0();
    }

    public OooOOO0(StringReader stringReader) {
        int[] iArr = new int[32];
        this.f4432OooOO0o = iArr;
        iArr[0] = 6;
        this.f4433OooOOO = new String[32];
        this.f4434OooOOOO = new int[32];
        this.f4422OooO00o = stringReader;
    }

    public final void OooOo() {
        int i = this.f4429OooO0oo;
        if (i == 0) {
            i = OooOoOO();
        }
        if (i == 3) {
            OoooO(1);
            this.f4434OooOOOO[this.OooOOO0 - 1] = 0;
            this.f4429OooO0oo = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + OooO00o.OooOO0(OoooO0O()) + Oooo00o());
    }

    public final void OooOoO() {
        if (this.f4423OooO0O0) {
            return;
        }
        OoooOoO("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    public final void OooOoO0() {
        int i = this.f4429OooO0oo;
        if (i == 0) {
            i = OooOoOO();
        }
        if (i == 1) {
            OoooO(3);
            this.f4429OooO0oo = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + OooO00o.OooOO0(OoooO0O()) + Oooo00o());
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x0210, code lost:
        if (Oooo00O(r5) != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0212, code lost:
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0213, code lost:
        if (r3 != 2) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0215, code lost:
        if (r13 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x021b, code lost:
        if (r7 != Long.MIN_VALUE) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x021d, code lost:
        if (r12 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0221, code lost:
        if (r7 != 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0223, code lost:
        if (r12 != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0225, code lost:
        if (r12 == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0228, code lost:
        r7 = -r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0229, code lost:
        r18.f4421OooO = r7;
        r18.f4425OooO0Oo += r11;
        r1 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0233, code lost:
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0234, code lost:
        if (r3 == r1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0237, code lost:
        if (r3 == 4) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x023a, code lost:
        if (r3 != 7) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x023c, code lost:
        r18.f4430OooOO0 = r11;
        r1 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0240, code lost:
        r7 = r1;
        r18.f4429OooO0oo = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0182 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x026b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ef  */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int OooOoOO() {
        /*
            Method dump skipped, instructions count: 790
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0000Ooo.OooOOO0.OooOoOO():int");
    }

    public final void OooOoo() {
        int i = this.f4429OooO0oo;
        if (i == 0) {
            i = OooOoOO();
        }
        if (i != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + OooO00o.OooOO0(OoooO0O()) + Oooo00o());
        }
        int i2 = this.OooOOO0 - 1;
        this.OooOOO0 = i2;
        this.f4433OooOOO[i2] = null;
        int[] iArr = this.f4434OooOOOO;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.f4429OooO0oo = 0;
    }

    public final void OooOoo0() {
        int i = this.f4429OooO0oo;
        if (i == 0) {
            i = OooOoOO();
        }
        if (i != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + OooO00o.OooOO0(OoooO0O()) + Oooo00o());
        }
        int i2 = this.OooOOO0 - 1;
        this.OooOOO0 = i2;
        int[] iArr = this.f4434OooOOOO;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.f4429OooO0oo = 0;
    }

    public final boolean OooOooO(int i) {
        int i2;
        int i3;
        int i4 = this.f4428OooO0oO;
        int i5 = this.f4425OooO0Oo;
        this.f4428OooO0oO = i4 - i5;
        int i6 = this.f4427OooO0o0;
        char[] cArr = this.f4424OooO0OO;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f4427OooO0o0 = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f4427OooO0o0 = 0;
        }
        this.f4425OooO0Oo = 0;
        do {
            int i8 = this.f4427OooO0o0;
            int read = this.f4422OooO00o.read(cArr, i8, cArr.length - i8);
            if (read == -1) {
                return false;
            }
            i2 = this.f4427OooO0o0 + read;
            this.f4427OooO0o0 = i2;
            if (this.f4426OooO0o == 0 && (i3 = this.f4428OooO0oO) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f4425OooO0Oo++;
                this.f4428OooO0oO = i3 + 1;
                i++;
                continue;
            }
        } while (i2 < i);
        return true;
    }

    public final String OooOooo(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.OooOOO0;
            if (i >= i2) {
                return sb.toString();
            }
            int i3 = this.f4432OooOO0o[i];
            if (i3 == 1 || i3 == 2) {
                int i4 = this.f4434OooOOOO[i];
                if (z && i4 > 0 && i == i2 - 1) {
                    i4--;
                }
                sb.append('[');
                sb.append(i4);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = this.f4433OooOOO[i];
                if (str != null) {
                    sb.append(str);
                }
            }
            i++;
        }
    }

    public final String Oooo(char c) {
        StringBuilder sb = null;
        while (true) {
            int i = this.f4425OooO0Oo;
            int i2 = this.f4427OooO0o0;
            int i3 = i;
            while (true) {
                char[] cArr = this.f4424OooO0OO;
                if (i3 < i2) {
                    int i4 = i3 + 1;
                    char c2 = cArr[i3];
                    if (c2 == c) {
                        this.f4425OooO0Oo = i4;
                        int i5 = (i4 - i) - 1;
                        if (sb == null) {
                            return new String(cArr, i, i5);
                        }
                        sb.append(cArr, i, i5);
                        return sb.toString();
                    } else if (c2 == '\\') {
                        this.f4425OooO0Oo = i4;
                        int i6 = (i4 - i) - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max((i6 + 1) * 2, 16));
                        }
                        sb.append(cArr, i, i6);
                        sb.append(OoooOO0());
                    } else {
                        if (c2 == '\n') {
                            this.f4426OooO0o++;
                            this.f4428OooO0oO = i4;
                        }
                        i3 = i4;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i3 - i) * 2, 16));
                    }
                    sb.append(cArr, i, i3 - i);
                    this.f4425OooO0Oo = i3;
                    if (!OooOooO(1)) {
                        OoooOoO("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    public final boolean Oooo0() {
        int i = this.f4429OooO0oo;
        if (i == 0) {
            i = OooOoOO();
        }
        if (i == 5) {
            this.f4429OooO0oo = 0;
            int[] iArr = this.f4434OooOOOO;
            int i2 = this.OooOOO0 - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i != 6) {
            throw new IllegalStateException("Expected a boolean but was " + OooO00o.OooOO0(OoooO0O()) + Oooo00o());
        } else {
            this.f4429OooO0oo = 0;
            int[] iArr2 = this.f4434OooOOOO;
            int i3 = this.OooOOO0 - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        }
    }

    public final boolean Oooo000() {
        int i = this.f4429OooO0oo;
        if (i == 0) {
            i = OooOoOO();
        }
        return (i == 2 || i == 4 || i == 17) ? false : true;
    }

    public final boolean Oooo00O(char c) {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        OooOoO();
        return false;
    }

    public final String Oooo00o() {
        return " at line " + (this.f4426OooO0o + 1) + " column " + ((this.f4425OooO0Oo - this.f4428OooO0oO) + 1) + " path " + OooOooo(false);
    }

    public final double Oooo0O0() {
        String Oooo2;
        int i = this.f4429OooO0oo;
        if (i == 0) {
            i = OooOoOO();
        }
        if (i == 15) {
            this.f4429OooO0oo = 0;
            int[] iArr = this.f4434OooOOOO;
            int i2 = this.OooOOO0 - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f4421OooO;
        }
        if (i == 16) {
            this.f4431OooOO0O = new String(this.f4424OooO0OO, this.f4425OooO0Oo, this.f4430OooOO0);
            this.f4425OooO0Oo += this.f4430OooOO0;
        } else {
            if (i == 8 || i == 9) {
                Oooo2 = Oooo(i == 8 ? '\'' : '\"');
            } else if (i == 10) {
                Oooo2 = OoooO0();
            } else if (i != 11) {
                throw new IllegalStateException("Expected a double but was " + OooO00o.OooOO0(OoooO0O()) + Oooo00o());
            }
            this.f4431OooOO0O = Oooo2;
        }
        this.f4429OooO0oo = 11;
        double parseDouble = Double.parseDouble(this.f4431OooOO0O);
        if (!this.f4423OooO0O0 && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new OooOOOO("JSON forbids NaN and infinities: " + parseDouble + Oooo00o());
        }
        this.f4431OooOO0O = null;
        this.f4429OooO0oo = 0;
        int[] iArr2 = this.f4434OooOOOO;
        int i3 = this.OooOOO0 - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return parseDouble;
    }

    public final int Oooo0OO() {
        String Oooo2;
        int i = this.f4429OooO0oo;
        if (i == 0) {
            i = OooOoOO();
        }
        if (i == 15) {
            long j = this.f4421OooO;
            int i2 = (int) j;
            if (j != i2) {
                throw new NumberFormatException("Expected an int but was " + this.f4421OooO + Oooo00o());
            }
            this.f4429OooO0oo = 0;
            int[] iArr = this.f4434OooOOOO;
            int i3 = this.OooOOO0 - 1;
            iArr[i3] = iArr[i3] + 1;
            return i2;
        }
        if (i == 16) {
            this.f4431OooOO0O = new String(this.f4424OooO0OO, this.f4425OooO0Oo, this.f4430OooOO0);
            this.f4425OooO0Oo += this.f4430OooOO0;
        } else if (i != 8 && i != 9 && i != 10) {
            throw new IllegalStateException("Expected an int but was " + OooO00o.OooOO0(OoooO0O()) + Oooo00o());
        } else {
            if (i == 10) {
                Oooo2 = OoooO0();
            } else {
                Oooo2 = Oooo(i == 8 ? '\'' : '\"');
            }
            this.f4431OooOO0O = Oooo2;
            try {
                int parseInt = Integer.parseInt(this.f4431OooOO0O);
                this.f4429OooO0oo = 0;
                int[] iArr2 = this.f4434OooOOOO;
                int i4 = this.OooOOO0 - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f4429OooO0oo = 11;
        double parseDouble = Double.parseDouble(this.f4431OooOO0O);
        int i5 = (int) parseDouble;
        if (i5 != parseDouble) {
            throw new NumberFormatException("Expected an int but was " + this.f4431OooOO0O + Oooo00o());
        }
        this.f4431OooOO0O = null;
        this.f4429OooO0oo = 0;
        int[] iArr3 = this.f4434OooOOOO;
        int i6 = this.OooOOO0 - 1;
        iArr3[i6] = iArr3[i6] + 1;
        return i5;
    }

    public final String Oooo0o() {
        char c;
        String Oooo2;
        int i = this.f4429OooO0oo;
        if (i == 0) {
            i = OooOoOO();
        }
        if (i == 14) {
            Oooo2 = OoooO0();
        } else {
            if (i == 12) {
                c = '\'';
            } else if (i != 13) {
                throw new IllegalStateException("Expected a name but was " + OooO00o.OooOO0(OoooO0O()) + Oooo00o());
            } else {
                c = '\"';
            }
            Oooo2 = Oooo(c);
        }
        this.f4429OooO0oo = 0;
        this.f4433OooOOO[this.OooOOO0 - 1] = Oooo2;
        return Oooo2;
    }

    public final long Oooo0o0() {
        String Oooo2;
        int i = this.f4429OooO0oo;
        if (i == 0) {
            i = OooOoOO();
        }
        if (i == 15) {
            this.f4429OooO0oo = 0;
            int[] iArr = this.f4434OooOOOO;
            int i2 = this.OooOOO0 - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f4421OooO;
        }
        if (i == 16) {
            this.f4431OooOO0O = new String(this.f4424OooO0OO, this.f4425OooO0Oo, this.f4430OooOO0);
            this.f4425OooO0Oo += this.f4430OooOO0;
        } else if (i != 8 && i != 9 && i != 10) {
            throw new IllegalStateException("Expected a long but was " + OooO00o.OooOO0(OoooO0O()) + Oooo00o());
        } else {
            if (i == 10) {
                Oooo2 = OoooO0();
            } else {
                Oooo2 = Oooo(i == 8 ? '\'' : '\"');
            }
            this.f4431OooOO0O = Oooo2;
            try {
                long parseLong = Long.parseLong(this.f4431OooOO0O);
                this.f4429OooO0oo = 0;
                int[] iArr2 = this.f4434OooOOOO;
                int i3 = this.OooOOO0 - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f4429OooO0oo = 11;
        double parseDouble = Double.parseDouble(this.f4431OooOO0O);
        long j = (long) parseDouble;
        if (j != parseDouble) {
            throw new NumberFormatException("Expected a long but was " + this.f4431OooOO0O + Oooo00o());
        }
        this.f4431OooOO0O = null;
        this.f4429OooO0oo = 0;
        int[] iArr3 = this.f4434OooOOOO;
        int i4 = this.OooOOO0 - 1;
        iArr3[i4] = iArr3[i4] + 1;
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
        r9.f4425OooO0Oo = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
        if (r0 != '/') goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
        if (r3 != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
        r9.f4425OooO0Oo = r3 - 1;
        r1 = OooOooO(2);
        r9.f4425OooO0Oo++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
        if (r1 != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0069, code lost:
        OooOoO();
        r1 = r9.f4425OooO0Oo;
        r3 = r4[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
        if (r3 == '*') goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
        if (r3 == '/') goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0077, code lost:
        r9.f4425OooO0Oo = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
        r9.f4425OooO0Oo = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0086, code lost:
        if ((r9.f4425OooO0Oo + 2) <= r9.f4427OooO0o0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
        if (OooOooO(2) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008f, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0091, code lost:
        r0 = r9.f4425OooO0Oo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0095, code lost:
        if (r4[r0] != '\n') goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0097, code lost:
        r9.f4426OooO0o++;
        r9.f4428OooO0oO = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a1, code lost:
        if (r3 >= 2) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ae, code lost:
        if (r4[r9.f4425OooO0Oo + r3] == "*\/".charAt(r3)) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b0, code lost:
        r9.f4425OooO0Oo++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b6, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b9, code lost:
        if (r2 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c0, code lost:
        OoooOoO("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c6, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c9, code lost:
        if (r0 != '#') goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00cb, code lost:
        OooOoO();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d3, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int Oooo0oO(boolean r10) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0000Ooo.OooOOO0.Oooo0oO(boolean):int");
    }

    public final void Oooo0oo() {
        int i = this.f4429OooO0oo;
        if (i == 0) {
            i = OooOoOO();
        }
        if (i != 7) {
            throw new IllegalStateException("Expected null but was " + OooO00o.OooOO0(OoooO0O()) + Oooo00o());
        }
        this.f4429OooO0oo = 0;
        int[] iArr = this.f4434OooOOOO;
        int i2 = this.OooOOO0 - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    public final void OoooO(int i) {
        int i2 = this.OooOOO0;
        int[] iArr = this.f4432OooOO0o;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.f4432OooOO0o = Arrays.copyOf(iArr, i3);
            this.f4434OooOOOO = Arrays.copyOf(this.f4434OooOOOO, i3);
            this.f4433OooOOO = (String[]) Arrays.copyOf(this.f4433OooOOO, i3);
        }
        int[] iArr2 = this.f4432OooOO0o;
        int i4 = this.OooOOO0;
        this.OooOOO0 = i4 + 1;
        iArr2[i4] = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
        OooOoO();
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String OoooO0() {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r7.f4425OooO0Oo
            int r4 = r3 + r2
            int r5 = r7.f4427OooO0o0
            char[] r6 = r7.f4424OooO0OO
            if (r4 >= r5) goto L4e
            int r3 = r3 + r2
            char r3 = r6[r3]
            r4 = 9
            if (r3 == r4) goto L5a
            r4 = 10
            if (r3 == r4) goto L5a
            r4 = 12
            if (r3 == r4) goto L5a
            r4 = 13
            if (r3 == r4) goto L5a
            r4 = 32
            if (r3 == r4) goto L5a
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5a
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5a
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5a
            r4 = 58
            if (r3 == r4) goto L5a
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5a;
                case 92: goto L4a;
                case 93: goto L5a;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r7.OooOoO()
            goto L5a
        L4e:
            int r3 = r6.length
            if (r2 >= r3) goto L5c
            int r3 = r2 + 1
            boolean r3 = r7.OooOooO(r3)
            if (r3 == 0) goto L5a
            goto L3
        L5a:
            r1 = r2
            goto L7a
        L5c:
            if (r0 != 0) goto L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L69:
            int r3 = r7.f4425OooO0Oo
            r0.append(r6, r3, r2)
            int r3 = r7.f4425OooO0Oo
            int r3 = r3 + r2
            r7.f4425OooO0Oo = r3
            r2 = 1
            boolean r2 = r7.OooOooO(r2)
            if (r2 != 0) goto L2
        L7a:
            if (r0 != 0) goto L84
            java.lang.String r0 = new java.lang.String
            int r2 = r7.f4425OooO0Oo
            r0.<init>(r6, r2, r1)
            goto L8d
        L84:
            int r2 = r7.f4425OooO0Oo
            r0.append(r6, r2, r1)
            java.lang.String r0 = r0.toString()
        L8d:
            int r2 = r7.f4425OooO0Oo
            int r2 = r2 + r1
            r7.f4425OooO0Oo = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o0000Ooo.OooOOO0.OoooO0():java.lang.String");
    }

    public final String OoooO00() {
        String str;
        char c;
        int i = this.f4429OooO0oo;
        if (i == 0) {
            i = OooOoOO();
        }
        if (i == 10) {
            str = OoooO0();
        } else {
            if (i == 8) {
                c = '\'';
            } else if (i == 9) {
                c = '\"';
            } else if (i == 11) {
                str = this.f4431OooOO0O;
                this.f4431OooOO0O = null;
            } else if (i == 15) {
                str = Long.toString(this.f4421OooO);
            } else if (i != 16) {
                throw new IllegalStateException("Expected a string but was " + OooO00o.OooOO0(OoooO0O()) + Oooo00o());
            } else {
                str = new String(this.f4424OooO0OO, this.f4425OooO0Oo, this.f4430OooOO0);
                this.f4425OooO0Oo += this.f4430OooOO0;
            }
            str = Oooo(c);
        }
        this.f4429OooO0oo = 0;
        int[] iArr = this.f4434OooOOOO;
        int i2 = this.OooOOO0 - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    public final int OoooO0O() {
        int i = this.f4429OooO0oo;
        if (i == 0) {
            i = OooOoOO();
        }
        switch (i) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final char OoooOO0() {
        int i;
        int i2;
        if (this.f4425OooO0Oo == this.f4427OooO0o0 && !OooOooO(1)) {
            OoooOoO("Unterminated escape sequence");
            throw null;
        }
        int i3 = this.f4425OooO0Oo;
        int i4 = i3 + 1;
        this.f4425OooO0Oo = i4;
        char[] cArr = this.f4424OooO0OO;
        char c = cArr[i3];
        if (c == '\n') {
            this.f4426OooO0o++;
            this.f4428OooO0oO = i4;
        } else if (c != '\"' && c != '\'' && c != '/' && c != '\\') {
            if (c != 'b') {
                if (c != 'f') {
                    if (c != 'n') {
                        if (c != 'r') {
                            if (c != 't') {
                                if (c != 'u') {
                                    OoooOoO("Invalid escape sequence");
                                    throw null;
                                } else if (i4 + 4 > this.f4427OooO0o0 && !OooOooO(4)) {
                                    OoooOoO("Unterminated escape sequence");
                                    throw null;
                                } else {
                                    int i5 = this.f4425OooO0Oo;
                                    int i6 = i5 + 4;
                                    char c2 = 0;
                                    while (i5 < i6) {
                                        char c3 = cArr[i5];
                                        char c4 = (char) (c2 << 4);
                                        if (c3 < '0' || c3 > '9') {
                                            if (c3 >= 'a' && c3 <= 'f') {
                                                i = c3 - 'a';
                                            } else if (c3 < 'A' || c3 > 'F') {
                                                throw new NumberFormatException("\\u".concat(new String(cArr, this.f4425OooO0Oo, 4)));
                                            } else {
                                                i = c3 - 'A';
                                            }
                                            i2 = i + 10;
                                        } else {
                                            i2 = c3 - '0';
                                        }
                                        c2 = (char) (i2 + c4);
                                        i5++;
                                    }
                                    this.f4425OooO0Oo += 4;
                                    return c2;
                                }
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\n';
                }
                return '\f';
            }
            return '\b';
        }
        return c;
    }

    public final void OoooOOO() {
        char c;
        do {
            if (this.f4425OooO0Oo >= this.f4427OooO0o0 && !OooOooO(1)) {
                return;
            }
            int i = this.f4425OooO0Oo;
            int i2 = i + 1;
            this.f4425OooO0Oo = i2;
            c = this.f4424OooO0OO[i];
            if (c == '\n') {
                this.f4426OooO0o++;
                this.f4428OooO0oO = i2;
                return;
            }
        } while (c != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
        OooOoO();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OoooOOo() {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f4425OooO0Oo
            int r2 = r1 + r0
            int r3 = r4.f4427OooO0o0
            if (r2 >= r3) goto L51
            char[] r2 = r4.f4424OooO0OO
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.OooOoO()
        L4b:
            int r1 = r4.f4425OooO0Oo
            int r1 = r1 + r0
            r4.f4425OooO0Oo = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f4425OooO0Oo = r1
            r0 = 1
            boolean r0 = r4.OooOooO(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o0000Ooo.OooOOO0.OoooOOo():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void OoooOo0() {
        int i = 0;
        do {
            int i2 = this.f4429OooO0oo;
            if (i2 == 0) {
                i2 = OooOoOO();
            }
            switch (i2) {
                case 1:
                    OoooO(3);
                    i++;
                    break;
                case 2:
                    if (i == 0) {
                        this.f4433OooOOO[this.OooOOO0 - 1] = null;
                    }
                    this.OooOOO0--;
                    i--;
                    break;
                case 3:
                    OoooO(1);
                    i++;
                    break;
                case 4:
                    this.OooOOO0--;
                    i--;
                    break;
                case 8:
                    o000oOoO('\'');
                    break;
                case 9:
                    o000oOoO('\"');
                    break;
                case 10:
                    OoooOOo();
                    break;
                case 12:
                    o000oOoO('\'');
                    if (i == 0) {
                        this.f4433OooOOO[this.OooOOO0 - 1] = "<skipped>";
                        break;
                    }
                    break;
                case 13:
                    o000oOoO('\"');
                    if (i == 0) {
                        this.f4433OooOOO[this.OooOOO0 - 1] = "<skipped>";
                        break;
                    }
                    break;
                case 14:
                    OoooOOo();
                    if (i == 0) {
                        this.f4433OooOOO[this.OooOOO0 - 1] = "<skipped>";
                        break;
                    }
                    break;
                case 16:
                    this.f4425OooO0Oo += this.f4430OooOO0;
                    break;
                case 17:
                    return;
            }
            this.f4429OooO0oo = 0;
        } while (i > 0);
        int[] iArr = this.f4434OooOOOO;
        int i3 = this.OooOOO0 - 1;
        iArr[i3] = iArr[i3] + 1;
    }

    public final void OoooOoO(String str) {
        throw new OooOOOO(str + Oooo00o());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f4429OooO0oo = 0;
        this.f4432OooOO0o[0] = 8;
        this.OooOOO0 = 1;
        this.f4422OooO00o.close();
    }

    public final void o000oOoO(char c) {
        while (true) {
            int i = this.f4425OooO0Oo;
            int i2 = this.f4427OooO0o0;
            while (true) {
                if (i < i2) {
                    int i3 = i + 1;
                    char c2 = this.f4424OooO0OO[i];
                    if (c2 == c) {
                        this.f4425OooO0Oo = i3;
                        return;
                    } else if (c2 == '\\') {
                        this.f4425OooO0Oo = i3;
                        OoooOO0();
                        break;
                    } else {
                        if (c2 == '\n') {
                            this.f4426OooO0o++;
                            this.f4428OooO0oO = i3;
                        }
                        i = i3;
                    }
                } else {
                    this.f4425OooO0Oo = i;
                    if (!OooOooO(1)) {
                        OoooOoO("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    public final String toString() {
        return OooOOO0.class.getSimpleName() + Oooo00o();
    }
}