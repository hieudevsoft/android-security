package OooOOo0;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;
import o00000.o000;

/* loaded from: classes.dex */
public final class OooO0O0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final boolean f931OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final int f932OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f933OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public float f934OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public boolean f935OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public String f936OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public int f937OooO0oO;

    public OooO0O0(OooO0O0 oooO0O0, Object obj) {
        this.f931OooO00o = false;
        oooO0O0.getClass();
        this.f932OooO0O0 = oooO0O0.f932OooO0O0;
        OooO0O0(obj);
    }

    public static void OooO00o(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        int resourceId;
        float dimension;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), o00Ooo.f1078OooO0Oo);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int i = 0;
        boolean z = false;
        Object obj = null;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            int i3 = 1;
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i = 6;
            } else {
                int i4 = 3;
                if (index != 3) {
                    i4 = 4;
                    if (index != 2) {
                        if (index == 7) {
                            dimension = TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                        } else if (index == 4) {
                            dimension = obtainStyledAttributes.getDimension(index, 0.0f);
                        } else if (index == 5) {
                            obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                            i = 2;
                        } else {
                            if (index == 6) {
                                resourceId = obtainStyledAttributes.getInteger(index, -1);
                            } else if (index == 9) {
                                obj = obtainStyledAttributes.getString(index);
                                i = 5;
                            } else {
                                i3 = 8;
                                if (index == 8) {
                                    resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                    if (resourceId == -1) {
                                        resourceId = obtainStyledAttributes.getInt(index, -1);
                                    }
                                }
                            }
                            obj = Integer.valueOf(resourceId);
                            i = i3;
                        }
                        obj = Float.valueOf(dimension);
                        i = 7;
                    }
                }
                i3 = i4;
                resourceId = obtainStyledAttributes.getColor(index, 0);
                obj = Integer.valueOf(resourceId);
                i = i3;
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new OooO0O0(str, i, obj, z));
        }
        obtainStyledAttributes.recycle();
    }

    public final void OooO0O0(Object obj) {
        switch (OooOO0o.o0OoOo0.OooO00o(this.f932OooO0O0)) {
            case 0:
            case 7:
                this.f933OooO0OO = ((Integer) obj).intValue();
                return;
            case 1:
            case 6:
                this.f934OooO0Oo = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.f937OooO0oO = ((Integer) obj).intValue();
                return;
            case 4:
                this.f936OooO0o0 = (String) obj;
                return;
            case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                this.f935OooO0o = ((Boolean) obj).booleanValue();
                return;
            default:
                return;
        }
    }

    public OooO0O0(String str, int i, Object obj, boolean z) {
        this.f931OooO00o = false;
        this.f932OooO0O0 = i;
        this.f931OooO00o = z;
        OooO0O0(obj);
    }
}