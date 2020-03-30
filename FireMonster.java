class FireMonster extends Monster{

    // TODO : add constructor and initialize type to "fire"
    public FireMonster(String name, int attack, String type) {
        super(name, attack, type);
    }
    // TODO : create an attack method which deals x2 damage to "air"
    
    @Override
    public boolean attack(Monster opponent){
        // - un FireMonster inflige deux fois plus de dégâts à un AirMonster
        if (opponent.getType().equals("air")){
            opponent.setLife(opponent.getLife() - this.getAttack() * 2);
        } else {
            opponent.setLife(opponent.getLife() - this.getAttack());
        }
        return opponent.isKO();
    }



    
}