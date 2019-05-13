package org.lhx.bean;

import java.util.Date;

public class Sku {
    private Integer id;

    private Integer productId;

    private Integer inventory;

    private Double price;

    private Date creationTime;

    private String skuName;

    private Integer skuSales;

    private String inventoryAddress;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName == null ? null : skuName.trim();
    }

    public Integer getSkuSales() {
        return skuSales;
    }

    public void setSkuSales(Integer skuSales) {
        this.skuSales = skuSales;
    }

    public String getInventoryAddress() {
        return inventoryAddress;
    }

    public void setInventoryAddress(String inventoryAddress) {
        this.inventoryAddress = inventoryAddress == null ? null : inventoryAddress.trim();
    }
}