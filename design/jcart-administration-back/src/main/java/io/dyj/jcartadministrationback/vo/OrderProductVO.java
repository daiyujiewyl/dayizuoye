package io.dyj.jcartadministrationback.vo;

public class OrderProductVO {
    private Integer productId;
    private String productName;
    private String productCode;
    private Integer quantity;
    private Double unitPrice;
    private Double totalPrice;
    private Integer unitRewordPoints;
    private Integer totalRewordPoints;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getUnitRewordPoints() {
        return unitRewordPoints;
    }

    public void setUnitRewordPoints(Integer unitRewordPoints) {
        this.unitRewordPoints = unitRewordPoints;
    }

    public Integer getTotalRewordPoints() {
        return totalRewordPoints;
    }

    public void setTotalRewordPoints(Integer totalRewordPoints) {
        this.totalRewordPoints = totalRewordPoints;
    }
}
