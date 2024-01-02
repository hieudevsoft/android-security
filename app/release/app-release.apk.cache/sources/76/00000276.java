package androidx.activity.result;

import OooO0Oo.o000O0o;
import OooOO0o.o000oOoO;
import OooOO0o.o00O0O;
import OooOOOO.Oooo000;
import OooOoo.o0ooOOo;
import Oooo0.OooOo00;
import Oooo00o.OooOOOO;
import android.content.ClipDescription;
import android.content.Context;
import android.location.LocationManager;
import android.net.Uri;
import androidx.activity.OooOOO0;
import androidx.lifecycle.o0000O;
import androidx.lifecycle.o0000O0;
import androidx.lifecycle.o0000O0O;
import androidx.lifecycle.o000OO;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import o00000O0.OooOo;
import o00000O0.o00Ooo;
import o0000oOO.o00000OO;
import o0OO00O.OooOOO;

/* loaded from: classes.dex */
public final class OooO0o implements OooOo00, OooOOOO, o000000o.OooO0o {

    /* renamed from: OooO0o0  reason: collision with root package name */
    public static OooO0o f1980OooO0o0;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f1981OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public Object f1982OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public Object f1983OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public Object f1984OooO0Oo;

    public OooO0o(o000oOoO o000oooo, o000oOoO o000oooo2) {
        this.f1981OooO00o = 3;
        this.f1984OooO0Oo = o000oooo;
        this.f1983OooO0OO = o000oooo2;
    }

    public final List OooO(byte[] bArr) {
        List list = (List) ((ConcurrentMap) this.f1982OooO0O0).get(new OooOOO(bArr));
        return list != null ? list : Collections.emptyList();
    }

    @Override // Oooo00o.OooOOOO
    public final ClipDescription OooO00o() {
        return (ClipDescription) this.f1983OooO0OO;
    }

    @Override // Oooo00o.OooOOOO
    public final void OooO0O0() {
    }

    @Override // Oooo00o.OooOOOO
    public final Uri OooO0OO() {
        return (Uri) this.f1984OooO0Oo;
    }

    @Override // Oooo00o.OooOOOO
    public final Object OooO0Oo() {
        return null;
    }

    @Override // o000000o.OooO0o
    public final byte[] OooO0o(int i, byte[] bArr) {
        byte[] o00O0O0;
        if (i <= 16) {
            Cipher cipher = (Cipher) OooOo.f4045OooO0o0.OooO00o("AES/ECB/NoPadding");
            boolean z = true;
            cipher.init(1, (SecretKey) this.f1982OooO0O0);
            int max = Math.max(1, (int) Math.ceil(bArr.length / 16.0d));
            if (max * 16 != bArr.length) {
                z = false;
            }
            if (z) {
                o00O0O0 = o0000O00.OooO00o.o00O0O00((max - 1) * 16, 0, 16, bArr, (byte[]) this.f1983OooO0OO);
            } else {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, (max - 1) * 16, bArr.length);
                if (copyOfRange.length < 16) {
                    byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
                    copyOf[copyOfRange.length] = Byte.MIN_VALUE;
                    o00O0O0 = o0000O00.OooO00o.o00O0O0(copyOf, (byte[]) this.f1984OooO0Oo);
                } else {
                    throw new IllegalArgumentException("x must be smaller than a block.");
                }
            }
            byte[] bArr2 = new byte[16];
            for (int i2 = 0; i2 < max - 1; i2++) {
                bArr2 = cipher.doFinal(o0000O00.OooO00o.o00O0O00(0, i2 * 16, 16, bArr2, bArr));
            }
            return Arrays.copyOf(cipher.doFinal(o0000O00.OooO00o.o00O0O0(o00O0O0, bArr2)), i);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }

    @Override // Oooo00o.OooOOOO
    public final Uri OooO0o0() {
        return (Uri) this.f1982OooO0O0;
    }

    public final o0000O0 OooO0oO(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return OooO0oo(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final o0000O0 OooO0oo(Class cls, String str) {
        o0000O0 OooO00o2;
        o0000O00.OooO00o.OooOoo0(str, "key");
        o000OO o000oo = (o000OO) this.f1982OooO0O0;
        o000oo.getClass();
        o0000O0 o0000o02 = (o0000O0) o000oo.f3089OooO00o.get(str);
        if (cls.isInstance(o0000o02)) {
            o0000O00.OooO00o.OooOoO0(o0000o02, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return o0000o02;
        }
        OoooO00.OooO oooO = new OoooO00.OooO((OoooO00.OooO0OO) this.f1984OooO0Oo);
        oooO.f1553OooO00o.put(o0ooOOo.f1228OooO0oO, str);
        try {
            OooO00o2 = ((o0000O0O) this.f1983OooO0OO).OooO0O0(cls, oooO);
        } catch (AbstractMethodError unused) {
            OooO00o2 = ((o0000O0O) this.f1983OooO0OO).OooO00o(cls);
        }
        o000OO o000oo2 = (o000OO) this.f1982OooO0O0;
        o000oo2.getClass();
        o0000O00.OooO00o.OooOoo0(OooO00o2, "viewModel");
        o0000O0 o0000o03 = (o0000O0) o000oo2.f3089OooO00o.put(str, OooO00o2);
        if (o0000o03 != null) {
            o0000o03.OooO00o();
        }
        return OooO00o2;
    }

    public final boolean OooOO0(int i, OooOOO.OooO oooO, Oooo000 oooo000) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        OooOOOO.OooO0O0 oooO0O0 = (OooOOOO.OooO0O0) this.f1983OooO0OO;
        int[] iArr = oooO.f681o00o0O;
        oooO0O0.f808OooO00o = iArr[0];
        boolean z5 = true;
        oooO0O0.f809OooO0O0 = iArr[1];
        oooO0O0.f810OooO0OO = oooO.OooOOo0();
        ((OooOOOO.OooO0O0) this.f1983OooO0OO).f811OooO0Oo = oooO.OooOO0o();
        OooOOOO.OooO0O0 oooO0O02 = (OooOOOO.OooO0O0) this.f1983OooO0OO;
        oooO0O02.f807OooO = false;
        oooO0O02.f816OooOO0 = i;
        if (oooO0O02.f808OooO00o == 3) {
            z = true;
        } else {
            z = false;
        }
        if (oooO0O02.f809OooO0O0 == 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && oooO.f665OoooOOO > 0.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 && oooO.f665OoooOOO > 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        int[] iArr2 = oooO.f639OooOo00;
        if (z3 && iArr2[0] == 4) {
            oooO0O02.f808OooO00o = 1;
        }
        if (z4 && iArr2[1] == 4) {
            oooO0O02.f809OooO0O0 = 1;
        }
        oooo000.OooO0O0(oooO, oooO0O02);
        oooO.Oooo0oO(((OooOOOO.OooO0O0) this.f1983OooO0OO).f813OooO0o0);
        oooO.Oooo0OO(((OooOOOO.OooO0O0) this.f1983OooO0OO).f812OooO0o);
        Object obj = this.f1983OooO0OO;
        OooOOOO.OooO0O0 oooO0O03 = (OooOOOO.OooO0O0) obj;
        oooO.f648OooOooo = oooO0O03.f815OooO0oo;
        int i2 = oooO0O03.f814OooO0oO;
        oooO.f668OoooOoo = i2;
        if (i2 <= 0) {
            z5 = false;
        }
        oooO.f648OooOooo = z5;
        OooOOOO.OooO0O0 oooO0O04 = (OooOOOO.OooO0O0) obj;
        oooO0O04.f816OooOO0 = 0;
        return oooO0O04.f807OooO;
    }

    public final void OooOO0O(OooOOO.OooOO0 oooOO0, int i, int i2, int i3) {
        int i4 = oooOO0.f669Ooooo00;
        int i5 = oooOO0.f670Ooooo0o;
        oooOO0.f669Ooooo00 = 0;
        oooOO0.f670Ooooo0o = 0;
        oooOO0.Oooo0oO(i2);
        oooOO0.Oooo0OO(i3);
        if (i4 < 0) {
            i4 = 0;
        }
        oooOO0.f669Ooooo00 = i4;
        if (i5 < 0) {
            i5 = 0;
        }
        oooOO0.f670Ooooo0o = i5;
        OooOOO.OooOO0 oooOO02 = (OooOOO.OooOO0) this.f1984OooO0Oo;
        oooOO02.f731o00oO0O = i;
        oooOO02.OoooO00();
    }

    public final void OooOO0o(OooOOO.OooOO0 oooOO0) {
        ((ArrayList) this.f1982OooO0O0).clear();
        int size = oooOO0.f796o00ooo.size();
        for (int i = 0; i < size; i++) {
            OooOOO.OooO oooO = (OooOOO.OooO) oooOO0.f796o00ooo.get(i);
            int[] iArr = oooO.f681o00o0O;
            if (iArr[0] == 3 || iArr[1] == 3) {
                ((ArrayList) this.f1982OooO0O0).add(oooO);
            }
        }
        oooOO0.o00oO0o.f800OooO0O0 = true;
    }

    public final String toString() {
        switch (this.f1981OooO00o) {
            case 3:
                String str = "[ ";
                if (((o00O0O) this.f1982OooO0O0) != null) {
                    for (int i = 0; i < 9; i++) {
                        str = str + ((o00O0O) this.f1982OooO0O0).f615OooO0oo[i] + " ";
                    }
                }
                return str + "] " + ((o00O0O) this.f1982OooO0O0);
            default:
                return super.toString();
        }
    }

    public OooO0o(OooOOO.OooOO0 oooOO0) {
        this.f1981OooO00o = 4;
        this.f1982OooO0O0 = new ArrayList();
        this.f1983OooO0OO = new OooOOOO.OooO0O0();
        this.f1984OooO0Oo = oooOO0;
    }

    public OooO0o(Context context, LocationManager locationManager) {
        this.f1981OooO00o = 2;
        this.f1984OooO0Oo = new o000O0o();
        this.f1982OooO0O0 = context;
        this.f1983OooO0OO = locationManager;
    }

    public OooO0o(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f1981OooO00o = 6;
        this.f1982OooO0O0 = uri;
        this.f1983OooO0OO = clipDescription;
        this.f1984OooO0Oo = uri2;
    }

    public OooO0o(OooOOO0 oooOOO0, String str, OooO0O0.OooO0O0 oooO0O0) {
        this.f1981OooO00o = 0;
        this.f1984OooO0Oo = oooOOO0;
        this.f1982OooO0O0 = str;
        this.f1983OooO0OO = oooO0O0;
    }

    public OooO0o(o000OO o000oo, o0000O0O o0000o0o2, OoooO00.OooO0OO oooO0OO) {
        this.f1981OooO00o = 7;
        o0000O00.OooO00o.OooOoo0(o000oo, "store");
        o0000O00.OooO00o.OooOoo0(o0000o0o2, "factory");
        o0000O00.OooO00o.OooOoo0(oooO0OO, "defaultCreationExtras");
        this.f1982OooO0O0 = o000oo;
        this.f1983OooO0OO = o0000o0o2;
        this.f1984OooO0Oo = oooO0OO;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OooO0o(o000OO o000oo, o00000OO o00000oo2) {
        this(o000oo, o00000oo2, OoooO00.OooO0O0.f1552OooO0O0);
        this.f1981OooO00o = 7;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OooO0o(o000OO o000oo, o00000OO o00000oo2, int i) {
        this(o000oo, o00000oo2);
        this.f1981OooO00o = 7;
        o0000O00.OooO00o.OooOoo0(o000oo, "store");
        o0000O00.OooO00o.OooOoo0(o00000oo2, "factory");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OooO0o(o0000O o0000o2, OoooO00.OooO0o oooO0o) {
        this(o0000o2.OooO0OO(), oooO0o, o0000o2 instanceof androidx.lifecycle.OooOOO0 ? ((androidx.lifecycle.OooOOO0) o0000o2).OooO00o() : OoooO00.OooO0O0.f1552OooO0O0);
        this.f1981OooO00o = 7;
    }

    public OooO0o(Class cls) {
        this.f1981OooO00o = 8;
        this.f1982OooO0O0 = new ConcurrentHashMap();
        this.f1984OooO0Oo = cls;
    }

    public OooO0o(Runnable runnable) {
        this.f1981OooO00o = 5;
        this.f1983OooO0OO = new CopyOnWriteArrayList();
        this.f1984OooO0Oo = new HashMap();
        this.f1982OooO0O0 = runnable;
    }

    public OooO0o(byte[] bArr) {
        this.f1981OooO00o = 9;
        o00Ooo.OooO00o(bArr.length);
        this.f1982OooO0O0 = new SecretKeySpec(bArr, "AES");
        Cipher cipher = (Cipher) OooOo.f4045OooO0o0.OooO00o("AES/ECB/NoPadding");
        cipher.init(1, (SecretKey) this.f1982OooO0O0);
        byte[] OoooOoo2 = o0000O00.OooO00o.OoooOoo(cipher.doFinal(new byte[16]));
        this.f1983OooO0OO = OoooOoo2;
        this.f1984OooO0Oo = o0000O00.OooO00o.OoooOoo(OoooOoo2);
    }
}