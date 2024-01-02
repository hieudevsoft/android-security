package o0000OoO;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import o0000.OooO0OO;
import o0000.o0OoOo0;
import o0000O00.OooO00o;
import o0000Oo.OooOOOO;
import o0000Oo.o00000;
import o0000Oo.o00000O0;
import o0000Oo.o0ooOOo;
import o0000Oo.oo000o;
import o0000Oo0.OooO;
import o0000Oo0.OooO0O0;
import o0000oOO.Oooo000;
import o000O000.OooOOO0;
import o000O000.Oooo0;
import o000O000.o0Oo0oo;

/* loaded from: classes.dex */
public abstract class OooOO0O {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final byte[] f4403OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final oo000o f4404OooO0O0 = OooOOOO.OooOOo0(new String[0]);

    /* renamed from: OooO0OO  reason: collision with root package name */
    public static final o00000O0 f4405OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public static final Oooo0 f4406OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public static final OooO f4407OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public static final TimeZone f4408OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public static final String f4409OooO0oO;

    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b9, code lost:
        continue;
     */
    static {
        /*
            Method dump skipped, instructions count: 579
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0000OoO.OooOO0O.<clinit>():void");
    }

    public static final boolean OooO(String[] strArr, String[] strArr2, Comparator comparator) {
        boolean z;
        boolean z2;
        OooO00o.OooOoo0(strArr, "<this>");
        if (strArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && strArr2 != null) {
            if (strArr2.length == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                for (String str : strArr) {
                    OooO0OO oooO0OO = new OooO0OO(strArr2);
                    while (oooO0OO.hasNext()) {
                        if (comparator.compare(str, (String) oooO0OO.next()) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean OooO00o(o0ooOOo o0ooooo, o0ooOOo o0ooooo2) {
        OooO00o.OooOoo0(o0ooooo, "<this>");
        OooO00o.OooOoo0(o0ooooo2, "other");
        return OooO00o.OooOOO0(o0ooooo.f4348OooO0Oo, o0ooooo2.f4348OooO0Oo) && o0ooooo.f4350OooO0o0 == o0ooooo2.f4350OooO0o0 && OooO00o.OooOOO0(o0ooooo.f4345OooO00o, o0ooooo2.f4345OooO00o);
    }

    public static final int OooO0O0(long j, TimeUnit timeUnit) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        boolean z = true;
        if (i >= 0) {
            long millis = timeUnit.toMillis(j);
            if (millis <= 2147483647L) {
                if (millis == 0 && i > 0) {
                    z = false;
                }
                if (z) {
                    return (int) millis;
                }
                throw new IllegalArgumentException("timeout".concat(" too small.").toString());
            }
            throw new IllegalArgumentException("timeout".concat(" too large.").toString());
        }
        throw new IllegalStateException("timeout".concat(" < 0").toString());
    }

    public static final void OooO0OO(Closeable closeable) {
        OooO00o.OooOoo0(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final void OooO0Oo(Socket socket) {
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!OooO00o.OooOOO0(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    public static final int OooO0o(String str, String str2, int i, int i2) {
        OooO00o.OooOoo0(str, "<this>");
        while (i < i2) {
            boolean z = false;
            if (o0000Oo0.OooOOOO.o00O0OOo(str2, str.charAt(i), 0, false, 2) >= 0) {
                z = true;
            }
            if (z) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int OooO0o0(String str, char c, int i, int i2) {
        OooO00o.OooOoo0(str, "<this>");
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final boolean OooO0oO(o000O000.o0ooOOo o0ooooo, TimeUnit timeUnit) {
        OooO00o.OooOoo0(o0ooooo, "<this>");
        OooO00o.OooOoo0(timeUnit, "timeUnit");
        try {
            return OooOo00(o0ooooo, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String OooO0oo(String str, Object... objArr) {
        OooO00o.OooOoo0(str, "format");
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        OooO00o.OooOoOO(format, "format(locale, format, *args)");
        return format;
    }

    public static final long OooOO0(o00000 o00000Var) {
        String OooO0o2 = o00000Var.f4242OooO0o.OooO0o("Content-Length");
        if (OooO0o2 != null) {
            try {
                return Long.parseLong(OooO0o2);
            } catch (NumberFormatException unused) {
            }
        }
        return -1L;
    }

    public static final List OooOO0O(Object... objArr) {
        List list;
        OooO00o.OooOoo0(objArr, "elements");
        Object[] objArr2 = (Object[]) objArr.clone();
        Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
        OooO00o.OooOoo0(copyOf, "elements");
        if (copyOf.length > 0) {
            list = Arrays.asList(copyOf);
            OooO00o.OooOoOO(list, "asList(this)");
        } else {
            list = o0OoOo0.f3970OooO00o;
        }
        List unmodifiableList = Collections.unmodifiableList(list);
        OooO00o.OooOoOO(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int OooOO0o(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (OooO00o.Oooo0O0(charAt, 31) <= 0 || OooO00o.Oooo0O0(charAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int OooOOO(String str, int i, int i2) {
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char charAt = str.charAt(i3);
                boolean z = false;
                if ((((charAt == '\t' || charAt == '\n') || charAt == '\f') || charAt == '\r') || charAt == ' ') {
                    z = true;
                }
                if (!z) {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static final int OooOOO0(String str, int i, int i2) {
        while (i < i2) {
            char charAt = str.charAt(i);
            boolean z = true;
            if (!(((charAt == '\t' || charAt == '\n') || charAt == '\f') || charAt == '\r') && charAt != ' ') {
                z = false;
            }
            if (!z) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final String[] OooOOOO(String[] strArr, String[] strArr2, Comparator comparator) {
        OooO00o.OooOoo0(strArr2, "other");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean OooOOOo(String str) {
        OooO00o.OooOoo0(str, "name");
        return o0000Oo0.OooOOOO.oo0o0O0(str, "Authorization") || o0000Oo0.OooOOOO.oo0o0O0(str, "Cookie") || o0000Oo0.OooOOOO.oo0o0O0(str, "Proxy-Authorization") || o0000Oo0.OooOOOO.oo0o0O0(str, "Set-Cookie");
    }

    public static final Charset OooOOo(OooOOO0 oooOOO0, Charset charset) {
        Charset charset2;
        String str;
        Charset charset3;
        OooO00o.OooOoo0(oooOOO0, "<this>");
        OooO00o.OooOoo0(charset, "default");
        int OooO0Oo2 = oooOOO0.OooO0Oo(f4406OooO0Oo);
        if (OooO0Oo2 != -1) {
            if (OooO0Oo2 != 0) {
                if (OooO0Oo2 != 1) {
                    if (OooO0Oo2 != 2) {
                        if (OooO0Oo2 != 3) {
                            if (OooO0Oo2 == 4) {
                                Charset charset4 = OooO0O0.f4385OooO00o;
                                charset3 = OooO0O0.f4386OooO0O0;
                                if (charset3 == null) {
                                    charset3 = Charset.forName("UTF-32LE");
                                    OooO00o.OooOoOO(charset3, "forName(\"UTF-32LE\")");
                                    OooO0O0.f4386OooO0O0 = charset3;
                                }
                            } else {
                                throw new AssertionError();
                            }
                        } else {
                            Charset charset5 = OooO0O0.f4385OooO00o;
                            charset3 = OooO0O0.f4387OooO0OO;
                            if (charset3 == null) {
                                charset3 = Charset.forName("UTF-32BE");
                                OooO00o.OooOoOO(charset3, "forName(\"UTF-32BE\")");
                                OooO0O0.f4387OooO0OO = charset3;
                            }
                        }
                        return charset3;
                    }
                    charset2 = StandardCharsets.UTF_16LE;
                    str = "UTF_16LE";
                } else {
                    charset2 = StandardCharsets.UTF_16BE;
                    str = "UTF_16BE";
                }
            } else {
                charset2 = StandardCharsets.UTF_8;
                str = "UTF_8";
            }
            OooO00o.OooOoOO(charset2, str);
            return charset2;
        }
        return charset;
    }

    public static final int OooOOo0(char c) {
        boolean z = true;
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        char c2 = 'a';
        if (!('a' <= c && c < 'g')) {
            c2 = 'A';
            if ('A' > c || c >= 'G') {
                z = false;
            }
            if (!z) {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    public static final int OooOOoo(OooOOO0 oooOOO0) {
        OooO00o.OooOoo0(oooOOO0, "<this>");
        return (oooOOO0.OooOo0O() & 255) | ((oooOOO0.OooOo0O() & 255) << 16) | ((oooOOO0.OooOo0O() & 255) << 8);
    }

    public static final int OooOo(String str, int i) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public static final oo000o OooOo0(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Oooo000 oooo000 = (Oooo000) it.next();
            String OooOO02 = oooo000.f4613OooO00o.OooOO0();
            String OooOO03 = oooo000.f4614OooO0O0.OooOO0();
            arrayList.add(OooOO02);
            arrayList.add(o0000Oo0.OooOOOO.o00O0oOo(OooOO03).toString());
        }
        return new oo000o((String[]) arrayList.toArray(new String[0]));
    }

    public static final boolean OooOo00(o000O000.o0ooOOo o0ooooo, int i, TimeUnit timeUnit) {
        long j;
        OooO00o.OooOoo0(o0ooooo, "<this>");
        OooO00o.OooOoo0(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        if (o0ooooo.OooO00o().OooO0o0()) {
            j = o0ooooo.OooO00o().OooO0OO() - nanoTime;
        } else {
            j = Long.MAX_VALUE;
        }
        o0ooooo.OooO00o().OooO0Oo(Math.min(j, timeUnit.toNanos(i)) + nanoTime);
        try {
            o000O000.OooOO0 oooOO0 = new o000O000.OooOO0();
            while (o0ooooo.OooO0o0(oooOO0, 8192L) != -1) {
                oooOO0.OooOOO(oooOO0.f4823OooO0O0);
            }
            int i2 = (j > Long.MAX_VALUE ? 1 : (j == Long.MAX_VALUE ? 0 : -1));
            o0Oo0oo OooO00o2 = o0ooooo.OooO00o();
            if (i2 == 0) {
                OooO00o2.OooO00o();
            } else {
                OooO00o2.OooO0Oo(nanoTime + j);
            }
            return true;
        } catch (InterruptedIOException unused) {
            int i3 = (j > Long.MAX_VALUE ? 1 : (j == Long.MAX_VALUE ? 0 : -1));
            o0Oo0oo OooO00o3 = o0ooooo.OooO00o();
            if (i3 == 0) {
                OooO00o3.OooO00o();
            } else {
                OooO00o3.OooO0Oo(nanoTime + j);
            }
            return false;
        } catch (Throwable th) {
            int i4 = (j > Long.MAX_VALUE ? 1 : (j == Long.MAX_VALUE ? 0 : -1));
            o0Oo0oo OooO00o4 = o0ooooo.OooO00o();
            if (i4 == 0) {
                OooO00o4.OooO00o();
            } else {
                OooO00o4.OooO0Oo(nanoTime + j);
            }
            throw th;
        }
    }

    public static final String OooOo0O(o0ooOOo o0ooooo, boolean z) {
        OooO00o.OooOoo0(o0ooooo, "<this>");
        String str = o0ooooo.f4348OooO0Oo;
        if (o0000Oo0.OooOOOO.o00O0O0o(str, ":")) {
            str = "[" + str + ']';
        }
        int i = o0ooooo.f4350OooO0o0;
        if (!z) {
            char[] cArr = o0ooOOo.f4343OooOO0;
            if (i == OooOOOO.OooO0oO(o0ooooo.f4345OooO00o)) {
                return str;
            }
        }
        return str + ':' + i;
    }

    public static final List OooOo0o(List list) {
        OooO00o.OooOoo0(list, "<this>");
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        OooO00o.OooOoOO(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final void OooOoO(IOException iOException, List list) {
        OooO00o.OooOoo0(iOException, "<this>");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            OooO00o.OooO(iOException, (Exception) it.next());
        }
    }

    public static final String OooOoO0(String str, int i, int i2) {
        int OooOOO0 = OooOOO0(str, i, i2);
        String substring = str.substring(OooOOO0, OooOOO(str, OooOOO0, i2));
        OooO00o.OooOoOO(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}