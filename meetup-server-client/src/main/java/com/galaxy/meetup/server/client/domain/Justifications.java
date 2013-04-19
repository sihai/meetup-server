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
public class Justifications extends GenericJson {

	public LinkFragment collapseLink;
	public JustificationList negativeJustifications;
	public JustificationList positiveJustifications;
	public LinkFragment ratePlacesLink;
	public Justification summaryJustification;

	public LinkFragment getCollapseLink() {
		return collapseLink;
	}

	public void setCollapseLink(LinkFragment collapseLink) {
		this.collapseLink = collapseLink;
	}

	public JustificationList getNegativeJustifications() {
		return negativeJustifications;
	}

	public void setNegativeJustifications(
			JustificationList negativeJustifications) {
		this.negativeJustifications = negativeJustifications;
	}

	public JustificationList getPositiveJustifications() {
		return positiveJustifications;
	}

	public void setPositiveJustifications(
			JustificationList positiveJustifications) {
		this.positiveJustifications = positiveJustifications;
	}

	public LinkFragment getRatePlacesLink() {
		return ratePlacesLink;
	}

	public void setRatePlacesLink(LinkFragment ratePlacesLink) {
		this.ratePlacesLink = ratePlacesLink;
	}

	public Justification getSummaryJustification() {
		return summaryJustification;
	}

	public void setSummaryJustification(Justification summaryJustification) {
		this.summaryJustification = summaryJustification;
	}
}
