package com.myspace.gitproject;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class gitObject implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "name")
	private java.lang.String name;

	public gitObject() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public gitObject(java.lang.String name) {
		this.name = name;
	}

}