
public class Onigiri extends Item {

	Onigiri(int no, String name, int price) {
		super(no, name, price);
		
	}

	@Override
	void display() {
		System.out.println(this.getName() + " " + this.getPrice() + "円");

	}

}
