public class Birds extends Animal{
    private double wingSpan;

    public Birds (String name, int age , double wingSpan){
        super(name , age);
        this.wingSpan = wingSpan;

    }

    public void makeSound (){
        System.out.println("Bird make sound");
    }
}
