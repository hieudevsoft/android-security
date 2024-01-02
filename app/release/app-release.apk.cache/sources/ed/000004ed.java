package o0000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class OooOOOO extends o0000O00.OooO00o {
    public static final int o00O0O0o(Iterable iterable) {
        o0000O00.OooO00o.OooOoo0(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }

    public static final byte[] o00O0OO(byte[] bArr, int i, int i2) {
        o0000O00.OooO00o.OooOoo0(bArr, "<this>");
        int length = bArr.length;
        if (i2 <= length) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
            o0000O00.OooO00o.OooOoOO(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is greater than size (" + length + ").");
    }

    public static final void o00O0OO0(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        o0000O00.OooO00o.OooOoo0(bArr, "<this>");
        o0000O00.OooO00o.OooOoo0(bArr2, "destination");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static final ArrayList o00O0OOO(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final char o00O0OOo(char[] cArr) {
        o0000O00.OooO00o.OooOoo0(cArr, "<this>");
        int length = cArr.length;
        if (length != 0) {
            if (length == 1) {
                return cArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final Map o00O0Oo0(ArrayList arrayList) {
        o00O0O o00o0o = o00O0O.f3968OooO00o;
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(o0000O00.OooO00o.o0000o0o(arrayList.size()));
                oo0oOO0(arrayList, linkedHashMap);
                return linkedHashMap;
            }
            o00000oo.o00O0O o00o0o2 = (o00000oo.o00O0O) arrayList.get(0);
            o0000O00.OooO00o.OooOoo0(o00o0o2, "pair");
            Map singletonMap = Collections.singletonMap(o00o0o2.f4100OooO00o, o00o0o2.f4101OooO0O0);
            o0000O00.OooO00o.OooOoOO(singletonMap, "singletonMap(pair.first, pair.second)");
            return singletonMap;
        }
        return o00o0o;
    }

    public static final void oo0o0O0(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        o0000O00.OooO00o.OooOoo0(objArr, "<this>");
        o0000O00.OooO00o.OooOoo0(objArr2, "destination");
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static final void oo0oOO0(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o00000oo.o00O0O o00o0o = (o00000oo.o00O0O) it.next();
            linkedHashMap.put(o00o0o.f4100OooO00o, o00o0o.f4101OooO0O0);
        }
    }
}