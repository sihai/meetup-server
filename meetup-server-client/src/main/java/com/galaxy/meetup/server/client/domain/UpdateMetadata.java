/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.client.domain;


/**
 * 
 * @author sihai
 *
 */
public class UpdateMetadata extends GenericJson {

	public String inlineNamespace;
	
    public String namespace;
    
    public NamespaceSpecificData namespaceSpecificData;
    
    public String type;

	public String getInlineNamespace() {
		return inlineNamespace;
	}

	public void setInlineNamespace(String inlineNamespace) {
		this.inlineNamespace = inlineNamespace;
	}

	public String getNamespace() {
		return namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	public NamespaceSpecificData getNamespaceSpecificData() {
		return namespaceSpecificData;
	}

	public void setNamespaceSpecificData(NamespaceSpecificData namespaceSpecificData) {
		this.namespaceSpecificData = namespaceSpecificData;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
