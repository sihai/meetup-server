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
public class CommentGroup extends GenericJson {

	public List commentsAuthor;
	
    public Long maxTimestampUsec;
    
    public Long minTimestampUsec;
    
    public Integer numComments;

	public List getCommentsAuthor() {
		return commentsAuthor;
	}

	public void setCommentsAuthor(List commentsAuthor) {
		this.commentsAuthor = commentsAuthor;
	}

	public Long getMaxTimestampUsec() {
		return maxTimestampUsec;
	}

	public void setMaxTimestampUsec(Long maxTimestampUsec) {
		this.maxTimestampUsec = maxTimestampUsec;
	}

	public Long getMinTimestampUsec() {
		return minTimestampUsec;
	}

	public void setMinTimestampUsec(Long minTimestampUsec) {
		this.minTimestampUsec = minTimestampUsec;
	}

	public Integer getNumComments() {
		return numComments;
	}

	public void setNumComments(Integer numComments) {
		this.numComments = numComments;
	}
}
