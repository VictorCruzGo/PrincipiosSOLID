package org.formacion;

public class InternationalMoneyOrganizationAdapter implements InternationalMoneyOrganization {

	private BancoNostrum miSistema;
	
	public InternationalMoneyOrganizationAdapter(BancoNostrum miSistema) {
		this.miSistema=miSistema;
	}
	
	@Override
	public void transfer(int cantidad, String cliente) {
		miSistema.movimiento(cliente, cantidad);		
	}

	@Override
	public int state(String cliente) {		
		Integer resultado= miSistema.estado(cliente);
		
		if(resultado==null) {
			return 0;
		}
		return resultado;
	}

}
