package com.uca.capas.domain;

import javax.validation.constraints.AssertTrue;

public class Robot {

	@AssertTrue(message = "No se puede agregar tu producto porque eres un robot,favor hacer click en regresar")
	private Boolean imRobot;

	public Boolean getImRobot() {
		return imRobot;
	}

	public void setImRobot(Boolean imRobot) {
		this.imRobot = imRobot;
	}
	
	
}


