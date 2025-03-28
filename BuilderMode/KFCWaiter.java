package BuilderMode;

public class KFCWaiter {
    private MealBuilder mb;
    public void setMb(MealBuilder mb){
        this.mb=mb;
    }
    public Meal construct(){
        mb.buildFood();
        mb.buildDrink();
        return mb.getMeal();
    }
}
