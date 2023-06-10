package com.wiley.springcore.factoryBeans;

public class InstanceBarFactory {
	public Bar createInstance(String name) {
        return new Bar(name);
    }
}
