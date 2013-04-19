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
public class PackagingServiceClient extends GenericJson {

	public String androidPackageName;
	public String iosAppStoreId;
	public String iosBundleId;
	public String type;

	public String getAndroidPackageName() {
		return androidPackageName;
	}

	public void setAndroidPackageName(String androidPackageName) {
		this.androidPackageName = androidPackageName;
	}

	public String getIosAppStoreId() {
		return iosAppStoreId;
	}

	public void setIosAppStoreId(String iosAppStoreId) {
		this.iosAppStoreId = iosAppStoreId;
	}

	public String getIosBundleId() {
		return iosBundleId;
	}

	public void setIosBundleId(String iosBundleId) {
		this.iosBundleId = iosBundleId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
