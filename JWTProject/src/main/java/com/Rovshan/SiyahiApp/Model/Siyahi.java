package com.Rovshan.SiyahiApp.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Siyahi {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String surname;
	private int owerall;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getOwerall() {
		return owerall;
	}
	public void setOwerall(int owerall) {
		this.owerall = owerall;
	}
	public Siyahi(int id, String name, String surname, int owerall) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.owerall = owerall;
	}
	public Siyahi() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Siyahi [id=" + id + ", name=" + name + ", surname=" + surname + ", owerall=" + owerall + "]";
	}
	
	
	
}
