package OoooO0O;

import OooO0O0.OooO0O0;
import com.google.gson.internal.o000oOoO;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import o00000Oo.OooO0o;

/* loaded from: classes.dex */
public final class o0000oo implements o000oOoO {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Constructor f1565OooO00o;

    public o0000oo(Constructor constructor) {
        this.f1565OooO00o = constructor;
    }

    @Override // com.google.gson.internal.o000oOoO
    public final Object OooO0O0() {
        Constructor constructor = this.f1565OooO00o;
        try {
            return constructor.newInstance(new Object[0]);
        } catch (IllegalAccessException e) {
            OooO0O0 oooO0O0 = OooO0o.f4064OooO00o;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Failed to invoke constructor '" + OooO0o.OooO0O0(constructor) + "' with no args", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("Failed to invoke constructor '" + OooO0o.OooO0O0(constructor) + "' with no args", e3.getCause());
        }
    }
}