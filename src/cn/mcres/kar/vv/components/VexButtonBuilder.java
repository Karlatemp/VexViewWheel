package cn.mcres.kar.vv.components;

import lk.vexview.gui.components.ButtonFunction;
import lk.vexview.gui.components.VexButton;

public class VexButtonBuilder extends VexComponentBuilder
        <VexButtonBuilder, VexButton> implements ScrollingListComponentBuilder
        <VexButtonBuilder, VexButton> {
    protected Object id;
    protected String u1, u2;

    @Override
    protected VexButton build0() {
        if (bf == null) {
            return new VexButton(id, txt, u1, u2, x, y, w, h);
        }
        return new VexButton(id, txt, u1, u2, x, y, w, h, bf);
    }

    public VexButtonBuilder id(String id) {
        this.id = id;
        clear();
        return this;
    }

    public VexButtonBuilder id(Object id) {
        this.id = id;
        clear();
        return this;
    }

    public VexButtonBuilder background(String bg) {
        u1 = bg;
        clear();
        return this;
    }

    protected String txt;

    public VexButtonBuilder text(String text) {
        txt = text;
        clear();
        return this;
    }

    protected int x, y, w, h;

    public VexButtonBuilder pos(int x, int y) {
        this.x = x;
        this.y = y;
        clear();
        return this;
    }

    public VexButtonBuilder size(int width, int height) {
        w = width;
        h = height;
        clear();
        return this;
    }

    protected ButtonFunction bf;

    public VexButtonBuilder callback(ButtonFunction bf) {
        this.bf = bf;
        clear();
        return this;
    }
}
