package o0000oo0;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import o0000O00.OooO00o;
import o0000Oo0.OooO0O0;
import o0000oOo.o000O0o;
import o0000oOo.o000OO00;

/* loaded from: classes.dex */
public class o0OO00O implements o00000O {

    /* renamed from: OooO0o  reason: collision with root package name */
    public static final o0Oo0oo f4795OooO0o = new o0Oo0oo();

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Class f4796OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final Method f4797OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final Method f4798OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final Method f4799OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final Method f4800OooO0o0;

    public o0OO00O(Class cls) {
        this.f4796OooO00o = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        OooO00o.OooOoOO(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f4797OooO0O0 = declaredMethod;
        this.f4798OooO0OO = cls.getMethod("setHostname", String.class);
        this.f4799OooO0Oo = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f4800OooO0o0 = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // o0000oo0.o00000O
    public final boolean OooO00o(SSLSocket sSLSocket) {
        return this.f4796OooO00o.isInstance(sSLSocket);
    }

    @Override // o0000oo0.o00000O
    public final String OooO0O0(SSLSocket sSLSocket) {
        if (!this.f4796OooO00o.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f4799OooO0Oo.invoke(sSLSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            return new String(bArr, OooO0O0.f4385OooO00o);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof NullPointerException) && OooO00o.OooOOO0(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e2);
        }
    }

    @Override // o0000oo0.o00000O
    public final boolean OooO0OO() {
        return o000O0o.f4769OooO0o0.OooOOO0();
    }

    @Override // o0000oo0.o00000O
    public final void OooO0Oo(SSLSocket sSLSocket, String str, List list) {
        OooO00o.OooOoo0(list, "protocols");
        if (this.f4796OooO00o.isInstance(sSLSocket)) {
            try {
                this.f4797OooO0O0.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f4798OooO0OO.invoke(sSLSocket, str);
                }
                Method method = this.f4800OooO0o0;
                o000OO00 o000oo00 = o000OO00.f4772OooO00o;
                method.invoke(sSLSocket, o0000oOO.o00000OO.OooO0oo(list));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }
}