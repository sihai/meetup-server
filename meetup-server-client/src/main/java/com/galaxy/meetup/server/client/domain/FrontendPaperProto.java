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
public class FrontendPaperProto extends GenericJson {

	public PlacePageAddressProto address;
	public ListingAttributionProto attribution;
	public AuthorityPageProto authorityPage;
	public CategoryProto category;
	public FeaturedActivityProto circleActivity;
	public CityblockProto cityblock;
	public CoverPhotoProto coverPhoto;
	public CrossStreetsProto crossStreets;
	public FeaturedActivityProto deprecatedFeaturedActivity;
	public DetailsProto details;
	public EditStatusProto editStatus;
	public String ei;
	public FollowStatusProto followStatus;
	public GooglePlusSignupPromo googlePlusSignupPromo;
	public GoogleReviewsProto googleReviews;
	public HierarchiesChildrenProto hierarchiesChildren;
	public List hierarchiesParent;
	public HotelPriceProto hotelPrice;
	public AttributeProto hotelRatingStars;
	public Justifications justifications;
	public KnownForTermsProto knownForTerms;
	public LifecycleStoryProto lifecycle;
	public LiveMapsProto livemaps;
	public AttributesProto menuUrls;
	public NearbyTransitProto nearbyTransit;
	public OffersProto offers;
	public OpeningHoursProto openingHours;
	public OwnerUpdatesProto ownerUpdates;
	public Description ownersDescription;
	public PhoneProto phone;
	public PhotoVideoProto photoVideo;
	public PlaceInfo placeInfo;
	public AttributeProto price;
	public AttributeProto priceContinuous;
	public ProviderBlocksProto providerBlocks;
	public FeaturedActivityProto queriedActivity;
	public List relatedPlaces;
	public AttributesProto reservationUrls;
	public ReviewsHeadlineProto reviewsHeadline;
	public Description searchSnippet;
	public EditLinksProto sesameEditLinks;
	public StarredItemProto starredItem;
	public StaticMapProto staticMap;
	public StructuredAddressProto structuredAddress;
	public TitleProto title;
	public FeaturedActivityProto userActivity;
	public String ved;
	public ZagatAspectRatingsProto zagatAspectRatings;
	public Description zagatEditorialReview;

	public PlacePageAddressProto getAddress() {
		return address;
	}

	public void setAddress(PlacePageAddressProto address) {
		this.address = address;
	}

	public ListingAttributionProto getAttribution() {
		return attribution;
	}

	public void setAttribution(ListingAttributionProto attribution) {
		this.attribution = attribution;
	}

	public AuthorityPageProto getAuthorityPage() {
		return authorityPage;
	}

	public void setAuthorityPage(AuthorityPageProto authorityPage) {
		this.authorityPage = authorityPage;
	}

	public CategoryProto getCategory() {
		return category;
	}

	public void setCategory(CategoryProto category) {
		this.category = category;
	}

	public FeaturedActivityProto getCircleActivity() {
		return circleActivity;
	}

	public void setCircleActivity(FeaturedActivityProto circleActivity) {
		this.circleActivity = circleActivity;
	}

	public CityblockProto getCityblock() {
		return cityblock;
	}

	public void setCityblock(CityblockProto cityblock) {
		this.cityblock = cityblock;
	}

	public CoverPhotoProto getCoverPhoto() {
		return coverPhoto;
	}

	public void setCoverPhoto(CoverPhotoProto coverPhoto) {
		this.coverPhoto = coverPhoto;
	}

	public CrossStreetsProto getCrossStreets() {
		return crossStreets;
	}

	public void setCrossStreets(CrossStreetsProto crossStreets) {
		this.crossStreets = crossStreets;
	}

	public FeaturedActivityProto getDeprecatedFeaturedActivity() {
		return deprecatedFeaturedActivity;
	}

	public void setDeprecatedFeaturedActivity(
			FeaturedActivityProto deprecatedFeaturedActivity) {
		this.deprecatedFeaturedActivity = deprecatedFeaturedActivity;
	}

	public DetailsProto getDetails() {
		return details;
	}

	public void setDetails(DetailsProto details) {
		this.details = details;
	}

	public EditStatusProto getEditStatus() {
		return editStatus;
	}

	public void setEditStatus(EditStatusProto editStatus) {
		this.editStatus = editStatus;
	}

	public String getEi() {
		return ei;
	}

	public void setEi(String ei) {
		this.ei = ei;
	}

	public FollowStatusProto getFollowStatus() {
		return followStatus;
	}

	public void setFollowStatus(FollowStatusProto followStatus) {
		this.followStatus = followStatus;
	}

	public GooglePlusSignupPromo getGooglePlusSignupPromo() {
		return googlePlusSignupPromo;
	}

	public void setGooglePlusSignupPromo(
			GooglePlusSignupPromo googlePlusSignupPromo) {
		this.googlePlusSignupPromo = googlePlusSignupPromo;
	}

	public GoogleReviewsProto getGoogleReviews() {
		return googleReviews;
	}

	public void setGoogleReviews(GoogleReviewsProto googleReviews) {
		this.googleReviews = googleReviews;
	}

	public HierarchiesChildrenProto getHierarchiesChildren() {
		return hierarchiesChildren;
	}

	public void setHierarchiesChildren(
			HierarchiesChildrenProto hierarchiesChildren) {
		this.hierarchiesChildren = hierarchiesChildren;
	}

	public List getHierarchiesParent() {
		return hierarchiesParent;
	}

	public void setHierarchiesParent(List hierarchiesParent) {
		this.hierarchiesParent = hierarchiesParent;
	}

	public HotelPriceProto getHotelPrice() {
		return hotelPrice;
	}

	public void setHotelPrice(HotelPriceProto hotelPrice) {
		this.hotelPrice = hotelPrice;
	}

	public AttributeProto getHotelRatingStars() {
		return hotelRatingStars;
	}

	public void setHotelRatingStars(AttributeProto hotelRatingStars) {
		this.hotelRatingStars = hotelRatingStars;
	}

	public Justifications getJustifications() {
		return justifications;
	}

	public void setJustifications(Justifications justifications) {
		this.justifications = justifications;
	}

	public KnownForTermsProto getKnownForTerms() {
		return knownForTerms;
	}

	public void setKnownForTerms(KnownForTermsProto knownForTerms) {
		this.knownForTerms = knownForTerms;
	}

	public LifecycleStoryProto getLifecycle() {
		return lifecycle;
	}

	public void setLifecycle(LifecycleStoryProto lifecycle) {
		this.lifecycle = lifecycle;
	}

	public LiveMapsProto getLivemaps() {
		return livemaps;
	}

	public void setLivemaps(LiveMapsProto livemaps) {
		this.livemaps = livemaps;
	}

	public AttributesProto getMenuUrls() {
		return menuUrls;
	}

	public void setMenuUrls(AttributesProto menuUrls) {
		this.menuUrls = menuUrls;
	}

	public NearbyTransitProto getNearbyTransit() {
		return nearbyTransit;
	}

	public void setNearbyTransit(NearbyTransitProto nearbyTransit) {
		this.nearbyTransit = nearbyTransit;
	}

	public OffersProto getOffers() {
		return offers;
	}

	public void setOffers(OffersProto offers) {
		this.offers = offers;
	}

	public OpeningHoursProto getOpeningHours() {
		return openingHours;
	}

	public void setOpeningHours(OpeningHoursProto openingHours) {
		this.openingHours = openingHours;
	}

	public OwnerUpdatesProto getOwnerUpdates() {
		return ownerUpdates;
	}

	public void setOwnerUpdates(OwnerUpdatesProto ownerUpdates) {
		this.ownerUpdates = ownerUpdates;
	}

	public Description getOwnersDescription() {
		return ownersDescription;
	}

	public void setOwnersDescription(Description ownersDescription) {
		this.ownersDescription = ownersDescription;
	}

	public PhoneProto getPhone() {
		return phone;
	}

	public void setPhone(PhoneProto phone) {
		this.phone = phone;
	}

	public PhotoVideoProto getPhotoVideo() {
		return photoVideo;
	}

	public void setPhotoVideo(PhotoVideoProto photoVideo) {
		this.photoVideo = photoVideo;
	}

	public PlaceInfo getPlaceInfo() {
		return placeInfo;
	}

	public void setPlaceInfo(PlaceInfo placeInfo) {
		this.placeInfo = placeInfo;
	}

	public AttributeProto getPrice() {
		return price;
	}

	public void setPrice(AttributeProto price) {
		this.price = price;
	}

	public AttributeProto getPriceContinuous() {
		return priceContinuous;
	}

	public void setPriceContinuous(AttributeProto priceContinuous) {
		this.priceContinuous = priceContinuous;
	}

	public ProviderBlocksProto getProviderBlocks() {
		return providerBlocks;
	}

	public void setProviderBlocks(ProviderBlocksProto providerBlocks) {
		this.providerBlocks = providerBlocks;
	}

	public FeaturedActivityProto getQueriedActivity() {
		return queriedActivity;
	}

	public void setQueriedActivity(FeaturedActivityProto queriedActivity) {
		this.queriedActivity = queriedActivity;
	}

	public List getRelatedPlaces() {
		return relatedPlaces;
	}

	public void setRelatedPlaces(List relatedPlaces) {
		this.relatedPlaces = relatedPlaces;
	}

	public AttributesProto getReservationUrls() {
		return reservationUrls;
	}

	public void setReservationUrls(AttributesProto reservationUrls) {
		this.reservationUrls = reservationUrls;
	}

	public ReviewsHeadlineProto getReviewsHeadline() {
		return reviewsHeadline;
	}

	public void setReviewsHeadline(ReviewsHeadlineProto reviewsHeadline) {
		this.reviewsHeadline = reviewsHeadline;
	}

	public Description getSearchSnippet() {
		return searchSnippet;
	}

	public void setSearchSnippet(Description searchSnippet) {
		this.searchSnippet = searchSnippet;
	}

	public EditLinksProto getSesameEditLinks() {
		return sesameEditLinks;
	}

	public void setSesameEditLinks(EditLinksProto sesameEditLinks) {
		this.sesameEditLinks = sesameEditLinks;
	}

	public StarredItemProto getStarredItem() {
		return starredItem;
	}

	public void setStarredItem(StarredItemProto starredItem) {
		this.starredItem = starredItem;
	}

	public StaticMapProto getStaticMap() {
		return staticMap;
	}

	public void setStaticMap(StaticMapProto staticMap) {
		this.staticMap = staticMap;
	}

	public StructuredAddressProto getStructuredAddress() {
		return structuredAddress;
	}

	public void setStructuredAddress(StructuredAddressProto structuredAddress) {
		this.structuredAddress = structuredAddress;
	}

	public TitleProto getTitle() {
		return title;
	}

	public void setTitle(TitleProto title) {
		this.title = title;
	}

	public FeaturedActivityProto getUserActivity() {
		return userActivity;
	}

	public void setUserActivity(FeaturedActivityProto userActivity) {
		this.userActivity = userActivity;
	}

	public String getVed() {
		return ved;
	}

	public void setVed(String ved) {
		this.ved = ved;
	}

	public ZagatAspectRatingsProto getZagatAspectRatings() {
		return zagatAspectRatings;
	}

	public void setZagatAspectRatings(ZagatAspectRatingsProto zagatAspectRatings) {
		this.zagatAspectRatings = zagatAspectRatings;
	}

	public Description getZagatEditorialReview() {
		return zagatEditorialReview;
	}

	public void setZagatEditorialReview(Description zagatEditorialReview) {
		this.zagatEditorialReview = zagatEditorialReview;
	}
}
