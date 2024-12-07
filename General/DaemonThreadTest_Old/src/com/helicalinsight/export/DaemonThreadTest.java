//DaemonThreadTest.java
package com.helicalinsight.export;

public class DaemonThreadTest {
public static void main(String[] args) {
	DaemonServiceCheckComponent.executeComponent("start");
	DaemonServiceCheckComponent.executeComponent("stop");
	DaemonServiceCheckComponent.executeComponent("stop");
//	DaemonServiceCheckComponent.executeComponent("check");
}
}
