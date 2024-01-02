package OooOO0;

import java.util.LinkedHashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public class OooO {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final LinkedHashMap f501OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f502OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final int f503OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public int f504OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public int f505OooO0o0;

    public OooO(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f503OooO0OO = i;
        this.f501OooO00o = new LinkedHashMap(0, 0.75f, true);
    }

    public final Object OooO00o(Object obj) {
        if (obj != null) {
            synchronized (this) {
                Object obj2 = this.f501OooO00o.get(obj);
                if (obj2 != null) {
                    this.f504OooO0Oo++;
                    return obj2;
                }
                this.f505OooO0o0++;
                return null;
            }
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object OooO0O0(java.lang.Object r3, java.lang.Object r4) {
        /*
            r2 = this;
            if (r3 == 0) goto L83
            monitor-enter(r2)
            int r0 = r2.f502OooO0O0     // Catch: java.lang.Throwable -> L80
            int r0 = r0 + 1
            r2.f502OooO0O0 = r0     // Catch: java.lang.Throwable -> L80
            java.util.LinkedHashMap r0 = r2.f501OooO00o     // Catch: java.lang.Throwable -> L80
            java.lang.Object r3 = r0.put(r3, r4)     // Catch: java.lang.Throwable -> L80
            if (r3 == 0) goto L17
            int r4 = r2.f502OooO0O0     // Catch: java.lang.Throwable -> L80
            int r4 = r4 + (-1)
            r2.f502OooO0O0 = r4     // Catch: java.lang.Throwable -> L80
        L17:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L80
            int r4 = r2.f503OooO0OO
        L1a:
            monitor-enter(r2)
            int r0 = r2.f502OooO0O0     // Catch: java.lang.Throwable -> L7d
            if (r0 < 0) goto L5e
            java.util.LinkedHashMap r0 = r2.f501OooO00o     // Catch: java.lang.Throwable -> L7d
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L7d
            if (r0 == 0) goto L2b
            int r0 = r2.f502OooO0O0     // Catch: java.lang.Throwable -> L7d
            if (r0 != 0) goto L5e
        L2b:
            int r0 = r2.f502OooO0O0     // Catch: java.lang.Throwable -> L7d
            if (r0 <= r4) goto L5c
            java.util.LinkedHashMap r0 = r2.f501OooO00o     // Catch: java.lang.Throwable -> L7d
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L7d
            if (r0 == 0) goto L38
            goto L5c
        L38:
            java.util.LinkedHashMap r0 = r2.f501OooO00o     // Catch: java.lang.Throwable -> L7d
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L7d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L7d
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L7d
            r0.getValue()     // Catch: java.lang.Throwable -> L7d
            java.util.LinkedHashMap r0 = r2.f501OooO00o     // Catch: java.lang.Throwable -> L7d
            r0.remove(r1)     // Catch: java.lang.Throwable -> L7d
            int r0 = r2.f502OooO0O0     // Catch: java.lang.Throwable -> L7d
            int r0 = r0 + (-1)
            r2.f502OooO0O0 = r0     // Catch: java.lang.Throwable -> L7d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7d
            goto L1a
        L5c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7d
            return r3
        L5e:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L7d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7d
            r4.<init>()     // Catch: java.lang.Throwable -> L7d
            java.lang.Class r0 = r2.getClass()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L7d
            r4.append(r0)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r0 = ".sizeOf() is reporting inconsistent results!"
            r4.append(r0)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L7d
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L7d
            throw r3     // Catch: java.lang.Throwable -> L7d
        L7d:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7d
            throw r3
        L80:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L80
            throw r3
        L83:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "key == null || value == null"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: OooOO0.OooO.OooO0O0(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final synchronized String toString() {
        int i;
        int i2;
        i = this.f504OooO0Oo;
        i2 = this.f505OooO0o0 + i;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f503OooO0OO), Integer.valueOf(this.f504OooO0Oo), Integer.valueOf(this.f505OooO0o0), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }
}