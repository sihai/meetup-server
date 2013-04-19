/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain;


/**
 * 
 * @author sihai
 *
 */
public class AttributeProtoCanonicalValue extends GenericJson {

	public String hotelRatingStars;
	
    public PlacePageLink link;
    
    public String priceLevel;
    
    public PriceRangeProto priceRange;
    
    public Float ratingStars;
    
    public TimeScheduleProto timeSchedule;

	public String getHotelRatingStars() {
		return hotelRatingStars;
	}

	public void setHotelRatingStars(String hotelRatingStars) {
		this.hotelRatingStars = hotelRatingStars;
	}

	public PlacePageLink getLink() {
		return link;
	}

	public void setLink(PlacePageLink link) {
		this.link = link;
	}

	public String getPriceLevel() {
		return priceLevel;
	}

	public void setPriceLevel(String priceLevel) {
		this.priceLevel = priceLevel;
	}

	public PriceRangeProto getPriceRange() {
		return priceRange;
	}

	public void setPriceRange(PriceRangeProto priceRange) {
		this.priceRange = priceRange;
	}

	public Float getRatingStars() {
		return ratingStars;
	}

	public void setRatingStars(Float ratingStars) {
		this.ratingStars = ratingStars;
	}

	public TimeScheduleProto getTimeSchedule() {
		return timeSchedule;
	}

	public void setTimeSchedule(TimeScheduleProto timeSchedule) {
		this.timeSchedule = timeSchedule;
	}
}
