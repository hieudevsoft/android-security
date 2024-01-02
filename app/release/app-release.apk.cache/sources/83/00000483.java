package com.google.gson.internal.bind;

import OooooOo.oO00OO0O;
import com.google.gson.OooOOOO;
import com.google.gson.internal.o000oOoO;
import com.google.gson.o0OOO0o;
import com.google.gson.o0Oo0oo;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import o00000o0.o00oO0o;
import o0000Ooo.OooOOO;
import o0000Ooo.OooOOO0;

/* loaded from: classes.dex */
public final class CollectionTypeAdapterFactory implements o0Oo0oo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final oO00OO0O f3828OooO00o;

    /* loaded from: classes.dex */
    public static final class Adapter<E> extends o0OOO0o {

        /* renamed from: OooO00o  reason: collision with root package name */
        public final o0OOO0o f3829OooO00o;

        /* renamed from: OooO0O0  reason: collision with root package name */
        public final o000oOoO f3830OooO0O0;

        public Adapter(OooOOOO oooOOOO, Type type, o0OOO0o o0ooo0o, o000oOoO o000oooo) {
            this.f3829OooO00o = new TypeAdapterRuntimeTypeWrapper(oooOOOO, o0ooo0o, type);
            this.f3830OooO0O0 = o000oooo;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.o0OOO0o
        public final Object OooO0O0(OooOOO0 oooOOO0) {
            if (oooOOO0.OoooO0O() == 9) {
                oooOOO0.Oooo0oo();
                return null;
            }
            Collection collection = (Collection) this.f3830OooO0O0.OooO0O0();
            oooOOO0.OooOo();
            while (oooOOO0.Oooo000()) {
                collection.add(this.f3829OooO00o.OooO0O0(oooOOO0));
            }
            oooOOO0.OooOoo0();
            return collection;
        }

        @Override // com.google.gson.o0OOO0o
        public final void OooO0OO(OooOOO oooOOO, Object obj) {
            Collection<E> collection = (Collection) obj;
            if (collection == null) {
                oooOOO.Oooo000();
                return;
            }
            oooOOO.OooOoO0();
            for (E e : collection) {
                this.f3829OooO00o.OooO0OO(oooOOO, e);
            }
            oooOOO.OooOoo0();
        }
    }

    public CollectionTypeAdapterFactory(oO00OO0O oo00oo0o) {
        this.f3828OooO00o = oo00oo0o;
    }

    @Override // com.google.gson.o0Oo0oo
    public final o0OOO0o OooO00o(OooOOOO oooOOOO, o00oO0o o00oo0o) {
        Type type;
        Type type2 = o00oo0o.f4066OooO0O0;
        Class cls = o00oo0o.f4065OooO00o;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        Type OooOOO0 = com.google.gson.internal.OooO0o.OooOOO0(type2, cls, Collection.class);
        if (OooOOO0 instanceof ParameterizedType) {
            type = ((ParameterizedType) OooOOO0).getActualTypeArguments()[0];
        } else {
            type = Object.class;
        }
        return new Adapter(oooOOOO, type, oooOOOO.OooO0OO(new o00oO0o(type)), this.f3828OooO00o.OooO0O0(o00oo0o));
    }
}