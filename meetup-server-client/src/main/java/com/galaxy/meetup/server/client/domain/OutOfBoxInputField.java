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
public class OutOfBoxInputField extends GenericJson {

	public Boolean hasError;
	public String helpText;
	public String id;
	public String label;
	public Boolean mandatory;
	public String type;
	public OutOfBoxFieldValue value;
	public List<OutOfBoxFieldOption> valueOption;

	public Boolean getHasError() {
		return hasError;
	}

	public void setHasError(Boolean hasError) {
		this.hasError = hasError;
	}

	public String getHelpText() {
		return helpText;
	}

	public void setHelpText(String helpText) {
		this.helpText = helpText;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Boolean getMandatory() {
		return mandatory;
	}

	public void setMandatory(Boolean mandatory) {
		this.mandatory = mandatory;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public OutOfBoxFieldValue getValue() {
		return value;
	}

	public void setValue(OutOfBoxFieldValue value) {
		this.value = value;
	}

	public List<OutOfBoxFieldOption> getValueOption() {
		return valueOption;
	}

	public void setValueOption(List<OutOfBoxFieldOption> valueOption) {
		this.valueOption = valueOption;
	}
}
