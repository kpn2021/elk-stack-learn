package cn.kpn.demospringdataes.orm;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * person索引库
 * 现在ES Doc @Document(index,type) @Id @Feild 建立的是对象与文档直接映射
 * 操作的时wwjEsTest索引库下的person文档
 * @author Lenovo
 */
@Document(indexName = "wwjestest")
@NoArgsConstructor
@Getter
@Setter
@ToString(exclude = {"all"})
public class PersonDoc {
    /**
     * 文档的id就是对象的id
     */
    @Id
    private Long id;

    /**
     * 没有特殊要求不用@Field
     */
    private Integer age;

    /**
     * keyword不分词
     */
    @Field(type = FieldType.Keyword)
    private String name;

    /**
     * 指定分词类型，分词器，搜索器
     */
    @Field(type = FieldType.Text,
            analyzer = "ik_max_word", searchAnalyzer = "ik_max_word")
    private String intro;

    /**
     * 关键字搜索，指定作用于intro 和 name字段
     * 虚拟字段all(所有需要做关键字搜索的值，中间通过空格分隔) zs +" "+ zs is .相当于一个字段代替了很多字段
     */
    @Field(type = FieldType.Text,
            analyzer = "ik_max_word", searchAnalyzer = "ik_max_word")
    private String all;

    /**
     * 进行拼接
     * @return 返回拼接后的结果
     */
    public String getAll() {
        return this.name + " " + this.intro;
    }

    public PersonDoc(Long id, Integer age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }
}
