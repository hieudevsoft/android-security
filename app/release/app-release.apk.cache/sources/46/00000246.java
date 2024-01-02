package Ooooooo;

import OooOo.OooO00o;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import hieubui.eup.android_app_security.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o000oOoO.o0000O0;

/* loaded from: classes.dex */
public final class oO00o00O extends o0000O0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Paint f1896OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public List f1897OooO0O0;

    public oO00o00O() {
        Paint paint = new Paint();
        this.f1896OooO00o = paint;
        this.f1897OooO0O0 = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // o000oOoO.o0000O0
    public final void OooO0O0(Canvas canvas, RecyclerView recyclerView) {
        float OooO0O02;
        float f;
        float OooO00o2;
        int OooOoo02;
        Paint paint = this.f1896OooO00o;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        for (oOo00ooO ooo00ooo : this.f1897OooO0O0) {
            ooo00ooo.getClass();
            ThreadLocal threadLocal = OooO00o.f1108OooO00o;
            float f2 = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f2)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f2)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f2)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f2))));
            boolean o000OOo2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).o000OOo();
            float f3 = 0.0f;
            ooo00ooo.getClass();
            CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) recyclerView.getLayoutManager();
            if (o000OOo2) {
                float OooO0OO2 = carouselLayoutManager.f3334OooOOOo.OooO0OO();
                oO00o0 oo00o0 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f3334OooOOOo;
                int i = oo00o0.f1894OooO0O0;
                CarouselLayoutManager carouselLayoutManager2 = oo00o0.f1895OooO0OO;
                switch (i) {
                    case 0:
                        OooOoo02 = carouselLayoutManager2.f5018OooOOOO;
                        break;
                    default:
                        OooOoo02 = carouselLayoutManager2.f5018OooOOOO - carouselLayoutManager2.OooOoo0();
                        break;
                }
                f = OooOoo02;
                OooO00o2 = 0.0f;
                OooO0O02 = 0.0f;
                f3 = OooO0OO2;
            } else {
                OooO0O02 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f3334OooOOOo.OooO0O0();
                f = 0.0f;
                OooO00o2 = carouselLayoutManager.f3334OooOOOo.OooO00o();
            }
            canvas.drawLine(OooO00o2, f3, OooO0O02, f, paint);
        }
    }
}