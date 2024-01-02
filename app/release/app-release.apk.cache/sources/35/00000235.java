package OooooOo;

import OooO0O0.OooO00o;
import Oooo000.o000OOo;
import android.view.View;
import java.lang.reflect.Modifier;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class oO00OO0O implements o000OOo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f1826OooO00o = 1;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final boolean f1827OooO0O0 = true;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final Object f1828OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final Object f1829OooO0Oo;

    public oO00OO0O(Map map, List list) {
        this.f1828OooO0OO = map;
        this.f1829OooO0Oo = list;
    }

    public static String OooO00o(Class cls) {
        String name;
        String str;
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            name = cls.getName();
            str = "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ";
        } else if (!Modifier.isAbstract(modifiers)) {
            return null;
        } else {
            name = cls.getName();
            str = "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ";
        }
        return str.concat(name);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.gson.internal.o000oOoO OooO0O0(o00000o0.o00oO0o r9) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OooooOo.oO00OO0O.OooO0O0(o00000o0.o00oO0o):com.google.gson.internal.o000oOoO");
    }

    @Override // Oooo000.o000OOo
    public final boolean OooO0o(View view) {
        OooO00o.OooO0oO(this.f1828OooO0OO);
        throw null;
    }

    public final String toString() {
        switch (this.f1826OooO00o) {
            case 1:
                return ((Map) this.f1828OooO0OO).toString();
            default:
                return super.toString();
        }
    }
}