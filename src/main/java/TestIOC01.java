import entity.Student;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//IOC控制反转
public class TestIOC01 {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("stu.xml");
        Student stu = (Student) ac.getBean("stu");
        System.out.println(stu);
    }
}
