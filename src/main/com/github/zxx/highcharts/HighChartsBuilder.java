package com.github.zxx.highcharts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.github.zxx.util.ChartsUtil;
import com.github.zxx.util.GsonUtil;

public class HighChartsBuilder {

	private HighChart highChart;
	public HighChartsBuilder()
	{
		highChart = new HighChart();
	}

	public HighChart highChart() {
		return highChart;
	}

	public Map fetch() {
		Map map = new HashMap();
		put(map, "chart", highChart.getChart());
		put(map, "title", highChart.getTitle());
		put(map, "subtitle", highChart.getSubtitle());
		put(map, "legend", highChart.getLegend());
		put(map, "xAxis", highChart.getXAxis());
		put(map, "yAxis", highChart.getYAxis());
		put(map, "zAxis", highChart.getZAxis());
		put(map, "plotoptions", highChart.getPlotoptions());
		put(map, "tooltip", highChart.getTooltip());
		put(map, "credits", highChart.getCredits());
		put(map, "exporting", highChart.getExporting());
		if (highChart.getSeries() == null) {
			put(map, "series", highChart.getSeriesSet());
		} else {
			List list = new ArrayList();
			list.add(highChart.getSeries());
			put(map, "series", list);
		}
		return map;
	}

	private void put(Map map, String key, Object obj) {
		if (obj != null)
			map.put(key, obj);
	}

	/**
     * 在浏览器中查看
     */
    public void view() {
        ChartsUtil.browse(fetch(), ChartsUtil.HIGHCHARTS);
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
        return ChartsUtil.exportToHtml(fetch(), ChartsUtil.HIGHCHARTS, filePath, fileName);
    }
}
