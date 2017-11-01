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

/**
 * 文字样式
 *
 * @author liuzh
 *         Created by liuzh on 14-8-25.
 */
public class TextStyle implements Serializable {

    private static final long serialVersionUID = 5748410562515851843L;

    /**
     * 颜色
     */
    private String color;
    /**
     * 字号 ，单位px
     */
    private Integer fontSize;
    /**
     * 字体系列
     */
    private String fontFamily;
    /**
     * 粗细，可选为：'normal' | 'bold' | 'bolder' | 'lighter' | 100 | 200 |... | 900
     *
     * @see com.github.zxx.highcharts.code.FontWeight
     */
    private Object fontWeight;


    /**
     * 获取color值
     */
    public String color() {
        return this.color;
    }

    /**
     * 设置color值
     *
     * @param color
     */
    public TextStyle color(String color) {
        this.color = color;
        return this;
    }

    /**
     * 获取fontSize值
     */
    public Integer fontSize() {
        return this.fontSize;
    }

    /**
     * 设置fontSize值
     *
     * @param fontSize
     */
    public TextStyle fontSize(Integer fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    /**
     * 获取fontFamily值
     */
    public String fontFamily() {
        return this.fontFamily;
    }

    /**
     * 设置fontFamily值
     *
     * @param fontFamily
     */
    public TextStyle fontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
        return this;
    }


    /**
     * 获取fontWeight值
     */
    public Object fontWeight() {
        return this.fontWeight;
    }

    /**
     * 设置fontWeight值
     *
     * @param fontWeight
     */
    public TextStyle fontWeight(Object fontWeight) {
        this.fontWeight = fontWeight;
        return this;
    }

    /**
     * 获取color值
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置color值
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 获取fontSize值
     */
    public Integer getFontSize() {
        return fontSize;
    }

    /**
     * 设置fontSize值
     *
     * @param fontSize
     */
    public void setFontSize(Integer fontSize) {
        this.fontSize = fontSize;
    }

    /**
     * 获取fontFamily值
     */
    public String getFontFamily() {
        return fontFamily;
    }

    /**
     * 设置fontFamily值
     *
     * @param fontFamily
     */
    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    /**
     * 获取fontWeight值
     */
    public Object getFontWeight() {
        return fontWeight;
    }

    /**
     * 设置fontWeight值
     *
     * @param fontWeight
     */
    public void setFontWeight(Object fontWeight) {
        this.fontWeight = fontWeight;
    }

}
