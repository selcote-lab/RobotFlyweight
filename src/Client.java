public class Client {
    public static void main(String[] args) throws Exception{
        RobotFactory factory = new RobotFactory();

        RobotInterface shape = factory.getRobotoFromFactory("small");
        shape.print();

        for (int i = 0; i < 10; i++){
            shape = factory.getRobotoFromFactory("small");
            shape.print();
        }

        int shapeCreated = factory.totalObjectsCreated();
        System.out.println("\n Distinct Robot objects created till now = " + shapeCreated);

        for (int i = 0; i < 10; i++){
            shape = factory.getRobotoFromFactory("large");
            shape.print();
        }

        shapeCreated = factory.totalObjectsCreated();
        System.out.println("\n Distinct Robot objects created till now = " + shapeCreated);

    }
}
