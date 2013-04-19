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
public class DataImportedPerson extends GenericJson {

	public List importInfo;
	
    public DataImportInfo info;
    
    public DataCirclePerson member;

	public List getImportInfo() {
		return importInfo;
	}

	public void setImportInfo(List importInfo) {
		this.importInfo = importInfo;
	}

	public DataImportInfo getInfo() {
		return info;
	}

	public void setInfo(DataImportInfo info) {
		this.info = info;
	}

	public DataCirclePerson getMember() {
		return member;
	}

	public void setMember(DataCirclePerson member) {
		this.member = member;
	}
}
