package OooOo0o;

import android.content.Context;
import android.graphics.Typeface;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class o0000 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final ThreadLocal f1155OooO00o = new ThreadLocal();

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final WeakHashMap f1156OooO0O0 = new WeakHashMap(0);

    /* renamed from: OooO0OO  reason: collision with root package name */
    public static final Object f1157OooO0OO = new Object();

    public static Typeface OooO00o(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return OooO0O0(context, i, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
        if (r18 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
        r18.OooO00o(-3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
        if (r18 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface OooO0O0(android.content.Context r14, int r15, android.util.TypedValue r16, int r17, OooO0O0.OooO0O0 r18, boolean r19, boolean r20) {
        /*
            r9 = r15
            r0 = r16
            r6 = r17
            r10 = r18
            android.content.res.Resources r7 = r14.getResources()
            r1 = 1
            r7.getValue(r15, r0, r1)
            java.lang.CharSequence r1 = r0.string
            if (r1 == 0) goto Lb9
            java.lang.String r8 = r1.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r8.startsWith(r1)
            r11 = -3
            if (r1 != 0) goto L24
            if (r10 == 0) goto L93
            goto L90
        L24:
            int r1 = r0.assetCookie
            OooOO0.OooO r12 = OooOo.OooOO0O.f1117OooO0O0
            java.lang.String r1 = OooOo.OooOO0O.OooO0O0(r7, r15, r8, r1, r6)
            java.lang.Object r1 = r12.OooO00o(r1)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L3b
            if (r10 == 0) goto L94
            r10.OooO0O0(r1)
            goto L94
        L3b:
            if (r20 == 0) goto L3e
            goto L93
        L3e:
            java.lang.String r1 = r8.toLowerCase()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r2 = ".xml"
            boolean r1 = r1.endsWith(r2)     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L6b
            android.content.res.XmlResourceParser r1 = r7.getXml(r15)     // Catch: java.lang.Throwable -> L8e
            OooOo0o.o0OO00O r1 = o0000O00.OooO00o.o000O0Oo(r1, r7)     // Catch: java.lang.Throwable -> L8e
            if (r1 != 0) goto L5a
            if (r10 == 0) goto L93
            r10.OooO00o(r11)     // Catch: java.lang.Throwable -> L8e
            goto L93
        L5a:
            int r5 = r0.assetCookie     // Catch: java.lang.Throwable -> L8e
            r0 = r14
            r2 = r7
            r3 = r15
            r4 = r8
            r6 = r17
            r7 = r18
            r8 = r19
            android.graphics.Typeface r1 = OooOo.OooOO0O.OooO00o(r0, r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L8e
            goto L94
        L6b:
            int r13 = r0.assetCookie     // Catch: java.lang.Throwable -> L8e
            OooO0Oo.o0000OO0 r0 = OooOo.OooOO0O.f1116OooO00o     // Catch: java.lang.Throwable -> L8e
            r1 = r14
            r2 = r7
            r3 = r15
            r4 = r8
            r5 = r17
            android.graphics.Typeface r1 = r0.OooOo0(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L82
            java.lang.String r0 = OooOo.OooOO0O.OooO0O0(r7, r15, r8, r13, r6)     // Catch: java.lang.Throwable -> L8e
            r12.OooO0O0(r0, r1)     // Catch: java.lang.Throwable -> L8e
        L82:
            if (r10 == 0) goto L94
            if (r1 == 0) goto L8a
            r10.OooO0O0(r1)     // Catch: java.lang.Throwable -> L8e
            goto L94
        L8a:
            r10.OooO00o(r11)     // Catch: java.lang.Throwable -> L8e
            goto L94
        L8e:
            if (r10 == 0) goto L93
        L90:
            r10.OooO00o(r11)
        L93:
            r1 = 0
        L94:
            if (r1 != 0) goto Lb8
            if (r10 != 0) goto Lb8
            if (r20 == 0) goto L9b
            goto Lb8
        L9b:
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Font resource ID #0x"
            r1.<init>(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r15)
            r1.append(r2)
            java.lang.String r2 = " could not be retrieved."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Lb8:
            return r1
        Lb9:
            android.content.res.Resources$NotFoundException r1 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Resource \""
            r2.<init>(r3)
            java.lang.String r3 = r7.getResourceName(r15)
            r2.append(r3)
            java.lang.String r3 = "\" ("
            r2.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r15)
            r2.append(r3)
            java.lang.String r3 = ") is not a Font: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: OooOo0o.o0000.OooO0O0(android.content.Context, int, android.util.TypedValue, int, OooO0O0.OooO0O0, boolean, boolean):android.graphics.Typeface");
    }
}