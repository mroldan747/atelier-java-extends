class AirMonster extends Monster{

    // TODO : add constructor and initialize type to "air"
    public AirMonster(String name, int attack, String type) {
        super(name, attack, type);
    }
    
    // TODO : create an attack method which deals x2 damage to "water"
    @Override
    public boolean attack(Monster opponent){
        //un AirMonster inflige deux fois plus de dégâts à un WaterMonster
        if (opponent.getType().equals("water")){
            opponent.setLife(opponent.getLife() - this.getAttack() * 2);
        } else {
            opponent.setLife(opponent.getLife() - this.getAttack());
        }
        return opponent.isKO();
    }

    
}