package ua.lviv.lgs;

public class Main {

	public static void main(String[] args) {
		
		Pet cow = () -> System.out.println("� ������- ����-����");
		cow.voice();
		Pet cat = () -> System.out.println("� ��- �����-�����");
		cat.voice();
		Pet dog = () -> System.out.println("� ��� - �����-�����");
		dog.voice();
		
		System.out.println();
		
		Amphibia frogEating = () -> System.out.println("I am eating");
		frogDoSomething(frogEating);		
		Amphibia frogSleeping = () -> System.out.println("I am sleeping");
		frogDoSomething(frogSleeping);		
		Amphibia frogSwimming = () -> System.out.println("I am swimming");
		frogDoSomething(frogSwimming);		
		Amphibia frogWalking = () -> System.out.println("I am walking");
		frogDoSomething(frogWalking);
		
	}
	
	public static void frogDoSomething(Amphibia whatToDo) {
		whatToDo.doSomething();
	}

}

interface Pet {	
	public void voice();
}

interface Amphibia {
	
	public void doSomething();
	
}