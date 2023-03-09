
final public class FinalPgm {
	
	final int id = 100;
	
	final public void getId() {
		//id = 200; //id cannot be changed if final is given to variable
	}

	public static void main(String[] args) {
		

	}

}

 class FinalsubPgm extends FinalPgm{ //final class cannot be the parent class
	
	 final public void getId() { //method cannot be overriden if final is given
			//id = 200;
		}
	
}
