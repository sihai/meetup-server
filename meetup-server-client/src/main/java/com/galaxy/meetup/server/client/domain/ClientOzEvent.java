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
public class ClientOzEvent extends GenericJson {

	public ClientActionData actionData;
	
    public Long clientTimeMsec;
    
    public ClientOutputData endViewData;
    
    public OzEvent ozEvent;
    
    public ClientOutputData startViewData;
    
    public ClientViewerInfo viewerInfo;

	public ClientActionData getActionData() {
		return actionData;
	}

	public void setActionData(ClientActionData actionData) {
		this.actionData = actionData;
	}

	public Long getClientTimeMsec() {
		return clientTimeMsec;
	}

	public void setClientTimeMsec(Long clientTimeMsec) {
		this.clientTimeMsec = clientTimeMsec;
	}

	public ClientOutputData getEndViewData() {
		return endViewData;
	}

	public void setEndViewData(ClientOutputData endViewData) {
		this.endViewData = endViewData;
	}

	public OzEvent getOzEvent() {
		return ozEvent;
	}

	public void setOzEvent(OzEvent ozEvent) {
		this.ozEvent = ozEvent;
	}

	public ClientOutputData getStartViewData() {
		return startViewData;
	}

	public void setStartViewData(ClientOutputData startViewData) {
		this.startViewData = startViewData;
	}

	public ClientViewerInfo getViewerInfo() {
		return viewerInfo;
	}

	public void setViewerInfo(ClientViewerInfo viewerInfo) {
		this.viewerInfo = viewerInfo;
	}
}
