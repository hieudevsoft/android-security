package o0OO00O;

import OooO0oO.o000O0O0;
import androidx.appcompat.widget.o0O0O00;
import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;
import o00000.o0000O0O;
import o00000.o0000OO0;

/* loaded from: classes.dex */
public abstract class OooOo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final Logger f5310OooO00o = Logger.getLogger(OooOo.class.getName());

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final ConcurrentHashMap f5311OooO0O0 = new ConcurrentHashMap();

    /* renamed from: OooO0OO  reason: collision with root package name */
    public static final ConcurrentHashMap f5312OooO0OO = new ConcurrentHashMap();

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public static final ConcurrentHashMap f5313OooO0Oo = new ConcurrentHashMap();

    /* renamed from: OooO0o0  reason: collision with root package name */
    public static final ConcurrentHashMap f5314OooO0o0;

    static {
        new ConcurrentHashMap();
        f5314OooO0o0 = new ConcurrentHashMap();
    }

    public static synchronized void OooO00o(String str, Class cls, boolean z) {
        synchronized (OooOo.class) {
            ConcurrentHashMap concurrentHashMap = f5311OooO0O0;
            if (!concurrentHashMap.containsKey(str)) {
                return;
            }
            OooOo00 oooOo00 = (OooOo00) concurrentHashMap.get(str);
            if (oooOo00.f5315OooO00o.getClass().equals(cls)) {
                if (z && !((Boolean) f5313OooO0Oo.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                }
                return;
            }
            Logger logger = f5310OooO00o;
            logger.warning("Attempted overwrite of a registered key manager for key type " + str);
            throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, oooOo00.f5315OooO00o.getClass().getName(), cls.getName()));
        }
    }

    public static synchronized OooOo00 OooO0O0(String str) {
        OooOo00 oooOo00;
        synchronized (OooOo.class) {
            ConcurrentHashMap concurrentHashMap = f5311OooO0O0;
            if (!concurrentHashMap.containsKey(str)) {
                throw new GeneralSecurityException("No key manager found for key type " + str);
            }
            oooOo00 = (OooOo00) concurrentHashMap.get(str);
        }
        return oooOo00;
    }

    public static Object OooO0OO(String str, com.google.crypto.tink.shaded.protobuf.OooOo oooOo, Class cls) {
        OooOo00 OooO0O02 = OooO0O0(str);
        boolean contains = ((Map) OooO0O02.f5315OooO00o.f346OooO0O0).keySet().contains(cls);
        o000O0O0 o000o0o0 = OooO0O02.f5315OooO00o;
        if (contains) {
            try {
                return new o0O0O00(o000o0o0, cls).OooO0OO(oooOo);
            } catch (IllegalArgumentException e) {
                throw new GeneralSecurityException("Primitive type not supported", e);
            }
        }
        StringBuilder sb = new StringBuilder("Primitive type ");
        sb.append(cls.getName());
        sb.append(" not supported by key manager of type ");
        sb.append(o000o0o0.getClass());
        sb.append(", supported primitives: ");
        Set<Class> keySet = ((Map) o000o0o0.f346OooO0O0).keySet();
        StringBuilder sb2 = new StringBuilder();
        boolean z = true;
        for (Class cls2 : keySet) {
            if (!z) {
                sb2.append(", ");
            }
            sb2.append(cls2.getCanonicalName());
            z = false;
        }
        sb.append(sb2.toString());
        throw new GeneralSecurityException(sb.toString());
    }

    public static synchronized o0000O0O OooO0Oo(o0000OO0 o0000oo02) {
        o0000O0O OooO0o02;
        synchronized (OooOo.class) {
            o000O0O0 o000o0o0 = OooO0O0(o0000oo02.OooOo0()).f5315OooO00o;
            o0O0O00 o0o0o00 = new o0O0O00(o000o0o0, (Class) o000o0o0.f347OooO0OO);
            if (((Boolean) f5313OooO0Oo.get(o0000oo02.OooOo0())).booleanValue()) {
                OooO0o02 = o0o0o00.OooO0o0(o0000oo02.OooOo0O());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + o0000oo02.OooOo0());
            }
        }
        return OooO0o02;
    }

    public static synchronized void OooO0o(OooOOOO oooOOOO) {
        synchronized (OooOo.class) {
            Class OooO0OO2 = oooOOOO.OooO0OO();
            ConcurrentHashMap concurrentHashMap = f5314OooO0o0;
            if (concurrentHashMap.containsKey(OooO0OO2)) {
                OooOOOO oooOOOO2 = (OooOOOO) concurrentHashMap.get(OooO0OO2);
                if (!oooOOOO.getClass().equals(oooOOOO2.getClass())) {
                    Logger logger = f5310OooO00o;
                    logger.warning("Attempted overwrite of a registered SetWrapper for type " + OooO0OO2);
                    throw new GeneralSecurityException(String.format("SetWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", OooO0OO2.getName(), oooOOOO2.getClass().getName(), oooOOOO.getClass().getName()));
                }
            }
            concurrentHashMap.put(OooO0OO2, oooOOOO);
        }
    }

    public static synchronized void OooO0o0(oo0o0Oo.OooOO0 oooOO0, boolean z) {
        synchronized (OooOo.class) {
            try {
                String OooOOO0 = oooOO0.OooOOO0();
                OooO00o(OooOOO0, oo0o0Oo.OooOO0.class, z);
                ConcurrentHashMap concurrentHashMap = f5311OooO0O0;
                if (!concurrentHashMap.containsKey(OooOOO0)) {
                    concurrentHashMap.put(OooOOO0, new OooOo00(oooOO0));
                    f5312OooO0OO.put(OooOOO0, new OooO0OO(4, oooOO0));
                }
                f5313OooO0Oo.put(OooOOO0, Boolean.valueOf(z));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}