import java.util.Scanner;
public class trabalhofinalizado
{
    public static void main(String args[])
    {
    	Scanner ler = new Scanner(System.in);
    	int cont = 0,alt = 0, empresa =  0, opc = 0, notneg = 0;
    	float estoque1 = 0, estoque2 = 0, saida = 0, entrada = 0, transf = 0;
    	System.out.println("Entre com o estoque inicial de açúcar da empresa 1 - Jatiboca");
    	estoque1 = ler.nextFloat();
    	System.out.println("Entre com o estoque inicial de açúcar da empresa 2 - Pontal");
    	estoque2 = ler.nextFloat();
    	do{
    		ler = new Scanner(System.in);
    		System.out.println("         ");
    		System.out.println("_____________________________________________________");
    		System.out.println("O que deseja fazer: ");
    		System.out.println("1 - Entrada de estoque");
    		System.out.println("2 - Saída de estoque");
    		System.out.println("3 - Transferência de estoque");
    		System.out.println("4 - Consulta de estoque");
    		System.out.println("5 - Finalizar");
    		alt = ler.nextInt();
    		switch(alt)
    		{
    			case 1:
    				do
    				{
    					opc = 0;
    					System.out.println("Qual empresa:");
    					System.out.println("1 - Jatiboca");
    					System.out.println("2 - Pontal");
    					empresa = ler.nextInt();
    					switch(empresa)
    					{
    						case 1 :
    							System.out.println("Quantidade da entrada de açucar de Jatiboca:");
    							entrada = ler.nextFloat();
    							estoque1 += entrada;
    							System.out.printf("Estoque atualizado em Jatiboca: %.2f", estoque1);
    							System.out.print(" kg");
    							opc+=5;
    							break;
    						case 2 :
    							System.out.println("Quantidade da entrada de açucar de Pontal:");
    							entrada = ler.nextFloat();
    							estoque2 += entrada;
    							System.out.printf("Estoque atualizado em Pontal: %.2f", estoque2);
    							System.out.print(" kg");
    							opc+=5;
    							break;
    						default:
    							System.out.println("Opção inválida, tente novamente.");
    							break;
    					}
    					ler = new Scanner(System.in);
    				}while (opc == 0);
    				break;
    			case 2:
    				do
    				{
    					System.out.println("Qual empresa:");
    					System.out.println("1 - Jatiboca");
    					System.out.println("2 - Pontal");
    					empresa = ler.nextInt();
    					switch(empresa)
    					{
    						case 1 :
    							do
    							{
    								notneg = 0;
    								System.out.println("Quantidade da saida de açúcar de Jatiboca:");
    								saida = ler.nextFloat();
    								estoque1 -= saida;
    								if(estoque1 < 0)
    								{
    									System.out.println("O estoque não pode ser negativo, tente novamente!");
    									System.out.println(" ");
    									estoque1 += saida;
    								}
    								else
    								{
    									notneg+=5;
    								}
    							}while(notneg == 0);
    							System.out.printf("Estoque atualizado em Jatiboca: %.2f", estoque1);
    							System.out.print(" kg");
    							opc+=5;
    							break;
    						case 2 :
    							do
    							{
    								notneg = 0;
    								System.out.println("Quantidade da saida de açúcar de Pontal:");
    								saida = ler.nextFloat();
    								estoque2 -= saida;
    								if(estoque2 < 0)
    								{
    									System.out.println("O estoque não pode ser negativo, tente novamente!");
    									System.out.println(" ");
    									estoque2 += saida;
    								}
    								else
    								{
    									notneg+=5;
    								}
    							}while(notneg == 0);
    							System.out.printf("Estoque atualizado em Pontal: %.2f", estoque2);
    							System.out.print(" kg");
    							opc+=5;
    							break;
    						default:
    							System.out.println("Opção inválida, tente novamente.");
    							break;
    					}
    					ler = new Scanner(System.in);
    				}while(opc == 0);
    				break;
    			case 3 :
    				do
    				{
    					opc = 0;
    					System.out.println("Qual empresa:");
    					System.out.println("1 - Jatiboca -> Pontal");
    					System.out.println("2 - Pontal -> Jatiboca");
    					empresa = ler.nextInt();
    					switch(empresa)
    					{
    						case 1 :
    							do
    							{
    								notneg = 0;
    								System.out.println("Quantidade de transferência de açúcar - Jatiboca -> Pontal:");
    								transf = ler.nextFloat();
    								estoque1 -= transf;
    								if(estoque1 < 0)
    								{
    									System.out.println("Impossível transferir de Jatiboca para Pontal, estoque insuficiente!");
    									System.out.println(" ");
    									estoque1 += transf;
    								}
    								else
    								{
    									estoque2 += transf;
    									notneg += 5;
    								}
    							}while(notneg == 0);
    							System.out.printf("Estoque atualizado em Jatiboca: %.2f", estoque1);
    							System.out.print(" kg");
    							System.out.println("                    ");
    							System.out.printf("Estoque atualizado em Pontal: %.2f", estoque2);
    							System.out.print(" kg");
    							opc+=5;
    							break;
    						case 2 :
    							do
    							{
    								notneg = 0;
    								System.out.println("Quantidade de transferência de açúcar - Pontal -> Jatiboca:");
    								transf = ler.nextFloat();
    								estoque2 -= transf;
    								if(estoque2 < 0)
    								{
    									System.out.println("Impossível transferir de Pontal para Jatiboca, estoque insuficiente!");
    									System.out.println(" ");
    									estoque2 += transf;
    								}
    								else
    								{
    									estoque1 += transf;
    									notneg += 5;
    								}
    							}while(notneg == 0);
    							System.out.printf("Estoque atualizado em Pontal: %.2f", estoque2);
    							System.out.print(" kg");
    							System.out.println("            ");
    							System.out.printf("Estoque atualizado em Jatiboca: %.2f", estoque1);
    							System.out.print(" kg");
    							opc+=5;
    							break;
    						default:
    							System.out.println("Opção inválida, tente novamente.");
    							break;
    					}
    					ler = new Scanner(System.in);
    				}while(opc == 0);
    				break;
    			case 4:
    				System.out.printf("Estoque em Jatiboca -> %.2f", estoque1);
    				System.out.print(" kg");
    				System.out.println(" ");
    				System.out.printf("Estoque em Pontal -> %.2f", estoque2);
    				System.out.print(" kg");
    				break;
    			case 5:
    				cont = 5;
    				System.out.println("Bom dia e um bom trabalho!");
    				break;
    		default:
    			System.out.println("Opção inválida, tente novamente.");
    			break;
    	}
    	ler = new Scanner(System.in);
    	}while(cont != 5);
    	ler = new Scanner(System.in);
    }
}