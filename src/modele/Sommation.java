package modele;

public class Sommation {
	private int nbre1;
	private int nbre2;
	
	public Sommation(){
		nbre1=0;
		nbre2=0;
	}
	public int add(int nbre1,int nbre2){
    	return nbre1+nbre2;
    }
	public int getNbre1() {
		return nbre1;
	}

	public void setNbre1(int nbre1) {
		this.nbre1 = nbre1;
	}

	public int getNbre2() {
		return nbre2;
	}

	public void setNbre2(int nbre2) {
		this.nbre2 = nbre2;
	}
	
    
}