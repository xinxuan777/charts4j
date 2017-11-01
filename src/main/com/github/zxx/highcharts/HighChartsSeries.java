package com.github.zxx.highcharts;

import java.util.HashMap;

public class HighChartsSeries extends HashMap
{

    public HighChartsSeries()
    {
    }

    public HighChartsSeries set(Object key, Object value)
    {
        super.put(key, value);
        return this;
    }
}
