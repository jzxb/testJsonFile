package org.lhx.bean;

public class Attrbute {
    private Integer id;

    private String attrName;

    private String isEnable;

    private Integer classificationNumber2Id;

    private String creationTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName == null ? null : attrName.trim();
    }

    public String getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(String isEnable) {
        this.isEnable = isEnable == null ? null : isEnable.trim();
    }

    public Integer getClassificationNumber2Id() {
        return classificationNumber2Id;
    }

    public void setClassificationNumber2Id(Integer classificationNumber2Id) {
        this.classificationNumber2Id = classificationNumber2Id;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime == null ? null : creationTime.trim();
    }
}