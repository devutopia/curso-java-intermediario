package com.kleber.javaintermediario.aula56;

public enum TipoDocumento {
	
	CPF {
		@Override
		public String geranumeroTeste() {
			return GeraCpfCnpj.cpf();
		}
	}, CNPJ {
		@Override
		public String geranumeroTeste() {
			return GeraCpfCnpj.cnpj();
		}
	};
	
	public abstract String geranumeroTeste();
}
