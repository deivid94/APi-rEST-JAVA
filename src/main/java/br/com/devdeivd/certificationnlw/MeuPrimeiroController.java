package br.com.devdeivd.certificationnlw;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/PrimeiraRota")
public class MeuPrimeiroController  {
    

    @GetMapping("/retornarPrimeiraController")
    public String retornoPrimeiraController (){
    return "Primeiro Retorno get";
}

    @PostMapping("/PrimeiroPost")
    public String MeuPrimeiroPost (){
    return "Dado inserido com sucesso";
  
}

 @GetMapping("SegundaRota")
 public String RetornaSegundaRota(){
  return "Segundo Retorno Api Rest";
 }
}