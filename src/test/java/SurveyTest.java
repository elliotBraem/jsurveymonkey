import br.com.devfast.jsurveymonkey.enums.StatusSurveyResponse;
import br.com.devfast.jsurveymonkey.request.CreateSurveyRequest;
import br.com.devfast.jsurveymonkey.response.CreateSurveyResponse;
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
    public void shouldCreateNewEmptySurvey() {

        CreateSurveyRequest createSurveyRequest = new CreateSurveyRequest();
        createSurveyRequest.setTitle("Test Survey");
        createSurveyRequest.setNickname("Test Survey Nickname");
        createSurveyRequest.setAuthenticationToken(API_AUTH_TOKEN);

        CreateSurveyResponse createSurveyResponse = surveyMonkeyService.createSurvey(createSurveyRequest);
        assertEquals(StatusSurveyResponse.SUCCESS, createSurveyResponse.getResponseStatus());

    }
}
