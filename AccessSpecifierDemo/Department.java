package samplePrograms.staticVariables;


class Department {
    static int numberOfWorker = 0;
    
    Department() {
        numberOfWorker++; // Increment the count each time a new worker is added
    }
    
    static int getNumberOfWorkers() {
    	return numberOfWorker;
    }

    public static void main(String[] args) {
        Department dept1 = new Department();
        Department dept2 = new Department();
        Department dept3 = new Department();

        System.out.println("Number of workers in the department: " + getNumberOfWorkers());
    }
}