package nl.hva.miw.oop2.cohort12.tentamen;

public class Launcher {

	public static void main(String[] args) {
		
		Matrix m = new Matrix<Integer>(2);
		
		try {
			m.addElement(0, 0, 1);
			m.addElement(0, 1, 2);
			m.addElement(1, 0, 3);
			m.addElement(1, 1, 4);
		} catch (OngeldigeMatrixPositieException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Matrix1 : " + m);
		m.saveToFile("Matrixtest");
		
		Matrix m2 = new Matrix<Integer>(1);
		m2.loadFromFile("Matrixtest");

		System.out.println("Matrix2 : " + m2);
		
		
		




	}

}
