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

package com.github.zxx.echarts.samples.bar;

import org.junit.Test;

import com.github.zxx.echarts.EChartsOptionBuilder;
import com.github.zxx.echarts.EChartsSeries;
import com.github.zxx.echarts.code.Magic;
import com.github.zxx.echarts.code.Tool;
import com.github.zxx.echarts.feature.Feature;
import com.github.zxx.echarts.feature.MagicType;

/**
 * @author liuzh
 */
public class BarTest1 {

    @Test
    public void test() {
        //地址：http://echarts.baidu.com/doc/example/bar1.html
    	EChartsOptionBuilder builder = new EChartsOptionBuilder();
    	builder.options()
    	.title("text","某地区蒸发量和降水量").title("subtext","纯属虚构")
    	.tooltip("trigger", "axis")
        .legend("data", new String[] {"蒸发量", "降水量"})
    	.toolbox("show", "true").toolbox("feature", new Feature(Tool.mark, Tool.dataView, new MagicType(Magic.line, Magic.bar).show(true), Tool.restore, Tool.saveAsImage).feature())
    	.setCalculable(true)
    	.xAxis("type","category").xAxis("data", new String[] {"1月", "2月", "3月", "4月", "5月", "6月", "7月", "8月", "9月", "10月", "11月", "12月"})
    	.yAxis("type","value")
    	.seriesPut(new EChartsSeries().set("name", "蒸发量").set("type", "bar").set("data", new Double[] {2.0, 4.9, 7.0, 23.2, 25.6, 76.7, 135.6, 162.2, 32.6, 20.0, 6.4, 3.3}))
    	.seriesPut(new EChartsSeries().set("name", "降水量").set("type", "bar").set("data", new Double[] {2.6, 5.9, 9.0, 26.4, 28.7, 70.7, 175.6, 182.2, 48.7, 18.8, 6.0, 2.3}));
        builder.exportToHtml("bar1.html");
        builder.view();
    }
}
