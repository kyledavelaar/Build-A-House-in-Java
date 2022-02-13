package Room;

public class Kitchen extends Room {
    Integer sinkCount;


    public Kitchen(String type, Double width, Double length, Integer windowCount, Integer sinkCount) {
        super(type, width, length, windowCount);
        this.sinkCount = sinkCount;
    }

    protected void washDish(String dish) {
        System.out.println(dish + " washed");
    }

    public String washDishes(String[] dishes) {
        for (int i = 0; i < dishes.length; i++ ) {
            this.washDish(dishes[i]);
        }
        return "All dishes Washed";
    }
}
