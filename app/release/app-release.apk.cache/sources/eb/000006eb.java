package okhttp3.internal.publicsuffix;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import o0000.Oooo0;
import o0000.o0OoOo0;
import o0000O00.OooO00o;
import o0000Oo0.OooOOOO;
import o0000oOO.o00000OO;
import o000O000.OooO0o;
import o000O000.OooOo00;
import o000O000.Oooo000;
import o000O000.o0Oo0oo;

/* loaded from: classes.dex */
public final class PublicSuffixDatabase {

    /* renamed from: OooO0o  reason: collision with root package name */
    public static final List f5595OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public static final byte[] f5596OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public static final PublicSuffixDatabase f5597OooO0oO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final AtomicBoolean f5598OooO00o = new AtomicBoolean(false);

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final CountDownLatch f5599OooO0O0 = new CountDownLatch(1);

    /* renamed from: OooO0OO  reason: collision with root package name */
    public byte[] f5600OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public byte[] f5601OooO0Oo;

    static {
        new o00000OO(17, 0);
        f5596OooO0o0 = new byte[]{42};
        f5595OooO0o = OooO00o.o0000Oo("*");
        f5597OooO0oO = new PublicSuffixDatabase();
    }

    public static List OooO0OO(String str) {
        boolean z;
        List<Object> o00O0o0O = OooOOOO.o00O0o0O(str, new char[]{'.'});
        if (!o00O0o0O.isEmpty()) {
            if (OooO00o.OooOOO0(o00O0o0O.get(OooO00o.o0O0O00(o00O0o0O)), "")) {
                int size = o00O0o0O.size() - 1;
                if (size < 0) {
                    size = 0;
                }
                if (size >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    o0OoOo0 o0oooo0 = o0OoOo0.f3970OooO00o;
                    if (size != 0) {
                        if (size >= o00O0o0O.size()) {
                            return Oooo0.o00O0o00(o00O0o0O);
                        }
                        if (size == 1) {
                            if (!o00O0o0O.isEmpty()) {
                                return OooO00o.o0000Oo(o00O0o0O.get(0));
                            }
                            throw new NoSuchElementException("List is empty.");
                        }
                        ArrayList arrayList = new ArrayList(size);
                        int i = 0;
                        for (Object obj : o00O0o0O) {
                            arrayList.add(obj);
                            i++;
                            if (i == size) {
                                break;
                            }
                        }
                        int size2 = arrayList.size();
                        if (size2 != 0) {
                            if (size2 != 1) {
                                return arrayList;
                            }
                            return OooO00o.o0000Oo(arrayList.get(0));
                        }
                        return o0oooo0;
                    }
                    return o0oooo0;
                }
                throw new IllegalArgumentException(("Requested element count " + size + " is less than zero.").toString());
            }
            return o00O0o0O;
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
        if (r1 == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (r1 != false) goto L117;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String OooO00o(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.OooO00o(java.lang.String):java.lang.String");
    }

    public final void OooO0O0() {
        try {
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream != null) {
                Logger logger = Oooo000.f4840OooO00o;
                o000O000.o0OoOo0 o0oooo0 = new o000O000.o0OoOo0(new OooOo00(new OooO0o(resourceAsStream, new o0Oo0oo())));
                long OooOo0o2 = o0oooo0.OooOo0o();
                o0oooo0.OooO0oo(OooOo0o2);
                byte[] OooOoOO2 = o0oooo0.f4861OooO0O0.OooOoOO(OooOo0o2);
                long OooOo0o3 = o0oooo0.OooOo0o();
                o0oooo0.OooO0oo(OooOo0o3);
                byte[] OooOoOO3 = o0oooo0.f4861OooO0O0.OooOoOO(OooOo0o3);
                OooO00o.Oooo00o(o0oooo0, null);
                synchronized (this) {
                    this.f5600OooO0OO = OooOoOO2;
                    this.f5601OooO0Oo = OooOoOO3;
                }
            }
        } finally {
            this.f5599OooO0O0.countDown();
        }
    }
}