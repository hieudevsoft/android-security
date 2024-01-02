package androidx.constraintlayout.helper.widget;

import OooOOO.OooO;
import OooOOO.OooOOO0;
import OooOOo0.o00Ooo;
import OooOOo0.o00oO0o;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class Flow extends o00oO0o {

    /* renamed from: OooOO0  reason: collision with root package name */
    public OooOOO0 f2583OooOO0;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // OooOOo0.o00oO0o, OooOOo0.OooO0OO
    public final void OooO0oO(AttributeSet attributeSet) {
        super.OooO0oO(attributeSet);
        this.f2583OooOO0 = new OooOOO0();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o00Ooo.f1076OooO0O0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f2583OooOO0.f786o000OO = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    OooOOO0 oooOOO0 = this.f2583OooOO0;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    oooOOO0.o00oO0o = dimensionPixelSize;
                    oooOOO0.f788o00oO0O = dimensionPixelSize;
                    oooOOO0.f792o0ooOO0 = dimensionPixelSize;
                    oooOOO0.f793o0ooOOo = dimensionPixelSize;
                } else if (index == 18) {
                    OooOOO0 oooOOO02 = this.f2583OooOO0;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    oooOOO02.f792o0ooOO0 = dimensionPixelSize2;
                    oooOOO02.f794o0ooOoO = dimensionPixelSize2;
                    oooOOO02.f791o0OOO0o = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f2583OooOO0.f793o0ooOOo = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f2583OooOO0.f794o0ooOoO = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f2583OooOO0.o00oO0o = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f2583OooOO0.f791o0OOO0o = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f2583OooOO0.f788o00oO0O = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f2583OooOO0.f775o0000O0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f2583OooOO0.f764o000000 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f2583OooOO0.f765o000000O = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f2583OooOO0.f766o000000o = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f2583OooOO0.f768o00000O0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f2583OooOO0.f763o00000 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f2583OooOO0.f767o00000O = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f2583OooOO0.f769o00000OO = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f2583OooOO0.f771o00000o0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f2583OooOO0.f772o00000oO = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f2583OooOO0.f783o0000Ooo = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f2583OooOO0.f773o00000oo = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f2583OooOO0.f770o00000Oo = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f2583OooOO0.f785o0000oo = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f2583OooOO0.f784o0000oO = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f2583OooOO0.f762o0000 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f2583OooOO0.f776o0000O00 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f2583OooOO0.f777o0000O0O = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f941OooO0Oo = this.f2583OooOO0;
        OooO();
    }

    @Override // OooOOo0.OooO0OO
    public final void OooO0oo(OooO oooO, boolean z) {
        OooOOO0 oooOOO0 = this.f2583OooOO0;
        int i = oooOOO0.f792o0ooOO0;
        if (i > 0 || oooOOO0.f793o0ooOOo > 0) {
            if (z) {
                oooOOO0.f794o0ooOoO = oooOOO0.f793o0ooOOo;
                oooOOO0.f791o0OOO0o = i;
                return;
            }
            oooOOO0.f794o0ooOoO = i;
            oooOOO0.f791o0OOO0o = oooOOO0.f793o0ooOOo;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x019c, code lost:
        if (((r8.f762o0000 + r3) + r19) <= r4) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01a0, code lost:
        if (r0.f742OooO0O0 == null) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01a2, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01a4, code lost:
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01a5, code lost:
        if (r1 != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01a7, code lost:
        if (r7 <= 0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01a9, code lost:
        r2 = r8.f777o0000O0O;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01ab, code lost:
        if (r2 <= 0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01ad, code lost:
        if (r6 <= r2) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01af, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01b0, code lost:
        if (r1 == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01b2, code lost:
        r23 = r10;
        r38 = r4;
        r39 = r11;
        r11 = r5;
        r40 = r12;
        r12 = r7;
        r3 = new OooOOO.OooOO0O(r43, r7, r8.f650Oooo0, r8.f654Oooo0O0, r8.f655Oooo0OO, r8.f657Oooo0o0, r38);
        r3.f752OooOOO = r12;
        r15.add(r3);
        r0 = r3;
        r3 = r19;
        r1 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01ec, code lost:
        r38 = r4;
        r23 = r10;
        r39 = r11;
        r40 = r12;
        r11 = r5;
        r12 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01f6, code lost:
        if (r12 <= 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01f8, code lost:
        r19 = (r8.f762o0000 + r19) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01fe, code lost:
        r3 = r19;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0201, code lost:
        r0.OooO00o(r11);
        r7 = r12 + 1;
        r2 = r23;
        r30 = r38;
        r11 = r39;
        r12 = r40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0211, code lost:
        r39 = r11;
        r40 = r12;
        r12 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0219, code lost:
        r39 = r11;
        r40 = r12;
        r38 = r30;
        r1 = 0;
        r2 = 0;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0222, code lost:
        if (r10 >= r14) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0224, code lost:
        r11 = r13[r10];
        r12 = r38;
        r19 = r8.OoooO0(r12, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0232, code lost:
        if (r11.f681o00o0O[1] != 3) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0234, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0236, code lost:
        r20 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0238, code lost:
        if (r2 == r12) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x023f, code lost:
        if (((r8.f776o0000O00 + r2) + r19) <= r12) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0243, code lost:
        if (r0.f742OooO0O0 == null) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0245, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0247, code lost:
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0248, code lost:
        if (r7 != false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x024a, code lost:
        if (r10 <= 0) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x024c, code lost:
        r1 = r8.f777o0000O0O;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x024e, code lost:
        if (r1 <= 0) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0250, code lost:
        if (r1 >= 0) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0252, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0253, code lost:
        if (r7 == false) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0255, code lost:
        r38 = r13;
        r7 = new OooOOO.OooOO0O(r43, r7, r8.f650Oooo0, r8.f654Oooo0O0, r8.f655Oooo0OO, r8.f657Oooo0o0, r12);
        r7.f752OooOOO = r10;
        r15.add(r7);
        r0 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0272, code lost:
        r38 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0274, code lost:
        if (r10 <= 0) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0276, code lost:
        r2 = (r8.f776o0000O00 + r19) + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x027d, code lost:
        r2 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x027f, code lost:
        r0.OooO00o(r11);
        r10 = r10 + 1;
        r1 = r20;
        r13 = r38;
        r38 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x028b, code lost:
        r12 = r38;
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x028e, code lost:
        r0 = r15.size();
        r1 = r8.f794o0ooOoO;
        r3 = r8.o00oO0o;
        r4 = r8.f791o0OOO0o;
        r5 = r8.f788o00oO0O;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x029e, code lost:
        if (r9[0] == 2) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02a3, code lost:
        if (r9[1] != 2) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02a6, code lost:
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02a8, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02a9, code lost:
        if (r2 <= 0) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02ab, code lost:
        if (r7 == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02ad, code lost:
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02ae, code lost:
        if (r2 >= r0) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02b0, code lost:
        r6 = (OooOOO.OooOO0O) r15.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02b6, code lost:
        if (r7 != 0) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02b8, code lost:
        r7 = r6.OooO0Oo();
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02bd, code lost:
        r7 = r6.OooO0OO();
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02c1, code lost:
        r6.OooO0o0(r12 - r7);
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02c9, code lost:
        r6 = r3;
        r2 = r7;
        r13 = r9;
        r11 = r9;
        r7 = 0;
        r9 = 0;
        r10 = 0;
        r3 = r1;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02d6, code lost:
        if (r7 >= r0) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02d8, code lost:
        r14 = (OooOOO.OooOO0O) r15.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02de, code lost:
        if (r7 != 0) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02e2, code lost:
        if (r7 >= (r0 - 1)) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02e4, code lost:
        r11 = ((OooOOO.OooOO0O) r15.get(r7 + 1)).f742OooO0O0.f654Oooo0O0;
        r41 = r15;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02f5, code lost:
        r5 = r8.f788o00oO0O;
        r41 = r15;
        r11 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02fb, code lost:
        r15 = r14.f742OooO0O0.f657Oooo0o0;
        r14.OooO0o(r7, r1, r2, r13, r11, r3, r6, r4, r5, r12);
        r2 = java.lang.Math.max(r9, r14.OooO0Oo());
        r6 = r14.OooO0OO() + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0325, code lost:
        if (r7 <= 0) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0327, code lost:
        r6 = r6 + r8.f776o0000O00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x032a, code lost:
        r44 = r0;
        r9 = r2;
        r10 = r6;
        r0 = r13;
        r2 = r15;
        r13 = r41;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0334, code lost:
        r41 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0338, code lost:
        if (r7 >= (r0 - 1)) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x033a, code lost:
        r13 = r41;
        r4 = ((OooOOO.OooOO0O) r13.get(r7 + 1)).f742OooO0O0.f650Oooo0;
        r44 = r0;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x034c, code lost:
        r13 = r41;
        r44 = r0;
        r15 = r8.f791o0OOO0o;
        r4 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0355, code lost:
        r0 = r14.f742OooO0O0.f655Oooo0OO;
        r14.OooO0o(r7, r1, r2, r4, r11, r3, r6, r15, r5, r12);
        r1 = r14.OooO0Oo() + r9;
        r3 = java.lang.Math.max(r10, r14.OooO0OO());
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x037f, code lost:
        if (r7 <= 0) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0381, code lost:
        r1 = r1 + r8.f762o0000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0384, code lost:
        r9 = r1;
        r10 = r3;
        r3 = 0;
        r1 = r0;
        r0 = r4;
        r4 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x038a, code lost:
        r7 = r7 + 1;
        r15 = r13;
        r13 = r0;
        r0 = r44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0392, code lost:
        r31[0] = r9;
        r31[1] = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x039a, code lost:
        r40 = r12;
        r12 = r18;
        r0 = r8.f786o000OO;
        r1 = r8.f777o0000O0O;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x03b2, code lost:
        if (r0 != 0) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x03b4, code lost:
        if (r1 > 0) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03b6, code lost:
        r1 = 0;
        r2 = 0;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x03b9, code lost:
        if (r1 >= r14) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x03bb, code lost:
        if (r1 <= 0) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x03bd, code lost:
        r2 = r2 + r8.f762o0000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x03c0, code lost:
        r4 = r13[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x03c2, code lost:
        if (r4 != null) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x03c5, code lost:
        r4 = r8.OoooO0O(r12, r4) + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x03ca, code lost:
        if (r4 <= r12) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x03cd, code lost:
        r3 = r3 + 1;
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x03d0, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x03d3, code lost:
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x03d4, code lost:
        r2 = r1;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03d7, code lost:
        if (r1 > 0) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x03d9, code lost:
        r1 = 0;
        r2 = 0;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03dc, code lost:
        if (r1 >= r14) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x03de, code lost:
        if (r1 <= 0) goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x03e0, code lost:
        r2 = r2 + r8.f776o0000O00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x03e3, code lost:
        r4 = r13[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03e5, code lost:
        if (r4 != null) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x03e8, code lost:
        r4 = r8.OoooO0(r12, r4) + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x03ed, code lost:
        if (r4 <= r12) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x03f0, code lost:
        r3 = r3 + 1;
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x03f3, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x03f6, code lost:
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x03f7, code lost:
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x03fa, code lost:
        if (r8.f780o0000OOO != null) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x03fc, code lost:
        r8.f780o0000OOO = new int[2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0401, code lost:
        if (r1 != 0) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0404, code lost:
        if (r0 == 1) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0406, code lost:
        if (r2 != 0) goto L336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0408, code lost:
        if (r0 != 0) goto L336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x040a, code lost:
        r15 = r42;
        r3 = r1;
        r4 = r2;
        r1 = r8;
        r9 = r27;
        r5 = r2;
        r6 = r6;
        r10 = r10;
        r13 = r13;
        r11 = r11;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x041d, code lost:
        r15 = r42;
        r3 = r1;
        r4 = r2;
        r1 = r8;
        r9 = r27;
        r5 = r2;
        r6 = r6;
        r10 = r10;
        r13 = r13;
        r11 = r11;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x042f, code lost:
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0431, code lost:
        if (r7 != false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0433, code lost:
        if (r0 != 0) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0435, code lost:
        r43 = r0;
        r45 = r1;
        r1 = (int) java.lang.Math.ceil(r14 / r4);
        r0 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0445, code lost:
        r43 = r0;
        r45 = r1;
        r0 = (int) java.lang.Math.ceil(r14 / r3);
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0453, code lost:
        r3 = r8.f778o0000OO;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0455, code lost:
        if (r3 == null) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0458, code lost:
        if (r3.length >= r0) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x045b, code lost:
        java.util.Arrays.fill(r3, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0460, code lost:
        r8.f778o0000OO = new OooOOO.OooO[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0465, code lost:
        r3 = r8.f779o0000OO0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0467, code lost:
        if (r3 == null) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x046a, code lost:
        if (r3.length >= r1) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x046d, code lost:
        java.util.Arrays.fill(r3, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0472, code lost:
        r8.f779o0000OO0 = new OooOOO.OooO[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0476, code lost:
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0477, code lost:
        if (r3 >= r0) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0479, code lost:
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x047a, code lost:
        if (r4 >= r1) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x047c, code lost:
        r16 = (r4 * r0) + r3;
        r17 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0483, code lost:
        if (r0 != 1) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0485, code lost:
        r16 = (r3 * r1) + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0489, code lost:
        r6 = r16;
        r16 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x048e, code lost:
        if (r6 < r13.length) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0491, code lost:
        r6 = r13[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0493, code lost:
        if (r6 != null) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0495, code lost:
        r18 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0498, code lost:
        r7 = r8.OoooO0O(r12, r6);
        r18 = r9;
        r9 = r8.f778o0000OO[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x04a2, code lost:
        if (r9 == null) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x04a8, code lost:
        if (r9.OooOOo0() >= r7) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x04aa, code lost:
        r8.f778o0000OO[r3] = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x04ae, code lost:
        r7 = r8.OoooO0(r12, r6);
        r9 = r8.f779o0000OO0[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x04b6, code lost:
        if (r9 == null) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x04bc, code lost:
        if (r9.OooOO0o() >= r7) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x04be, code lost:
        r8.f779o0000OO0[r4] = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x04c2, code lost:
        r4 = r4 + 1;
        r7 = r16;
        r6 = r17;
        r9 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x04cb, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x04d4, code lost:
        r17 = r6;
        r16 = r7;
        r18 = r9;
        r3 = 0;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x04dc, code lost:
        if (r3 >= r0) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x04de, code lost:
        r6 = r8.f778o0000OO[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x04e2, code lost:
        if (r6 == null) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x04e4, code lost:
        if (r3 <= 0) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x04e6, code lost:
        r4 = r4 + r8.f762o0000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x04e9, code lost:
        r4 = r8.OoooO0O(r12, r6) + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x04ef, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x04f2, code lost:
        r3 = 0;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x04f4, code lost:
        if (r3 >= r1) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x04f6, code lost:
        r7 = r8.f779o0000OO0[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x04fa, code lost:
        if (r7 == null) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x04fc, code lost:
        if (r3 <= 0) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x04fe, code lost:
        r6 = r6 + r8.f776o0000O00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0501, code lost:
        r6 = r8.OoooO0(r12, r7) + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0507, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x050a, code lost:
        r5[0] = r4;
        r7 = true;
        r5[1] = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0510, code lost:
        if (r0 != 0) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0512, code lost:
        if (r4 <= r12) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0514, code lost:
        if (r0 <= 1) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0516, code lost:
        r0 = r0 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0519, code lost:
        if (r6 <= r12) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x051b, code lost:
        if (r1 <= 1) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x051d, code lost:
        r1 = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x051f, code lost:
        r4 = r0;
        r3 = r1;
        r0 = r43;
        r1 = r45;
        r7 = r16;
        r6 = r17;
        r9 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x052d, code lost:
        r4 = r0;
        r3 = r1;
        r6 = r17;
        r9 = r18;
        r0 = r43;
        r1 = r45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0539, code lost:
        r43 = r0;
        r0 = r8.f780o0000OOO;
        r0[0] = r4;
        r0[1] = r3;
        r8 = r43;
        r0 = r1;
        r2 = r2;
        r3 = r3;
        r4 = r4;
        r5 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0557, code lost:
        r31 = r2;
        r32 = r3;
        r33 = r4;
        r34 = r5;
        r35 = r6;
        r36 = r10;
        r39 = r11;
        r40 = r12;
        r13 = r15;
        r12 = r18;
        r10 = r8.f786o000OO;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0572, code lost:
        if (r14 != 0) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0576, code lost:
        r13.clear();
        r11 = new OooOOO.OooOO0O(r43, r10, r8.f650Oooo0, r8.f654Oooo0O0, r8.f655Oooo0OO, r8.f657Oooo0o0, r12);
        r13.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x058e, code lost:
        if (r10 != 0) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0590, code lost:
        r0 = 0;
        r1 = 0;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0593, code lost:
        if (r15 >= r14) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0595, code lost:
        r7 = r13[r15];
        r19 = r8.OoooO0O(r12, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x05a1, code lost:
        if (r7.f681o00o0O[0] != 3) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x05a3, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x05a5, code lost:
        r20 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x05a7, code lost:
        if (r1 == r12) goto L384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x05ae, code lost:
        if (((r8.f762o0000 + r1) + r19) <= r12) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x05b2, code lost:
        if (r11.f742OooO0O0 == null) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x05b4, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x05b6, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x05b7, code lost:
        if (r0 != false) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x05b9, code lost:
        if (r15 <= 0) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x05bb, code lost:
        r2 = r8.f777o0000O0O;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x05bd, code lost:
        if (r2 <= 0) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x05c1, code lost:
        if ((r15 % r2) != 0) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x05c3, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x05c4, code lost:
        if (r0 == false) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x05c6, code lost:
        r21 = r9;
        r9 = r7;
        r11 = new OooOOO.OooOO0O(r43, r10, r8.f650Oooo0, r8.f654Oooo0O0, r8.f655Oooo0OO, r8.f657Oooo0o0, r12);
        r11.f752OooOOO = r15;
        r13.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x05e1, code lost:
        r21 = r9;
        r9 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x05e4, code lost:
        if (r15 <= 0) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x05e6, code lost:
        r1 = (r8.f762o0000 + r19) + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x05ed, code lost:
        r1 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x05ef, code lost:
        r11.OooO00o(r9);
        r15 = r15 + 1;
        r0 = r20;
        r9 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x05f9, code lost:
        r21 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x05fd, code lost:
        r21 = r9;
        r0 = 0;
        r1 = 0;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0602, code lost:
        if (r9 >= r14) goto L461;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0604, code lost:
        r15 = r13[r9];
        r19 = r8.OoooO0(r12, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0610, code lost:
        if (r15.f681o00o0O[1] != 3) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0612, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0614, code lost:
        r20 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0616, code lost:
        if (r1 == r12) goto L458;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x061d, code lost:
        if (((r8.f776o0000O00 + r1) + r19) <= r12) goto L441;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0621, code lost:
        if (r11.f742OooO0O0 == null) goto L441;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0623, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0625, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0626, code lost:
        if (r0 != false) goto L449;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0628, code lost:
        if (r9 <= 0) goto L449;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x062a, code lost:
        r2 = r8.f777o0000O0O;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x062c, code lost:
        if (r2 <= 0) goto L449;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0630, code lost:
        if ((r9 % r2) != 0) goto L449;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0632, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0633, code lost:
        if (r0 == false) goto L454;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0635, code lost:
        r11 = new OooOOO.OooOO0O(r43, r10, r8.f650Oooo0, r8.f654Oooo0O0, r8.f655Oooo0OO, r8.f657Oooo0o0, r12);
        r11.f752OooOOO = r9;
        r13.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x0651, code lost:
        if (r9 <= 0) goto L451;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0653, code lost:
        r1 = (r8.f776o0000O00 + r19) + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x065a, code lost:
        r1 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x065c, code lost:
        r11.OooO00o(r15);
        r9 = r9 + 1;
        r0 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0664, code lost:
        r1 = r13.size();
        r2 = r8.f794o0ooOoO;
        r3 = r8.o00oO0o;
        r4 = r8.f791o0OOO0o;
        r5 = r8.f788o00oO0O;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0674, code lost:
        if (r21[0] == 2) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0679, code lost:
        if (r21[1] != 2) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x067c, code lost:
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x067e, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x067f, code lost:
        if (r0 <= 0) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0681, code lost:
        if (r7 == false) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x0683, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0684, code lost:
        if (r0 >= r1) goto L405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x0686, code lost:
        r6 = (OooOOO.OooOO0O) r13.get(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x068c, code lost:
        if (r10 != 0) goto L403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x068e, code lost:
        r7 = r6.OooO0Oo();
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x0693, code lost:
        r7 = r6.OooO0OO();
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x0697, code lost:
        r6.OooO0o0(r12 - r7);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x069f, code lost:
        r6 = r3;
        r0 = r1;
        r15 = r9;
        r14 = r9;
        r7 = 0;
        r9 = 0;
        r11 = 0;
        r3 = r2;
        r2 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x06ac, code lost:
        if (r7 >= r1) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x06ae, code lost:
        r44 = r5;
        r5 = (OooOOO.OooOO0O) r13.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x06b8, code lost:
        if (r10 != 0) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x06bc, code lost:
        if (r7 >= (r1 - 1)) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x06be, code lost:
        r14 = ((OooOOO.OooOO0O) r13.get(r7 + 1)).f742OooO0O0.f654Oooo0O0;
        r41 = r13;
        r37 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x06cf, code lost:
        r41 = r13;
        r37 = r8.f788o00oO0O;
        r14 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x06d7, code lost:
        r13 = r5.f742OooO0O0.f657Oooo0o0;
        r5.OooO0o(r10, r0, r2, r15, r14, r3, r6, r4, r37, r12);
        r2 = java.lang.Math.max(r9, r5.OooO0Oo());
        r5 = r5.OooO0OO() + r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x0701, code lost:
        if (r7 <= 0) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x0703, code lost:
        r5 = r5 + r8.f776o0000O00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x0706, code lost:
        r45 = r1;
        r9 = r2;
        r11 = r5;
        r2 = r13;
        r5 = r37;
        r13 = r41;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x0711, code lost:
        r41 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0715, code lost:
        if (r7 >= (r1 - 1)) goto L428;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x0717, code lost:
        r13 = r41;
        r45 = r1;
        r15 = ((OooOOO.OooOO0O) r13.get(r7 + 1)).f742OooO0O0.f650Oooo0;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x072a, code lost:
        r13 = r41;
        r4 = r8.f791o0OOO0o;
        r45 = r1;
        r15 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x0732, code lost:
        r1 = r5.f742OooO0O0.f655Oooo0OO;
        r5.OooO0o(r10, r0, r2, r15, r14, r3, r6, r4, r44, r12);
        r0 = r5.OooO0Oo() + r9;
        r3 = java.lang.Math.max(r11, r5.OooO0OO());
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x075c, code lost:
        if (r7 <= 0) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x075e, code lost:
        r0 = r0 + r8.f762o0000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x0761, code lost:
        r5 = r44;
        r9 = r0;
        r0 = r1;
        r11 = r3;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0767, code lost:
        r7 = r7 + 1;
        r1 = r45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x076d, code lost:
        r31[0] = r9;
        r31[1] = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0774, code lost:
        r31 = r2;
        r32 = r3;
        r33 = r4;
        r34 = r5;
        r35 = r6;
        r27 = r9;
        r36 = r10;
        r39 = r11;
        r40 = r12;
        r12 = r18;
        r2 = r8.f786o000OO;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x078d, code lost:
        if (r14 != 0) goto L464;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x078f, code lost:
        r15 = r42;
        r0 = r8;
        r9 = r27;
        r2 = r31;
        r3 = r32;
        r4 = r33;
        r5 = r34;
        r6 = r35;
        r10 = r36;
        r11 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x07a2, code lost:
        r12 = r40;
        r31 = r2;
        r1 = 0;
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x07ae, code lost:
        if (r15.size() != 0) goto L472;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x07b0, code lost:
        r9 = new OooOOO.OooOO0O(r43, r2, r8.f650Oooo0, r8.f654Oooo0O0, r8.f655Oooo0OO, r8.f657Oooo0o0, r12);
        r15.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x07c5, code lost:
        r9 = (OooOOO.OooOO0O) r15.get(0);
        r9.f743OooO0OO = 0;
        r9.f742OooO0O0 = null;
        r9.f751OooOO0o = 0;
        r9.OooOOO0 = 0;
        r9.f752OooOOO = 0;
        r9.f753OooOOOO = 0;
        r9.f754OooOOOo = 0;
        r9.OooO0o(r2, r8.f650Oooo0, r8.f654Oooo0O0, r8.f655Oooo0OO, r8.f657Oooo0o0, r8.f794o0ooOoO, r8.o00oO0o, r8.f791o0OOO0o, r8.f788o00oO0O, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x0805, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x0806, code lost:
        if (r0 >= r14) goto L470;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x0808, code lost:
        r9.OooO00o(r13[r0]);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x0810, code lost:
        r1 = 0;
        r31[0] = r9.OooO0Oo();
        r2 = 1;
        r31[1] = r9.OooO0OO();
        r15 = r42;
        r0 = r8;
        r9 = r27;
        r3 = r32;
        r4 = r33;
        r5 = r34;
        r6 = r35;
        r10 = r36;
        r11 = r39;
        r12 = r40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0831, code lost:
        r7 = (r31[r1] + r6) + r5;
        r1 = (r31[r2] + r4) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x083d, code lost:
        if (r9 != 1073741824) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x083f, code lost:
        r20 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x0842, code lost:
        if (r9 != Integer.MIN_VALUE) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x0844, code lost:
        r20 = java.lang.Math.min(r7, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x084b, code lost:
        if (r9 != 0) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x084d, code lost:
        r20 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x084f, code lost:
        r5 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0852, code lost:
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x0853, code lost:
        if (r11 != 1073741824) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0856, code lost:
        if (r11 != Integer.MIN_VALUE) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0858, code lost:
        r12 = java.lang.Math.min(r1, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x085f, code lost:
        if (r11 != 0) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x0861, code lost:
        r12 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x0863, code lost:
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0864, code lost:
        r8.f790o0OO00O = r5;
        r8.f795oo0o0Oo = r12;
        r8.Oooo0oO(r5);
        r8.Oooo0OO(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x0870, code lost:
        if (r8.f798oo000o <= 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0872, code lost:
        r13 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0874, code lost:
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x0875, code lost:
        r8.o0Oo0oo = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b6, code lost:
        if (r8.f765o000000O == (-1)) goto L474;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c1, code lost:
        if (r8.f765o000000O == (-1)) goto L474;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c3, code lost:
        r8.f765o000000O = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c5, code lost:
        r1 = r8.f797o00ooo;
        r14 = 0;
        r16 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ca, code lost:
        r13 = r8.f798oo000o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ce, code lost:
        if (r14 >= r13) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d6, code lost:
        if (r8.f797o00ooo[r14].f675Oooooo0 != 8) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d8, code lost:
        r16 = r16 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00da, code lost:
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00de, code lost:
        if (r16 <= 0) goto L473;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e0, code lost:
        r1 = new OooOOO.OooO[r13 - r16];
        r13 = 0;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00e8, code lost:
        if (r13 >= r8.f798oo000o) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00ea, code lost:
        r7 = r8.f797o00ooo[r13];
        r18 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f2, code lost:
        if (r7.f675Oooooo0 == 8) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00f4, code lost:
        r1[r14] = r7;
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f8, code lost:
        r13 = r13 + 1;
        r0 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00fd, code lost:
        r18 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0100, code lost:
        r18 = r0;
        r14 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0103, code lost:
        r13 = r1;
        r8.f781o0000OOo = r13;
        r8.f782o0000Oo0 = r14;
        r0 = r8.f775o0000O0;
        r15 = r8.f774o0000O;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x010c, code lost:
        if (r0 == 0) goto L462;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x010e, code lost:
        r7 = r8.f654Oooo0O0;
        r1 = r8.f650Oooo0;
        r27 = r9;
        r9 = r8.f655Oooo0OO;
        r9 = r8.f657Oooo0o0;
        r9 = r8.f681o00o0O;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0121, code lost:
        if (r0 == 1) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0124, code lost:
        if (r0 == 2) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0127, code lost:
        if (r0 == 3) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x012a, code lost:
        r7 = r8.f786o000OO;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x012c, code lost:
        if (r14 != 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x012e, code lost:
        r31 = r2;
        r32 = r3;
        r33 = r4;
        r34 = r5;
        r35 = r6;
        r36 = r10;
        r39 = r11;
        r40 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0140, code lost:
        r15.clear();
        r30 = r18;
        r31 = r2;
        r32 = r3;
        r33 = r4;
        r34 = r5;
        r35 = r6;
        r36 = r10;
        r0 = new OooOOO.OooOO0O(r43, r7, r8.f650Oooo0, r8.f654Oooo0O0, r8.f655Oooo0OO, r8.f657Oooo0o0, r30);
        r15.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0177, code lost:
        if (r7 != 0) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0179, code lost:
        r1 = 0;
        r2 = 0;
        r3 = 0;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x017d, code lost:
        if (r7 >= r14) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x017f, code lost:
        r6 = r1 + 1;
        r5 = r13[r7];
        r4 = r30;
        r19 = r8.OoooO0O(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0190, code lost:
        if (r5.f681o00o0O[0] != 3) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0192, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0194, code lost:
        r10 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0195, code lost:
        if (r3 == r4) goto L118;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // OooOOo0.o00oO0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooOO0(OooOOO.OooOOO0 r43, int r44, int r45) {
        /*
            Method dump skipped, instructions count: 2184
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Flow.OooOO0(OooOOO.OooOOO0, int, int):void");
    }

    @Override // OooOOo0.OooO0OO, android.view.View
    public final void onMeasure(int i, int i2) {
        OooOO0(this.f2583OooOO0, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.f2583OooOO0.f771o00000o0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f2583OooOO0.f766o000000o = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.f2583OooOO0.f783o0000Ooo = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f2583OooOO0.f763o00000 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f2583OooOO0.f785o0000oo = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.f2583OooOO0.f769o00000OO = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f2583OooOO0.f762o0000 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f2583OooOO0.f764o000000 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.f2583OooOO0.f772o00000oO = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.f2583OooOO0.f768o00000O0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.f2583OooOO0.f773o00000oo = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.f2583OooOO0.f767o00000O = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f2583OooOO0.f777o0000O0O = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f2583OooOO0.f786o000OO = i;
        requestLayout();
    }

    public void setPadding(int i) {
        OooOOO0 oooOOO0 = this.f2583OooOO0;
        oooOOO0.o00oO0o = i;
        oooOOO0.f788o00oO0O = i;
        oooOOO0.f792o0ooOO0 = i;
        oooOOO0.f793o0ooOOo = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f2583OooOO0.f788o00oO0O = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f2583OooOO0.f794o0ooOoO = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f2583OooOO0.f791o0OOO0o = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f2583OooOO0.o00oO0o = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f2583OooOO0.f784o0000oO = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.f2583OooOO0.f770o00000Oo = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f2583OooOO0.f776o0000O00 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f2583OooOO0.f765o000000O = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f2583OooOO0.f775o0000O0 = i;
        requestLayout();
    }
}