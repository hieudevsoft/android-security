package OooOoo;

import com.google.crypto.tink.shaded.protobuf.OooO0O0;
import com.google.crypto.tink.shaded.protobuf.OooOo;

/* loaded from: classes.dex */
public abstract class o0Oo0oo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Object f1219OooO00o;

    public /* synthetic */ o0Oo0oo(Object obj) {
        this.f1219OooO00o = obj;
    }

    public abstract com.google.crypto.tink.shaded.protobuf.o0O0O00 OooO00o(OooO0O0 oooO0O0);

    public abstract boolean OooO0O0();

    public final boolean OooO0OO(CharSequence charSequence, int i) {
        if (charSequence != null && i >= 0 && charSequence.length() - i >= 0) {
            o0OOO0o o0ooo0o = (o0OOO0o) this.f1219OooO00o;
            if (o0ooo0o == null) {
                return OooO0O0();
            }
            int OooO00o2 = o0ooo0o.OooO00o(charSequence, i);
            if (OooO00o2 == 0) {
                return true;
            }
            if (OooO00o2 != 1) {
                return OooO0O0();
            }
            return false;
        }
        throw new IllegalArgumentException();
    }

    public abstract com.google.crypto.tink.shaded.protobuf.o0O0O00 OooO0Oo(OooOo oooOo);

    public abstract void OooO0o0(OooO0O0 oooO0O0);
}