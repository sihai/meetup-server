/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.client.domain.request;

import java.util.List;

import com.galaxy.meetup.server.client.domain.ApiaryFields;
import com.galaxy.meetup.server.client.domain.EditSegments;
import com.galaxy.meetup.server.client.domain.EmbedClientItem;
import com.galaxy.meetup.server.client.domain.GadgetsData;
import com.galaxy.meetup.server.client.v2.request.Request;
import com.galaxy.meetup.server.client.domain.Location;
import com.galaxy.meetup.server.client.domain.PhotoServiceShareActionData;
import com.galaxy.meetup.server.client.domain.RequestsPostActivityRequestAttribution;
import com.galaxy.meetup.server.client.domain.SharingRoster;
import com.galaxy.meetup.server.client.domain.UpdateMetadata;


/**
 * 
 * @author sihai
 * 
 */
public class PostActivityRequest extends Request {

	public String aclJson;
	public String activityToReshare;
	public String albumId;
	public String albumOwnerId;
	public String albumTitle;
	public String apiMode;
	public RequestsPostActivityRequestAttribution attribution;
	public String botGuardResponse;
	public ApiaryFields commonFields;
	public String contentFormat;
	public Boolean disableComments;
	public Boolean disableReshares;
	public Boolean doNotDistribute;
	public List emailDeliveryIndicators;
	public EmbedClientItem embed;
	public Boolean enableTracing;
	public String externalId;
	public List externalSites;
	public GadgetsData gadgetsData;
	public String hostDomain;
	public Boolean isAlbumReshare;
	public Boolean isFullAlbumShare;
	public Location location;
	public String mediaJson;
	public Boolean movePhotos;
	public PhotoServiceShareActionData photosShareData;
	public String renderContextLocation;
	public String resharedUpdateId;
	public Boolean saveDefaultAcl;
	public Boolean saveSeenEmailConfirmationOob;
	public Boolean saveSeenFirstPostOob;
	public Boolean saveSeenUnderageExtendedSharingOob;
	public Boolean saveSeenUnderagePublicSharingOob;
	public Boolean saveSendImplicitInvites;
	public Boolean sendImplicitInvites;
	public SharingRoster sharingRoster;
	public Boolean shouldSyncAcl;
	public List squareStreams;
	public String streamSourceId;
	public UpdateMetadata updateMetadata;
	public EditSegments updateSegments;
	public String updateText;

	public String getAclJson() {
		return aclJson;
	}

	public void setAclJson(String aclJson) {
		this.aclJson = aclJson;
	}

	public String getActivityToReshare() {
		return activityToReshare;
	}

	public void setActivityToReshare(String activityToReshare) {
		this.activityToReshare = activityToReshare;
	}

	public String getAlbumId() {
		return albumId;
	}

	public void setAlbumId(String albumId) {
		this.albumId = albumId;
	}

	public String getAlbumOwnerId() {
		return albumOwnerId;
	}

	public void setAlbumOwnerId(String albumOwnerId) {
		this.albumOwnerId = albumOwnerId;
	}

	public String getAlbumTitle() {
		return albumTitle;
	}

	public void setAlbumTitle(String albumTitle) {
		this.albumTitle = albumTitle;
	}

	public String getApiMode() {
		return apiMode;
	}

	public void setApiMode(String apiMode) {
		this.apiMode = apiMode;
	}

	public RequestsPostActivityRequestAttribution getAttribution() {
		return attribution;
	}

	public void setAttribution(
			RequestsPostActivityRequestAttribution attribution) {
		this.attribution = attribution;
	}

	public String getBotGuardResponse() {
		return botGuardResponse;
	}

	public void setBotGuardResponse(String botGuardResponse) {
		this.botGuardResponse = botGuardResponse;
	}

	public ApiaryFields getCommonFields() {
		return commonFields;
	}

	public void setCommonFields(ApiaryFields commonFields) {
		this.commonFields = commonFields;
	}

	public String getContentFormat() {
		return contentFormat;
	}

	public void setContentFormat(String contentFormat) {
		this.contentFormat = contentFormat;
	}

	public Boolean getDisableComments() {
		return disableComments;
	}

	public void setDisableComments(Boolean disableComments) {
		this.disableComments = disableComments;
	}

	public Boolean getDisableReshares() {
		return disableReshares;
	}

	public void setDisableReshares(Boolean disableReshares) {
		this.disableReshares = disableReshares;
	}

	public Boolean getDoNotDistribute() {
		return doNotDistribute;
	}

	public void setDoNotDistribute(Boolean doNotDistribute) {
		this.doNotDistribute = doNotDistribute;
	}

	public List getEmailDeliveryIndicators() {
		return emailDeliveryIndicators;
	}

	public void setEmailDeliveryIndicators(List emailDeliveryIndicators) {
		this.emailDeliveryIndicators = emailDeliveryIndicators;
	}

	public EmbedClientItem getEmbed() {
		return embed;
	}

	public void setEmbed(EmbedClientItem embed) {
		this.embed = embed;
	}

	public Boolean getEnableTracing() {
		return enableTracing;
	}

	public void setEnableTracing(Boolean enableTracing) {
		this.enableTracing = enableTracing;
	}

	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public List getExternalSites() {
		return externalSites;
	}

	public void setExternalSites(List externalSites) {
		this.externalSites = externalSites;
	}

	public GadgetsData getGadgetsData() {
		return gadgetsData;
	}

	public void setGadgetsData(GadgetsData gadgetsData) {
		this.gadgetsData = gadgetsData;
	}

	public String getHostDomain() {
		return hostDomain;
	}

	public void setHostDomain(String hostDomain) {
		this.hostDomain = hostDomain;
	}

	public Boolean getIsAlbumReshare() {
		return isAlbumReshare;
	}

	public void setIsAlbumReshare(Boolean isAlbumReshare) {
		this.isAlbumReshare = isAlbumReshare;
	}

	public Boolean getIsFullAlbumShare() {
		return isFullAlbumShare;
	}

	public void setIsFullAlbumShare(Boolean isFullAlbumShare) {
		this.isFullAlbumShare = isFullAlbumShare;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getMediaJson() {
		return mediaJson;
	}

	public void setMediaJson(String mediaJson) {
		this.mediaJson = mediaJson;
	}

	public Boolean getMovePhotos() {
		return movePhotos;
	}

	public void setMovePhotos(Boolean movePhotos) {
		this.movePhotos = movePhotos;
	}

	public PhotoServiceShareActionData getPhotosShareData() {
		return photosShareData;
	}

	public void setPhotosShareData(PhotoServiceShareActionData photosShareData) {
		this.photosShareData = photosShareData;
	}

	public String getRenderContextLocation() {
		return renderContextLocation;
	}

	public void setRenderContextLocation(String renderContextLocation) {
		this.renderContextLocation = renderContextLocation;
	}

	public String getResharedUpdateId() {
		return resharedUpdateId;
	}

	public void setResharedUpdateId(String resharedUpdateId) {
		this.resharedUpdateId = resharedUpdateId;
	}

	public Boolean getSaveDefaultAcl() {
		return saveDefaultAcl;
	}

	public void setSaveDefaultAcl(Boolean saveDefaultAcl) {
		this.saveDefaultAcl = saveDefaultAcl;
	}

	public Boolean getSaveSeenEmailConfirmationOob() {
		return saveSeenEmailConfirmationOob;
	}

	public void setSaveSeenEmailConfirmationOob(
			Boolean saveSeenEmailConfirmationOob) {
		this.saveSeenEmailConfirmationOob = saveSeenEmailConfirmationOob;
	}

	public Boolean getSaveSeenFirstPostOob() {
		return saveSeenFirstPostOob;
	}

	public void setSaveSeenFirstPostOob(Boolean saveSeenFirstPostOob) {
		this.saveSeenFirstPostOob = saveSeenFirstPostOob;
	}

	public Boolean getSaveSeenUnderageExtendedSharingOob() {
		return saveSeenUnderageExtendedSharingOob;
	}

	public void setSaveSeenUnderageExtendedSharingOob(
			Boolean saveSeenUnderageExtendedSharingOob) {
		this.saveSeenUnderageExtendedSharingOob = saveSeenUnderageExtendedSharingOob;
	}

	public Boolean getSaveSeenUnderagePublicSharingOob() {
		return saveSeenUnderagePublicSharingOob;
	}

	public void setSaveSeenUnderagePublicSharingOob(
			Boolean saveSeenUnderagePublicSharingOob) {
		this.saveSeenUnderagePublicSharingOob = saveSeenUnderagePublicSharingOob;
	}

	public Boolean getSaveSendImplicitInvites() {
		return saveSendImplicitInvites;
	}

	public void setSaveSendImplicitInvites(Boolean saveSendImplicitInvites) {
		this.saveSendImplicitInvites = saveSendImplicitInvites;
	}

	public Boolean getSendImplicitInvites() {
		return sendImplicitInvites;
	}

	public void setSendImplicitInvites(Boolean sendImplicitInvites) {
		this.sendImplicitInvites = sendImplicitInvites;
	}

	public SharingRoster getSharingRoster() {
		return sharingRoster;
	}

	public void setSharingRoster(SharingRoster sharingRoster) {
		this.sharingRoster = sharingRoster;
	}

	public Boolean getShouldSyncAcl() {
		return shouldSyncAcl;
	}

	public void setShouldSyncAcl(Boolean shouldSyncAcl) {
		this.shouldSyncAcl = shouldSyncAcl;
	}

	public List getSquareStreams() {
		return squareStreams;
	}

	public void setSquareStreams(List squareStreams) {
		this.squareStreams = squareStreams;
	}

	public String getStreamSourceId() {
		return streamSourceId;
	}

	public void setStreamSourceId(String streamSourceId) {
		this.streamSourceId = streamSourceId;
	}

	public UpdateMetadata getUpdateMetadata() {
		return updateMetadata;
	}

	public void setUpdateMetadata(UpdateMetadata updateMetadata) {
		this.updateMetadata = updateMetadata;
	}

	public EditSegments getUpdateSegments() {
		return updateSegments;
	}

	public void setUpdateSegments(EditSegments updateSegments) {
		this.updateSegments = updateSegments;
	}

	public String getUpdateText() {
		return updateText;
	}

	public void setUpdateText(String updateText) {
		this.updateText = updateText;
	}
}
