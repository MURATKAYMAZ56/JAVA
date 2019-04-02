package AbstractClass;

/*Abstract class olusturduk.Aclass inhert=itance ve interface karisim diyebilirsin.
 * Yani hemgovdeli hem govdesiz metod barindirir.
 * govdeli tum methodlar tum alt klaslarda direkt erisilebilir
 * govedisizlr de tum alt klass larda kendilerine gore duzenlenmek zorundalar
 * 
 * Absract classrdan object olusturulmaz fakat referans olarak kullanip alt klastan obje olusturabilirsin
 * 
 * AbstracDatabe abstractDatabase= new AbstractDatabase(); OLMAZ
 * AbstracDatabe abstractDatabase= new MysqlDatabase(); OLUR
 * 
 * */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractDatabase abstractDatabase1 = new MysqlDatabase();
		AbstractDatabase abstractDatabase2 = new MongoDb();

		abstractDatabase1.Add();
		abstractDatabase2.Add();

	}

}
