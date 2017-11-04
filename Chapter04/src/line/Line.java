package line;

public class Line {
	InputScore one;
	DelScore two;
	ComputeAver three;
	Line(){
		three=new ComputeAver();
		two=new DelScore(three);
		one=new InputScore(two);
	}
	public void givePresonScore() {
		one.inputScore();
	}
}
