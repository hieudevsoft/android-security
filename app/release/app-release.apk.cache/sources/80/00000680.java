package o000oOoO;

import androidx.recyclerview.widget.RecyclerView;
import com.google.crypto.tink.shaded.protobuf.o00O0OOO;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class o00O0O implements com.google.crypto.tink.shaded.protobuf.o00O0000 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public int f5077OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f5078OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f5079OooO0OO = 0;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public Object f5080OooO0Oo;

    public o00O0O(com.google.crypto.tink.shaded.protobuf.Oooo000 oooo000) {
        Charset charset = com.google.crypto.tink.shaded.protobuf.o00000.f3650OooO00o;
        this.f5080OooO0Oo = oooo000;
        oooo000.f3637OooO0O0 = this;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final void OooO(List list) {
        OoooO0O(list, true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final Object OooO00o(com.google.crypto.tink.shaded.protobuf.o0O0ooO o0o0ooo, com.google.crypto.tink.shaded.protobuf.o00Oo0 o00oo0) {
        OoooOO0(3);
        return OoooO00(o0o0ooo, o00oo0);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final float OooO0O0() {
        OoooOO0(5);
        return Float.intBitsToFloat(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0o());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final void OooO0OO(List list) {
        int OooOO0O2;
        int i;
        com.google.crypto.tink.shaded.protobuf.Oooo000 oooo000;
        int OooOO0O3;
        com.google.crypto.tink.shaded.protobuf.Oooo000 oooo0002;
        if (list instanceof com.google.crypto.tink.shaded.protobuf.o0000O0O) {
            com.google.crypto.tink.shaded.protobuf.o0000O0O o0000o0o2 = (com.google.crypto.tink.shaded.protobuf.o0000O0O) list;
            int i2 = this.f5077OooO00o & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    int OooO0oo2 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oo();
                    com.google.crypto.tink.shaded.protobuf.Oooo000 oooo0003 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
                    i = (oooo0003.f3640OooO0o - oooo0003.f3642OooO0oO) + OooO0oo2;
                    do {
                        o0000o0o2.OooO0oo(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO());
                        oooo0002 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
                    } while (oooo0002.f3640OooO0o - oooo0002.f3642OooO0oO < i);
                } else {
                    throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
                }
            } else {
                do {
                    o0000o0o2.OooO0oo(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO());
                    if (((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0OO()) {
                        return;
                    }
                    OooOO0O3 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooOO0O();
                } while (OooOO0O3 == this.f5077OooO00o);
                this.f5079OooO0OO = OooOO0O3;
                return;
            }
        } else {
            int i3 = this.f5077OooO00o & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int OooO0oo3 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oo();
                    com.google.crypto.tink.shaded.protobuf.Oooo000 oooo0004 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
                    i = (oooo0004.f3640OooO0o - oooo0004.f3642OooO0oO) + OooO0oo3;
                    do {
                        list.add(Long.valueOf(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO()));
                        oooo000 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
                    } while (oooo000.f3640OooO0o - oooo000.f3642OooO0oO < i);
                } else {
                    throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
                }
            } else {
                do {
                    list.add(Long.valueOf(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO()));
                    if (((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0OO()) {
                        return;
                    }
                    OooOO0O2 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooOO0O();
                } while (OooOO0O2 == this.f5077OooO00o);
                this.f5079OooO0OO = OooOO0O2;
                return;
            }
        }
        OoooO(i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final long OooO0Oo() {
        OoooOO0(0);
        return com.google.crypto.tink.shaded.protobuf.Oooo000.OooO0O0(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final void OooO0o(List list) {
        int OooOO0O2;
        if ((this.f5077OooO00o & 7) == 2) {
            do {
                list.add(OooOO0());
                if (((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0OO()) {
                    return;
                }
                OooOO0O2 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooOO0O();
            } while (OooOO0O2 == this.f5077OooO00o);
            this.f5079OooO0OO = OooOO0O2;
            return;
        }
        int i = com.google.crypto.tink.shaded.protobuf.o00000O.f3652OooO00o;
        throw new com.google.crypto.tink.shaded.protobuf.o00000O0();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final int OooO0o0() {
        OoooOO0(5);
        return ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final void OooO0oO(List list) {
        int OooOO0O2;
        int i;
        com.google.crypto.tink.shaded.protobuf.Oooo000 oooo000;
        int OooOO0O3;
        com.google.crypto.tink.shaded.protobuf.Oooo000 oooo0002;
        if (list instanceof com.google.crypto.tink.shaded.protobuf.o000OOo) {
            com.google.crypto.tink.shaded.protobuf.o000OOo o000ooo = (com.google.crypto.tink.shaded.protobuf.o000OOo) list;
            int i2 = this.f5077OooO00o & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    int OooO0oo2 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oo();
                    com.google.crypto.tink.shaded.protobuf.Oooo000 oooo0003 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
                    i = (oooo0003.f3640OooO0o - oooo0003.f3642OooO0oO) + OooO0oo2;
                    do {
                        o000ooo.OooO0oo(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oo());
                        oooo0002 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
                    } while (oooo0002.f3640OooO0o - oooo0002.f3642OooO0oO < i);
                } else {
                    throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
                }
            } else {
                do {
                    o000ooo.OooO0oo(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oo());
                    if (((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0OO()) {
                        return;
                    }
                    OooOO0O3 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooOO0O();
                } while (OooOO0O3 == this.f5077OooO00o);
                this.f5079OooO0OO = OooOO0O3;
                return;
            }
        } else {
            int i3 = this.f5077OooO00o & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int OooO0oo3 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oo();
                    com.google.crypto.tink.shaded.protobuf.Oooo000 oooo0004 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
                    i = (oooo0004.f3640OooO0o - oooo0004.f3642OooO0oO) + OooO0oo3;
                    do {
                        list.add(Integer.valueOf(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oo()));
                        oooo000 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
                    } while (oooo000.f3640OooO0o - oooo000.f3642OooO0oO < i);
                } else {
                    throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
                }
            } else {
                do {
                    list.add(Integer.valueOf(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oo()));
                    if (((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0OO()) {
                        return;
                    }
                    OooOO0O2 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooOO0O();
                } while (OooOO0O2 == this.f5077OooO00o);
                this.f5079OooO0OO = OooOO0O2;
                return;
            }
        }
        OoooO(i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final void OooO0oo(List list) {
        int OooOO0O2;
        com.google.crypto.tink.shaded.protobuf.Oooo000 oooo000;
        int OooOO0O3;
        com.google.crypto.tink.shaded.protobuf.Oooo000 oooo0002;
        if (list instanceof com.google.crypto.tink.shaded.protobuf.o0OoOo0) {
            com.google.crypto.tink.shaded.protobuf.o0OoOo0 o0oooo0 = (com.google.crypto.tink.shaded.protobuf.o0OoOo0) list;
            int i = this.f5077OooO00o & 7;
            if (i != 1) {
                if (i == 2) {
                    int OooO0oo2 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oo();
                    OoooOOO(OooO0oo2);
                    com.google.crypto.tink.shaded.protobuf.Oooo000 oooo0003 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
                    int i2 = (oooo0003.f3640OooO0o - oooo0003.f3642OooO0oO) + OooO0oo2;
                    do {
                        o0oooo0.OooO0oo(Double.longBitsToDouble(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oO()));
                        oooo0002 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
                    } while (oooo0002.f3640OooO0o - oooo0002.f3642OooO0oO < i2);
                    return;
                }
                int i3 = com.google.crypto.tink.shaded.protobuf.o00000O.f3652OooO00o;
                throw new com.google.crypto.tink.shaded.protobuf.o00000O0();
            }
            do {
                o0oooo0.OooO0oo(Double.longBitsToDouble(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oO()));
                if (((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0OO()) {
                    return;
                }
                OooOO0O3 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooOO0O();
            } while (OooOO0O3 == this.f5077OooO00o);
            this.f5079OooO0OO = OooOO0O3;
            return;
        }
        int i4 = this.f5077OooO00o & 7;
        if (i4 != 1) {
            if (i4 == 2) {
                int OooO0oo3 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oo();
                OoooOOO(OooO0oo3);
                com.google.crypto.tink.shaded.protobuf.Oooo000 oooo0004 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
                int i5 = (oooo0004.f3640OooO0o - oooo0004.f3642OooO0oO) + OooO0oo3;
                do {
                    list.add(Double.valueOf(Double.longBitsToDouble(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oO())));
                    oooo000 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
                } while (oooo000.f3640OooO0o - oooo000.f3642OooO0oO < i5);
                return;
            }
            int i6 = com.google.crypto.tink.shaded.protobuf.o00000O.f3652OooO00o;
            throw new com.google.crypto.tink.shaded.protobuf.o00000O0();
        }
        do {
            list.add(Double.valueOf(Double.longBitsToDouble(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oO())));
            if (((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0OO()) {
                return;
            }
            OooOO0O2 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooOO0O();
        } while (OooOO0O2 == this.f5077OooO00o);
        this.f5079OooO0OO = OooOO0O2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final com.google.crypto.tink.shaded.protobuf.OooOo00 OooOO0() {
        byte[] bArr;
        OoooOO0(2);
        com.google.crypto.tink.shaded.protobuf.Oooo000 oooo000 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
        int OooO0oo2 = oooo000.OooO0oo();
        byte[] bArr2 = oooo000.f3638OooO0OO;
        if (OooO0oo2 > 0) {
            int i = oooo000.f3639OooO0Oo;
            int i2 = oooo000.f3640OooO0o;
            if (OooO0oo2 <= i - i2) {
                com.google.crypto.tink.shaded.protobuf.OooOo00 OooO0oo3 = com.google.crypto.tink.shaded.protobuf.OooOo.OooO0oo(bArr2, i2, OooO0oo2);
                oooo000.f3640OooO0o += OooO0oo2;
                return OooO0oo3;
            }
        }
        if (OooO0oo2 == 0) {
            return com.google.crypto.tink.shaded.protobuf.OooOo.f3625OooO0O0;
        }
        if (OooO0oo2 > 0) {
            int i3 = oooo000.f3639OooO0Oo;
            int i4 = oooo000.f3640OooO0o;
            if (OooO0oo2 <= i3 - i4) {
                int i5 = OooO0oo2 + i4;
                oooo000.f3640OooO0o = i5;
                bArr = Arrays.copyOfRange(bArr2, i4, i5);
                com.google.crypto.tink.shaded.protobuf.OooOo00 oooOo00 = com.google.crypto.tink.shaded.protobuf.OooOo.f3625OooO0O0;
                return new com.google.crypto.tink.shaded.protobuf.OooOo00(bArr);
            }
        }
        if (OooO0oo2 <= 0) {
            if (OooO0oo2 == 0) {
                bArr = com.google.crypto.tink.shaded.protobuf.o00000.f3651OooO0O0;
                com.google.crypto.tink.shaded.protobuf.OooOo00 oooOo002 = com.google.crypto.tink.shaded.protobuf.OooOo.f3625OooO0O0;
                return new com.google.crypto.tink.shaded.protobuf.OooOo00(bArr);
            }
            throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0Oo();
        }
        throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final void OooOO0O(List list) {
        int OooOO0O2;
        int i;
        com.google.crypto.tink.shaded.protobuf.Oooo000 oooo000;
        int OooOO0O3;
        com.google.crypto.tink.shaded.protobuf.Oooo000 oooo0002;
        if (list instanceof com.google.crypto.tink.shaded.protobuf.o0000O0O) {
            com.google.crypto.tink.shaded.protobuf.o0000O0O o0000o0o2 = (com.google.crypto.tink.shaded.protobuf.o0000O0O) list;
            int i2 = this.f5077OooO00o & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    int OooO0oo2 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oo();
                    com.google.crypto.tink.shaded.protobuf.Oooo000 oooo0003 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
                    i = (oooo0003.f3640OooO0o - oooo0003.f3642OooO0oO) + OooO0oo2;
                    do {
                        o0000o0o2.OooO0oo(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO());
                        oooo0002 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
                    } while (oooo0002.f3640OooO0o - oooo0002.f3642OooO0oO < i);
                } else {
                    throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
                }
            } else {
                do {
                    o0000o0o2.OooO0oo(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO());
                    if (((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0OO()) {
                        return;
                    }
                    OooOO0O3 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooOO0O();
                } while (OooOO0O3 == this.f5077OooO00o);
                this.f5079OooO0OO = OooOO0O3;
                return;
            }
        } else {
            int i3 = this.f5077OooO00o & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int OooO0oo3 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oo();
                    com.google.crypto.tink.shaded.protobuf.Oooo000 oooo0004 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
                    i = (oooo0004.f3640OooO0o - oooo0004.f3642OooO0oO) + OooO0oo3;
                    do {
                        list.add(Long.valueOf(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO()));
                        oooo000 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
                    } while (oooo000.f3640OooO0o - oooo000.f3642OooO0oO < i);
                } else {
                    throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
                }
            } else {
                do {
                    list.add(Long.valueOf(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO()));
                    if (((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0OO()) {
                        return;
                    }
                    OooOO0O2 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooOO0O();
                } while (OooOO0O2 == this.f5077OooO00o);
                this.f5079OooO0OO = OooOO0O2;
                return;
            }
        }
        OoooO(i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final void OooOO0o(List list) {
        int OooOO0O2;
        int i;
        com.google.crypto.tink.shaded.protobuf.Oooo000 oooo000;
        int OooOO0O3;
        com.google.crypto.tink.shaded.protobuf.Oooo000 oooo0002;
        if (list instanceof com.google.crypto.tink.shaded.protobuf.o000OOo) {
            com.google.crypto.tink.shaded.protobuf.o000OOo o000ooo = (com.google.crypto.tink.shaded.protobuf.o000OOo) list;
            int i2 = this.f5077OooO00o & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    int OooO0oo2 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oo();
                    com.google.crypto.tink.shaded.protobuf.Oooo000 oooo0003 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
                    i = (oooo0003.f3640OooO0o - oooo0003.f3642OooO0oO) + OooO0oo2;
                    do {
                        o000ooo.OooO0oo(com.google.crypto.tink.shaded.protobuf.Oooo000.OooO00o(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oo()));
                        oooo0002 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
                    } while (oooo0002.f3640OooO0o - oooo0002.f3642OooO0oO < i);
                } else {
                    int i3 = com.google.crypto.tink.shaded.protobuf.o00000O.f3652OooO00o;
                    throw new com.google.crypto.tink.shaded.protobuf.o00000O0();
                }
            } else {
                do {
                    o000ooo.OooO0oo(com.google.crypto.tink.shaded.protobuf.Oooo000.OooO00o(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oo()));
                    if (((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0OO()) {
                        return;
                    }
                    OooOO0O3 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooOO0O();
                } while (OooOO0O3 == this.f5077OooO00o);
                this.f5079OooO0OO = OooOO0O3;
                return;
            }
        } else {
            int i4 = this.f5077OooO00o & 7;
            if (i4 != 0) {
                if (i4 == 2) {
                    int OooO0oo3 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oo();
                    com.google.crypto.tink.shaded.protobuf.Oooo000 oooo0004 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
                    i = (oooo0004.f3640OooO0o - oooo0004.f3642OooO0oO) + OooO0oo3;
                    do {
                        list.add(Integer.valueOf(com.google.crypto.tink.shaded.protobuf.Oooo000.OooO00o(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oo())));
                        oooo000 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
                    } while (oooo000.f3640OooO0o - oooo000.f3642OooO0oO < i);
                } else {
                    int i5 = com.google.crypto.tink.shaded.protobuf.o00000O.f3652OooO00o;
                    throw new com.google.crypto.tink.shaded.protobuf.o00000O0();
                }
            } else {
                do {
                    list.add(Integer.valueOf(com.google.crypto.tink.shaded.protobuf.Oooo000.OooO00o(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oo())));
                    if (((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0OO()) {
                        return;
                    }
                    OooOO0O2 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooOO0O();
                } while (OooOO0O2 == this.f5077OooO00o);
                this.f5079OooO0OO = OooOO0O2;
                return;
            }
        }
        OoooO(i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final int OooOOO() {
        OoooOO0(0);
        return ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oo();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final void OooOOO0(List list) {
        int OooOO0O2;
        int i;
        com.google.crypto.tink.shaded.protobuf.Oooo000 oooo000;
        int OooOO0O3;
        com.google.crypto.tink.shaded.protobuf.Oooo000 oooo0002;
        if (list instanceof com.google.crypto.tink.shaded.protobuf.OooOO0O) {
            com.google.crypto.tink.shaded.protobuf.OooOO0O oooOO0O = (com.google.crypto.tink.shaded.protobuf.OooOO0O) list;
            int i2 = this.f5077OooO00o & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    int OooO0oo2 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oo();
                    com.google.crypto.tink.shaded.protobuf.Oooo000 oooo0003 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
                    i = (oooo0003.f3640OooO0o - oooo0003.f3642OooO0oO) + OooO0oo2;
                    do {
                        oooOO0O.OooO0oo(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0o0());
                        oooo0002 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
                    } while (oooo0002.f3640OooO0o - oooo0002.f3642OooO0oO < i);
                } else {
                    throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
                }
            } else {
                do {
                    oooOO0O.OooO0oo(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0o0());
                    if (((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0OO()) {
                        return;
                    }
                    OooOO0O3 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooOO0O();
                } while (OooOO0O3 == this.f5077OooO00o);
                this.f5079OooO0OO = OooOO0O3;
                return;
            }
        } else {
            int i3 = this.f5077OooO00o & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int OooO0oo3 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oo();
                    com.google.crypto.tink.shaded.protobuf.Oooo000 oooo0004 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
                    i = (oooo0004.f3640OooO0o - oooo0004.f3642OooO0oO) + OooO0oo3;
                    do {
                        list.add(Boolean.valueOf(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0o0()));
                        oooo000 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
                    } while (oooo000.f3640OooO0o - oooo000.f3642OooO0oO < i);
                } else {
                    throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
                }
            } else {
                do {
                    list.add(Boolean.valueOf(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0o0()));
                    if (((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0OO()) {
                        return;
                    }
                    OooOO0O2 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooOO0O();
                } while (OooOO0O2 == this.f5077OooO00o);
                this.f5079OooO0OO = OooOO0O2;
                return;
            }
        }
        OoooO(i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final Object OooOOOO(com.google.crypto.tink.shaded.protobuf.o0O0ooO o0o0ooo, com.google.crypto.tink.shaded.protobuf.o00Oo0 o00oo0) {
        OoooOO0(2);
        return OoooO0(o0o0ooo, o00oo0);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final void OooOOOo(List list) {
        com.google.crypto.tink.shaded.protobuf.Oooo000 oooo000;
        int OooOO0O2;
        com.google.crypto.tink.shaded.protobuf.Oooo000 oooo0002;
        int OooOO0O3;
        if (list instanceof com.google.crypto.tink.shaded.protobuf.o0ooOOo) {
            com.google.crypto.tink.shaded.protobuf.o0ooOOo o0ooooo = (com.google.crypto.tink.shaded.protobuf.o0ooOOo) list;
            int i = this.f5077OooO00o & 7;
            if (i != 2) {
                if (i == 5) {
                    do {
                        o0ooooo.OooO0oo(Float.intBitsToFloat(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0o()));
                        if (((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0OO()) {
                            return;
                        }
                        OooOO0O3 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooOO0O();
                    } while (OooOO0O3 == this.f5077OooO00o);
                    this.f5079OooO0OO = OooOO0O3;
                    return;
                }
                int i2 = com.google.crypto.tink.shaded.protobuf.o00000O.f3652OooO00o;
                throw new com.google.crypto.tink.shaded.protobuf.o00000O0();
            }
            int OooO0oo2 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oo();
            o000oOoO(OooO0oo2);
            com.google.crypto.tink.shaded.protobuf.Oooo000 oooo0003 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
            int i3 = (oooo0003.f3640OooO0o - oooo0003.f3642OooO0oO) + OooO0oo2;
            do {
                o0ooooo.OooO0oo(Float.intBitsToFloat(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0o()));
                oooo0002 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
            } while (oooo0002.f3640OooO0o - oooo0002.f3642OooO0oO < i3);
            return;
        }
        int i4 = this.f5077OooO00o & 7;
        if (i4 != 2) {
            if (i4 == 5) {
                do {
                    list.add(Float.valueOf(Float.intBitsToFloat(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0o())));
                    if (((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0OO()) {
                        return;
                    }
                    OooOO0O2 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooOO0O();
                } while (OooOO0O2 == this.f5077OooO00o);
                this.f5079OooO0OO = OooOO0O2;
                return;
            }
            int i5 = com.google.crypto.tink.shaded.protobuf.o00000O.f3652OooO00o;
            throw new com.google.crypto.tink.shaded.protobuf.o00000O0();
        }
        int OooO0oo3 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oo();
        o000oOoO(OooO0oo3);
        com.google.crypto.tink.shaded.protobuf.Oooo000 oooo0004 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
        int i6 = (oooo0004.f3640OooO0o - oooo0004.f3642OooO0oO) + OooO0oo3;
        do {
            list.add(Float.valueOf(Float.intBitsToFloat(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0o())));
            oooo000 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
        } while (oooo000.f3640OooO0o - oooo000.f3642OooO0oO < i6);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final void OooOOo(List list) {
        int OooOO0O2;
        com.google.crypto.tink.shaded.protobuf.Oooo000 oooo000;
        int OooOO0O3;
        com.google.crypto.tink.shaded.protobuf.Oooo000 oooo0002;
        if (list instanceof com.google.crypto.tink.shaded.protobuf.o0000O0O) {
            com.google.crypto.tink.shaded.protobuf.o0000O0O o0000o0o2 = (com.google.crypto.tink.shaded.protobuf.o0000O0O) list;
            int i = this.f5077OooO00o & 7;
            if (i != 1) {
                if (i == 2) {
                    int OooO0oo2 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oo();
                    OoooOOO(OooO0oo2);
                    com.google.crypto.tink.shaded.protobuf.Oooo000 oooo0003 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
                    int i2 = (oooo0003.f3640OooO0o - oooo0003.f3642OooO0oO) + OooO0oo2;
                    do {
                        o0000o0o2.OooO0oo(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oO());
                        oooo0002 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
                    } while (oooo0002.f3640OooO0o - oooo0002.f3642OooO0oO < i2);
                    return;
                }
                throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
            }
            do {
                o0000o0o2.OooO0oo(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oO());
                if (((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0OO()) {
                    return;
                }
                OooOO0O3 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooOO0O();
            } while (OooOO0O3 == this.f5077OooO00o);
            this.f5079OooO0OO = OooOO0O3;
            return;
        }
        int i3 = this.f5077OooO00o & 7;
        if (i3 != 1) {
            if (i3 == 2) {
                int OooO0oo3 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oo();
                OoooOOO(OooO0oo3);
                com.google.crypto.tink.shaded.protobuf.Oooo000 oooo0004 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
                int i4 = (oooo0004.f3640OooO0o - oooo0004.f3642OooO0oO) + OooO0oo3;
                do {
                    list.add(Long.valueOf(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oO()));
                    oooo000 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
                } while (oooo000.f3640OooO0o - oooo000.f3642OooO0oO < i4);
                return;
            }
            throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
        }
        do {
            list.add(Long.valueOf(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oO()));
            if (((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0OO()) {
                return;
            }
            OooOO0O2 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooOO0O();
        } while (OooOO0O2 == this.f5077OooO00o);
        this.f5079OooO0OO = OooOO0O2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final int OooOOo0() {
        OoooOO0(0);
        return ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oo();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final int OooOOoo() {
        OoooOO0(0);
        return ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oo();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final int OooOo() {
        return this.f5077OooO00o;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final void OooOo0(List list, com.google.crypto.tink.shaded.protobuf.o0O0ooO o0o0ooo, com.google.crypto.tink.shaded.protobuf.o00Oo0 o00oo0) {
        int OooOO0O2;
        int i = this.f5077OooO00o;
        if ((i & 7) == 3) {
            do {
                list.add(OoooO00(o0o0ooo, o00oo0));
                if (!((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0OO() && this.f5079OooO0OO == 0) {
                    OooOO0O2 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooOO0O();
                } else {
                    return;
                }
            } while (OooOO0O2 == i);
            this.f5079OooO0OO = OooOO0O2;
            return;
        }
        int i2 = com.google.crypto.tink.shaded.protobuf.o00000O.f3652OooO00o;
        throw new com.google.crypto.tink.shaded.protobuf.o00000O0();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final String OooOo00() {
        OoooOO0(2);
        com.google.crypto.tink.shaded.protobuf.Oooo000 oooo000 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
        int OooO0oo2 = oooo000.OooO0oo();
        if (OooO0oo2 > 0) {
            int i = oooo000.f3639OooO0Oo;
            int i2 = oooo000.f3640OooO0o;
            if (OooO0oo2 <= i - i2) {
                String str = new String(oooo000.f3638OooO0OO, i2, OooO0oo2, com.google.crypto.tink.shaded.protobuf.o00000.f3650OooO00o);
                oooo000.f3640OooO0o += OooO0oo2;
                return str;
            }
        }
        if (OooO0oo2 == 0) {
            return "";
        }
        if (OooO0oo2 < 0) {
            throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0Oo();
        }
        throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final void OooOo0O(List list, com.google.crypto.tink.shaded.protobuf.o0O0ooO o0o0ooo, com.google.crypto.tink.shaded.protobuf.o00Oo0 o00oo0) {
        int OooOO0O2;
        int i = this.f5077OooO00o;
        if ((i & 7) == 2) {
            do {
                list.add(OoooO0(o0o0ooo, o00oo0));
                if (!((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0OO() && this.f5079OooO0OO == 0) {
                    OooOO0O2 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooOO0O();
                } else {
                    return;
                }
            } while (OooOO0O2 == i);
            this.f5079OooO0OO = OooOO0O2;
            return;
        }
        int i2 = com.google.crypto.tink.shaded.protobuf.o00000O.f3652OooO00o;
        throw new com.google.crypto.tink.shaded.protobuf.o00000O0();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final long OooOo0o() {
        OoooOO0(0);
        return ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final long OooOoO() {
        OoooOO0(0);
        return ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final String OooOoO0() {
        OoooOO0(2);
        com.google.crypto.tink.shaded.protobuf.Oooo000 oooo000 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
        int OooO0oo2 = oooo000.OooO0oo();
        if (OooO0oo2 > 0) {
            int i = oooo000.f3639OooO0Oo;
            int i2 = oooo000.f3640OooO0o;
            if (OooO0oo2 <= i - i2) {
                String OoooO02 = o00O0OOO.f3723OooO00o.OoooO0(oooo000.f3638OooO0OO, i2, OooO0oo2);
                oooo000.f3640OooO0o += OooO0oo2;
                return OoooO02;
            }
        }
        if (OooO0oo2 == 0) {
            return "";
        }
        if (OooO0oo2 <= 0) {
            throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0Oo();
        }
        throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final void OooOoOO(List list) {
        com.google.crypto.tink.shaded.protobuf.Oooo000 oooo000;
        int OooOO0O2;
        com.google.crypto.tink.shaded.protobuf.Oooo000 oooo0002;
        int OooOO0O3;
        if (list instanceof com.google.crypto.tink.shaded.protobuf.o000OOo) {
            com.google.crypto.tink.shaded.protobuf.o000OOo o000ooo = (com.google.crypto.tink.shaded.protobuf.o000OOo) list;
            int i = this.f5077OooO00o & 7;
            if (i != 2) {
                if (i == 5) {
                    do {
                        o000ooo.OooO0oo(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0o());
                        if (((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0OO()) {
                            return;
                        }
                        OooOO0O3 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooOO0O();
                    } while (OooOO0O3 == this.f5077OooO00o);
                    this.f5079OooO0OO = OooOO0O3;
                    return;
                }
                throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
            }
            int OooO0oo2 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oo();
            o000oOoO(OooO0oo2);
            com.google.crypto.tink.shaded.protobuf.Oooo000 oooo0003 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
            int i2 = (oooo0003.f3640OooO0o - oooo0003.f3642OooO0oO) + OooO0oo2;
            do {
                o000ooo.OooO0oo(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0o());
                oooo0002 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
            } while (oooo0002.f3640OooO0o - oooo0002.f3642OooO0oO < i2);
            return;
        }
        int i3 = this.f5077OooO00o & 7;
        if (i3 != 2) {
            if (i3 == 5) {
                do {
                    list.add(Integer.valueOf(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0o()));
                    if (((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0OO()) {
                        return;
                    }
                    OooOO0O2 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooOO0O();
                } while (OooOO0O2 == this.f5077OooO00o);
                this.f5079OooO0OO = OooOO0O2;
                return;
            }
            throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
        }
        int OooO0oo3 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oo();
        o000oOoO(OooO0oo3);
        com.google.crypto.tink.shaded.protobuf.Oooo000 oooo0004 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
        int i4 = (oooo0004.f3640OooO0o - oooo0004.f3642OooO0oO) + OooO0oo3;
        do {
            list.add(Integer.valueOf(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0o()));
            oooo000 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
        } while (oooo000.f3640OooO0o - oooo000.f3642OooO0oO < i4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final int OooOoo() {
        OoooOO0(5);
        return ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final long OooOoo0() {
        OoooOO0(1);
        return ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oO();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final void OooOooO(List list) {
        int OooOO0O2;
        com.google.crypto.tink.shaded.protobuf.Oooo000 oooo000;
        int OooOO0O3;
        com.google.crypto.tink.shaded.protobuf.Oooo000 oooo0002;
        if (list instanceof com.google.crypto.tink.shaded.protobuf.o0000O0O) {
            com.google.crypto.tink.shaded.protobuf.o0000O0O o0000o0o2 = (com.google.crypto.tink.shaded.protobuf.o0000O0O) list;
            int i = this.f5077OooO00o & 7;
            if (i != 1) {
                if (i == 2) {
                    int OooO0oo2 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oo();
                    OoooOOO(OooO0oo2);
                    com.google.crypto.tink.shaded.protobuf.Oooo000 oooo0003 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
                    int i2 = (oooo0003.f3640OooO0o - oooo0003.f3642OooO0oO) + OooO0oo2;
                    do {
                        o0000o0o2.OooO0oo(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oO());
                        oooo0002 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
                    } while (oooo0002.f3640OooO0o - oooo0002.f3642OooO0oO < i2);
                    return;
                }
                throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
            }
            do {
                o0000o0o2.OooO0oo(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oO());
                if (((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0OO()) {
                    return;
                }
                OooOO0O3 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooOO0O();
            } while (OooOO0O3 == this.f5077OooO00o);
            this.f5079OooO0OO = OooOO0O3;
            return;
        }
        int i3 = this.f5077OooO00o & 7;
        if (i3 != 1) {
            if (i3 == 2) {
                int OooO0oo3 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oo();
                OoooOOO(OooO0oo3);
                com.google.crypto.tink.shaded.protobuf.Oooo000 oooo0004 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
                int i4 = (oooo0004.f3640OooO0o - oooo0004.f3642OooO0oO) + OooO0oo3;
                do {
                    list.add(Long.valueOf(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oO()));
                    oooo000 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
                } while (oooo000.f3640OooO0o - oooo000.f3642OooO0oO < i4);
                return;
            }
            throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
        }
        do {
            list.add(Long.valueOf(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oO()));
            if (((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0OO()) {
                return;
            }
            OooOO0O2 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooOO0O();
        } while (OooOO0O2 == this.f5077OooO00o);
        this.f5079OooO0OO = OooOO0O2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final void OooOooo(List list) {
        int OooOO0O2;
        int i;
        com.google.crypto.tink.shaded.protobuf.Oooo000 oooo000;
        int OooOO0O3;
        com.google.crypto.tink.shaded.protobuf.Oooo000 oooo0002;
        if (list instanceof com.google.crypto.tink.shaded.protobuf.o000OOo) {
            com.google.crypto.tink.shaded.protobuf.o000OOo o000ooo = (com.google.crypto.tink.shaded.protobuf.o000OOo) list;
            int i2 = this.f5077OooO00o & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    int OooO0oo2 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oo();
                    com.google.crypto.tink.shaded.protobuf.Oooo000 oooo0003 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
                    i = (oooo0003.f3640OooO0o - oooo0003.f3642OooO0oO) + OooO0oo2;
                    do {
                        o000ooo.OooO0oo(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oo());
                        oooo0002 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
                    } while (oooo0002.f3640OooO0o - oooo0002.f3642OooO0oO < i);
                } else {
                    throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
                }
            } else {
                do {
                    o000ooo.OooO0oo(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oo());
                    if (((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0OO()) {
                        return;
                    }
                    OooOO0O3 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooOO0O();
                } while (OooOO0O3 == this.f5077OooO00o);
                this.f5079OooO0OO = OooOO0O3;
                return;
            }
        } else {
            int i3 = this.f5077OooO00o & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int OooO0oo3 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oo();
                    com.google.crypto.tink.shaded.protobuf.Oooo000 oooo0004 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
                    i = (oooo0004.f3640OooO0o - oooo0004.f3642OooO0oO) + OooO0oo3;
                    do {
                        list.add(Integer.valueOf(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oo()));
                        oooo000 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
                    } while (oooo000.f3640OooO0o - oooo000.f3642OooO0oO < i);
                } else {
                    throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
                }
            } else {
                do {
                    list.add(Integer.valueOf(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oo()));
                    if (((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0OO()) {
                        return;
                    }
                    OooOO0O2 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooOO0O();
                } while (OooOO0O2 == this.f5077OooO00o);
                this.f5079OooO0OO = OooOO0O2;
                return;
            }
        }
        OoooO(i);
    }

    public final void Oooo(RecyclerView recyclerView, boolean z) {
        boolean z2 = false;
        this.f5079OooO0OO = 0;
        int[] iArr = (int[]) this.f5080OooO0Oo;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        o000OO o000oo = recyclerView.f3154OooOO0o;
        if (recyclerView.f3153OooOO0O != null && o000oo != null && o000oo.f5005OooO) {
            if (z) {
                if (!recyclerView.f3147OooO0Oo.OooO0oO()) {
                    o000oo.OooO(recyclerView.f3153OooOO0O.OooO00o(), this);
                }
            } else {
                if (!((!recyclerView.f3158OooOOo || recyclerView.f3167OooOoO0 || recyclerView.f3147OooO0Oo.OooO0oO()) ? true : true)) {
                    o000oo.OooO0oo(this.f5077OooO00o, this.f5078OooO0O0, recyclerView.OoooOoO, this);
                }
            }
            int i = this.f5079OooO0OO;
            if (i > o000oo.f5014OooOO0) {
                o000oo.f5014OooOO0 = i;
                o000oo.f5015OooOO0O = z;
                recyclerView.f3145OooO0O0.OooOO0o();
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final void Oooo0(List list) {
        com.google.crypto.tink.shaded.protobuf.Oooo000 oooo000;
        int OooOO0O2;
        com.google.crypto.tink.shaded.protobuf.Oooo000 oooo0002;
        int OooOO0O3;
        if (list instanceof com.google.crypto.tink.shaded.protobuf.o000OOo) {
            com.google.crypto.tink.shaded.protobuf.o000OOo o000ooo = (com.google.crypto.tink.shaded.protobuf.o000OOo) list;
            int i = this.f5077OooO00o & 7;
            if (i != 2) {
                if (i == 5) {
                    do {
                        o000ooo.OooO0oo(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0o());
                        if (((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0OO()) {
                            return;
                        }
                        OooOO0O3 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooOO0O();
                    } while (OooOO0O3 == this.f5077OooO00o);
                    this.f5079OooO0OO = OooOO0O3;
                    return;
                }
                throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
            }
            int OooO0oo2 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oo();
            o000oOoO(OooO0oo2);
            com.google.crypto.tink.shaded.protobuf.Oooo000 oooo0003 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
            int i2 = (oooo0003.f3640OooO0o - oooo0003.f3642OooO0oO) + OooO0oo2;
            do {
                o000ooo.OooO0oo(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0o());
                oooo0002 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
            } while (oooo0002.f3640OooO0o - oooo0002.f3642OooO0oO < i2);
            return;
        }
        int i3 = this.f5077OooO00o & 7;
        if (i3 != 2) {
            if (i3 == 5) {
                do {
                    list.add(Integer.valueOf(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0o()));
                    if (((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0OO()) {
                        return;
                    }
                    OooOO0O2 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooOO0O();
                } while (OooOO0O2 == this.f5077OooO00o);
                this.f5079OooO0OO = OooOO0O2;
                return;
            }
            throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
        }
        int OooO0oo3 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oo();
        o000oOoO(OooO0oo3);
        com.google.crypto.tink.shaded.protobuf.Oooo000 oooo0004 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
        int i4 = (oooo0004.f3640OooO0o - oooo0004.f3642OooO0oO) + OooO0oo3;
        do {
            list.add(Integer.valueOf(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0o()));
            oooo000 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
        } while (oooo000.f3640OooO0o - oooo000.f3642OooO0oO < i4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final boolean Oooo000() {
        OoooOO0(0);
        return ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0o0();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final double Oooo00O() {
        OoooOO0(1);
        return Double.longBitsToDouble(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oO());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final void Oooo00o(List list) {
        int OooOO0O2;
        int i;
        com.google.crypto.tink.shaded.protobuf.Oooo000 oooo000;
        int OooOO0O3;
        com.google.crypto.tink.shaded.protobuf.Oooo000 oooo0002;
        if (list instanceof com.google.crypto.tink.shaded.protobuf.o000OOo) {
            com.google.crypto.tink.shaded.protobuf.o000OOo o000ooo = (com.google.crypto.tink.shaded.protobuf.o000OOo) list;
            int i2 = this.f5077OooO00o & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    int OooO0oo2 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oo();
                    com.google.crypto.tink.shaded.protobuf.Oooo000 oooo0003 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
                    i = (oooo0003.f3640OooO0o - oooo0003.f3642OooO0oO) + OooO0oo2;
                    do {
                        o000ooo.OooO0oo(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oo());
                        oooo0002 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
                    } while (oooo0002.f3640OooO0o - oooo0002.f3642OooO0oO < i);
                } else {
                    throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
                }
            } else {
                do {
                    o000ooo.OooO0oo(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oo());
                    if (((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0OO()) {
                        return;
                    }
                    OooOO0O3 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooOO0O();
                } while (OooOO0O3 == this.f5077OooO00o);
                this.f5079OooO0OO = OooOO0O3;
                return;
            }
        } else {
            int i3 = this.f5077OooO00o & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int OooO0oo3 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oo();
                    com.google.crypto.tink.shaded.protobuf.Oooo000 oooo0004 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
                    i = (oooo0004.f3640OooO0o - oooo0004.f3642OooO0oO) + OooO0oo3;
                    do {
                        list.add(Integer.valueOf(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oo()));
                        oooo000 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
                    } while (oooo000.f3640OooO0o - oooo000.f3642OooO0oO < i);
                } else {
                    throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
                }
            } else {
                do {
                    list.add(Integer.valueOf(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oo()));
                    if (((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0OO()) {
                        return;
                    }
                    OooOO0O2 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooOO0O();
                } while (OooOO0O2 == this.f5077OooO00o);
                this.f5079OooO0OO = OooOO0O2;
                return;
            }
        }
        OoooO(i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final int Oooo0O0() {
        int i = this.f5079OooO0OO;
        if (i != 0) {
            this.f5077OooO00o = i;
            this.f5079OooO0OO = 0;
        } else {
            this.f5077OooO00o = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooOO0O();
        }
        int i2 = this.f5077OooO00o;
        if (i2 == 0 || i2 == this.f5078OooO0O0) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final int Oooo0OO() {
        OoooOO0(0);
        return com.google.crypto.tink.shaded.protobuf.Oooo000.OooO00o(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oo());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final long Oooo0o() {
        OoooOO0(1);
        return ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oO();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final void Oooo0o0(List list) {
        OoooO0O(list, false);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final void Oooo0oO(List list) {
        int OooOO0O2;
        int i;
        com.google.crypto.tink.shaded.protobuf.Oooo000 oooo000;
        int OooOO0O3;
        com.google.crypto.tink.shaded.protobuf.Oooo000 oooo0002;
        if (list instanceof com.google.crypto.tink.shaded.protobuf.o0000O0O) {
            com.google.crypto.tink.shaded.protobuf.o0000O0O o0000o0o2 = (com.google.crypto.tink.shaded.protobuf.o0000O0O) list;
            int i2 = this.f5077OooO00o & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    int OooO0oo2 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oo();
                    com.google.crypto.tink.shaded.protobuf.Oooo000 oooo0003 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
                    i = (oooo0003.f3640OooO0o - oooo0003.f3642OooO0oO) + OooO0oo2;
                    do {
                        o0000o0o2.OooO0oo(com.google.crypto.tink.shaded.protobuf.Oooo000.OooO0O0(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO()));
                        oooo0002 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
                    } while (oooo0002.f3640OooO0o - oooo0002.f3642OooO0oO < i);
                } else {
                    int i3 = com.google.crypto.tink.shaded.protobuf.o00000O.f3652OooO00o;
                    throw new com.google.crypto.tink.shaded.protobuf.o00000O0();
                }
            } else {
                do {
                    o0000o0o2.OooO0oo(com.google.crypto.tink.shaded.protobuf.Oooo000.OooO0O0(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO()));
                    if (((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0OO()) {
                        return;
                    }
                    OooOO0O3 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooOO0O();
                } while (OooOO0O3 == this.f5077OooO00o);
                this.f5079OooO0OO = OooOO0O3;
                return;
            }
        } else {
            int i4 = this.f5077OooO00o & 7;
            if (i4 != 0) {
                if (i4 == 2) {
                    int OooO0oo3 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oo();
                    com.google.crypto.tink.shaded.protobuf.Oooo000 oooo0004 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
                    i = (oooo0004.f3640OooO0o - oooo0004.f3642OooO0oO) + OooO0oo3;
                    do {
                        list.add(Long.valueOf(com.google.crypto.tink.shaded.protobuf.Oooo000.OooO0O0(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO())));
                        oooo000 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
                    } while (oooo000.f3640OooO0o - oooo000.f3642OooO0oO < i);
                } else {
                    int i5 = com.google.crypto.tink.shaded.protobuf.o00000O.f3652OooO00o;
                    throw new com.google.crypto.tink.shaded.protobuf.o00000O0();
                }
            } else {
                do {
                    list.add(Long.valueOf(com.google.crypto.tink.shaded.protobuf.Oooo000.OooO0O0(((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO())));
                    if (((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0OO()) {
                        return;
                    }
                    OooOO0O2 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooOO0O();
                } while (OooOO0O2 == this.f5077OooO00o);
                this.f5079OooO0OO = OooOO0O2;
                return;
            }
        }
        OoooO(i);
    }

    public final void Oooo0oo(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i3 = this.f5079OooO0OO * 2;
        Object obj = this.f5080OooO0Oo;
        if (((int[]) obj) == null) {
            int[] iArr = new int[4];
            this.f5080OooO0Oo = iArr;
            Arrays.fill(iArr, -1);
        } else if (i3 >= ((int[]) obj).length) {
            int[] iArr2 = (int[]) obj;
            int[] iArr3 = new int[i3 * 2];
            this.f5080OooO0Oo = iArr3;
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
        }
        Object obj2 = this.f5080OooO0Oo;
        ((int[]) obj2)[i3] = i;
        ((int[]) obj2)[i3 + 1] = i2;
        this.f5079OooO0OO++;
    }

    public final void OoooO(int i) {
        com.google.crypto.tink.shaded.protobuf.Oooo000 oooo000 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
        if (oooo000.f3640OooO0o - oooo000.f3642OooO0oO == i) {
            return;
        }
        throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0o();
    }

    public final Object OoooO0(com.google.crypto.tink.shaded.protobuf.o0O0ooO o0o0ooo, com.google.crypto.tink.shaded.protobuf.o00Oo0 o00oo0) {
        int OooO0oo2 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0oo();
        com.google.crypto.tink.shaded.protobuf.Oooo000 oooo000 = (com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo;
        int i = oooo000.f3636OooO00o;
        oooo000.getClass();
        if (i < 100) {
            int OooO0Oo2 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0Oo(OooO0oo2);
            Object OooO0Oo3 = o0o0ooo.OooO0Oo();
            ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).f3636OooO00o++;
            o0o0ooo.OooO0o(OooO0Oo3, this, o00oo0);
            o0o0ooo.OooO0oO(OooO0Oo3);
            Object obj = this.f5080OooO0Oo;
            if (((com.google.crypto.tink.shaded.protobuf.Oooo000) obj).f3643OooO0oo == 0) {
                com.google.crypto.tink.shaded.protobuf.Oooo000 oooo0002 = (com.google.crypto.tink.shaded.protobuf.Oooo000) obj;
                oooo0002.f3636OooO00o--;
                oooo0002.f3635OooO = OooO0Oo2;
                int i2 = oooo0002.f3639OooO0Oo + oooo0002.f3641OooO0o0;
                oooo0002.f3639OooO0Oo = i2;
                int i3 = i2 - oooo0002.f3642OooO0oO;
                if (i3 > OooO0Oo2) {
                    int i4 = i3 - OooO0Oo2;
                    oooo0002.f3641OooO0o0 = i4;
                    oooo0002.f3639OooO0Oo = i2 - i4;
                } else {
                    oooo0002.f3641OooO0o0 = 0;
                }
                return OooO0Oo3;
            }
            throw new com.google.crypto.tink.shaded.protobuf.o00000O("Protocol message end-group tag did not match expected tag.");
        }
        throw new com.google.crypto.tink.shaded.protobuf.o00000O("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public final Object OoooO00(com.google.crypto.tink.shaded.protobuf.o0O0ooO o0o0ooo, com.google.crypto.tink.shaded.protobuf.o00Oo0 o00oo0) {
        int i = this.f5078OooO0O0;
        this.f5078OooO0O0 = ((this.f5077OooO00o >>> 3) << 3) | 4;
        try {
            Object OooO0Oo2 = o0o0ooo.OooO0Oo();
            o0o0ooo.OooO0o(OooO0Oo2, this, o00oo0);
            o0o0ooo.OooO0oO(OooO0Oo2);
            if (this.f5077OooO00o == this.f5078OooO0O0) {
                return OooO0Oo2;
            }
            throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0o0();
        } finally {
            this.f5078OooO0O0 = i;
        }
    }

    public final void OoooO0O(List list, boolean z) {
        String OooOo002;
        int OooOO0O2;
        int OooOO0O3;
        if ((this.f5077OooO00o & 7) == 2) {
            if ((list instanceof com.google.crypto.tink.shaded.protobuf.o0000) && !z) {
                com.google.crypto.tink.shaded.protobuf.o0000 o0000Var = (com.google.crypto.tink.shaded.protobuf.o0000) list;
                do {
                    o0000Var.OooO0o0(OooOO0());
                    if (((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0OO()) {
                        return;
                    }
                    OooOO0O3 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooOO0O();
                } while (OooOO0O3 == this.f5077OooO00o);
                this.f5079OooO0OO = OooOO0O3;
                return;
            }
            do {
                if (z) {
                    OooOo002 = OooOoO0();
                } else {
                    OooOo002 = OooOo00();
                }
                list.add(OooOo002);
                if (((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooO0OO()) {
                    return;
                }
                OooOO0O2 = ((com.google.crypto.tink.shaded.protobuf.Oooo000) this.f5080OooO0Oo).OooOO0O();
            } while (OooOO0O2 == this.f5077OooO00o);
            this.f5079OooO0OO = OooOO0O2;
            return;
        }
        int i = com.google.crypto.tink.shaded.protobuf.o00000O.f3652OooO00o;
        throw new com.google.crypto.tink.shaded.protobuf.o00000O0();
    }

    public final void OoooOO0(int i) {
        if ((this.f5077OooO00o & 7) != i) {
            throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
        }
    }

    public final void OoooOOO(int i) {
        if ((i & 7) != 0) {
            throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0o0();
        }
    }

    public final void o000oOoO(int i) {
        if ((i & 3) != 0) {
            throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0o0();
        }
    }
}