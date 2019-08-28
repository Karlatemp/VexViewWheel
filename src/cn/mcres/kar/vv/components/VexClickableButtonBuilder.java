package cn.mcres.kar.vv.components;

import lk.vexview.gui.components.ButtonFunction;
import lk.vexview.gui.components.VexButton;
import lk.vexview.gui.components.expand.VexClickableButton;

public class VexClickableButtonBuilder extends VexButtonBuilder {
    private boolean c;

    @Override
    protected VexClickableButton build0() {
        if (bf == null) {
            return new VexClickableButton(id, txt, u1, u2, u3, x, y, w, h, c);
        }
        return new VexClickableButton(id, txt, u1, u2, u3, x, y, w, h, bf, c);

    }

    private String u3;

    public VexClickableButtonBuilder disable_background(String url) {
        u3 = url;
        clear();
        return this;
    }

    public boolean is_clickable() {
        return c;
    }

    public VexClickableButtonBuilder non_clickable() {
        c = false;
        clear();
        return this;
    }

    public VexClickableButtonBuilder clickable() {
        this.c = true;
        clear();
        return this;
    }

    @Override
    public VexClickableButtonBuilder id(String id) {
        super.id(id);
        return this;
    }

    @Override
    public VexClickableButtonBuilder id(Object id) {
        super.id(id);
        return this;
    }

    @Override
    public VexClickableButtonBuilder background(String bg) {
        super.background(bg);
        return this;
    }

    @Override
    public VexClickableButtonBuilder text(String text) {
        super.text(text);
        return this;
    }

    @Override
    public VexClickableButtonBuilder pos(int x, int y) {
        super.pos(x, y);
        return this;
    }

    @Override
    public VexClickableButtonBuilder size(int width, int height) {
        super.size(width, height);
        return this;
    }

    @Override
    public VexClickableButtonBuilder callback(ButtonFunction bf) {
        super.callback(bf);
        return this;
    }
}
