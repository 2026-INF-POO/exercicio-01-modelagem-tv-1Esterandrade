class Tv {
    
    int tamanhoTela; 
    int volume = 5;
    String marca;
    int voltagem;
    int canal;
    boolean ligada = false;  

    public Tv(int tamanho, String marca, int voltagem) {
         this.tamanhoTela = tamanho;
         this.marca = marca;
         this.voltagem = voltagem; 
         this.canal = 1; 
    }
 
    public void ligar() { 
         this.ligada = true;
         int consumo = this.voltagem * this.tamanhoTela;
         System.out.println("Tv Ligada. Consumo: " + consumo); 
    } 

    public void desligar() { 
         this.ligada = false; 
         System.out.println("Tv Desligada");
    }

    public void aumentarVolume() { 
        if (ligada && volume < 10) {
            volume++; 
            System.out.println("Volume: " + volume); 
        } 
    } 

    public void abaixarVolume() { 
        if (ligada && volume > 1) {
            volume--; 
            System.out.println("Volume: " + volume);
        }
    }

    public void subirCanal() { 
        if (ligada) { 
            canal++; 
            System.out.println("Canal: " + canal); 
        } 
    } 

    public void descerCanal() {
        if (ligada && canal > 1) { 
            canal--; 
            System.out.println("Canal: " + canal); 
        }
    }
} 