package basicPrograms;

class DataMembersDeclarationAtEnd {
	void sampleMethod() {
		k = 2;
		System.out.println(k);
	}

	int j = 1;
	int i = j;
	int k;
	
	public static void main(String[] args) {
		new DataMembersDeclarationAtEnd().sampleMethod();
	}
}