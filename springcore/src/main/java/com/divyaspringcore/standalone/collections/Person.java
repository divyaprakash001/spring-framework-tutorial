package com.divyaspringcore.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	private List<String> friends;
	private Map<String, Integer> foodItems;
	private Properties properties;

	public Person() {
		super();
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Map<String, Integer> getFoodItems() {
		return foodItems;
	}

	public void setFoodItems(Map<String, Integer> foodItems) {
		this.foodItems = foodItems;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", foodItems=" + foodItems + ", properties=" + properties + "]";
	}

}
