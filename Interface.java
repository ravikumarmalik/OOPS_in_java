public class Interface {
    public static void main(String[] args) {

        ClassPlayer.Queen q = new ClassPlayer.Queen();
        q.moves();
    }
}
interface ClassPlayer{
    void moves();
        class Queen implements ClassPlayer{
            public void moves(){
                System.out.println("up,down,right,left,diagonal(in all direction)");
            }
        }
        class Rook implements ClassPlayer{

            public void moves() {
                System.out.println("up,down,right,left");
            }
        }

        class King implements ClassPlayer{
            public void moves() {
                System.out.println("up,down,right,left,diagonal");
            }
        }
    }

    /*

    up,down,right,left,diagonal(in all direction)

    it's a blueprint of class.
    car[wheels,speed,engine] ---> interface

    used to achieve total 100% abstraction.
    variable in the interface are final public and static.
    All methods are public, abstract and without implementation.

     */
