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
public class FinancialQuote extends GenericJson {

	public String dataSource;
	public String dataSourceDisclaimerUrl;
	public String description;
	public String exchange;
	public String exchangeTimezone;
	public String imageUrl;
	public String localizedQuoteTimestamp;
	public String name;
	public String price;
	public String priceChange;
	public Float priceChangeNumber;
	public String priceChangePercent;
	public String priceCurrency;
	public String quoteTime;
	public String tickerSymbol;
	public String url;

	public String getDataSource() {
		return dataSource;
	}

	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	public String getDataSourceDisclaimerUrl() {
		return dataSourceDisclaimerUrl;
	}

	public void setDataSourceDisclaimerUrl(String dataSourceDisclaimerUrl) {
		this.dataSourceDisclaimerUrl = dataSourceDisclaimerUrl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getExchange() {
		return exchange;
	}

	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	public String getExchangeTimezone() {
		return exchangeTimezone;
	}

	public void setExchangeTimezone(String exchangeTimezone) {
		this.exchangeTimezone = exchangeTimezone;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getLocalizedQuoteTimestamp() {
		return localizedQuoteTimestamp;
	}

	public void setLocalizedQuoteTimestamp(String localizedQuoteTimestamp) {
		this.localizedQuoteTimestamp = localizedQuoteTimestamp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPriceChange() {
		return priceChange;
	}

	public void setPriceChange(String priceChange) {
		this.priceChange = priceChange;
	}

	public Float getPriceChangeNumber() {
		return priceChangeNumber;
	}

	public void setPriceChangeNumber(Float priceChangeNumber) {
		this.priceChangeNumber = priceChangeNumber;
	}

	public String getPriceChangePercent() {
		return priceChangePercent;
	}

	public void setPriceChangePercent(String priceChangePercent) {
		this.priceChangePercent = priceChangePercent;
	}

	public String getPriceCurrency() {
		return priceCurrency;
	}

	public void setPriceCurrency(String priceCurrency) {
		this.priceCurrency = priceCurrency;
	}

	public String getQuoteTime() {
		return quoteTime;
	}

	public void setQuoteTime(String quoteTime) {
		this.quoteTime = quoteTime;
	}

	public String getTickerSymbol() {
		return tickerSymbol;
	}

	public void setTickerSymbol(String tickerSymbol) {
		this.tickerSymbol = tickerSymbol;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
