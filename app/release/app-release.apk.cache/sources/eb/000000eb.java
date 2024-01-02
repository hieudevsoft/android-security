package OooOo0o;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class o00000 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final ColorStateList f1158OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final Configuration f1159OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final int f1160OooO0OO;

    public o00000(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f1158OooO00o = colorStateList;
        this.f1159OooO0O0 = configuration;
        this.f1160OooO0OO = theme == null ? 0 : theme.hashCode();
    }
}