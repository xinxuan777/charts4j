package com.github.zxx.echarts;

import java.util.*;

import com.github.zxx.util.ChartsUtil;
import com.github.zxx.util.GsonUtil;

public class EChartsOptionBuilder
{
	private EChartsOption options;
	
    public EChartsOptionBuilder()
    {
        options = new EChartsOption();
    }

    public EChartsOption options()
    {
        return options;
    }

    public Map fetch()
    {
        Map map = new HashMap();
        put(map, "title", options.getTitle());
        put(map, "legend", options.getLegend());
        put(map, "grid", options.getGrid());
        put(map, "xAxis", options.getxAxis());
        put(map, "yAxis", options.getyAxis());
        put(map, "polar", options.getPolar());
        put(map, "radiusAxis", options.getRadiusAxis());
        put(map, "angleAxis", options.getAngleAxis());
        put(map, "radar", options.getRadar());
        put(map, "dataZoom", options.getDataZoom());
        put(map, "visualMap", options.getVisualMap());
        put(map, "tooltip", options.getTooltip());
        put(map, "toolbox", options.getToolbox());
        put(map, "geo", options.getGeo());
        put(map, "parallel", options.getParallel());
        put(map, "parallelAxis", options.getParallelAxis());
        put(map, "timeline", options.getTimeline());
        put(map, "color", options.getColor());
        put(map, "backgroundColor", options.getBackgroundColor());
        put(map, "textStyle", options.getTextStyle());
        put(map, "animation", Boolean.valueOf(options.isAnimation()));
        put(map, "animationDuration", Long.valueOf(options.getAnimationDuration()));
        put(map, "animationEasing", options.getAnimationEasing());
        put(map, "animationDurationUpdate", Long.valueOf(options.getAnimationDurationUpdate()));
        put(map, "animationEasingUpdate", options.getAnimationEasingUpdate());
        put(map, "calculable", Boolean.valueOf(options.isCalculable()));
        if(options.getSeries() == null)
        {
            put(map, "series", options.getSeriesSet());
        } else
        {
            List list = new ArrayList();
            list.add(options.getSeries());
            put(map, "series", list);
        }
        return map;
    }

    private void put(Map map, String key, Object obj)
    {
        if(obj != null)
            map.put(key, obj);
    }
    
    /**
     * 在浏览器中查看
     */
    public void view() {
        ChartsUtil.browse(fetch(), ChartsUtil.ECHARTS);
    }

    @Override
    /**
     * 获取toString值
     */
    public String toString() {
        return GsonUtil.format(fetch());
    }

    /**
     * 获取toPrettyString值
     */
    public String toPrettyString() {
        return GsonUtil.prettyFormat(fetch());
    }

    /**
     * 导出到指定文件名
     *
     * @param fileName
     * @return 返回html路径
     */
    public String exportToHtml(String fileName) {
        return exportToHtml(System.getProperty("java.io.tmpdir"), fileName);
    }

    /**
     * 导出到指定文件名
     *
     * @param fileName
     * @return 返回html路径
     */
    public String exportToHtml(String filePath, String fileName) {
        return ChartsUtil.exportToHtml(fetch(), ChartsUtil.ECHARTS, filePath, fileName);
    }

}
