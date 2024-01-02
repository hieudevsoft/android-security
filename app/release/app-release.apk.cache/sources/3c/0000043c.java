package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* loaded from: classes.dex */
public final class o000oOoO extends IOException {
    public o000oOoO(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    public o000oOoO(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, indexOutOfBoundsException);
    }
}