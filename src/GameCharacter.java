public class GameCharacter {
    private String name;
    private int health;

    public GameCharacter(String name,int health){
        this.name=name;
        this.health=health;

    }

    public String getName(){
        return name;
    }
    public int getHealth(){
        return health;
    }
    public void setName(String name){
        this.name=name;
    }
public void setHealth(int health){
        this.health=health;
}
    public void loosHealth( int discressHealth){
        this.setHealth(this.getHealth()-discressHealth);
        if(this.getHealth()<=0){
            System.out.println(this.getName() +"died!");
        }else if(this.getHealth()>0){
            System.out.println(this.getName() +"health discrese to "+this.getHealth());
        }
    }
}
