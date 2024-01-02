package o000oOoO;

import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.crypto.tink.shaded.protobuf.o00O0OOO;
import java.util.List;

/* loaded from: classes.dex */
public final class o000O0Oo implements com.google.crypto.tink.shaded.protobuf.o00O0000 {

    /* renamed from: OooO0o0  reason: collision with root package name */
    public int f4999OooO0o0 = -1;

    /* renamed from: OooO00o  reason: collision with root package name */
    public boolean f4994OooO00o = false;

    /* renamed from: OooO0o  reason: collision with root package name */
    public int f4998OooO0o = 0;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f4995OooO0O0 = 0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f4996OooO0OO = 0;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public int f4997OooO0Oo = Integer.MIN_VALUE;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public Object f5000OooO0oO = null;

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final void OooO(List list) {
        OoooOO0(list, true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final Object OooO00o(com.google.crypto.tink.shaded.protobuf.o0O0ooO o0o0ooo, com.google.crypto.tink.shaded.protobuf.o00Oo0 o00oo0) {
        OoooOoo(3);
        return Oooo(o0o0ooo, o00oo0);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final float OooO0O0() {
        OoooOoo(5);
        OoooOo0(4);
        return Float.intBitsToFloat(OoooO00());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final void OooO0OO(List list) {
        int i;
        int o000oOoO2;
        int i2;
        if (list instanceof com.google.crypto.tink.shaded.protobuf.o0000O0O) {
            com.google.crypto.tink.shaded.protobuf.o0000O0O o0000o0o2 = (com.google.crypto.tink.shaded.protobuf.o0000O0O) list;
            int i3 = this.f4999OooO0o0 & 7;
            if (i3 == 0) {
                do {
                    o0000o0o2.OooO0oo(OooOoO());
                    if (Oooo0oo()) {
                        return;
                    }
                    i2 = this.f4995OooO0O0;
                } while (o000oOoO() == this.f4999OooO0o0);
                this.f4995OooO0O0 = i2;
                return;
            } else if (i3 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
            } else {
                o000oOoO2 = this.f4995OooO0O0 + o000oOoO();
                while (this.f4995OooO0O0 < o000oOoO2) {
                    o0000o0o2.OooO0oo(OoooOOO());
                }
            }
        } else {
            int i4 = this.f4999OooO0o0 & 7;
            if (i4 == 0) {
                do {
                    list.add(Long.valueOf(OooOoO()));
                    if (Oooo0oo()) {
                        return;
                    }
                    i = this.f4995OooO0O0;
                } while (o000oOoO() == this.f4999OooO0o0);
                this.f4995OooO0O0 = i;
                return;
            } else if (i4 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
            } else {
                o000oOoO2 = this.f4995OooO0O0 + o000oOoO();
                while (this.f4995OooO0O0 < o000oOoO2) {
                    list.add(Long.valueOf(OoooOOO()));
                }
            }
        }
        OoooOoO(o000oOoO2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final long OooO0Oo() {
        OoooOoo(0);
        return com.google.crypto.tink.shaded.protobuf.Oooo000.OooO0O0(OoooOOO());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final void OooO0o(List list) {
        int i;
        if ((this.f4999OooO0o0 & 7) == 2) {
            do {
                list.add(OooOO0());
                if (Oooo0oo()) {
                    return;
                }
                i = this.f4995OooO0O0;
            } while (o000oOoO() == this.f4999OooO0o0);
            this.f4995OooO0O0 = i;
            return;
        }
        int i2 = com.google.crypto.tink.shaded.protobuf.o00000O.f3652OooO00o;
        throw new com.google.crypto.tink.shaded.protobuf.o00000O0();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final int OooO0o0() {
        OoooOoo(5);
        OoooOo0(4);
        return OoooO00();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final void OooO0oO(List list) {
        int i;
        int i2;
        if (!(list instanceof com.google.crypto.tink.shaded.protobuf.o000OOo)) {
            int i3 = this.f4999OooO0o0 & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
                }
                int o000oOoO2 = this.f4995OooO0O0 + o000oOoO();
                while (this.f4995OooO0O0 < o000oOoO2) {
                    list.add(Integer.valueOf(o000oOoO()));
                }
                return;
            }
            do {
                list.add(Integer.valueOf(OooOOo0()));
                if (Oooo0oo()) {
                    return;
                }
                i = this.f4995OooO0O0;
            } while (o000oOoO() == this.f4999OooO0o0);
            this.f4995OooO0O0 = i;
            return;
        }
        com.google.crypto.tink.shaded.protobuf.o000OOo o000ooo = (com.google.crypto.tink.shaded.protobuf.o000OOo) list;
        int i4 = this.f4999OooO0o0 & 7;
        if (i4 != 0) {
            if (i4 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
            }
            int o000oOoO3 = this.f4995OooO0O0 + o000oOoO();
            while (this.f4995OooO0O0 < o000oOoO3) {
                o000ooo.OooO0oo(o000oOoO());
            }
            return;
        }
        do {
            o000ooo.OooO0oo(OooOOo0());
            if (Oooo0oo()) {
                return;
            }
            i2 = this.f4995OooO0O0;
        } while (o000oOoO() == this.f4999OooO0o0);
        this.f4995OooO0O0 = i2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final void OooO0oo(List list) {
        int i;
        int i2;
        if (!(list instanceof com.google.crypto.tink.shaded.protobuf.o0OoOo0)) {
            int i3 = this.f4999OooO0o0 & 7;
            if (i3 == 1) {
                do {
                    list.add(Double.valueOf(Oooo00O()));
                    if (Oooo0oo()) {
                        return;
                    }
                    i = this.f4995OooO0O0;
                } while (o000oOoO() == this.f4999OooO0o0);
                this.f4995OooO0O0 = i;
                return;
            } else if (i3 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
            } else {
                int o000oOoO2 = o000oOoO();
                OooooO0(o000oOoO2);
                int i4 = this.f4995OooO0O0 + o000oOoO2;
                while (this.f4995OooO0O0 < i4) {
                    list.add(Double.valueOf(Double.longBitsToDouble(OoooO0())));
                }
                return;
            }
        }
        com.google.crypto.tink.shaded.protobuf.o0OoOo0 o0oooo0 = (com.google.crypto.tink.shaded.protobuf.o0OoOo0) list;
        int i5 = this.f4999OooO0o0 & 7;
        if (i5 == 1) {
            do {
                o0oooo0.OooO0oo(Oooo00O());
                if (Oooo0oo()) {
                    return;
                }
                i2 = this.f4995OooO0O0;
            } while (o000oOoO() == this.f4999OooO0o0);
            this.f4995OooO0O0 = i2;
        } else if (i5 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
        } else {
            int o000oOoO3 = o000oOoO();
            OooooO0(o000oOoO3);
            int i6 = this.f4995OooO0O0 + o000oOoO3;
            while (this.f4995OooO0O0 < i6) {
                o0oooo0.OooO0oo(Double.longBitsToDouble(OoooO0()));
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final com.google.crypto.tink.shaded.protobuf.OooOo00 OooOO0() {
        com.google.crypto.tink.shaded.protobuf.OooOo00 OooO0oo2;
        OoooOoo(2);
        int o000oOoO2 = o000oOoO();
        if (o000oOoO2 == 0) {
            return com.google.crypto.tink.shaded.protobuf.OooOo.f3625OooO0O0;
        }
        OoooOo0(o000oOoO2);
        if (this.f4994OooO00o) {
            int i = this.f4995OooO0O0;
            com.google.crypto.tink.shaded.protobuf.OooOo00 oooOo00 = com.google.crypto.tink.shaded.protobuf.OooOo.f3625OooO0O0;
            OooO0oo2 = new com.google.crypto.tink.shaded.protobuf.OooOOOO((byte[]) this.f5000OooO0oO, i, o000oOoO2);
        } else {
            OooO0oo2 = com.google.crypto.tink.shaded.protobuf.OooOo.OooO0oo((byte[]) this.f5000OooO0oO, this.f4995OooO0O0, o000oOoO2);
        }
        this.f4995OooO0O0 += o000oOoO2;
        return OooO0oo2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final void OooOO0O(List list) {
        int i;
        int o000oOoO2;
        int i2;
        if (list instanceof com.google.crypto.tink.shaded.protobuf.o0000O0O) {
            com.google.crypto.tink.shaded.protobuf.o0000O0O o0000o0o2 = (com.google.crypto.tink.shaded.protobuf.o0000O0O) list;
            int i3 = this.f4999OooO0o0 & 7;
            if (i3 == 0) {
                do {
                    o0000o0o2.OooO0oo(OooOo0o());
                    if (Oooo0oo()) {
                        return;
                    }
                    i2 = this.f4995OooO0O0;
                } while (o000oOoO() == this.f4999OooO0o0);
                this.f4995OooO0O0 = i2;
                return;
            } else if (i3 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
            } else {
                o000oOoO2 = this.f4995OooO0O0 + o000oOoO();
                while (this.f4995OooO0O0 < o000oOoO2) {
                    o0000o0o2.OooO0oo(OoooOOO());
                }
            }
        } else {
            int i4 = this.f4999OooO0o0 & 7;
            if (i4 == 0) {
                do {
                    list.add(Long.valueOf(OooOo0o()));
                    if (Oooo0oo()) {
                        return;
                    }
                    i = this.f4995OooO0O0;
                } while (o000oOoO() == this.f4999OooO0o0);
                this.f4995OooO0O0 = i;
                return;
            } else if (i4 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
            } else {
                o000oOoO2 = this.f4995OooO0O0 + o000oOoO();
                while (this.f4995OooO0O0 < o000oOoO2) {
                    list.add(Long.valueOf(OoooOOO()));
                }
            }
        }
        OoooOoO(o000oOoO2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final void OooOO0o(List list) {
        int i;
        int i2;
        if (!(list instanceof com.google.crypto.tink.shaded.protobuf.o000OOo)) {
            int i3 = this.f4999OooO0o0 & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
                }
                int o000oOoO2 = this.f4995OooO0O0 + o000oOoO();
                while (this.f4995OooO0O0 < o000oOoO2) {
                    list.add(Integer.valueOf(com.google.crypto.tink.shaded.protobuf.Oooo000.OooO00o(o000oOoO())));
                }
                return;
            }
            do {
                list.add(Integer.valueOf(Oooo0OO()));
                if (Oooo0oo()) {
                    return;
                }
                i = this.f4995OooO0O0;
            } while (o000oOoO() == this.f4999OooO0o0);
            this.f4995OooO0O0 = i;
            return;
        }
        com.google.crypto.tink.shaded.protobuf.o000OOo o000ooo = (com.google.crypto.tink.shaded.protobuf.o000OOo) list;
        int i4 = this.f4999OooO0o0 & 7;
        if (i4 != 0) {
            if (i4 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
            }
            int o000oOoO3 = this.f4995OooO0O0 + o000oOoO();
            while (this.f4995OooO0O0 < o000oOoO3) {
                o000ooo.OooO0oo(com.google.crypto.tink.shaded.protobuf.Oooo000.OooO00o(o000oOoO()));
            }
            return;
        }
        do {
            o000ooo.OooO0oo(Oooo0OO());
            if (Oooo0oo()) {
                return;
            }
            i2 = this.f4995OooO0O0;
        } while (o000oOoO() == this.f4999OooO0o0);
        this.f4995OooO0O0 = i2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final int OooOOO() {
        OoooOoo(0);
        return o000oOoO();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final void OooOOO0(List list) {
        int i;
        int o000oOoO2;
        int i2;
        if (list instanceof com.google.crypto.tink.shaded.protobuf.OooOO0O) {
            com.google.crypto.tink.shaded.protobuf.OooOO0O oooOO0O = (com.google.crypto.tink.shaded.protobuf.OooOO0O) list;
            int i3 = this.f4999OooO0o0 & 7;
            if (i3 == 0) {
                do {
                    oooOO0O.OooO0oo(Oooo000());
                    if (Oooo0oo()) {
                        return;
                    }
                    i2 = this.f4995OooO0O0;
                } while (o000oOoO() == this.f4999OooO0o0);
                this.f4995OooO0O0 = i2;
                return;
            } else if (i3 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
            } else {
                o000oOoO2 = this.f4995OooO0O0 + o000oOoO();
                while (this.f4995OooO0O0 < o000oOoO2) {
                    oooOO0O.OooO0oo(o000oOoO() != 0);
                }
            }
        } else {
            int i4 = this.f4999OooO0o0 & 7;
            if (i4 == 0) {
                do {
                    list.add(Boolean.valueOf(Oooo000()));
                    if (Oooo0oo()) {
                        return;
                    }
                    i = this.f4995OooO0O0;
                } while (o000oOoO() == this.f4999OooO0o0);
                this.f4995OooO0O0 = i;
                return;
            } else if (i4 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
            } else {
                o000oOoO2 = this.f4995OooO0O0 + o000oOoO();
                while (this.f4995OooO0O0 < o000oOoO2) {
                    list.add(Boolean.valueOf(o000oOoO() != 0));
                }
            }
        }
        OoooOoO(o000oOoO2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final Object OooOOOO(com.google.crypto.tink.shaded.protobuf.o0O0ooO o0o0ooo, com.google.crypto.tink.shaded.protobuf.o00Oo0 o00oo0) {
        OoooOoo(2);
        return OoooO0O(o0o0ooo, o00oo0);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final void OooOOOo(List list) {
        int i;
        int i2;
        if (!(list instanceof com.google.crypto.tink.shaded.protobuf.o0ooOOo)) {
            int i3 = this.f4999OooO0o0 & 7;
            if (i3 == 2) {
                int o000oOoO2 = o000oOoO();
                Ooooo0o(o000oOoO2);
                int i4 = this.f4995OooO0O0 + o000oOoO2;
                while (this.f4995OooO0O0 < i4) {
                    list.add(Float.valueOf(Float.intBitsToFloat(OoooO00())));
                }
                return;
            } else if (i3 != 5) {
                throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
            } else {
                do {
                    list.add(Float.valueOf(OooO0O0()));
                    if (Oooo0oo()) {
                        return;
                    }
                    i = this.f4995OooO0O0;
                } while (o000oOoO() == this.f4999OooO0o0);
                this.f4995OooO0O0 = i;
                return;
            }
        }
        com.google.crypto.tink.shaded.protobuf.o0ooOOo o0ooooo = (com.google.crypto.tink.shaded.protobuf.o0ooOOo) list;
        int i5 = this.f4999OooO0o0 & 7;
        if (i5 == 2) {
            int o000oOoO3 = o000oOoO();
            Ooooo0o(o000oOoO3);
            int i6 = this.f4995OooO0O0 + o000oOoO3;
            while (this.f4995OooO0O0 < i6) {
                o0ooooo.OooO0oo(Float.intBitsToFloat(OoooO00()));
            }
        } else if (i5 != 5) {
            throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
        } else {
            do {
                o0ooooo.OooO0oo(OooO0O0());
                if (Oooo0oo()) {
                    return;
                }
                i2 = this.f4995OooO0O0;
            } while (o000oOoO() == this.f4999OooO0o0);
            this.f4995OooO0O0 = i2;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final void OooOOo(List list) {
        int i;
        int i2;
        if (!(list instanceof com.google.crypto.tink.shaded.protobuf.o0000O0O)) {
            int i3 = this.f4999OooO0o0 & 7;
            if (i3 == 1) {
                do {
                    list.add(Long.valueOf(Oooo0o()));
                    if (Oooo0oo()) {
                        return;
                    }
                    i = this.f4995OooO0O0;
                } while (o000oOoO() == this.f4999OooO0o0);
                this.f4995OooO0O0 = i;
                return;
            } else if (i3 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
            } else {
                int o000oOoO2 = o000oOoO();
                OooooO0(o000oOoO2);
                int i4 = this.f4995OooO0O0 + o000oOoO2;
                while (this.f4995OooO0O0 < i4) {
                    list.add(Long.valueOf(OoooO0()));
                }
                return;
            }
        }
        com.google.crypto.tink.shaded.protobuf.o0000O0O o0000o0o2 = (com.google.crypto.tink.shaded.protobuf.o0000O0O) list;
        int i5 = this.f4999OooO0o0 & 7;
        if (i5 == 1) {
            do {
                o0000o0o2.OooO0oo(Oooo0o());
                if (Oooo0oo()) {
                    return;
                }
                i2 = this.f4995OooO0O0;
            } while (o000oOoO() == this.f4999OooO0o0);
            this.f4995OooO0O0 = i2;
        } else if (i5 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
        } else {
            int o000oOoO3 = o000oOoO();
            OooooO0(o000oOoO3);
            int i6 = this.f4995OooO0O0 + o000oOoO3;
            while (this.f4995OooO0O0 < i6) {
                o0000o0o2.OooO0oo(OoooO0());
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final int OooOOo0() {
        OoooOoo(0);
        return o000oOoO();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final int OooOOoo() {
        OoooOoo(0);
        return o000oOoO();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final int OooOo() {
        return this.f4999OooO0o0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final void OooOo0(List list, com.google.crypto.tink.shaded.protobuf.o0O0ooO o0o0ooo, com.google.crypto.tink.shaded.protobuf.o00Oo0 o00oo0) {
        int i;
        int i2 = this.f4999OooO0o0;
        if ((i2 & 7) == 3) {
            do {
                list.add(Oooo(o0o0ooo, o00oo0));
                if (Oooo0oo()) {
                    return;
                }
                i = this.f4995OooO0O0;
            } while (o000oOoO() == i2);
            this.f4995OooO0O0 = i;
            return;
        }
        int i3 = com.google.crypto.tink.shaded.protobuf.o00000O.f3652OooO00o;
        throw new com.google.crypto.tink.shaded.protobuf.o00000O0();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final String OooOo00() {
        return OoooO(false);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final void OooOo0O(List list, com.google.crypto.tink.shaded.protobuf.o0O0ooO o0o0ooo, com.google.crypto.tink.shaded.protobuf.o00Oo0 o00oo0) {
        int i;
        int i2 = this.f4999OooO0o0;
        if ((i2 & 7) == 2) {
            do {
                list.add(OoooO0O(o0o0ooo, o00oo0));
                if (Oooo0oo()) {
                    return;
                }
                i = this.f4995OooO0O0;
            } while (o000oOoO() == i2);
            this.f4995OooO0O0 = i;
            return;
        }
        int i3 = com.google.crypto.tink.shaded.protobuf.o00000O.f3652OooO00o;
        throw new com.google.crypto.tink.shaded.protobuf.o00000O0();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final long OooOo0o() {
        OoooOoo(0);
        return OoooOOO();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final long OooOoO() {
        OoooOoo(0);
        return OoooOOO();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final String OooOoO0() {
        return OoooO(true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final void OooOoOO(List list) {
        int i;
        int i2;
        if (!(list instanceof com.google.crypto.tink.shaded.protobuf.o000OOo)) {
            int i3 = this.f4999OooO0o0 & 7;
            if (i3 == 2) {
                int o000oOoO2 = o000oOoO();
                Ooooo0o(o000oOoO2);
                int i4 = this.f4995OooO0O0 + o000oOoO2;
                while (this.f4995OooO0O0 < i4) {
                    list.add(Integer.valueOf(OoooO00()));
                }
                return;
            } else if (i3 != 5) {
                throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
            } else {
                do {
                    list.add(Integer.valueOf(OooOoo()));
                    if (Oooo0oo()) {
                        return;
                    }
                    i = this.f4995OooO0O0;
                } while (o000oOoO() == this.f4999OooO0o0);
                this.f4995OooO0O0 = i;
                return;
            }
        }
        com.google.crypto.tink.shaded.protobuf.o000OOo o000ooo = (com.google.crypto.tink.shaded.protobuf.o000OOo) list;
        int i5 = this.f4999OooO0o0 & 7;
        if (i5 == 2) {
            int o000oOoO3 = o000oOoO();
            Ooooo0o(o000oOoO3);
            int i6 = this.f4995OooO0O0 + o000oOoO3;
            while (this.f4995OooO0O0 < i6) {
                o000ooo.OooO0oo(OoooO00());
            }
        } else if (i5 != 5) {
            throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
        } else {
            do {
                o000ooo.OooO0oo(OooOoo());
                if (Oooo0oo()) {
                    return;
                }
                i2 = this.f4995OooO0O0;
            } while (o000oOoO() == this.f4999OooO0o0);
            this.f4995OooO0O0 = i2;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final int OooOoo() {
        OoooOoo(5);
        OoooOo0(4);
        return OoooO00();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final long OooOoo0() {
        OoooOoo(1);
        OoooOo0(8);
        return OoooO0();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final void OooOooO(List list) {
        int i;
        int i2;
        if (!(list instanceof com.google.crypto.tink.shaded.protobuf.o0000O0O)) {
            int i3 = this.f4999OooO0o0 & 7;
            if (i3 == 1) {
                do {
                    list.add(Long.valueOf(OooOoo0()));
                    if (Oooo0oo()) {
                        return;
                    }
                    i = this.f4995OooO0O0;
                } while (o000oOoO() == this.f4999OooO0o0);
                this.f4995OooO0O0 = i;
                return;
            } else if (i3 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
            } else {
                int o000oOoO2 = o000oOoO();
                OooooO0(o000oOoO2);
                int i4 = this.f4995OooO0O0 + o000oOoO2;
                while (this.f4995OooO0O0 < i4) {
                    list.add(Long.valueOf(OoooO0()));
                }
                return;
            }
        }
        com.google.crypto.tink.shaded.protobuf.o0000O0O o0000o0o2 = (com.google.crypto.tink.shaded.protobuf.o0000O0O) list;
        int i5 = this.f4999OooO0o0 & 7;
        if (i5 == 1) {
            do {
                o0000o0o2.OooO0oo(OooOoo0());
                if (Oooo0oo()) {
                    return;
                }
                i2 = this.f4995OooO0O0;
            } while (o000oOoO() == this.f4999OooO0o0);
            this.f4995OooO0O0 = i2;
        } else if (i5 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
        } else {
            int o000oOoO3 = o000oOoO();
            OooooO0(o000oOoO3);
            int i6 = this.f4995OooO0O0 + o000oOoO3;
            while (this.f4995OooO0O0 < i6) {
                o0000o0o2.OooO0oo(OoooO0());
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final void OooOooo(List list) {
        int i;
        int o000oOoO2;
        int i2;
        if (list instanceof com.google.crypto.tink.shaded.protobuf.o000OOo) {
            com.google.crypto.tink.shaded.protobuf.o000OOo o000ooo = (com.google.crypto.tink.shaded.protobuf.o000OOo) list;
            int i3 = this.f4999OooO0o0 & 7;
            if (i3 == 0) {
                do {
                    o000ooo.OooO0oo(OooOOoo());
                    if (Oooo0oo()) {
                        return;
                    }
                    i2 = this.f4995OooO0O0;
                } while (o000oOoO() == this.f4999OooO0o0);
                this.f4995OooO0O0 = i2;
                return;
            } else if (i3 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
            } else {
                o000oOoO2 = this.f4995OooO0O0 + o000oOoO();
                while (this.f4995OooO0O0 < o000oOoO2) {
                    o000ooo.OooO0oo(o000oOoO());
                }
            }
        } else {
            int i4 = this.f4999OooO0o0 & 7;
            if (i4 == 0) {
                do {
                    list.add(Integer.valueOf(OooOOoo()));
                    if (Oooo0oo()) {
                        return;
                    }
                    i = this.f4995OooO0O0;
                } while (o000oOoO() == this.f4999OooO0o0);
                this.f4995OooO0O0 = i;
                return;
            } else if (i4 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
            } else {
                o000oOoO2 = this.f4995OooO0O0 + o000oOoO();
                while (this.f4995OooO0O0 < o000oOoO2) {
                    list.add(Integer.valueOf(o000oOoO()));
                }
            }
        }
        OoooOoO(o000oOoO2);
    }

    public final Object Oooo(com.google.crypto.tink.shaded.protobuf.o0O0ooO o0o0ooo, com.google.crypto.tink.shaded.protobuf.o00Oo0 o00oo0) {
        int i = this.f4998OooO0o;
        this.f4998OooO0o = ((this.f4999OooO0o0 >>> 3) << 3) | 4;
        try {
            Object OooO0Oo2 = o0o0ooo.OooO0Oo();
            o0o0ooo.OooO0o(OooO0Oo2, this, o00oo0);
            o0o0ooo.OooO0oO(OooO0Oo2);
            if (this.f4999OooO0o0 == this.f4998OooO0o) {
                return OooO0Oo2;
            }
            throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0o0();
        } finally {
            this.f4998OooO0o = i;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final void Oooo0(List list) {
        int i;
        int i2;
        if (!(list instanceof com.google.crypto.tink.shaded.protobuf.o000OOo)) {
            int i3 = this.f4999OooO0o0 & 7;
            if (i3 == 2) {
                int o000oOoO2 = o000oOoO();
                Ooooo0o(o000oOoO2);
                int i4 = this.f4995OooO0O0 + o000oOoO2;
                while (this.f4995OooO0O0 < i4) {
                    list.add(Integer.valueOf(OoooO00()));
                }
                return;
            } else if (i3 != 5) {
                throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
            } else {
                do {
                    list.add(Integer.valueOf(OooO0o0()));
                    if (Oooo0oo()) {
                        return;
                    }
                    i = this.f4995OooO0O0;
                } while (o000oOoO() == this.f4999OooO0o0);
                this.f4995OooO0O0 = i;
                return;
            }
        }
        com.google.crypto.tink.shaded.protobuf.o000OOo o000ooo = (com.google.crypto.tink.shaded.protobuf.o000OOo) list;
        int i5 = this.f4999OooO0o0 & 7;
        if (i5 == 2) {
            int o000oOoO3 = o000oOoO();
            Ooooo0o(o000oOoO3);
            int i6 = this.f4995OooO0O0 + o000oOoO3;
            while (this.f4995OooO0O0 < i6) {
                o000ooo.OooO0oo(OoooO00());
            }
        } else if (i5 != 5) {
            throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
        } else {
            do {
                o000ooo.OooO0oo(OooO0o0());
                if (Oooo0oo()) {
                    return;
                }
                i2 = this.f4995OooO0O0;
            } while (o000oOoO() == this.f4999OooO0o0);
            this.f4995OooO0O0 = i2;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final boolean Oooo000() {
        OoooOoo(0);
        return o000oOoO() != 0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final double Oooo00O() {
        OoooOoo(1);
        OoooOo0(8);
        return Double.longBitsToDouble(OoooO0());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final void Oooo00o(List list) {
        int i;
        int i2;
        if (!(list instanceof com.google.crypto.tink.shaded.protobuf.o000OOo)) {
            int i3 = this.f4999OooO0o0 & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
                }
                int o000oOoO2 = this.f4995OooO0O0 + o000oOoO();
                while (this.f4995OooO0O0 < o000oOoO2) {
                    list.add(Integer.valueOf(o000oOoO()));
                }
                return;
            }
            do {
                list.add(Integer.valueOf(OooOOO()));
                if (Oooo0oo()) {
                    return;
                }
                i = this.f4995OooO0O0;
            } while (o000oOoO() == this.f4999OooO0o0);
            this.f4995OooO0O0 = i;
            return;
        }
        com.google.crypto.tink.shaded.protobuf.o000OOo o000ooo = (com.google.crypto.tink.shaded.protobuf.o000OOo) list;
        int i4 = this.f4999OooO0o0 & 7;
        if (i4 != 0) {
            if (i4 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
            }
            int o000oOoO3 = this.f4995OooO0O0 + o000oOoO();
            while (this.f4995OooO0O0 < o000oOoO3) {
                o000ooo.OooO0oo(o000oOoO());
            }
            return;
        }
        do {
            o000ooo.OooO0oo(OooOOO());
            if (Oooo0oo()) {
                return;
            }
            i2 = this.f4995OooO0O0;
        } while (o000oOoO() == this.f4999OooO0o0);
        this.f4995OooO0O0 = i2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final int Oooo0O0() {
        if (Oooo0oo()) {
            return Integer.MAX_VALUE;
        }
        int o000oOoO2 = o000oOoO();
        this.f4999OooO0o0 = o000oOoO2;
        if (o000oOoO2 == this.f4998OooO0o) {
            return Integer.MAX_VALUE;
        }
        return o000oOoO2 >>> 3;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final int Oooo0OO() {
        OoooOoo(0);
        return com.google.crypto.tink.shaded.protobuf.Oooo000.OooO00o(o000oOoO());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final long Oooo0o() {
        OoooOoo(1);
        OoooOo0(8);
        return OoooO0();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final void Oooo0o0(List list) {
        OoooOO0(list, false);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O0000
    public final void Oooo0oO(List list) {
        int i;
        int i2;
        if (!(list instanceof com.google.crypto.tink.shaded.protobuf.o0000O0O)) {
            int i3 = this.f4999OooO0o0 & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
                }
                int o000oOoO2 = this.f4995OooO0O0 + o000oOoO();
                while (this.f4995OooO0O0 < o000oOoO2) {
                    list.add(Long.valueOf(com.google.crypto.tink.shaded.protobuf.Oooo000.OooO0O0(OoooOOO())));
                }
                return;
            }
            do {
                list.add(Long.valueOf(OooO0Oo()));
                if (Oooo0oo()) {
                    return;
                }
                i = this.f4995OooO0O0;
            } while (o000oOoO() == this.f4999OooO0o0);
            this.f4995OooO0O0 = i;
            return;
        }
        com.google.crypto.tink.shaded.protobuf.o0000O0O o0000o0o2 = (com.google.crypto.tink.shaded.protobuf.o0000O0O) list;
        int i4 = this.f4999OooO0o0 & 7;
        if (i4 != 0) {
            if (i4 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
            }
            int o000oOoO3 = this.f4995OooO0O0 + o000oOoO();
            while (this.f4995OooO0O0 < o000oOoO3) {
                o0000o0o2.OooO0oo(com.google.crypto.tink.shaded.protobuf.Oooo000.OooO0O0(OoooOOO()));
            }
            return;
        }
        do {
            o0000o0o2.OooO0oo(OooO0Oo());
            if (Oooo0oo()) {
                return;
            }
            i2 = this.f4995OooO0O0;
        } while (o000oOoO() == this.f4999OooO0o0);
        this.f4995OooO0O0 = i2;
    }

    public final boolean Oooo0oo() {
        return this.f4995OooO0O0 == this.f4997OooO0Oo;
    }

    public final String OoooO(boolean z) {
        OoooOoo(2);
        int o000oOoO2 = o000oOoO();
        if (o000oOoO2 == 0) {
            return "";
        }
        OoooOo0(o000oOoO2);
        if (z) {
            int i = this.f4995OooO0O0;
            if (!o00O0OOO.OooO0Oo((byte[]) this.f5000OooO0oO, i, i + o000oOoO2)) {
                throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO00o();
            }
        }
        String str = new String((byte[]) this.f5000OooO0oO, this.f4995OooO0O0, o000oOoO2, com.google.crypto.tink.shaded.protobuf.o00000.f3650OooO00o);
        this.f4995OooO0O0 += o000oOoO2;
        return str;
    }

    public final long OoooO0() {
        int i = this.f4995OooO0O0;
        byte[] bArr = (byte[]) this.f5000OooO0oO;
        this.f4995OooO0O0 = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public final int OoooO00() {
        int i = this.f4995OooO0O0;
        byte[] bArr = (byte[]) this.f5000OooO0oO;
        this.f4995OooO0O0 = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final Object OoooO0O(com.google.crypto.tink.shaded.protobuf.o0O0ooO o0o0ooo, com.google.crypto.tink.shaded.protobuf.o00Oo0 o00oo0) {
        int o000oOoO2 = o000oOoO();
        OoooOo0(o000oOoO2);
        int i = this.f4997OooO0Oo;
        int i2 = this.f4995OooO0O0 + o000oOoO2;
        this.f4997OooO0Oo = i2;
        try {
            Object OooO0Oo2 = o0o0ooo.OooO0Oo();
            o0o0ooo.OooO0o(OooO0Oo2, this, o00oo0);
            o0o0ooo.OooO0oO(OooO0Oo2);
            if (this.f4995OooO0O0 == i2) {
                return OooO0Oo2;
            }
            throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0o0();
        } finally {
            this.f4997OooO0Oo = i;
        }
    }

    public final void OoooOO0(List list, boolean z) {
        int i;
        int i2;
        if ((this.f4999OooO0o0 & 7) == 2) {
            if ((list instanceof com.google.crypto.tink.shaded.protobuf.o0000) && !z) {
                com.google.crypto.tink.shaded.protobuf.o0000 o0000Var = (com.google.crypto.tink.shaded.protobuf.o0000) list;
                do {
                    o0000Var.OooO0o0(OooOO0());
                    if (Oooo0oo()) {
                        return;
                    }
                    i2 = this.f4995OooO0O0;
                } while (o000oOoO() == this.f4999OooO0o0);
                this.f4995OooO0O0 = i2;
                return;
            }
            do {
                list.add(OoooO(z));
                if (Oooo0oo()) {
                    return;
                }
                i = this.f4995OooO0O0;
            } while (o000oOoO() == this.f4999OooO0o0);
            this.f4995OooO0O0 = i;
            return;
        }
        int i3 = com.google.crypto.tink.shaded.protobuf.o00000O.f3652OooO00o;
        throw new com.google.crypto.tink.shaded.protobuf.o00000O0();
    }

    public final long OoooOOO() {
        long j;
        long j2;
        long j3;
        int i;
        int i2 = this.f4995OooO0O0;
        int i3 = this.f4997OooO0Oo;
        if (i3 != i2) {
            byte[] bArr = (byte[]) this.f5000OooO0oO;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f4995OooO0O0 = i4;
                return b;
            } else if (i3 - i4 < 9) {
                return OoooOOo();
            } else {
                int i5 = i4 + 1;
                int i6 = b ^ (bArr[i4] << 7);
                if (i6 >= 0) {
                    int i7 = i5 + 1;
                    int i8 = i6 ^ (bArr[i5] << 14);
                    if (i8 >= 0) {
                        i5 = i7;
                        j = i8 ^ 16256;
                    } else {
                        i5 = i7 + 1;
                        int i9 = i8 ^ (bArr[i7] << 21);
                        if (i9 < 0) {
                            i = i9 ^ (-2080896);
                        } else {
                            long j4 = i9;
                            int i10 = i5 + 1;
                            long j5 = j4 ^ (bArr[i5] << 28);
                            if (j5 >= 0) {
                                j3 = 266354560;
                            } else {
                                i5 = i10 + 1;
                                long j6 = j5 ^ (bArr[i10] << 35);
                                if (j6 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i10 = i5 + 1;
                                    j5 = j6 ^ (bArr[i5] << 42);
                                    if (j5 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i5 = i10 + 1;
                                        j6 = j5 ^ (bArr[i10] << 49);
                                        if (j6 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            int i11 = i5 + 1;
                                            long j7 = (j6 ^ (bArr[i5] << 56)) ^ 71499008037633920L;
                                            if (j7 < 0) {
                                                i5 = i11 + 1;
                                                if (bArr[i11] < 0) {
                                                    throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0OO();
                                                }
                                            } else {
                                                i5 = i11;
                                            }
                                            j = j7;
                                        }
                                    }
                                }
                                j = j6 ^ j2;
                            }
                            j = j5 ^ j3;
                            i5 = i10;
                        }
                    }
                    this.f4995OooO0O0 = i5;
                    return j;
                }
                i = i6 ^ (-128);
                j = i;
                this.f4995OooO0O0 = i5;
                return j;
            }
        }
        throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0o();
    }

    public final long OoooOOo() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f4995OooO0O0;
            if (i2 != this.f4997OooO0Oo) {
                this.f4995OooO0O0 = i2 + 1;
                byte b = ((byte[]) this.f5000OooO0oO)[i2];
                j |= (b & Byte.MAX_VALUE) << i;
                if ((b & 128) == 0) {
                    return j;
                }
            } else {
                throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0o();
            }
        }
        throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0OO();
    }

    public final void OoooOo0(int i) {
        if (i < 0 || i > this.f4997OooO0Oo - this.f4995OooO0O0) {
            throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0o();
        }
    }

    public final void OoooOoO(int i) {
        if (this.f4995OooO0O0 != i) {
            throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0o();
        }
    }

    public final void OoooOoo(int i) {
        if ((this.f4999OooO0o0 & 7) != i) {
            throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0O0();
        }
    }

    public final void Ooooo00(RecyclerView recyclerView) {
        int i = this.f4999OooO0o0;
        if (i >= 0) {
            this.f4999OooO0o0 = -1;
            recyclerView.Oooo0o0(i);
            this.f4994OooO00o = false;
        } else if (this.f4994OooO00o) {
            Interpolator interpolator = (Interpolator) this.f5000OooO0oO;
            if (interpolator != null && this.f4997OooO0Oo < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i2 = this.f4997OooO0Oo;
            if (i2 >= 1) {
                recyclerView.f3189OoooOOO.OooO0O0(this.f4995OooO0O0, this.f4996OooO0OO, i2, interpolator);
                this.f4998OooO0o++;
                this.f4994OooO00o = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f4998OooO0o = 0;
        }
    }

    public final void Ooooo0o(int i) {
        OoooOo0(i);
        if ((i & 3) != 0) {
            throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0o0();
        }
    }

    public final void OooooO0(int i) {
        OoooOo0(i);
        if ((i & 7) != 0) {
            throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0o0();
        }
    }

    public final int o000oOoO() {
        int i;
        int i2 = this.f4995OooO0O0;
        int i3 = this.f4997OooO0Oo;
        if (i3 != i2) {
            Object obj = this.f5000OooO0oO;
            int i4 = i2 + 1;
            byte b = ((byte[]) obj)[i2];
            if (b >= 0) {
                this.f4995OooO0O0 = i4;
                return b;
            } else if (i3 - i4 < 9) {
                return (int) OoooOOo();
            } else {
                int i5 = i4 + 1;
                int i6 = b ^ (((byte[]) obj)[i4] << 7);
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i5 + 1;
                    int i8 = i6 ^ (((byte[]) obj)[i5] << 14);
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        i5 = i7 + 1;
                        int i9 = i8 ^ (((byte[]) obj)[i7] << 21);
                        if (i9 < 0) {
                            i = i9 ^ (-2080896);
                        } else {
                            i7 = i5 + 1;
                            byte b2 = ((byte[]) obj)[i5];
                            i = (i9 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i5 = i7 + 1;
                                if (((byte[]) obj)[i7] < 0) {
                                    i7 = i5 + 1;
                                    if (((byte[]) obj)[i5] < 0) {
                                        i5 = i7 + 1;
                                        if (((byte[]) obj)[i7] < 0) {
                                            i7 = i5 + 1;
                                            if (((byte[]) obj)[i5] < 0) {
                                                i5 = i7 + 1;
                                                if (((byte[]) obj)[i7] < 0) {
                                                    throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0OO();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i5 = i7;
                }
                this.f4995OooO0O0 = i5;
                return i;
            }
        }
        throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0o();
    }
}