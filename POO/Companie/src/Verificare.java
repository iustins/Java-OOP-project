
public class Verificare {
	public boolean Varsta(Angajat a1, Angajat a2) {
		if (a1.getDataNasterii() == a2.getDataNasterii())
			return true;
		else
			return false;
	}
	public Angajat Salar(Angajat a1, Angajat a2){
		if(a1.getSalariu()>a2.getSalariu())
			return a1;
		else
			return a2;
	}
}
