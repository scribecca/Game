package org.eclipse.che.examples;


public class Combat{
    
    //initialize hero stats
    public int Health;
    public int PWR;
    public int Speed;
    
    //Initialize Enemy Stats
    public int EnemyHealth;
    public int EnemyPWR;
    public int EnemySpeed;
    
Hero Stephen = new Hero()
    {
    int Health = Stephen.getHealth();
    int PWR = Stephen.getPWR(); 
    int Speed = Stephen.getSpeed();
    }


Enemy Goomba = new Enemy()
    {
    EnemyHealth = 100;
    EnemyPWR = 10;
    EnemySpeed = 60;
    }
  
 


public void WhoGoesFirst(int Speed, int EnemySpeed){
    
    if (Speed > EnemySpeed){
        System.out.println("The Hero Goes First");
        HeroAttack();
    }
    else
    {
        System.out.println("The Enemy Goes First");
        EnemyAttack();
    }
}

//Method for when the Hero Attacks
public void HeroAttack()
{
    System.out.println("The Hero punches the enemy");
    EnemyHealth = EnemyHealth - PWR;
    System.out.println("The Enemy is hit!");
      if (EnemyHealth == 0){
        System.out.println("The enemy is dead!");
    }
    else{
    EnemyAttack();
}

}

//Method for when the Enemy Attacks
public void EnemyAttack(){
    Health = Health - EnemyPWR;
    if (Health == 0){
        System.out.println("You are dead!");
    }
    else{   
    HeroAttack();
}

}
}



