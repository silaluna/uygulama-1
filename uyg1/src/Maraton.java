public class Maraton {
    private final String[] name;
    private final int[] derece;

    Maraton(String[] name, int[] derece) {
        this.name = name;
        this.derece = derece;
    }
    public void sirala(){
        int sira []=new int[16];
        int sayac=0;
        for (int sirala: derece)
            if (sirala>200 && sirala<=299)
                sayac++;
        System.out.println("A->"+sayac);
    }
    public void sirala2(){
        int sira []=new int[16];
        int sayac=0;
        for (int sirala: derece)
            if (sirala>300 && sirala<399)
                sayac++;
        System.out.println("B ->"+sayac);
    }
    public void sirala3(){
        int sira []=new int[16];
        int sayac=0;
        for (int sirala: derece)
            if (sirala>400 && sirala<499)
                sayac++;
        System.out.println("C->"+sayac);
    }
    public void getsiralamaaa(){
        int sonbir=derece[1];
        int soniki=derece[0];
        int sonuc=derece[2];
        int sira=0;
        int sira2=0;
        int sira3=0;
        for (int i=0;i<derece.length;i++){
            if (derece[i]<soniki){
                soniki=derece[i];
                sira=i;
            }
        }
        for ( int i=0;i<derece.length;i++){
            if (soniki<derece[i] && derece[i]<sonbir) {
                sonbir = derece[i];
                sira2=i;
            }
        }
        for (int i=0;i<derece.length;i++){
            if (sonbir<derece[i]&& derece[i]<sonuc){
                sonuc=derece[i];
                sira3=i;
            }
        }
        System.out.println("birinci "+name[sira]+" "+soniki+" ");
        System.out.println("ikinci :" +name[sira2]+" " +sonbir+" ");
        System.out.println("ucuncu :" +name[sira3]+" " +sonuc+" ");


    }
}
