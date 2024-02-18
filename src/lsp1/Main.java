package lsp1;

import lsp1.shape.Rectangle;

import lsp1.shape.Square;
import lsp1.view.ShapeView;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        square.setSide(4);

        //  System.out.printf("In a shape side A = %f ", square.getArea());
        ShapeView view = new ShapeView(square);
        ShapeView view2 = new ShapeView(new Rectangle(4,5));
        view.showArea();
        view2.showArea();
    }
}
