package com.map;

import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

public class WeakHashMapPrac {
	public static void main(String[] args) throws InterruptedException {
		
		WeakHashMap<Object, String> weak = new WeakHashMap<>();
		weak.put("String1", "String1");
		weak.put(null, "String2");
		Demo d = new Demo();
		weak.put(d, "String3");
		System.out.println(weak);
		d = null;
		System.gc();
		Thread.sleep(4000);
		System.out.println(weak);
		
	}
}

class Demo {
	Demo() {
		
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called");
		super.finalize();
	}
}
