package cn.mcres.kar.vv.components;

import lk.vexview.gui.components.VexHoverText;
import lk.vexview.gui.components.expand.VexBase64Image;

import java.io.InputStream;

public class VexBase64ImageBuilder extends VexComponentBuilder<VexBase64ImageBuilder, VexBase64Image>
        implements HoverTextComponentBuilder {
    private InputStream stream;
    private String id;
    private int x, y, w, h;
    private VexHoverText vht;

    public VexBase64ImageBuilder stream(InputStream stream) {
        this.stream = stream;
        clear();
        return this;
    }

    public VexBase64ImageBuilder pos(int x, int y) {
        this.x = x;
        this.y = y;
        clear();
        return this;
    }

    public VexBase64ImageBuilder size(int width, int height) {
        this.w = width;
        this.h = height;
        clear();
        return this;
    }


    @Override
    protected VexBase64Image build0() {
        if (vht == null) {
            return new VexBase64Image(stream, id, x, y, w, h);
        }
        return new VexBase64Image(stream, id, x, y, w, h, vht);
    }

    @Override
    public VexBase64ImageBuilder hover(VexHoverText text) {
        clear();
        vht = text;
        return this;
    }
}
