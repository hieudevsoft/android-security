package OooOoOO;

import android.os.Build;
import android.os.Trace;

/* loaded from: classes.dex */
public abstract class o0000 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final /* synthetic */ int f1201OooO00o = 0;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception unused) {
            }
        }
    }
}