import br.com.devfast.jsurveymonkey.request.CreateSurveyRequest;
import br.com.devfast.jsurveymonkey.response.CreateSurveyResponse;
import br.com.devfast.jsurveymonkey.services.SurveyMonkeyService;
import org.junit.Test;
import utils.ConfigManager;

public class SurveyTest {

    private static final String API_AUTH_TOKEN;

    static {
        API_AUTH_TOKEN = ConfigManager.getProperty("api_auth_token");
    }

    @Test
    public void shouldCreateNewEmptySurvey() {
        SurveyMonkeyService surveyMonkeyService = new SurveyMonkeyService(API_AUTH_TOKEN);

        CreateSurveyRequest createSurveyRequest = new CreateSurveyRequest();
        createSurveyRequest.setTitle("Test Survey");
        createSurveyRequest.setNickname("Test Survey Nickname");

        CreateSurveyResponse createSurveyResponse = surveyMonkeyService.createSurvey(createSurveyRequest);
        System.out.println(createSurveyResponse.getResponseStatus());
    }
}
