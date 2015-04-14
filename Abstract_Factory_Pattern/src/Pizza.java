
public abstract class Pizza {
  protected String name = null;

  protected Dough dough;

  protected Sauce sauce;

  protected Cheese cheese;

  protected Clams clam;

  public abstract void prepare() ;

  public void bake() {
      System.out.println("Bake for 25 minutes at 350");
  }

  public void cut() {
      System.out.println("Cutting the pizza into diagonal slices");
  }

  public void box() {
      System.out.println("Place pizza in official PizzaStore box");
  }

  public void setName(String name) {
      this.name = name;
  }

  public String getName() {
      return name;
  }

  public String toString() {
      return "Pizza " + this.name + "\n";
  }

}
