package com.helicalinsight.export;

public interface IComponent {
	public String executeComponent(String jsonFormData);

	public boolean isThreadSafeToCache();
}
