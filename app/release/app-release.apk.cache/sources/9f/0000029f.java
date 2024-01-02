package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class o00000 extends ImageView {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o00Oo0 f2259OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final o000000O f2260OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public boolean f2261OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o0O0o000.OooO00o(context);
        this.f2261OooO0OO = false;
        oo0OOoo.OooO00o(this, getContext());
        o00Oo0 o00oo0 = new o00Oo0(this);
        this.f2259OooO00o = o00oo0;
        o00oo0.OooO0o0(attributeSet, i);
        o000000O o000000o2 = new o000000O(this);
        this.f2260OooO0O0 = o000000o2;
        o000000o2.OooO0O0(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        o00Oo0 o00oo0 = this.f2259OooO00o;
        if (o00oo0 != null) {
            o00oo0.OooO00o();
        }
        o000000O o000000o2 = this.f2260OooO0O0;
        if (o000000o2 != null) {
            o000000o2.OooO00o();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        o00Oo0 o00oo0 = this.f2259OooO00o;
        if (o00oo0 != null) {
            return o00oo0.OooO0OO();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o00Oo0 o00oo0 = this.f2259OooO00o;
        if (o00oo0 != null) {
            return o00oo0.OooO0Oo();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        o0O0o00O o0o0o00o;
        o000000O o000000o2 = this.f2260OooO0O0;
        if (o000000o2 == null || (o0o0o00o = (o0O0o00O) o000000o2.f2267OooO0OO) == null) {
            return null;
        }
        return (ColorStateList) o0o0o00o.f2477OooO0OO;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        o0O0o00O o0o0o00o;
        o000000O o000000o2 = this.f2260OooO0O0;
        if (o000000o2 == null || (o0o0o00o = (o0O0o00O) o000000o2.f2267OooO0OO) == null) {
            return null;
        }
        return (PorterDuff.Mode) o0o0o00o.f2478OooO0Oo;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        if ((!(((ImageView) this.f2260OooO0O0.f2266OooO0O0).getBackground() instanceof RippleDrawable)) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o00Oo0 o00oo0 = this.f2259OooO00o;
        if (o00oo0 != null) {
            o00oo0.OooO0o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        o00Oo0 o00oo0 = this.f2259OooO00o;
        if (o00oo0 != null) {
            o00oo0.OooO0oO(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        o000000O o000000o2 = this.f2260OooO0O0;
        if (o000000o2 != null) {
            o000000o2.OooO00o();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        o000000O o000000o2 = this.f2260OooO0O0;
        if (o000000o2 != null && drawable != null && !this.f2261OooO0OO) {
            o000000o2.f2265OooO00o = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (o000000o2 != null) {
            o000000o2.OooO00o();
            if (!this.f2261OooO0OO) {
                ImageView imageView = (ImageView) o000000o2.f2266OooO0O0;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(o000000o2.f2265OooO00o);
                }
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f2261OooO0OO = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        o000000O o000000o2 = this.f2260OooO0O0;
        if (o000000o2 != null) {
            o000000o2.OooO0OO(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        o000000O o000000o2 = this.f2260OooO0O0;
        if (o000000o2 != null) {
            o000000o2.OooO00o();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        o00Oo0 o00oo0 = this.f2259OooO00o;
        if (o00oo0 != null) {
            o00oo0.OooO(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        o00Oo0 o00oo0 = this.f2259OooO00o;
        if (o00oo0 != null) {
            o00oo0.OooOO0(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        o000000O o000000o2 = this.f2260OooO0O0;
        if (o000000o2 != null) {
            o000000o2.OooO0Oo(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        o000000O o000000o2 = this.f2260OooO0O0;
        if (o000000o2 != null) {
            o000000o2.OooO0o0(mode);
        }
    }
}