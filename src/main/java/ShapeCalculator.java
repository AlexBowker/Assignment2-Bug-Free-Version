public class ShapeCalculator {
    public static void main(String[] args) {
        int choice = -1;

        while (choice != 0) {
            Title.draw();

            choice = CalculatorSelector.getChoice();

            if (choice == 1) {
                Rectangle rectangle = RectangleCalculator.getRectangleDimensions();
                RectangleCalculator.outputRectangleArea(rectangle);
                RectangleCalculator.outputRectanglePerimeter(rectangle);
            } else if (choice == 2) {
                Triangle triangle = TriangleCalculator.getTriangleDimensions();
                TriangleCalculator.outputTriangleArea(triangle);
                TriangleCalculator.outputTrianglePerimeter(triangle);
            }

            System.out.println();
        }

        System.out.println("Goodbye!");
    }
}
