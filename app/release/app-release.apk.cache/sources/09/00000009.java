package OooO0O0;

import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract /* synthetic */ class OooO00o {
    public static /* synthetic */ String OooO(int i) {
        return i == 1 ? "UNKNOWN" : i == 2 ? "HORIZONTAL_DIMENSION" : i == 3 ? "VERTICAL_DIMENSION" : i == 4 ? "LEFT" : i == 5 ? "RIGHT" : i == 6 ? "TOP" : i == 7 ? "BOTTOM" : i == 8 ? "BASELINE" : "null";
    }

    public static /* synthetic */ long OooO00o(int i) {
        if (i == 1) {
            return 0L;
        }
        if (i == 2) {
            return 1L;
        }
        if (i == 3) {
            return 2L;
        }
        if (i == 4) {
            return 3L;
        }
        if (i == 5) {
            return 4L;
        }
        throw null;
    }

    public static String OooO0O0(String str, int i) {
        return str + i;
    }

    public static String OooO0OO(String str, String str2) {
        return str + str2;
    }

    public static String OooO0Oo(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static /* synthetic */ void OooO0o(Parcelable parcelable) {
        if (parcelable != null) {
            throw new ClassCastException();
        }
    }

    public static StringBuilder OooO0o0(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static /* synthetic */ void OooO0oO(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void OooO0oo(Object obj) {
        throw new ClassCastException();
    }

    public static /* synthetic */ String OooOO0(int i) {
        return i == 1 ? "BEGIN_ARRAY" : i == 2 ? "END_ARRAY" : i == 3 ? "BEGIN_OBJECT" : i == 4 ? "END_OBJECT" : i == 5 ? "NAME" : i == 6 ? "STRING" : i == 7 ? "NUMBER" : i == 8 ? "BOOLEAN" : i == 9 ? "NULL" : i == 10 ? "END_DOCUMENT" : "null";
    }
}