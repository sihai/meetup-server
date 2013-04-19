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
public class EntitySquaresDataSquareNameChange extends GenericJson {

	public String moderatorOid;
	
    public String newSquareName;
    
    public String oldSquareName;
    
    public String squareOid;

	public String getModeratorOid() {
		return moderatorOid;
	}

	public void setModeratorOid(String moderatorOid) {
		this.moderatorOid = moderatorOid;
	}

	public String getNewSquareName() {
		return newSquareName;
	}

	public void setNewSquareName(String newSquareName) {
		this.newSquareName = newSquareName;
	}

	public String getOldSquareName() {
		return oldSquareName;
	}

	public void setOldSquareName(String oldSquareName) {
		this.oldSquareName = oldSquareName;
	}

	public String getSquareOid() {
		return squareOid;
	}

	public void setSquareOid(String squareOid) {
		this.squareOid = squareOid;
	}
}
