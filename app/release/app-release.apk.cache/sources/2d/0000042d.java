package com.google.crypto.tink.shaded.protobuf;

import java.util.List;

/* loaded from: classes.dex */
public final class o0000oo extends o0000O0 {
    @Override // com.google.crypto.tink.shaded.protobuf.o0000O0
    public final void OooO00o(long j, Object obj) {
        ((OooO0OO) ((o000000O) o00O0OO0.OooOOO(j, obj))).f3617OooO00o = false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0000O0
    public final void OooO0O0(long j, Object obj, Object obj2) {
        o000000O o000000o2 = (o000000O) o00O0OO0.OooOOO(j, obj);
        o000000O o000000o3 = (o000000O) o00O0OO0.OooOOO(j, obj2);
        int size = o000000o2.size();
        int size2 = o000000o3.size();
        if (size > 0 && size2 > 0) {
            if (!((OooO0OO) o000000o2).f3617OooO00o) {
                o000000o2 = o000000o2.OooO0OO(size2 + size);
            }
            o000000o2.addAll(o000000o3);
        }
        if (size > 0) {
            o000000o3 = o000000o2;
        }
        o00O0OO0.OooOo(j, obj, o000000o3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0000O0
    public final List OooO0OO(long j, Object obj) {
        int i;
        o000000O o000000o2 = (o000000O) o00O0OO0.OooOOO(j, obj);
        if (!((OooO0OO) o000000o2).f3617OooO00o) {
            int size = o000000o2.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size * 2;
            }
            o000000O OooO0OO2 = o000000o2.OooO0OO(i);
            o00O0OO0.OooOo(j, obj, OooO0OO2);
            return OooO0OO2;
        }
        return o000000o2;
    }
}