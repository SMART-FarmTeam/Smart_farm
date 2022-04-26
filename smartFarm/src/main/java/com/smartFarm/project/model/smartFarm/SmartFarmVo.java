package com.smartFarm.project.model.smartFarm;


import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="smart_farm")
public class SmartFarmVo {
	
	@Id
	@NonNull
	private String user_id; //아이디
	@NonNull
	private String crop_species; //식물 종류
	@NonNull
	private int supply_water_timing; // 급수 간격
	@NonNull
	private int supply_medium_timing; // 배양액 급수 간격
	@NonNull
	private int supply_miticide_timing; // 살충제 급수 간격
	@NonNull
	private String light_up_timing; // 불켜는 시간
	@NonNull
	private String light_down_timing; // 불 끄는 시간
	
	private String plant_day; // 심은 날짜
	
	private boolean door_lock; // 문 잠김 여부
	
	private boolean plant_plate; // 모종판 유무
	
	
}
