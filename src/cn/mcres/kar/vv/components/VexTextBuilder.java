package cn.mcres.kar.vv.components;

import cn.mcres.kar.vv.hud.VexTextShowBuilder;
import lk.vexview.gui.components.VexHoverText;
import lk.vexview.gui.components.VexText;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VexTextBuilder extends NOID<VexTextBuilder, VexText>
        implements ScrollingListComponentBuilder<VexTextBuilder, VexText> {
    private int x, y;
    private Double scale;

    public VexTextBuilder scale(double scale) {
        this.scale = scale;
        clear();
        return this;
    }

    public VexTextBuilder pos(int x, int y) {
        this.x = x;
        this.y = y;
        clear();
        return this;
    }

    private final List<String> list = new ArrayList<>();

    public VexTextBuilder text(List<String> list) {
        this.list.clear();
        this.list.addAll(list);
        clear();
        return this;
    }

    public VexTextBuilder addLine(String line) {
        list.add(line);
        clear();
        return this;
    }

    public VexTextBuilder text(String... list) {
        return this.text(Arrays.asList(list));
    }

    @Override
    protected VexText build0() {
        if (scale == null) {
            return new VexText(x, y, list);
        }
        return new VexText(x, y, list, scale);
    }

}
