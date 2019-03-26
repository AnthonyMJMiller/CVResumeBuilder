package com.resumeBuilder.CVResumeBuilder.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Resume {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	
	private String firstname;
	private String lastname;
	private String address;
	private String zip_code;
	private String dob;
	private String email;
	private String phoneNo;
	private String university;
	private String skill;
	private String employer;
	private String workDescription;
	
	public Resume() {
		// TODO Auto-generated constructor stub
	}

	public Resume(Integer id, String firstname, String lastname, String address, String zip_code, String dob,
			String email, String phoneNo, String university, String skill, String employer, String workDescription) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.zip_code = zip_code;
		this.dob = dob;
		this.email = email;
		this.phoneNo = phoneNo;
		this.university = university;
		this.skill = skill;
		this.employer = employer;
		this.workDescription = workDescription;
	}

	public Resume(Integer id, String firstname, String lastname) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	public Resume(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZip_code() {
		return zip_code;
	}

	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public String getWorkDescription() {
		return workDescription;
	}

	public void setWorkDescription(String workDescription) {
		this.workDescription = workDescription;
	}

	@Override
	public String toString() {
		return "Resume [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", address=" + address
				+ ", zip_code=" + zip_code + ", dob=" + dob + ", email=" + email + ", phoneNo=" + phoneNo
				+ ", university=" + university + ", skill=" + skill + ", employer=" + employer + ", workDescription="
				+ workDescription + "]";
	}

}
