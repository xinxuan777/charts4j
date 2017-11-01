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

package com.github.zxx.highcharts.samples.bar;

import com.github.zxx.highcharts.HighChartsBuilder;
import com.github.zxx.highcharts.HighChartsSeries;
import com.github.zxx.highcharts.SimpleTitle;
import org.junit.Test;

/**
 * @author liuzh
 */
public class BarTest1 {

    @Test
    public void test() {
    	
        HighChartsBuilder builder = new HighChartsBuilder();
        builder.highChart()
        .chart("type", "column")
        .title("text", "月平均降雨量")
        .subtitle("text", "数据来源: WorldClimate.com")
        .xAxis("categories", new String[] { "一月",
                "二月",
                "三月",
                "四月",
                "五月",
                "六月",
                "七月",
                "八月",
                "九月",
                "十月",
                "十一月",
                "十二月"}).xAxis("crosshair", true)
        .yAxis("min", 0).yAxis("title", new SimpleTitle("降雨量 (mm)"))
        .seriesPut(new HighChartsSeries().set("name", "东京").set("data", new Double[] {49.9, 71.5, 106.4, 129.2, 144.0, 176.0, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4}))
        .seriesPut(new HighChartsSeries().set("name", "纽约").set("data", new Double[] {83.6, 78.8, 98.5, 93.4, 106.0, 84.5, 105.0, 104.3, 91.2, 83.5, 106.6, 92.3}))
        .seriesPut(new HighChartsSeries().set("name", "伦敦").set("data", new Double[] {48.9, 38.8, 39.3, 41.4, 47.0, 48.3, 59.0, 59.6, 52.4, 65.2, 59.3, 51.2}))
        .seriesPut(new HighChartsSeries().set("name", "柏林").set("data", new Double[] {42.4, 33.2, 34.5, 39.7, 52.6, 75.5, 57.4, 60.4, 47.6, 39.1, 46.8, 51.1}));
        
        
        builder.exportToHtml("bar1.html");
        builder.view();
    }
}
