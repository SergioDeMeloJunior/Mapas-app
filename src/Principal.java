import com.demelo.mapas.Cidade;
import com.demelo.mapas.Estado;


import java.util.LinkedHashMap;
import java.util.Map;


public class Principal {

    public static void main(String[] args) {

        Estado Rj = new Estado("RJ","Rio de Janeiro");
        Estado SP = new Estado("SP","São Paulo");
        Estado MG = new Estado("MG","Minas Gerais");
        Estado CE = new Estado("CE","CEARÁ");
        Estado Ro = new Estado("RO", "Rondônia");

        Cidade Rio = new Cidade(021021,"rio",7_000_000);
        Cidade sãoPaulo = new Cidade(011011,"SP",12_396_372);
        Cidade BeloHorizonte = new Cidade(031031,"rio", 2_530_701);
        Cidade Fortaleza = new Cidade(050050,"Fortaleza",2_703_39);
        Cidade portoVelho = new Cidade(060060,"Porto Velho",1_703_39);

        Map<Estado,Cidade>capitais=new LinkedHashMap<>();

        capitais.put(SP,sãoPaulo);
        capitais.put(Rj,Rio);
        capitais.put(MG,BeloHorizonte);
        capitais.put(CE,Fortaleza);
        capitais.put(Ro,portoVelho);

        for (var entry : capitais.entrySet()) {
            System.out.printf("%s=%s (%d Habitantes)%n", entry.getKey().getSigla(),
                    entry.getValue().getNome(), entry.getValue().getTotalHabitantes());

        }


    }
}


