package androidx.lifecycle;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class OooO0O0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final int f3050OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final Method f3051OooO0O0;

    public OooO0O0(int i, Method method) {
        this.f3050OooO00o = i;
        this.f3051OooO0O0 = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OooO0O0) {
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return this.f3050OooO00o == oooO0O0.f3050OooO00o && this.f3051OooO0O0.getName().equals(oooO0O0.f3051OooO0O0.getName());
        }
        return false;
    }

    public final int hashCode() {
        return this.f3051OooO0O0.getName().hashCode() + (this.f3050OooO00o * 31);
    }
}