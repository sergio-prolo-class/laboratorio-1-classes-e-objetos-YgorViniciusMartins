package ifsc.poo;

public class Relogio {
    private byte hora;
    private byte minuto;
    private byte segundo;

    public Relogio(byte hora){
        if(hora > 24 || hora < 0){
            valorInvalido();
        }
        this.hora = hora;
        this.minuto = 0;
        this.segundo = 0;
    }

    public Relogio(byte hora, byte minuto){
        if(hora > 24 || hora < 0 || minuto > 60 || minuto < 0){
            valorInvalido();
        }
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = 0;
    }

    public Relogio(byte hora, byte minuto, byte segundo){
        if(hora > 24 || hora < 0 || minuto > 60 || minuto < 0 || segundo > 60 || segundo < 0){
            valorInvalido();
        }
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    private void valorInvalido(){
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

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

    public void sincronizaRelogio(Relogio relogio){
        String[] hora = relogio.getHora().split(":");
        this.hora = (byte) Integer.parseInt(hora[0]);
        this.minuto = (byte) Integer.parseInt(hora[1]);
        this.segundo = (byte) Integer.parseInt(hora[2]);
    }

    public int diferencaRelogio(Relogio relogio){
        String[] hora = relogio.getHora().split(":");
        int int_hora = Integer.parseInt(hora[0]);
        int int_minuto = Integer.parseInt(hora[1]);
        int int_segundo = Integer.parseInt(hora[2]);
        return ((this.hora - int_hora) * 3600) + ((this.minuto - int_minuto) * 60) + this.segundo - int_segundo;
    }
}
