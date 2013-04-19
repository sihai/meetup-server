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
public class CompositeStoryRequestProto extends GenericJson {

	public String boxName;
	
    public List candidateStory;
    
    public Integer numStories;

	public String getBoxName() {
		return boxName;
	}

	public void setBoxName(String boxName) {
		this.boxName = boxName;
	}

	public List getCandidateStory() {
		return candidateStory;
	}

	public void setCandidateStory(List candidateStory) {
		this.candidateStory = candidateStory;
	}

	public Integer getNumStories() {
		return numStories;
	}

	public void setNumStories(Integer numStories) {
		this.numStories = numStories;
	}
}
