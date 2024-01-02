package com.google.gson.internal.sql;

import com.google.gson.OooOOOO;
import com.google.gson.Oooo000;
import com.google.gson.o0OOO0o;
import com.google.gson.o0Oo0oo;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import o00000o0.o00oO0o;
import o0000Ooo.OooOOO;
import o0000Ooo.OooOOO0;

/* loaded from: classes.dex */
final class SqlTimeTypeAdapter extends o0OOO0o {

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final o0Oo0oo f3934OooO0O0 = new o0Oo0oo() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // com.google.gson.o0Oo0oo
        public final o0OOO0o OooO00o(OooOOOO oooOOOO, o00oO0o o00oo0o) {
            if (o00oo0o.f4065OooO00o == Time.class) {
                return new SqlTimeTypeAdapter(0);
            }
            return null;
        }
    };

    /* renamed from: OooO00o  reason: collision with root package name */
    public final SimpleDateFormat f3935OooO00o;

    private SqlTimeTypeAdapter() {
        this.f3935OooO00o = new SimpleDateFormat("hh:mm:ss a");
    }

    @Override // com.google.gson.o0OOO0o
    public final Object OooO0O0(OooOOO0 oooOOO0) {
        Time time;
        if (oooOOO0.OoooO0O() == 9) {
            oooOOO0.Oooo0oo();
            return null;
        }
        String OoooO002 = oooOOO0.OoooO00();
        try {
            synchronized (this) {
                time = new Time(this.f3935OooO00o.parse(OoooO002).getTime());
            }
            return time;
        } catch (ParseException e) {
            throw new Oooo000("Failed parsing '" + OoooO002 + "' as SQL Time; at path " + oooOOO0.OooOooo(true), e);
        }
    }

    @Override // com.google.gson.o0OOO0o
    public final void OooO0OO(OooOOO oooOOO, Object obj) {
        String format;
        Time time = (Time) obj;
        if (time == null) {
            oooOOO.Oooo000();
            return;
        }
        synchronized (this) {
            format = this.f3935OooO00o.format((Date) time);
        }
        oooOOO.Oooo0o(format);
    }

    public /* synthetic */ SqlTimeTypeAdapter(int i) {
        this();
    }
}