package com.samples.design.command;

/**
 * ��������˻��ۼ�
 * @author wuyouwulv
 *
 */
public class AccountDeductCommand implements Command {
	private UserAccount userAccount;
	
	public AccountDeductCommand(UserAccount userAccount) {
		this.userAccount = userAccount;
	}

	@Override
	public void execute(int num) {
		userAccount.doDeduct(num);
	}

	@Override
	public void undo(int num) {
		userAccount.doRefund(num);
	}

}
