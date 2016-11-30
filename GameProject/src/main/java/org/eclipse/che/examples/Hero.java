package org.eclipse.che.examples;



public class Hero {
    //Initializing variables
    private int Health;
    private int PWR;
    private int Speed; 
    
    
    Hero(){
    //Base Traits
   this.Health = 100;
   this.PWR = 10;
   this.Speed = 50;   
}

public int getHealth(){
    return this.Health;
}

public int getPWR(){
    return this.PWR;
}

public int getSpeed(){
    return this.Speed;
}

public void getBaseStats(){
    getHealth();
    getPWR();
    getSpeed();
}


    
    

       
        
    
    
   public static void main(String[] argvs) {
       
       
       
   }
}
