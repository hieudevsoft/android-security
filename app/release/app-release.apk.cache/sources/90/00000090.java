package OooOO0o;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class Oooo0 implements Comparator {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f598OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ Object f599OooO0O0;

    public /* synthetic */ Oooo0(int i, Object obj) {
        this.f598OooO00o = i;
        this.f599OooO0O0 = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f598OooO00o) {
            case 0:
                return ((o00O0O) obj).f609OooO0O0 - ((o00O0O) obj2).f609OooO0O0;
            default:
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
                if (compareTo == 0) {
                    int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                    if (compareTo2 == 0) {
                        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f599OooO0O0;
                        return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton2)));
                    }
                    return compareTo2;
                }
                return compareTo;
        }
    }
}