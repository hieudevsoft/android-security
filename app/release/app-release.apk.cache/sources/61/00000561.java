package o00000oO;

import androidx.appcompat.widget.o0OOooO0;
import com.google.android.material.textview.MaterialTextView;
import o00000oo.o00Ooo;
import o0000O0O.OooO00o;

/* loaded from: classes.dex */
public final class OooOo00 extends o000OO.OooOO0 implements OooO00o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f4084OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ Object f4085OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ Object f4086OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final /* synthetic */ Object f4087OooO0Oo;

    public /* synthetic */ OooOo00(Object obj, Object obj2, Object obj3, int i) {
        this.f4084OooO00o = i;
        this.f4086OooO0OO = obj;
        this.f4085OooO0O0 = obj2;
        this.f4087OooO0Oo = obj3;
    }

    @Override // o0000O0O.OooO00o
    public final Object OooO00o() {
        switch (this.f4084OooO00o) {
            case 0:
                ((MaterialTextView) ((o0OOooO0) this.f4086OooO0OO).f2529OooO0o).setText("Server encrypt: " + ((String) this.f4085OooO0O0) + "\n\nClient decrypt: " + ((String) this.f4087OooO0Oo));
                return o00Ooo.f4105OooO00o;
            case 1:
                return OooO0OO();
            default:
                return OooO0OO();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r0 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List OooO0OO() {
        /*
            r4 = this;
            int r0 = r4.f4084OooO00o
            java.lang.Object r1 = r4.f4085OooO0O0
            java.lang.Object r2 = r4.f4087OooO0Oo
            java.lang.Object r3 = r4.f4086OooO0OO
            switch(r0) {
                case 1: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L45
        Lc:
            o0000Oo.OooOOO r3 = (o0000Oo.OooOOO) r3
            com.google.gson.internal.OooO0o r0 = r3.f4194OooO0O0
            if (r0 == 0) goto L1d
            r3 = r2
            java.util.List r3 = (java.util.List) r3
            java.lang.String r1 = (java.lang.String) r1
            java.util.List r0 = r0.OooO(r1, r3)
            if (r0 != 0) goto L20
        L1d:
            r0 = r2
            java.util.List r0 = (java.util.List) r0
        L20:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = o0000.OooOOOO.o00O0O0o(r0)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L2d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L44
            java.lang.Object r2 = r0.next()
            java.security.cert.Certificate r2 = (java.security.cert.Certificate) r2
            java.lang.String r3 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            o0000O00.OooO00o.OooOoO0(r2, r3)
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            r1.add(r2)
            goto L2d
        L44:
            return r1
        L45:
            o0000Oo.OooOOO r3 = (o0000Oo.OooOOO) r3
            com.google.gson.internal.OooO0o r0 = r3.f4194OooO0O0
            o0000O00.OooO00o.OooOo(r0)
            o0000Oo.o00Oo0 r1 = (o0000Oo.o00Oo0) r1
            java.util.List r1 = r1.OooO00o()
            o0000Oo.OooO0o r2 = (o0000Oo.OooO0o) r2
            o0000Oo.o0ooOOo r2 = r2.f4168OooO
            java.lang.String r2 = r2.f4348OooO0Oo
            java.util.List r0 = r0.OooO(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o00000oO.OooOo00.OooO0OO():java.util.List");
    }
}