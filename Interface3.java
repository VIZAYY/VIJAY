
public class Interface3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Classroom.attend(new Teacher());
		Classroom.learn(new Student());
		
	}

}


interface Teaching{
	void teach();
	
}
interface Learning{
	void learn();
	
}

class Student implements Learning
{

	@Override
	public void learn() {
		// TODO Auto-generated method stub
		
	}
	
}

class Teacher implements Teaching{
	public void teach() {
		
	}
}


class Classroom
{

	static void attend(Teaching T) 
	{
		T.teach();
		
		
	}
	static void learn(Learning l) {
		
	}
}
