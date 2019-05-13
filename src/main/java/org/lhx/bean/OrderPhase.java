package org.lhx.bean;

public class OrderPhase {
    private Integer id;

    private Integer progressNumber;

    private String progressDescription;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProgressNumber() {
        return progressNumber;
    }

    public void setProgressNumber(Integer progressNumber) {
        this.progressNumber = progressNumber;
    }

    public String getProgressDescription() {
        return progressDescription;
    }

    public void setProgressDescription(String progressDescription) {
        this.progressDescription = progressDescription == null ? null : progressDescription.trim();
    }
}