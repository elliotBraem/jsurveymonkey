import br.com.devfast.jsurveymonkey.enums.StatusSurveyResponse;
import br.com.devfast.jsurveymonkey.request.CreateSurveyRequest;
import br.com.devfast.jsurveymonkey.request.DeleteSurveyRequest;
import br.com.devfast.jsurveymonkey.request.GetSurveyRequest;
import br.com.devfast.jsurveymonkey.request.ModifySurveyRequest;
import br.com.devfast.jsurveymonkey.response.CreateSurveyResponse;
import br.com.devfast.jsurveymonkey.response.GetSurveyResponse;
import br.com.devfast.jsurveymonkey.response.ModifySurveyResponse;
import br.com.devfast.jsurveymonkey.services.SurveyMonkeyService;
import org.junit.BeforeClass;
import org.junit.Test;
import utils.ConfigManager;

import static org.junit.Assert.assertEquals;

public class SurveyTest {

    private static final String API_AUTH_TOKEN;
    private static SurveyMonkeyService surveyMonkeyService;

    static {
        API_AUTH_TOKEN = ConfigManager.getProperty("API_AUTH_TOKEN");
    }

    @BeforeClass
    public static void beforeClassTests() {
        surveyMonkeyService = new SurveyMonkeyService(API_AUTH_TOKEN);
    }

    @Test
    public void createSurveyTest() {
        CreateSurveyResponse createSurveyResponse = createSurveyHelper();
        assertEquals(StatusSurveyResponse.SUCCESS, createSurveyResponse.getResponseStatus());
    }

    @Test
    public void getSurveyTest() {
        CreateSurveyResponse createSurveyResponse = createSurveyHelper();
        assertEquals(StatusSurveyResponse.SUCCESS, createSurveyResponse.getResponseStatus());
        GetSurveyRequest getSurveyRequest = new GetSurveyRequest(createSurveyResponse.getId());
        GetSurveyResponse getSurveyResponse = surveyMonkeyService.getSurvey(getSurveyRequest);

        assertEquals(StatusSurveyResponse.SUCCESS, getSurveyResponse.getResponseStatus());
    }

    @Test
    public void deleteSurveyTest() {
        CreateSurveyResponse createSurveyResponse = createSurveyHelper();
        assertEquals(StatusSurveyResponse.SUCCESS, createSurveyResponse.getResponseStatus());
        DeleteSurveyRequest deleteSurveyRequest = new DeleteSurveyRequest(createSurveyResponse.getId());
        GetSurveyResponse deleteSurveyResponse = surveyMonkeyService.deleteSurvey(deleteSurveyRequest);

        assertEquals(StatusSurveyResponse.SUCCESS, deleteSurveyResponse.getResponseStatus());

    }

    @Test
    public void modifySurveyTest() {
        CreateSurveyResponse createSurveyResponse = createSurveyHelper();
        assertEquals(StatusSurveyResponse.SUCCESS, createSurveyResponse.getResponseStatus());

        ModifySurveyRequest modifySurveyRequest = new ModifySurveyRequest();
        modifySurveyRequest.setTitle("Modified");
        ModifySurveyResponse modifySurveyResponse = surveyMonkeyService.modifySurvey(modifySurveyRequest, createSurveyResponse.getId());

        assertEquals(StatusSurveyResponse.SUCCESS, modifySurveyResponse.getResponseStatus());

        GetSurveyRequest getSurveyRequest = new GetSurveyRequest(createSurveyResponse.getId());
        GetSurveyResponse getSurveyResponse = surveyMonkeyService.getSurvey(getSurveyRequest);

        assertEquals("Modified", getSurveyResponse.getTitle());
    }

    private static CreateSurveyResponse createSurveyHelper() {
        CreateSurveyRequest createSurveyRequest = new CreateSurveyRequest();
        createSurveyRequest.setAuthenticationToken(API_AUTH_TOKEN);

        return surveyMonkeyService.createSurvey(createSurveyRequest);
    }
}
