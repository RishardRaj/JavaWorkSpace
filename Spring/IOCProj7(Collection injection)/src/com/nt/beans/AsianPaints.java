package com.nt.beans;

import java.util.Arrays;

public class AsianPaints {
  private String colors[];

public void setColors(String[] colors) {
	this.colors = colors;
}

@Override
public String toString() {
	return "AsinPaints [colors=" + Arrays.toString(colors) + "]";
}
	

}
