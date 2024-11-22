class StringBuff{
	public static void main(String[] args){



		// Method 1 of declaration (Using String)
		System.out.println();
		System.out.println("sb1");
		System.out.println();


		StringBuffer sb1 = new StringBuffer("Namaskaar duniya!");
		System.out.println(sb1);

		System.out.println(sb1.capacity()); // 16 + length



		// Method 2 of declaration (Empty)
		System.out.println();
		System.out.println("sb2");
		System.out.println();


		StringBuffer sb2 = new StringBuffer();
		System.out.println(sb2);

		System.out.println(sb2.capacity()); // 16 + 0



		// Method 3 of declaration (Int) -> remains Empty, Only defines capacity
		System.out.println();
		System.out.println("sb3");
		System.out.println();


		StringBuffer sb3 = new StringBuffer(10);
		System.out.println(sb3);
		System.out.println(sb3.capacity()); // 10




		// Capacity
		System.out.println();
		System.out.println("Capacity");
		System.out.println();


		sb3.append("Hello World");  // capacity = (capacity + 1)*2
		System.out.println(sb3);
		System.out.println(sb3.capacity());


		sb3.append("! namaskaar! aaaaaa");  // cap = (cap + 1)*2 if it exceeds its capacity.
		System.out.println(sb3);
		System.out.println(sb3.capacity());




		// Mutability -> Yes, It is mutable

		StringBuffer s1 = new StringBuffer("Hi");
		StringBuffer s2 = new StringBuffer("Hi");

		System.out.println();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2); // False (Both are stored at different locations)



		
		// Compare
		System.out.println(s1.compareTo(s2)); // If same 0 else other int



		// Insert
		System.out.println();
		System.out.println("Insert");
		System.out.println();


		sb3.insert(12, "!!!!!");
		System.out.println(sb3);




		// Delete
		System.out.println();
		System.out.println("Delete");
		System.out.println();


		sb3.delete(18, 34);
		System.out.println(sb3);


		sb3.deleteCharAt(18); // NIS
		System.out.println(sb3);




		// Reverse
		System.out.println();
		System.out.println("Reverse");
		System.out.println();


		sb3.reverse();
		System.out.println(sb3);


	}

}