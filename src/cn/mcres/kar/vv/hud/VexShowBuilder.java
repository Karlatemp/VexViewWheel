package cn.mcres.kar.vv.hud;

import cn.mcres.kar.vv.Builder;
import lk.vexview.hud.VexShow;

public abstract class VexShowBuilder
        <B extends VexShowBuilder<B, T>, T extends VexShow> implements
        Builder<B, T> {

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

    public B id(String id) {
        this.id = id;
        clear();
        //noinspection unchecked
        return (B) this;
    }

    protected abstract T build0();
}
