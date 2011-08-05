package resteasy.beans;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Persons {

	private static final long serialVersionUID = 1L;
	private int age;
	private String name;

	public Persons() {
		super();
	}

	public Persons(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@XmlElement
	public int getAge() {
		return age;
	}

	@XmlElement
	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

}
