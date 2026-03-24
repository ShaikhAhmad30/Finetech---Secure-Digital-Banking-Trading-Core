package com.finetech.banking.service.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="bankUser")
public class FinetechBankingUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Long id;
	private  String fullName;
	private LocalDate dob;
	private  String gender;
    @Column(unique=true) 
    private String email;
    private String phoneNumber;
    private String address;
    @Column(unique=true)
    private String governmentId;
    @Column(unique=true)
    private String panNumber;
    private String password;

    @OneToMany(mappedBy="bank_user", cascade=CascadeType.ALL)
    private List<FinetechBankingAccount> accounts;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGovernmentId() {
		return governmentId;
	}

	public void setGovernmentId(String governmentId) {
		this.governmentId = governmentId;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<FinetechBankingAccount> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<FinetechBankingAccount> accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		return "FinetechBankingUser [id=" + id + ", fullName=" + fullName + ", dob=" + dob + ", gender=" + gender
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", address=" + address + ", governmentId="
				+ governmentId + ", panNumber=" + panNumber + ", password=" + password + ", accounts=" + accounts + "]";
	}

}
