package org.lhx.bean;

import java.util.Date;

public class Product {
    private Integer id;

    private String productName;

    private String productPicture;

    private Integer classificationNumber1Id;

    private Integer classificationNumber2Id;

    private Integer brandId;

    private Date creationTime;

    private String productDescription;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductPicture() {
        return productPicture;
    }

    public void setProductPicture(String productPicture) {
        this.productPicture = productPicture == null ? null : productPicture.trim();
    }

    public Integer getClassificationNumber1Id() {
        return classificationNumber1Id;
    }

    public void setClassificationNumber1Id(Integer classificationNumber1Id) {
        this.classificationNumber1Id = classificationNumber1Id;
    }

    public Integer getClassificationNumber2Id() {
        return classificationNumber2Id;
    }

    public void setClassificationNumber2Id(Integer classificationNumber2Id) {
        this.classificationNumber2Id = classificationNumber2Id;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription == null ? null : productDescription.trim();
    }
}