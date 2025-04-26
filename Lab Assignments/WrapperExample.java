// WAP to implement wrapper class using int, float, double, char.

public class WrapperExample {
    public static void main(String[] args) {
        // Primitive types
        int primitiveInt = 10;
        float primitiveFloat = 5.75f;
        double primitiveDouble = 19.99;
        char primitiveChar = 'A';

        // Using wrapper classes (Boxing)
        Integer wrappedInt = Integer.valueOf(primitiveInt);
        Float wrappedFloat = Float.valueOf(primitiveFloat);
        Double wrappedDouble = Double.valueOf(primitiveDouble);
        Character wrappedChar = Character.valueOf(primitiveChar);

        // Displaying the wrapper objects
        System.out.println("Integer Wrapper: " + wrappedInt);
        System.out.println("Float Wrapper: " + wrappedFloat);
        System.out.println("Double Wrapper: " + wrappedDouble);
        System.out.println("Character Wrapper: " + wrappedChar);

        // Unboxing (Getting primitive values back)
        int unboxedInt = wrappedInt.intValue();
        float unboxedFloat = wrappedFloat.floatValue();
        double unboxedDouble = wrappedDouble.doubleValue();
        char unboxedChar = wrappedChar.charValue();

        // Displaying unboxed values
        System.out.println("\nUnboxed Integer: " + unboxedInt);
        System.out.println("Unboxed Float: " + unboxedFloat);
        System.out.println("Unboxed Double: " + unboxedDouble);
        System.out.println("Unboxed Character: " + unboxedChar);
    }
}
