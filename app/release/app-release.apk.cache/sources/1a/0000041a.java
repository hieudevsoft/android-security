package com.google.crypto.tink.shaded.protobuf;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class OooOo implements Iterable, Serializable {

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final OooOo00 f3625OooO0O0 = new OooOo00(o00000.f3651OooO0O0);

    /* renamed from: OooO0OO  reason: collision with root package name */
    public static final o0ooOO0.OooOOO0 f3626OooO0OO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public int f3627OooO00o = 0;

    static {
        f3626OooO0OO = OooO0o.OooO00o() ? new o0ooOO0.OooOOO0(1, 0) : new o0ooOO0.OooOOO0(0, 0);
    }

    public static int OooO0oO(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i < 0) {
                throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
            } else if (i2 < i) {
                throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
            } else {
                throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
            }
        }
        return i4;
    }

    public static OooOo00 OooO0oo(byte[] bArr, int i, int i2) {
        byte[] bArr2;
        int i3 = i + i2;
        OooO0oO(i, i3, bArr.length);
        switch (f3626OooO0OO.f5491OooO00o) {
            case 0:
                bArr2 = Arrays.copyOfRange(bArr, i, i3);
                break;
            default:
                byte[] bArr3 = new byte[i2];
                System.arraycopy(bArr, i, bArr3, 0, i2);
                bArr2 = bArr3;
                break;
        }
        return new OooOo00(bArr2);
    }

    public abstract void OooO(int i, byte[] bArr);

    public abstract byte OooO0o(int i);

    public abstract byte OooOO0(int i);

    public final byte[] OooOO0O() {
        int size = size();
        if (size == 0) {
            return o00000.f3651OooO0O0;
        }
        byte[] bArr = new byte[size];
        OooO(size, bArr);
        return bArr;
    }

    public final String OooOO0o() {
        Charset charset = o00000.f3650OooO00o;
        if (size() == 0) {
            return "";
        }
        OooOo00 oooOo00 = (OooOo00) this;
        return new String(oooOo00.f3628OooO0Oo, oooOo00.OooOOO0(), oooOo00.size(), charset);
    }

    public final int hashCode() {
        int i = this.f3627OooO00o;
        if (i == 0) {
            int size = size();
            OooOo00 oooOo00 = (OooOo00) this;
            int OooOOO0 = oooOo00.OooOOO0() + 0;
            int i2 = size;
            for (int i3 = OooOOO0; i3 < OooOOO0 + size; i3++) {
                i2 = (i2 * 31) + oooOo00.f3628OooO0Oo[i3];
            }
            if (i2 == 0) {
                i = 1;
            } else {
                i = i2;
            }
            this.f3627OooO00o = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new OooOOO0(this);
    }

    public abstract int size();

    public final String toString() {
        OooOo00 oooOOOO;
        String sb;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(size());
        if (size() <= 50) {
            sb = OooOO0.Oooo0oO(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            OooOo00 oooOo00 = (OooOo00) this;
            int OooO0oO2 = OooO0oO(0, 47, oooOo00.size());
            if (OooO0oO2 == 0) {
                oooOOOO = f3625OooO0O0;
            } else {
                oooOOOO = new OooOOOO(oooOo00.f3628OooO0Oo, oooOo00.OooOOO0() + 0, OooO0oO2);
            }
            sb2.append(OooOO0.Oooo0oO(oooOOOO));
            sb2.append("...");
            sb = sb2.toString();
        }
        objArr[2] = sb;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}