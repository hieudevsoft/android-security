package OooO;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class OooOO0O implements Iterable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public OooO0OO f11OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public OooO0OO f12OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final WeakHashMap f13OooO0OO = new WeakHashMap();

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public int f14OooO0Oo = 0;

    public OooO0OO OooO0o(Object obj) {
        OooO0OO oooO0OO = this.f11OooO00o;
        while (oooO0OO != null && !oooO0OO.f4OooO00o.equals(obj)) {
            oooO0OO = oooO0OO.f6OooO0OO;
        }
        return oooO0OO;
    }

    public Object OooO0oO(Object obj) {
        OooO0OO OooO0o2 = OooO0o(obj);
        if (OooO0o2 == null) {
            return null;
        }
        this.f14OooO0Oo--;
        WeakHashMap weakHashMap = this.f13OooO0OO;
        if (!weakHashMap.isEmpty()) {
            for (OooOO0 oooOO0 : weakHashMap.keySet()) {
                oooOO0.OooO00o(OooO0o2);
            }
        }
        OooO0OO oooO0OO = OooO0o2.f7OooO0Oo;
        OooO0OO oooO0OO2 = OooO0o2.f6OooO0OO;
        if (oooO0OO != null) {
            oooO0OO.f6OooO0OO = oooO0OO2;
        } else {
            this.f11OooO00o = oooO0OO2;
        }
        OooO0OO oooO0OO3 = OooO0o2.f6OooO0OO;
        if (oooO0OO3 != null) {
            oooO0OO3.f7OooO0Oo = oooO0OO;
        } else {
            this.f12OooO0O0 = oooO0OO;
        }
        OooO0o2.f6OooO0OO = null;
        OooO0o2.f7OooO0Oo = null;
        return OooO0o2.f5OooO0O0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (r3.hasNext() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
        if (((OooO.OooO) r7).hasNext() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof OooO.OooOO0O
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            OooO.OooOO0O r7 = (OooO.OooOO0O) r7
            int r1 = r6.f14OooO0Oo
            int r3 = r7.f14OooO0Oo
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            OooO.OooO r3 = (OooO.OooO) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            OooO.OooO r4 = (OooO.OooO) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            OooO.OooO r7 = (OooO.OooO) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            goto L54
        L53:
            r0 = r2
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: OooO.OooOO0O.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            OooO oooO = (OooO) it;
            if (!oooO.hasNext()) {
                return i;
            }
            i += ((Map.Entry) oooO.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        OooO0O0 oooO0O0 = new OooO0O0(this.f11OooO00o, this.f12OooO0O0, 0);
        this.f13OooO0OO.put(oooO0O0, Boolean.FALSE);
        return oooO0O0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            OooO oooO = (OooO) it;
            if (!oooO.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) oooO.next()).toString());
            if (oooO.hasNext()) {
                sb.append(", ");
            }
        }
    }
}