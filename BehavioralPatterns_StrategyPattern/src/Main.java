public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor(new UpperCaseFormatter());
        editor.publishText("Hello, World!");

        editor.setTextFormatter(new LowerCaseFormatter());
        editor.publishText("Hello, World!");

        editor.setTextFormatter(new UpperCaseFormatter());
        editor.publishText("Hello, World!");
        editor.setTextFormatter(new EmptyFormatter());
        editor.publishText("Hello, World!");
    }
}