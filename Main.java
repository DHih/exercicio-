import  java.util.Scanner ;

// Um Posto de combust�veis deseja determinar qual de seus produtos tem a prefer�ncia de seus clientes.
//Escreva um algoritmo para ler o tipo de combust�vel abastecido (codificado da seguinte forma: 
//1.�lcool 2.Gasolina 3.Diesel4.Fim). Caso o usu�rio informe um c�digo inv�lido (fora da faixa de 1 a 4)
//deve ser solicitado um novo c�digo (at� que seja v�lido). O programa ser� encerrado quando o c�digo informado
//for o n�mero 4.
public  class  Main {

	public  static  void  main ( String [] args ) {

		Scanner sc =  new  Scanner (System.in);
		
		int alcool =  0 ;
		int gasolina =  0 ;
		int diesel =  0 ;
		
		int tipo = sc . nextInt ();
		//com essa linha de codico ser voc� jogar o numero 4  ele n�o vai ser diferente e sim igual. com isso ele pula
		//o WHILE e vai direto para linha 40.
		while (tipo !=  4 ) {
			if (tipo ==  1 ) {
				alcool = alcool +  1 ;
			}
			else if (tipo ==  2 ) {
				gasolina = gasolina +  1 ;
			}
			else if (tipo ==  3 ) {
				diesel = diesel +  1 ;
			}
			//se acaso o dados de entrada for maior que 4 ele ira pedir para repetir o comando novamente.
			tipo = sc . nextInt ();
		}

		System.out.println ( " MUITO OBRIGADO " );
		System.out.println ( " Alcool: "  + alcool);
		System.out.println ( " Gasolina: "  + gasolina);
		System.out.println ( " Diesel: "  + diesel);
		
		sc . close();
	}
}
