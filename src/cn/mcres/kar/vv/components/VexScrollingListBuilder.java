package cn.mcres.kar.vv.components;


import lk.vexview.gui.components.ScrollingListComponent;
import lk.vexview.gui.components.VexScrollingList;

import java.util.ArrayList;
import java.util.List;

public class VexScrollingListBuilder extends VexComponentBuilder
        <VexScrollingListBuilder, VexScrollingList> {
    private List<ScrollingListComponent> list = new ArrayList<>();
    private int x, y, w, h, fh;

    public VexScrollingListBuilder pos(int x, int y) {
        this.x = x;
        this.y = y;
        clear();
        return this;
    }

    public VexScrollingListBuilder size(int width, int height, int full_height) {
        w = width;
        h = height;
        fh = full_height;
        clear();
        return this;
    }

    public VexScrollingListBuilder add(ScrollingListComponent slc) {
        list.add(slc);
        if (build != null) build.addComponent(slc);
        return this;
    }

    public VexScrollingListBuilder add(ScrollingListComponentBuilder slc) {
        list.add(slc.build());
        return this;
    }

    @Override
    protected VexScrollingList build0() {
        VexScrollingList ref = new VexScrollingList(x, y, w, h, fh);
        list.forEach(ref::addComponent);
        return ref;
    }

}
