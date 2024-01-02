package o0000oOO;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o0000O00.OooO00o;
import o0000OoO.OooOO0O;
import o0000o.OooOOO;
import o0000o.OooOOO0;
import o0000o.OooOOOO;

/* loaded from: classes.dex */
public final class o00000 implements OooOOO0 {

    /* renamed from: OooO0oO  reason: collision with root package name */
    public static final List f4622OooO0oO = OooOO0O.OooOO0O("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: OooO0oo  reason: collision with root package name */
    public static final List f4623OooO0oo = OooOO0O.OooOO0O("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o0000o0o.o000OO f4624OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final OooOOOO f4625OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final o000000O f4626OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public volatile o0000oo f4627OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public volatile boolean f4628OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final o0000Oo.o0O0O00 f4629OooO0o0;

    public o00000(o0000Oo.oo0o0Oo oo0o0oo, o0000o0o.o000OO o000oo, OooOOOO oooOOOO, o000000O o000000o2) {
        OooO00o.OooOoo0(o000oo, "connection");
        this.f4624OooO00o = o000oo;
        this.f4625OooO0O0 = oooOOOO;
        this.f4626OooO0OO = o000000o2;
        o0000Oo.o0O0O00 o0o0o00 = o0000Oo.o0O0O00.f4302OooO0o;
        this.f4629OooO0o0 = oo0o0oo.f4373OooOOoo.contains(o0o0o00) ? o0o0o00 : o0000Oo.o0O0O00.f4303OooO0o0;
    }

    @Override // o0000o.OooOOO0
    public final long OooO00o(o0000Oo.o00000 o00000Var) {
        if (OooOOO.OooO00o(o00000Var)) {
            return OooOO0O.OooOO0(o00000Var);
        }
        return 0L;
    }

    @Override // o0000o.OooOOO0
    public final void OooO0O0() {
        o0000oo o0000ooVar = this.f4627OooO0Oo;
        OooO00o.OooOo(o0000ooVar);
        o0000ooVar.OooO0o().close();
    }

    @Override // o0000o.OooOOO0
    public final void OooO0OO() {
        this.f4626OooO0OO.flush();
    }

    @Override // o0000o.OooOOO0
    public final o000O000.o0ooOOo OooO0Oo(o0000Oo.o00000 o00000Var) {
        o0000oo o0000ooVar = this.f4627OooO0Oo;
        OooO00o.OooOo(o0000ooVar);
        return o0000ooVar.f4690OooO;
    }

    @Override // o0000o.OooOOO0
    public final o000O000.oo000o OooO0o(androidx.appcompat.widget.o0OOO0o o0ooo0o, long j) {
        o0000oo o0000ooVar = this.f4627OooO0Oo;
        OooO00o.OooOo(o0000ooVar);
        return o0000ooVar.OooO0o();
    }

    @Override // o0000o.OooOOO0
    public final o0000Oo.o000000O OooO0o0(boolean z) {
        o0000Oo.oo000o oo000oVar;
        o0000oo o0000ooVar = this.f4627OooO0Oo;
        if (o0000ooVar != null) {
            synchronized (o0000ooVar) {
                o0000ooVar.f4700OooOO0O.OooO0oo();
                while (o0000ooVar.f4697OooO0oO.isEmpty() && o0000ooVar.OooOOO0 == null) {
                    o0000ooVar.OooOO0();
                }
                o0000ooVar.f4700OooOO0O.OooOO0o();
                if (!o0000ooVar.f4697OooO0oO.isEmpty()) {
                    Object removeFirst = o0000ooVar.f4697OooO0oO.removeFirst();
                    OooO00o.OooOoOO(removeFirst, "headersQueue.removeFirst()");
                    oo000oVar = (o0000Oo.oo000o) removeFirst;
                } else {
                    IOException iOException = o0000ooVar.f4702OooOOO;
                    if (iOException == null) {
                        OooOo oooOo = o0000ooVar.OooOOO0;
                        OooO00o.OooOo(oooOo);
                        throw new o0000OO0(oooOo);
                    }
                    throw iOException;
                }
            }
            o0000Oo.o0O0O00 o0o0o00 = this.f4629OooO0o0;
            OooO00o.OooOoo0(o0o0o00, "protocol");
            ArrayList arrayList = new ArrayList(20);
            int length = oo000oVar.f4353OooO00o.length / 2;
            o0000o.OooOo oooOo2 = null;
            for (int i = 0; i < length; i++) {
                String OooO0oO2 = oo000oVar.OooO0oO(i);
                String OooO2 = oo000oVar.OooO(i);
                if (OooO00o.OooOOO0(OooO0oO2, ":status")) {
                    oooOo2 = o0000Oo.OooOOOO.OooOOo("HTTP/1.1 " + OooO2);
                } else if (!f4623OooO0oo.contains(OooO0oO2)) {
                    OooO00o.OooOoo0(OooO0oO2, "name");
                    OooO00o.OooOoo0(OooO2, "value");
                    arrayList.add(OooO0oO2);
                    arrayList.add(o0000Oo0.OooOOOO.o00O0oOo(OooO2).toString());
                }
            }
            if (oooOo2 != null) {
                o0000Oo.o000000O o000000o2 = new o0000Oo.o000000O();
                o000000o2.f4255OooO0O0 = o0o0o00;
                o000000o2.f4256OooO0OO = oooOo2.f4448OooO0O0;
                String str = oooOo2.f4449OooO0OO;
                OooO00o.OooOoo0(str, "message");
                o000000o2.f4257OooO0Oo = str;
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                o0000Oo.o00Ooo o00ooo2 = new o0000Oo.o00Ooo();
                ArrayList arrayList2 = o00ooo2.f4290OooO00o;
                OooO00o.OooOoo0(arrayList2, "<this>");
                OooO00o.OooOoo0(strArr, "elements");
                List asList = Arrays.asList(strArr);
                OooO00o.OooOoOO(asList, "asList(this)");
                arrayList2.addAll(asList);
                o000000o2.f4258OooO0o = o00ooo2;
                if (z && o000000o2.f4256OooO0OO == 100) {
                    return null;
                }
                return o000000o2;
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
        throw new IOException("stream wasn't created");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0117 A[Catch: all -> 0x01bf, TRY_LEAVE, TryCatch #3 {, blocks: (B:27:0x00d6, B:45:0x0120, B:46:0x0121, B:47:0x0123, B:59:0x0158, B:48:0x0124, B:50:0x0128, B:55:0x0143, B:56:0x0145, B:58:0x0154, B:80:0x01ae, B:81:0x01b5, B:28:0x00d7, B:30:0x00de, B:31:0x00e3, B:33:0x00e7, B:35:0x00fd, B:37:0x0105, B:42:0x0111, B:44:0x0117, B:85:0x01b9, B:86:0x01be), top: B:94:0x00d6 }] */
    @Override // o0000o.OooOOO0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0oO(androidx.appcompat.widget.o0OOO0o r19) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0000oOO.o00000.OooO0oO(androidx.appcompat.widget.o0OOO0o):void");
    }

    @Override // o0000o.OooOOO0
    public final o0000o0o.o000OO OooO0oo() {
        return this.f4624OooO00o;
    }

    @Override // o0000o.OooOOO0
    public final void cancel() {
        this.f4628OooO0o = true;
        o0000oo o0000ooVar = this.f4627OooO0Oo;
        if (o0000ooVar != null) {
            o0000ooVar.OooO0o0(OooOo.CANCEL);
        }
    }
}