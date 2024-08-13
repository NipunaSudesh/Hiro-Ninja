public class Devil extends GameCharacter{
    public Devil(String name,int health){
        super(name, health);
    }
    public void attack(Ninja ninja){
        if(ninja.getArmar()){
            ninja.loosHealth(1);
        }
        else{
            ninja.loosHealth(2);
        }
    }
    public void stealArmor( Ninja ninja){
        ninja.loosAmor();
    }
}
