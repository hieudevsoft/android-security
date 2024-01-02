package com.google.gson.internal.sql;

import com.google.gson.OooOOOO;
import com.google.gson.o0OOO0o;
import com.google.gson.o0Oo0oo;
import java.sql.Timestamp;
import java.util.Date;
import o00000o0.o00oO0o;
import o0000Ooo.OooOOO;
import o0000Ooo.OooOOO0;

/* loaded from: classes.dex */
class SqlTimestampTypeAdapter extends o0OOO0o {

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final o0Oo0oo f3936OooO0O0 = new o0Oo0oo() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter.1
        @Override // com.google.gson.o0Oo0oo
        public final o0OOO0o OooO00o(OooOOOO oooOOOO, o00oO0o o00oo0o) {
            if (o00oo0o.f4065OooO00o == Timestamp.class) {
                oooOOOO.getClass();
                return new SqlTimestampTypeAdapter(oooOOOO.OooO0OO(new o00oO0o(Date.class)));
            }
            return null;
        }
    };

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o0OOO0o f3937OooO00o;

    public SqlTimestampTypeAdapter(o0OOO0o o0ooo0o) {
        this.f3937OooO00o = o0ooo0o;
    }

    @Override // com.google.gson.o0OOO0o
    public final Object OooO0O0(OooOOO0 oooOOO0) {
        Date date = (Date) this.f3937OooO00o.OooO0O0(oooOOO0);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // com.google.gson.o0OOO0o
    public final void OooO0OO(OooOOO oooOOO, Object obj) {
        this.f3937OooO00o.OooO0OO(oooOOO, (Timestamp) obj);
    }
}