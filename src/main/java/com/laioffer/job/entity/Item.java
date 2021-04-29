package com.laioffer.job.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Item {
    private String id;
    private String title;
    private String location;
    private String companyLogo;
    private String url;
    private String description;
    private Set<String> keywords;
    private boolean favorite;

    // for later map to Json
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    // change format to match the format of the response from github api
    @JsonProperty("company_logo")
    public String getCompanyLogo() {
        return companyLogo;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", location='" + location + '\'' +
                ", companyLogo='" + companyLogo + '\'' +
                ", url='" + url + '\'' +
                ", description='" + description + '\'' +
                ", keywords=" + keywords +
                ", favorite=" + favorite +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return getFavorite() == item.getFavorite() && Objects.equals(getId(), item.getId()) && Objects.equals(getTitle(), item.getTitle()) && Objects.equals(getLocation(), item.getLocation()) && Objects.equals(getCompanyLogo(), item.getCompanyLogo()) && Objects.equals(getUrl(), item.getUrl()) && Objects.equals(getDescription(), item.getDescription()) && Objects.equals(getKeywords(), item.getKeywords());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitle(), getLocation(), getCompanyLogo(), getUrl(), getDescription(), getKeywords(), getFavorite());
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("keywords")
    public Set<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(Set<String> keywords) {
        this.keywords = keywords;
    }
    public boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

}
