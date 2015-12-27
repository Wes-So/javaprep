package org.javaprep.patterns;

public class Person {

	public static class Builder {
		private String name;
		private String sex;
		private int age;
		private String race;//optional
		private String color;//optional
		
		public Builder withName(String name){
			this.name = name;
			return this;
		}
		
		public Builder withSex(String sex){
			this.sex = sex;
			return this;
		}
		
		public Builder withAge(int age){
			this.age = age;
			return this;
		}
		
		public Builder withRace(String race){
			this.race = race;
			return this;
		}
		
		public Builder withColor(String color){
			this.color = color;
			return this;
		}
		
		public Person build(){
			if(name == null || sex == null){
				throw new IllegalStateException("Cannot create person");
			}
			
			return new Person(name,sex,age,race,color);
		}
	}
	
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	private String sex;
	private int age;
	private String race;//optional
	private String color;//optional
	
	private Person(String name,String sex,int age, String race, String color){
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.race = race;
		this.color = color;
	}
	
}
