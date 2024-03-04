public class MaratonTest {
    public static void main(String[] args) {
        String[] isim = {"Kadir", "Gokhhan", "Hakan", "Suzan", "Pinar", "Mehmet", "Ali", "Emel", "Firat", "James", "Jale", "Ersin", "Deniz", "Gozde", "Anil", "Burak"};
        int[] dakika = {341, 273, 278, 329, 445, 402, 388, 270, 243, 334, 412, 393, 299, 343, 317, 265};
        Maraton son =new Maraton(isim,dakika);
        son.sirala();
        son.sirala2();
        son.sirala3();
        son.getsiralamaaa();
    }
}
