package kr.nerdlab.ignite;

import org.apache.ignite.configuration.IgniteConfiguration;

import java.util.Map;

public class IgniteHelper {
    private final IgniteConfiguration igniteCfg;
    private final Map<Class<?>, IgniteMapperable> mapper;

    public IgniteHelper(IgniteConfiguration igniteCfg, Map<Class<?>, IgniteMapperable> mapper) {
        this.igniteCfg = igniteCfg;
        this.mapper = mapper;

        init();
    }

    private void init() {
//        String region = igniteCfg.getDataStorageConfiguration().getDefaultDataRegionConfiguration().getName();
    }
}
