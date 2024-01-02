package com.google.gson.internal;

/* loaded from: classes.dex */
public abstract class OooOOO0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final int f3799OooO00o;

    static {
        int i;
        String property = System.getProperty("java.version");
        try {
            String[] split = property.split("[._]");
            i = Integer.parseInt(split[0]);
            if (i == 1 && split.length > 1) {
                i = Integer.parseInt(split[1]);
            }
        } catch (NumberFormatException unused) {
            i = -1;
        }
        if (i == -1) {
            try {
                StringBuilder sb = new StringBuilder();
                for (int i2 = 0; i2 < property.length(); i2++) {
                    char charAt = property.charAt(i2);
                    if (!Character.isDigit(charAt)) {
                        break;
                    }
                    sb.append(charAt);
                }
                i = Integer.parseInt(sb.toString());
            } catch (NumberFormatException unused2) {
                i = -1;
            }
        }
        if (i == -1) {
            i = 6;
        }
        f3799OooO00o = i;
    }
}