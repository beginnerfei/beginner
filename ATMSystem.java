package com.itheima.atm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class ATMSystem {
	public static void main(String[] args) {
		ArrayList<Account> accounts = new ArrayList();

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("========ATM系统===========");
			System.out.println("1.账户登陆");
			System.out.println("2.账户开户");
			System.out.println("请您选择操作：");
			int command = sc.nextInt();
			switch (command) {
			case 1:
				login(accounts, sc);
				break;
			case 2:// 开户
				register(accounts, sc);
				break;
			default:
				System.out.println("您的输入操作命令不存在，输入有误");
			}
		}

	}

	/**
	 * 登陆功能
	 * 
	 * @param accounts 全部账户对象的集合
	 * @param sc       扫描器
	 */
	private static void login(ArrayList<Account> accounts, Scanner sc) {
		System.out.println("========登陆功能=======");
		if (accounts.size() == 0) {
			System.out.println("对不起，无任何账户，请先开户");
			return;
		}
		while (true) {
			System.out.println("请您输入登陆卡号");
			String cardId = sc.next();
			Account acc = getAccountByCardId(cardId, accounts);
			if (acc != null) {
				while (true) {
					System.out.println("请您输入登陆秘密");
					String passWord = sc.next();
					if (acc.getPassWord().equals(passWord)) {
						System.out.println("恭喜，登陆成功" + acc.getUserName() + "先生/女生，您登陆的卡号是" + acc.getCardId());
						showUserCommand(sc, acc, accounts);
						return;

					} else {
						System.out.println("您输入密码有误");
					}
				}
			} else {
				System.out.println("对不起，账户不存在");
			}
		}

	}

	/**
	 * 展示登陆后的操作页
	 */
	private static void showUserCommand(Scanner sc, Account acc, ArrayList<Account> accounts) {
		while (true) {
			System.out.println("========系统开户操作========");
			System.out.println("1、查询账户");
			System.out.println("2、存款");
			System.out.println("3、取款");
			System.out.println("4、转账");
			System.out.println("5、修改密码");
			System.out.println("6/退出");
			System.out.println("7、注销账户");
			System.out.println("请选择");
			int command = sc.nextInt();
			switch (command) {
			case 1:
				showAccount(acc);
				break;
			case 2:
				depositMoney(acc, sc);
				break;
			case 3:
				dreamMoney(acc, sc);
				break;
			case 4:
				transforMoney(sc, acc, accounts);
				break;
			case 5:// 修改密码
				updatePassWord(acc, sc);
				return;
			case 6:
				System.out.println("退出成功，欢迎下次光临");
				return;
			case 7:// 销户

				if (deleteAccount(acc, sc, accounts)) {
					return;
				} else {
					break;
				}

			default:
				System.out.println("输入有误");

			}
		}
	}

	/**
	 * 销户功能
	 * 
	 * @param acc
	 * @param sc
	 * @param accounts
	 */
	private static boolean deleteAccount(Account acc, Scanner sc, ArrayList<Account> accounts) {
		System.out.println("您真的确定要消除账户？y/n");
		String rs = sc.next();
		switch (rs) {
		case "y":
			if (acc.getMoney() > 0) {
				System.out.println("您账户还有钱，不能销户");
			} else {
				accounts.remove(acc);
				System.out.println("您的账户销户完成");
				return true;
			}

			break;
		default:
			System.out.println("取消销户");
		}
		return false;
	}

	/**
	 * 修改密码
	 * 
	 * @param sc扫描器
	 * @param acc当前登陆成功的账户对象
	 */
	private static void updatePassWord(Account acc, Scanner sc) {
		System.out.println("==========用户密码修改=========");
		while (true) {
			System.out.println("请您输入当前秘密");
			String passWord = sc.next();
			if (acc.getPassWord().equals(passWord)) {
				while (true) {
					System.out.println("请输入新密码");
					String newPassWord = sc.next();
					System.out.println("请您再次输入密码");
					String okPassword = sc.next();
					if (newPassWord.equals(okPassword)) {
						acc.setPassWord(newPassWord);
						System.out.println("恭喜您 新密码设置成功");
					} else {
						System.out.println("您两次输入的密码不一致");
					}
				}
			} else {
				System.out.println("您输入的密码错误");
			}
		}
	}

	/**
	 * 转账功能
	 * 
	 * @param sc扫描器
	 * @param acc自己的账户对象
	 * @param accounts全部账户的集合
	 */

	private static void transforMoney(Scanner sc, Account acc, ArrayList<Account> accounts) {
		System.out.println("========用户转账操作=========");
		if (accounts.size() < 2) {
			System.out.println("当前系统中，不足2个账户，不能进行转账操作，请先去开户");
			return;
		}
		if (acc.getMoney() == 0) {
			System.out.println("对不起，您没有钱，不能转账");
			return;
		}
		while (true) {
			System.out.println("请输入转账卡号");
			String cardId = sc.next();
			if (cardId.equals(acc.getCardId())) {
				System.out.println("对不起，不能给自己转账");
				continue;
			}
			Account account = getAccountByCardId(cardId, accounts);
			if (account == null) {
				System.out.println("对不起，您输入的账号不存在");
			} else {
				String userName = account.getUserName();
				String tip = "*" + userName.substring(1);

				System.out.println("请您输入[" + tip + "]姓氏");
				String preName = sc.next();
				if (userName.startsWith(preName)) {
					System.out.println("请您输入转账金额");
					double money = sc.nextDouble();
					if (money > acc.getMoney()) {
						System.out.println("对不起，您余额不足，您最多可以转账" + acc.getMoney());
					} else {
						acc.setMoney(acc.getMoney() - money);
						account.setMoney(account.getMoney() + money);
						System.out.println("转账成功，您的账户余额" + acc.getMoney());
						return;
					}
				} else {
					System.out.println("对不起，您输入信息有误");
				}
			}
		}
	}

	/**
	 * 取钱
	 * 
	 * @param sc扫描器
	 * @param acc当前账户对象
	 */
	private static void dreamMoney(Account acc, Scanner sc) {
		System.out.println("========用户取钱操作=======");
		if (acc.getMoney() < 100) {
			System.out.println("不足100元，不能取钱");
			return;
		}
		while (true) {
			System.out.println("请您输入取款金额");
			double money = sc.nextDouble();
			if (money > acc.getQuotaMoney()) {
				System.out.println("对不起，您当前取款金额超过每次限额，每次最多可取" + acc.getQuotaMoney());
			} else {
				if (money > acc.getMoney()) {
					System.out.println("余额不足，您当前总余额是" + acc.getMoney());
				} else {
					System.out.println("恭喜取钱成功" + money + "元，成功");
					acc.setMoney(acc.getMoney() - money);
					showAccount(acc);
					return;
				}

			}
		}
	}

	/**
	 * 存钱
	 * 
	 * @param acc当前账户对象
	 * @param sc扫描器
	 */
	private static void depositMoney(Account acc, Scanner sc) {
		System.out.println("========用户存钱操作========");
		System.out.println("请您输入存款金额");
		double money = sc.nextDouble();

		acc.setMoney(acc.getMoney() + money);
		System.out.println("存钱成功，当前账户信息如下");
		showAccount(acc);
	}

	/**
	 * 展示账户信息
	 * 
	 * @param acc
	 */
	private static void showAccount(Account acc) {
		System.out.println("=======当前账户信息如下=======");
		System.out.println("卡号" + acc.getCardId());
		System.out.println("户主" + acc.getUserName());
		System.out.println("余额" + acc.getMoney());
		System.out.println("限额" + acc.getQuotaMoney());

	}

	/**
	 * 用户开户功能实现
	 * 
	 * @param accounts 接收的账户集合
	 */
	private static void register(ArrayList<Account> accounts, Scanner sc) {
		System.out.println("=========系统开户操作=========");

		Account account = new Account();
		System.out.println("请您输入账户用户名");
		String userName = sc.next();
		account.setUserName(userName);

		while (true) {
			System.out.println("请您输入账户密码");
			String passWord = sc.next();
			System.out.println("请您输入账户密码");
			String okPassWord = sc.next();
			if (okPassWord.equals(passWord)) {
				account.setPassWord(okPassWord);
				break;
			} else {
				System.out.println("您输入的2次秘密不一致，请重新确认");
			}
		}
		System.out.println("请您输入账户当次限额");
		double quotaMoney = sc.nextDouble();
		account.setQuotaMoney(quotaMoney);

		String cardId = getRandomCardId(accounts);
		account.setCardId(cardId);
		accounts.add(account);
		System.out.println("恭喜您" + userName + "先生/女士，您开户成功，您的卡号是" + cardId + "请您妥善保管卡号");

	}

	/**
	 * 为账户生产八位与其他账户不同的卡号
	 * 
	 * @return
	 */
	private static String getRandomCardId(ArrayList<Account> accounts) {
		// TODO Auto-generated method stub

		Random r = new Random();
		while (true) {
			String cardId = "";

			for (int i = 0; i < 8; i++) {
				cardId += r.nextInt(10);
			}
			Account acc = getAccountByCardId(cardId, accounts);
			if (acc == null) {
				return cardId;
			}
		}
	}

	/**
	 * 根据卡号查出一个账户对象出来
	 * 
	 * @param cardId卡号
	 * @param accounts 全部账户的集合
	 * @return 账户对象 null
	 */
	private static Account getAccountByCardId(String cardId, ArrayList<Account> accounts) {
		for (int i = 0; i < accounts.size(); i++) {
			Account acc = accounts.get(i);
			if (acc.getCardId().equals(cardId)) {
				return acc;
			}
		}
		return null;
	}
}
