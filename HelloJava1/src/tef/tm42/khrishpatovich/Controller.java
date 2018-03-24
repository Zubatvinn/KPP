package tef.tm42.khrishpatovich;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // The Work method
    public void sayHello() {
        Scanner sc = new Scanner(System.in);
        model.setValue(inputStringValueWithScanner(sc));
        view.printMessage(model.getValue());
    }

    // The Utility methods
    private String inputStringValueWithScanner(Scanner sc) {
        view.printMessage(View.INPUT_STRING_DATA);
        while (!sc.nextLine().equals("Hello Java!")) {
            view.printMessage(View.WRONG_INPUT_STRING_DATA + View.INPUT_STRING_DATA);
        }
        return view.OUTPUT_STRING_DATA;
    }
}
