package cn.mcres.kar.vv.components;


import lk.vexview.gui.components.VexPlayerDraw;
import org.bukkit.entity.Player;

public class VexPlayerDrawBuilder extends NOID<VexPlayerDrawBuilder, VexPlayerDraw> {
    private int x, y, scale;
    public Player p;

    public VexPlayerDrawBuilder pos(int x, int y) {
        this.x = x;
        this.y = y;
        clear();
        return this;
    }

    public VexPlayerDrawBuilder scale(int scale) {
        this.scale = scale;
        clear();
        return this;
    }

    @Override
    protected VexPlayerDraw build0() {
        return new VexPlayerDraw(x, y, scale, p);
    }
}
