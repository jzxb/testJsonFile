package org.lhx.bean;

public class ClassOne {
    private Integer id;

    private String classificationNumber1;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassificationNumber1() {
        return classificationNumber1;
    }

    public void setClassificationNumber1(String classificationNumber1) {
        this.classificationNumber1 = classificationNumber1 == null ? null : classificationNumber1.trim();
    }
}