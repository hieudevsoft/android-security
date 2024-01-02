package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* loaded from: classes.dex */
public class o00000O extends IOException {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final /* synthetic */ int f3652OooO00o = 0;

    public static o00000O OooO00o() {
        return new o00000O("Protocol message had invalid UTF-8.");
    }

    public static o00000O0 OooO0O0() {
        return new o00000O0();
    }

    public static o00000O OooO0OO() {
        return new o00000O("CodedInputStream encountered a malformed varint.");
    }

    public static o00000O OooO0Oo() {
        return new o00000O("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static o00000O OooO0o() {
        return new o00000O("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static o00000O OooO0o0() {
        return new o00000O("Failed to parse the message.");
    }
}