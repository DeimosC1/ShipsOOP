public class Main {
    public static void main(String[] args) {
    Ship destroyer = new Builder("Destroyer",3 ,2,).hitpoints(100).damage(50);
        Ship PTB = new Builder("Patrol Boat",2 ,1,).hitpoints(20).damage(45);
        Ship Carrier = new Builder("Carrier",5 ,2,).hitpoints(150).damage(20);
        Ship Battleship = new Builder("Battleship",4 ,1,).hitpoints(110).damage(120);
        Ship Submarine = new Builder("Submarine",3 ,1,).hitpoints(15).damage(150);
    }

}
