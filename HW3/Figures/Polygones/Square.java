package HW3.Figures.Polygones;

public class Square extends Rectangle {

    private int a;

    // public Square(int a) {
    //     super(new ArrayList<Integer>(0));
    //     try {
    //     if (a <= 0)
    //     throw new Exception("Сторона не может быть меньше или равна 0");
    //     this.sides = Arrays.asList(a,a,a,a);
    //     } catch (Exception e) {
    //     System.out.println(e.getMessage());

    //     }
    //     }
   

    

    // public Square(int a) {

    //     try {
    //         if (a <= 0)
    //             throw new Exception("Сторона не может быть меньше или равна 0");
    //         this.a = a;
    //         this.sides = Arrays.asList(a);
    //     } catch (Exception e) {
    //         System.out.println(e.getMessage());

    //     }
    // }

    public Square(int a) {
        super(a, a);
        this.a = a;
    }
    
    @Override
    public double area() {
        return (a*a);
    }

    

}
