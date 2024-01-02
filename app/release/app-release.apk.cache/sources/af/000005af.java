package o0000Oo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import o0000.OooO0OO;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class oo000o implements Iterable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final String[] f4353OooO00o;

    public oo000o(String[] strArr) {
        this.f4353OooO00o = strArr;
    }

    public final String OooO(int i) {
        return this.f4353OooO00o[(i * 2) + 1];
    }

    public final String OooO0o(String str) {
        OooO00o.OooOoo0(str, "name");
        String[] strArr = this.f4353OooO00o;
        int length = strArr.length - 2;
        int o00000O2 = OooO00o.o00000O(length, 0, -2);
        if (o00000O2 <= length) {
            while (!o0000Oo0.OooOOOO.oo0o0O0(str, strArr[length])) {
                if (length != o00000O2) {
                    length -= 2;
                }
            }
            return strArr[length + 1];
        }
        return null;
    }

    public final String OooO0oO(int i) {
        return this.f4353OooO00o[i * 2];
    }

    public final o00Ooo OooO0oo() {
        o00Ooo o00ooo2 = new o00Ooo();
        ArrayList arrayList = o00ooo2.f4290OooO00o;
        OooO00o.OooOoo0(arrayList, "<this>");
        String[] strArr = this.f4353OooO00o;
        OooO00o.OooOoo0(strArr, "elements");
        List asList = Arrays.asList(strArr);
        OooO00o.OooOoOO(asList, "asList(this)");
        arrayList.addAll(asList);
        return o00ooo2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oo000o) {
            if (Arrays.equals(this.f4353OooO00o, ((oo000o) obj).f4353OooO00o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4353OooO00o);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int length = this.f4353OooO00o.length / 2;
        o00000oo.o00O0O[] o00o0oArr = new o00000oo.o00O0O[length];
        for (int i = 0; i < length; i++) {
            o00o0oArr[i] = new o00000oo.o00O0O(OooO0oO(i), OooO(i));
        }
        return new OooO0OO(o00o0oArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int length = this.f4353OooO00o.length / 2;
        for (int i = 0; i < length; i++) {
            String OooO0oO2 = OooO0oO(i);
            String OooO2 = OooO(i);
            sb.append(OooO0oO2);
            sb.append(": ");
            if (o0000OoO.OooOO0O.OooOOOo(OooO0oO2)) {
                OooO2 = "██";
            }
            sb.append(OooO2);
            sb.append("\n");
        }
        String sb2 = sb.toString();
        OooO00o.OooOoOO(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}