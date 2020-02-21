package com.stackroute.buzzup.kafka.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document

public class Theatre {
	@Id
	private String theatreId;
	private String emailId;
	private String theatreLocation;
	private String theatreCity;
	private String theatreName;
	private String theatreLicenseNo;
	private String totalnumberOfSeats;	
	private String[] screenedmovies;
	private String[] runningmovies;
	private Seats seatLayout;
	private String[] typesOfSeats;
	private int[] numberOfSeats;
	public String getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(String theatreId) {
		this.theatreId = theatreId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getTheatreLocation() {
		return theatreLocation;
	}
	public void setTheatreLocation(String theatreLocation) {
		this.theatreLocation = theatreLocation;
	}
	public String getTheatreCity() {
		return theatreCity;
	}
	public void setTheatreCity(String theatreCity) {
		this.theatreCity = theatreCity;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	public String getTheatreLicenseNo() {
		return theatreLicenseNo;
	}
	public void setTheatreLicenseNo(String theatreLicenseNo) {
		this.theatreLicenseNo = theatreLicenseNo;
	}
	public String getTotalnumberOfSeats() {
		return totalnumberOfSeats;
	}
	public void setTotalnumberOfSeats(String totalnumberOfSeats) {
		this.totalnumberOfSeats = totalnumberOfSeats;
	}
	public String[] getScreenedmovies() {
		return screenedmovies;
	}
	public void setScreenedmovies(String[] screenedmovies) {
		this.screenedmovies = screenedmovies;
	}
	public String[] getRunningmovies() {
		return runningmovies;
	}
	public void setRunningmovies(String[] runningmovies) {
		this.runningmovies = runningmovies;
	}
	public Seats getSeatLayout() {
		return seatLayout;
	}
	public void setSeatLayout(Seats seatLayout) {
		this.seatLayout = seatLayout;
	}
	public String[] getTypesOfSeats() {
		return typesOfSeats;
	}
	public void setTypesOfSeats(String[] typesOfSeats) {
		this.typesOfSeats = typesOfSeats;
	}
	public int[] getNumberOfSeats() {
		return numberOfSeats;
	}
	public void setNumberOfSeats(int[] numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	public Theatre(String theatreId, String emailId, String theatreLocation, String theatreCity, String theatreName,
			String theatreLicenseNo, String totalnumberOfSeats, String[] screenedmovies, String[] runningmovies,
			Seats seatLayout, String[] typesOfSeats, int[] numberOfSeats) {
		super();
		this.theatreId = theatreId;
		this.emailId = emailId;
		this.theatreLocation = theatreLocation;
		this.theatreCity = theatreCity;
		this.theatreName = theatreName;
		this.theatreLicenseNo = theatreLicenseNo;
		this.totalnumberOfSeats = totalnumberOfSeats;
		this.screenedmovies = screenedmovies;
		this.runningmovies = runningmovies;
		this.seatLayout = seatLayout;
		this.typesOfSeats = typesOfSeats;
		this.numberOfSeats = numberOfSeats;
	}
	public Theatre() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
