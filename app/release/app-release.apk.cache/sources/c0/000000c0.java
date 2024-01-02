package OooOOo0;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import o00000.o000;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class o000oOoO {

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public static final int[] f1067OooO0Oo = {0, 4, 8};

    /* renamed from: OooO0o  reason: collision with root package name */
    public static final SparseIntArray f1068OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public static final SparseIntArray f1069OooO0o0;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final HashMap f1070OooO00o = new HashMap();

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final boolean f1071OooO0O0 = true;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final HashMap f1072OooO0OO = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1069OooO0o0 = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f1068OooO0o = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int[] OooO0OO(OooO00o oooO00o, String str) {
        int i;
        HashMap hashMap;
        String[] split = str.split(",");
        Context context = oooO00o.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            Object obj = null;
            try {
                i = o00Oo0.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && oooO00o.isInEditMode() && (oooO00o.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) oooO00o.getParent();
                constraintLayout.getClass();
                if ((trim instanceof String) && (hashMap = constraintLayout.OooOOO0) != null && hashMap.containsKey(trim)) {
                    obj = constraintLayout.OooOOO0.get(trim);
                }
                if (obj != null && (obj instanceof Integer)) {
                    i = ((Integer) obj).intValue();
                }
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        if (i3 != split.length) {
            return Arrays.copyOf(iArr, i3);
        }
        return iArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x044d, code lost:
        if (r10.indexOf("/") > 0) goto L184;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static OooOOo0.OooOOOO OooO0Oo(android.content.Context r16, android.util.AttributeSet r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 2476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OooOOo0.o000oOoO.OooO0Oo(android.content.Context, android.util.AttributeSet, boolean):OooOOo0.OooOOOO");
    }

    public static int OooO0o(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void OooO0oO(java.lang.Object r8, android.content.res.TypedArray r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OooOOo0.o000oOoO.OooO0oO(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void OooO0oo(OooO oooO, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                i = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : -1;
                r2 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = str.substring(r2);
                    if (substring2.length() > 0) {
                        Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = str.substring(r2, indexOf2);
                    String substring4 = str.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        oooO.f896Oooo00O = str;
    }

    public final void OooO00o(ConstraintLayout constraintLayout) {
        View findViewById;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = this.f1072OooO0OO;
        HashSet hashSet = new HashSet(hashMap.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                try {
                    childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                }
            } else if (this.f1071OooO0O0 && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else {
                if (id != -1 && hashMap.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    OooOOOO oooOOOO = (OooOOOO) hashMap.get(Integer.valueOf(id));
                    if (oooOOOO != null) {
                        if (childAt instanceof OooO00o) {
                            OooOo00 oooOo00 = oooOOOO.f972OooO0Oo;
                            oooOo00.f1041Oooooo = 1;
                            OooO00o oooO00o = (OooO00o) childAt;
                            oooO00o.setId(id);
                            oooO00o.setType(oooOo00.f1040OooooOo);
                            oooO00o.setMargin(oooOo00.f1042Oooooo0);
                            oooO00o.setAllowsGoneWidget(oooOo00.o00Oo0);
                            int[] iArr = oooOo00.f1043OoooooO;
                            if (iArr != null) {
                                oooO00o.setReferencedIds(iArr);
                            } else {
                                String str = oooOo00.f1044Ooooooo;
                                if (str != null) {
                                    int[] OooO0OO2 = OooO0OO(oooO00o, str);
                                    oooOo00.f1043OoooooO = OooO0OO2;
                                    oooO00o.setReferencedIds(OooO0OO2);
                                }
                            }
                        }
                        OooO oooO = (OooO) childAt.getLayoutParams();
                        oooO.OooO00o();
                        oooOOOO.OooO00o(oooO);
                        HashMap hashMap2 = oooOOOO.f973OooO0o;
                        Class<?> cls = childAt.getClass();
                        for (String str2 : hashMap2.keySet()) {
                            OooO0O0 oooO0O0 = (OooO0O0) hashMap2.get(str2);
                            if (!oooO0O0.f931OooO00o) {
                                str2 = "set" + str2;
                            }
                            try {
                                switch (OooOO0o.o0OoOo0.OooO00o(oooO0O0.f932OooO0O0)) {
                                    case 0:
                                        Class<?>[] clsArr = new Class[1];
                                        try {
                                            clsArr[0] = Integer.TYPE;
                                            cls.getMethod(str2, clsArr).invoke(childAt, Integer.valueOf(oooO0O0.f933OooO0OO));
                                        } catch (IllegalAccessException e) {
                                            e = e;
                                            e.printStackTrace();
                                        } catch (NoSuchMethodException e2) {
                                            e = e2;
                                            e.getMessage();
                                        } catch (InvocationTargetException e3) {
                                            e = e3;
                                            e.printStackTrace();
                                        }
                                    case 1:
                                        cls.getMethod(str2, Float.TYPE).invoke(childAt, Float.valueOf(oooO0O0.f934OooO0Oo));
                                        break;
                                    case 2:
                                        cls.getMethod(str2, Integer.TYPE).invoke(childAt, Integer.valueOf(oooO0O0.f937OooO0oO));
                                        break;
                                    case 3:
                                        Method method = cls.getMethod(str2, Drawable.class);
                                        ColorDrawable colorDrawable = new ColorDrawable();
                                        colorDrawable.setColor(oooO0O0.f937OooO0oO);
                                        method.invoke(childAt, colorDrawable);
                                        break;
                                    case 4:
                                        cls.getMethod(str2, CharSequence.class).invoke(childAt, oooO0O0.f936OooO0o0);
                                        break;
                                    case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                                        cls.getMethod(str2, Boolean.TYPE).invoke(childAt, Boolean.valueOf(oooO0O0.f935OooO0o));
                                        break;
                                    case 6:
                                        cls.getMethod(str2, Float.TYPE).invoke(childAt, Float.valueOf(oooO0O0.f934OooO0Oo));
                                        break;
                                    case 7:
                                        cls.getMethod(str2, Integer.TYPE).invoke(childAt, Integer.valueOf(oooO0O0.f933OooO0OO));
                                        break;
                                }
                            } catch (IllegalAccessException e4) {
                                e = e4;
                                e.printStackTrace();
                            } catch (NoSuchMethodException e5) {
                                e = e5;
                            } catch (InvocationTargetException e6) {
                                e = e6;
                                e.printStackTrace();
                            }
                        }
                        childAt.setLayoutParams(oooO);
                        Oooo000 oooo000 = oooOOOO.f970OooO0O0;
                        if (oooo000.f1064OooO0O0 == 0) {
                            childAt.setVisibility(oooo000.f1063OooO00o);
                        }
                        childAt.setAlpha(oooo000.f1065OooO0OO);
                        Oooo0 oooo0 = oooOOOO.f974OooO0o0;
                        childAt.setRotation(oooo0.f1052OooO00o);
                        childAt.setRotationX(oooo0.f1053OooO0O0);
                        childAt.setRotationY(oooo0.f1054OooO0OO);
                        childAt.setScaleX(oooo0.f1055OooO0Oo);
                        childAt.setScaleY(oooo0.f1057OooO0o0);
                        if (oooo0.f1059OooO0oo != -1) {
                            if (((View) childAt.getParent()).findViewById(oooo0.f1059OooO0oo) != null) {
                                float bottom = (findViewById.getBottom() + findViewById.getTop()) / 2.0f;
                                float right = (findViewById.getRight() + findViewById.getLeft()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(right - childAt.getLeft());
                                    childAt.setPivotY(bottom - childAt.getTop());
                                }
                            }
                        } else {
                            if (!Float.isNaN(oooo0.f1056OooO0o)) {
                                childAt.setPivotX(oooo0.f1056OooO0o);
                            }
                            if (!Float.isNaN(oooo0.f1058OooO0oO)) {
                                childAt.setPivotY(oooo0.f1058OooO0oO);
                            }
                        }
                        childAt.setTranslationX(oooo0.f1051OooO);
                        childAt.setTranslationY(oooo0.f1060OooOO0);
                        childAt.setTranslationZ(oooo0.f1061OooOO0O);
                        if (oooo0.f1062OooOO0o) {
                            childAt.setElevation(oooo0.OooOOO0);
                        }
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            OooOOOO oooOOOO2 = (OooOOOO) hashMap.get(num);
            if (oooOOOO2 != null) {
                OooOo00 oooOo002 = oooOOOO2.f972OooO0Oo;
                if (oooOo002.f1041Oooooo == 1) {
                    OooO00o oooO00o2 = new OooO00o(constraintLayout.getContext());
                    oooO00o2.setId(num.intValue());
                    int[] iArr2 = oooOo002.f1043OoooooO;
                    if (iArr2 != null) {
                        oooO00o2.setReferencedIds(iArr2);
                    } else {
                        String str3 = oooOo002.f1044Ooooooo;
                        if (str3 != null) {
                            int[] OooO0OO3 = OooO0OO(oooO00o2, str3);
                            oooOo002.f1043OoooooO = OooO0OO3;
                            oooO00o2.setReferencedIds(OooO0OO3);
                        }
                    }
                    oooO00o2.setType(oooOo002.f1040OooooOo);
                    oooO00o2.setMargin(oooOo002.f1042Oooooo0);
                    oo000o oo000oVar = ConstraintLayout.f2584OooOOOo;
                    OooO oooO2 = new OooO();
                    oooO00o2.OooO();
                    oooOOOO2.OooO00o(oooO2);
                    constraintLayout.addView(oooO00o2, oooO2);
                }
                if (oooOo002.f987OooO00o) {
                    View o00o0o = new o00O0O(constraintLayout.getContext());
                    o00o0o.setId(num.intValue());
                    oo000o oo000oVar2 = ConstraintLayout.f2584OooOOOo;
                    OooO oooO3 = new OooO();
                    oooOOOO2.OooO00o(oooO3);
                    constraintLayout.addView(o00o0o, oooO3);
                }
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = constraintLayout.getChildAt(i2);
            if (childAt2 instanceof OooO0OO) {
                ((OooO0OO) childAt2).OooO0o0(constraintLayout);
            }
        }
    }

    public final void OooO0O0(ConstraintLayout constraintLayout) {
        int i;
        int i2;
        OooO0O0 oooO0O0;
        o000oOoO o000oooo = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = o000oooo.f1072OooO0OO;
        hashMap.clear();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout.getChildAt(i3);
            OooO oooO = (OooO) childAt.getLayoutParams();
            int id = childAt.getId();
            if (o000oooo.f1071OooO0O0 && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new OooOOOO());
            }
            OooOOOO oooOOOO = (OooOOOO) hashMap.get(Integer.valueOf(id));
            if (oooOOOO == null) {
                i = childCount;
            } else {
                HashMap hashMap2 = o000oooo.f1070OooO00o;
                HashMap hashMap3 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap2.keySet()) {
                    OooO0O0 oooO0O02 = (OooO0O0) hashMap2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            oooO0O0 = new OooO0O0(oooO0O02, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor()));
                            i2 = childCount;
                        } else {
                            i2 = childCount;
                            try {
                                oooO0O0 = new OooO0O0(oooO0O02, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0]));
                            } catch (IllegalAccessException e) {
                                e = e;
                                e.printStackTrace();
                                childCount = i2;
                            } catch (NoSuchMethodException e2) {
                                e = e2;
                                e.printStackTrace();
                                childCount = i2;
                            } catch (InvocationTargetException e3) {
                                e = e3;
                                e.printStackTrace();
                                childCount = i2;
                            }
                        }
                        hashMap3.put(str, oooO0O0);
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e4) {
                        e = e4;
                        i2 = childCount;
                    }
                    childCount = i2;
                }
                i = childCount;
                oooOOOO.f973OooO0o = hashMap3;
                oooOOOO.f969OooO00o = id;
                int i4 = oooO.f869OooO0o0;
                OooOo00 oooOo00 = oooOOOO.f972OooO0Oo;
                oooOo00.f994OooO0oo = i4;
                oooOo00.f986OooO = oooO.f868OooO0o;
                oooOo00.f995OooOO0 = oooO.f870OooO0oO;
                oooOo00.f996OooOO0O = oooO.f871OooO0oo;
                oooOo00.f997OooOO0o = oooO.f863OooO;
                oooOo00.OooOOO0 = oooO.f872OooOO0;
                oooOo00.f998OooOOO = oooO.f873OooOO0O;
                oooOo00.f999OooOOOO = oooO.f874OooOO0o;
                oooOo00.f1000OooOOOo = oooO.OooOOO0;
                oooOo00.f1002OooOOo0 = oooO.f875OooOOO;
                oooOo00.f1001OooOOo = oooO.f876OooOOOO;
                oooOo00.f1003OooOOoo = oooO.f880OooOOoo;
                oooOo00.f1006OooOo00 = oooO.f883OooOo00;
                oooOo00.f1005OooOo0 = oooO.f882OooOo0;
                oooOo00.f1007OooOo0O = oooO.f884OooOo0O;
                oooOo00.f1008OooOo0o = oooO.f892OooOooo;
                oooOo00.f1004OooOo = oooO.f895Oooo000;
                oooOo00.f1010OooOoO0 = oooO.f896Oooo00O;
                oooOo00.f1009OooOoO = oooO.f877OooOOOo;
                oooOo00.f1011OooOoOO = oooO.f879OooOOo0;
                oooOo00.f1013OooOoo0 = oooO.f878OooOOo;
                oooOo00.f1012OooOoo = oooO.f904OoooO;
                oooOo00.f1014OooOooO = oooO.f908OoooOO0;
                oooOo00.f1015OooOooo = oooO.f922o000oOoO;
                oooOo00.f991OooO0o = oooO.f866OooO0OO;
                oooOo00.f990OooO0Oo = oooO.f864OooO00o;
                oooOo00.f992OooO0o0 = oooO.f865OooO0O0;
                oooOo00.f988OooO0O0 = ((ViewGroup.MarginLayoutParams) oooO).width;
                oooOo00.f989OooO0OO = ((ViewGroup.MarginLayoutParams) oooO).height;
                oooOo00.f1018Oooo000 = ((ViewGroup.MarginLayoutParams) oooO).leftMargin;
                oooOo00.f1019Oooo00O = ((ViewGroup.MarginLayoutParams) oooO).rightMargin;
                oooOo00.f1020Oooo00o = ((ViewGroup.MarginLayoutParams) oooO).topMargin;
                oooOo00.f1017Oooo0 = ((ViewGroup.MarginLayoutParams) oooO).bottomMargin;
                oooOo00.f1024Oooo0o0 = oooO.f891OooOooO;
                oooOo00.f1027OoooO = oooO.f894Oooo0;
                oooOo00.f1031OoooOO0 = oooO.f897Oooo00o;
                oooOo00.f1032OoooOOO = oooO.f899Oooo0OO;
                oooOo00.f1045o000oOoO = oooO.f898Oooo0O0;
                oooOo00.f1049ooOO = oooO.f909OoooOOO;
                oooOo00.f1046o00O0O = oooO.f910OoooOOo;
                oooOo00.f1033OoooOOo = oooO.f901Oooo0o0;
                oooOo00.f1034OoooOo0 = oooO.f900Oooo0o;
                oooOo00.OoooOoO = oooO.f893Oooo;
                oooOo00.f1035OoooOoo = oooO.f906OoooO00;
                oooOo00.f1036Ooooo00 = oooO.f902Oooo0oO;
                oooOo00.f1037Ooooo0o = oooO.f903Oooo0oo;
                oooOo00.f1038OooooO0 = oooO.f905OoooO0;
                oooOo00.f1039OooooOO = oooO.f907OoooO0O;
                oooOo00.f1048o0OoOo0 = oooO.f911OoooOo0;
                oooOo00.f1025Oooo0oO = oooO.f881OooOo;
                oooOo00.f1016Oooo = oooO.f886OooOoO;
                oooOo00.f1023Oooo0o = oooO.f885OooOo0o;
                oooOo00.f1026Oooo0oo = oooO.f887OooOoO0;
                oooOo00.f1028OoooO0 = oooO.f888OooOoOO;
                oooOo00.f1029OoooO00 = oooO.f890OooOoo0;
                oooOo00.f1030OoooO0O = oooO.f889OooOoo;
                oooOo00.f1047o00Ooo = oooO.OoooOoO;
                oooOo00.f1021Oooo0O0 = oooO.getMarginEnd();
                oooOo00.f1022Oooo0OO = oooO.getMarginStart();
                int visibility = childAt.getVisibility();
                Oooo000 oooo000 = oooOOOO.f970OooO0O0;
                oooo000.f1063OooO00o = visibility;
                oooo000.f1065OooO0OO = childAt.getAlpha();
                float rotation = childAt.getRotation();
                Oooo0 oooo0 = oooOOOO.f974OooO0o0;
                oooo0.f1052OooO00o = rotation;
                oooo0.f1053OooO0O0 = childAt.getRotationX();
                oooo0.f1054OooO0OO = childAt.getRotationY();
                oooo0.f1055OooO0Oo = childAt.getScaleX();
                oooo0.f1057OooO0o0 = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    oooo0.f1056OooO0o = pivotX;
                    oooo0.f1058OooO0oO = pivotY;
                }
                oooo0.f1051OooO = childAt.getTranslationX();
                oooo0.f1060OooOO0 = childAt.getTranslationY();
                oooo0.f1061OooOO0O = childAt.getTranslationZ();
                if (oooo0.f1062OooOO0o) {
                    oooo0.OooOOO0 = childAt.getElevation();
                }
                if (childAt instanceof OooO00o) {
                    OooO00o oooO00o = (OooO00o) childAt;
                    oooOo00.o00Oo0 = oooO00o.getAllowsGoneWidget();
                    oooOo00.f1043OoooooO = oooO00o.getReferencedIds();
                    oooOo00.f1040OooooOo = oooO00o.getType();
                    oooOo00.f1042Oooooo0 = oooO00o.getMargin();
                }
            }
            i3++;
            o000oooo = this;
            childCount = i;
        }
    }

    public final void OooO0o0(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    OooOOOO OooO0Oo2 = OooO0Oo(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        OooO0Oo2.f972OooO0Oo.f987OooO00o = true;
                    }
                    this.f1072OooO0OO.put(Integer.valueOf(OooO0Oo2.f969OooO00o), OooO0Oo2);
                    continue;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }
}