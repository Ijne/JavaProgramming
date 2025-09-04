//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package bikeproject;

public class RoadBike extends Bike {
    private int tyreWidth;
    private int postHeight;

    public final String terrain = "track_racing";

    public RoadBike() {
        this("drop", "racing", "tread less", "razor", 19, 20, 22);
    }

    public RoadBike(int postHeight) {
        this("drop", "racing", "tread less", "razor", 19, 20, postHeight);
    }

    public RoadBike(String handleBars, String frame, String tyres, String seatType, int numGears, int tyreWidth, int postHeight) {
        super(handleBars, frame, tyres, seatType, numGears);
        this.tyreWidth = tyreWidth;
        this.postHeight = postHeight;
    }

    public void printDescription() {
        super.printDescription();
        System.out.println("This Roadbike bike has " + this.tyreWidth + "mm tyres and a post height of " + this.postHeight + ".");
    }

    public int getTyreWidth() {
        return tyreWidth;
    }

    public void setTyreWidth(int newValue) {
        this.tyreWidth = newValue;
    }

    public int getPostHeight() {
        return postHeight;
    }

    public void setPostHeight(int newValue) {
        this.postHeight = newValue;
    }

}
