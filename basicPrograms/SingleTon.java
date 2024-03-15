package basicPrograms;
//pushtogitd7
public class SingleTon {
	
	SingleTon objSingleton ;
	
	private SingleTon() {
		
	}
	
	public SingleTon getInstance() {
		if (objSingleton != null)
			objSingleton = new SingleTon();
		
		return objSingleton;
		
	}

}
