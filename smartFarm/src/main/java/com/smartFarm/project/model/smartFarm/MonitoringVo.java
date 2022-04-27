package com.smartFarm.project.model.smartFarm;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Entity(name = "monitoring")
public class MonitoringVo {

	@Id
	@Column(nullable = false, length = 30) // column의 조건
	@NonNull
	private String user_id;

	@Column(nullable = false)
	private LocalDateTime monitoring_time=LocalDateTime.now(); // 모니터링 시간
	
	@NonNull
	@Column(nullable = false)
	private int monitoring_temperature; // 온도
	
	@NonNull
	@Column(nullable = false)
	private int monitoring_humidity; // 습도
	
	@NonNull
	@Column(nullable = false)
	private int monitoring_illuminance; // 조도

	@NonNull
	@Column(nullable = false)
	private int first_water_tank_level; //  1 물탱크 수위

	@NonNull
	@Column(nullable = false)
	private int second_water_tank_level; // 2 물탱크 수위

	@NonNull
	@Column(nullable = false)
	private int third_water_tank_level; // 3 물탱크 수위


}
