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
public class AddressRangeProto extends GenericJson {

	public List number;
	
    public List parameter;
    
    public Boolean parameterIsSynthesized;
    
    public String prefix;
    
    public Boolean sameParity;
    
    public String suffix;

	public List getNumber() {
		return number;
	}

	public void setNumber(List number) {
		this.number = number;
	}

	public List getParameter() {
		return parameter;
	}

	public void setParameter(List parameter) {
		this.parameter = parameter;
	}

	public Boolean getParameterIsSynthesized() {
		return parameterIsSynthesized;
	}

	public void setParameterIsSynthesized(Boolean parameterIsSynthesized) {
		this.parameterIsSynthesized = parameterIsSynthesized;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public Boolean getSameParity() {
		return sameParity;
	}

	public void setSameParity(Boolean sameParity) {
		this.sameParity = sameParity;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
}
