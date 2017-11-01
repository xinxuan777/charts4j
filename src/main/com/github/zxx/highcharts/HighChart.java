/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2015 abel533@gmail.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.github.zxx.highcharts;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.Data;

/**
 * Description: Option
 *
 * @author liuzh
 */
@Data
public class HighChart implements Serializable {

    private static final long serialVersionUID = 4664955083296866542L;
    
    public HighChart() {
    	chart = null;
    	title = null;
    	subtitle = null;
    	legend = null;
    	xAxis = null;
    	yAxis = null;
    	zAxis = null;
    	plotoptions = null;
    	series = null;
    	tooltip = null;
    	credits = null;
    	exporting = null;
    }

    private Map chart;
    
    private Map title;
    
    private Map subtitle;
    
    private Map legend;
    
    private Map xAxis;
    
    private Map yAxis;
    
    private Map zAxis;
    
    private Map plotoptions;
    
    private HighChartsSeries series;
    private List seriesSet;
    
    private Map tooltip;
    
    private Map credits;
    
    private Map exporting;
    
    public HighChart chart(String key, Object value)
    {
        if(chart == null)
        	chart = new HashMap();
        chart.put(key, value);
        return this;
    }
    
    public HighChart title(String key, Object value)
    {
        if(title == null)
            title = new HashMap();
        title.put(key, value);
        return this;
    }
    
    public HighChart subtitle(String key, Object value)
    {
        if(subtitle == null)
        	subtitle = new HashMap();
        subtitle.put(key, value);
        return this;
    }
    
    public HighChart legend(String key, Object value)
    {
        if(legend == null)
        	legend = new HashMap();
        legend.put(key, value);
        return this;
    }
    
    public HighChart xAxis(String key, Object value)
    {
        if(xAxis == null)
        	xAxis = new HashMap();
        xAxis.put(key, value);
        return this;
    }
    
    public HighChart yAxis(String key, Object value)
    {
        if(yAxis == null)
        	yAxis = new HashMap();
        yAxis.put(key, value);
        return this;
    }
    
    public HighChart zAxis(String key, Object value)
    {
        if(zAxis == null)
        	zAxis = new HashMap();
        zAxis.put(key, value);
        return this;
    }
    
    public HighChart plotoptions(String key, Object value)
    {
        if(plotoptions == null)
        	plotoptions = new HashMap();
        plotoptions.put(key, value);
        return this;
    }
    
    public HighChart seriesPut(HighChartsSeries obj)
    {
        if(seriesSet == null)
            seriesSet = new ArrayList();
        seriesSet.add(obj);
        return this;
    }

    public HighChart series(String key, Object value)
    {
        if(series == null)
            series = new HighChartsSeries();
        series.put(key, value);
        return this;
    }
    
    public HighChart tooltip(String key, Object value)
    {
        if(tooltip == null)
        	tooltip = new HashMap();
        tooltip.put(key, value);
        return this;
    }
    
    public HighChart credits(String key, Object value)
    {
        if(credits == null)
        	credits = new HashMap();
        credits.put(key, value);
        return this;
    }
    
    public HighChart exporting(String key, Object value)
    {
        if(exporting == null)
        	exporting = new HashMap();
        exporting.put(key, value);
        return this;
    }
}
