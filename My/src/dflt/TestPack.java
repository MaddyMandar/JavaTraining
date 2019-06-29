package dflt;

import com.zensar.pack1.Student;
import static com.zensar.pack2.Batch.fun;
import com.zensar.pack2.Batch;

public class TestPack {

	public static void main(String[] args) {
		
		Student student  = new Student();
		Student student2 = new Student("Rick");
		Student student3 = new Student("Morty");
		
		Batch   batch    = new Batch();
		Batch   batch2   = new Batch("Java",30);
		Batch   batch3   = new Batch("C#",35);
		
		batch2.displayBatch();
		student2.displayStudent();
		
		fun();
		
		
	}
}
