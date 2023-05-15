package kr.nerdlab.ignite.entity;

import kr.nerdlab.ignite.IgniteHelper;
import kr.nerdlab.ignite.IgniteMapperable;
import org.apache.ignite.configuration.IgniteConfiguration;

import java.util.Map;

public class IgniteHelperBuilder {
    private IgniteConfiguration igniteCfg;
    private Map<Class<?>, IgniteMapperable> mapper;

    public IgniteHelperBuilder igniteConfiguration(IgniteConfiguration igniteCfg) {
        this.igniteCfg = igniteCfg;
        return this;
    }




    public IgniteHelper build() {
        return new IgniteHelper(igniteCfg, mapper);
    }


}
