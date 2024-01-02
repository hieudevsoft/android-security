package OooOOo0;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class OooOOO0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final SparseArray f967OooO00o = new SparseArray();

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final SparseArray f968OooO0O0 = new SparseArray();

    public OooOOO0(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            int eventType = xml.getEventType();
            OooOO0 oooOO0 = null;
            while (true) {
                char c = 1;
                if (eventType != 1) {
                    if (eventType != 0) {
                        if (eventType != 2) {
                            continue;
                        } else {
                            String name = xml.getName();
                            switch (name.hashCode()) {
                                case -1349929691:
                                    if (name.equals("ConstraintSet")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 80204913:
                                    if (name.equals("State")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1382829617:
                                    if (name.equals("StateSet")) {
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1657696882:
                                    if (name.equals("layoutDescription")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1901439077:
                                    if (name.equals("Variant")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            if (c != 2) {
                                if (c != 3) {
                                    if (c != 4) {
                                        continue;
                                    } else {
                                        OooO00o(context, xml);
                                        continue;
                                    }
                                } else {
                                    OooOO0O oooOO0O = new OooOO0O(context, xml);
                                    if (oooOO0 != null) {
                                        ((ArrayList) oooOO0.f948OooO0OO).add(oooOO0O);
                                        continue;
                                    } else {
                                        continue;
                                    }
                                }
                            } else {
                                OooOO0 oooOO02 = new OooOO0(context, xml);
                                this.f967OooO00o.put(oooOO02.f946OooO00o, oooOO02);
                                oooOO0 = oooOO02;
                                continue;
                            }
                        }
                    } else {
                        xml.getName();
                        continue;
                    }
                    eventType = xml.next();
                } else {
                    return;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x021e, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO00o(android.content.Context r12, android.content.res.XmlResourceParser r13) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OooOOo0.OooOOO0.OooO00o(android.content.Context, android.content.res.XmlResourceParser):void");
    }
}