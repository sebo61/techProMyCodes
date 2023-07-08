package suleymanHocaJava.day27interface;

public interface Engine {
    /*
    1) "interface" içine "concrete method" konulamaz.
    2) "interface" içindeki mwthodların abstract olduğunu Java bilir. Bu yüzden "interface" içindeki "abstract method" larda
        abstract keyword kullanmaya gerek yoktur.
    3) interface içindeki abstract methodların tamamı publictir.
        Bu yüzden interface içinde abstract method oluştururken "acces modifier" yazmaya gerek yoktur.
     */
    public void start();


}
