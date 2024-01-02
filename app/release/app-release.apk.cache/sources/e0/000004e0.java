package o000;

/* loaded from: classes.dex */
public final class OooO00o extends com.google.gson.internal.OooO0o {

    /* renamed from: OooOO0O  reason: collision with root package name */
    public final OooO0o f3948OooOO0O;

    public OooO00o(OooO0o oooO0o) {
        o0000O00.OooO00o.OooOoo0(oooO0o, "trustRootIndex");
        this.f3948OooOO0O = oooO0o;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a0 A[SYNTHETIC] */
    @Override // com.google.gson.internal.OooO0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List OooO(java.lang.String r11, java.util.List r12) {
        /*
            r10 = this;
            java.lang.String r0 = "chain"
            o0000O00.OooO00o.OooOoo0(r12, r0)
            java.lang.String r0 = "hostname"
            o0000O00.OooO00o.OooOoo0(r11, r0)
            java.util.ArrayDeque r11 = new java.util.ArrayDeque
            r11.<init>(r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.lang.Object r0 = r11.removeFirst()
            java.lang.String r1 = "queue.removeFirst()"
            o0000O00.OooO00o.OooOoOO(r0, r1)
            r12.add(r0)
            r0 = 0
            r1 = r0
            r2 = r1
        L23:
            r3 = 9
            if (r1 >= r3) goto Lc1
            int r3 = r12.size()
            r4 = 1
            int r3 = r3 - r4
            java.lang.Object r3 = r12.get(r3)
            java.lang.String r5 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            o0000O00.OooO00o.OooOoO0(r3, r5)
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3
            o000.OooO0o r6 = r10.f3948OooOO0O
            java.security.cert.X509Certificate r6 = r6.OooO00o(r3)
            if (r6 == 0) goto L6d
            int r2 = r12.size()
            if (r2 > r4) goto L4c
            boolean r2 = o0000O00.OooO00o.OooOOO0(r3, r6)
            if (r2 != 0) goto L4f
        L4c:
            r12.add(r6)
        L4f:
            java.security.Principal r2 = r6.getIssuerDN()
            java.security.Principal r3 = r6.getSubjectDN()
            boolean r2 = o0000O00.OooO00o.OooOOO0(r2, r3)
            if (r2 != 0) goto L5e
            goto L67
        L5e:
            java.security.PublicKey r2 = r6.getPublicKey()     // Catch: java.security.GeneralSecurityException -> L67
            r6.verify(r2)     // Catch: java.security.GeneralSecurityException -> L67
            r2 = r4
            goto L68
        L67:
            r2 = r0
        L68:
            if (r2 == 0) goto L6b
            return r12
        L6b:
            r2 = r4
            goto La6
        L6d:
            java.util.Iterator r6 = r11.iterator()
            java.lang.String r7 = "queue.iterator()"
            o0000O00.OooO00o.OooOoOO(r6, r7)
        L76:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Laa
            java.lang.Object r7 = r6.next()
            o0000O00.OooO00o.OooOoO0(r7, r5)
            java.security.cert.X509Certificate r7 = (java.security.cert.X509Certificate) r7
            java.security.Principal r8 = r3.getIssuerDN()
            java.security.Principal r9 = r7.getSubjectDN()
            boolean r8 = o0000O00.OooO00o.OooOOO0(r8, r9)
            if (r8 != 0) goto L94
            goto L9d
        L94:
            java.security.PublicKey r8 = r7.getPublicKey()     // Catch: java.security.GeneralSecurityException -> L9d
            r3.verify(r8)     // Catch: java.security.GeneralSecurityException -> L9d
            r8 = r4
            goto L9e
        L9d:
            r8 = r0
        L9e:
            if (r8 == 0) goto L76
            r6.remove()
            r12.add(r7)
        La6:
            int r1 = r1 + 1
            goto L23
        Laa:
            if (r2 == 0) goto Lad
            return r12
        Lad:
            javax.net.ssl.SSLPeerUnverifiedException r11 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to find a trusted cert that signed "
            r12.<init>(r0)
            r12.append(r3)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        Lc1:
            javax.net.ssl.SSLPeerUnverifiedException r11 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Certificate chain too long: "
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o000.OooO00o.OooO(java.lang.String, java.util.List):java.util.List");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof OooO00o) && o0000O00.OooO00o.OooOOO0(((OooO00o) obj).f3948OooOO0O, this.f3948OooOO0O);
    }

    public final int hashCode() {
        return this.f3948OooOO0O.hashCode();
    }
}