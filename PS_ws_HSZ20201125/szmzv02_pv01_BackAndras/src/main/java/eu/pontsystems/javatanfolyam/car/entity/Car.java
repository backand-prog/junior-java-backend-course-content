package eu.pontsystems.javatanfolyam.car.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String rendszam;
	private String marka;
	private String tipus;
	private Integer motorTerfogat;
	private Integer gyartasiEv;
	
	
	public Car(Long id, String rendszam, String marka, String tipus, Integer motorTerfogat, Integer gyartasiEv) {
		super();
		this.id = id;
		this.rendszam = rendszam;
		this.marka = marka;
		this.tipus = tipus;
		this.motorTerfogat = motorTerfogat;
		this.gyartasiEv = gyartasiEv;
	}
	
	public Car() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRendszam() {
		return rendszam;
	}

	public void setRendszam(String rendszam) {
		this.rendszam = rendszam;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getTipus() {
		return tipus;
	}

	public void setTipus(String tipus) {
		this.tipus = tipus;
	}

	public Integer getMotorTerfogat() {
		return motorTerfogat;
	}

	public void setMotorTerfogat(Integer motorTerfogat) {
		this.motorTerfogat = motorTerfogat;
	}

	public Integer getGyartasiEv() {
		return gyartasiEv;
	}

	public void setGyartasiEv(Integer gyartasiEv) {
		this.gyartasiEv = gyartasiEv;
	}
	
	public String toString() {
		return "Car id: " + id + " rendszam: " + rendszam + " marka: "
				+ " típus:" + tipus + " motortérfogat: " + motorTerfogat + " gyártási év" +
				gyartasiEv; 
	}
	
}
