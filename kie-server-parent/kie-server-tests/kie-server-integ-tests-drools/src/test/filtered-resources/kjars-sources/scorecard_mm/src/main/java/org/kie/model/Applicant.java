package org.kie.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Applicant implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Age")
	private java.lang.Integer age;
	@org.kie.api.definition.type.Label("Occupation")
	private java.lang.String occupation;
	@org.kie.api.definition.type.Label("ResidenceState")
	private java.lang.String residenceState;
	@org.kie.api.definition.type.Label("ValidLicense")
	private java.lang.Boolean validLicense;

	@org.kie.api.definition.type.Label(value = "TotalScore")
	private java.lang.Double totalScore;

	public Applicant() {
	}

	public java.lang.Integer getAge() {
		return this.age;
	}

	public void setAge(java.lang.Integer age) {
		this.age = age;
	}

	public java.lang.String getOccupation() {
		return this.occupation;
	}

	public void setOccupation(java.lang.String occupation) {
		this.occupation = occupation;
	}

	public java.lang.String getResidenceState() {
		return this.residenceState;
	}

	public void setResidenceState(java.lang.String residenceState) {
		this.residenceState = residenceState;
	}

	public java.lang.Boolean getValidLicense() {
		return this.validLicense;
	}

	public void setValidLicense(java.lang.Boolean validLicense) {
		this.validLicense = validLicense;
	}

	public java.lang.Double getTotalScore() {
		return this.totalScore;
	}

	public void setTotalScore(java.lang.Double totalScore) {
		this.totalScore = totalScore;
	}

	public Applicant(java.lang.Integer age, java.lang.String occupation,
			java.lang.String residenceState, java.lang.Boolean validLicense,
			java.lang.Double totalScore) {
		this.age = age;
		this.occupation = occupation;
		this.residenceState = residenceState;
		this.validLicense = validLicense;
		this.totalScore = totalScore;
	}

}