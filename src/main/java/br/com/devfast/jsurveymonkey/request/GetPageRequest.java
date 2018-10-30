package br.com.devfast.jsurveymonkey.request;

import java.util.Date;

import br.com.devfast.jsurveymonkey.commons.Request;

public class GetPageRequest extends Request {

    private int page;
    private int per_page;

    public GetSurveyRequest(int page) {
        this.page = page;
        setDate(new Date());
    }



}
