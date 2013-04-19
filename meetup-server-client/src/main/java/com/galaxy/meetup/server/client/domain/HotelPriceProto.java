/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain;

import java.util.List;

/**
 * 
 * @author sihai
 * 
 */
public class HotelPriceProto extends GenericJson {

	public String checkin;
	public String checkinHr;
	public String checkout;
	public String checkoutHr;
	public String conversionDisclaimerLink;
	public String formattedLowestBasePrice;
	public String formattedLowestPrice;
	public String formattedLowestRawBasePrice;
	public String formattedLowestRawPrice;
	public String formattedPrefixCurrency;
	public String formattedSuffixCurrency;
	public HotelPriceProtoHotelLoggingData hotelLoggingData;
	public HotelPriceProtoHotelPartner owner;
	public List partner;
	public Boolean taxesInclusive;

	public String getCheckin() {
		return checkin;
	}

	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}

	public String getCheckinHr() {
		return checkinHr;
	}

	public void setCheckinHr(String checkinHr) {
		this.checkinHr = checkinHr;
	}

	public String getCheckout() {
		return checkout;
	}

	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}

	public String getCheckoutHr() {
		return checkoutHr;
	}

	public void setCheckoutHr(String checkoutHr) {
		this.checkoutHr = checkoutHr;
	}

	public String getConversionDisclaimerLink() {
		return conversionDisclaimerLink;
	}

	public void setConversionDisclaimerLink(String conversionDisclaimerLink) {
		this.conversionDisclaimerLink = conversionDisclaimerLink;
	}

	public String getFormattedLowestBasePrice() {
		return formattedLowestBasePrice;
	}

	public void setFormattedLowestBasePrice(String formattedLowestBasePrice) {
		this.formattedLowestBasePrice = formattedLowestBasePrice;
	}

	public String getFormattedLowestPrice() {
		return formattedLowestPrice;
	}

	public void setFormattedLowestPrice(String formattedLowestPrice) {
		this.formattedLowestPrice = formattedLowestPrice;
	}

	public String getFormattedLowestRawBasePrice() {
		return formattedLowestRawBasePrice;
	}

	public void setFormattedLowestRawBasePrice(
			String formattedLowestRawBasePrice) {
		this.formattedLowestRawBasePrice = formattedLowestRawBasePrice;
	}

	public String getFormattedLowestRawPrice() {
		return formattedLowestRawPrice;
	}

	public void setFormattedLowestRawPrice(String formattedLowestRawPrice) {
		this.formattedLowestRawPrice = formattedLowestRawPrice;
	}

	public String getFormattedPrefixCurrency() {
		return formattedPrefixCurrency;
	}

	public void setFormattedPrefixCurrency(String formattedPrefixCurrency) {
		this.formattedPrefixCurrency = formattedPrefixCurrency;
	}

	public String getFormattedSuffixCurrency() {
		return formattedSuffixCurrency;
	}

	public void setFormattedSuffixCurrency(String formattedSuffixCurrency) {
		this.formattedSuffixCurrency = formattedSuffixCurrency;
	}

	public HotelPriceProtoHotelLoggingData getHotelLoggingData() {
		return hotelLoggingData;
	}

	public void setHotelLoggingData(
			HotelPriceProtoHotelLoggingData hotelLoggingData) {
		this.hotelLoggingData = hotelLoggingData;
	}

	public HotelPriceProtoHotelPartner getOwner() {
		return owner;
	}

	public void setOwner(HotelPriceProtoHotelPartner owner) {
		this.owner = owner;
	}

	public List getPartner() {
		return partner;
	}

	public void setPartner(List partner) {
		this.partner = partner;
	}

	public Boolean getTaxesInclusive() {
		return taxesInclusive;
	}

	public void setTaxesInclusive(Boolean taxesInclusive) {
		this.taxesInclusive = taxesInclusive;
	}
}
