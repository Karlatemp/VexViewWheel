package cn.mcres.kar.vv.gui;

import cn.mcres.kar.vv.Builder;
import cn.mcres.kar.vv.components.VexComponentBuilder;
import lk.vexview.gui.VexGui;
import lk.vexview.gui.components.VexComponents;

import java.util.ArrayList;
import java.util.List;

public class VexGuiBuilder implements Builder<VexGuiBuilder, VexGui> {
    protected VexGui b;
    protected int x, y, w, h, xs, ys;
    protected String url;
    protected List<VexComponents> vcs = new ArrayList<>();

    public VexGuiBuilder background(String url) {
        this.url = url;
        return this;
    }

    public VexGuiBuilder background_pos(int x, int y) {
        this.x = x;
        this.y = y;
        return this;
    }

    public VexGuiBuilder background_size(int wid, int hei) {
        w = wid;
        h = hei;
        return this;
    }

    public VexGuiBuilder scaled_size(int wid, int hei) {
        xs = wid;
        ys = hei;
        return this;
    }

    public VexGuiBuilder append(VexComponents vc) {
        vcs.add(vc);
        if (b != null) b.addComponent(vc);
        return this;
    }

    public VexGuiBuilder append(List<VexComponents> vc) {
        vcs.addAll(vc);
        if (b != null) b.addAllComponents(vc);
        return this;
    }

    public VexGuiBuilder append(VexComponentBuilder vc) {
        return append(vc.build());
    }

    protected VexGui build0() {
        return new VexGui(url, x, y, w, h, xs, ys, vcs);
    }

    @Override
    public VexGui build() {
        if (b == null) b = build0();
        return b;
    }

}
