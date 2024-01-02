package com.google.crypto.tink.shaded.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class o0000O00 extends o0000O0 {

    /* renamed from: OooO0OO  reason: collision with root package name */
    public static final Class f3668OooO0OO = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX WARN: Multi-variable type inference failed */
    public static List OooO0Oo(int i, long j, Object obj) {
        o000000O OooO0OO2;
        o0000Ooo o0000ooo;
        List list = (List) o00O0OO0.OooOOO(j, obj);
        if (list.isEmpty()) {
            if (list instanceof o0000) {
                list = new o0000Ooo(i);
            } else if ((list instanceof o000O) && (list instanceof o000000O)) {
                OooO0OO2 = ((o000000O) list).OooO0OO(i);
                list = OooO0OO2;
            } else {
                list = new ArrayList(i);
            }
            o00O0OO0.OooOo(j, obj, list);
        } else {
            if (f3668OooO0OO.isAssignableFrom(list.getClass())) {
                ArrayList arrayList = new ArrayList(list.size() + i);
                arrayList.addAll(list);
                o0000ooo = arrayList;
            } else if (list instanceof oo00o) {
                o0000Ooo o0000ooo2 = new o0000Ooo(list.size() + i);
                o0000ooo2.addAll((oo00o) list);
                o0000ooo = o0000ooo2;
            } else if ((list instanceof o000O) && (list instanceof o000000O)) {
                o000000O o000000o2 = (o000000O) list;
                if (!((OooO0OO) o000000o2).f3617OooO00o) {
                    OooO0OO2 = o000000o2.OooO0OO(list.size() + i);
                    list = OooO0OO2;
                    o00O0OO0.OooOo(j, obj, list);
                }
            }
            list = o0000ooo;
            o00O0OO0.OooOo(j, obj, list);
        }
        return list;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0000O0
    public final void OooO00o(long j, Object obj) {
        Object unmodifiableList;
        List list = (List) o00O0OO0.OooOOO(j, obj);
        if (list instanceof o0000) {
            unmodifiableList = ((o0000) list).OooO0O0();
        } else {
            if (f3668OooO0OO.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof o000O) && (list instanceof o000000O)) {
                OooO0OO oooO0OO = (OooO0OO) ((o000000O) list);
                if (oooO0OO.f3617OooO00o) {
                    oooO0OO.f3617OooO00o = false;
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        o00O0OO0.OooOo(j, obj, unmodifiableList);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0000O0
    public final void OooO0O0(long j, Object obj, Object obj2) {
        List list = (List) o00O0OO0.OooOOO(j, obj2);
        List OooO0Oo2 = OooO0Oo(list.size(), j, obj);
        int size = OooO0Oo2.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            OooO0Oo2.addAll(list);
        }
        if (size > 0) {
            list = OooO0Oo2;
        }
        o00O0OO0.OooOo(j, obj, list);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0000O0
    public final List OooO0OO(long j, Object obj) {
        return OooO0Oo(10, j, obj);
    }
}