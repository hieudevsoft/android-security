package com.google.gson.internal.bind;

import java.io.Writer;

/* loaded from: classes.dex */
public final class OooO00o extends Writer {
    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new AssertionError();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        throw new AssertionError();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        throw new AssertionError();
    }
}