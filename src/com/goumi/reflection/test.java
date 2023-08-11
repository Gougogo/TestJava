import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入key");
        String key = scanner.next();
        switch (key){
            case "1":
                //Dog dog = new Dog();
                //dog.cry();
                break;
            case "2":
                Class cls = Class.forName("Person");
                Object o = cls.newInstance();
                Method m = cls.getMethod("hi");
                m.invoke(o);
                System.out.println("ok");
                break;
            default:
                System.out.println("do nothing");
        }
    }
}

class Person{
	public void hi(){
		System.out.println("hihihi");
	}
}
