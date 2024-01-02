package OoooOOo;

import o00000.o00Ooo;
import o00000.oo000o;
import o0OO00O.OooO0OO;
import oo0o0Oo.OooOO0;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum OooO0O0 uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class o0OO0 {

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final o0OO0 f1578OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public static final /* synthetic */ o0OO0[] f1579OooO0OO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final OooO0OO f1580OooO00o;

    static {
        o00Ooo OooOOo2 = oo000o.OooOOo();
        OooOOo2.OooO0OO();
        oo000o.OooOOOo((oo000o) OooOOo2.f3737OooO0O0);
        o0OO0 o0oo0 = new o0OO0(OooO0OO.OooO0O0(new OooOO0(3).OooOOO0(), ((oo000o) OooOOo2.OooO00o()).OooO0Oo()));
        f1578OooO0O0 = o0oo0;
        f1579OooO0OO = new o0OO0[]{o0oo0};
    }

    public o0OO0(OooO0OO oooO0OO) {
        this.f1580OooO00o = oooO0OO;
    }

    public static o0OO0 valueOf(String str) {
        return (o0OO0) Enum.valueOf(o0OO0.class, str);
    }

    public static o0OO0[] values() {
        return (o0OO0[]) f1579OooO0OO.clone();
    }
}