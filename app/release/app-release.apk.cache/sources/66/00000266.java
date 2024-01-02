package androidx.activity;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class o000oOoO {

    /* renamed from: OooO0O0  reason: collision with root package name */
    public boolean f1951OooO0O0;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Object f1950OooO00o = new Object();

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final ArrayList f1952OooO0OO = new ArrayList();

    public o000oOoO(OooOo oooOo, OooO oooO) {
    }

    public final void OooO00o() {
        synchronized (this.f1950OooO00o) {
            this.f1951OooO0O0 = true;
            Iterator it = this.f1952OooO0OO.iterator();
            while (it.hasNext()) {
                ((o0000O0O.OooO00o) it.next()).OooO00o();
            }
            this.f1952OooO0OO.clear();
        }
    }
}