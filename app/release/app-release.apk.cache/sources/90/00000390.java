package androidx.lifecycle;

import o00000.o000;

/* loaded from: classes.dex */
public enum OooOo {
    ON_CREATE,
    ON_START,
    ON_RESUME,
    ON_PAUSE,
    ON_STOP,
    ON_DESTROY,
    ON_ANY;
    
    public static final OooOOOO Companion = new OooOOOO();

    public final Oooo000 OooO00o() {
        switch (OooOo00.f3055OooO00o[ordinal()]) {
            case 1:
            case 2:
                return Oooo000.CREATED;
            case 3:
            case 4:
                return Oooo000.STARTED;
            case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return Oooo000.RESUMED;
            case 6:
                return Oooo000.DESTROYED;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}