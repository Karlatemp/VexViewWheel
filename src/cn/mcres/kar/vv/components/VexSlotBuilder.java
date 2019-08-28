package cn.mcres.kar.vv.components;

import lk.vexview.gui.components.VexSlot;
import org.bukkit.inventory.ItemStack;

public class VexSlotBuilder extends VexComponentBuilder<VexSlotBuilder, VexSlot> {
    private int id, x, y;
    private ItemStack stack;

    public VexSlotBuilder id(int id) {
        this.id = id;
        clear();
        return this;
    }

    public VexSlotBuilder pos(int x, int y) {
        this.x = x;
        this.y = y;
        clear();
        return this;
    }

    public VexSlotBuilder item(ItemStack stack) {
        this.stack = stack;
        if (build != null) build.setItem(stack);
        return this;
    }

    @Override
    protected VexSlot build0() {
        return new VexSlot(id, x, y, stack);
    }

}
