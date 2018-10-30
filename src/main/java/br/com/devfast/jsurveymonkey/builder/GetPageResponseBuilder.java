package br.com.devfast.jsurveymonkey.builder;

import br.com.devfast.jsurveymonkey.commons.Builder;
import br.com.devfast.jsurveymonkey.enums.StatusSurveyResponse;
import br.com.devfast.jsurveymonkey.response.GetPageResponse;
import br.com.devfast.jsurveymonkey.util.GsonFactory;

public class GetPageResponseBuilder extends Builder<GetPageResponse> {

    private GetPageResponse response;

    public GetPageResponseBuilder(String result) {
        try {
            if(result != null){
                this.response = GsonFactory.create().fromJson(result, GetPageResponse.class);
                this.response.processStatusRequest();
            } else {
                this.response = new GetPageResponse(StatusSurveyResponse.ERROR, "empty response");
            }
        } catch (Exception e) {
            this.response = new GetPageResponse(StatusSurveyResponse.ERROR, e.getMessage());
        }
    }

    @Override
    public GetPageResponse getResponse() {
        return response;
    }

}
