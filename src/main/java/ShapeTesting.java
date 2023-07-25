public class ShapeTesting {
    public static void main(String[] args) {
        // Creating Shape objects using different constructor invocations
        Shape shape1 = new Shape();
        Shape shape2 = new Shape(5.0);
        Shape shape3 = new Shape(4, 10.0);
        Shape shape4 = new Shape(4, 12.0, 8.0);
        Shape shape5 = new Shape(3, 6.0, 7.5, 9.0);

        // Invoking getShapeDetails() for each Shape object and assigning the returned values
        String details1 = shape1.getShapeDetails();
        String details2 = shape2.getShapeDetails();
        String details3 = shape3.getShapeDetails();
        String details4 = shape4.getShapeDetails();
        String details5 = shape5.getShapeDetails();

        // Printing the values of the dedicated String variables
        System.out.println("Shape 1 Details:\n" + details1 + "\n");
        System.out.println("Shape 2 Details:\n" + details2 + "\n");
        System.out.println("Shape 3 Details:\n" + details3 + "\n");
        System.out.println("Shape 4 Details:\n" + details4 + "\n");
        System.out.println("Shape 5 Details:\n" + details5 + "\n");

    }
}
