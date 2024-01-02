package com.google.gson;

import java.io.IOException;
import java.io.StringWriter;

/* loaded from: classes.dex */
public abstract class OooOo {
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            o0000Ooo.OooOOO oooOOO = new o0000Ooo.OooOOO(stringWriter);
            oooOOO.f4418OooO0o0 = true;
            com.google.gson.internal.bind.OooO.f3870OooOoO.OooO0OO(oooOOO, this);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}