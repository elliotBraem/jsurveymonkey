package br.com.devfast.jsurveymonkey.services;

import java.net.URI;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import br.com.devfast.jsurveymonkey.app.SurveyConfig;
import br.com.devfast.jsurveymonkey.builder.*;
import br.com.devfast.jsurveymonkey.commons.Service;
import br.com.devfast.jsurveymonkey.enums.StatusSurveyResponse;
import br.com.devfast.jsurveymonkey.request.*;
import br.com.devfast.jsurveymonkey.response.*;

public class SurveyMonkeyService extends Service {
	
	public static String SURVEY_SERVICE = "surveys";
	public static String COLLECTOR_SERVICE = "collectors";
	public static String MESSAGES_SERVICE = "messages";
	public static String RECIPIENT_SERVICE = "recipients";
	public static String PAGE_SERVICE = "pages";
	public static String QUESTION_SERVICE = "questions";

    /**
     * SurveyMonkeyService: Initializes a Survey Monkey Service
     * @param authenticationToken: bearer YOUR_ACCESS_TOKEN
     */
	public SurveyMonkeyService(String authenticationToken) {
		setAuthenticationToken(authenticationToken);
	}
	
	public SurveyMonkeyService() {}

    /**
     * createSurvey: HTTP POST to https://api.surveymonkey.com/v3/surveys
     * Creates a new empty survey
     * @param request: Request for new survey
     * @return Response for new survey
     */
	public CreateSurveyResponse createSurvey(CreateSurveyRequest request){
		try {
			
			CloseableHttpClient httpClient = HttpClients.createDefault();
			HttpPost httpPost = new HttpPost(new URI(SurveyConfig.ENDPOINT_V3 + SURVEY_SERVICE));
			
			setRequestAuthentication(httpPost, request.getAuthenticationToken());
			setRequestBody(httpPost, request.getJsonBody());
			
			CloseableHttpResponse response = httpClient.execute(httpPost);
			String result = EntityUtils.toString(response.getEntity());
			
	        setResponse(result);
	        return new CreateSurveyResponseBuilder(result).getResponse();
	        
		} catch (Exception e) {
			return new CreateSurveyResponse(StatusSurveyResponse.ERROR, e.getMessage());
		}
	}

    /**
     * getSurvey: HTTP GET to https://api.surveymonkey.com/v3/surveys/{id}
     * Returns a survey's details
     * @param request: Request for survey's details
     * @return Response for survey's details
     */
	public GetSurveyResponse getSurvey(GetSurveyRequest request){
		try {

			CloseableHttpClient httpClient = HttpClients.createDefault();
			HttpGet httpGet = new HttpGet(new URI(SurveyConfig.ENDPOINT_V3 + SURVEY_SERVICE
					+ "/" + request.getIdSurvey()));
			
			setRequestAuthentication(httpGet, request.getAuthenticationToken());
			
			CloseableHttpResponse response = httpClient.execute(httpGet);
			String result = EntityUtils.toString(response.getEntity());
			
	        setResponse(result);
	        
	        return new GetSurveyResponseBuilder(result).getResponse();
		} catch (Exception e) {
			return new GetSurveyResponse(StatusSurveyResponse.ERROR, e.getMessage());
		}
	}

	/**
	 * modifySurvey: HTTP PATCH to https://api.surveymonkey.com/v3/surveys/{id}
	 * Modifies a survey’s title, nickname or language.
	 * @param request: Request to modify survey
	 * @param surveyID: Id of survey to modify
	 * @return Response to modify survey
	 */
	public ModifySurveyResponse modifySurvey(ModifySurveyRequest request, String surveyID) {

		try {

			CloseableHttpClient httpClient = HttpClients.createDefault();
			HttpPatch httpPatch = new HttpPatch(new URI(SurveyConfig.ENDPOINT_V3 + SURVEY_SERVICE
					+ "/" + surveyID));
			setRequestAuthentication(httpPatch, request.getAuthenticationToken());
			setRequestBody(httpPatch, request.getJsonBody());

			CloseableHttpResponse response = httpClient.execute(httpPatch);
			String result = EntityUtils.toString(response.getEntity());

			setResponse(result);

			return new ModifySurveyResponseBuilder(result).getResponse();

		} catch (Exception e) {
			return new ModifySurveyResponse(StatusSurveyResponse.ERROR, e.getMessage());
		}

	}

	/**
	 * deleteSurvey: HTTP DELETE to https://api.surveymonkey.com/v3/surveys/{id}
	 * Deletes a survey.
	 * @param request: Request to delete survey
	 * @return Response to delete survey
	 */
	public GetSurveyResponse deleteSurvey(DeleteSurveyRequest request) {
		try {

			CloseableHttpClient httpClient = HttpClients.createDefault();
			HttpDelete httpDelete = new HttpDelete(new URI(SurveyConfig.ENDPOINT_V3 + SURVEY_SERVICE
					+ "/" + request.getIdSurvey()));
			setRequestAuthentication(httpDelete, request.getAuthenticationToken());

			CloseableHttpResponse response = httpClient.execute(httpDelete);
			String result = EntityUtils.toString(response.getEntity());

			setResponse(result);

			return new GetSurveyResponseBuilder(result).getResponse();
		} catch (Exception e) {
			return new GetSurveyResponse(StatusSurveyResponse.ERROR, e.getMessage());
		}
	}

    /**
     * createCollector: HTTP POST to https://api.surveymonkey.com/v3/surveys/{id}/collectors
     * Creates a weblink or email collector for a given survey.
     * @param request: Request for new collector
     * @return Response for new collector
     */
	public CreateCollectorResponse createCollector(CreateCollectorRequest request){
		
		try {
			
			CloseableHttpClient httpClient = HttpClients.createDefault();
			HttpPost httpPost = new HttpPost(new URI(SurveyConfig.ENDPOINT_V3 + SURVEY_SERVICE
					+ "/" + request.getPathSurveyId()
					+ "/" + COLLECTOR_SERVICE));
			
			setRequestAuthentication(httpPost, request.getAuthenticationToken());
			setRequestBody(httpPost, request.getJsonBody());
			
			CloseableHttpResponse response = httpClient.execute(httpPost);
			String result = EntityUtils.toString(response.getEntity());
			
	        setResponse(result);
	        return new CreateCollectorResponseBuilder(result).getResponse();
	        
		} catch (Exception e) {
			return new CreateCollectorResponse(StatusSurveyResponse.ERROR, e.getMessage());
		}
		
	}

    /**
     * createMessage: HTTP POST to https://api.surveymonkey.com/v3/collectors/{id}/messages
     * Creates a message.
     * @param request: Request for new message
     * @return Response for new message
     */
	public MessageResponse createMessage(CreateMessageRequest request){
		
		try {
			
			CloseableHttpClient httpClient = HttpClients.createDefault();
			HttpPost httpPost = new HttpPost(new URI(SurveyConfig.ENDPOINT_V3 + COLLECTOR_SERVICE
					+ "/" + request.getPathCollectorId()
					+ "/" + MESSAGES_SERVICE));
			
			setRequestAuthentication(httpPost, request.getAuthenticationToken());
			setRequestBody(httpPost, request.getJsonBody());
			
			CloseableHttpResponse response = httpClient.execute(httpPost);
			String result = EntityUtils.toString(response.getEntity());
			
	        setResponse(result);
	        return new MessageResponseBuilder(result).getResponse();
			
		} catch (Exception e) {
			return new MessageResponse(StatusSurveyResponse.ERROR, e.getMessage());
		}
		
	}

    /**
     * addRecipient: HTTP POST to https://api.surveymonkey.com/v3/collectors/{id}/messages/{id}/recipients
     * Creates a new recipient for the specified message.
     * @param request: Request for new recipient
     * @return Response for new recipient
     */
	public AddRecipientResponse addRecipient(AddRecipientRequest request){
		
		try {
			
			CloseableHttpClient httpClient = HttpClients.createDefault();
			HttpPost httpPost = new HttpPost(new URI(SurveyConfig.ENDPOINT_V3 + COLLECTOR_SERVICE
					+ "/" + request.getPathCollectorId()
					+ "/" + MESSAGES_SERVICE
					+ "/" + request.getPathMessageId()
					+ "/" + RECIPIENT_SERVICE));
			
			setRequestAuthentication(httpPost, request.getAuthenticationToken());
			setRequestBody(httpPost, request.getJsonBody());
			
			CloseableHttpResponse response = httpClient.execute(httpPost);
			String result = EntityUtils.toString(response.getEntity());
			
	        setResponse(result);
			
	        return new AddRecipientResponseBuilder(result).getResponse();
			
		} catch (Exception e) {
			return new AddRecipientResponse(StatusSurveyResponse.ERROR, e.getMessage());
		}
		
	}

    /**
     * sendMessage: HTTP POST to https://api.surveymonkey.com/v3/collectors/{id}/messages/{id}/send
     * Send or schedule to send an existing message to all message recipients.
     * @param request: Request to send message
     * @return Response to send message
     */
	public SendMessageResponse sendMessage(SendMessageRequest request){
		
		try {
			
			CloseableHttpClient httpClient = HttpClients.createDefault();
			HttpPost httpPost = new HttpPost(new URI(SurveyConfig.ENDPOINT_V3 + COLLECTOR_SERVICE
					+ "/" + request.getPathCollectorId()
					+ "/" + MESSAGES_SERVICE
					+ "/" + request.getPathMessageId()
					+ "/send"));
			
			setRequestAuthentication(httpPost, request.getAuthenticationToken());
			setRequestBody(httpPost, request.getJsonBody());
			
			CloseableHttpResponse response = httpClient.execute(httpPost);
			String result = EntityUtils.toString(response.getEntity());
			
	        setResponse(result);
	        
	        return new SendMessageResponseBuilder(result).getResponse();
			
		} catch (Exception e) {
			return new SendMessageResponse(StatusSurveyResponse.ERROR, e.getMessage());
		}
		
	}

    /**
     * getCollector: HTTP GET to https://api.surveymonkey.com/v3/collectors/{id}
     * Returns a collector
     * @param request: Request for collector
     * @return Response for collector
     */
	public GetCollectorResponse getCollector(GetCollectorRequest request) {
		
		try {
			
			CloseableHttpClient httpClient = HttpClients.createDefault();
			HttpGet httpGet = new HttpGet(new URI(SurveyConfig.ENDPOINT_V3 + COLLECTOR_SERVICE
					+ "/" + request.getIdCollector()));
			setRequestAuthentication(httpGet, request.getAuthenticationToken());
			
			CloseableHttpResponse response = httpClient.execute(httpGet);
			String result = EntityUtils.toString(response.getEntity());
			
	        setResponse(result);
	        return new GetCollectorResponseBuilder(result).getResponse();
	        
		} catch (Exception e) {
			return new GetCollectorResponse(StatusSurveyResponse.ERROR, e.getMessage());
		}
		
	}

    /**
     * createPage: HTTP POST to https://api.surveymonkey.com/v3/surveys/{id}/pages
     * Creates a new, empty page
     * @param request: Request for new page
	 * @param surveyID: Id of survey to add page to
     * @return Response for new page
     */
	public CreatePageResponse createPage(CreatePageRequest request, String surveyID) {
		try {

			CloseableHttpClient httpClient = HttpClients.createDefault();
			HttpPost httpPost = new HttpPost(new URI(SurveyConfig.ENDPOINT_V3 + SURVEY_SERVICE
					+ "/" + surveyID)
					+ "/" + PAGE_SERVICE);
			setRequestAuthentication(httpPost, request.getAuthenticationToken());
            setRequestBody(httpPost, request.getJsonBody());

			CloseableHttpResponse response = httpClient.execute(httpPost);
			String result = EntityUtils.toString(response.getEntity());

			setResponse(result);

			return new CreatePageResponseBuilder(result).getResponse();
		} catch (Exception e) {
			return new CreatePageResponse(StatusSurveyResponse.ERROR, e.getMessage());
		}
	}

    /**
     * getPage: HTTP GET to https://api.surveymonkey.com/v3/surveys/{id}/pages
     * Returns a page’s details.
     * @param request: Request for page's details
     * @return Response for page's details
     */
    public GetPageResponse getPage(GetPageRequest request) {
        try {

            CloseableHttpClient httpClient = HttpClients.createDefault();
            HttpGet httpGet = new HttpGet(new URI(SurveyConfig.ENDPOINT_V3 + SURVEY_SERVICE
                    + "/" + request.getIdSurvey())
                    + "/" + PAGE_SERVICE);

            setRequestAuthentication(httpGet, request.getAuthenticationToken());

            CloseableHttpResponse response = httpClient.execute(httpGet);
            String result = EntityUtils.toString(response.getEntity());

            setResponse(result);

            return new GetPageResponseBuilder(result).getResponse();
        } catch (Exception e) {
            return new GetPageResponse(StatusSurveyResponse.ERROR, e.getMessage());
        }
    }

	/**
	 * createQuestion: HTTP POST to https://api.surveymonkey.com/v3/surveys/{id}/pages/{id}/questions
	 * Creates a new question on a survey page
	 * @param request: Request for new question
	 * @return Response for new question
	 */
//	public CreateQuestionResponse createQuestion(CreateQuestionRequest request) {
//		try {
//
//			CloseableHttpClient httpClient = HttpClients.createDefault();
//			HttpPost httpPost = new HttpPost(new URI(SurveyConfig.ENDPOINT_V3 + SURVEY_SERVICE
//					+ "/" + request.getIdSurvey())
//					+ "/" + PAGE_SERVICE
//					+ "/" + request.getIdPage()
//					+ "/" + QUESTION_SERVICE);
//			setRequestAuthentication(httpPost, request.getAuthenticationToken());
//			setRequestBody(httpPost, request.getJsonBody());
//
//			CloseableHttpResponse response = httpClient.execute(httpPost);
//			String result = EntityUtils.toString(response.getEntity());
//
//			setResponse(result);
//
//			return new CreateQuestionResponseBuilder(result).getResponse();
//		} catch (Exception e) {
//			return new CreateQuestionResponse(StatusSurveyResponse.ERROR, e.getMessage());
//		}
//	}
}
