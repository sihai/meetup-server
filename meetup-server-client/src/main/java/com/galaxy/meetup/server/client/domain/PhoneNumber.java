/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain;

import java.math.BigInteger;

/**
 * 
 * @author sihai
 * 
 */
public class PhoneNumber extends GenericJson {

	public Integer countryCode;
	public String countryCodeSource;
	public String extension;
	public Boolean italianLeadingZero;
	public BigInteger nationalNumber;
	public String preferredDomesticCarrierCode;
	public String rawInput;

	public Integer getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(Integer countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryCodeSource() {
		return countryCodeSource;
	}

	public void setCountryCodeSource(String countryCodeSource) {
		this.countryCodeSource = countryCodeSource;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public Boolean getItalianLeadingZero() {
		return italianLeadingZero;
	}

	public void setItalianLeadingZero(Boolean italianLeadingZero) {
		this.italianLeadingZero = italianLeadingZero;
	}

	public BigInteger getNationalNumber() {
		return nationalNumber;
	}

	public void setNationalNumber(BigInteger nationalNumber) {
		this.nationalNumber = nationalNumber;
	}

	public String getPreferredDomesticCarrierCode() {
		return preferredDomesticCarrierCode;
	}

	public void setPreferredDomesticCarrierCode(
			String preferredDomesticCarrierCode) {
		this.preferredDomesticCarrierCode = preferredDomesticCarrierCode;
	}

	public String getRawInput() {
		return rawInput;
	}

	public void setRawInput(String rawInput) {
		this.rawInput = rawInput;
	}
}
