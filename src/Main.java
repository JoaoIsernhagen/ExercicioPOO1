public class Main {
    public static void main(String[] args) {

       Direcao direcao = new Direcao();
       Motor motor = new Motor();
       Automovel automovel = new Automovel(motor, direcao);

       direcao.setCor("Prata");
       direcao.setTamanhoRaio("17");
       direcao.setKitMultimidia(true);

       motor.setChassi("123456789");
       motor.setCombustivel("Flex");
       motor.setPotencia("177");

        System.out.println("Motor: Potência - " + automovel.getMotor().getPotencia() +
                ", Combustível - " + automovel.getMotor().getCombustivel() +
                ", Chassis - " + automovel.getMotor().getChassi());

        System.out.println("Direção: Cor - " + automovel.getDirecao().getCor() +
                ", Tamanho Raio - " + automovel.getDirecao().getTamanhoRaio() +
                ", Kit Multimidia - " + automovel.getDirecao().isKitMultimidia());
        }
    }


