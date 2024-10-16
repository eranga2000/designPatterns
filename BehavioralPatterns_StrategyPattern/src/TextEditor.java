public class TextEditor {
    private TextFormatter textFormatter;
    public TextEditor(TextFormatter textFormatter) {
        this.textFormatter = textFormatter;
    }
//setting up the method of formatting
    public void setTextFormatter(TextFormatter textFormatter) {
        this.textFormatter = textFormatter;
    }
    //printing the formatted text
    public void publishText(String text) {
        String formattedText = textFormatter.format(text);
        System.out.println(formattedText);
    }
}