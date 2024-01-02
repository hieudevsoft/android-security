package OooOo;

import OooO0Oo.o0000OO0;
import OooOo0o.o0O0O00;
import OooOo0o.oo0o0Oo;
import OooOoo0.o0000;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class OooOo extends o0000OO0 {
    public OooOo() {
        super(9);
    }

    public static int OooOoo(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public static Font OooOoo0(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int OooOoo2 = OooOoo(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int OooOoo3 = OooOoo(fontStyle, font2.getStyle());
            if (OooOoo3 < OooOoo2) {
                font = font2;
                OooOoo2 = OooOoo3;
            }
        }
        return font;
    }

    @Override // OooO0Oo.o0000OO0
    public final Typeface OooOOo(Context context, oo0o0Oo oo0o0oo, Resources resources, int i) {
        o0O0O00[] o0o0o00Arr;
        int i2;
        try {
            FontFamily.Builder builder = null;
            for (o0O0O00 o0o0o00 : oo0o0oo.f1200OooO00o) {
                try {
                    Font.Builder weight = new Font.Builder(resources, o0o0o00.f1194OooO0o).setWeight(o0o0o00.f1191OooO0O0);
                    if (o0o0o00.f1192OooO0OO) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    Font build = weight.setSlant(i2).setTtcIndex(o0o0o00.f1195OooO0o0).setFontVariationSettings(o0o0o00.f1193OooO0Oo).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(OooOoo0(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // OooO0Oo.o0000OO0
    public final Typeface OooOOoo(Context context, o0000[] o0000VarArr, int i) {
        ParcelFileDescriptor openFileDescriptor;
        int i2;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (o0000 o0000Var : o0000VarArr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(o0000Var.f1238OooO00o, "r", null);
                } catch (IOException unused) {
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor == null) {
                    }
                } else {
                    try {
                        Font.Builder weight = new Font.Builder(openFileDescriptor).setWeight(o0000Var.f1240OooO0OO);
                        if (o0000Var.f1241OooO0Oo) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        Font build = weight.setSlant(i2).setTtcIndex(o0000Var.f1239OooO0O0).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                        break;
                    }
                }
                openFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(OooOoo0(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // OooO0Oo.o0000OO0
    public final Typeface OooOo0(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // OooO0Oo.o0000OO0
    public final Typeface OooOo00(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // OooO0Oo.o0000OO0
    public final o0000 OooOo0o(int i, o0000[] o0000VarArr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}