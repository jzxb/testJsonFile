package org.lhx.bean;

public class ClassTwo {
    private Integer id;

    private String classificationNumber2;

    private Integer classificationNumber1Id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassificationNumber2() {
        return classificationNumber2;
    }

    public void setClassificationNumber2(String classificationNumber2) {
        this.classificationNumber2 = classificationNumber2 == null ? null : classificationNumber2.trim();
    }

    public Integer getClassificationNumber1Id() {
        return classificationNumber1Id;
    }

    public void setClassificationNumber1Id(Integer classificationNumber1Id) {
        this.classificationNumber1Id = classificationNumber1Id;
    }
}