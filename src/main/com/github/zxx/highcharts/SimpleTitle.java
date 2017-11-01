package com.github.zxx.highcharts;

import lombok.Builder;
import lombok.Data;

@Data
public class SimpleTitle {
	
	public SimpleTitle(String text) {
		this.text = text;
	}
	private TextStyle style;
	private String text;
}
