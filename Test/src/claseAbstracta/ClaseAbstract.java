package claseAbstracta;

public abstract class ClaseAbstract {

	public void metodoAbtracto() {

	}

	public double metodoNoAbstractoParametros(int entero) {
		return 0;
	}

	public abstract double metodoAbstractoParametros(int entero);

}

class HeredaClaseAbstract extends ClaseAbstract {

	@Override
	public double metodoAbstractoParametros(int entero) {
		// TODO Auto-generated method stub
		return 0;
	}

}