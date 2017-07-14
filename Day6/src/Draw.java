
abstract public class Draw {
	abstract public void drawing();
}

class Circle extends Draw{
	public void drawing(){
		System.out.println("circle");
	}
}

class Line extends Draw{
	public void drawing(){
		System.out.println("Line");
	}
}

class TestOne{
	public static void main(String args[]){
		Circle c= new Circle();
		Line l = new Line();
		TestOne y = new TestOne();
//		Drawing y = new Drawing();
		y.dodrawing(c);
		//y.dodrawing(l);
		//dodrawing(c);
		//dodrawing(l);
	}
	public void dodrawing(Draw x){
		x.drawing();
	}
}

/*class Drawing{
	public void dodrawing(Draw x){
		x.drawing();
	}
}*/