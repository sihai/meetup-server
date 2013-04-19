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
public class EntitySummaryData extends GenericJson {

	public String summaryPlaintext;
	
    public String summarySanitizedHtml;

	public String getSummaryPlaintext() {
		return summaryPlaintext;
	}

	public void setSummaryPlaintext(String summaryPlaintext) {
		this.summaryPlaintext = summaryPlaintext;
	}

	public String getSummarySanitizedHtml() {
		return summarySanitizedHtml;
	}

	public void setSummarySanitizedHtml(String summarySanitizedHtml) {
		this.summarySanitizedHtml = summarySanitizedHtml;
	}
}
