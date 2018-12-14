package com.samples.design.state;

public class CheckinState implements RoomState {
	Room room;
	
	public CheckinState(Room room) {
		this.room = room;
	}

	@Override
	public void booking() {
		System.out.println("已入住的客房，不能预订");
	}

	@Override
	public void checkin() {
		System.out.println("您已办理过入住");
	}

	@Override
	public void checkout() {
		room.setState(room.getFreeState());
		System.out.println("离店办理成功！");
	}

}
