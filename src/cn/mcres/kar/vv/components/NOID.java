package cn.mcres.kar.vv.components;

import lk.vexview.gui.components.VexComponents;

public abstract class NOID<A extends NOID<A, B>, B extends VexComponents> extends VexComponentBuilder<A, B> {
    @Deprecated
    public A id(String id) {
        return (A) this;
    }

}
