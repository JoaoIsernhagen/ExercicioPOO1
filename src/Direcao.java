public class Direcao {
    private String cor;
    private String tamanhoRaio;
    private boolean kitMultimidia;

    public Direcao(String cor, String tamanhoRaio, boolean kitMultimidia) {
        this.cor = cor;
        this.tamanhoRaio = tamanhoRaio;
        this.kitMultimidia = kitMultimidia;
    }

    public Direcao(){

    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanhoRaio() {
        return tamanhoRaio;
    }

    public void setTamanhoRaio(String tamanhoRaio) {
        this.tamanhoRaio = tamanhoRaio;
    }

    public boolean isKitMultimidia() {
        return kitMultimidia;
    }


    public void setKitMultimidia(boolean kitMultimidia) {
        this.kitMultimidia = kitMultimidia;
    }
}
