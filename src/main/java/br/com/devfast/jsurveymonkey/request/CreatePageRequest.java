package br.com.devfast.jsurveymonkey.request;

import br.com.devfast.jsurveymonkey.commons.Request;

import java.util.Date;

public class CreatePageRequest extends Request {

    private String title;
    private String description;
    private int position;

    public CreatePageRequest() {
        setDate(new Date());
    }

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

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
