package com.example.skipq.model;

public class ScannedProduct {
    private Long productCode;
    private String productName;
    private double productPrice;
    private String productionDate;
    private String expiryDate;
    private String manufacturer;
    private String productionCountry;
    private Boolean promotion;

    public Long getProductCode() {
        return productCode;
    }

    public void setProductCode(Long productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public void setProductionCountry(String productionCountry) {
        this.productionCountry = productionCountry;
    }

    public Boolean getPromotion() {
        return promotion;
    }

    public void setPromotion(Boolean promotion) {
        this.promotion = promotion;
    }

    public ScannedProduct(Long productCode, String productName, double productPrice, String productionDate, String expiryDate, String manufacturer, String productionCountry, Boolean promotion) {
        this.productCode = productCode;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productionDate = productionDate;
        this.expiryDate = expiryDate;
        this.manufacturer = manufacturer;
        this.productionCountry = productionCountry;
        this.promotion = promotion;
    }

    public ScannedProduct() {
    }
}
