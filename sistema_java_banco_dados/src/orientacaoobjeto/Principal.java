package orientacaoobjeto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlos.muller
 */
public class Principal {
    
        public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        
        pessoa.setCodigo(1);
        pessoa.setNome("Carlos");
        
        // imprimedados
        
        
        
        System.out.println("Pessoa código:" + pessoa.getCodigo()); 
        System.out.println("Pessoa nome:" + pessoa.getNome());
        
        System.out.println("novos testes");
          
        imprimeDadosPessoa(pessoa);
        
        Calculadora calc = new Calculadora();
            System.out.println("1 + 9 = "+calc.soma(1,9));
            System.out.println("1 + 9.0F = "+calc.soma(1,9.0F));
            int num[] = {1,2,3};
            System.out.println("1+2+6 = "+calc.soma(num));
                    
    }
        
        
        static void imprimeDadosPessoa(Pessoa pessoa){
             System.out.println("Pessoa código:" + pessoa.getCodigo()); 
             System.out.println("Pessoa nome:" + pessoa.getNome());

        }
    
}
    

