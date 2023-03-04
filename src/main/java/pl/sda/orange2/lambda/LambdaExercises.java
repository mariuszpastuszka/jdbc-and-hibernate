package pl.sda.orange2.lambda;

public class LambdaExercises {

    public static void main(String[] args) {
        BoysDontCry boy = new ChłopakiNiePłaczą();
        boy.silnoreki();
        ((ChłopakiNiePłaczą) boy).sing();

        ChłopakiNiePłaczą boy2 = new ChłopakiNiePłaczą();
        boy2.sing();

        // anonymous class
        BoysDontCry anonymousClassReference = new BoysDontCry() {
            @Override
            public void silnoreki() {
                System.out.println("Anonimowy silnoreki:)");
            }
        };

        anonymousClassReference.silnoreki();

//        BoysDontCry stupid = new String("");

        // () parenthesis - arguments list
        // -> arguments, body separator
        // {} parenthesis - method body
        BoysDontCry firstLambda = () -> {};
        BoysDontCry secondLambda = () -> System.out.println("Lambda:)");
        secondLambda.silnoreki();
        BoysDontCry thirdLambda = () -> {
            System.out.println("one");
            System.out.println("second");
        };

        System.out.println("----------------------------");
        System.out.println("Coffee time");

        CoffeeMaker myCoffeeMaker = (int water, String coffeeType) -> "my coffee";
        CoffeeMaker myCoffeeMaker2 = (int water, String coffeeType) -> {
            return "my coffee";
        };
        CoffeeMaker myCoffeeMaker3 = (int water, String coffeeType) -> {
            System.out.println("Coffee brewing...");
            return "Java Latte";
        };
        String myCoffee = myCoffeeMaker3.prepare(5, "Small");
        System.out.println("my coffee is ready: " + myCoffee);

        CoffeeMaker shortVersion = (water, coffeeType) -> "my coffee";
        shortVersion.prepare(5, "Large Java coffee");
    }
}
