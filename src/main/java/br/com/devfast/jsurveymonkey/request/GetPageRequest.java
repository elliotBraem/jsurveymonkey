package br.com.devfast.jsurveymonkey.request;

import java.util.Date;

import br.com.devfast.jsurveymonkey.commons.Request;

public class GetPageRequest extends Request {

    private int page;
    private int per_page;
    private String idSurvey;

    public GetPageRequest(String idSurvey) {
        this.idSurvey = idSurvey;
        setDate(new Date());
    }

    public GetPageRequest(String idSurvey, int page) {
        this.idSurvey = idSurvey;
        this.page = page;
        setDate(new Date());
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPer_page() {
        return per_page;
    }

    public void setPer_page(int per_page) {
        this.per_page = per_page;
    }

    public String getIdSurvey() {
        return idSurvey;
    }

    public void setIdSurvey(String idSurvey) {
        this.idSurvey = idSurvey;
    }
}
