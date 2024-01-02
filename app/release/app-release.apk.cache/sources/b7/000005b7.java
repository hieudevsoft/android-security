package o0000Oo0;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import o00000oo.o00O0O;
import o0000O00.OooO00o;
import o0000O0O.o0OoOo0;

/* loaded from: classes.dex */
public final class OooOOO extends o000OO.OooOO0 implements o0OoOo0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f4398OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ boolean f4399OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ Object f4400OooO0OO;

    public /* synthetic */ OooOOO(Object obj, boolean z, int i) {
        this.f4398OooO00o = i;
        this.f4400OooO0OO = obj;
        this.f4399OooO0O0 = z;
    }

    public final o00O0O OooO0OO(int i, CharSequence charSequence) {
        Object obj;
        o00O0O o00o0o;
        Object obj2;
        int i2 = this.f4398OooO00o;
        Object obj3 = this.f4400OooO0OO;
        switch (i2) {
            case 0:
                OooO00o.OooOoo0(charSequence, "$this$$receiver");
                int o00O0Oo0 = OooOOOO.o00O0Oo0(i, charSequence, this.f4399OooO0O0, (char[]) obj3);
                if (o00O0Oo0 < 0) {
                    return null;
                }
                return new o00O0O(Integer.valueOf(o00O0Oo0), 1);
            default:
                OooO00o.OooOoo0(charSequence, "$this$$receiver");
                List list = (List) obj3;
                boolean z = this.f4399OooO0O0;
                if (!z && list.size() == 1) {
                    int size = list.size();
                    if (size != 0) {
                        if (size == 1) {
                            String str = (String) list.get(0);
                            int o00O0OOO = OooOOOO.o00O0OOO(i, charSequence, str, false);
                            if (o00O0OOO >= 0) {
                                o00o0o = new o00O0O(Integer.valueOf(o00O0OOO), str);
                            }
                            o00o0o = null;
                        } else {
                            throw new IllegalArgumentException("List has more than one element.");
                        }
                    } else {
                        throw new NoSuchElementException("List is empty.");
                    }
                } else {
                    if (i < 0) {
                        i = 0;
                    }
                    o0000OO.OooO0OO oooO0OO = new o0000OO.OooO0OO(i, charSequence.length());
                    boolean z2 = charSequence instanceof String;
                    int i3 = oooO0OO.f4158OooO0OO;
                    int i4 = oooO0OO.f4157OooO0O0;
                    if (z2) {
                        if ((i3 > 0 && i <= i4) || (i3 < 0 && i4 <= i)) {
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj2 = it.next();
                                        String str2 = (String) obj2;
                                        if (OooOOOO.o00O0OoO(0, i, str2.length(), str2, (String) charSequence, z)) {
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                String str3 = (String) obj2;
                                if (str3 != null) {
                                    o00o0o = new o00O0O(Integer.valueOf(i), str3);
                                } else if (i != i4) {
                                    i += i3;
                                }
                            }
                        }
                        o00o0o = null;
                    } else {
                        if ((i3 > 0 && i <= i4) || (i3 < 0 && i4 <= i)) {
                            while (true) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj = it2.next();
                                        String str4 = (String) obj;
                                        if (OooOOOO.o00O0Ooo(str4, 0, charSequence, i, str4.length(), z)) {
                                        }
                                    } else {
                                        obj = null;
                                    }
                                }
                                String str5 = (String) obj;
                                if (str5 != null) {
                                    o00o0o = new o00O0O(Integer.valueOf(i), str5);
                                } else if (i != i4) {
                                    i += i3;
                                }
                            }
                        }
                        o00o0o = null;
                    }
                }
                if (o00o0o == null) {
                    return null;
                }
                return new o00O0O(o00o0o.f4100OooO00o, Integer.valueOf(((String) o00o0o.f4101OooO0O0).length()));
        }
    }
}