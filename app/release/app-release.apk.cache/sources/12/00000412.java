package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class OooO0O0 {
    protected int memoizedHashCode = 0;

    public abstract int OooO00o();

    public final int OooO0O0(o0O0ooO o0o0ooo) {
        o0O0O00 o0o0o00 = (o0O0O00) this;
        int i = o0o0o00.memoizedSerializedSize;
        if (i == -1) {
            int OooO0OO2 = o0o0ooo.OooO0OO(this);
            o0o0o00.memoizedSerializedSize = OooO0OO2;
            return OooO0OO2;
        }
        return i;
    }

    public final String OooO0OO(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public final byte[] OooO0Oo() {
        try {
            int OooO00o2 = OooO00o();
            byte[] bArr = new byte[OooO00o2];
            Oooo0 oooo0 = new Oooo0(bArr, OooO00o2);
            OooO0o0(oooo0);
            if (oooo0.f3633OooO0OO - oooo0.f3634OooO0Oo == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(OooO0OO("byte array"), e);
        }
    }

    public abstract void OooO0o0(Oooo0 oooo0);
}