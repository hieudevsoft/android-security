package com.google.gson.internal;

import com.google.crypto.tink.shaded.protobuf.o00O000;
import com.google.crypto.tink.shaded.protobuf.o00O000o;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class OooOo00 extends AbstractSet {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f3805OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ AbstractMap f3806OooO0O0;

    public /* synthetic */ OooOo00(AbstractMap abstractMap, int i) {
        this.f3805OooO00o = i;
        this.f3806OooO0O0 = abstractMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f3805OooO00o) {
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    ((o00O000) this.f3806OooO0O0).OooO0Oo((Comparable) entry.getKey(), entry.getValue());
                    return true;
                }
                return false;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.f3805OooO00o;
        AbstractMap abstractMap = this.f3806OooO0O0;
        switch (i) {
            case 0:
                ((Oooo0) abstractMap).clear();
                return;
            case 1:
                ((Oooo0) abstractMap).clear();
                return;
            default:
                ((o00O000) abstractMap).OooO0O0();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.f3805OooO00o;
        AbstractMap abstractMap = this.f3806OooO0O0;
        switch (i) {
            case 0:
                if ((obj instanceof Map.Entry) && ((Oooo0) abstractMap).OooO0O0((Map.Entry) obj) != null) {
                    return true;
                }
                return false;
            case 1:
                return ((Oooo0) abstractMap).containsKey(obj);
            default:
                Map.Entry entry = (Map.Entry) obj;
                Object OooO0OO2 = ((o00O000) abstractMap).OooO0OO(entry.getKey());
                Object value = entry.getValue();
                if (OooO0OO2 == value) {
                    return true;
                }
                if (OooO0OO2 != null && OooO0OO2.equals(value)) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.f3805OooO00o) {
            case 0:
                return new OooOOOO(this);
            case 1:
                return new OooOOOO(this, 0);
            default:
                return new o00O000o((o00O000) this.f3806OooO0O0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean remove(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f3805OooO00o
            r1 = 1
            java.util.AbstractMap r2 = r4.f3806OooO0O0
            r3 = 0
            switch(r0) {
                case 0: goto L21;
                case 1: goto La;
                default: goto L9;
            }
        L9:
            goto L36
        La:
            com.google.gson.internal.Oooo0 r2 = (com.google.gson.internal.Oooo0) r2
            r2.getClass()
            if (r5 == 0) goto L16
            com.google.gson.internal.Oooo000 r5 = r2.OooO00o(r5, r3)     // Catch: java.lang.ClassCastException -> L16
            goto L17
        L16:
            r5 = 0
        L17:
            if (r5 == 0) goto L1c
            r2.OooO0Oo(r5, r1)
        L1c:
            if (r5 == 0) goto L1f
            goto L20
        L1f:
            r1 = r3
        L20:
            return r1
        L21:
            boolean r0 = r5 instanceof java.util.Map.Entry
            if (r0 != 0) goto L26
            goto L30
        L26:
            com.google.gson.internal.Oooo0 r2 = (com.google.gson.internal.Oooo0) r2
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            com.google.gson.internal.Oooo000 r5 = r2.OooO0O0(r5)
            if (r5 != 0) goto L32
        L30:
            r1 = r3
            goto L35
        L32:
            r2.OooO0Oo(r5, r1)
        L35:
            return r1
        L36:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            boolean r0 = r4.contains(r5)
            if (r0 == 0) goto L48
            com.google.crypto.tink.shaded.protobuf.o00O000 r2 = (com.google.crypto.tink.shaded.protobuf.o00O000) r2
            java.lang.Object r5 = r5.getKey()
            r2.OooO0o0(r5)
            goto L49
        L48:
            r1 = r3
        L49:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.OooOo00.remove(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.f3805OooO00o;
        AbstractMap abstractMap = this.f3806OooO0O0;
        switch (i) {
            case 0:
                return ((Oooo0) abstractMap).f3811OooO0Oo;
            case 1:
                return ((Oooo0) abstractMap).f3811OooO0Oo;
            default:
                return ((o00O000) abstractMap).OooO0oO();
        }
    }
}