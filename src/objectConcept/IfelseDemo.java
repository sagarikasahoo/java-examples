package objectConcept;

 class IfelseDemo {

	public static void main(String[] args) {
		int i = 76;
		char grade;
		
		if(i>90){
			grade = 'A';
		}
		else if(i<45){
			grade = 'B';
		}
		else if(i<80){
			grade= 'C';
		}
		else {
			grade = 'D';
		}
		System.out.println("Grade " + grade);

	}

}
