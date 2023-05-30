package claseAbstracta;

public abstract class ClaseAbstract {

	public void metodoAbtracto() {

	}

	public double metodoNoAbstractoParametros(int entero) {
		return 0;
	}
	public double metodoASobreescribir(double boh) {
		return boh-1;
	}

	public abstract double metodoAbstractoParametros(int entero);

}

class HeredaClaseAbstract extends ClaseAbstract {

	@Override
	public double metodoAbstractoParametros(int entero) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double metodoASobreescribir(double boh) {
		return boh-2;
	}
	

}