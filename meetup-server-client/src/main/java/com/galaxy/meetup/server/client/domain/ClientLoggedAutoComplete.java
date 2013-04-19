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
public class ClientLoggedAutoComplete extends GenericJson {

	public String acceptedQuery;
	
    public String obfuscatedGaiaId;
    
    public String personalizationType;
    
    public String query;
    
    public String sourceNamespace;
    
    public String suggestedText;
    
    public String type;

	public String getAcceptedQuery() {
		return acceptedQuery;
	}

	public void setAcceptedQuery(String acceptedQuery) {
		this.acceptedQuery = acceptedQuery;
	}

	public String getObfuscatedGaiaId() {
		return obfuscatedGaiaId;
	}

	public void setObfuscatedGaiaId(String obfuscatedGaiaId) {
		this.obfuscatedGaiaId = obfuscatedGaiaId;
	}

	public String getPersonalizationType() {
		return personalizationType;
	}

	public void setPersonalizationType(String personalizationType) {
		this.personalizationType = personalizationType;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public String getSourceNamespace() {
		return sourceNamespace;
	}

	public void setSourceNamespace(String sourceNamespace) {
		this.sourceNamespace = sourceNamespace;
	}

	public String getSuggestedText() {
		return suggestedText;
	}

	public void setSuggestedText(String suggestedText) {
		this.suggestedText = suggestedText;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
