import entity.Student;

import java.io.InputStream;
import java.util.Properties;

//IOC控制反转（容器生成对象）
public class TestIOC02 {
    public static void main(String[] args) throws Exception{
        Properties properties = new Properties();
        InputStream inputStream = TestIOC02.class.getResourceAsStream("/student.properties");
        properties.load(inputStream);
        Class cls = Class.forName(properties.getProperty("stu.classname"));
        Student student = (Student) cls.newInstance();
        student.setNo(properties.getProperty("stu.no"));
        student.setName(properties.getProperty("stu.name"));
        student.setScore(Integer.parseInt(properties.getProperty("stu.score")));
        System.out.println(student);
    }
}
