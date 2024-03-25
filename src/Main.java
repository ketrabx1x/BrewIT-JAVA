import objects.beer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        beer piwo = new beer("Polska IPA", true);
        System.out.println(piwo);
    }
}