package o0000Oo;

import java.util.ArrayList;
import java.util.Iterator;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class o00oO0o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public String f4291OooO00o;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public String f4294OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final ArrayList f4295OooO0o;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public ArrayList f4297OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public String f4298OooO0oo;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public String f4292OooO0O0 = "";

    /* renamed from: OooO0OO  reason: collision with root package name */
    public String f4293OooO0OO = "";

    /* renamed from: OooO0o0  reason: collision with root package name */
    public int f4296OooO0o0 = -1;

    public o00oO0o() {
        ArrayList arrayList = new ArrayList();
        this.f4295OooO0o = arrayList;
        arrayList.add("");
    }

    public final o0ooOOo OooO00o() {
        ArrayList arrayList;
        String str;
        String str2 = this.f4291OooO00o;
        if (str2 != null) {
            char[] cArr = o0ooOOo.f4343OooOO0;
            String OooOo002 = OooOOOO.OooOo00(this.f4292OooO0O0, 0, 0, false, 7);
            String OooOo003 = OooOOOO.OooOo00(this.f4293OooO0OO, 0, 0, false, 7);
            String str3 = this.f4294OooO0Oo;
            if (str3 != null) {
                int i = this.f4296OooO0o0;
                if (i == -1) {
                    String str4 = this.f4291OooO00o;
                    OooO00o.OooOo(str4);
                    i = OooOOOO.OooO0oO(str4);
                }
                int i2 = i;
                ArrayList arrayList2 = this.f4295OooO0o;
                ArrayList arrayList3 = new ArrayList(o0000.OooOOOO.o00O0O0o(arrayList2));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    char[] cArr2 = o0ooOOo.f4343OooOO0;
                    arrayList3.add(OooOOOO.OooOo00((String) it.next(), 0, 0, false, 7));
                }
                ArrayList<String> arrayList4 = this.f4297OooO0oO;
                String str5 = null;
                if (arrayList4 != null) {
                    arrayList = new ArrayList(o0000.OooOOOO.o00O0O0o(arrayList4));
                    for (String str6 : arrayList4) {
                        if (str6 != null) {
                            char[] cArr3 = o0ooOOo.f4343OooOO0;
                            str = OooOOOO.OooOo00(str6, 0, 0, true, 3);
                        } else {
                            str = null;
                        }
                        arrayList.add(str);
                    }
                } else {
                    arrayList = null;
                }
                String str7 = this.f4298OooO0oo;
                if (str7 != null) {
                    char[] cArr4 = o0ooOOo.f4343OooOO0;
                    str5 = OooOOOO.OooOo00(str7, 0, 0, false, 7);
                }
                return new o0ooOOo(str2, OooOo002, OooOo003, str3, i2, arrayList3, arrayList, str5, toString());
            }
            throw new IllegalStateException("host == null");
        }
        throw new IllegalStateException("scheme == null");
    }

    public final void OooO0O0(String str) {
        ArrayList arrayList;
        if (str != null) {
            char[] cArr = o0ooOOo.f4343OooOO0;
            arrayList = OooOOOO.OooOo0(OooOOOO.OooO0OO(str, 0, 0, " \"'<>#", true, false, true, false, 211));
        } else {
            arrayList = null;
        }
        this.f4297OooO0oO = arrayList;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:141:0x0281
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final void OooO0OO(o0000Oo.o0ooOOo r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 1137
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0000Oo.o00oO0o.OooO0OO(o0000Oo.o0ooOOo, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
        if (r1 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0096, code lost:
        if (r1 != o0000Oo.OooOOOO.OooO0oO(r3)) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0000Oo.o00oO0o.toString():java.lang.String");
    }
}