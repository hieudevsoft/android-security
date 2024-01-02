package OooOooo;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* loaded from: classes.dex */
public abstract class o00O0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final int f1287OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final Class f1288OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final int f1289OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final int f1290OooO0Oo;

    public o00O0(int i, Class cls, int i2, int i3) {
        this.f1287OooO00o = i;
        this.f1288OooO0O0 = cls;
        this.f1290OooO0Oo = i2;
        this.f1289OooO0OO = i3;
    }

    public static boolean OooO00o(Boolean bool, Boolean bool2) {
        return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
    }

    public final Object OooO0O0(View view) {
        boolean z;
        if (Build.VERSION.SDK_INT >= this.f1289OooO0OO) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            o00O00o0 o00o00o0 = (o00O00o0) this;
            int i = o00o00o0.f1297OooO0o0;
            switch (i) {
                case 0:
                    return o00o00o0.OooO0Oo(view);
                case 1:
                    switch (i) {
                        case 1:
                            return o00OO0O0.OooO0O0(view);
                        default:
                            return oo0O.OooO0O0(view);
                    }
                case 2:
                    switch (i) {
                        case 1:
                            return o00OO0O0.OooO0O0(view);
                        default:
                            return oo0O.OooO0O0(view);
                    }
                default:
                    return o00o00o0.OooO0Oo(view);
            }
        }
        Object tag = view.getTag(this.f1287OooO00o);
        if (this.f1288OooO0O0.isInstance(tag)) {
            return tag;
        }
        return null;
    }

    public final void OooO0OO(View view, Object obj) {
        boolean z;
        boolean OooO00o2;
        o0000O o0000o2;
        if (Build.VERSION.SDK_INT >= this.f1289OooO0OO) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i = ((o00O00o0) this).f1297OooO0o0;
            switch (i) {
                case 0:
                    Boolean bool = (Boolean) obj;
                    switch (i) {
                        case 0:
                            o00OO0O0.OooOO0(view, bool.booleanValue());
                            return;
                        default:
                            o00OO0O0.OooO0oO(view, bool.booleanValue());
                            return;
                    }
                case 1:
                    CharSequence charSequence = (CharSequence) obj;
                    switch (i) {
                        case 1:
                            o00OO0O0.OooO0oo(view, charSequence);
                            return;
                        default:
                            oo0O.OooO0o(view, charSequence);
                            return;
                    }
                case 2:
                    CharSequence charSequence2 = (CharSequence) obj;
                    switch (i) {
                        case 1:
                            o00OO0O0.OooO0oo(view, charSequence2);
                            return;
                        default:
                            oo0O.OooO0o(view, charSequence2);
                            return;
                    }
                default:
                    Boolean bool2 = (Boolean) obj;
                    switch (i) {
                        case 0:
                            o00OO0O0.OooOO0(view, bool2.booleanValue());
                            return;
                        default:
                            o00OO0O0.OooO0oO(view, bool2.booleanValue());
                            return;
                    }
            }
        }
        Object OooO0O02 = OooO0O0(view);
        int i2 = ((o00O00o0) this).f1297OooO0o0;
        switch (i2) {
            case 0:
                Boolean bool3 = (Boolean) OooO0O02;
                Boolean bool4 = (Boolean) obj;
                switch (i2) {
                    case 0:
                        OooO00o2 = OooO00o(bool3, bool4);
                        break;
                    default:
                        OooO00o2 = OooO00o(bool3, bool4);
                        break;
                }
            case 1:
                CharSequence charSequence3 = (CharSequence) OooO0O02;
                CharSequence charSequence4 = (CharSequence) obj;
                switch (i2) {
                    case 1:
                        OooO00o2 = TextUtils.equals(charSequence3, charSequence4);
                        break;
                    default:
                        OooO00o2 = TextUtils.equals(charSequence3, charSequence4);
                        break;
                }
            case 2:
                CharSequence charSequence5 = (CharSequence) OooO0O02;
                CharSequence charSequence6 = (CharSequence) obj;
                switch (i2) {
                    case 1:
                        OooO00o2 = TextUtils.equals(charSequence5, charSequence6);
                        break;
                    default:
                        OooO00o2 = TextUtils.equals(charSequence5, charSequence6);
                        break;
                }
            default:
                Boolean bool5 = (Boolean) OooO0O02;
                Boolean bool6 = (Boolean) obj;
                switch (i2) {
                    case 0:
                        OooO00o2 = OooO00o(bool5, bool6);
                        break;
                    default:
                        OooO00o2 = OooO00o(bool5, bool6);
                        break;
                }
        }
        if (!OooO00o2) {
            View.AccessibilityDelegate OooO0OO2 = o0o0Oo.OooO0OO(view);
            if (OooO0OO2 == null) {
                o0000o2 = null;
            } else if (OooO0OO2 instanceof o0000O0O) {
                o0000o2 = ((o0000O0O) OooO0OO2).f1273OooO00o;
            } else {
                o0000o2 = new o0000O(OooO0OO2);
            }
            if (o0000o2 == null) {
                o0000o2 = new o0000O();
            }
            o0o0Oo.OooOO0o(view, o0000o2);
            view.setTag(this.f1287OooO00o, obj);
            o0o0Oo.OooO0oO(view, this.f1290OooO0Oo);
        }
    }
}