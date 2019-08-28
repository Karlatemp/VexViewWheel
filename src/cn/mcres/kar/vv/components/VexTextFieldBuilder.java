package cn.mcres.kar.vv.components;

import lk.vexview.gui.components.VexHoverText;
import lk.vexview.gui.components.VexTextField;

public class VexTextFieldBuilder extends NOID<VexTextFieldBuilder, VexTextField> implements HoverTextComponentBuilder<VexTextFieldBuilder> {
    private VexHoverText vht;

    @Override
    protected VexTextField build0() {
        VexTextField vtf;
        if (p == null) {
            vtf = new VexTextField(id, x, y, w, h, m);
        } else {
            vtf = new VexTextField(id, x, y, w, h, m, p);
        }
        if (vht != null) vtf.setHover(vht);
        return vtf;
    }

    private int id, x, y, w, h, m;
    private String p;

    public VexTextFieldBuilder id(int id) {
        this.id = id;
        clear();
        return this;
    }

    public VexTextFieldBuilder pos(int x, int y) {
        this.x = x;
        this.y = y;
        clear();
        return this;
    }

    public VexTextFieldBuilder size(int width, int height) {
        w = width;
        h = height;
        clear();
        return this;
    }

    public VexTextFieldBuilder max(int max) {
        m = max;
        clear();
        return this;
    }

    public VexTextFieldBuilder value(String value) {
        p = value;
        clear();
        return this;
    }

    @Override
    public VexTextFieldBuilder hover(VexHoverText text) {
        this.vht = text;
        return null;
    }
}
