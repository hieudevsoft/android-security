package OooOOO;

/* loaded from: classes.dex */
public final class OooOO0O {

    /* renamed from: OooO  reason: collision with root package name */
    public int f740OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public int f741OooO00o;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public OooO0o f744OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public OooO0o f745OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public OooO0o f746OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public OooO0o f747OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public int f748OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public int f749OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public int f750OooOO0O;

    /* renamed from: OooOOo  reason: collision with root package name */
    public final /* synthetic */ OooOOO0 f755OooOOo;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public int f756OooOOo0;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public OooO f742OooO0O0 = null;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f743OooO0OO = 0;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public int f751OooOO0o = 0;
    public int OooOOO0 = 0;

    /* renamed from: OooOOO  reason: collision with root package name */
    public int f752OooOOO = 0;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public int f753OooOOOO = 0;

    /* renamed from: OooOOOo  reason: collision with root package name */
    public int f754OooOOOo = 0;

    public OooOO0O(OooOOO0 oooOOO0, int i, OooO0o oooO0o, OooO0o oooO0o2, OooO0o oooO0o3, OooO0o oooO0o4, int i2) {
        this.f755OooOOo = oooOOO0;
        this.f748OooO0oo = 0;
        this.f740OooO = 0;
        this.f749OooOO0 = 0;
        this.f750OooOO0O = 0;
        this.f756OooOOo0 = 0;
        this.f741OooO00o = i;
        this.f744OooO0Oo = oooO0o;
        this.f746OooO0o0 = oooO0o2;
        this.f745OooO0o = oooO0o3;
        this.f747OooO0oO = oooO0o4;
        this.f748OooO0oo = oooOOO0.f794o0ooOoO;
        this.f740OooO = oooOOO0.o00oO0o;
        this.f749OooOO0 = oooOOO0.f791o0OOO0o;
        this.f750OooOO0O = oooOOO0.f788o00oO0O;
        this.f756OooOOo0 = i2;
    }

    public final void OooO00o(OooO oooO) {
        int i = this.f741OooO00o;
        int i2 = 0;
        OooOOO0 oooOOO0 = this.f755OooOOo;
        if (i == 0) {
            int OoooO0O2 = oooOOO0.OoooO0O(this.f756OooOOo0, oooO);
            if (oooO.f681o00o0O[0] == 3) {
                this.f754OooOOOo++;
                OoooO0O2 = 0;
            }
            int i3 = oooOOO0.f762o0000;
            if (oooO.f675Oooooo0 != 8) {
                i2 = i3;
            }
            this.f751OooOO0o = OoooO0O2 + i2 + this.f751OooOO0o;
            int OoooO02 = oooOOO0.OoooO0(this.f756OooOOo0, oooO);
            if (this.f742OooO0O0 == null || this.f743OooO0OO < OoooO02) {
                this.f742OooO0O0 = oooO;
                this.f743OooO0OO = OoooO02;
                this.OooOOO0 = OoooO02;
            }
        } else {
            int OoooO0O3 = oooOOO0.OoooO0O(this.f756OooOOo0, oooO);
            int OoooO03 = oooOOO0.OoooO0(this.f756OooOOo0, oooO);
            if (oooO.f681o00o0O[1] == 3) {
                this.f754OooOOOo++;
                OoooO03 = 0;
            }
            int i4 = oooOOO0.f776o0000O00;
            if (oooO.f675Oooooo0 != 8) {
                i2 = i4;
            }
            this.OooOOO0 = OoooO03 + i2 + this.OooOOO0;
            if (this.f742OooO0O0 == null || this.f743OooO0OO < OoooO0O3) {
                this.f742OooO0O0 = oooO;
                this.f743OooO0OO = OoooO0O3;
                this.f751OooOO0o = OoooO0O3;
            }
        }
        this.f753OooOOOO++;
    }

    public final void OooO0O0(int i, boolean z, boolean z2) {
        OooOOO0 oooOOO0;
        boolean z3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        OooO oooO;
        int i7;
        int i8;
        char c;
        int i9;
        int i10;
        float f;
        float f2;
        int i11;
        float f3;
        float f4;
        int i12;
        int i13;
        int i14;
        int i15 = this.f753OooOOOO;
        int i16 = 0;
        while (true) {
            oooOOO0 = this.f755OooOOo;
            if (i16 >= i15 || (i14 = this.f752OooOOO + i16) >= oooOOO0.f782o0000Oo0) {
                break;
            }
            OooO oooO2 = oooOOO0.f781o0000OOo[i14];
            if (oooO2 != null) {
                oooO2.OooOooO();
            }
            i16++;
        }
        if (i15 != 0 && this.f742OooO0O0 != null) {
            if (z2 && i == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            int i17 = -1;
            int i18 = -1;
            for (int i19 = 0; i19 < i15; i19++) {
                if (z) {
                    i13 = (i15 - 1) - i19;
                } else {
                    i13 = i19;
                }
                int i20 = this.f752OooOOO + i13;
                if (i20 >= oooOOO0.f782o0000Oo0) {
                    break;
                }
                OooO oooO3 = oooOOO0.f781o0000OOo[i20];
                if (oooO3 != null && oooO3.f675Oooooo0 == 0) {
                    if (i17 == -1) {
                        i17 = i19;
                    }
                    i18 = i19;
                }
            }
            if (this.f741OooO00o == 0) {
                OooO oooO4 = this.f742OooO0O0;
                oooO4.f677Ooooooo = oooOOO0.f765o000000O;
                int i21 = this.f740OooO;
                if (i > 0) {
                    i21 += oooOOO0.f776o0000O00;
                }
                OooO0o oooO0o = this.f746OooO0o0;
                OooO0o oooO0o2 = oooO4.f654Oooo0O0;
                oooO0o2.OooO00o(oooO0o, i21);
                OooO0o oooO0o3 = oooO4.f657Oooo0o0;
                if (z2) {
                    oooO0o3.OooO00o(this.f747OooO0oO, this.f750OooOO0O);
                }
                if (i > 0) {
                    this.f746OooO0o0.f716OooO0Oo.f657Oooo0o0.OooO00o(oooO0o2, 0);
                }
                if (oooOOO0.f784o0000oO == 3 && !oooO4.f648OooOooo) {
                    for (int i22 = 0; i22 < i15; i22++) {
                        if (z) {
                            i12 = (i15 - 1) - i22;
                        } else {
                            i12 = i22;
                        }
                        int i23 = this.f752OooOOO + i12;
                        if (i23 >= oooOOO0.f782o0000Oo0) {
                            break;
                        }
                        oooO = oooOOO0.f781o0000OOo[i23];
                        if (oooO.f648OooOooo) {
                            break;
                        }
                    }
                }
                oooO = oooO4;
                int i24 = 0;
                OooO oooO5 = null;
                while (i24 < i15) {
                    if (z) {
                        i7 = (i15 - 1) - i24;
                    } else {
                        i7 = i24;
                    }
                    int i25 = this.f752OooOOO + i7;
                    if (i25 < oooOOO0.f782o0000Oo0) {
                        OooO oooO6 = oooOOO0.f781o0000OOo[i25];
                        if (oooO6 == null) {
                            i8 = i15;
                            c = 3;
                        } else {
                            OooO0o oooO0o4 = oooO6.f650Oooo0;
                            if (i24 == 0) {
                                oooO6.OooO0oO(oooO0o4, this.f744OooO0Oo, this.f748OooO0oo);
                            }
                            if (i7 == 0) {
                                int i26 = oooOOO0.f764o000000;
                                if (z) {
                                    i10 = i26;
                                    f = 1.0f - oooOOO0.f769o00000OO;
                                } else {
                                    i10 = i26;
                                    f = oooOOO0.f769o00000OO;
                                }
                                if (this.f752OooOOO == 0) {
                                    int i27 = oooOOO0.f766o000000o;
                                    f2 = f;
                                    if (i27 != -1) {
                                        if (z) {
                                            f4 = 1.0f - oooOOO0.f771o00000o0;
                                        } else {
                                            f4 = oooOOO0.f771o00000o0;
                                        }
                                        f3 = f4;
                                        i11 = i27;
                                        oooO6.f676OoooooO = i11;
                                        oooO6.f671OooooO0 = f3;
                                    }
                                } else {
                                    f2 = f;
                                }
                                if (z2 && (i11 = oooOOO0.f768o00000O0) != -1) {
                                    if (z) {
                                        f3 = 1.0f - oooOOO0.f772o00000oO;
                                    } else {
                                        f3 = oooOOO0.f772o00000oO;
                                    }
                                } else {
                                    i11 = i10;
                                    f3 = f2;
                                }
                                oooO6.f676OoooooO = i11;
                                oooO6.f671OooooO0 = f3;
                            }
                            if (i24 == i15 - 1) {
                                i8 = i15;
                                oooO6.OooO0oO(oooO6.f655Oooo0OO, this.f745OooO0o, this.f749OooOO0);
                            } else {
                                i8 = i15;
                            }
                            if (oooO5 != null) {
                                int i28 = oooOOO0.f762o0000;
                                OooO0o oooO0o5 = oooO5.f655Oooo0OO;
                                oooO0o4.OooO00o(oooO0o5, i28);
                                if (i24 == i17) {
                                    int i29 = this.f748OooO0oo;
                                    if (oooO0o4.OooO0oo()) {
                                        oooO0o4.f720OooO0oo = i29;
                                    }
                                }
                                oooO0o5.OooO00o(oooO0o4, 0);
                                if (i24 == i18 + 1) {
                                    int i30 = this.f749OooOO0;
                                    if (oooO0o5.OooO0oo()) {
                                        oooO0o5.f720OooO0oo = i30;
                                    }
                                }
                            }
                            if (oooO6 != oooO4) {
                                int i31 = oooOOO0.f784o0000oO;
                                c = 3;
                                if (i31 == 3 && oooO.f648OooOooo && oooO6 != oooO && oooO6.f648OooOooo) {
                                    oooO6.f656Oooo0o.OooO00o(oooO.f656Oooo0o, 0);
                                } else {
                                    OooO0o oooO0o6 = oooO6.f654Oooo0O0;
                                    if (i31 != 0) {
                                        OooO0o oooO0o7 = oooO6.f657Oooo0o0;
                                        if (i31 != 1) {
                                            if (z3) {
                                                oooO0o6.OooO00o(this.f746OooO0o0, this.f740OooO);
                                                oooO0o7.OooO00o(this.f747OooO0oO, this.f750OooOO0O);
                                            } else {
                                                i9 = 0;
                                                oooO0o6.OooO00o(oooO0o2, 0);
                                            }
                                        } else {
                                            i9 = 0;
                                        }
                                        oooO0o7.OooO00o(oooO0o3, i9);
                                    } else {
                                        oooO0o6.OooO00o(oooO0o2, 0);
                                    }
                                }
                            } else {
                                c = 3;
                            }
                            oooO5 = oooO6;
                        }
                        i24++;
                        i15 = i8;
                    } else {
                        return;
                    }
                }
                return;
            }
            OooO oooO7 = this.f742OooO0O0;
            oooO7.f676OoooooO = oooOOO0.f764o000000;
            int i32 = this.f748OooO0oo;
            if (i > 0) {
                i32 += oooOOO0.f762o0000;
            }
            OooO0o oooO0o8 = oooO7.f655Oooo0OO;
            OooO0o oooO0o9 = oooO7.f650Oooo0;
            if (z) {
                oooO0o8.OooO00o(this.f745OooO0o, i32);
                if (z2) {
                    oooO0o9.OooO00o(this.f744OooO0Oo, this.f749OooOO0);
                }
                if (i > 0) {
                    this.f745OooO0o.f716OooO0Oo.f650Oooo0.OooO00o(oooO0o8, 0);
                }
            } else {
                oooO0o9.OooO00o(this.f744OooO0Oo, i32);
                if (z2) {
                    oooO0o8.OooO00o(this.f745OooO0o, this.f749OooOO0);
                }
                if (i > 0) {
                    this.f744OooO0Oo.f716OooO0Oo.f655Oooo0OO.OooO00o(oooO0o9, 0);
                }
            }
            int i33 = 0;
            OooO oooO8 = null;
            while (i33 < i15) {
                int i34 = this.f752OooOOO + i33;
                if (i34 < oooOOO0.f782o0000Oo0) {
                    OooO oooO9 = oooOOO0.f781o0000OOo[i34];
                    if (oooO9 == null) {
                        oooO9 = oooO8;
                    } else {
                        OooO0o oooO0o10 = oooO9.f654Oooo0O0;
                        if (i33 == 0) {
                            oooO9.OooO0oO(oooO0o10, this.f746OooO0o0, this.f740OooO);
                            int i35 = oooOOO0.f765o000000O;
                            float f5 = oooOOO0.f770o00000Oo;
                            if (this.f752OooOOO == 0) {
                                i6 = oooOOO0.f763o00000;
                                i4 = i35;
                                i5 = -1;
                                if (i6 != -1) {
                                    f5 = oooOOO0.f783o0000Ooo;
                                    oooO9.f677Ooooooo = i6;
                                    oooO9.f672OooooOO = f5;
                                }
                            } else {
                                i4 = i35;
                                i5 = -1;
                            }
                            if (z2 && (i6 = oooOOO0.f767o00000O) != i5) {
                                f5 = oooOOO0.f773o00000oo;
                            } else {
                                i6 = i4;
                            }
                            oooO9.f677Ooooooo = i6;
                            oooO9.f672OooooOO = f5;
                        }
                        if (i33 == i15 - 1) {
                            oooO9.OooO0oO(oooO9.f657Oooo0o0, this.f747OooO0oO, this.f750OooOO0O);
                        }
                        if (oooO8 != null) {
                            int i36 = oooOOO0.f776o0000O00;
                            OooO0o oooO0o11 = oooO8.f657Oooo0o0;
                            oooO0o10.OooO00o(oooO0o11, i36);
                            if (i33 == i17) {
                                int i37 = this.f740OooO;
                                if (oooO0o10.OooO0oo()) {
                                    oooO0o10.f720OooO0oo = i37;
                                }
                            }
                            oooO0o11.OooO00o(oooO0o10, 0);
                            if (i33 == i18 + 1) {
                                int i38 = this.f750OooOO0O;
                                if (oooO0o11.OooO0oo()) {
                                    oooO0o11.f720OooO0oo = i38;
                                }
                            }
                        }
                        if (oooO9 != oooO7) {
                            OooO0o oooO0o12 = oooO9.f655Oooo0OO;
                            OooO0o oooO0o13 = oooO9.f650Oooo0;
                            if (z) {
                                int i39 = oooOOO0.f785o0000oo;
                                if (i39 != 0) {
                                    if (i39 != 1) {
                                        if (i39 == 2) {
                                            i3 = 0;
                                            oooO0o13.OooO00o(oooO0o9, 0);
                                        }
                                    } else {
                                        oooO0o13.OooO00o(oooO0o9, 0);
                                        i33++;
                                        oooO8 = oooO9;
                                    }
                                } else {
                                    i3 = 0;
                                }
                                oooO0o12.OooO00o(oooO0o8, i3);
                                i33++;
                                oooO8 = oooO9;
                            } else {
                                int i40 = oooOOO0.f785o0000oo;
                                if (i40 != 0) {
                                    if (i40 != 1) {
                                        if (i40 == 2) {
                                            if (z3) {
                                                oooO0o13.OooO00o(this.f744OooO0Oo, this.f748OooO0oo);
                                                oooO0o12.OooO00o(this.f745OooO0o, this.f749OooOO0);
                                            } else {
                                                i2 = 0;
                                                oooO0o13.OooO00o(oooO0o9, 0);
                                            }
                                        }
                                    } else {
                                        i2 = 0;
                                    }
                                    oooO0o12.OooO00o(oooO0o8, i2);
                                } else {
                                    oooO0o13.OooO00o(oooO0o9, 0);
                                }
                                i33++;
                                oooO8 = oooO9;
                            }
                        }
                    }
                    i33++;
                    oooO8 = oooO9;
                } else {
                    return;
                }
            }
        }
    }

    public final int OooO0OO() {
        if (this.f741OooO00o == 1) {
            return this.OooOOO0 - this.f755OooOOo.f776o0000O00;
        }
        return this.OooOOO0;
    }

    public final int OooO0Oo() {
        if (this.f741OooO00o == 0) {
            return this.f751OooOO0o - this.f755OooOOo.f762o0000;
        }
        return this.f751OooOO0o;
    }

    public final void OooO0o(int i, OooO0o oooO0o, OooO0o oooO0o2, OooO0o oooO0o3, OooO0o oooO0o4, int i2, int i3, int i4, int i5, int i6) {
        this.f741OooO00o = i;
        this.f744OooO0Oo = oooO0o;
        this.f746OooO0o0 = oooO0o2;
        this.f745OooO0o = oooO0o3;
        this.f747OooO0oO = oooO0o4;
        this.f748OooO0oo = i2;
        this.f740OooO = i3;
        this.f749OooOO0 = i4;
        this.f750OooOO0O = i5;
        this.f756OooOOo0 = i6;
    }

    public final void OooO0o0(int i) {
        OooOOO0 oooOOO0;
        int i2;
        int i3;
        int i4;
        int i5;
        int OooOOo02;
        int i6 = this.f754OooOOOo;
        if (i6 == 0) {
            return;
        }
        int i7 = this.f753OooOOOO;
        int i8 = i / i6;
        int i9 = 0;
        while (true) {
            oooOOO0 = this.f755OooOOo;
            if (i9 >= i7 || (i2 = this.f752OooOOO + i9) >= oooOOO0.f782o0000Oo0) {
                break;
            }
            OooO oooO = oooOOO0.f781o0000OOo[i2];
            if (this.f741OooO00o == 0) {
                if (oooO != null) {
                    int[] iArr = oooO.f681o00o0O;
                    if (iArr[0] == 3 && oooO.f634OooOOo == 0) {
                        int i10 = iArr[1];
                        i4 = oooO.OooOO0o();
                        i5 = i10;
                        i3 = 1;
                        OooOOo02 = i8;
                        oooOOO0.OoooO(oooO, i3, OooOOo02, i5, i4);
                    }
                }
                i9++;
            } else {
                if (oooO != null) {
                    int[] iArr2 = oooO.f681o00o0O;
                    if (iArr2[1] == 3 && oooO.f636OooOOoo == 0) {
                        i3 = iArr2[0];
                        i4 = i8;
                        i5 = 1;
                        OooOOo02 = oooO.OooOOo0();
                        oooOOO0.OoooO(oooO, i3, OooOOo02, i5, i4);
                    }
                }
                i9++;
            }
        }
        this.f751OooOO0o = 0;
        this.OooOOO0 = 0;
        this.f742OooO0O0 = null;
        this.f743OooO0OO = 0;
        int i11 = this.f753OooOOOO;
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = this.f752OooOOO + i12;
            if (i13 < oooOOO0.f782o0000Oo0) {
                OooO oooO2 = oooOOO0.f781o0000OOo[i13];
                if (this.f741OooO00o == 0) {
                    int OooOOo03 = oooO2.OooOOo0();
                    int i14 = oooOOO0.f762o0000;
                    if (oooO2.f675Oooooo0 == 8) {
                        i14 = 0;
                    }
                    this.f751OooOO0o = OooOOo03 + i14 + this.f751OooOO0o;
                    int OoooO02 = oooOOO0.OoooO0(this.f756OooOOo0, oooO2);
                    if (this.f742OooO0O0 == null || this.f743OooO0OO < OoooO02) {
                        this.f742OooO0O0 = oooO2;
                        this.f743OooO0OO = OoooO02;
                        this.OooOOO0 = OoooO02;
                    }
                } else {
                    int OoooO0O2 = oooOOO0.OoooO0O(this.f756OooOOo0, oooO2);
                    int OoooO03 = oooOOO0.OoooO0(this.f756OooOOo0, oooO2);
                    int i15 = oooOOO0.f776o0000O00;
                    if (oooO2.f675Oooooo0 == 8) {
                        i15 = 0;
                    }
                    this.OooOOO0 = OoooO03 + i15 + this.OooOOO0;
                    if (this.f742OooO0O0 == null || this.f743OooO0OO < OoooO0O2) {
                        this.f742OooO0O0 = oooO2;
                        this.f743OooO0OO = OoooO0O2;
                        this.f751OooOO0o = OoooO0O2;
                    }
                }
            } else {
                return;
            }
        }
    }
}