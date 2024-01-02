package com.google.gson.internal.sql;

import com.google.gson.OooOOOO;
import com.google.gson.Oooo000;
import com.google.gson.o0OOO0o;
import com.google.gson.o0Oo0oo;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import o00000o0.o00oO0o;
import o0000Ooo.OooOOO;
import o0000Ooo.OooOOO0;

/* loaded from: classes.dex */
final class SqlDateTypeAdapter extends o0OOO0o {

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final o0Oo0oo f3932OooO0O0 = new o0Oo0oo() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // com.google.gson.o0Oo0oo
        public final o0OOO0o OooO00o(OooOOOO oooOOOO, o00oO0o o00oo0o) {
            if (o00oo0o.f4065OooO00o == Date.class) {
                return new SqlDateTypeAdapter(0);
            }
            return null;
        }
    };

    /* renamed from: OooO00o  reason: collision with root package name */
    public final SimpleDateFormat f3933OooO00o;

    private SqlDateTypeAdapter() {
        this.f3933OooO00o = new SimpleDateFormat("MMM d, yyyy");
    }

    @Override // com.google.gson.o0OOO0o
    public final Object OooO0O0(OooOOO0 oooOOO0) {
        java.util.Date parse;
        if (oooOOO0.OoooO0O() == 9) {
            oooOOO0.Oooo0oo();
            return null;
        }
        String OoooO002 = oooOOO0.OoooO00();
        try {
            synchronized (this) {
                parse = this.f3933OooO00o.parse(OoooO002);
            }
            return new Date(parse.getTime());
        } catch (ParseException e) {
            throw new Oooo000("Failed parsing '" + OoooO002 + "' as SQL Date; at path " + oooOOO0.OooOooo(true), e);
        }
    }

    @Override // com.google.gson.o0OOO0o
    public final void OooO0OO(OooOOO oooOOO, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            oooOOO.Oooo000();
            return;
        }
        synchronized (this) {
            format = this.f3933OooO00o.format((java.util.Date) date);
        }
        oooOOO.Oooo0o(format);
    }

    public /* synthetic */ SqlDateTypeAdapter(int i) {
        this();
    }
}