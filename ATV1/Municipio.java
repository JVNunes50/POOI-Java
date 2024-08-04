import java.util.Map;
import java.util.HashMap;

public class Municipio{

  String UF;
  String Bairro;
  int CEP;

  Map<String, Imovel> mun = new HashMap<String, Imovel>();

  public Municipio(String UF, String Bairro, int CEP){
    this.UF = UF;
    this.Bairro = Bairro;
    this.CEP = CEP;
  }

  void addMatricula(String matricula, Municipio M){
    mun.put(matricula, M);
  }

  double multar(String matricula){

    Imovel irec = mun.get(matricula);
    double imposto = 0;
    double multa = 0;

    if(irec.mesesAtrasos == 0){
      return imposto;
    }
    else if(irec.mesesAtrasos > 0 && irec.mesesAtrasos <= 5){
      multa = imposto * 0.01;
    }
    else if(irec.mesesAtrasos >=6 && irec.mesesAtrasos <= 8){
      multa = imposto * 0.023;
    }
    else if(irec.mesesAtrasos >=9 && irec.mesesAtrasos <= 10){
      multa = imposto* 0.03;
    }
    else if(irec.mesesAtrasos >= 11 && irec.mesesAtrasos <= 12){
      multa = imposto* 0.054;
    }
    else if(irec.mesesAtrasos > 12){
      multa = imposto* 0.1; 
    }
    else{
      System.out.println("Numero de meses invalido");
    }
    return multa;
  }
}
