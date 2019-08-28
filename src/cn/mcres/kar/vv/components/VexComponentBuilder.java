package cn.mcres.kar.vv.components;

import cn.mcres.kar.vv.Builder;
import lk.vexview.gui.components.VexComponents;

public abstract class VexComponentBuilder<
        C extends VexComponentBuilder<C, T>, T
        extends VexComponents>
        implements Builder<C, T> {

    protected T build;
    protected String id;

    protected void clear() {
        build = null;
    }

    public T build() {
        if (build == null) {
            build = build0();
        }
        return build;
    }

    public C id(String id) {
        this.id = id;
        clear();
        //noinspection unchecked
        return (C) this;
    }

    protected abstract T build0();
}
