public class SmartTv{

    boolean ligada = false;
    int volume = 25;
    int canal =1;

public void mudarCanal (int novoCanal){
    canal = novoCanal;
}    
public void mudarCanal(){
    canal++;
}    
public void diminuirCanal(){
    canal--;

}

public void aumentarVolume(){
    volume ++;   
    System.out.println("Aumentando volume para " +volume);
}

public void diminuirVolume(){
    volume--;
    System.out.println("diminuirVolume " +volume);
}




}



