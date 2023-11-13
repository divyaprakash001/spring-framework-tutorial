package com.divyaspringcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
	private String name;
	private List<String> phones;
	private Set<String> addresses;
	private Map<String, String> course;
	private Properties props;

	public Emp(String name, List<String> phones, Set<String> addresses, Map<String, String> course, Properties props) {
		super();
		this.name = name;
		this.phones = phones;
		this.addresses = addresses;
		this.course = course;
		this.props = props;
	}

	public Emp() {
		super();
	}

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public Set<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}

	public Map<String, String> getCourse() {
		return course;
	}

	public void setCourse(Map<String, String> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", phones=" + phones + ", addresses=" + addresses + ", course=" + course + "]";
	}

}
