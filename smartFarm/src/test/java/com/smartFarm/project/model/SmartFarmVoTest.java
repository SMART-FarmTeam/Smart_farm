package com.smartFarm.project.model;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.smartFarm.project.model.smartFarm.SmartFarmRepository;
import com.smartFarm.project.model.smartFarm.SmartFarmVo;


@SpringBootTest
public class SmartFarmVoTest {

    @Autowired
    SmartFarmRepository smartFarmRepository;

    @Test
    void save() {

        // 1. 게시글 파라미터 생성
        SmartFarmVo params = new SmartFarmVo("lsm878","바질",50,50,50,"04:00:00","20:00:00","2022-04-26", true, false);
        

        // 2. 게시글 저장
        smartFarmRepository.save(params);

        // 3. 1번 게시글 정보 조회
        SmartFarmVo entity = smartFarmRepository.findById((String) "lsu878").get();
        assertThat(entity.getCrop_species()).isEqualTo("작물");
        assertThat(entity.getLight_down_timing()).isEqualTo("불끄는 시간");
        assertThat(entity.getUser_id()).isEqualTo("아이디");
    }

    @Test
    void findAll() {

        // 1. 전체 게시글 수 조회
        long smartFarmCount = smartFarmRepository.count();

        // 2. 전체 게시글 리스트 조회
        List<SmartFarmVo> smartFarms = smartFarmRepository.findAll();
    }

    @Test
    void delete() {

        // 1. 게시글 조회
        SmartFarmVo entity = smartFarmRepository.findById((String) "lsm878").get();

        // 2. 게시글 삭제
        smartFarmRepository.delete(entity);
    }

}