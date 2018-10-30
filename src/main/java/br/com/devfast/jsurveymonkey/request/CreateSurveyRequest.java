package br.com.devfast.jsurveymonkey.request;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import br.com.devfast.jsurveymonkey.commons.Request;

public class CreateSurveyRequest extends Request {
	
	public CreateSurveyRequest() {
		setDate(new Date());
	}
	
	private String title;
	private String from_template_id;
	private String from_survey_id;
	private String nickname;
	private Map<String, String> custom_variables = new HashMap<String, String>();

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFrom_template_id() {
		return from_template_id;
	}

	public void setFrom_template_id(String from_template_id) {
		this.from_template_id = from_template_id;
	}

	public String getFrom_survey_id() {
		return from_survey_id;
	}

	public void setFrom_survey_id(String from_survey_id) {
		this.from_survey_id = from_survey_id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Map<String, String> getCustom_variables() {
		return custom_variables;
	}

	public void setCustom_variables(Map<String, String> custom_variables) {
		this.custom_variables = custom_variables;
	}

}
