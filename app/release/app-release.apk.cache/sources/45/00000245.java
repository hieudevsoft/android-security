package Ooooooo;

import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes.dex */
public final class oO00o0 extends oOo00o0o {

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ int f1894OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f1895OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oO00o0(int i, CarouselLayoutManager carouselLayoutManager, int i2) {
        super(i);
        this.f1894OooO0O0 = i2;
        this.f1895OooO0OO = carouselLayoutManager;
    }

    public final int OooO00o() {
        switch (this.f1894OooO0O0) {
            case 0:
                return this.f1895OooO0OO.OooOoo();
            default:
                return 0;
        }
    }

    public final int OooO0O0() {
        int i = this.f1894OooO0O0;
        CarouselLayoutManager carouselLayoutManager = this.f1895OooO0OO;
        switch (i) {
            case 0:
                return carouselLayoutManager.f5017OooOOO - carouselLayoutManager.OooOooO();
            default:
                return carouselLayoutManager.f5017OooOOO;
        }
    }

    public final int OooO0OO() {
        switch (this.f1894OooO0O0) {
            case 0:
                return 0;
            default:
                return this.f1895OooO0OO.OooOooo();
        }
    }
}