package com.silk.entity;

import com.silk.utils.Entity;

public class Room extends Entity{


	private Integer id;

	private Integer brand;

	private Integer buildingId;

	private Integer floor;
	/**
	 * 房间容量：无人间=0；一人间=1；二人间=2；四人间=4；六人间=6
	 */
	private Integer roomCapacity;
	/**
	 * 房间状态：空房间=0；未满=1；已满=2
	 */
	private Integer roomStatus;
	/**
	 * 房间类型：学生寝室=0；宿管寝室=1；后勤办公室=2；
	 */
	private Integer roomType;



	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getBrand() {
		return brand;
	}
	public void setBrand(Integer brand) {
		this.brand = brand;
	}
	public Integer getBuildingId() {
		return buildingId;
	}
	public void setBuildingId(Integer buildingId) {
		this.buildingId = buildingId;
	}
	public Integer getFloor() {
		return floor;
	}
	public void setFloor(Integer floor) {
		this.floor = floor;
	}
	public Integer getRoomCapacity() {
		return roomCapacity;
	}
	public void setRoomCapacity(Integer roomCapacity) {
		this.roomCapacity = roomCapacity;
	}
	public Integer getRoomStatus() {
		return roomStatus;
	}
	public void setRoomStatus(Integer roomStatus) {
		this.roomStatus = roomStatus;
	}
	public Integer getRoomType() {
		return roomType;
	}
	public void setRoomType(Integer roomType) {
		this.roomType = roomType;
	}
}