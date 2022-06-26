package cn.kpn.demospringdataes.orm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(indexName = "hotel")
public class HotelPO {


    @Id
    private Long id;

    @Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_max_word")
    private String title;
    @Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_max_word")
    private String business_district;

    @Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_max_word")
    private String address;
    /**
     * keyword不分词
     */
    @Field(type = FieldType.Keyword)
    private String city;

    @Field(type = FieldType.Double)
    private double price;

    @Field(type = FieldType.Keyword)
    private String star;

    @Field(type = FieldType.Boolean)
    private boolean full_room;

    @Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_max_word")
    private String impression;

    @Field(type = FieldType.Integer)
    private int favourable_percent;

    private String pic;

}
