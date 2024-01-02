package OooOo0o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class o0ooOOo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final ThreadLocal f1199OooO00o = new ThreadLocal();

    public static ColorStateList OooO00o(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return OooO0O0(resources, xmlResourceParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012b  */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.res.ColorStateList OooO0O0(android.content.res.Resources r36, android.content.res.XmlResourceParser r37, android.util.AttributeSet r38, android.content.res.Resources.Theme r39) {
        /*
            Method dump skipped, instructions count: 940
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OooOo0o.o0ooOOo.OooO0O0(android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }
}