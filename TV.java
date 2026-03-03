class TV { 
    int tamanhoTela = 98;
    int consumo;
    int volume=5;
    string marca;
    string modelo;
    int voltagem= 220;
    int canal;
    int ano;    

void ligar (){
  
    consumo=tamanhoTela*voltagem;
    printf("Consumo é de: %d", consumo);
}

void desligar (){

}

int aumentarVolume (){
  if (volume<10){
    volume++;
  }
  return volume; 
}

int abaixarVolume (){
  if (volume>10 ){
    volume--;
  }
  return volume; 
}

