package com.github.zxx.echarts;

import java.util.*;

public class EChartsOption
{
	
	private Map title;
    private Map legend;
    private Map grid;
    private Map xAxis;
    private Map yAxis;
    private Map polar;
    private Map radiusAxis;
    private Map angleAxis;
    private Map radar;
    private Map dataZoom;
    private Map visualMap;
    private Map tooltip;
    private Map toolbox;
    private Map geo;
    private Map parallel;
    private Map parallelAxis;
    private Map timeline;
    private EChartsSeries series;
    private List seriesSet;
    private Map textStyle;
    private List color;
    private List backgroundColor;
    private boolean calculable;
    private boolean animation;
    private long animationDuration;
    private String animationEasing;
    private long animationDurationUpdate;
    private String animationEasingUpdate;

    public EChartsOption()
    {
        title = null;
        legend = null;
        grid = null;
        xAxis = null;
        yAxis = null;
        polar = null;
        radiusAxis = null;
        angleAxis = null;
        radar = null;
        dataZoom = null;
        visualMap = null;
        tooltip = null;
        toolbox = null;
        geo = null;
        parallel = null;
        parallelAxis = null;
        timeline = null;
        series = null;
        seriesSet = null;
        textStyle = null;
        color = null;
        backgroundColor = null;
        animation = true;
        animationDuration = 1000L;
        animationEasing = "cubicOut";
        animationDurationUpdate = 300L;
        animationEasingUpdate = "cubicOut";
        calculable = true;
    }

    public EChartsOption title(String key, Object value)
    {
        if(title == null)
            title = new HashMap();
        title.put(key, value);
        return this;
    }

    public EChartsOption tooltip(String key, Object value)
    {
        if(tooltip == null)
            tooltip = new HashMap();
        tooltip.put(key, value);
        return this;
    }

    public EChartsOption toolbox(String key, Object value)
    {
        if(toolbox == null)
            toolbox = new HashMap();
        toolbox.put(key, value);
        return this;
    }

    public EChartsOption legend(String key, Object value)
    {
        if(legend == null)
            legend = new HashMap();
        legend.put(key, value);
        return this;
    }

    public EChartsOption seriesPut(EChartsSeries obj)
    {
        if(seriesSet == null)
            seriesSet = new ArrayList();
        seriesSet.add(obj);
        return this;
    }

    public EChartsOption series(String key, Object value)
    {
        if(series == null)
            series = new EChartsSeries();
        series.put(key, value);
        return this;
    }

    public EChartsOption grid(String key, Object value)
    {
        if(grid == null)
            grid = new HashMap();
        grid.put(key, value);
        return this;
    }

    public EChartsOption xAxis(String key, Object value)
    {
        if(xAxis == null)
            xAxis = new HashMap();
        xAxis.put(key, value);
        return this;
    }

    public EChartsOption yAxis(String key, Object value)
    {
        if(yAxis == null)
            yAxis = new HashMap();
        yAxis.put(key, value);
        return this;
    }

    public EChartsOption polar(String key, Object value)
    {
        if(polar == null)
            polar = new HashMap();
        polar.put(key, value);
        return this;
    }

    public EChartsOption radiusAxis(String key, Object value)
    {
        if(radiusAxis == null)
            radiusAxis = new HashMap();
        radiusAxis.put(key, value);
        return this;
    }

    public EChartsOption angleAxis(String key, Object value)
    {
        if(angleAxis == null)
            angleAxis = new HashMap();
        angleAxis.put(key, value);
        return this;
    }

    public EChartsOption radar(String key, Object value)
    {
        if(radar == null)
            radar = new HashMap();
        radar.put(key, value);
        return this;
    }

    public EChartsOption dataZoom(String key, Object value)
    {
        if(dataZoom == null)
            dataZoom = new HashMap();
        dataZoom.put(key, value);
        return this;
    }

    public EChartsOption visualMap(String key, Object value)
    {
        if(visualMap == null)
            visualMap = new HashMap();
        visualMap.put(key, value);
        return this;
    }

    public EChartsOption geo(String key, Object value)
    {
        if(geo == null)
            geo = new HashMap();
        geo.put(key, value);
        return this;
    }

    public EChartsOption parallel(String key, Object value)
    {
        if(parallel == null)
            parallel = new HashMap();
        parallel.put(key, value);
        return this;
    }

    public EChartsOption parallelAxis(String key, Object value)
    {
        if(parallelAxis == null)
            parallelAxis = new HashMap();
        parallelAxis.put(key, value);
        return this;
    }

    public EChartsOption timeline(String key, Object value)
    {
        if(timeline == null)
            timeline = new HashMap();
        timeline.put(key, value);
        return this;
    }

    public EChartsOption textStyle(String key, Object value)
    {
        if(textStyle == null)
            textStyle = new HashMap();
        textStyle.put(key, value);
        return this;
    }

    public EChartsOption color(String value)
    {
        if(color == null)
            color = new ArrayList();
        color.add(value);
        return this;
    }

    public EChartsOption backgroundColor(String value)
    {
        if(backgroundColor == null)
            backgroundColor = new ArrayList();
        backgroundColor.add(value);
        return this;
    }

    public EChartsOption animation(boolean animation)
    {
        this.animation = animation;
        return this;
    }

    public EChartsOption animationDuration(long animationDuration)
    {
        this.animationDuration = animationDuration;
        return this;
    }

    public EChartsOption animationEasing(String animationEasing)
    {
        this.animationEasing = animationEasing;
        return this;
    }

    public EChartsOption setAnimationDurationUpdate(long animationDurationUpdate)
    {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    public EChartsOption setAnimationEasingUpdate(String animationEasingUpdate)
    {
        this.animationEasingUpdate = animationEasingUpdate;
        return this;
    }
    
    public EChartsOption setCalculable(boolean calculable)
    {
        this.calculable = calculable;
        return this;
    }

    protected boolean isAnimation()
    {
        return animation;
    }

    protected long getAnimationDuration()
    {
        return animationDuration;
    }

    protected String getAnimationEasing()
    {
        return animationEasing;
    }

    protected long getAnimationDurationUpdate()
    {
        return animationDurationUpdate;
    }

    protected String getAnimationEasingUpdate()
    {
        return animationEasingUpdate;
    }
    
    protected boolean isCalculable()
    {
        return calculable;
    }

    protected Map getTitle()
    {
        return title;
    }

    protected Map getLegend()
    {
        return legend;
    }

    protected Map getGrid()
    {
        return grid;
    }

    protected Map getxAxis()
    {
        return xAxis;
    }

    protected Map getyAxis()
    {
        return yAxis;
    }

    protected Map getPolar()
    {
        return polar;
    }

    protected Map getRadiusAxis()
    {
        return radiusAxis;
    }

    protected Map getAngleAxis()
    {
        return angleAxis;
    }

    protected Map getRadar()
    {
        return radar;
    }

    protected Map getDataZoom()
    {
        return dataZoom;
    }

    protected Map getVisualMap()
    {
        return visualMap;
    }

    protected Map getTooltip()
    {
        return tooltip;
    }

    protected Map getToolbox()
    {
        return toolbox;
    }

    protected Map getGeo()
    {
        return geo;
    }

    protected Map getParallel()
    {
        return parallel;
    }

    protected Map getParallelAxis()
    {
        return parallelAxis;
    }

    protected Map getTimeline()
    {
        return timeline;
    }

    protected EChartsSeries getSeries()
    {
        return series;
    }

    protected List getSeriesSet()
    {
        return seriesSet;
    }

    protected Map getTextStyle()
    {
        return textStyle;
    }

    protected List getColor()
    {
        return color;
    }

    protected List getBackgroundColor()
    {
        return backgroundColor;
    }

}
