package com.qa.app;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account")
public class accountholders {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int accountnumber;
	private String  firstname;
	private String surname;
	
	
	private accountholders() {
		
	}
	
	public accountholders(String firstname, String surname, int accountnumber) {
		this.firstname = firstname;
		this.surname = surname;
		this.accountnumber = accountnumber;
	}
	
	public String getfirstname() {
		return firstname;
	}
	
	public String getsurname() {
		return surname;
	}
	
	public int accountnumber() {
		return accountnumber;
	}
	
	public void setdetails(String firstname, String surname, int accountnumber) {
		this.firstname = firstname;
		this.surname = surname;
		this.accountnumber = accountnumber;
	}

	@Override
	public String toString() {
		return "account_class [firstname=" + firstname + ", surname=" + surname + ", accountnumber=" + accountnumber
				+ "]";
	}

}
