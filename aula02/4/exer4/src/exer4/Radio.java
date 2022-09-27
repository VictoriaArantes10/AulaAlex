package exer4;

public class Radio implements IDevice {

    public Boolean ligado;
    public int volume;
    public int canal;
    
    @Override
    public void ligarDesligar() {
        if(ligado == true)
        {
            ligado = false;
        }else{
            ligado = true;
        }
    }

    @Override
    public void aumentarVolume() {
        if (this.volume < 100) {
           this.volume = volume +1;
            System.out.println("Volume: " + this.volume);
        }
    }
    
    @Override
    public void diminuirVolume(){
        if (this.volume > 0) {
            this.volume = volume - 1;
             System.out.println("Volume: " + this.volume);
        }   
    }

    @Override
    public void aumentarCanal() {
        if (this.canal < 100) {
           this.canal = canal + 10;
            System.out.println("Canal: " + this.canal);
        }
    }
    
    @Override
    public void diminuirCanal()
    {
        if (this.canal > 1) {
            this.canal = canal - 10;
             System.out.println("Canal: " + this.canal);
        } 
    }
    
}