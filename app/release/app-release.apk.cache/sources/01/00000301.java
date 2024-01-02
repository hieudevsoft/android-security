package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import hieubui.eup.android_app_security.R;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class o0OOO0o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f2518OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final Object f2519OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final Serializable f2520OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final Object f2521OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final Object f2522OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final Object f2523OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public Object f2524OooO0oO;

    /* JADX WARN: Type inference failed for: r1v1, types: [int[], java.io.Serializable] */
    public o0OOO0o() {
        this.f2518OooO00o = 0;
        this.f2519OooO0O0 = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
        this.f2520OooO0OO = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.f2521OooO0Oo = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
        this.f2523OooO0o0 = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
        this.f2522OooO0o = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.f2524OooO0oO = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }

    public static boolean OooO00o(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList OooO0O0(Context context, int i) {
        int OooO0OO2 = oo0OOoo.OooO0OO(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{oo0OOoo.f2568OooO0O0, oo0OOoo.f2570OooO0Oo, oo0OOoo.f2569OooO0OO, oo0OOoo.f2571OooO0o}, new int[]{oo0OOoo.OooO0O0(context, R.attr.colorButtonNormal), OooOo.OooO00o.OooO0O0(OooO0OO2, i), OooOo.OooO00o.OooO0O0(OooO0OO2, i), i});
    }

    public static void OooO0Oo(Drawable drawable, int i, PorterDuff.Mode mode) {
        int[] iArr = o00O0OO0.f2334OooO00o;
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = o0Oo0oo.f2532OooO0O0;
        }
        mutate.setColorFilter(o0Oo0oo.OooO0OO(i, mode));
    }

    public final ColorStateList OooO0OO(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return OooOo0.Oooo000.OooO00o(context, R.color.abc_tint_edittext);
        }
        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            return OooOo0.Oooo000.OooO00o(context, R.color.abc_tint_switch_track);
        }
        if (i == R.drawable.abc_switch_thumb_material) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            ColorStateList OooO0Oo2 = oo0OOoo.OooO0Oo(context, R.attr.colorSwitchThumbNormal);
            if (OooO0Oo2 != null && OooO0Oo2.isStateful()) {
                int[] iArr3 = oo0OOoo.f2568OooO0O0;
                iArr[0] = iArr3;
                iArr2[0] = OooO0Oo2.getColorForState(iArr3, 0);
                iArr[1] = oo0OOoo.f2572OooO0o0;
                iArr2[1] = oo0OOoo.OooO0OO(context, R.attr.colorControlActivated);
                iArr[2] = oo0OOoo.f2571OooO0o;
                iArr2[2] = OooO0Oo2.getDefaultColor();
            } else {
                iArr[0] = oo0OOoo.f2568OooO0O0;
                iArr2[0] = oo0OOoo.OooO0O0(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = oo0OOoo.f2572OooO0o0;
                iArr2[1] = oo0OOoo.OooO0OO(context, R.attr.colorControlActivated);
                iArr[2] = oo0OOoo.f2571OooO0o;
                iArr2[2] = oo0OOoo.OooO0OO(context, R.attr.colorSwitchThumbNormal);
            }
            return new ColorStateList(iArr, iArr2);
        } else if (i == R.drawable.abc_btn_default_mtrl_shape) {
            return OooO0O0(context, oo0OOoo.OooO0OO(context, R.attr.colorButtonNormal));
        } else {
            if (i == R.drawable.abc_btn_borderless_material) {
                return OooO0O0(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return OooO0O0(context, oo0OOoo.OooO0OO(context, R.attr.colorAccent));
            }
            if (i != R.drawable.abc_spinner_mtrl_am_alpha && i != R.drawable.abc_spinner_textfield_background_material) {
                if (OooO00o((int[]) this.f2520OooO0OO, i)) {
                    return oo0OOoo.OooO0Oo(context, R.attr.colorControlNormal);
                }
                if (OooO00o((int[]) this.f2522OooO0o, i)) {
                    return OooOo0.Oooo000.OooO00o(context, R.color.abc_tint_default);
                }
                if (OooO00o((int[]) this.f2524OooO0oO, i)) {
                    return OooOo0.Oooo000.OooO00o(context, R.color.abc_tint_btn_checkable);
                }
                if (i == R.drawable.abc_seekbar_thumb_material) {
                    return OooOo0.Oooo000.OooO00o(context, R.color.abc_tint_seek_thumb);
                }
                return null;
            }
            return OooOo0.Oooo000.OooO00o(context, R.color.abc_tint_spinner);
        }
    }

    public final String toString() {
        switch (this.f2518OooO00o) {
            case 1:
                StringBuilder sb = new StringBuilder("Request{method=");
                sb.append((String) this.f2520OooO0OO);
                sb.append(", url=");
                sb.append((o0000Oo.o0ooOOo) this.f2519OooO0O0);
                o0000Oo.oo000o oo000oVar = (o0000Oo.oo000o) this.f2521OooO0Oo;
                if (oo000oVar.f4353OooO00o.length / 2 != 0) {
                    sb.append(", headers=[");
                    Iterator it = oo000oVar.iterator();
                    int i = 0;
                    while (true) {
                        o0000.OooO0OO oooO0OO = (o0000.OooO0OO) it;
                        if (oooO0OO.hasNext()) {
                            Object next = oooO0OO.next();
                            int i2 = i + 1;
                            if (i >= 0) {
                                o00000oo.o00O0O o00o0o = (o00000oo.o00O0O) next;
                                String str = (String) o00o0o.f4100OooO00o;
                                String str2 = (String) o00o0o.f4101OooO0O0;
                                if (i > 0) {
                                    sb.append(", ");
                                }
                                sb.append(str);
                                sb.append(':');
                                sb.append(str2);
                                i = i2;
                            } else {
                                throw new ArithmeticException("Index overflow has happened.");
                            }
                        } else {
                            sb.append(']');
                        }
                    }
                }
                Map map = (Map) this.f2522OooO0o;
                if (!map.isEmpty()) {
                    sb.append(", tags=");
                    sb.append(map);
                }
                sb.append('}');
                String sb2 = sb.toString();
                o0000O00.OooO00o.OooOoOO(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    public o0OOO0o(o0000Oo.o0ooOOo o0ooooo, String str, o0000Oo.oo000o oo000oVar, o0000Oo.o000000 o000000Var, Map map) {
        this.f2518OooO00o = 1;
        o0000O00.OooO00o.OooOoo0(str, "method");
        this.f2519OooO0O0 = o0ooooo;
        this.f2520OooO0OO = str;
        this.f2521OooO0Oo = oo000oVar;
        this.f2523OooO0o0 = o000000Var;
        this.f2522OooO0o = map;
    }
}