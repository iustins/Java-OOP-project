package nume;

public class Student {

	String nume;
	int nota;

	static int nr=0;

	static void setToZero()
	{
		nr=0;
	}

	Student()
	{
		nume=null;
		nota=0;

		nr++;
	}

	Student(String nume,int nota)
	{
		this.nume=nume;
        this.nota=nota;

        nr++;
	}

}
