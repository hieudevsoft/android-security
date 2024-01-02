package o0000Oo0;

import java.io.Serializable;
import java.util.regex.Pattern;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class OooO implements Serializable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Pattern f4384OooO00o;

    public OooO() {
        Pattern compile = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        OooO00o.OooOoOO(compile, "compile(pattern)");
        this.f4384OooO00o = compile;
    }

    public final String toString() {
        String pattern = this.f4384OooO00o.toString();
        OooO00o.OooOoOO(pattern, "nativePattern.toString()");
        return pattern;
    }
}