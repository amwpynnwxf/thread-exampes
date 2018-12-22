package com.samples.design.state;

public class FreeState implements RoomState {
	Room room;
	
	public FreeState(Room room) {
		this.room = room;
	}

	@Override
	public void booking() {
		System.out.println("Ԥ���ɹ�");
		room.setState(room.getBookedState());
	}

	@Override
	public void checkin() {
		System.out.println("��û��Ԥ��������Ԥ��");
		room.setState(room.getCheckinState());
	}

	@Override
	public void checkout() {
		//���账��
	}

}
