package OooOoo;

/* loaded from: classes.dex */
public final class o0OoOo0 {

    /* renamed from: OooO0o0  reason: collision with root package name */
    public static final byte[] f1220OooO0o0 = new byte[1792];

    /* renamed from: OooO00o  reason: collision with root package name */
    public final CharSequence f1221OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final int f1222OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f1223OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public char f1224OooO0Oo;

    static {
        for (int i = 0; i < 1792; i++) {
            f1220OooO0o0[i] = Character.getDirectionality(i);
        }
    }

    public o0OoOo0(CharSequence charSequence) {
        this.f1221OooO00o = charSequence;
        this.f1222OooO0O0 = charSequence.length();
    }

    public final byte OooO00o() {
        CharSequence charSequence = this.f1221OooO00o;
        char charAt = charSequence.charAt(this.f1223OooO0OO - 1);
        this.f1224OooO0Oo = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f1223OooO0OO);
            this.f1223OooO0OO -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f1223OooO0OO--;
        char c = this.f1224OooO0Oo;
        if (c < 1792) {
            return f1220OooO0o0[c];
        }
        return Character.getDirectionality(c);
    }
}