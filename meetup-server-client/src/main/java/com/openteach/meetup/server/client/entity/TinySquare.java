package com.openteach.meetup.server.client.entity;


/**
 * 
 * @author sihai
 * 
 */
public class TinySquare extends BaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1734377281753712956L;
	
	protected String mAboutSquareId;
	protected String mAboutSquareName;
	protected String mImageUrl;
	protected boolean mIsInvitation;
	protected String mSquareName;
	protected String mSquareStreamId;
	protected String mSquareStreamName;
	
	public String getAboutSquareId() {
		return mAboutSquareId;
	}
	public void setmAboutSquareId(String aboutSquareId) {
		this.mAboutSquareId = aboutSquareId;
	}
	public String getAboutSquareName() {
		return mAboutSquareName;
	}
	public void setAboutSquareName(String aboutSquareName) {
		this.mAboutSquareName = aboutSquareName;
	}
	public String getImageUrl() {
		return mImageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.mImageUrl = imageUrl;
	}
	public boolean isInvitation() {
		return mIsInvitation;
	}
	public void setIsInvitation(boolean isInvitation) {
		this.mIsInvitation = isInvitation;
	}
	public String getSquareName() {
		return mSquareName;
	}
	public void setSquareName(String squareName) {
		this.mSquareName = squareName;
	}
	public String getSquareStreamId() {
		return mSquareStreamId;
	}
	public void setSquareStreamId(String squareStreamId) {
		this.mSquareStreamId = squareStreamId;
	}
	public String getSquareStreamName() {
		return mSquareStreamName;
	}
	public void setSquareStreamName(String squareStreamName) {
		this.mSquareStreamName = squareStreamName;
	}
}
