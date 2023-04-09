public class Usurario {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();


        System.out.println("Canal Atual :" +smartTv.canal);

        smartTv.mudarCanal(13);
        
        System.out.println("Volume atual :" +smartTv);

        System.out.println( "TV LIGADA ?" + smartTv.ligada);
        System.out.println("Canal Atual :" +smartTv.canal);
        System.out.println("Volume Atual :" +smartTv.volume);
        
    }

}
