package androidx.appcompat.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* loaded from: classes.dex */
public class o00000OO {

    /* renamed from: OooO0OO  reason: collision with root package name */
    public static final int[] f2272OooO0OO = {16843067, 16843068};

    /* renamed from: OooO00o  reason: collision with root package name */
    public final ProgressBar f2273OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public Bitmap f2274OooO0O0;

    public o00000OO(ProgressBar progressBar) {
        this.f2273OooO00o = progressBar;
    }

    public void OooO00o(AttributeSet attributeSet, int i) {
        ProgressBar progressBar = this.f2273OooO00o;
        o0oO0O0o OooOOO0 = o0oO0O0o.OooOOO0(progressBar.getContext(), attributeSet, f2272OooO0OO, i);
        Drawable OooO0o2 = OooOOO0.OooO0o(0);
        if (OooO0o2 != null) {
            if (OooO0o2 instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) OooO0o2;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable OooO0O02 = OooO0O0(animationDrawable.getFrame(i2), true);
                    OooO0O02.setLevel(10000);
                    animationDrawable2.addFrame(OooO0O02, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                OooO0o2 = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(OooO0o2);
        }
        Drawable OooO0o3 = OooOOO0.OooO0o(1);
        if (OooO0o3 != null) {
            progressBar.setProgressDrawable(OooO0O0(OooO0o3, false));
        }
        OooOOO0.OooOOOO();
    }

    public final Drawable OooO0O0(Drawable drawable, boolean z) {
        boolean z2;
        if (drawable instanceof OooOoO0.oo0o0Oo) {
            ((OooOoO0.o0O0O00) ((OooOoO0.oo0o0Oo) drawable)).getClass();
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                Drawable drawable2 = layerDrawable.getDrawable(i);
                if (id != 16908301 && id != 16908303) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                drawableArr[i] = OooO0O0(drawable2, z2);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
                layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
                layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
                layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
                layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
                layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
                layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
                layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
                layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
                layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f2274OooO0O0 == null) {
                this.f2274OooO0O0 = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            if (z) {
                return new ClipDrawable(shapeDrawable, 3, 1);
            }
            return shapeDrawable;
        }
        return drawable;
    }
}