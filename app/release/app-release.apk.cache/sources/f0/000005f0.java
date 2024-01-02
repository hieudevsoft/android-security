package o0000oOO;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import o00000.o000;
import o0000O00.OooO00o;
import o0000Oo.OooOOOO;
import o0000OoO.OooOO0O;
import o000O000.OooOO0;
import o000O000.OooOOO;
import o000O000.OooOOO0;

/* loaded from: classes.dex */
public final class o00000O implements Closeable {

    /* renamed from: OooO0o  reason: collision with root package name */
    public static final Logger f4660OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public static final OooOOOO f4661OooO0o0 = new OooOOOO(29, 0);

    /* renamed from: OooO00o  reason: collision with root package name */
    public final OooOOO0 f4662OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final boolean f4663OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final o00000O0 f4664OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final Oooo0 f4665OooO0Oo;

    static {
        Logger logger = Logger.getLogger(o00O0O.class.getName());
        OooO00o.OooOoOO(logger, "getLogger(Http2::class.java.name)");
        f4660OooO0o = logger;
    }

    public o00000O(OooOOO0 oooOOO0, boolean z) {
        this.f4662OooO00o = oooOOO0;
        this.f4663OooO0O0 = z;
        o00000O0 o00000o02 = new o00000O0(oooOOO0);
        this.f4664OooO0OO = o00000o02;
        this.f4665OooO0Oo = new Oooo0(o00000o02);
    }

    public final boolean OooOo(boolean z, o0Oo0oo o0oo0oo) {
        boolean z2;
        boolean z3;
        int i;
        int i2;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i3;
        OooOo oooOo;
        boolean z8;
        o000000O o000000o2;
        int OooOo0o2;
        String OooO0oo2;
        OooO00o.OooOoo0(o0oo0oo, "handler");
        int i4 = 0;
        try {
            this.f4662OooO00o.OooO0oo(9L);
            int OooOOoo2 = OooOO0O.OooOOoo(this.f4662OooO00o);
            if (OooOOoo2 <= 16384) {
                int OooOo0O2 = this.f4662OooO00o.OooOo0O() & 255;
                int OooOo0O3 = this.f4662OooO00o.OooOo0O() & 255;
                int OooOo0o3 = this.f4662OooO00o.OooOo0o() & Integer.MAX_VALUE;
                Logger logger = f4660OooO0o;
                boolean z9 = true;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(o00O0O.OooO00o(OooOo0o3, OooOOoo2, OooOo0O2, OooOo0O3, true));
                }
                if (z && OooOo0O2 != 4) {
                    StringBuilder sb = new StringBuilder("Expected a SETTINGS frame but was ");
                    String[] strArr = o00O0O.f4716OooO0O0;
                    if (OooOo0O2 < strArr.length) {
                        OooO0oo2 = strArr[OooOo0O2];
                    } else {
                        OooO0oo2 = OooOO0O.OooO0oo("0x%02x", Integer.valueOf(OooOo0O2));
                    }
                    sb.append(OooO0oo2);
                    throw new IOException(sb.toString());
                }
                switch (OooOo0O2) {
                    case 0:
                        if (OooOo0o3 != 0) {
                            if ((OooOo0O3 & 1) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if ((OooOo0O3 & 32) != 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (!z3) {
                                if ((OooOo0O3 & 8) != 0) {
                                    i = this.f4662OooO00o.OooOo0O() & 255;
                                } else {
                                    i = 0;
                                }
                                int OooOOOo2 = OooOOOO.OooOOOo(OooOOoo2, OooOo0O3, i);
                                OooOOO0 oooOOO0 = this.f4662OooO00o;
                                OooO00o.OooOoo0(oooOOO0, "source");
                                o0oo0oo.f4743OooO0O0.getClass();
                                if (OooOo0o3 == 0 || (OooOo0o3 & 1) != 0) {
                                    z9 = false;
                                }
                                if (z9) {
                                    o000000O o000000o3 = o0oo0oo.f4743OooO0O0;
                                    o000000o3.getClass();
                                    OooOO0 oooOO0 = new OooOO0();
                                    long j = OooOOOo2;
                                    oooOOO0.OooO0oo(j);
                                    oooOOO0.OooO0o0(oooOO0, j);
                                    i2 = i;
                                    o000000o3.f4643OooOO0.OooO0OO(new o0OO00O(o000000o3.f4638OooO0Oo + '[' + OooOo0o3 + "] onData", o000000o3, OooOo0o3, oooOO0, OooOOOo2, z2), 0L);
                                } else {
                                    i2 = i;
                                    o0000oo OooOoO2 = o0oo0oo.f4743OooO0O0.OooOoO(OooOo0o3);
                                    if (OooOoO2 == null) {
                                        o0oo0oo.f4743OooO0O0.OooOooo(OooOo0o3, OooOo.PROTOCOL_ERROR);
                                        long j2 = OooOOOo2;
                                        o0oo0oo.f4743OooO0O0.OooOoo(j2);
                                        oooOOO0.OooOOO(j2);
                                    } else {
                                        o0000 o0000Var = OooOoO2.f4690OooO;
                                        long j3 = OooOOOo2;
                                        o0000Var.getClass();
                                        long j4 = 0;
                                        long j5 = j3;
                                        while (true) {
                                            if (j5 > j4) {
                                                synchronized (o0000Var.f4620OooO0o) {
                                                    z4 = o0000Var.f4617OooO0O0;
                                                    if (o0000Var.f4619OooO0Oo.f4823OooO0O0 + j5 > o0000Var.f4616OooO00o) {
                                                        z5 = true;
                                                    } else {
                                                        z5 = false;
                                                    }
                                                }
                                                if (z5) {
                                                    oooOOO0.OooOOO(j5);
                                                    o0000Var.f4620OooO0o.OooO0o0(OooOo.FLOW_CONTROL_ERROR);
                                                } else if (z4) {
                                                    oooOOO0.OooOOO(j5);
                                                } else {
                                                    long OooO0o02 = oooOOO0.OooO0o0(o0000Var.f4618OooO0OO, j5);
                                                    if (OooO0o02 != -1) {
                                                        j5 -= OooO0o02;
                                                        o0000oo o0000ooVar = o0000Var.f4620OooO0o;
                                                        synchronized (o0000ooVar) {
                                                            if (o0000Var.f4621OooO0o0) {
                                                                OooOO0 oooOO02 = o0000Var.f4618OooO0OO;
                                                                oooOO02.OooOOO(oooOO02.f4823OooO0O0);
                                                                j4 = 0;
                                                            } else {
                                                                OooOO0 oooOO03 = o0000Var.f4619OooO0Oo;
                                                                if (oooOO03.f4823OooO0O0 == 0) {
                                                                    z6 = true;
                                                                } else {
                                                                    z6 = false;
                                                                }
                                                                oooOO03.Oooo00O(o0000Var.f4618OooO0OO);
                                                                if (z6) {
                                                                    o0000ooVar.notifyAll();
                                                                }
                                                                j4 = 0;
                                                            }
                                                        }
                                                    } else {
                                                        throw new EOFException();
                                                    }
                                                }
                                            } else {
                                                byte[] bArr = OooOO0O.f4403OooO00o;
                                                o0000Var.f4620OooO0o.f4692OooO0O0.OooOoo(j3);
                                            }
                                        }
                                        if (z2) {
                                            OooOoO2.OooO(OooOO0O.f4404OooO0O0, true);
                                        }
                                    }
                                }
                                this.f4662OooO00o.OooOOO(i2);
                                break;
                            } else {
                                throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
                            }
                        } else {
                            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
                        }
                    case 1:
                        if (OooOo0o3 != 0) {
                            if ((OooOo0O3 & 1) != 0) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if ((OooOo0O3 & 8) != 0) {
                                i3 = this.f4662OooO00o.OooOo0O() & 255;
                            } else {
                                i3 = 0;
                            }
                            if ((OooOo0O3 & 32) != 0) {
                                OooOOO0 oooOOO02 = this.f4662OooO00o;
                                oooOOO02.OooOo0o();
                                oooOOO02.OooOo0O();
                                OooOOoo2 -= 5;
                            }
                            List OooOoOO2 = OooOoOO(OooOOOO.OooOOOo(OooOOoo2, OooOo0O3, i3), i3, OooOo0O3, OooOo0o3);
                            o0oo0oo.f4743OooO0O0.getClass();
                            if (OooOo0o3 != 0 && (OooOo0o3 & 1) == 0) {
                                i4 = 1;
                            }
                            o000000O o000000o4 = o0oo0oo.f4743OooO0O0;
                            if (i4 != 0) {
                                o000000o4.getClass();
                                o000000o4.f4643OooOO0.OooO0OO(new oo0o0Oo(o000000o4.f4638OooO0Oo + '[' + OooOo0o3 + "] onHeaders", o000000o4, OooOo0o3, OooOoOO2, z7), 0L);
                                return true;
                            }
                            synchronized (o000000o4) {
                                o0000oo OooOoO3 = o000000o4.OooOoO(OooOo0o3);
                                if (OooOoO3 == null) {
                                    if (!o000000o4.f4641OooO0oO && OooOo0o3 > o000000o4.f4640OooO0o0 && OooOo0o3 % 2 != o000000o4.f4639OooO0o % 2) {
                                        o0000oo o0000ooVar2 = new o0000oo(OooOo0o3, o000000o4, false, z7, OooOO0O.OooOo0(OooOoOO2));
                                        o000000o4.f4640OooO0o0 = OooOo0o3;
                                        o000000o4.f4637OooO0OO.put(Integer.valueOf(OooOo0o3), o0000ooVar2);
                                        o000000o4.f4642OooO0oo.OooO0o().OooO0OO(new o00oO0o(o000000o4.f4638OooO0Oo + '[' + OooOo0o3 + "] onStream", o000000o4, o0000ooVar2, 1), 0L);
                                    }
                                    return true;
                                }
                                OooOoO3.OooO(OooOO0O.OooOo0(OooOoOO2), z7);
                                return true;
                            }
                        }
                        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
                    case 2:
                        if (OooOOoo2 == 5) {
                            if (OooOo0o3 != 0) {
                                OooOOO0 oooOOO03 = this.f4662OooO00o;
                                oooOOO03.OooOo0o();
                                oooOOO03.OooOo0O();
                                return true;
                            }
                            throw new IOException("TYPE_PRIORITY streamId == 0");
                        }
                        throw new IOException("TYPE_PRIORITY length: " + OooOOoo2 + " != 5");
                    case 3:
                        if (OooOOoo2 == 4) {
                            if (OooOo0o3 != 0) {
                                int OooOo0o4 = this.f4662OooO00o.OooOo0o();
                                OooOo[] values = OooOo.values();
                                int length = values.length;
                                int i5 = 0;
                                while (true) {
                                    if (i5 < length) {
                                        OooOo oooOo2 = values[i5];
                                        if (oooOo2.f4598OooO00o == OooOo0o4) {
                                            z8 = true;
                                        } else {
                                            z8 = false;
                                        }
                                        if (z8) {
                                            oooOo = oooOo2;
                                        } else {
                                            i5++;
                                        }
                                    } else {
                                        oooOo = null;
                                    }
                                }
                                if (oooOo != null) {
                                    o000000O o000000o5 = o0oo0oo.f4743OooO0O0;
                                    o000000o5.getClass();
                                    if (OooOo0o3 != 0 && (OooOo0o3 & 1) == 0) {
                                        i4 = 1;
                                    }
                                    if (i4 != 0) {
                                        o000000o5.f4643OooOO0.OooO0OO(new o0O0O00(o000000o5.f4638OooO0Oo + '[' + OooOo0o3 + "] onReset", o000000o5, OooOo0o3, oooOo, 0), 0L);
                                        return true;
                                    }
                                    o0000oo OooOoOO3 = o000000o5.OooOoOO(OooOo0o3);
                                    if (OooOoOO3 == null) {
                                        return true;
                                    }
                                    synchronized (OooOoOO3) {
                                        if (OooOoOO3.OooOOO0 == null) {
                                            OooOoOO3.OooOOO0 = oooOo;
                                            OooOoOO3.notifyAll();
                                        }
                                    }
                                    return true;
                                }
                                throw new IOException(OooO0O0.OooO00o.OooO0O0("TYPE_RST_STREAM unexpected error code: ", OooOo0o4));
                            }
                            throw new IOException("TYPE_RST_STREAM streamId == 0");
                        }
                        throw new IOException("TYPE_RST_STREAM length: " + OooOOoo2 + " != 4");
                    case 4:
                        if (OooOo0o3 == 0) {
                            if ((OooOo0O3 & 1) != 0) {
                                if (OooOOoo2 == 0) {
                                    return true;
                                }
                                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                            } else if (OooOOoo2 % 6 == 0) {
                                o0000O o0000o2 = new o0000O();
                                o0000OO.OooO00o o000ooO = OooO00o.o000ooO(OooO00o.o00oOoo(0, OooOOoo2), 6);
                                int i6 = o000ooO.f4156OooO00o;
                                int i7 = o000ooO.f4157OooO0O0;
                                int i8 = o000ooO.f4158OooO0OO;
                                if ((i8 > 0 && i6 <= i7) || (i8 < 0 && i7 <= i6)) {
                                    while (true) {
                                        OooOOO0 oooOOO04 = this.f4662OooO00o;
                                        short OooOOo02 = oooOOO04.OooOOo0();
                                        byte[] bArr2 = OooOO0O.f4403OooO00o;
                                        int i9 = OooOOo02 & 65535;
                                        OooOo0o2 = oooOOO04.OooOo0o();
                                        if (i9 != 2) {
                                            if (i9 != 3) {
                                                if (i9 != 4) {
                                                    if (i9 == 5 && (OooOo0o2 < 16384 || OooOo0o2 > 16777215)) {
                                                    }
                                                } else if (OooOo0o2 >= 0) {
                                                    i9 = 7;
                                                } else {
                                                    throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                                }
                                            } else {
                                                i9 = 4;
                                            }
                                        } else if (OooOo0o2 != 0 && OooOo0o2 != 1) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                        }
                                        o0000o2.OooO0O0(i9, OooOo0o2);
                                        if (i6 != i7) {
                                            i6 += i8;
                                        }
                                    }
                                    throw new IOException(OooO0O0.OooO00o.OooO0O0("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", OooOo0o2));
                                }
                                o0oo0oo.f4743OooO0O0.f4634OooO.OooO0OO(new o0OOO0o(o000000o2.f4638OooO0Oo + " applyAndAckSettings", o0oo0oo, o0000o2), 0L);
                                return true;
                            } else {
                                throw new IOException(OooO0O0.OooO00o.OooO0O0("TYPE_SETTINGS length % 6 != 0: ", OooOOoo2));
                            }
                        }
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                        if (OooOo0o3 != 0) {
                            if ((OooOo0O3 & 8) != 0) {
                                i4 = this.f4662OooO00o.OooOo0O() & 255;
                            }
                            int OooOo0o5 = this.f4662OooO00o.OooOo0o() & Integer.MAX_VALUE;
                            List OooOoOO4 = OooOoOO(OooOOOO.OooOOOo(OooOOoo2 - 4, OooOo0O3, i4), i4, OooOo0O3, OooOo0o3);
                            o000000O o000000o6 = o0oo0oo.f4743OooO0O0;
                            o000000o6.getClass();
                            synchronized (o000000o6) {
                                if (o000000o6.f4659OooOoOO.contains(Integer.valueOf(OooOo0o5))) {
                                    o000000o6.OooOooo(OooOo0o5, OooOo.PROTOCOL_ERROR);
                                } else {
                                    o000000o6.f4659OooOoOO.add(Integer.valueOf(OooOo0o5));
                                    o000000o6.f4643OooOO0.OooO0OO(new o0O0O00(o000000o6.f4638OooO0Oo + '[' + OooOo0o5 + "] onRequest", o000000o6, OooOo0o5, OooOoOO4, 2), 0L);
                                }
                            }
                            return true;
                        }
                        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
                    case 6:
                        OooOoo0(o0oo0oo, OooOOoo2, OooOo0O3, OooOo0o3);
                        return true;
                    case 7:
                        OooOoO(o0oo0oo, OooOOoo2, OooOo0o3);
                        return true;
                    case 8:
                        OooOoo(o0oo0oo, OooOOoo2, OooOo0o3);
                        return true;
                    default:
                        this.f4662OooO00o.OooOOO(OooOOoo2);
                        break;
                }
                return true;
            }
            throw new IOException(OooO0O0.OooO00o.OooO0O0("FRAME_SIZE_ERROR: ", OooOOoo2));
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void OooOoO(o0Oo0oo o0oo0oo, int i, int i2) {
        OooOo oooOo;
        Object[] array;
        o0000oo[] o0000ooVarArr;
        boolean z;
        if (i >= 8) {
            if (i2 == 0) {
                int OooOo0o2 = this.f4662OooO00o.OooOo0o();
                int OooOo0o3 = this.f4662OooO00o.OooOo0o();
                int i3 = i - 8;
                OooOo[] values = OooOo.values();
                int length = values.length;
                int i4 = 0;
                while (true) {
                    if (i4 < length) {
                        oooOo = values[i4];
                        if (oooOo.f4598OooO00o == OooOo0o3) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            break;
                        }
                        i4++;
                    } else {
                        oooOo = null;
                        break;
                    }
                }
                if (oooOo != null) {
                    OooOOO oooOOO = OooOOO.f4824OooO0Oo;
                    if (i3 > 0) {
                        oooOOO = this.f4662OooO00o.OooOO0(i3);
                    }
                    o0oo0oo.getClass();
                    OooO00o.OooOoo0(oooOOO, "debugData");
                    oooOOO.OooO0OO();
                    o000000O o000000o2 = o0oo0oo.f4743OooO0O0;
                    synchronized (o000000o2) {
                        array = o000000o2.f4637OooO0OO.values().toArray(new o0000oo[0]);
                        o000000o2.f4641OooO0oO = true;
                    }
                    for (o0000oo o0000ooVar : (o0000oo[]) array) {
                        if (o0000ooVar.f4691OooO00o > OooOo0o2 && o0000ooVar.OooO0oO()) {
                            OooOo oooOo2 = OooOo.REFUSED_STREAM;
                            synchronized (o0000ooVar) {
                                if (o0000ooVar.OooOOO0 == null) {
                                    o0000ooVar.OooOOO0 = oooOo2;
                                    o0000ooVar.notifyAll();
                                }
                            }
                            o0oo0oo.f4743OooO0O0.OooOoOO(o0000ooVar.f4691OooO00o);
                        }
                    }
                    return;
                }
                throw new IOException(OooO0O0.OooO00o.OooO0O0("TYPE_GOAWAY unexpected error code: ", OooOo0o3));
            }
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        throw new IOException(OooO0O0.OooO00o.OooO0O0("TYPE_GOAWAY length < 8: ", i));
    }

    public final void OooOoO0(o0Oo0oo o0oo0oo) {
        OooO00o.OooOoo0(o0oo0oo, "handler");
        if (this.f4663OooO0O0) {
            if (!OooOo(true, o0oo0oo)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        OooOOO oooOOO = o00O0O.f4715OooO00o;
        OooOOO OooOO02 = this.f4662OooO00o.OooOO0(oooOOO.f4825OooO00o.length);
        Level level = Level.FINE;
        Logger logger = f4660OooO0o;
        if (logger.isLoggable(level)) {
            logger.fine(OooOO0O.OooO0oo("<< CONNECTION " + OooOO02.OooO0Oo(), new Object[0]));
        }
        if (OooO00o.OooOOO0(oooOOO, OooOO02)) {
            return;
        }
        throw new IOException("Expected a connection header but was ".concat(OooOO02.OooOO0()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f1, code lost:
        throw new java.io.IOException("Invalid dynamic table size update " + r3.f4600OooO0O0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List OooOoOO(int r3, int r4, int r5, int r6) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0000oOO.o00000O.OooOoOO(int, int, int, int):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOoo(o0Oo0oo o0oo0oo, int i, int i2) {
        o0000oo o0000ooVar;
        if (i == 4) {
            int OooOo0o2 = this.f4662OooO00o.OooOo0o();
            byte[] bArr = OooOO0O.f4403OooO00o;
            long j = OooOo0o2 & 2147483647L;
            int i3 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i3 != 0) {
                if (i2 == 0) {
                    o000000O o000000o2 = o0oo0oo.f4743OooO0O0;
                    synchronized (o000000o2) {
                        o000000o2.f4656OooOo0o += j;
                        o000000o2.notifyAll();
                        o0000ooVar = o000000o2;
                    }
                } else {
                    o0000oo OooOoO2 = o0oo0oo.f4743OooO0O0.OooOoO(i2);
                    if (OooOoO2 != null) {
                        synchronized (OooOoO2) {
                            OooOoO2.f4695OooO0o += j;
                            o0000ooVar = OooOoO2;
                            if (i3 > 0) {
                                OooOoO2.notifyAll();
                                o0000ooVar = OooOoO2;
                            }
                        }
                    } else {
                        return;
                    }
                }
                return;
            }
            throw new IOException("windowSizeIncrement was 0");
        }
        throw new IOException(OooO0O0.OooO00o.OooO0O0("TYPE_WINDOW_UPDATE length !=4: ", i));
    }

    public final void OooOoo0(o0Oo0oo o0oo0oo, int i, int i2, int i3) {
        boolean z;
        if (i == 8) {
            if (i3 == 0) {
                int OooOo0o2 = this.f4662OooO00o.OooOo0o();
                int OooOo0o3 = this.f4662OooO00o.OooOo0o();
                if ((i2 & 1) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    o000000O o000000o2 = o0oo0oo.f4743OooO0O0;
                    synchronized (o000000o2) {
                        if (OooOo0o2 != 1) {
                            if (OooOo0o2 != 2) {
                                if (OooOo0o2 == 3) {
                                    o000000o2.notifyAll();
                                }
                            } else {
                                o000000o2.f4648OooOOOo++;
                            }
                        } else {
                            o000000o2.f4646OooOOO++;
                        }
                    }
                    return;
                }
                o0oo0oo.f4743OooO0O0.f4634OooO.OooO0OO(new o0ooOOo(o0oo0oo.f4743OooO0O0.f4638OooO0Oo + " ping", o0oo0oo.f4743OooO0O0, OooOo0o2, OooOo0o3), 0L);
                return;
            }
            throw new IOException("TYPE_PING streamId != 0");
        }
        throw new IOException(OooO0O0.OooO00o.OooO0O0("TYPE_PING length != 8: ", i));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f4662OooO00o.close();
    }
}