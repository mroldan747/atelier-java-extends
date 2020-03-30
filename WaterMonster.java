class WaterMonster extends Monster {

    // TODO : add constructor and initialize type to "water"
    public WaterMonster(String name, int attack, String type) {
        super(name, attack, type);

    }
    // TODO : create an attack method which deals x2 damage to "fire"
    
    @Override
    public boolean attack(Monster opponent){
         // - un WaterMonster inflige deux fois plus de dégâts à un FireMonster
        if (opponent.getType().equals("fire")){
            opponent.setLife(opponent.getLife() - this.getAttack() * 2);
        } else {
            opponent.setLife(opponent.getLife() - this.getAttack());
        }
        return opponent.isKO();
    }



   
}