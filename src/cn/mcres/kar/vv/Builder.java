package cn.mcres.kar.vv;


public interface Builder<B extends Builder<B, C>, C> {
    C build();
}

