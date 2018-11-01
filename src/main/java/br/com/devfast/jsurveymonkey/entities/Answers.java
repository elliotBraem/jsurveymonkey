package br.com.devfast.jsurveymonkey.entities;


public class Answers {

    List<Choices> choices;
    List<Other> other;
    /**
     * The Display options.
     */
    Display_Options display_options;
    /**
     * The Rows.
     */
    List<Rows> rows;
    /**
     * The Cols.
     */
    List<Cols> cols;

    /**
     * Answers constructor for family:
     * "single_choice", "mulitple_choice"
     *
     * @param choices : required
     */
    public Answers(List<Choices> choices) {
        this.choices = choices;
    }

    /**
     * Answers constructor for family:
     * "matrix_ranking", "open_ended_multi"
     * "open_ended_numerical", "demographic",
     * "datetime"
     *
     * @param rows : required
     */
    public Answers(List<Rows> rows) {
        this.rows = rows;
    }

    /**
     * Answers constructor for family:
     * "file_upload"
     *
     * @param display_options : required
     */
    public Answers(Display_Options display_options) {
        this.display_options = display_options;
    }

    /**
     * Answers constructor for family:
     * "image_choice"
     *
     * @param choices         : required
     * @param display_options : required
     */
    public Answers(List<Choices> choices, Display_Options display_options) {
        this.choices = choices;
        this.display_options = display_options;
    }

    /**
     * Answers constructor for family:
     * "matrix_single", "matrix_rating"
     *
     * @param choices : required
     * @param rows    : required
     */
    public Answers(List<Choices> choices, List<Rows> rows) {
        this.choices = choices;
        this.rows = rows;
    }

    /**
     * Answers constructor for family:
     * "matrix_menu"
     *
     * @param cols : required
     * @param rows : required
     */
    public Answers(List<Cols> cols, List<Rows> rows) {
        this.cols = cols;
        this.rows = rows;
    }

    /**
     * Gets choices.
     *
     * @return the choices
     */
    public List<Choices> getChoices() {
        return choices;
    }

    /**
     * Sets choices.
     *
     * @param choices the choices
     */
    public void setChoices(List<Choices> choices) {
        this.choices = choices;
    }

    /**
     * Gets other.
     *
     * @return the other
     */
    public List<Other> getOther() {
        return other;
    }

    /**
     * Sets other.
     *
     * @param other the other
     */
    public void setOther(List<Other> other) {
        this.other = other;
    }

    /**
     * Gets display options.
     *
     * @return the display options
     */
    public br.com.devfast.jsurveymonkey.entities.Answers.Display_Options getDisplay_options() {
        return display_options;
    }

    /**
     * Sets display options.
     *
     * @param display_options the display options
     */
    public void setDisplay_options(br.com.devfast.jsurveymonkey.entities.Answers.Display_Options display_options) {
        this.display_options = display_options;
    }

    /**
     * Gets rows.
     *
     * @return the rows
     */
    public List<Rows> getRows() {
        return rows;
    }

    /**
     * Sets rows.
     *
     * @param rows the rows
     */
    public void setRows(List<Rows> rows) {
        this.rows = rows;
    }

    /**
     * Gets cols.
     *
     * @return the cols
     */
    public List<Cols> getCols() {
        return cols;
    }

    /**
     * Sets cols.
     *
     * @param cols the cols
     */
    public void setCols(List<Cols> cols) {
        this.cols = cols;
    }


    /**
     * Choices: available choices for the user
     */
    class Choices {

        /**
         * The Text.
         */
        String text;
        /**
         * The Position.
         */
        int position;
        /**
         * The Weight.
         */
        int weight;

        /**
         * Choices constructor for family:
         * "single_choice", "multiple_choice",
         * "matrix_single"
         *
         * @param text : required
         */
        public Choices(String text) {
            this.text = text;
        }

        /**
         * Choices constructor for family:
         * "matrix_menu"
         *
         * @param text     : required
         * @param position : required
         */
        public Choices(String text, int position) {
            this.text = text;
            this.position = position;
        }

        /**
         * Choices constructor for family:
         * "matrix_rating"
         *
         * @param text   : required
         * @param weight : required
         */
        public Choices(String text, int weight) {
            this.text = text;
            this.weight = weight;
        }

        /**
         * Gets text.
         *
         * @return the text
         */
        public String getText() {
            return text;
        }

        /**
         * Sets text.
         *
         * @param text the text
         */
        public void setText(String text) {
            this.text = text;
        }

        /**
         * Gets position.
         *
         * @return the position
         */
        public int getPosition() {
            return position;
        }

        /**
         * Sets position.
         *
         * @param position the position
         */
        public void setPosition(int position) {
            this.position = position;
        }

        /**
         * Gets weight.
         *
         * @return the weight
         */
        public int getWeight() {
            return weight;
        }

        /**
         * Sets weight.
         *
         * @param weight the weight
         */
        public void setWeight(int weight) {
            this.weight = weight;
        }
    }

    /**
     * Other answer options
     */
    class Other {

        /**
         * The Text.
         */
        String text;
        /**
         * The Num chars.
         */
        int num_chars;
        /**
         * The Num lines.
         */
        int num_lines;
        /**
         * The Image.
         */
        Image image;

        /**
         * Other constructor for all families
         */
        public Other() { }

        /**
         * Gets text.
         *
         * @return the text
         */
        public String getText() {
            return text;
        }

        /**
         * Sets text.
         *
         * @param text the text
         */
        public void setText(String text) {
            this.text = text;
        }

        /**
         * Gets num chars.
         *
         * @return the num chars
         */
        public int getNum_chars() {
            return num_chars;
        }

        /**
         * Sets num chars.
         *
         * @param num_chars the num chars
         */
        public void setNum_chars(int num_chars) {
            this.num_chars = num_chars;
        }

        /**
         * Gets num lines.
         *
         * @return the num lines
         */
        public int getNum_lines() {
            return num_lines;
        }

        /**
         * Sets num lines.
         *
         * @param num_lines the num lines
         */
        public void setNum_lines(int num_lines) {
            this.num_lines = num_lines;
        }

        /**
         * Gets image.
         *
         * @return the image
         */
        public Image getImage() {
            return image;
        }

        /**
         * Sets image.
         *
         * @param image the image
         */
        public void setImage(Image image) {
            this.image = image;
        }
    }

    /**
     * Object of display options
     */
    class Display_Options {

        /**
         * The Display type.
         */
        String display_type;
        /**
         * The Display subtype.
         */
        String display_subtype;
        /**
         * The Right label.
         */
        String right_label;
        /**
         * The Left label.
         */
        String left_label;

        /**
         * Display_Options constructor for family:
         * "image_choice", "file_upload", "slider",
         *
         * @param display_type : required
         */
        public Display_Options(String display_type) {
            this.display_type = display_type;
        }

        /**
         * Display_Options constructor for family:
         * "emoji"
         *
         * @param display_type    : required
         * @param display_subtype : required
         */
        public Display_Options(String display_type, String display_subtype) {
            this.display_type = display_type;
            this.display_subtype = display_subtype;
        }

        /**
         * Gets display type.
         *
         * @return the display type
         */
        public String getDisplay_type() {
            return display_type;
        }

        /**
         * Sets display type.
         *
         * @param display_type the display type
         */
        public void setDisplay_type(String display_type) {
            this.display_type = display_type;
        }

        /**
         * Gets display subtype.
         *
         * @return the display subtype
         */
        public String getDisplay_subtype() {
            return display_subtype;
        }

        /**
         * Sets display subtype.
         *
         * @param display_subtype the display subtype
         */
        public void setDisplay_subtype(String display_subtype) {
            this.display_subtype = display_subtype;
        }

        /**
         * Gets right label.
         *
         * @return the right label
         */
        public String getRight_label() {
            return right_label;
        }

        /**
         * Sets right label.
         *
         * @param right_label the right label
         */
        public void setRight_label(String right_label) {
            this.right_label = right_label;
        }

        /**
         * Gets left label.
         *
         * @return the left label
         */
        public String getLeft_label() {
            return left_label;
        }

        /**
         * Sets left label.
         *
         * @param left_label the left label
         */
        public void setLeft_label(String left_label) {
            this.left_label = left_label;
        }
    }

    /**
     * Rows in the matrix
     */
    class Rows {

        /**
         * The Text.
         */
        String text;
        /**
         * The Position.
         */
        int position;
        /**
         * The Visible.
         */
        boolean visible;
        /**
         * The Required.
         */
        boolean required;
        /**
         * The Type.
         */
        String type;

        /**
         * Rows constructor for family:
         * "matrix_single", "matrix_rating",
         * "matrix_ranking", "matrix_menu",
         * "open_ended_multi", "open_ended_numerical",
         * "datetime"
         *
         * @param text : required
         */
        public Rows(String text) {
            this.text = text;
        }

        /**
         * Rows constructor for family:
         * "demographic"
         *
         * @param visible  : required
         * @param required : required
         * @param type     : required
         */
        public Rows(boolean visible, boolean required, String type) {
            this.visible = visible;
            this.required = required;
            this.type = type;
        }

        /**
         * Gets text.
         *
         * @return the text
         */
        public String getText() {
            return text;
        }

        /**
         * Sets text.
         *
         * @param text the text
         */
        public void setText(String text) {
            this.text = text;
        }

        /**
         * Gets position.
         *
         * @return the position
         */
        public int getPosition() {
            return position;
        }

        /**
         * Sets position.
         *
         * @param position the position
         */
        public void setPosition(int position) {
            this.position = position;
        }

        /**
         * Is visible boolean.
         *
         * @return the boolean
         */
        public boolean isVisible() {
            return visible;
        }

        /**
         * Sets visible.
         *
         * @param visible the visible
         */
        public void setVisible(boolean visible) {
            this.visible = visible;
        }

        /**
         * Is required boolean.
         *
         * @return the boolean
         */
        public boolean isRequired() {
            return required;
        }

        /**
         * Sets required.
         *
         * @param required the required
         */
        public void setRequired(boolean required) {
            this.required = required;
        }

        /**
         * Gets type.
         *
         * @return the type
         */
        public String getType() {
            return type;
        }

        /**
         * Sets type.
         *
         * @param type the type
         */
        public void setType(String type) {
            this.type = type;
        }
    }

    /**
     * Columns in the matrix
     */
    class Cols {

        /**
         * The Text.
         */
        String text;
        /**
         * The Choices.
         */
        List<Choices> choices;

        /**
         * Cols constuctor for family:
         * "matrix_menu"
         *
         * @param text    the text
         * @param choices the choices
         */
        public Cols(String text, List<Choices> choices) {
            this.text = text;
            this.choices = choices;
        }

        /**
         * Gets text.
         *
         * @return the text
         */
        public String getText() {
            return text;
        }

        /**
         * Sets text.
         *
         * @param text the text
         */
        public void setText(String text) {
            this.text = text;
        }

        /**
         * Gets choices.
         *
         * @return the choices
         */
        public List<Choices> getChoices() {
            return choices;
        }

        /**
         * Sets choices.
         *
         * @param choices the choices
         */
        public void setChoices(List<Choices> choices) {
            this.choices = choices;
        }
    }
}