package o0000o0O;

import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import o0000O0O.OooO00o;
import o0000OoO.OooOO0O;
import o0000o0o.o0000O;
import o0000o0o.o000OO;
import o0000oOO.o000000O;

/* loaded from: classes.dex */
public final class o0OO00O extends o0Oo0oo {

    /* renamed from: OooO0o  reason: collision with root package name */
    public final /* synthetic */ Object f4466OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final /* synthetic */ int f4467OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0OO00O(int i, Object obj, String str) {
        super(str, true);
        this.f4467OooO0o0 = i;
        this.f4466OooO0o = obj;
    }

    @Override // o0000o0O.o0Oo0oo
    public final long OooO00o() {
        int i = 0;
        switch (this.f4467OooO0o0) {
            case 0:
                ((OooO00o) this.f4466OooO0o).OooO00o();
                return -1L;
            case 1:
                o0000O o0000o2 = (o0000O) this.f4466OooO0o;
                long nanoTime = System.nanoTime();
                Iterator it = o0000o2.f4518OooO0o0.iterator();
                long j = Long.MIN_VALUE;
                o000OO o000oo = null;
                int i2 = 0;
                while (it.hasNext()) {
                    o000OO o000oo2 = (o000OO) it.next();
                    o0000O00.OooO00o.OooOoOO(o000oo2, "connection");
                    synchronized (o000oo2) {
                        if (o0000o2.OooO0O0(o000oo2, nanoTime) > 0) {
                            i2++;
                        } else {
                            i++;
                            long j2 = nanoTime - o000oo2.f4564OooOOo0;
                            if (j2 > j) {
                                o000oo = o000oo2;
                                j = j2;
                            }
                        }
                    }
                }
                long j3 = o0000o2.f4515OooO0O0;
                if (j < j3 && i <= o0000o2.f4514OooO00o) {
                    if (i > 0) {
                        return j3 - j;
                    }
                    if (i2 <= 0) {
                        return -1L;
                    }
                    return j3;
                }
                o0000O00.OooO00o.OooOo(o000oo);
                synchronized (o000oo) {
                    if (!(!o000oo.f4563OooOOOo.isEmpty()) && o000oo.f4564OooOOo0 + j == nanoTime) {
                        o000oo.f4558OooOO0 = true;
                        o0000o2.f4518OooO0o0.remove(o000oo);
                        Socket socket = o000oo.f4553OooO0Oo;
                        o0000O00.OooO00o.OooOo(socket);
                        OooOO0O.OooO0Oo(socket);
                        if (o0000o2.f4518OooO0o0.isEmpty()) {
                            o0000o2.f4516OooO0OO.OooO00o();
                        }
                    }
                }
                return 0L;
            default:
                o000000O o000000o2 = (o000000O) this.f4466OooO0o;
                o000000o2.getClass();
                try {
                    o000000o2.f4658OooOoO0.OooOoo0(2, 0, false);
                } catch (IOException e) {
                    o000000o2.OooOoO0(e);
                }
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00O(o0000O o0000o2, String str) {
        super(str, true);
        this.f4467OooO0o0 = 1;
        this.f4466OooO0o = o0000o2;
    }
}