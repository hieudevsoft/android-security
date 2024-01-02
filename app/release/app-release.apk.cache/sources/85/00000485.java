package com.google.gson.internal.bind;

import com.google.gson.OooOOOO;
import com.google.gson.internal.OooOOO0;
import com.google.gson.o0OOO0o;
import com.google.gson.o0Oo0oo;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import o00000o0.o00oO0o;
import o0000Ooo.OooOOO;

/* loaded from: classes.dex */
public final class DateTypeAdapter extends o0OOO0o {

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final o0Oo0oo f3831OooO0O0 = new o0Oo0oo() { // from class: com.google.gson.internal.bind.DateTypeAdapter.1
        @Override // com.google.gson.o0Oo0oo
        public final o0OOO0o OooO00o(OooOOOO oooOOOO, o00oO0o o00oo0o) {
            if (o00oo0o.f4065OooO00o == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: OooO00o  reason: collision with root package name */
    public final ArrayList f3832OooO00o;

    public DateTypeAdapter() {
        boolean z;
        ArrayList arrayList = new ArrayList();
        this.f3832OooO00o = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (OooOOO0.f3799OooO00o >= 9) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            arrayList.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", locale));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0202 A[Catch: IllegalArgumentException -> 0x020a, IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x020c, IndexOutOfBoundsException -> 0x020e, ParseException -> 0x0270, TryCatch #0 {ParseException -> 0x0270, blocks: (B:16:0x0032, B:17:0x003a, B:19:0x004c, B:20:0x004e, B:22:0x005a, B:23:0x005c, B:25:0x006a, B:27:0x0070, B:31:0x008a, B:33:0x009a, B:34:0x009c, B:36:0x00a8, B:37:0x00aa, B:39:0x00b0, B:43:0x00ba, B:48:0x00ca, B:50:0x00d2, B:51:0x00d6, B:53:0x00dc, B:58:0x00e9, B:60:0x00f2, B:71:0x0114, B:73:0x011a, B:74:0x011e, B:101:0x01ce, B:83:0x012f, B:84:0x014a, B:85:0x014b, B:89:0x0167, B:91:0x0174, B:94:0x017d, B:96:0x019c, B:99:0x01ab, B:100:0x01cd, B:88:0x0156, B:103:0x0202, B:104:0x0209, B:64:0x0102, B:65:0x0105, B:59:0x00ee, B:113:0x0226, B:115:0x022c, B:118:0x024d, B:119:0x026f, B:117:0x0232, B:112:0x0213), top: B:127:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011a A[Catch: IllegalArgumentException -> 0x020a, IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x020c, IndexOutOfBoundsException -> 0x020e, ParseException -> 0x0270, TRY_LEAVE, TryCatch #0 {ParseException -> 0x0270, blocks: (B:16:0x0032, B:17:0x003a, B:19:0x004c, B:20:0x004e, B:22:0x005a, B:23:0x005c, B:25:0x006a, B:27:0x0070, B:31:0x008a, B:33:0x009a, B:34:0x009c, B:36:0x00a8, B:37:0x00aa, B:39:0x00b0, B:43:0x00ba, B:48:0x00ca, B:50:0x00d2, B:51:0x00d6, B:53:0x00dc, B:58:0x00e9, B:60:0x00f2, B:71:0x0114, B:73:0x011a, B:74:0x011e, B:101:0x01ce, B:83:0x012f, B:84:0x014a, B:85:0x014b, B:89:0x0167, B:91:0x0174, B:94:0x017d, B:96:0x019c, B:99:0x01ab, B:100:0x01cd, B:88:0x0156, B:103:0x0202, B:104:0x0209, B:64:0x0102, B:65:0x0105, B:59:0x00ee, B:113:0x0226, B:115:0x022c, B:118:0x024d, B:119:0x026f, B:117:0x0232, B:112:0x0213), top: B:127:0x0032 }] */
    @Override // com.google.gson.o0OOO0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object OooO0O0(o0000Ooo.OooOOO0 r19) {
        /*
            Method dump skipped, instructions count: 663
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.DateTypeAdapter.OooO0O0(o0000Ooo.OooOOO0):java.lang.Object");
    }

    @Override // com.google.gson.o0OOO0o
    public final void OooO0OO(OooOOO oooOOO, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            oooOOO.Oooo000();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f3832OooO00o.get(0);
        synchronized (this.f3832OooO00o) {
            format = dateFormat.format(date);
        }
        oooOOO.Oooo0o(format);
    }
}