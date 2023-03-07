import com.dna.*;

import java.util.Date;

/*
* 以学生管理系统为例，定义一个Dna数据模型
* */
public class testDna {
    public static void main(String[] args){
        Dna studentDna = new Dna(
                "SchoolManagement",
                "10001",
                "StudentDna",
                "Stu"
        )
        studentDna.setCategory("ComputerScience");
        studentDna.setDbMapCode("100001");
        studentDna.setCursive(false);
        studentDna.setLastTime(new Date() );
        studentDna.addVds(new Vd("Gender","性别","boolean"));
        studentDna.addVds(new Vd());
    }
}
