package com.sc;

import com.sa.Student;
import com.sa.Student2;
import com.sb.A;
import com.sb.B;

public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student("q");
		
		System.out.println(s.show());

		Student2[] s2=new Student2[3];

		A a=new A("aa",60);

		System.out.println(a.show());
		
		a.skill();
		
		B b=new B("bb",70);

		System.out.println(b.show());

		b.skill();
	}

}
