/*Author:https://gist.github.com/caioh-ferreira
Data: 02/08/2018
Name of project: Slugger
Function: Convert words to slug by simply inserting it into the program that is based on ASCII table.
*/

import java.util.Scanner;

public class sluggerjv {

	public static void main(String[] args) {
	    
	    Scanner teclado = new Scanner(System.in);
		
		String entrada = " ";
		
		System.out.println("This algorithmn aims to convert words to slug by simply inserting it into the program that is based on ASCII table.\nI'm still working on it.\nAny feedback about this program can be send to Github /caioh-ferreira.\n");
		
		System.out.print("Ordinary word: ");
		
		entrada = teclado.nextLine();
        
        //Trim de espaços em branco no início ou final do programa
        
        entrada = entrada.trim();
        
        /*Pesquisa dentro do caracter e replacement
        Acentuação*/
        
        entrada = entrada.replaceAll("\\p{Punct}", "");
        
        //Remoção de acentuação em vogais
        
        if(entrada.contains("á")){
        	entrada = entrada.replaceAll("á", "a");
        }
        
        if(entrada.contains("à")){
        	entrada = entrada.replaceAll("à", "a");
        }
        
        if(entrada.contains("â")){
        	entrada = entrada.replaceAll("â", "a");
        }
        
        if(entrada.contains("ã")){
        	entrada = entrada.replaceAll("ã", "a");
        }
        
        if(entrada.contains("é")){
        	entrada = entrada.replaceAll("é", "e");
        }
        
        if(entrada.contains("è")){
        	entrada = entrada.replaceAll("è", "e");
        }
        
        if(entrada.contains("ê")){
        	entrada = entrada.replaceAll("ê", "e");
        }
        
        if(entrada.contains("í")){
        	entrada = entrada.replaceAll("í", "i");
        }
        
        if(entrada.contains("ì")){
        	entrada = entrada.replaceAll("ì", "i");
        }
        
        if(entrada.contains("î")){
        	entrada = entrada.replaceAll("î", "i");
        } 
        
        if(entrada.contains("ó")){
        	entrada = entrada.replaceAll("ó", "o");
        }
        
        if(entrada.contains("ò")){
        	entrada = entrada.replaceAll("ò", "o");
        }
        
        if(entrada.contains("ô")){
        	entrada = entrada.replaceAll("ô", "o");
        }
        
        if(entrada.contains("õ")){
        	entrada = entrada.replaceAll("õ", "o");
        }
        
        if(entrada.contains("ú")){
        	entrada = entrada.replaceAll("ú", "u");
        }
        
        if(entrada.contains("ù")){
        	entrada = entrada.replaceAll("ù", "u");
        }
        
        if(entrada.contains("û")){
        	entrada = entrada.replaceAll("û", "u");
        }
        
        if(entrada.contains("ñ")){
        entrada = entrada.replaceAll("ñ", "n");
        }
        
        if(entrada.contains("ç")){
        entrada = entrada.replaceAll("ç", "c");
        }
        
        //Remoção e troca de espaços em branco por "-" no meio do da String
		
        entrada = entrada.replaceAll(" ", "-");
        
        System.out.println("Slug: "+entrada.toLowerCase());
        
		teclado.close();
		
	}

}
