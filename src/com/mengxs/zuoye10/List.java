package com.mengxs.zuoye10;

public class List {
	static int sum = 0;
	private Person list[] = new Person[10];

	public boolean add(Person man) {
		list[sum] = new Person();
		list[sum] = man;
		sum++;

		return true;

	}

	public void findByName(String na) {
		for (int i = 0; i < sum; i++) {
			if (list[i].getName().contains(na)) {
				System.out.println(list[i].toString());
			}

		}
	}

	public void findAll(String na) {
			for(int i=0;i<sum;i++){
					System.out.println(list[i].toString());
						}
			}
	}
