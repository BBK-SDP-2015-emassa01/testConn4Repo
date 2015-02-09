package testie;

public class HelloWorldie {

	private String sentence = "I said";

	public String getSentence(){
		return this.sentence;
	}


	public static void main(String[] args){

		HelloWorldie hw = new HelloWorldie();
		System.out.println(hw.getSentence() + " Hello Liliya!" );
	}

}
