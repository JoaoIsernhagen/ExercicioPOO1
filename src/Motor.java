public class Motor {
    private String potencia;
    private String combustivel;
    private String chassi;

    public Motor(String potencia, String combustivel, String chassi) {
        this.potencia = potencia;
        this.combustivel = combustivel;
        this.chassi = chassi;
    }

    public Motor(){

    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
}
