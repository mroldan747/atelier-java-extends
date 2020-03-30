class Arena {

    public static void main(String[] args) {
        
        // TODO : create two monsters
        AirMonster roucoul = new AirMonster("Roucoul", 10, "air");
 
        WaterMonster carapuce = new WaterMonster("Carapuce", 12, "water");
        
        
        
        
        // TODO : monsters attack each other
        while(carapuce.getLife() > 0 && roucoul.getLife() > 0 ) {
            roucoul.attack(carapuce);
            if (carapuce.getLife() > 0) {
                carapuce.attack(roucoul);
            }
            
        }
        
        
    }
}