package br.com.devfast.jsurveymonkey.response;

import br.com.devfast.jsurveymonkey.commons.Response;
import br.com.devfast.jsurveymonkey.entities.Heading;
import br.com.devfast.jsurveymonkey.entities.Sorting;
import br.com.devfast.jsurveymonkey.entities.Required;

public class CreateQuestionResponse extends Response {

    List<Heading> headings;
    int position;
    boolean visible;
    String family;
    String subtype;
    Sorting sorting;
    Required required;
    boolean forced_ranking;
    String idQuestion;

    public CreateQuestionResponse(StatusSurveyResponse status, String message) {
        super(status, message);
    }

    public List<Heading> getHeadings() {
        return headings;
    }

    public void setHeadings(List<Heading> headings) {
        this.headings = headings;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public Sorting getSorting() {
        return sorting;
    }

    public void setSorting(Sorting sorting) {
        this.sorting = sorting;
    }

    public Required getRequired() {
        return required;
    }

    public void setRequired(Required required) {
        this.required = required;
    }

    public boolean isForced_ranking() {
        return forced_ranking;
    }

    public void setForced_ranking(boolean forced_ranking) {
        this.forced_ranking = forced_ranking;
    }

    public String getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(String idQuestion) {
        this.idQuestion = idQuestion;
    }
}
