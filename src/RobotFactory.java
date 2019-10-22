import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    Map<String, RobotInterface> shapes = new HashMap<String, RobotInterface>();

    public int totalObjectsCreated(){
        return this.shapes.size();
    }

    public RobotInterface getRobotoFromFactory(String robotCategory) throws Exception {
        RobotInterface myRobot = null;

        if(this.shapes.containsKey(robotCategory)){
            myRobot =  this.shapes.get(robotCategory);
        }
        else {
            switch (robotCategory){
                case "small":
                    System.out.println("We don not have a small rebot. so we are creating a small one");
                    myRobot = new SmallRobot();
                    this.shapes.put(robotCategory, myRobot);
                    break;
                case "large":
                    System.out.println("We don not have a large rebot. so we are creating a large one");
                    myRobot = new LargeRobot();
                    this.shapes.put(robotCategory, myRobot);
                    break;
                default:
                    throw new Exception("Robot factory can create only small or large shapes");
            }
        }

        return myRobot;
    }
}
