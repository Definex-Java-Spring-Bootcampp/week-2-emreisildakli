package com.patika.kredinbizdeservice.model;

import com.patika.kredinbizdeservice.enums.SectorType;

import java.time.LocalDate;
import java.util.Objects;

public class Campaign {

    private String title;
    private String content;
    private LocalDate dueDate;
    private LocalDate createDate;
    private LocalDate updateDate;
    private SectorType sector;

    public Campaign(String title, String content, LocalDate dueDate, LocalDate createDate, LocalDate updateDate, SectorType sector) {
        this.title = title;
        this.content = content;
        this.dueDate = dueDate;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.sector = sector;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }

    public SectorType getSector() {
        return sector;
    }

    public void setSector(SectorType sector) {
        this.sector = sector;
    }

    @Override
    public String toString() {
        return "Campaign{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", dueDate=" + dueDate +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", sector=" + sector +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Campaign campaign = (Campaign) o;
        return Objects.equals(title, campaign.title) && Objects.equals(content, campaign.content) && Objects.equals(dueDate, campaign.dueDate) && Objects.equals(createDate, campaign.createDate) && Objects.equals(updateDate, campaign.updateDate) && sector == campaign.sector;
    }
}
