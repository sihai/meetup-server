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
public class ClickTrackingCGI extends GenericJson {

    public Boolean doNotLogUrl;
    
    public Integer elementIndex;
    
    public Integer nonArchivalVeIndex;
    
    public Integer pageStart;
    
    public Integer resultGroupElementIndex;
    
    public Integer resultIndex;
    
    public Integer style;
    
    public Integer veIndex;
    
    public Integer veType;

	public Boolean getDoNotLogUrl() {
		return doNotLogUrl;
	}

	public void setDoNotLogUrl(Boolean doNotLogUrl) {
		this.doNotLogUrl = doNotLogUrl;
	}

	public Integer getElementIndex() {
		return elementIndex;
	}

	public void setElementIndex(Integer elementIndex) {
		this.elementIndex = elementIndex;
	}

	public Integer getNonArchivalVeIndex() {
		return nonArchivalVeIndex;
	}

	public void setNonArchivalVeIndex(Integer nonArchivalVeIndex) {
		this.nonArchivalVeIndex = nonArchivalVeIndex;
	}

	public Integer getPageStart() {
		return pageStart;
	}

	public void setPageStart(Integer pageStart) {
		this.pageStart = pageStart;
	}

	public Integer getResultGroupElementIndex() {
		return resultGroupElementIndex;
	}

	public void setResultGroupElementIndex(Integer resultGroupElementIndex) {
		this.resultGroupElementIndex = resultGroupElementIndex;
	}

	public Integer getResultIndex() {
		return resultIndex;
	}

	public void setResultIndex(Integer resultIndex) {
		this.resultIndex = resultIndex;
	}

	public Integer getStyle() {
		return style;
	}

	public void setStyle(Integer style) {
		this.style = style;
	}

	public Integer getVeIndex() {
		return veIndex;
	}

	public void setVeIndex(Integer veIndex) {
		this.veIndex = veIndex;
	}

	public Integer getVeType() {
		return veType;
	}

	public void setVeType(Integer veType) {
		this.veType = veType;
	}
}
