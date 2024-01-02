package OooO0oO;

import OooOO0.OooO0O0;
import OooOO0.OooOOOO;
import OooOoO.o000oOoO;
import android.content.Context;
import android.view.MenuItem;
import com.google.crypto.tink.shaded.protobuf.OooOo;
import com.google.crypto.tink.shaded.protobuf.o0O0O00;
import java.lang.reflect.Array;
import java.security.GeneralSecurityException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.spec.SecretKeySpec;
import o00000.OooOO0O;
import o00000.o000;
import o00000.o000000;
import o00000.o00000O;
import o00000.o0000O0;
import o00000.o0000Ooo;
import o00000.o00Oo0;
import o00000.o0OO00O;
import o00000.o0ooOOo;
import o00000O0.OooO00o;
import o00000O0.OooO0OO;
import o00000O0.OooOOO;
import o00000O0.OooOo00;
import o00000O0.Oooo0;
import o00000O0.o00O0O;
import o00000O0.o0OoOo0;
import o0OO00O.OooO0o;
import oo0o0Oo.OooO;
import oo0o0Oo.OooOO0;

/* loaded from: classes.dex */
public abstract class o000O0O0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public Object f345OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public Object f346OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public Object f347OooO0OO;

    public o000O0O0(Context context) {
        this.f345OooO00o = context;
    }

    public static boolean OooOO0o(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean OooOOoo(Map map, Collection collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public abstract void OooO(Object obj, Object obj2);

    public abstract void OooO0OO();

    public abstract Object OooO0Oo(int i, int i2);

    public abstract int OooO0o();

    public abstract OooO0O0 OooO0o0();

    public abstract int OooO0oO(Object obj);

    public abstract int OooO0oo(Object obj);

    public abstract void OooOO0(int i);

    public abstract Object OooOO0O(int i, Object obj);

    public final MenuItem OooOOO(MenuItem menuItem) {
        if (menuItem instanceof o000oOoO) {
            o000oOoO o000oooo = (o000oOoO) menuItem;
            if (((OooOOOO) this.f346OooO0O0) == null) {
                this.f346OooO0O0 = new OooOOOO();
            }
            MenuItem menuItem2 = (MenuItem) ((OooOOOO) this.f346OooO0O0).getOrDefault(o000oooo, null);
            if (menuItem2 == null) {
                o00O0O0O o00o0o0o = new o00O0O0O((Context) this.f345OooO00o, o000oooo);
                ((OooOOOO) this.f346OooO0O0).put(o000oooo, o00o0o0o);
                return o00o0o0o;
            }
            return menuItem2;
        }
        return menuItem;
    }

    public abstract String OooOOO0();

    public final Object OooOOOO(com.google.crypto.tink.shaded.protobuf.OooO0O0 oooO0O0, Class cls) {
        OooO0o oooO0o = (OooO0o) ((Map) this.f346OooO0O0).get(cls);
        if (oooO0o != null) {
            switch (((oo0o0Oo.OooO0o) oooO0o).f5628OooO0O0) {
                case 0:
                    OooOO0O oooOO0O = (OooOO0O) oooO0O0;
                    return new OooOo00((Oooo0) new OooOO0(1).OooOOOO(oooOO0O.OooOOoo(), Oooo0.class), (o0OO00O.OooOO0O) new OooOO0(11).OooOOOO(oooOO0O.OooOo00(), o0OO00O.OooOO0O.class), oooOO0O.OooOo00().OooOo0().OooOOo());
                case 1:
                    o00000.OooOOOO oooOOOO = (o00000.OooOOOO) oooO0O0;
                    return new OooO00o(oooOOOO.OooOo0().OooOOo0(), oooOOOO.OooOo00().OooOO0O());
                case 2:
                    o00000.Oooo0 oooo0 = (o00000.Oooo0) oooO0O0;
                    return new o00000O0.OooO0O0(oooo0.OooOo00().OooOOo0(), oooo0.OooOOoo().OooOO0O());
                case 3:
                    return new OooO0OO(((o00Oo0) oooO0O0).OooOOo().OooOO0O());
                case 4:
                    return new o0O0O00.OooO0O0(((o0ooOOo) oooO0O0).OooOOo().OooOO0O());
                case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                    return new OooOOO(0, ((o000000) oooO0O0).OooOOo().OooOO0O());
                case 6:
                    String OooOOo02 = ((o00000.o000O) oooO0O0).OooOOo().OooOOo0();
                    return ((o000000.OooO0o) o0OO00O.OooOO0.OooO00o(OooOOo02)).OooO0O0(OooOOo02);
                case 7:
                    o00000.o00 o00Var = (o00000.o00) oooO0O0;
                    String OooOOo2 = o00Var.OooOOo().OooOOo();
                    return new oo0o0Oo.OooOO0O(o00Var.OooOOo().OooOOo0(), ((o000000.OooO0o) o0OO00O.OooOO0.OooO00o(OooOOo2)).OooO0O0(OooOOo2));
                case 8:
                    return new OooOOO(1, ((o00000.o00O000o) oooO0O0).OooOOo().OooOO0O());
                case 9:
                    return new o00000O0.OooO0o(((o0OO00O) oooO0O0).OooOOo().OooOO0O());
                case 10:
                    o00000.OooO0O0 oooO0O02 = (o00000.OooO0O0) oooO0O0;
                    return new o00O0O(new androidx.activity.result.OooO0o(oooO0O02.OooOOoo().OooOO0O()), oooO0O02.OooOo00().OooOOo0());
                default:
                    o0000Ooo o0000ooo = (o0000Ooo) oooO0O0;
                    o00000O OooOOo03 = o0000ooo.OooOo0().OooOOo0();
                    SecretKeySpec secretKeySpec = new SecretKeySpec(o0000ooo.OooOo00().OooOO0O(), "HMAC");
                    int OooOOo3 = o0000ooo.OooOo0().OooOOo();
                    int ordinal = OooOOo03.ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 3) {
                            if (ordinal == 4) {
                                return new o00O0O(new o0OoOo0("HMACSHA512", secretKeySpec), OooOOo3);
                            }
                            throw new GeneralSecurityException("unknown hash");
                        }
                        return new o00O0O(new o0OoOo0("HMACSHA256", secretKeySpec), OooOOo3);
                    }
                    return new o00O0O(new o0OoOo0("HMACSHA1", secretKeySpec), OooOOo3);
            }
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public abstract OooO OooOOOo();

    public abstract o0O0O00 OooOOo(OooOo oooOo);

    public abstract o0000O0 OooOOo0();

    public abstract void OooOo0(com.google.crypto.tink.shaded.protobuf.OooO0O0 oooO0O0);

    public final Object[] OooOo00(int i, Object[] objArr) {
        int OooO0o2 = OooO0o();
        if (objArr.length < OooO0o2) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), OooO0o2);
        }
        for (int i2 = 0; i2 < OooO0o2; i2++) {
            objArr[i2] = OooO0Oo(i2, i);
        }
        if (objArr.length > OooO0o2) {
            objArr[OooO0o2] = null;
        }
        return objArr;
    }

    public o000O0O0(Class cls, OooO0o... oooO0oArr) {
        Class<Void> cls2;
        this.f345OooO00o = cls;
        HashMap hashMap = new HashMap();
        for (OooO0o oooO0o : oooO0oArr) {
            boolean containsKey = hashMap.containsKey(oooO0o.f5303OooO00o);
            Class cls3 = oooO0o.f5303OooO00o;
            if (containsKey) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls3.getCanonicalName());
            }
            hashMap.put(cls3, oooO0o);
        }
        if (oooO0oArr.length > 0) {
            cls2 = oooO0oArr[0].f5303OooO00o;
        } else {
            cls2 = Void.class;
        }
        this.f347OooO0OO = cls2;
        this.f346OooO0O0 = Collections.unmodifiableMap(hashMap);
    }
}