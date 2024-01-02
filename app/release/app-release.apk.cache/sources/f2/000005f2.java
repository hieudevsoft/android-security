package o0000oOO;

import android.os.Build;
import com.google.gson.internal.OooO0o;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocket;
import o0000.OooOOOO;
import o0000O00.OooO00o;
import o0000Oo0.OooO0O0;
import o0000OoO.OooOO0O;
import o0000oOo.o000;
import o0000oOo.o000O;
import o0000oOo.o000O0o;
import o0000oOo.o000OO00;
import o0000oOo.o000OO0O;
import o0000oOo.o000Oo0;
import o000O000.OooO;
import o000O000.OooOO0;
import o000O000.OooOOO;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* loaded from: classes.dex */
public final class o00000OO implements androidx.lifecycle.o0000O0O {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f4672OooO00o;

    public /* synthetic */ o00000OO(int i) {
        this.f4672OooO00o = i;
    }

    public static OooOOO OooO(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) (OooO0o.OooO00o(str.charAt(i2 + 1)) + (OooO0o.OooO00o(str.charAt(i2)) << 4));
            }
            return new OooOOO(bArr);
        }
        throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
    }

    public static final String OooO0OO(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        byte[] bArr3 = PublicSuffixDatabase.f5596OooO0o0;
        int length = bArr.length;
        int i5 = 0;
        while (i5 < length) {
            int i6 = (i5 + length) / 2;
            while (i6 > -1 && bArr[i6] != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (bArr[i2] == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    byte b = bArr2[i10][i11];
                    byte[] bArr4 = OooOO0O.f4403OooO00o;
                    int i13 = b & 255;
                    z = z2;
                    i3 = i13;
                }
                byte b2 = bArr[i7 + i12];
                byte[] bArr5 = OooOO0O.f4403OooO00o;
                i4 = i3 - (b2 & 255);
                if (i4 != 0) {
                    break;
                }
                i12++;
                i11++;
                if (i12 == i9) {
                    break;
                } else if (bArr2[i10].length == i11) {
                    if (i10 == bArr2.length - 1) {
                        break;
                    }
                    i10++;
                    i11 = -1;
                    z2 = true;
                } else {
                    z2 = z;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i14 = i9 - i12;
                    int length2 = bArr2[i10].length - i11;
                    int length3 = bArr2.length;
                    for (int i15 = i10 + 1; i15 < length3; i15++) {
                        length2 += bArr2[i15].length;
                    }
                    if (length2 >= i14) {
                        if (length2 <= i14) {
                            Charset charset = StandardCharsets.UTF_8;
                            OooO00o.OooOoOO(charset, "UTF_8");
                            return new String(bArr, i7, i9, charset);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            length = i7 - 1;
        }
        return null;
    }

    public static ArrayList OooO0Oo(List list) {
        boolean z;
        OooO00o.OooOoo0(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((o0000Oo.o0O0O00) obj) != o0000Oo.o0O0O00.f4299OooO0O0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(OooOOOO.o00O0O0o(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((o0000Oo.o0O0O00) it.next()).f4306OooO00o);
        }
        return arrayList2;
    }

    public static OooO OooO0o0() {
        OooO oooO = OooO.f4811OooOO0o;
        OooO00o.OooOo(oooO);
        OooO oooO2 = oooO.f4812OooO0o;
        long nanoTime = System.nanoTime();
        if (oooO2 == null) {
            OooO.f4807OooO.await(OooO.f4809OooOO0, TimeUnit.MILLISECONDS);
            OooO oooO3 = OooO.f4811OooOO0o;
            OooO00o.OooOo(oooO3);
            if (oooO3.f4812OooO0o != null || System.nanoTime() - nanoTime < OooO.f4810OooOO0O) {
                return null;
            }
            return OooO.f4811OooOO0o;
        }
        long j = oooO2.f4814OooO0oO - nanoTime;
        if (j > 0) {
            OooO.f4807OooO.await(j, TimeUnit.NANOSECONDS);
            return null;
        }
        OooO oooO4 = OooO.f4811OooOO0o;
        OooO00o.OooOo(oooO4);
        oooO4.f4812OooO0o = oooO2.f4812OooO0o;
        oooO2.f4812OooO0o = null;
        return oooO2;
    }

    public static void OooO0oO(long j, OooOO0 oooOO0, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        OooOO0 oooOO02;
        int i6;
        int i7;
        OooOO0 oooOO03;
        long j2;
        int i8 = i;
        if (!(i2 < i3)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        for (int i9 = i2; i9 < i3; i9++) {
            if (!(((OooOOO) arrayList.get(i9)).OooO0OO() >= i8)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        OooOOO oooOOO = (OooOOO) arrayList.get(i2);
        OooOOO oooOOO2 = (OooOOO) arrayList.get(i3 - 1);
        int i10 = -1;
        if (i8 == oooOOO.OooO0OO()) {
            int intValue = ((Number) arrayList2.get(i2)).intValue();
            int i11 = i2 + 1;
            OooOOO oooOOO3 = (OooOOO) arrayList.get(i11);
            i4 = i11;
            i5 = intValue;
            oooOOO = oooOOO3;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (oooOOO.OooO0o(i8) != oooOOO2.OooO0o(i8)) {
            int i12 = 1;
            for (int i13 = i4 + 1; i13 < i3; i13++) {
                if (((OooOOO) arrayList.get(i13 - 1)).OooO0o(i8) != ((OooOOO) arrayList.get(i13)).OooO0o(i8)) {
                    i12++;
                }
            }
            long j3 = 4;
            long j4 = (i12 * 2) + (oooOO0.f4823OooO0O0 / j3) + j + 2;
            oooOO0.Oooo0O0(i12);
            oooOO0.Oooo0O0(i5);
            for (int i14 = i4; i14 < i3; i14++) {
                int OooO0o2 = ((OooOOO) arrayList.get(i14)).OooO0o(i8);
                if (i14 == i4 || OooO0o2 != ((OooOOO) arrayList.get(i14 - 1)).OooO0o(i8)) {
                    oooOO0.Oooo0O0(OooO0o2 & 255);
                }
            }
            OooOO0 oooOO04 = new OooOO0();
            while (i4 < i3) {
                byte OooO0o3 = ((OooOOO) arrayList.get(i4)).OooO0o(i8);
                int i15 = i4 + 1;
                int i16 = i15;
                while (true) {
                    if (i16 >= i3) {
                        i6 = i3;
                        break;
                    } else if (OooO0o3 != ((OooOOO) arrayList.get(i16)).OooO0o(i8)) {
                        i6 = i16;
                        break;
                    } else {
                        i16++;
                    }
                }
                if (i15 == i6 && i8 + 1 == ((OooOOO) arrayList.get(i4)).OooO0OO()) {
                    oooOO0.Oooo0O0(((Number) arrayList2.get(i4)).intValue());
                    i7 = i6;
                    oooOO03 = oooOO04;
                    j2 = j3;
                } else {
                    oooOO0.Oooo0O0(((int) ((oooOO04.f4823OooO0O0 / j3) + j4)) * i10);
                    i7 = i6;
                    oooOO03 = oooOO04;
                    j2 = j3;
                    OooO0oO(j4, oooOO04, i8 + 1, arrayList, i4, i7, arrayList2);
                }
                oooOO04 = oooOO03;
                i4 = i7;
                j3 = j2;
                i10 = -1;
            }
            oooOO02 = oooOO04;
        } else {
            int min = Math.min(oooOOO.OooO0OO(), oooOOO2.OooO0OO());
            int i17 = 0;
            for (int i18 = i8; i18 < min && oooOOO.OooO0o(i18) == oooOOO2.OooO0o(i18); i18++) {
                i17++;
            }
            long j5 = 4;
            long j6 = (oooOO0.f4823OooO0O0 / j5) + j + 2 + i17 + 1;
            oooOO0.Oooo0O0(-i17);
            oooOO0.Oooo0O0(i5);
            int i19 = i8 + i17;
            while (i8 < i19) {
                oooOO0.Oooo0O0(oooOOO.OooO0o(i8) & 255);
                i8++;
            }
            if (i4 + 1 == i3) {
                if (!(i19 == ((OooOOO) arrayList.get(i4)).OooO0OO())) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                oooOO0.Oooo0O0(((Number) arrayList2.get(i4)).intValue());
                return;
            }
            oooOO02 = new OooOO0();
            oooOO0.Oooo0O0(((int) ((oooOO02.f4823OooO0O0 / j5) + j6)) * (-1));
            OooO0oO(j6, oooOO02, i19, arrayList, i4, i3, arrayList2);
        }
        oooOO0.Oooo00O(oooOO02);
    }

    public static byte[] OooO0oo(List list) {
        OooO00o.OooOoo0(list, "protocols");
        OooOO0 oooOO0 = new OooOO0();
        Iterator it = OooO0Oo(list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            oooOO0.Oooo00o(str.length());
            oooOO0.Oooo0o0(str);
        }
        return oooOO0.OooOoOO(oooOO0.f4823OooO0O0);
    }

    public static OooOOO OooOO0(String str) {
        OooO00o.OooOoo0(str, "<this>");
        byte[] bytes = str.getBytes(OooO0O0.f4385OooO00o);
        OooO00o.OooOoOO(bytes, "this as java.lang.String).getBytes(charset)");
        OooOOO oooOOO = new OooOOO(bytes);
        oooOOO.f4827OooO0OO = str;
        return oooOOO;
    }

    public static boolean OooOO0o() {
        return OooO00o.OooOOO0("Dalvik", System.getProperty("java.vm.name"));
    }

    public static OooOOO OooOOO(byte[] bArr) {
        OooOOO oooOOO = OooOOO.f4824OooO0Oo;
        int length = bArr.length;
        OooO0o.OooO0o(bArr.length, 0, length);
        return new OooOOO(OooOOOO.o00O0OO(bArr, 0, length + 0));
    }

    @Override // androidx.lifecycle.o0000O0O
    public androidx.lifecycle.o0000O0 OooO00o(Class cls) {
        switch (this.f4672OooO00o) {
            case 0:
                return new androidx.fragment.app.o0000O0O(true);
            default:
                return new OoooO0.o00oO0o();
        }
    }

    public o000OO00 OooO0o() {
        switch (this.f4672OooO00o) {
            case 3:
                if (!OooOOO0()) {
                    return null;
                }
                return new o000();
            case 4:
                if (!OooOOO0()) {
                    return null;
                }
                return new o000O0o();
            default:
                String property = System.getProperty("java.specification.version", "unknown");
                try {
                    OooO00o.OooOoOO(property, "jvmVersion");
                    if (Integer.parseInt(property) >= 9) {
                        return null;
                    }
                } catch (NumberFormatException unused) {
                }
                try {
                    Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                    Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                    Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                    Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                    Method method = cls.getMethod("put", SSLSocket.class, cls2);
                    Method method2 = cls.getMethod("get", SSLSocket.class);
                    Method method3 = cls.getMethod("remove", SSLSocket.class);
                    OooO00o.OooOoOO(method, "putMethod");
                    OooO00o.OooOoOO(method2, "getMethod");
                    OooO00o.OooOoOO(method3, "removeMethod");
                    OooO00o.OooOoOO(cls3, "clientProviderClass");
                    OooO00o.OooOoOO(cls4, "serverProviderClass");
                    return new o000OO0O(method, method2, method3, cls3, cls4);
                } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                    return null;
                }
        }
    }

    public o0000oo0.o00000 OooOO0O() {
        switch (this.f4672OooO00o) {
            case 13:
                return o0000oo0.o0O0O00.f4794OooO0O0;
            default:
                return o0000oo0.o000000O.f4785OooO0O0;
        }
    }

    public boolean OooOOO0() {
        switch (this.f4672OooO00o) {
            case 3:
                return o000.f4754OooO0o0;
            case 4:
                return o000O0o.f4768OooO0o;
            case o00000.o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return o000Oo0.f4781OooO0o0;
            case 6:
            case 7:
            default:
                o000OO00 o000oo00 = o000OO00.f4772OooO00o;
                if (OooOO0o() && Build.VERSION.SDK_INT >= 29) {
                    return true;
                }
                return false;
            case 8:
                return o000O.f4757OooO0o0;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o00000OO(int i, int i2) {
        this(24);
        this.f4672OooO00o = i;
        switch (i) {
            case 1:
                this(1);
                return;
            case 2:
                this(2);
                return;
            case 3:
                this(3);
                return;
            case 4:
                this(4);
                return;
            case o00000.o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                this(5);
                return;
            case 6:
                this(6);
                return;
            case 7:
                this(7);
                return;
            case 8:
                this(8);
                return;
            case 9:
                this(9);
                return;
            case 10:
                this(10);
                return;
            case 11:
                this(11);
                return;
            case 12:
                this(12);
                return;
            case 13:
                this(13);
                return;
            case 14:
                this(14);
                return;
            case 15:
                this(15);
                return;
            case 16:
                this(16);
                return;
            case 17:
                this(17);
                return;
            case 18:
                this(18);
                return;
            case 19:
                this(19);
                return;
            case 20:
                this(20);
                return;
            case 21:
                this(21);
                return;
            case 22:
                this(22);
                return;
            case 23:
                this(23);
                return;
            case 24:
                return;
            default:
                this(0);
                return;
        }
    }
}