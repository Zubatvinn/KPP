package tef.tm42.khrishpatovich;

import java.util.Scanner;

class Controller {
    private Model model;
    private View view;

    Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // The Work method
    void sayHello() {
        Scanner sc = new Scanner(System.in);
        model.setValue(View.INPUT_STRING_HELLO);
        while(!model.checkValue(inputHelloWithScanner(sc))) {view.printMessage(View.WRONG_INPUT_STRING_DATA);}
        view.printMessage(View.OUTPUT_STRING_DATA);
    }

    private String inputHelloWithScanner(Scanner sc) {
        String res;
        view.printMessage(View.INPUT_STRING_DATA);
        res = sc.nextLine();
        return res;
    }

}
