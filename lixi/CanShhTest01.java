

public class CanShhTest01 {

	public static void main(String[] args) {
		User u = new User(20);
		add(u);
		System.out.println("main-->"+u.age);
		
	}
	public static void add(User u){
		u.age++;
		System.out.println("add--> "+u.age);
	}
}

class User{
	int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public User(int i){
		age = i;
	}
}
