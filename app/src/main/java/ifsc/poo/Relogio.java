package ifsc.poo;

public class Relogio {
    byte hora;
    byte minuto;
    byte segundo;

    public void ajustaHora(byte hora, byte minuto, byte segundo){
        if(hora > 24 || minuto > 60 || segundo > 60){
            System.out.println("Hora inválida");
            return;
        }
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public String getHora(){
        return this.hora + ":" + this.minuto + ":" + this.segundo;
    }

    public void avancaHora(){
        this.hora++;
        if(hora > 23){
            this.hora = 0;
        }
    }

    public void avancaMinuto(){
        this.minuto++;
        if(minuto > 59){
            this.minuto = 0;
            avancaHora();
        }
    }

    public void avancaSegundo(){
        this.segundo++;
        if(segundo > 59){
            this.segundo = 0;
            avancaMinuto();
        }
    }
}
