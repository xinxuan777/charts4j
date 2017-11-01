package com.github.zxx.echarts;

import java.util.HashMap;

public class EChartsSeries extends HashMap
{

    public EChartsSeries()
    {
    }

    public EChartsSeries set(Object key, Object value)
    {
        super.put(key, value);
        return this;
    }
}
