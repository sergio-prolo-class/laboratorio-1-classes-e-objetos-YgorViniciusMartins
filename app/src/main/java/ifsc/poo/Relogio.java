package ifsc.poo;

public class Relogio {
    byte hora;
    byte minuto;
    byte segundo;

    public void ajustaHora(byte hora, byte minuto, byte segundo){
        if(hora > 24 || minuto > 60 || segundo > 60 || hora < 0 || minuto < 0 || segundo < 0){
            System.out.println("Hora inválida");
            return;
        }
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public String getHora(){
        String hora = String.format("%02d", this.hora);
        String minuto = String.format("%02d", this.minuto);
        String segundo = String.format("%02d", this.segundo);
        return hora + ":" + minuto + ":" + segundo;
    }

    public String getHoraAMPM(){
        String hora;
        if(this.hora <= 12){
            hora = String.format("%02d", this.hora) + "am";
        } else {
            hora = String.format("%02d", this.hora - 12) + "pm";
        }
        String minuto = String.format("%02d", this.minuto) + "m";
        String segundo = String.format("%02d", this.segundo) + "s";

        return hora + ":" + minuto + ":" + segundo;
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
