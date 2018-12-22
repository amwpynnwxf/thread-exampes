package com.samples.design.state;

/**
 * ״̬ģ�͵���������(������)
 * @author wuyouwulv
 *
 */
public class Room {
	private RoomState state;// ��ǰ״̬ʵ��
	
	//һ������Щ״̬�����ھ���״̬��ʹ��
	private FreeState freeState;//����״̬
	private BookedState bookedState;//Ԥ���ɹ�
	private CheckinState checkinState;//����ס

	public Room() {
		freeState = new FreeState(this);
		bookedState = new BookedState(this);
		checkinState = new CheckinState(this);
		this.state = freeState;
	}
	
	public void booking(){
		state.booking();
	}
	
	public void checkin(){
		state.checkin();
	}
	
	public void checkout(){
		state.checkout();
	}

	public RoomState getState() {
		return state;
	}

	public void setState(RoomState state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "��ǰ״̬��" + state.getClass().getName();
	}

	public FreeState getFreeState() {
		return freeState;
	}

	public void setFreeState(FreeState freeState) {
		this.freeState = freeState;
	}

	public BookedState getBookedState() {
		return bookedState;
	}

	public void setBookedState(BookedState bookedState) {
		this.bookedState = bookedState;
	}

	public CheckinState getCheckinState() {
		return checkinState;
	}

	public void setCheckinState(CheckinState checkinState) {
		this.checkinState = checkinState;
	}

}
