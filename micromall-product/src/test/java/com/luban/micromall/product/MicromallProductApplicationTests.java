package com.luban.micromall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.luban.micromall.product.entity.PmsBrand;
import com.luban.micromall.product.service.IPmsBrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MicromallProductApplicationTests {

    @Autowired
    IPmsBrandService brandService;

    @Test
    void contextLoads() {

        List<PmsBrand> list = brandService.list(new QueryWrapper<PmsBrand>().eq("brand_id", 1L));
        list.forEach(System.out::println);

//        PmsBrand brandEntity = new PmsBrand();
//        brandEntity.setBrandId(1L);
//        brandEntity.setDescription("consumer electronics");
//        brandService.updateById(brandEntity);

//        brandEntity.setName("apple");
//        brandService.save(brandEntity);
//        System.out.println("save brandEntity success!");

    }

}
