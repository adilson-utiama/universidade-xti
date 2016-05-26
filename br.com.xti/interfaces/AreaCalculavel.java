package interfaces;

//INTERFACES
/*
 * 100% ABSTRATO (metodos nao tem corpo, nao podem ser instanciaadas)
 * Padronizacao de Interacoes ( Controle radio )
 * Herança Multipla
 * Relacionamento de Tipos Dispares (Formas e Animais)
 * Tipo: unidade fundamental de projeto OO
 * variaveis de Interfaces sao sempre CONSTANTES
 */

public interface AreaCalculavel {

	int X = 1;//todas as variaveis em interface sao CONSTANTES (nao podem ser alteradas)
	
	//todos os metodos de interface SAO ABSTRATOS
	//nao ha necessidade de colocar public ou abstract
	double calcularArea();
}
