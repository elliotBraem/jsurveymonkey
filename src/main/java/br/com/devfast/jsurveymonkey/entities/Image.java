package br.com.devfast.jsurveymonkey.entities;

public class Image {

    String url;

    /**
     * Constructor for image
     * @param url: required
     */
    public Image(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}