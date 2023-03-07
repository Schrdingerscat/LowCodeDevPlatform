package com.dna;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

/*
* JsonNode类表示 JSON 树模型中的 一个节点。
* 它可以用以下数据类型表示 JSON 数据：
*   Array、Binary、Boolean、Missing、Null、Number、Object、POJO、String。
* 这些数据类型在JsonNodeType 枚举中定义。
* */


/*
* JsonReader用于读取一个json文件，并且以合适的数据结构保存在内存当中
* 方便我们之后读入到Inst的构造函数
* */
public class JsonReader {
    public static void main(String[] args) throws IOException {
        // 创建ObjectMapper实例，用于解析JSON
        ObjectMapper mapper = new ObjectMapper();

        // 读取JSON文件，生成对应的JsonNode对象
        File file = new File("D:\\Code&Project\\LowCode\\src\\test\\resources\\test1.json");
        JsonNode jsonNode = mapper.readTree(file);

        // 输出读取到的数据
        System.out.println(jsonNode);
    }
}

