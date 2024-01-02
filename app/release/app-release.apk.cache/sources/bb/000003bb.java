package androidx.savedstate;

import OoooOOO.o0O;
import OoooOOO.o0OO000o;
import OoooOOO.oo0ooO;
import android.os.Bundle;
import androidx.lifecycle.OooOo;
import androidx.lifecycle.SavedStateHandleController;
import androidx.lifecycle.o0000O;
import androidx.lifecycle.o0000O0;
import androidx.lifecycle.o000OO;
import androidx.lifecycle.o00O0O;
import androidx.lifecycle.o00Ooo;
import androidx.lifecycle.o00oO0o;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class Recreator implements o00O0O {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final oo0ooO f3229OooO00o;

    public Recreator(oo0ooO oo0ooo) {
        OooO00o.OooOoo0(oo0ooo, "owner");
        this.f3229OooO00o = oo0ooo;
    }

    @Override // androidx.lifecycle.o00O0O
    public final void OooO0O0(o00Ooo o00ooo2, OooOo oooOo) {
        Object obj;
        boolean z;
        if (oooOo == OooOo.ON_CREATE) {
            o00ooo2.OooO0oO().OooO0O0(this);
            Bundle OooO00o2 = this.f3229OooO00o.OooO0O0().OooO00o("androidx.savedstate.Restarter");
            if (OooO00o2 == null) {
                return;
            }
            ArrayList<String> stringArrayList = OooO00o2.getStringArrayList("classes_to_restore");
            if (stringArrayList != null) {
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(o0O.class);
                        OooO00o.OooOoOO(asSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(new Object[0]);
                                OooO00o.OooOoOO(newInstance, "{\n                constr…wInstance()\n            }");
                                o0O o0o = (o0O) newInstance;
                                oo0ooO oo0ooo = this.f3229OooO00o;
                                OooO00o.OooOoo0(oo0ooo, "owner");
                                if (oo0ooo instanceof o0000O) {
                                    o000OO OooO0OO2 = ((o0000O) oo0ooo).OooO0OO();
                                    o0OO000o OooO0O02 = oo0ooo.OooO0O0();
                                    OooO0OO2.getClass();
                                    Iterator it = new HashSet(OooO0OO2.f3089OooO00o.keySet()).iterator();
                                    while (it.hasNext()) {
                                        String str2 = (String) it.next();
                                        OooO00o.OooOoo0(str2, "key");
                                        o0000O0 o0000o02 = (o0000O0) OooO0OO2.f3089OooO00o.get(str2);
                                        OooO00o.OooOo(o0000o02);
                                        o00oO0o OooO0oO2 = oo0ooo.OooO0oO();
                                        OooO00o.OooOoo0(OooO0O02, "registry");
                                        OooO00o.OooOoo0(OooO0oO2, "lifecycle");
                                        HashMap hashMap = o0000o02.f3080OooO00o;
                                        if (hashMap == null) {
                                            obj = null;
                                        } else {
                                            synchronized (hashMap) {
                                                obj = o0000o02.f3080OooO00o.get("androidx.lifecycle.savedstate.vm.tag");
                                            }
                                        }
                                        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
                                        if (savedStateHandleController != null && !(z = savedStateHandleController.f3065OooO00o)) {
                                            if (!(!z)) {
                                                throw new IllegalStateException("Already attached to lifecycleOwner".toString());
                                            }
                                            savedStateHandleController.f3065OooO00o = true;
                                            OooO0oO2.OooO00o(savedStateHandleController);
                                            throw null;
                                        }
                                    }
                                    if (!new HashSet(OooO0OO2.f3089OooO00o.keySet()).isEmpty()) {
                                        OooO0O02.OooO0Oo();
                                    }
                                } else {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
                                }
                            } catch (Exception e) {
                                throw new RuntimeException("Failed to instantiate " + str, e);
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException(OooO0O0.OooO00o.OooO0Oo("Class ", str, " wasn't found"), e3);
                    }
                }
                return;
            }
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}