package cn.mcres.kar.vv.hud;

import lk.vexview.hud.VexTextShow;

import java.util.ArrayList;
import java.util.List;

public class VexTextShowBuilder
        extends VexShowBuilder<VexTextShowBuilder, VexTextShow> {
    private String id;
    private int x, y, z;
    private final List<String> l = new ArrayList<>();
    private int time;
    private Double scale;

    public VexTextShowBuilder() {
    }

    public VexTextShowBuilder text(List<String> list) {
        this.clear();
        l.clear();
        l.addAll(list);
        return this;
    }

    public VexTextShowBuilder scale(double scale) {
        this.clear();
        this.scale = scale;
        return this;
    }

    public VexTextShowBuilder addLine(String line) {
        this.clear();
        l.add(line);
        return this;
    }

    public VexTextShowBuilder time(int t) {
        this.clear();
        time = t;
        return this;
    }

    public VexTextShowBuilder pos(int x, int y, int z) {
        this.clear();
        this.x = x;
        this.y = y;
        this.z = z;
        return this;
    }

    public VexTextShowBuilder pos(int x, int y) {
        this.clear();
        this.x = x;
        this.y = y;
        return this;
    }

    @Override
    protected VexTextShow build0() {
        if (scale == null) {
            return new VexTextShow(id, x, y, z, l, time);
        }
        return new VexTextShow(id, x, y, z, l, time, scale);
    }
}
