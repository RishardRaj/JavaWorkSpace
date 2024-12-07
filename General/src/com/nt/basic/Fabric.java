package com.nt.basic;

public class Fabric {
	public enum Color {
		RED(0xff0000), GREEN(0x00ff00), BLUE(0x0000ff);
		private final int rgb;

		Color(int rgb) {
			this.rgb = rgb;
		}

		public int getRGB() {
			return rgb;
		}
	};

	public static void main(String[] argv) { 
		// insert code here
//Color purple = new Color( 0xff00ff);
	}
}
