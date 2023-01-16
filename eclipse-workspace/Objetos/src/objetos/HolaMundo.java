package objetos;

 public class HolaMundo {
	private String saludo;
	
	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}

	public static void main(String[] args) {
		HolaMundo ejemplo = new HolaMundo();
		ejemplo.setSaludo("HolaMundo");
		System.out.println(ejemplo.getSaludo());
	}

 }