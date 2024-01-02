package o0000;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class Oooo0 extends OooOo {
    public static final void o00O0OoO(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, o0000O0O.OooOo oooOo) {
        o0000O00.OooO00o.OooOoo0(iterable, "<this>");
        o0000O00.OooO00o.OooOoo0(charSequence, "separator");
        o0000O00.OooO00o.OooOoo0(charSequence2, "prefix");
        o0000O00.OooO00o.OooOoo0(charSequence3, "postfix");
        o0000O00.OooO00o.OooOoo0(charSequence4, "truncated");
        sb.append(charSequence2);
        int i2 = 0;
        for (Object obj : iterable) {
            i2++;
            if (i2 > 1) {
                sb.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            o0000O00.OooO00o.OooOO0(sb, obj, oooOo);
        }
        if (i >= 0 && i2 > i) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static final void o00O0Ooo(List list, AbstractCollection abstractCollection) {
        o0000O00.OooO00o.OooOoo0(list, "<this>");
        for (Object obj : list) {
            abstractCollection.add(obj);
        }
    }

    public static final List o00O0o00(List list) {
        o0000O00.OooO00o.OooOoo0(list, "<this>");
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                return new ArrayList(list);
            }
            return o0000O00.OooO00o.o0000Oo(list.get(0));
        }
        return o0OoOo0.f3970OooO00o;
    }
}