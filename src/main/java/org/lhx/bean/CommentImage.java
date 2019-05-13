package org.lhx.bean;

import java.util.Date;

public class CommentImage {
    private Integer id;

    private Integer ommentId;

    private String url;

    private Date creationTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOmmentId() {
        return ommentId;
    }

    public void setOmmentId(Integer ommentId) {
        this.ommentId = ommentId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }
}