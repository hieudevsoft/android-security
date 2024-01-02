package OooO0o;

import OooO0oO.o00O00o0;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import androidx.appcompat.widget.o00O0OO0;
import androidx.appcompat.widget.o0oO0O0o;
import java.io.IOException;
import java.lang.reflect.Constructor;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class OooOo extends MenuInflater {

    /* renamed from: OooO0o  reason: collision with root package name */
    public static final Class[] f276OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public static final Class[] f277OooO0o0;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Object[] f278OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final Object[] f279OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final Context f280OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public Object f281OooO0Oo;

    static {
        Class[] clsArr = {Context.class};
        f277OooO0o0 = clsArr;
        f276OooO0o = clsArr;
    }

    public OooOo(Context context) {
        super(context);
        this.f280OooO0OO = context;
        Object[] objArr = {context};
        this.f278OooO00o = objArr;
        this.f279OooO0O0 = objArr;
    }

    public static Object OooO00o(Context context) {
        return (!(context instanceof Activity) && (context instanceof ContextWrapper)) ? OooO00o(((ContextWrapper) context).getBaseContext()) : context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0O0(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        int i;
        char charAt;
        char charAt2;
        int i2;
        boolean z;
        o00O00o0 o00o00o0;
        ColorStateList colorStateList;
        Object obj;
        OooOo00 oooOo00 = new OooOo00(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            i = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlResourceParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        while (!z2) {
            if (eventType != 1) {
                Menu menu2 = oooOo00.f283OooO00o;
                if (eventType != i) {
                    if (eventType == 3) {
                        String name2 = xmlResourceParser.getName();
                        if (z3 && name2.equals(str)) {
                            z3 = false;
                            str = null;
                        } else if (name2.equals("group")) {
                            oooOo00.f284OooO0O0 = 0;
                            oooOo00.f285OooO0OO = 0;
                            oooOo00.f286OooO0Oo = 0;
                            oooOo00.f288OooO0o0 = 0;
                            oooOo00.f287OooO0o = true;
                            oooOo00.f289OooO0oO = true;
                        } else if (name2.equals("item")) {
                            if (!oooOo00.f290OooO0oo) {
                                o00O00o0 o00o00o02 = oooOo00.f305OooOoO;
                                if (o00o00o02 != null && o00o00o02.f440OooO00o.hasSubMenu()) {
                                    oooOo00.f290OooO0oo = true;
                                    oooOo00.OooO00o(menu2.addSubMenu(oooOo00.f284OooO0O0, oooOo00.f282OooO, oooOo00.f291OooOO0, oooOo00.f292OooOO0O).getItem());
                                } else {
                                    oooOo00.f290OooO0oo = true;
                                    oooOo00.OooO00o(menu2.add(oooOo00.f284OooO0O0, oooOo00.f282OooO, oooOo00.f291OooOO0, oooOo00.f292OooOO0O));
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z2 = true;
                        }
                    }
                } else if (!z3) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    OooOo oooOo = oooOo00.f311OooOooo;
                    if (equals) {
                        TypedArray obtainStyledAttributes = oooOo.f280OooO0OO.obtainStyledAttributes(attributeSet, OooO0OO.OooO00o.f31OooOOOo);
                        oooOo00.f284OooO0O0 = obtainStyledAttributes.getResourceId(1, 0);
                        oooOo00.f285OooO0OO = obtainStyledAttributes.getInt(3, 0);
                        oooOo00.f286OooO0Oo = obtainStyledAttributes.getInt(4, 0);
                        oooOo00.f288OooO0o0 = obtainStyledAttributes.getInt(5, 0);
                        oooOo00.f287OooO0o = obtainStyledAttributes.getBoolean(2, true);
                        oooOo00.f289OooO0oO = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else if (name3.equals("item")) {
                        Context context = oooOo.f280OooO0OO;
                        o0oO0O0o o0oo0o0o = new o0oO0O0o(context, context.obtainStyledAttributes(attributeSet, OooO0OO.OooO00o.f33OooOOo0));
                        oooOo00.f282OooO = o0oo0o0o.OooO(2, 0);
                        oooOo00.f291OooOO0 = (o0oo0o0o.OooO0oo(5, oooOo00.f285OooO0OO) & (-65536)) | (o0oo0o0o.OooO0oo(6, oooOo00.f286OooO0Oo) & 65535);
                        oooOo00.f292OooOO0O = o0oo0o0o.OooOO0O(7);
                        oooOo00.f293OooOO0o = o0oo0o0o.OooOO0O(8);
                        oooOo00.OooOOO0 = o0oo0o0o.OooO(0, 0);
                        String OooOO02 = o0oo0o0o.OooOO0(9);
                        if (OooOO02 == null) {
                            charAt = 0;
                        } else {
                            charAt = OooOO02.charAt(0);
                        }
                        oooOo00.f294OooOOO = charAt;
                        oooOo00.f295OooOOOO = o0oo0o0o.OooO0oo(16, 4096);
                        String OooOO03 = o0oo0o0o.OooOO0(10);
                        if (OooOO03 == null) {
                            charAt2 = 0;
                        } else {
                            charAt2 = OooOO03.charAt(0);
                        }
                        oooOo00.f296OooOOOo = charAt2;
                        oooOo00.f298OooOOo0 = o0oo0o0o.OooO0oo(20, 4096);
                        if (o0oo0o0o.OooOO0o(11)) {
                            i2 = o0oo0o0o.OooO00o(11, false);
                        } else {
                            i2 = oooOo00.f288OooO0o0;
                        }
                        oooOo00.f297OooOOo = i2;
                        oooOo00.f299OooOOoo = o0oo0o0o.OooO00o(3, false);
                        oooOo00.f302OooOo00 = o0oo0o0o.OooO00o(4, oooOo00.f287OooO0o);
                        oooOo00.f301OooOo0 = o0oo0o0o.OooO00o(1, oooOo00.f289OooO0oO);
                        oooOo00.f303OooOo0O = o0oo0o0o.OooO0oo(21, -1);
                        oooOo00.f306OooOoO0 = o0oo0o0o.OooOO0(12);
                        oooOo00.f304OooOo0o = o0oo0o0o.OooO(13, 0);
                        oooOo00.f300OooOo = o0oo0o0o.OooOO0(15);
                        String OooOO04 = o0oo0o0o.OooOO0(14);
                        if (OooOO04 != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z && oooOo00.f304OooOo0o == 0 && oooOo00.f300OooOo == null) {
                            Class<?>[] clsArr = f276OooO0o;
                            Object[] objArr = oooOo.f279OooO0O0;
                            try {
                                Constructor<?> constructor = Class.forName(OooOO04, false, oooOo.f280OooO0OO.getClassLoader()).getConstructor(clsArr);
                                constructor.setAccessible(true);
                                obj = constructor.newInstance(objArr);
                            } catch (Exception unused) {
                                obj = null;
                            }
                            o00o00o0 = (o00O00o0) obj;
                        } else {
                            o00o00o0 = null;
                        }
                        oooOo00.f305OooOoO = o00o00o0;
                        oooOo00.f307OooOoOO = o0oo0o0o.OooOO0O(17);
                        oooOo00.f309OooOoo0 = o0oo0o0o.OooOO0O(22);
                        if (o0oo0o0o.OooOO0o(19)) {
                            oooOo00.f310OooOooO = o00O0OO0.OooO0O0(o0oo0o0o.OooO0oo(19, -1), oooOo00.f310OooOooO);
                            colorStateList = null;
                        } else {
                            colorStateList = null;
                            oooOo00.f310OooOooO = null;
                        }
                        if (o0oo0o0o.OooOO0o(18)) {
                            oooOo00.f308OooOoo = o0oo0o0o.OooO0O0(18);
                        } else {
                            oooOo00.f308OooOoo = colorStateList;
                        }
                        o0oo0o0o.OooOOOO();
                        oooOo00.f290OooO0oo = false;
                    } else if (name3.equals("menu")) {
                        oooOo00.f290OooO0oo = true;
                        SubMenu addSubMenu = menu2.addSubMenu(oooOo00.f284OooO0O0, oooOo00.f282OooO, oooOo00.f291OooOO0, oooOo00.f292OooOO0O);
                        oooOo00.OooO00o(addSubMenu.getItem());
                        OooO0O0(xmlResourceParser, attributeSet, addSubMenu);
                    } else {
                        str = name3;
                        z3 = true;
                    }
                }
                eventType = xmlResourceParser.next();
                i = 2;
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof OooOoO.Oooo0)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f280OooO0OO.getResources().getLayout(i);
                    OooO0O0(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (IOException e) {
                    throw new InflateException("Error inflating menu XML", e);
                }
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}