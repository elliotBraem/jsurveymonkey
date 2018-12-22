//package br.com.devfast.jsurveymonkey.request;
//
//import br.com.devfast.jsurveymonkey.commons.Request;
//import br.com.devfast.jsurveymonkey.entities.Heading;
//import br.com.devfast.jsurveymonkey.entities.Sorting;
//import br.com.devfast.jsurveymonkey.entities.Required;
//import br.com.devfast.jsurveymonkey.entities.Answers;
//
//import java.util.Date;
//import java.util.List;
//
//public class CreateQuestionRequest extends Request {
//
//    String idSurvey;
//    String idPage;
//    List<Heading> headings;
//    int position;
//    String family;
//    String subtype;
//    Sorting sorting;
//    Required required;
//    boolean forced_ranking;
////    Answers answers;
////    Display_Options display_options;
//
//    /**
//     * CreateQuestionRequest constructor to default page for the family:
//     * "open_ended_single"
//     * @param idSurvey: required
//     * @param headings: required
//     * @param family: required
//     * @param subtype: required
//     */
//    public CreateQuestionRequest(String idSurvey, List<Heading> headings, String family, String subtype) {
//        this.idSurvey = idSurvey;
//        this.idPage = "1";
//        this.headings = headings;
//        setDate(new Date());
//    }
//
//    /**
//     * CreateQuestionRequest constructor to specified page for the family:
//     * "open_ended_single"
//     * @param idSurvey: required
//     * @param idPage
//     * @param headings: required
//     * @param family: required
//     * @param subtype: required
//     */
//    public CreateQuestionRequest(String idSurvey, String idPage, List<Heading> headings, String family, String subtype) {
//        this.idSurvey = idSurvey;
//        this.idPage = idPage;
//        this.headings = headings;
//        setDate(new Date());
//    }
//
//    /**
//     * CreateQuestionRequest constructor to default page for the family:
//     * "upload", "slider", "image_choice", "emoji/star_rating"
//     * @param idSurvey: required
//     * @param headings: required
//     * @param family: required
//     * @param subtype: required
//     * @param display_options: required
//     */
//    public CreateQuestionRequest(String idSurvey, List<Heading> headings, String family, String subtype, Display_Options display_options) {
//        this.idSurvey = idSurvey;
//        this.idPage = 1;
//        this.headings = headings;
//        setDate(new Date());
//    }
//
//    /**
//     * CreateQuestionRequest constructor to specified page for the family:
//     "upload", "slider", "image_choice", "emoji/star_rating"
//     * @param idSurvey: required
//     * @param idPage
//     * @param headings: required
//     * @param family: required
//     * @param subtype: required
//     * @param display_options: required
//     */
//    public CreateQuestionRequest(String idSurvey, String idPage, List<Heading> headings, String family, String subtype, Display_Options display_options) {
//        this.idSurvey = idSurvey;
//        this.idPage = idPage;
//        this.headings = headings;
//        setDate(new Date());
//    }
//
//    /**
//     * CreateQuestionRequest constructor to default page for all other families
//     * @param idSurvey: required
//     * @param headings: required
//     * @param family: required
//     * @param subtype: required
//     * @param answers: required
//     */
//    public CreateQuestionRequest(String idSurvey, List<Heading> headings, String family, String subtype, Answers answers) {
//        this.idSurvey = idSurvey;
//        this.idPage = 1;
//        this.headings = headings;
//        this.answers = answers;
//        setDate(new Date());
//    }
//
//    /**
//     * CreateQuestionRequest constructor to specified page for all other families
//     * @param idSurvey: required
//     * @param idPage
//     * @param headings: required
//     * @param family: required
//     * @param subtype: required
//     * @param answers: required
//     */
//    public CreateQuestionRequest(String idSurvey, String idPage, List<Heading> headings, String family, String subtype, Answers answers) {
//        this.idSurvey = idSurvey;
//        this.idPage = idPage;
//        this.headings = headings;
//        this.answers = answers;
//        setDate(new Date());
//    }
//
//    public String getIdSurvey() {
//        return idSurvey;
//    }
//
//    public void setIdSurvey(String idSurvey) {
//        this.idSurvey = idSurvey;
//    }
//
//    public String getIdPage() {
//        return idPage;
//    }
//
//    public void setIdPage(String idPage) {
//        this.idPage = idPage;
//    }
//
//    public List<Heading> getHeadings() {
//        return headings;
//    }
//
//    public void setHeadings(List<Heading> headings) {
//        this.headings = headings;
//    }
//
//    public int getPosition() {
//        return position;
//    }
//
//    public void setPosition(int position) {
//        this.position = position;
//    }
//
//    public String getFamily() {
//        return family;
//    }
//
//    public void setFamily(String family) {
//        this.family = family;
//    }
//
//    public String getSubtype() {
//        return subtype;
//    }
//
//    public void setSubtype(String subtype) {
//        this.subtype = subtype;
//    }
//
//    public Sorting getSorting() {
//        return sorting;
//    }
//
//    public void setSorting(Sorting sorting) {
//        this.sorting = sorting;
//    }
//
//    public Required getRequired() {
//        return required;
//    }
//
//    public void setRequired(Required required) {
//        this.required = required;
//    }
//
//    public boolean isForced_ranking() {
//        return forced_ranking;
//    }
//
//    public void setForced_ranking(boolean forced_ranking) {
//        this.forced_ranking = forced_ranking;
//    }
//
//    public Answers getAnswers() {
//        return answers;
//    }
//
//    public void setAnswers(Answers answers) {
//        this.answers = answers;
//    }
//
//    public Display_Options getDisplay_options() {
//        return display_options;
//    }
//
//    public void setDisplay_options(Display_Options display_options) {
//        this.display_options = display_options;
//    }
//}
