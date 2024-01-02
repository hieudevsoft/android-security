package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class o0Oo0oo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final AtomicReference f3444OooO00o = new AtomicReference();

    public static DateFormat OooO00o(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return instanceForSkeleton;
    }

    public static Calendar OooO0O0(Calendar calendar) {
        Calendar OooO0Oo2 = OooO0Oo(calendar);
        Calendar OooO0Oo3 = OooO0Oo(null);
        OooO0Oo3.set(OooO0Oo2.get(1), OooO0Oo2.get(2), OooO0Oo2.get(5));
        return OooO0Oo3;
    }

    public static Calendar OooO0OO() {
        o0OOO0o o0ooo0o = (o0OOO0o) f3444OooO00o.get();
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        return calendar;
    }

    public static Calendar OooO0Oo(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(java.util.TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }
}