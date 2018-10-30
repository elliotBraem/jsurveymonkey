package br.com.devfast.jsurveymonkey.request;

import br.com.devfast.jsurveymonkey.commons.Request;

public class CreatePageRequest extends Request {

    public CreatePageRequest() {
        setDate(new Date());
    }

    private String title;
    private String description;
    private Integer position;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }
}
