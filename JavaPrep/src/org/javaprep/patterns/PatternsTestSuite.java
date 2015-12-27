package org.javaprep.patterns;

import static org.junit.Assert.*;

import org.junit.Test;

public class PatternsTestSuite {
	
	@Test
	public void personBuilder(){
		Person.Builder builder = new Person.Builder();
		Person newPerson = builder.withName("Wes")
									.withSex("M")
									.build();
		
		assertEquals("Wes",newPerson.getName());
	}

}
