public class SuperNinja extends Ninja{
    public SuperNinja(String name,int health){
        super(name, health);
    }
    @Override
    public void attack(Devil devil){
        devil.loosHealth(2);
    }
}
