package o00000o0;

import com.google.gson.internal.OooO0o;
import java.lang.reflect.Type;
import java.util.Objects;

/* loaded from: classes.dex */
public class o00oO0o<T> {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Class f4065OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final Type f4066OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final int f4067OooO0OO;

    public o00oO0o(Type type) {
        Objects.requireNonNull(type);
        Type OooO0OO2 = OooO0o.OooO0OO(type);
        this.f4066OooO0O0 = OooO0OO2;
        this.f4065OooO00o = OooO0o.OooOO0o(OooO0OO2);
        this.f4067OooO0OO = OooO0OO2.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o00oO0o) {
            if (OooO0o.OooOO0(this.f4066OooO0O0, ((o00oO0o) obj).f4066OooO0O0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4067OooO0OO;
    }

    public final String toString() {
        return OooO0o.OooOo0O(this.f4066OooO0O0);
    }
}