package cn.kpn.demospringdataes;

import cn.kpn.demospringdataes.orm.HotelPO;
import cn.kpn.demospringdataes.orm.repo.HotelRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoSpringDataEsApplicationTests {

	@Autowired
	HotelRepo hotelRepo;
	@Test
	void contextLoads() {

		System.out.println(Long.valueOf("01004"));

		hotelRepo.save(HotelPO.builder()
						.favourable_percent(80)
						.address("wer23r")
						.business_district("af2rwr")
						.city("杭州")
						.full_room(false)
						.impression("f23fewd")
						.pic("f2few.jpg")
						.price(288.59)
						.star("三星级")
						.title("好再来酒店")
				.build());
	}

}
