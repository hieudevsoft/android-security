package o0000oo0;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import o0000O00.OooO00o;
import o0000Oo0.OooOOOO;
import o0000Oo0.OooOo00;

/* loaded from: classes.dex */
public final class o0OOO0o extends Handler {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final o0OOO0o f4801OooO00o = new o0OOO0o();

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int i;
        int min;
        OooO00o.OooOoo0(logRecord, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = o0ooOOo.f4803OooO00o;
        String loggerName = logRecord.getLoggerName();
        OooO00o.OooOoOO(loggerName, "record.loggerName");
        if (logRecord.getLevel().intValue() > Level.INFO.intValue()) {
            i = 5;
        } else if (logRecord.getLevel().intValue() == Level.INFO.intValue()) {
            i = 4;
        } else {
            i = 3;
        }
        String message = logRecord.getMessage();
        OooO00o.OooOoOO(message, "record.message");
        Throwable thrown = logRecord.getThrown();
        String str = (String) o0ooOOo.f4804OooO0O0.get(loggerName);
        if (str == null) {
            str = OooOo00.o00O0oo0(loggerName, 23);
        }
        if (Log.isLoggable(str, i)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i2 = 0;
            while (i2 < length) {
                int o00O0OOo = OooOOOO.o00O0OOo(message, '\n', i2, false, 4);
                if (o00O0OOo == -1) {
                    o00O0OOo = length;
                }
                while (true) {
                    min = Math.min(o00O0OOo, i2 + 4000);
                    String substring = message.substring(i2, min);
                    OooO00o.OooOoOO(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i, str, substring);
                    if (min >= o00O0OOo) {
                        break;
                    }
                    i2 = min;
                }
                i2 = min + 1;
            }
        }
    }
}