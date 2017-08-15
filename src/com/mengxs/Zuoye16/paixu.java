package com.mengxs.Zuoye16;

import java.util.Comparator;

public class paixu implements Comparator<Yuangong>{

	@Override
	public int compare(Yuangong o1, Yuangong o2) {
		if(o1.getAge()!=o2.getAge())
			if(o1.getAge()>o2.getAge())
				return 1;
			if(o1.getAge()<o2.getAge())
				return -1;
			else if(o1.getGongling()!=o2.getGongling())
				if(o1.getGongling()>o2.getGongling())
					return -1;
				if(o1.getGongling()<o2.getGongling())
					return 1;
			else if(o1.getXinshui()!=o2.getXinshui())
					if(o1.getXinshui()>o2.getXinshui())
						return -1;
					if(o1.getXinshui()<o2.getXinshui())
						return 1;
		return 0;
	}

}
