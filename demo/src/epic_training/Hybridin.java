package epic_training;
//Hybrid inheritance
class Clsa{
	int a=100;
}
class Clsb extends Clsa{
	int b=90;
}
class ClassD extends Clsb{
	int d=80;
}
class Clsc extends Clsa{
	int c=70;
}
class Classe extends Classc{
	int e=60;
}
class Classf extends Classe{
	int f=50;
}

public class Hybridin {

	public static void main(String[] args) {
		Classf fob= new Classf();
		System.out.println(fob.a);
		ClassD dob = new ClassD();
		System.out.println(dob.b);

		

	}

}
