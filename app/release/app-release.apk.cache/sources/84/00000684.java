package o000oOoO;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class o00oOoo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public int f5101OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f5102OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public boolean f5103OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public boolean f5104OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public int[] f5105OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public boolean f5106OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f5107OooO0oO;

    public o00oOoo(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f5107OooO0oO = staggeredGridLayoutManager;
        OooO00o();
    }

    public final void OooO00o() {
        this.f5101OooO00o = -1;
        this.f5102OooO0O0 = Integer.MIN_VALUE;
        this.f5103OooO0OO = false;
        this.f5104OooO0Oo = false;
        this.f5106OooO0o0 = false;
        int[] iArr = this.f5105OooO0o;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}