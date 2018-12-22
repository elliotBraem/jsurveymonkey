import br.com.devfast.jsurveymonkey.enums.StatusSurveyResponse;
import br.com.devfast.jsurveymonkey.request.CreatePageRequest;
import br.com.devfast.jsurveymonkey.request.CreateSurveyRequest;
import br.com.devfast.jsurveymonkey.request.GetPageRequest;
import br.com.devfast.jsurveymonkey.response.CreatePageResponse;
import br.com.devfast.jsurveymonkey.response.CreateSurveyResponse;
import br.com.devfast.jsurveymonkey.response.GetPageResponse;
import br.com.devfast.jsurveymonkey.services.SurveyMonkeyService;
import org.junit.BeforeClass;
import org.junit.Test;
import utils.ConfigManager;

import static org.junit.Assert.assertEquals;

public class PageTest {

    private static final String API_AUTH_TOKEN;
    private static SurveyMonkeyService surveyMonkeyService;
    private static String surveyId;

    static {
        API_AUTH_TOKEN = ConfigManager.getProperty("API_AUTH_TOKEN");
    }

    @BeforeClass
    public static void beforeClassTests() {
        surveyMonkeyService = new SurveyMonkeyService(API_AUTH_TOKEN);
        CreateSurveyRequest createSurveyRequest = new CreateSurveyRequest();
        createSurveyRequest.setTitle("Test Survey - Page");
        createSurveyRequest.setNickname("Page Tests");
        createSurveyRequest.setAuthenticationToken(API_AUTH_TOKEN);
        CreateSurveyResponse createSurveyResponse = surveyMonkeyService.createSurvey(createSurveyRequest);
        surveyId = createSurveyResponse.getId();
    }

    @Test
    public void createPageTest() {
        CreatePageResponse createPageResponse = createPageHelper();
        assertEquals(StatusSurveyResponse.SUCCESS, createPageResponse.getResponseStatus());
    }

    @Test
    public void getPageTest() {
        CreatePageResponse createPageResponse = createPageHelper();
        assertEquals(StatusSurveyResponse.SUCCESS, createPageResponse.getResponseStatus());
        GetPageRequest getPageRequest = new GetPageRequest(surveyId);

        GetPageResponse getPageResponse = surveyMonkeyService.getPage(getPageRequest);
        assertEquals(StatusSurveyResponse.SUCCESS, getPageResponse.getResponseStatus());
    }

    private static CreatePageResponse createPageHelper() {
        CreatePageRequest createPageRequest = new CreatePageRequest();
        createPageRequest.setAuthenticationToken(API_AUTH_TOKEN);

        return surveyMonkeyService.createPage(createPageRequest, surveyId);
    }
}
