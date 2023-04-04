package basicPrograms;



public class ScopeOfTheLocalVariable {

	public static void main(String[] args) {
		int[] no = { 3, 2, 5, 1, 4 };
		int i ;
		for (i = 0; i < no.length; i++) {
		}
		
		
		System.out.println(no[i-1]);
		
		//block variable - local to block
		{
			int j = 0;
		}
		//System.out.println(j);
	}

}
