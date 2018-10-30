package br.com.devfast.jsurveymonkey.response;

import java.util.Date;

import br.com.devfast.jsurveymonkey.commons.Response;
import br.com.devfast.jsurveymonkey.enums.StatusSurveyResponse;

public class GetPageResponse extends Response {

    private String id;
    private String title;
    private String description;
    private String href;
    private String position;

    public GetPageResponse(StatusSurveyResponse status, String message) {
        super(status, message);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
