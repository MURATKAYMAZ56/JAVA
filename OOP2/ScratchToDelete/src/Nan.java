
public class Nan {
	abstract class Writer {
		 public  void write() {
		 System.out.println("Writing...");
		 }
		}
		class Author extends Writer {
		 public  void write() {
		 System.out.println("Writing book");
		 }
		}
		public class Programmer extends Writer {
		 public  void write() {
		 System.out.println("Writing code");
		 }
		 public  void main(String[] args) {
		 Writer w = new Programmer();
		 w.write();
		 }
		}
}
