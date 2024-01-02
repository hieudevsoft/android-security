package androidx.appcompat.widget;

/* loaded from: classes.dex */
public final class OooOOOO implements Runnable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f2123OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final Object f2124OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ Object f2125OooO0OO;

    public OooOOOO(Oooo000 oooo000, OooOOO0 oooOOO0) {
        this.f2123OooO00o = 0;
        this.f2125OooO0OO = oooo000;
        this.f2124OooO0O0 = oooOOO0;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r7 = this;
            r0 = 0
            r1 = 1
            int r2 = r7.f2123OooO00o
            java.lang.Object r3 = r7.f2124OooO0O0
            java.lang.Object r4 = r7.f2125OooO0OO
            switch(r2) {
                case 0: goto L19;
                case 1: goto L14;
                case 2: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L4d
        Lc:
            android.app.Application r3 = (android.app.Application) r3
            OooOo0.Oooo0 r4 = (OooOo0.Oooo0) r4
            r3.unregisterActivityLifecycleCallbacks(r4)
            return
        L14:
            OooOo0.Oooo0 r3 = (OooOo0.Oooo0) r3
            r3.f1133OooO00o = r4
            return
        L19:
            androidx.appcompat.widget.Oooo000 r4 = (androidx.appcompat.widget.Oooo000) r4
            OooO0oO.o00O00O r2 = r4.f2133OooO0OO
            if (r2 == 0) goto L26
            OooO0oO.o00O000o r5 = r2.f395OooO0o0
            if (r5 == 0) goto L26
            r5.OooOO0(r2)
        L26:
            OooO0oO.o00OO00O r2 = r4.f2138OooO0oo
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L49
            android.os.IBinder r2 = r2.getWindowToken()
            if (r2 == 0) goto L49
            androidx.appcompat.widget.OooOOO0 r3 = (androidx.appcompat.widget.OooOOO0) r3
            boolean r2 = r3.OooO0O0()
            if (r2 == 0) goto L3c
        L3a:
            r0 = r1
            goto L45
        L3c:
            android.view.View r2 = r3.f454OooO0o
            if (r2 != 0) goto L41
            goto L45
        L41:
            r3.OooO0Oo(r0, r0, r0, r0)
            goto L3a
        L45:
            if (r0 == 0) goto L49
            r4.f2147OooOOoo = r3
        L49:
            r0 = 0
            r4.f2148OooOo0 = r0
            return
        L4d:
            java.lang.reflect.Method r2 = OooOo0.o000oOoO.f1143OooO0Oo     // Catch: java.lang.RuntimeException -> L71 java.lang.Throwable -> L8e
            r5 = 2
            if (r2 == 0) goto L63
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.RuntimeException -> L71 java.lang.Throwable -> L8e
            r6[r0] = r4     // Catch: java.lang.RuntimeException -> L71 java.lang.Throwable -> L8e
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.RuntimeException -> L71 java.lang.Throwable -> L8e
            r6[r1] = r0     // Catch: java.lang.RuntimeException -> L71 java.lang.Throwable -> L8e
            java.lang.String r0 = "AppCompat recreation"
            r6[r5] = r0     // Catch: java.lang.RuntimeException -> L71 java.lang.Throwable -> L8e
            r2.invoke(r3, r6)     // Catch: java.lang.RuntimeException -> L71 java.lang.Throwable -> L8e
            goto L8e
        L63:
            java.lang.reflect.Method r2 = OooOo0.o000oOoO.f1145OooO0o0     // Catch: java.lang.RuntimeException -> L71 java.lang.Throwable -> L8e
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.RuntimeException -> L71 java.lang.Throwable -> L8e
            r5[r0] = r4     // Catch: java.lang.RuntimeException -> L71 java.lang.Throwable -> L8e
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.RuntimeException -> L71 java.lang.Throwable -> L8e
            r5[r1] = r0     // Catch: java.lang.RuntimeException -> L71 java.lang.Throwable -> L8e
            r2.invoke(r3, r5)     // Catch: java.lang.RuntimeException -> L71 java.lang.Throwable -> L8e
            goto L8e
        L71:
            r0 = move-exception
            java.lang.Class r1 = r0.getClass()
            java.lang.Class<java.lang.RuntimeException> r2 = java.lang.RuntimeException.class
            if (r1 != r2) goto L8e
            java.lang.String r1 = r0.getMessage()
            if (r1 == 0) goto L8e
            java.lang.String r1 = r0.getMessage()
            java.lang.String r2 = "Unable to stop"
            boolean r1 = r1.startsWith(r2)
            if (r1 != 0) goto L8d
            goto L8e
        L8d:
            throw r0
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.OooOOOO.run():void");
    }

    public /* synthetic */ OooOOOO(Object obj, int i, Object obj2) {
        this.f2123OooO00o = i;
        this.f2124OooO0O0 = obj;
        this.f2125OooO0OO = obj2;
    }
}