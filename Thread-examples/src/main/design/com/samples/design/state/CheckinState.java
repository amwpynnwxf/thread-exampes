package com.samples.design.state;

public class CheckinState implements RoomState {
	Room room;
	
	public CheckinState(Room room) {
		this.room = room;
	}

	@Override
	public void booking() {
		System.out.println("����ס�Ŀͷ�������Ԥ��");
	}

	@Override
	public void checkin() {
		System.out.println("���Ѱ������ס");
	}

	@Override
	public void checkout() {
		room.setState(room.getFreeState());
		System.out.println("������ɹ���");
	}

}
