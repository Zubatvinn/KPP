package tef.tm42.khrishpatovich;

public class Model {

    private String text;

    public String getValue() {
        return text;
    }

    void setValue(String text) {
        this.text = text;
    }

    boolean checkValue(String text) {
        return text.equals(this.text);
    }
}
