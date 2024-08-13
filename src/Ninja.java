public abstract class Ninja extends GameCharacter {

    private boolean armor;
    public Ninja(String name,int health){
        super(name, health);
        this.armor=true;
    }

    public void setArmor(boolean armor){
        this.armor= this.armor;
    }

    public boolean getArmar(){
        return armor;
    }


    public void loosAmor(){
        this.armor=false;
        System.out.println(this.getName()+" loos amor");
    }
    public abstract void attack(Devil devil);

    public void gainArmor(){
        if(this.getHealth()<=0) {
            System.out.println(this.getName()+" is dead!");
        }
        else {
            if (this.getArmar()) {
                System.out.println(this.getName() + " already has an armor!");
            } else {
                this.setArmor(true);
                System.out.println(this.getName() + " armor gained!");
            }
        }


    }
}