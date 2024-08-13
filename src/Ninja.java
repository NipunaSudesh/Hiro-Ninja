public abstract class Ninja extends GameCharacter{

    private boolean armor;
    public Ninja(String name, int health) {
        super();
        this.armor = true;
    }
    public boolean getArmor(){
        return armor;
    }
    public void setArmor(boolean armor){
        this.armor=armor;
    }
    public void loseArmor(){
        this.armor=false;
        System.out.println(this.getName()+" loos armor");
    }
    public abstract void attack(Devil devil);
    public void gainArmor(){
        if(this.getHealth()<=0) {
            System.out.println(this.getName()+" is dead!");
        }
        else {
            if (this.getArmor()) {
                System.out.println(this.getName() + " already has an armor!");
            } else {
                this.setArmor(true);
                System.out.println(this.getName() + " armor gained!");
            }
        }


    }
}
