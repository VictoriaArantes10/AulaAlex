package aula1209;

public class Erropersonalizado extends Exception{
    
    @Override
    public String getMessage(){
       return "Erro personalizado. Impossível saber o que aconteceu, se vira!.";
    }
}
