package cn.mcres.kar.vv.components;

import cn.mcres.kar.vv.Builder;
import lk.vexview.gui.components.ScrollingListComponent;

public interface ScrollingListComponentBuilder
        <B extends ScrollingListComponentBuilder<B, C>,
                C extends ScrollingListComponent> extends Builder<B, C> {
    C build();
}
