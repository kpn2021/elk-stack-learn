package cn.kpn.demospringdataes.orm.repo;

import cn.kpn.demospringdataes.orm.HotelPO;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepo extends ElasticsearchRepository<HotelPO,Long> {


}
