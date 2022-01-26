package com.gcu.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ProductModel {
	private int id;
	@NotNull(message="Trip Name is a required field")
	@Size(min=1, max=32, message="Trip Name must be between 1 and 32 characters")
	private String tripName;
	
	@NotNull(message="Trip Description is a required field")
	@Size(min=1, max=32, message="Trip Description must be between 1 and 32 characters")
	private String tripDes;
	
	@NotNull(message="Start Date is a required field")
	@Size(min=1, max=32, message="Start Date must be between 1 and 32 characters")
	private String startDate;
	
	@NotNull(message="Duration is a required field")
	@Size(min=1, max=32, message="Duration must be between 1 and 32 characters")
	private String duration;
	
	@NotNull(message="Price is a required field")
	@Size(min=1, max=32, message="Price must be between 1 and 32 characters")
	private String price;
	
	@NotNull(message="Trip Type is a required field")
	@Size(min=1, max=32, message="Trip Type must be between 1 and 32 characters")
	private String tripType;
	
	public ProductModel() {}
	
	public ProductModel(int id,
			@NotNull(message = "Duration is a required field") @Size(min = 1, max = 32, message = "Duration must be between 1 and 32 characters") String duration,
			@NotNull(message = "Price is a required field") @Size(min = 1, max = 32, message = "Price must be between 1 and 32 characters") String price,
			@NotNull(message = "StartDate is a required field") @Size(min = 1, max = 32, message = "startDate must be between 1 and 32 characters") String startDate,
			@NotNull(message = "TripDes is a required field") @Size(min = 1, max = 32, message = "tripdes must be between 1 and 32 characters") String tripDes,
			@NotNull(message = "TripName is a required field") @Size(min = 1, max = 32, message = "trip name must be between 1 and 32 characters") String tripName,
			@NotNull(message = "TripType is a required field") @Size(min = 1, max = 32, message = "trip type must be between 1 and 32 characters") String tripType) {
		
		this.id = id;
		this.duration = duration;
		this.price = price;
		this.startDate = startDate;
		this.tripDes = tripDes;
		this.tripName = tripName;
		this.tripType = tripType;
		
	}
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the tripName
	 */
	public String getTripName() {
		return tripName;
	}
	/**
	 * @param tripName the tripName to set
	 */
	public void setTripName(String tripName) {
		this.tripName = tripName;
	}
	/**
	 * @return the tripDes
	 */
	public String getTripDes() {
		return tripDes;
	}
	/**
	 * @param tripDes the tripDes to set
	 */
	public void setTripDes(String tripDes) {
		this.tripDes = tripDes;
	}
	/**
	 * @return the startDate
	 */
	public String getStartDate() {
		return startDate;
	}
	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	/**
	 * @return the duration
	 */
	public String getDuration() {
		return duration;
	}
	/**
	 * @param duration the duration to set
	 */
	public void setDuration(String duration) {
		this.duration = duration;
	}
	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}
	/**
	 * @return the tripType
	 */
	public String getTripType() {
		return tripType;
	}
	/**
	 * @param tripType the tripType to set
	 */
	public void setTripType(String tripType) {
		this.tripType = tripType;
	}
	
	@Override
	public String toString() {
		return "Product was created [tripName=" + tripName + ", tripDes=" + tripDes + ", startDate=" + startDate
				+ ", duration=" + duration + ", price=" + price + ", tripType=" + tripType + "]";
	}
	
	
}
