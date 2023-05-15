/*public class MinhaClasse {
    public static void main(String[] args) {
        
        String primeiroNome = "Gabriel";
        String segundoNome = "Henrique";

        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}*/

public class Usuario {
    public static void main(String[] args) {
        SmarTv smarTv = new SmarTv();

        System.out.println("TV Ligada ? " + smarTv.ligada);
        System.out.println("Canal atual: " + smarTv.canal);
        System.out.println("Volume atual: " + smarTv.volume);
        
        smarTv.ligar();
        System.out.println("Novo status -> TV Ligada? " + smarTv.ligada);

        smarTv.aumentarVolume();
        System.out.println("Novo Status - Volume atual: " + smarTv.volume);
        smarTv.diminuirVolume();
        smarTv.diminuirVolume();
        smarTv.diminuirVolume();
        System.out.println("Novo status - Volume atual: " + smarTv.volume);
    
        smarTv.mudarCanal(13);
        System.out.println("Novo canal: " + smarTv.canal);
    }
}
