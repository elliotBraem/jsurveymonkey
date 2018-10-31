package br.com.devfast.jsurveymonkey.entities;

public class Answers {

    List<Choices> choices;
    List<Other> other;
    Display_Options display_options;
    List<Rows> rows;
    List<Cols> cols;

    /**
     * Answers constructor for family:
     * "single_choice", "mulitple_choice"
     * @param choices: required
     */
    public Answers(List<Choices> choices) {
        this.choices = choices;
    }

    /**
     * Answers constructor for family:
     * "matrix_ranking", "open_ended_multi"
     * "open_ended_numerical", "demographic",
     * "datetime"
     * @param choices: required
     * @param rows: required
     */
    public Answers(List<Rows> rows) {
        this.rows = rows;
    }

    /**
     * Answers constructor for family:
     * "file_upload"
     * @param display_options: required
     */
    public Answers(Display_Options display_options) {
        this.display_options = display_options;
    }

    /**
     * Answers constructor for family:
     * "image_choice"
     * @param choices: required
     * @param display_options: required
     */
    public Answers(List<Choices> choices, Display_Options display_options) {
        this.choices = choices;
        this.display_options = display_options;
    }

    /**
     * Answers constructor for family:
     * "matrix_single", "matrix_rating"
     * @param choices: required
     * @param rows: required
     */
    public Answers(List<Choices> choices, List<Rows> rows) {
        this.choices = choices;
        this.rows = rows;
    }

    /**
     * Answers constructor for family:
     * "matrix_menu"
     * @param cols: required
     * @param rows: required
     */
    public Answers(List<Cols> cols, List<Rows> rows) {
        this.cols = cols;
        this.rows = rows;
    }

    public List<Choices> getChoices() {
        return choices;
    }

    public void setChoices(List<Choices> choices) {
        this.choices = choices;
    }

    public List<Other> getOther() {
        return other;
    }

    public void setOther(List<Other> other) {
        this.other = other;
    }

    public br.com.devfast.jsurveymonkey.entities.Answers.Display_Options getDisplay_options() {
        return display_options;
    }

    public void setDisplay_options(br.com.devfast.jsurveymonkey.entities.Answers.Display_Options display_options) {
        this.display_options = display_options;
    }

    public List<Rows> getRows() {
        return rows;
    }

    public void setRows(List<Rows> rows) {
        this.rows = rows;
    }

    public List<Cols> getCols() {
        return cols;
    }

    public void setCols(List<Cols> cols) {
        this.cols = cols;
    }


    /**
     * Choices: available choices for the user
     */
    class Choices {

        String text;
        int position;
        int weight;

        /**
         * Choices constructor for family:
         * "single_choice", "multiple_choice",
         * "matrix_single"
         * @param text: required
         */
        public Choices(String text) {
            this.text = text;
        }

        /**
         * Choices constructor for family:
         * "matrix_menu"
         * @param text: required
         * @param position: required
         */
        public Choices(String text, int position) {
            this.text = text;
            this.position = position;
        }

        /**
         * Choices constructor for family:
         * "matrix_rating"
         * @param text: required
         * @param weight: required
         */
        public Choices(String text, int weight) {
            this.text = text;
            this.weight = weight;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }
    }

    /**
     * Other answer options
     */
    class Other {

        String text;
        int num_chars;
        int num_lines;
        Image image;

        /**
         * Other constructor for all families
         */
        public Other() { }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public int getNum_chars() {
            return num_chars;
        }

        public void setNum_chars(int num_chars) {
            this.num_chars = num_chars;
        }

        public int getNum_lines() {
            return num_lines;
        }

        public void setNum_lines(int num_lines) {
            this.num_lines = num_lines;
        }

        public Image getImage() {
            return image;
        }

        public void setImage(Image image) {
            this.image = image;
        }
    }

    /**
     * Object of display options
     */
    class Display_Options {

        String display_type;
        String display_subtype;
        String right_label;
        String left_label;

        /**
         * Display_Options constructor for family:
         * "image_choice", "file_upload", "slider",
         * @param display_type: required
         */
        public Display_Options(String display_type) {
            this.display_type = display_type;
        }

        /**
         * Display_Options constructor for family:
         * "emoji"
         * @param display_type: required
         * @param display_subtype: required
         */
        public Display_Options(String display_type, String display_subtype) {
            this.display_type = display_type;
            this.display_subtype = display_subtype;
        }

        public String getDisplay_type() {
            return display_type;
        }

        public void setDisplay_type(String display_type) {
            this.display_type = display_type;
        }

        public String getDisplay_subtype() {
            return display_subtype;
        }

        public void setDisplay_subtype(String display_subtype) {
            this.display_subtype = display_subtype;
        }

        public String getRight_label() {
            return right_label;
        }

        public void setRight_label(String right_label) {
            this.right_label = right_label;
        }

        public String getLeft_label() {
            return left_label;
        }

        public void setLeft_label(String left_label) {
            this.left_label = left_label;
        }
    }

    /**
     * Rows in the matrix
     */
    class Rows {

        String text;
        int position;
        boolean visible;
        boolean required;
        String type;

        /**
         * Rows constructor for family:
         * "matrix_single", "matrix_rating",
         * "matrix_ranking", "matrix_menu",
         * "open_ended_multi", "open_ended_numerical",
         * "datetime"
         * @param text: required
         */
        public Rows(String text) {
            this.text = text;
        }

        /**
         * Rows constructor for family:
         * "demographic"
         * @param visible: required
         * @param required: required
         * @param type: required
         */
        public Rows(boolean visible, boolean required, String type) {
            this.visible = visible;
            this.required = required;
            this.type = type;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
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

        public boolean isRequired() {
            return required;
        }

        public void setRequired(boolean required) {
            this.required = required;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

    /**
     * Columns in the matrix
     */
    class Cols {

        String text;
        List<Choices> choices;

        /**
         * Cols constuctor for family:
         * "matrix_menu"
         * @param text
         * @param choices
         */
        public Cols(String text, List<Choices> choices) {
            this.text = text;
            this.choices = choices;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public List<Choices> getChoices() {
            return choices;
        }

        public void setChoices(List<Choices> choices) {
            this.choices = choices;
        }
    }
}