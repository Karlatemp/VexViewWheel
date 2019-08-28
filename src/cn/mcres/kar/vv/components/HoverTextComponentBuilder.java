package cn.mcres.kar.vv.components;

import lk.vexview.gui.components.VexHoverText;

public interface HoverTextComponentBuilder<T extends HoverTextComponentBuilder<T>> {
    T hover(VexHoverText text);
}
