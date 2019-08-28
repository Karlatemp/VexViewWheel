package cn.mcres.kar.vv.hud;

import lk.vexview.hud.VexImageShow;

public class VexImageShowBuilder extends VexShowBuilder<VexImageShowBuilder, VexImageShow> {
    private String url;
    private int x, y, z, w, h, sw, sh, time;

    @Override
    protected VexImageShow build0() {
        return new VexImageShow(id, url, x, y, z, w, h, sw, sh, time);
    }

    public VexImageShowBuilder background(String url) {
        this.url = url;
        return this;
    }

    public VexImageShowBuilder pos(int x, int y) {
        this.x = x;
        this.y = y;
        return this;
    }

    public VexImageShowBuilder z(int z) {
        this.z = z;
        return this;
    }

    public VexImageShowBuilder image_size(int wid, int hei) {
        w = wid;
        h = hei;
        return this;
    }

    public VexImageShowBuilder scaled_size(int wid, int hei) {
        sw = wid;
        sh = hei;
        return this;
    }

    public VexImageShowBuilder time(int t) {
        time = t;
        return this;
    }
}
