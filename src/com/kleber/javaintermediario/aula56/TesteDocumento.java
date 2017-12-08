package com.kleber.javaintermediario.aula56;

public class TesteDocumento {

	public static void main(String[] args) {
		
		/*for (TipoDocumento doc : TipoDocumento.values()){
			System.out.println(doc + " - " + doc.geranumeroTeste());
		}*/
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CPF"));
		pessoa.setNumeroDocumento(pessoa.getTipoDocumento().geranumeroTeste());

	}

}
